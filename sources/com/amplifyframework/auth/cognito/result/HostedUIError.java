package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class HostedUIError {
    private final Exception exception;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception getException() {
        return this.exception;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    public HostedUIError(@NotNull HostedUIErrorData hostedUIErrorData) {
        Intrinsics.checkNotNullParameter(hostedUIErrorData, "");
        this.url = hostedUIErrorData.getUrl();
        this.exception = hostedUIErrorData.getError();
    }
}
