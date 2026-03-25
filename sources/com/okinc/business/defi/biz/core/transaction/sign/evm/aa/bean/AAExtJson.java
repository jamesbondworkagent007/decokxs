package com.okinc.business.defi.biz.core.transaction.sign.evm.aa.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class AAExtJson {
    public static final int $stable = 0;
    private final int decimal;
    private final int feeType;
    private final String gasPrice;
    private final String nonce;
    private final String priorityFee;
    private final int repeatTxType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeType() {
        return this.feeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatTxType() {
        return this.repeatTxType;
    }

    public AAExtJson(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.nonce = str;
        this.gasPrice = str2;
        this.priorityFee = str3;
        this.decimal = i;
        this.repeatTxType = i2;
        this.feeType = i3;
    }
}
