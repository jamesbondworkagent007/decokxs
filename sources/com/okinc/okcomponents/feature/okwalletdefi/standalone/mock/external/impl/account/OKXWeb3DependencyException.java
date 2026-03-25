package com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class OKXWeb3DependencyException extends Exception {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public OKXWeb3DependencyException(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }
}
