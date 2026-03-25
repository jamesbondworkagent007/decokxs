package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25539iyd {
    public final boolean AEQbTJ;
    public final int EZpvd;
    public final InvestTipInfoVo KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final java.util.List<InvestTokenWithAmount> djBIcL;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.iyd */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25539iyd copy$default(C25539iyd c25539iyd, boolean z, java.util.List list, boolean z2, boolean z3, boolean z4, int i, InvestTipInfoVo investTipInfoVo, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c25539iyd.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            list = c25539iyd.djBIcL;
        }
        java.util.List list2 = list;
        if ((i2 & 4) != 0) {
            z2 = c25539iyd.AEQbTJ;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            z3 = c25539iyd.valueOf;
        }
        boolean z6 = z3;
        if ((i2 & 16) != 0) {
            z4 = c25539iyd.copydefault;
        }
        boolean z7 = z4;
        if ((i2 & 32) != 0) {
            i = c25539iyd.EZpvd;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            investTipInfoVo = c25539iyd.KWHzl;
        }
        return c25539iyd.EZpvd(z, list2, z5, z6, z7, i3, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25539iyd EZpvd(boolean z, @NotNull java.util.List<InvestTokenWithAmount> list, boolean z2, boolean z3, boolean z4, int i, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C25539iyd(z, list, z2, z3, z4, i, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25539iyd)) {
            return false;
        }
        C25539iyd c25539iyd = (C25539iyd) obj;
        return this.OLrzqt == c25539iyd.OLrzqt && Intrinsics.EZpvd(this.djBIcL, c25539iyd.djBIcL) && this.AEQbTJ == c25539iyd.AEQbTJ && this.valueOf == c25539iyd.valueOf && this.copydefault == c25539iyd.copydefault && this.EZpvd == c25539iyd.EZpvd && Intrinsics.EZpvd(this.KWHzl, c25539iyd.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode2 = this.djBIcL.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode4 = java.lang.Boolean.hashCode(this.valueOf);
        int iHashCode5 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode6 = java.lang.Integer.hashCode(this.EZpvd);
        InvestTipInfoVo investTipInfoVo = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestRedeemReceiveUIBean(isInit=" + this.OLrzqt + ", receiveTokenList=" + this.djBIcL + ", isDataErro=" + this.AEQbTJ + ", isSupportSwap=" + this.valueOf + ", isShouldSwap=" + this.copydefault + ", investmentType=" + this.EZpvd + ", infoData=" + this.KWHzl + ")";
    }

    public C25539iyd(boolean z, @NotNull java.util.List<InvestTokenWithAmount> list, boolean z2, boolean z3, boolean z4, int i, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = z;
        this.djBIcL = list;
        this.AEQbTJ = z2;
        this.valueOf = z3;
        this.copydefault = z4;
        this.EZpvd = i;
        this.KWHzl = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (r7v0 boolean)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:346) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 int) : (0 int))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0027: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r13v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(boolean, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, boolean, boolean, boolean, int, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:344) call: o.iyd.<init>(boolean, java.util.List, boolean, boolean, boolean, int, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ C25539iyd(boolean z, java.util.List list, boolean z2, boolean z3, boolean z4, int i, InvestTipInfoVo investTipInfoVo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? new java.util.ArrayList() : list, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) == 0 ? i : 0, (i2 & 64) != 0 ? null : investTipInfoVo);
    }
}
