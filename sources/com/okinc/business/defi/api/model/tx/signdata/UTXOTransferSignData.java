package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class UTXOTransferSignData extends UTXOTransferBaseSignData {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTXOTransferSignData(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, String str4) {
        super(j, str, str2, str3, z, z2, str4);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }
}
