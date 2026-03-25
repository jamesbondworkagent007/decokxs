package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TxLogEntity {
    public static final int $stable = 8;
    private String txId;
    private String txInfo;
    private long txTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TxLogEntity copy$default(TxLogEntity txLogEntity, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = txLogEntity.txId;
        }
        if ((i & 2) != 0) {
            str2 = txLogEntity.txInfo;
        }
        if ((i & 4) != 0) {
            j = txLogEntity.txTime;
        }
        return txLogEntity.copy(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxLogEntity copy(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TxLogEntity(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxLogEntity)) {
            return false;
        }
        TxLogEntity txLogEntity = (TxLogEntity) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) txLogEntity.txId) && Intrinsics.EZpvd((Object) this.txInfo, (Object) txLogEntity.txInfo) && this.txTime == txLogEntity.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxInfo() {
        return this.txInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTxTime() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.txId.hashCode() * 31) + this.txInfo.hashCode()) * 31) + Long.hashCode(this.txTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxTime(long j) {
        this.txTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxLogEntity(txId=" + this.txId + ", txInfo=" + this.txInfo + ", txTime=" + this.txTime + ")";
    }

    public TxLogEntity(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.txId = str;
        this.txInfo = str2;
        this.txTime = j;
    }
}
