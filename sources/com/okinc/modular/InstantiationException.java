package com.okinc.modular;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class InstantiationException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantiationException(@NotNull String str, Exception exc) {
        super(str, exc);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
