package com.okinc.base.bugreport;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GuardDetectionException extends RuntimeException {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public GuardDetectionException(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }
}
