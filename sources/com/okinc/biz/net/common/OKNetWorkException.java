package com.okinc.biz.net.common;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OKNetWorkException extends IOException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKNetWorkException(@NotNull String str, @NotNull Exception exc) {
        super(str, exc);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(exc, "");
    }
}
