package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SimpleModeParam {
    public static final int $stable = 8;
    private DexMultiTokenInfoBean fromToken;
    private DexMultiTokenInfoBean toToken;
    private int transactionType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleModeParam copy$default(SimpleModeParam simpleModeParam, int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simpleModeParam.transactionType;
        }
        if ((i2 & 2) != 0) {
            dexMultiTokenInfoBean = simpleModeParam.fromToken;
        }
        if ((i2 & 4) != 0) {
            dexMultiTokenInfoBean2 = simpleModeParam.toToken;
        }
        return simpleModeParam.copy(i, dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component3() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleModeParam copy(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        return new SimpleModeParam(i, dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleModeParam)) {
            return false;
        }
        SimpleModeParam simpleModeParam = (SimpleModeParam) obj;
        return this.transactionType == simpleModeParam.transactionType && Intrinsics.EZpvd(this.fromToken, simpleModeParam.fromToken) && Intrinsics.EZpvd(this.toToken, simpleModeParam.toToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.transactionType);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode2 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        return (((iHashCode * 31) + iHashCode2) * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromToken(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        this.fromToken = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToToken(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        this.toToken = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransactionType(int i) {
        this.transactionType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleModeParam(transactionType=" + this.transactionType + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ")";
    }

    public SimpleModeParam(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        this.transactionType = i;
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
    }
}
