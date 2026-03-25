package o;

import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iPp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23957iPp {
    public final int AEQbTJ;
    public final InvestTokenWithAmount EZpvd;
    public final boolean KWHzl;
    public final java.util.List<InvestTokenWithApprove> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.iPp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C23957iPp copy$default(C23957iPp c23957iPp, boolean z, boolean z2, int i, java.util.List list, InvestTokenWithAmount investTokenWithAmount, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c23957iPp.KWHzl;
        }
        if ((i2 & 2) != 0) {
            z2 = c23957iPp.copydefault;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            i = c23957iPp.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = c23957iPp.OLrzqt;
        }
        java.util.List list2 = list;
        if ((i2 & 16) != 0) {
            investTokenWithAmount = c23957iPp.EZpvd;
        }
        return c23957iPp.EZpvd(z, z3, i3, list2, investTokenWithAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23957iPp EZpvd(boolean z, boolean z2, int i, java.util.List<InvestTokenWithApprove> list, InvestTokenWithAmount investTokenWithAmount) {
        return new C23957iPp(z, z2, i, list, investTokenWithAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23957iPp)) {
            return false;
        }
        C23957iPp c23957iPp = (C23957iPp) obj;
        return this.KWHzl == c23957iPp.KWHzl && this.copydefault == c23957iPp.copydefault && this.AEQbTJ == c23957iPp.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, c23957iPp.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c23957iPp.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode3 = java.lang.Integer.hashCode(this.AEQbTJ);
        java.util.List<InvestTokenWithApprove> list = this.OLrzqt;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (investTokenWithAmount != null ? investTokenWithAmount.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3ConfirmBottomButtonUIBean(isInit=" + this.KWHzl + ", isDataErro=" + this.copydefault + ", status=" + this.AEQbTJ + ", approveList=" + this.OLrzqt + ", toastToken=" + this.EZpvd + ")";
    }

    public C23957iPp(boolean z, boolean z2, int i, java.util.List<InvestTokenWithApprove> list, InvestTokenWithAmount investTokenWithAmount) {
        this.KWHzl = z;
        this.copydefault = z2;
        this.AEQbTJ = i;
        this.OLrzqt = list;
        this.EZpvd = investTokenWithAmount;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r7v0 boolean))
  (wrap:boolean:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (r9v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r11v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
 A[MD:(boolean, boolean, int, java.util.List<com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove>, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount):void (m)] (LINE:80) call: o.iPp.<init>(boolean, boolean, int, java.util.List, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount):void type: THIS */
    public /* synthetic */ C23957iPp(boolean z, boolean z2, int i, java.util.List list, InvestTokenWithAmount investTokenWithAmount, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, i, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : investTokenWithAmount);
    }
}
