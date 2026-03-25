package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25537iyb {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List<InvestTokenWithAmount> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iyb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25537iyb copy$default(C25537iyb c25537iyb, boolean z, java.util.List list, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25537iyb.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c25537iyb.KWHzl;
        }
        if ((i & 4) != 0) {
            z2 = c25537iyb.AEQbTJ;
        }
        return c25537iyb.OLrzqt(z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25537iyb OLrzqt(boolean z, @NotNull java.util.List<InvestTokenWithAmount> list, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C25537iyb(z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25537iyb)) {
            return false;
        }
        C25537iyb c25537iyb = (C25537iyb) obj;
        return this.EZpvd == c25537iyb.EZpvd && Intrinsics.EZpvd(this.KWHzl, c25537iyb.KWHzl) && this.AEQbTJ == c25537iyb.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestSubscriptionDailyYield(isInit=" + this.EZpvd + ", gainsTokenList=" + this.KWHzl + ", isDataErro=" + this.AEQbTJ + ")";
    }

    public C25537iyb(boolean z, @NotNull java.util.List<InvestTokenWithAmount> list, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = z;
        this.KWHzl = list;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:273) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, boolean):void (m)] (LINE:271) call: o.iyb.<init>(boolean, java.util.List, boolean):void type: THIS */
    public /* synthetic */ C25537iyb(boolean z, java.util.List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new java.util.ArrayList() : list, (i & 4) != 0 ? false : z2);
    }
}
