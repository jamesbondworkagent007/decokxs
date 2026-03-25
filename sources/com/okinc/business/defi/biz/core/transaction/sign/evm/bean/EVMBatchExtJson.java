package com.okinc.business.defi.biz.core.transaction.sign.evm.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class EVMBatchExtJson extends EVMExtJson {
    public static final int $stable = 0;
    private final Integer inscriptionType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInscriptionType() {
        return this.inscriptionType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVMBatchExtJson(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, int i, int i2, String str5, String str6, int i3, Integer num) {
        super(str, str2, str3, str4, i, i2, str5, str6, Integer.valueOf(i3), null, 512, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.inscriptionType = num;
    }
}
