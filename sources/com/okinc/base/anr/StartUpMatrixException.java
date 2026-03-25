package com.okinc.base.anr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class StartUpMatrixException extends Exception {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartUpMatrixException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
