package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC26764jiV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iXC {
    public final int AEQbTJ;
    public final InterfaceC24178iXu AYXKKw;
    public final InvestGasPriceConfig AhwBna;
    public final boolean AkhnZx;
    public final java.lang.String AuCTel;
    public final int DbNXlk;
    public final long EZpvd;
    public final iXA KWHzl;
    public final C24177iXt OLrzqt;
    public final InvestTxModel copydefault;
    public final int djBIcL;
    public final InvestValidatorListItems ejfBZ;
    public final TransactionStage fARcdN;
    public final InterfaceC26764jiV fIwbmz;
    public final java.lang.String fJNWhG;
    public final boolean fetchVPNInfo;
    public final C25481ixY gEmmrt;
    public final java.util.List<InvestValidatorListItems> getFieldNames;
    public final java.lang.String getNewProxyInstance;
    public final boolean isConnected;
    public final java.util.List<InterfaceC24178iXu> iwGUEr;
    public final java.util.List<TransactionStep> uzCIH;
    public final java.lang.Throwable valueOf;
    public final long values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25481ixY AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestGasPriceConfig AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC24178iXu> AuCTel() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStage DbNXlk() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iXA EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iXC KWHzl(boolean z, boolean z2, java.lang.Throwable th, long j, int i, long j2, int i2, @NotNull TransactionStage transactionStage, @NotNull InterfaceC26764jiV interfaceC26764jiV, @NotNull iXA ixa, @NotNull C25481ixY c25481ixY, InterfaceC24178iXu interfaceC24178iXu, @NotNull java.util.List<? extends InterfaceC24178iXu> list, @NotNull C24177iXt c24177iXt, @NotNull java.lang.String str, java.util.List<InvestValidatorListItems> list2, InvestValidatorListItems investValidatorListItems, boolean z3, @NotNull java.util.List<TransactionStep> list3, InvestGasPriceConfig investGasPriceConfig, InvestTxModel investTxModel, java.lang.String str2, java.lang.String str3, int i3) {
        Intrinsics.checkNotNullParameter(transactionStage, "");
        Intrinsics.checkNotNullParameter(interfaceC26764jiV, "");
        Intrinsics.checkNotNullParameter(ixa, "");
        Intrinsics.checkNotNullParameter(c25481ixY, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c24177iXt, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new iXC(z, z2, th, j, i, j2, i2, transactionStage, interfaceC26764jiV, ixa, c25481ixY, interfaceC24178iXu, list, c24177iXt, str, list2, investValidatorListItems, z3, list3, investGasPriceConfig, investTxModel, str2, str3, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24177iXt KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxModel OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iXC)) {
            return false;
        }
        iXC ixc = (iXC) obj;
        return this.AkhnZx == ixc.AkhnZx && this.fetchVPNInfo == ixc.fetchVPNInfo && Intrinsics.EZpvd(this.valueOf, ixc.valueOf) && this.values == ixc.values && this.djBIcL == ixc.djBIcL && this.EZpvd == ixc.EZpvd && this.DbNXlk == ixc.DbNXlk && this.fARcdN == ixc.fARcdN && Intrinsics.EZpvd(this.fIwbmz, ixc.fIwbmz) && Intrinsics.EZpvd(this.KWHzl, ixc.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, ixc.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, ixc.AYXKKw) && Intrinsics.EZpvd(this.iwGUEr, ixc.iwGUEr) && Intrinsics.EZpvd(this.OLrzqt, ixc.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) ixc.getNewProxyInstance) && Intrinsics.EZpvd(this.getFieldNames, ixc.getFieldNames) && Intrinsics.EZpvd(this.ejfBZ, ixc.ejfBZ) && this.isConnected == ixc.isConnected && Intrinsics.EZpvd(this.uzCIH, ixc.uzCIH) && Intrinsics.EZpvd(this.AhwBna, ixc.AhwBna) && Intrinsics.EZpvd(this.copydefault, ixc.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) ixc.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) ixc.fJNWhG) && this.AEQbTJ == ixc.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestValidatorListItems> fARcdN() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TransactionStep> fetchVPNInfo() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC24178iXu gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AkhnZx);
        int iHashCode2 = java.lang.Boolean.hashCode(this.fetchVPNInfo);
        java.lang.Throwable th = this.valueOf;
        int iHashCode3 = th == null ? 0 : th.hashCode();
        int iHashCode4 = java.lang.Long.hashCode(this.values);
        int iHashCode5 = java.lang.Integer.hashCode(this.djBIcL);
        int iHashCode6 = java.lang.Long.hashCode(this.EZpvd);
        int iHashCode7 = java.lang.Integer.hashCode(this.DbNXlk);
        int iHashCode8 = this.fARcdN.hashCode();
        int iHashCode9 = this.fIwbmz.hashCode();
        int iHashCode10 = this.KWHzl.hashCode();
        int iHashCode11 = this.gEmmrt.hashCode();
        InterfaceC24178iXu interfaceC24178iXu = this.AYXKKw;
        int iHashCode12 = interfaceC24178iXu == null ? 0 : interfaceC24178iXu.hashCode();
        int iHashCode13 = this.iwGUEr.hashCode();
        int iHashCode14 = this.OLrzqt.hashCode();
        int iHashCode15 = this.getNewProxyInstance.hashCode();
        java.util.List<InvestValidatorListItems> list = this.getFieldNames;
        int iHashCode16 = list == null ? 0 : list.hashCode();
        InvestValidatorListItems investValidatorListItems = this.ejfBZ;
        int iHashCode17 = investValidatorListItems == null ? 0 : investValidatorListItems.hashCode();
        int iHashCode18 = java.lang.Boolean.hashCode(this.isConnected);
        int iHashCode19 = this.uzCIH.hashCode();
        InvestGasPriceConfig investGasPriceConfig = this.AhwBna;
        int iHashCode20 = investGasPriceConfig == null ? 0 : investGasPriceConfig.hashCode();
        InvestTxModel investTxModel = this.copydefault;
        int iHashCode21 = investTxModel == null ? 0 : investTxModel.hashCode();
        java.lang.String str = this.AuCTel;
        int iHashCode22 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.fJNWhG;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiTransactionContent(isLoading=" + this.AkhnZx + ", isError=" + this.fetchVPNInfo + ", error=" + this.valueOf + ", investmentId=" + this.values + ", investType=" + this.djBIcL + ", analysisPlatformId=" + this.EZpvd + ", investmentCategory=" + this.DbNXlk + ", stage=" + this.fARcdN + ", rightAction=" + this.fIwbmz + ", amountInput=" + this.KWHzl + ", inputBalance=" + this.gEmmrt + ", inputInfo=" + this.AYXKKw + ", transactionDetails=" + this.iwGUEr + ", buttonConfig=" + this.OLrzqt + ", validatorName=" + this.getNewProxyInstance + ", validatorList=" + this.getFieldNames + ", selectedValidator=" + this.ejfBZ + ", isSingleValidator=" + this.isConnected + ", transactionDataList=" + this.uzCIH + ", gasPriceConfig=" + this.AhwBna + ", currentStepInfo=" + this.copydefault + ", safeMin=" + this.AuCTel + ", safeMax=" + this.fJNWhG + ", confirmMaxCountDownTime=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestValidatorListItems values() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r26v0, resolved type: java.util.List<? extends o.iXu> */
    /* JADX WARN: Multi-variable type inference failed */
    public iXC(boolean z, boolean z2, java.lang.Throwable th, long j, int i, long j2, int i2, @NotNull TransactionStage transactionStage, @NotNull InterfaceC26764jiV interfaceC26764jiV, @NotNull iXA ixa, @NotNull C25481ixY c25481ixY, InterfaceC24178iXu interfaceC24178iXu, @NotNull java.util.List<? extends InterfaceC24178iXu> list, @NotNull C24177iXt c24177iXt, @NotNull java.lang.String str, java.util.List<InvestValidatorListItems> list2, InvestValidatorListItems investValidatorListItems, boolean z3, @NotNull java.util.List<TransactionStep> list3, InvestGasPriceConfig investGasPriceConfig, InvestTxModel investTxModel, java.lang.String str2, java.lang.String str3, int i3) {
        Intrinsics.checkNotNullParameter(transactionStage, "");
        Intrinsics.checkNotNullParameter(interfaceC26764jiV, "");
        Intrinsics.checkNotNullParameter(ixa, "");
        Intrinsics.checkNotNullParameter(c25481ixY, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c24177iXt, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.AkhnZx = z;
        this.fetchVPNInfo = z2;
        this.valueOf = th;
        this.values = j;
        this.djBIcL = i;
        this.EZpvd = j2;
        this.DbNXlk = i2;
        this.fARcdN = transactionStage;
        this.fIwbmz = interfaceC26764jiV;
        this.KWHzl = ixa;
        this.gEmmrt = c25481ixY;
        this.AYXKKw = interfaceC24178iXu;
        this.iwGUEr = list;
        this.OLrzqt = c24177iXt;
        this.getNewProxyInstance = str;
        this.getFieldNames = list2;
        this.ejfBZ = investValidatorListItems;
        this.isConnected = z3;
        this.uzCIH = list3;
        this.AhwBna = investGasPriceConfig;
        this.copydefault = investTxModel;
        this.AuCTel = str2;
        this.fJNWhG = str3;
        this.AEQbTJ = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e2: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r57v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r57v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0013: ARITH (r57v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r33v0 java.lang.Throwable))
  (r34v0 long)
  (r36v0 int)
  (r37v0 long)
  (r39v0 int)
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage:?: TERNARY null = ((wrap:int:0x001c: ARITH (r57v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: SGET  A[WRAPPED] (LINE:46) com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage.INPUT com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage) : (r40v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage))
  (wrap:o.jiV:?: TERNARY null = ((wrap:int:0x0026: ARITH (r57v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: SGET  A[WRAPPED] (LINE:48) o.jiV.Application.OLrzqt o.jiV$Application) : (r41v0 o.jiV))
  (r42v0 o.iXA)
  (wrap:o.ixY:?: TERNARY null = ((wrap:int:0x0030: ARITH (r57v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: CONSTRUCTOR 
  ("--")
  ("")
  false
  false
  false
  false
  false
  false
  (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo)
  (0 int)
  (null kotlin.Pair)
  (1532 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.Pair, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:50) call: o.ixY.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.Pair, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r43v0 o.ixY))
  (r44v0 o.iXu)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0059: ARITH (r57v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0061: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:56)) : (r45v0 java.util.List))
  (r46v0 o.iXt)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r57v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0074: ARITH (32768 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r48v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestValidatorListItems:?: TERNARY null = ((wrap:int:0x007e: ARITH (65536 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestValidatorListItems) : (r49v0 com.okinc.business.invest_biz.data.bean.InvestValidatorListItems))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0088: ARITH (131072 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? true : (r50v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0093: ARITH (262144 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:63)) : (r51v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig:?: TERNARY null = ((wrap:int:0x00a1: ARITH (524288 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig) : (r52v0 com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTxModel:?: TERNARY null = ((wrap:int:0x00ab: ARITH (1048576 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTxModel) : (r53v0 com.okinc.business.invest_biz.data.bean.InvestTxModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (2097152 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (4194304 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r57v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r56v0 int))
 A[MD:(boolean, boolean, java.lang.Throwable, long, int, long, int, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage, o.jiV, o.iXA, o.ixY, o.iXu, java.util.List<? extends o.iXu>, o.iXt, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestValidatorListItems>, com.okinc.business.invest_biz.data.bean.InvestValidatorListItems, boolean, java.util.List<com.okinc.business.invest_biz.data.bean.response.TransactionStep>, com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig, com.okinc.business.invest_biz.data.bean.InvestTxModel, java.lang.String, java.lang.String, int):void (m)] (LINE:36) call: o.iXC.<init>(boolean, boolean, java.lang.Throwable, long, int, long, int, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage, o.jiV, o.iXA, o.ixY, o.iXu, java.util.List, o.iXt, java.lang.String, java.util.List, com.okinc.business.invest_biz.data.bean.InvestValidatorListItems, boolean, java.util.List, com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig, com.okinc.business.invest_biz.data.bean.InvestTxModel, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ iXC(boolean z, boolean z2, java.lang.Throwable th, long j, int i, long j2, int i2, TransactionStage transactionStage, InterfaceC26764jiV interfaceC26764jiV, iXA ixa, C25481ixY c25481ixY, InterfaceC24178iXu interfaceC24178iXu, java.util.List list, C24177iXt c24177iXt, java.lang.String str, java.util.List list2, InvestValidatorListItems investValidatorListItems, boolean z3, java.util.List list3, InvestGasPriceConfig investGasPriceConfig, InvestTxModel investTxModel, java.lang.String str2, java.lang.String str3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? null : th, j, i, j2, i2, (i4 & 128) != 0 ? TransactionStage.INPUT : transactionStage, (i4 & 256) != 0 ? InterfaceC26764jiV.Application.OLrzqt : interfaceC26764jiV, ixa, (i4 & 1024) != 0 ? new C25481ixY("--", "", false, false, false, false, false, false, null, 0, null, 1532, null) : c25481ixY, interfaceC24178iXu, (i4 & 4096) != 0 ? yDY.AhwBna() : list, c24177iXt, (i4 & 16384) != 0 ? "" : str, (32768 & i4) != 0 ? null : list2, (65536 & i4) != 0 ? null : investValidatorListItems, (131072 & i4) != 0 ? true : z3, (262144 & i4) != 0 ? yDY.AhwBna() : list3, (524288 & i4) != 0 ? null : investGasPriceConfig, (1048576 & i4) != 0 ? null : investTxModel, (2097152 & i4) != 0 ? null : str2, (4194304 & i4) != 0 ? null : str3, (i4 & 8388608) != 0 ? -1 : i3);
    }
}
