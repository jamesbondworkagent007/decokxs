package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PreExecTransactionRes {
    public static final int $stable = 8;
    private final List<PopupInfoItem> popupInfoList;
    private TxInfoItem txInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreExecTransactionRes copy$default(PreExecTransactionRes preExecTransactionRes, List list, TxInfoItem txInfoItem, int i, Object obj) {
        if ((i & 1) != 0) {
            list = preExecTransactionRes.popupInfoList;
        }
        if ((i & 2) != 0) {
            txInfoItem = preExecTransactionRes.txInfo;
        }
        return preExecTransactionRes.copy(list, txInfoItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PopupInfoItem> component1() {
        return this.popupInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxInfoItem component2() {
        return this.txInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreExecTransactionRes copy(List<PopupInfoItem> list, TxInfoItem txInfoItem) {
        return new PreExecTransactionRes(list, txInfoItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreExecTransactionRes)) {
            return false;
        }
        PreExecTransactionRes preExecTransactionRes = (PreExecTransactionRes) obj;
        return Intrinsics.EZpvd(this.popupInfoList, preExecTransactionRes.popupInfoList) && Intrinsics.EZpvd(this.txInfo, preExecTransactionRes.txInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PopupInfoItem> getPopupInfoList() {
        return this.popupInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxInfoItem getTxInfo() {
        return this.txInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<PopupInfoItem> list = this.popupInfoList;
        int iHashCode = list == null ? 0 : list.hashCode();
        TxInfoItem txInfoItem = this.txInfo;
        return (iHashCode * 31) + (txInfoItem != null ? txInfoItem.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxInfo(TxInfoItem txInfoItem) {
        this.txInfo = txInfoItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreExecTransactionRes(popupInfoList=" + this.popupInfoList + ", txInfo=" + this.txInfo + ")";
    }

    public PreExecTransactionRes(List<PopupInfoItem> list, TxInfoItem txInfoItem) {
        this.popupInfoList = list;
        this.txInfo = txInfoItem;
    }
}
