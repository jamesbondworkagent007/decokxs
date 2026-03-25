package o;

import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iXB {
    public final int AEQbTJ;
    public final InvestNetworkFeeItem AYXKKw;
    public final boolean AhwBna;
    public final TransactionStage AkhnZx;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final InvestTokenWithAmount djBIcL;
    public final long fetchVPNInfo;
    public final InvestValidatorListItems gEmmrt;
    public final InvestTokenWithAmount valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestValidatorListItems AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStage AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iXB KWHzl(@NotNull java.lang.String str, InvestTokenWithAmount investTokenWithAmount, @NotNull TransactionStage transactionStage, @NotNull java.lang.String str2, InvestNetworkFeeItem investNetworkFeeItem, InvestValidatorListItems investValidatorListItems, long j, InvestTokenWithAmount investTokenWithAmount2, int i, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionStage, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new iXB(str, investTokenWithAmount, transactionStage, str2, investNetworkFeeItem, investValidatorListItems, j, investTokenWithAmount2, i, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iXB)) {
            return false;
        }
        iXB ixb = (iXB) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ixb.copydefault) && Intrinsics.EZpvd(this.valueOf, ixb.valueOf) && this.AkhnZx == ixb.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ixb.OLrzqt) && Intrinsics.EZpvd(this.AYXKKw, ixb.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, ixb.gEmmrt) && this.fetchVPNInfo == ixb.fetchVPNInfo && Intrinsics.EZpvd(this.djBIcL, ixb.djBIcL) && this.AEQbTJ == ixb.AEQbTJ && this.AhwBna == ixb.AhwBna && this.KWHzl == ixb.KWHzl && this.EZpvd == ixb.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.valueOf;
        int iHashCode2 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        int iHashCode3 = this.AkhnZx.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        InvestNetworkFeeItem investNetworkFeeItem = this.AYXKKw;
        int iHashCode5 = investNetworkFeeItem == null ? 0 : investNetworkFeeItem.hashCode();
        InvestValidatorListItems investValidatorListItems = this.gEmmrt;
        int iHashCode6 = investValidatorListItems == null ? 0 : investValidatorListItems.hashCode();
        int iHashCode7 = java.lang.Long.hashCode(this.fetchVPNInfo);
        InvestTokenWithAmount investTokenWithAmount2 = this.djBIcL;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (investTokenWithAmount2 != null ? investTokenWithAmount2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserInput(amount=" + this.copydefault + ", selectedToken=" + this.valueOf + ", stage=" + this.AkhnZx + ", customSlippage=" + this.OLrzqt + ", selectedNetworkFee=" + this.AYXKKw + ", selectedProvider=" + this.gEmmrt + ", timeStamp=" + this.fetchVPNInfo + ", receiveToken=" + this.djBIcL + ", currentInputIndex=" + this.AEQbTJ + ", reset=" + this.AhwBna + ", max=" + this.KWHzl + ", firstInitial=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestNetworkFeeItem valueOf() {
        return this.AYXKKw;
    }

    public iXB(@NotNull java.lang.String str, InvestTokenWithAmount investTokenWithAmount, @NotNull TransactionStage transactionStage, @NotNull java.lang.String str2, InvestNetworkFeeItem investNetworkFeeItem, InvestValidatorListItems investValidatorListItems, long j, InvestTokenWithAmount investTokenWithAmount2, int i, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionStage, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.valueOf = investTokenWithAmount;
        this.AkhnZx = transactionStage;
        this.OLrzqt = str2;
        this.AYXKKw = investNetworkFeeItem;
        this.gEmmrt = investValidatorListItems;
        this.fetchVPNInfo = j;
        this.djBIcL = investTokenWithAmount2;
        this.AEQbTJ = i;
        this.AhwBna = z;
        this.KWHzl = z2;
        this.EZpvd = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount)
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] (LINE:10) com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage.INPUT com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage) : (r20v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem:?: TERNARY null = ((wrap:int:0x001e: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem) : (r22v0 com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestValidatorListItems:?: TERNARY null = ((wrap:int:0x0027: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestValidatorListItems) : (r23v0 com.okinc.business.invest_biz.data.bean.InvestValidatorListItems))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002f: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0038: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r26v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0040: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0059: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage, java.lang.String, com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem, com.okinc.business.invest_biz.data.bean.InvestValidatorListItems, long, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, int, boolean, boolean, boolean):void (m)] (LINE:7) call: o.iXB.<init>(java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage, java.lang.String, com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem, com.okinc.business.invest_biz.data.bean.InvestValidatorListItems, long, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, int, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ iXB(java.lang.String str, InvestTokenWithAmount investTokenWithAmount, TransactionStage transactionStage, java.lang.String str2, InvestNetworkFeeItem investNetworkFeeItem, InvestValidatorListItems investValidatorListItems, long j, InvestTokenWithAmount investTokenWithAmount2, int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, investTokenWithAmount, (i2 & 4) != 0 ? TransactionStage.INPUT : transactionStage, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? null : investNetworkFeeItem, (i2 & 32) != 0 ? null : investValidatorListItems, (i2 & 64) != 0 ? 0L : j, (i2 & 128) != 0 ? null : investTokenWithAmount2, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? false : z3);
    }

    public final boolean isConnected() {
        return this.AkhnZx != TransactionStage.INPUT;
    }

    public final boolean values() {
        return this.AkhnZx == TransactionStage.INPUT;
    }
}
