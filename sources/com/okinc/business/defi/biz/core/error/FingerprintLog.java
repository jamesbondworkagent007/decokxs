package com.okinc.business.defi.biz.core.error;

import kotlin.jvm.internal.Intrinsics;
import o.xVW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FingerprintLog extends OKWException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FingerprintLog(@NotNull String str) {
        super(str + " " + xVW.copydefault(), null);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
