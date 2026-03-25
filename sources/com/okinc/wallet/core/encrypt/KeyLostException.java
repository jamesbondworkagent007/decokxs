package com.okinc.wallet.core.encrypt;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class KeyLostException extends IllegalStateException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyLostException(@NotNull String str) {
        super("Key '" + str + "' was created but cannot be retrieved from KeyStore");
        Intrinsics.checkNotNullParameter(str, "");
    }
}
