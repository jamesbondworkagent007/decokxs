package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.cognito.exceptions.service.GlobalSignOutException;
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GlobalSignOutError {
    private final String accessToken;
    private final GlobalSignOutException exception;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GlobalSignOutException getException() {
        return this.exception;
    }

    public GlobalSignOutError(@NotNull GlobalSignOutErrorData globalSignOutErrorData) {
        Intrinsics.checkNotNullParameter(globalSignOutErrorData, "");
        this.accessToken = globalSignOutErrorData.getAccessToken();
        this.exception = new GlobalSignOutException(globalSignOutErrorData.getError());
    }
}
