package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import com.google.gson.JsonElement;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TxInfoItem {
    public static final int $stable = 8;
    private final Boolean canConfirm;
    private final WalletGasLimitRes gasFee;
    private transient boolean moduleHandled;
    private List<? extends BaseModel<?>> moduleList;
    private final Boolean needFillUp;
    private final Boolean preExeStatus;
    private final TipMessageInfo tipMessageInfo;
    private final TxTypeInfo txTypeInfo;
    private final List<String> unitGasLimitList;
    private final JsonElement x402Message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxTypeInfo component1() {
        return this.txTypeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.moduleHandled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>>, java.util.List<com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>> */
    public final List<BaseModel<?>> component2() {
        return this.moduleList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TipMessageInfo component3() {
        return this.tipMessageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.canConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.needFillUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.preExeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.unitGasLimitList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletGasLimitRes component8() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component9() {
        return this.x402Message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxInfoItem copy(TxTypeInfo txTypeInfo, List<? extends BaseModel<?>> list, TipMessageInfo tipMessageInfo, Boolean bool, Boolean bool2, Boolean bool3, List<String> list2, WalletGasLimitRes walletGasLimitRes, JsonElement jsonElement, boolean z) {
        return new TxInfoItem(txTypeInfo, list, tipMessageInfo, bool, bool2, bool3, list2, walletGasLimitRes, jsonElement, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxInfoItem)) {
            return false;
        }
        TxInfoItem txInfoItem = (TxInfoItem) obj;
        return Intrinsics.EZpvd(this.txTypeInfo, txInfoItem.txTypeInfo) && Intrinsics.EZpvd(this.moduleList, txInfoItem.moduleList) && Intrinsics.EZpvd(this.tipMessageInfo, txInfoItem.tipMessageInfo) && Intrinsics.EZpvd(this.canConfirm, txInfoItem.canConfirm) && Intrinsics.EZpvd(this.needFillUp, txInfoItem.needFillUp) && Intrinsics.EZpvd(this.preExeStatus, txInfoItem.preExeStatus) && Intrinsics.EZpvd(this.unitGasLimitList, txInfoItem.unitGasLimitList) && Intrinsics.EZpvd(this.gasFee, txInfoItem.gasFee) && Intrinsics.EZpvd(this.x402Message, txInfoItem.x402Message) && this.moduleHandled == txInfoItem.moduleHandled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanConfirm() {
        return this.canConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletGasLimitRes getGasFee() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getModuleHandled() {
        return this.moduleHandled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>>, java.util.List<com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>> */
    public final List<BaseModel<?>> getModuleList() {
        return this.moduleList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedFillUp() {
        return this.needFillUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPreExeStatus() {
        return this.preExeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TipMessageInfo getTipMessageInfo() {
        return this.tipMessageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxTypeInfo getTxTypeInfo() {
        return this.txTypeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUnitGasLimitList() {
        return this.unitGasLimitList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getX402Message() {
        return this.x402Message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TxTypeInfo txTypeInfo = this.txTypeInfo;
        int iHashCode = txTypeInfo == null ? 0 : txTypeInfo.hashCode();
        List<? extends BaseModel<?>> list = this.moduleList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        TipMessageInfo tipMessageInfo = this.tipMessageInfo;
        int iHashCode3 = tipMessageInfo == null ? 0 : tipMessageInfo.hashCode();
        Boolean bool = this.canConfirm;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.needFillUp;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.preExeStatus;
        int iHashCode6 = bool3 == null ? 0 : bool3.hashCode();
        List<String> list2 = this.unitGasLimitList;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        WalletGasLimitRes walletGasLimitRes = this.gasFee;
        int iHashCode8 = walletGasLimitRes == null ? 0 : walletGasLimitRes.hashCode();
        JsonElement jsonElement = this.x402Message;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (jsonElement != null ? jsonElement.hashCode() : 0)) * 31) + Boolean.hashCode(this.moduleHandled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModuleHandled(boolean z) {
        this.moduleHandled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModuleList(List<? extends BaseModel<?>> list) {
        this.moduleList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxInfoItem(txTypeInfo=" + this.txTypeInfo + ", moduleList=" + this.moduleList + ", tipMessageInfo=" + this.tipMessageInfo + ", canConfirm=" + this.canConfirm + ", needFillUp=" + this.needFillUp + ", preExeStatus=" + this.preExeStatus + ", unitGasLimitList=" + this.unitGasLimitList + ", gasFee=" + this.gasFee + ", x402Message=" + this.x402Message + ", moduleHandled=" + this.moduleHandled + ")";
    }

    public TxInfoItem(TxTypeInfo txTypeInfo, List<? extends BaseModel<?>> list, TipMessageInfo tipMessageInfo, Boolean bool, Boolean bool2, Boolean bool3, List<String> list2, WalletGasLimitRes walletGasLimitRes, JsonElement jsonElement, boolean z) {
        this.txTypeInfo = txTypeInfo;
        this.moduleList = list;
        this.tipMessageInfo = tipMessageInfo;
        this.canConfirm = bool;
        this.needFillUp = bool2;
        this.preExeStatus = bool3;
        this.unitGasLimitList = list2;
        this.gasFee = walletGasLimitRes;
        this.x402Message = jsonElement;
        this.moduleHandled = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r14v0 com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxTypeInfo)
  (r15v0 java.util.List)
  (r16v0 com.okinc.business.defi.wallet.transaction.moduleModel.bean.TipMessageInfo)
  (r17v0 java.lang.Boolean)
  (r18v0 java.lang.Boolean)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (r20v0 java.util.List)
  (wrap:com.okinc.business.defi.biz.net.bean.WalletGasLimitRes:?: TERNARY null = ((wrap:int:0x000c: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.WalletGasLimitRes) : (r21v0 com.okinc.business.defi.biz.net.bean.WalletGasLimitRes))
  (r22v0 com.google.gson.JsonElement)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
 A[MD:(com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxTypeInfo, java.util.List<? extends com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>>, com.okinc.business.defi.wallet.transaction.moduleModel.bean.TipMessageInfo, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List<java.lang.String>, com.okinc.business.defi.biz.net.bean.WalletGasLimitRes, com.google.gson.JsonElement, boolean):void (m)] (LINE:85) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem.<init>(com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxTypeInfo, java.util.List, com.okinc.business.defi.wallet.transaction.moduleModel.bean.TipMessageInfo, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, com.okinc.business.defi.biz.net.bean.WalletGasLimitRes, com.google.gson.JsonElement, boolean):void type: THIS */
    public /* synthetic */ TxInfoItem(TxTypeInfo txTypeInfo, List list, TipMessageInfo tipMessageInfo, Boolean bool, Boolean bool2, Boolean bool3, List list2, WalletGasLimitRes walletGasLimitRes, JsonElement jsonElement, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(txTypeInfo, list, tipMessageInfo, bool, bool2, (i & 32) != 0 ? Boolean.TRUE : bool3, list2, (i & 128) != 0 ? null : walletGasLimitRes, jsonElement, (i & 512) != 0 ? false : z);
    }
}
