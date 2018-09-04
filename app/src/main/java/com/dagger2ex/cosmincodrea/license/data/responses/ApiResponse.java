package com.dagger2ex.cosmincodrea.license.data.responses;

/**
 * Created by cosmincodrea on 29/08/2018.
 */

import android.support.annotation.Nullable;

import com.dagger2ex.cosmincodrea.license.utils.AppConstants;

import java.io.IOException;

import retrofit2.Response;

/**
 * Common class used by API responses.
 *
 * @param <T> The type of the response.
 */
public class ApiResponse<T> {
    public final int code;
    @Nullable
    public final T body;
    @Nullable
    public final String errorMessage;

    public ApiResponse(Throwable error) {
        code = AppConstants.RESPONSE_CODE_INTERNAL_SERVER_ERROR;
        body = null;
        errorMessage = error.getMessage();
    }

    public ApiResponse(Response<T> response) {
        code = response.code();
        if (response.isSuccessful()) {
            body = response.body();
            errorMessage = null;
        } else {
            String message = null;
            if (response.errorBody() != null) {
                try {
                    message = response.errorBody().string();
                } catch (IOException ignored) {
//                    Timber.e(ignored, "error while parsing response");
                }
            }
            if (message == null || message.trim().length() == 0) {
                message = response.message();
            }
            errorMessage = message;
            body = null;
        }
    }

    public boolean isSuccessful() {
        return code >= AppConstants.RESPONSE_CODE_SUCCESS && code < AppConstants.RESPONSE_CODE_REDIRECTION;
    }
}
