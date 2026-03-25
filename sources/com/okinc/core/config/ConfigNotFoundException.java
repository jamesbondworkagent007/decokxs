package com.okinc.core.config;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ConfigNotFoundException extends RuntimeException {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public ConfigNotFoundException(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }
}
