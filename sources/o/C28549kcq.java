package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28549kcq {
    public final C28451kay AEQbTJ;
    public final boolean EZpvd;
    public final kMC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28549kcq() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28549kcq copy$default(C28549kcq c28549kcq, C28451kay c28451kay, kMC kmc, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c28451kay = c28549kcq.AEQbTJ;
        }
        if ((i & 2) != 0) {
            kmc = c28549kcq.copydefault;
        }
        if ((i & 4) != 0) {
            z = c28549kcq.EZpvd;
        }
        return c28549kcq.copydefault(c28451kay, kmc, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28451kay EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kMC copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28549kcq copydefault(@NotNull C28451kay c28451kay, kMC kmc, boolean z) {
        Intrinsics.checkNotNullParameter(c28451kay, "");
        return new C28549kcq(c28451kay, kmc, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28549kcq)) {
            return false;
        }
        C28549kcq c28549kcq = (C28549kcq) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c28549kcq.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c28549kcq.copydefault) && this.EZpvd == c28549kcq.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        kMC kmc = this.copydefault;
        return (((iHashCode * 31) + (kmc == null ? 0 : kmc.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HomeTokenListFilterUiModel(common=" + this.AEQbTJ + ", ranking=" + this.copydefault + ", hasDiff=" + this.EZpvd + ")";
    }

    public C28549kcq(@NotNull C28451kay c28451kay, kMC kmc, boolean z) {
        Intrinsics.checkNotNullParameter(c28451kay, "");
        this.AEQbTJ = c28451kay;
        this.copydefault = kmc;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:o.kay:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.kay:0x000e: CONSTRUCTOR 
  (null com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel)
  (null com.okinc.business.market.common.constants.TimeIntervalType)
  false
  (null java.util.List)
  (15 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:25) call: o.kay.<init>(com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 o.kay))
  (wrap:o.kMC:?: TERNARY null = ((wrap:int:0x0011: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.kMC) : (r9v0 o.kMC))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(o.kay, o.kMC, boolean):void (m)] (LINE:24) call: o.kcq.<init>(o.kay, o.kMC, boolean):void type: THIS */
    public /* synthetic */ C28549kcq(C28451kay c28451kay, kMC kmc, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C28451kay(null, null, false, null, 15, null) : c28451kay, (i & 2) != 0 ? null : kmc, (i & 4) != 0 ? false : z);
    }
}
