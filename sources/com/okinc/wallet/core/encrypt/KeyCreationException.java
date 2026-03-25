package com.okinc.wallet.core.encrypt;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class KeyCreationException extends IllegalStateException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyCreationException(@NotNull String str, @NotNull Throwable th) {
        super("Failed to create key '" + str + "' in KeyStore", th);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }
}
