package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.cognito.exceptions.service.RevokeTokenException;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RevokeTokenError {
    private final RevokeTokenException exception;
    private final String refreshToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RevokeTokenException getException() {
        return this.exception;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public RevokeTokenError(@NotNull RevokeTokenErrorData revokeTokenErrorData) {
        Intrinsics.checkNotNullParameter(revokeTokenErrorData, "");
        this.refreshToken = revokeTokenErrorData.getRefreshToken();
        this.exception = new RevokeTokenException(revokeTokenErrorData.getError());
    }
}
