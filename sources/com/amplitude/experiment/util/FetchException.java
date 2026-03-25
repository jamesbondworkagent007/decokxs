package com.amplitude.experiment.util;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchException extends IOException {
    private final int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchException(int i, @NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = i;
    }
}
