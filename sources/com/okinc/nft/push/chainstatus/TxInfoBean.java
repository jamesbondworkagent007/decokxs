package com.okinc.nft.push.chainstatus;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TxInfoBean {
    public static final int $stable = 0;
    private final long coinId;
    private final String txId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TxInfoBean copy$default(TxInfoBean txInfoBean, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = txInfoBean.txId;
        }
        if ((i & 2) != 0) {
            j = txInfoBean.coinId;
        }
        return txInfoBean.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxInfoBean copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TxInfoBean(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxInfoBean)) {
            return false;
        }
        TxInfoBean txInfoBean = (TxInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) txInfoBean.txId) && this.coinId == txInfoBean.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.txId.hashCode() * 31) + Long.hashCode(this.coinId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxInfoBean(txId=" + this.txId + ", coinId=" + this.coinId + ")";
    }

    public TxInfoBean(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
        this.coinId = j;
    }
}
