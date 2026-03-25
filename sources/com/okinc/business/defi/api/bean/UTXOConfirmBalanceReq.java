package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UTXOConfirmBalanceReq {
    public static final int $stable = 8;
    private String address;
    private long coinId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UTXOConfirmBalanceReq copy$default(UTXOConfirmBalanceReq uTXOConfirmBalanceReq, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = uTXOConfirmBalanceReq.coinId;
        }
        if ((i & 2) != 0) {
            str = uTXOConfirmBalanceReq.address;
        }
        return uTXOConfirmBalanceReq.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOConfirmBalanceReq copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UTXOConfirmBalanceReq(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UTXOConfirmBalanceReq)) {
            return false;
        }
        UTXOConfirmBalanceReq uTXOConfirmBalanceReq = (UTXOConfirmBalanceReq) obj;
        return this.coinId == uTXOConfirmBalanceReq.coinId && Intrinsics.EZpvd((Object) this.address, (Object) uTXOConfirmBalanceReq.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.coinId) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOConfirmBalanceReq(coinId=" + this.coinId + ", address=" + this.address + ")";
    }

    public UTXOConfirmBalanceReq(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinId = j;
        this.address = str;
    }
}
