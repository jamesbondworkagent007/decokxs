package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27460jvc implements InterfaceC27436jvE {
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final InvestTipInfoVo OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27460jvc copy$default(C27460jvc c27460jvc, java.lang.String str, InvestTipInfoVo investTipInfoVo, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c27460jvc.AEQbTJ;
        }
        if ((i3 & 2) != 0) {
            investTipInfoVo = c27460jvc.OLrzqt;
        }
        InvestTipInfoVo investTipInfoVo2 = investTipInfoVo;
        if ((i3 & 4) != 0) {
            i = c27460jvc.EZpvd;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = c27460jvc.KWHzl;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z = c27460jvc.copydefault;
        }
        return c27460jvc.OLrzqt(str, investTipInfoVo2, i4, i5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27460jvc OLrzqt(@NotNull java.lang.String str, InvestTipInfoVo investTipInfoVo, int i, @androidx.annotation.ColorRes int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C27460jvc(str, investTipInfoVo, i, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27460jvc)) {
            return false;
        }
        C27460jvc c27460jvc = (C27460jvc) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27460jvc.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c27460jvc.OLrzqt) && this.EZpvd == c27460jvc.EZpvd && this.KWHzl == c27460jvc.KWHzl && this.copydefault == c27460jvc.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        InvestTipInfoVo investTipInfoVo = this.OLrzqt;
        return (((((((iHashCode * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode())) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiBonusContentItem(content=" + this.AEQbTJ + ", tipInfo=" + this.OLrzqt + ", index=" + this.EZpvd + ", textColor=" + this.KWHzl + ", isSingle=" + this.copydefault + ")";
    }

    public C27460jvc(@NotNull java.lang.String str, InvestTipInfoVo investTipInfoVo, int i, @androidx.annotation.ColorRes int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.OLrzqt = investTipInfoVo;
        this.EZpvd = i;
        this.KWHzl = i2;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r8v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:int:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r9v0 int))
  (wrap:int:0x0012: TERNARY null = ((wrap:int:0x000c: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: SGET  A[WRAPPED] o.wXj.Activity.QwvEab int) : (r10v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, int, boolean):void (m)] (LINE:31) call: o.jvc.<init>(java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, int, boolean):void type: THIS */
    public /* synthetic */ C27460jvc(java.lang.String str, InvestTipInfoVo investTipInfoVo, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : investTipInfoVo, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? C52761wXj.Activity.QwvEab : i2, (i3 & 16) != 0 ? false : z);
    }
}
