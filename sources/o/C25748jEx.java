package o;

import com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25748jEx {
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final TrackerTxnListFilter OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25748jEx copy$default(C25748jEx c25748jEx, TrackerTxnListFilter trackerTxnListFilter, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackerTxnListFilter = c25748jEx.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c25748jEx.KWHzl;
        }
        if ((i & 4) != 0) {
            z2 = c25748jEx.EZpvd;
        }
        return c25748jEx.EZpvd(trackerTxnListFilter, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTxnListFilter AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25748jEx EZpvd(@NotNull TrackerTxnListFilter trackerTxnListFilter, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(trackerTxnListFilter, "");
        return new C25748jEx(trackerTxnListFilter, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25748jEx)) {
            return false;
        }
        C25748jEx c25748jEx = (C25748jEx) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c25748jEx.OLrzqt) && this.KWHzl == c25748jEx.KWHzl && this.EZpvd == c25748jEx.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrackerFilterUiState(filter=" + this.OLrzqt + ", canApply=" + this.KWHzl + ", canReset=" + this.EZpvd + ")";
    }

    public C25748jEx(@NotNull TrackerTxnListFilter trackerTxnListFilter, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(trackerTxnListFilter, "");
        this.OLrzqt = trackerTxnListFilter;
        this.KWHzl = z;
        this.EZpvd = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter, boolean, boolean):void (m)] (LINE:12) call: o.jEx.<init>(com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter, boolean, boolean):void type: THIS */
    public /* synthetic */ C25748jEx(TrackerTxnListFilter trackerTxnListFilter, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(trackerTxnListFilter, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
