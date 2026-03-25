package com.okinc.biz.statistics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class StatisticsUploadException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatisticsUploadException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatisticsUploadException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
