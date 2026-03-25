package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25536iya {
    public final int AEQbTJ;
    public final boolean EZpvd;
    public final int KWHzl;
    public final boolean OLrzqt;
    public final InvestTokenWithAmount copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25536iya copy$default(C25536iya c25536iya, InvestTokenWithAmount investTokenWithAmount, int i, boolean z, boolean z2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            investTokenWithAmount = c25536iya.copydefault;
        }
        if ((i3 & 2) != 0) {
            i = c25536iya.KWHzl;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            z = c25536iya.EZpvd;
        }
        boolean z3 = z;
        if ((i3 & 8) != 0) {
            z2 = c25536iya.OLrzqt;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            i2 = c25536iya.AEQbTJ;
        }
        return c25536iya.AEQbTJ(investTokenWithAmount, i4, z3, z4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25536iya AEQbTJ(@NotNull InvestTokenWithAmount investTokenWithAmount, int i, boolean z, boolean z2, @androidx.annotation.StringRes int i2) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return new C25536iya(investTokenWithAmount, i, z, z2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25536iya)) {
            return false;
        }
        C25536iya c25536iya = (C25536iya) obj;
        return Intrinsics.EZpvd(this.copydefault, c25536iya.copydefault) && this.KWHzl == c25536iya.KWHzl && this.EZpvd == c25536iya.EZpvd && this.OLrzqt == c25536iya.OLrzqt && this.AEQbTJ == c25536iya.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestSubscriptionWith(investWithTokenInfo=" + this.copydefault + ", tokenPrecision=" + this.KWHzl + ", isSupportSwap=" + this.EZpvd + ", isLp=" + this.OLrzqt + ", title=" + this.AEQbTJ + ")";
    }

    public C25536iya(@NotNull InvestTokenWithAmount investTokenWithAmount, int i, boolean z, boolean z2, @androidx.annotation.StringRes int i2) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        this.copydefault = investTokenWithAmount;
        this.KWHzl = i;
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.AEQbTJ = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount)
  (r9v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0013: SGET  A[WRAPPED] o.ixk.FragmentManager.QfJbVf int) : (r12v0 int))
 A[MD:(com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, int, boolean, boolean, int):void (m)] (LINE:329) call: o.iya.<init>(com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, int, boolean, boolean, int):void type: THIS */
    public /* synthetic */ C25536iya(InvestTokenWithAmount investTokenWithAmount, int i, boolean z, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(investTokenWithAmount, i, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? C25493ixk.FragmentManager.QfJbVf : i2);
    }
}
