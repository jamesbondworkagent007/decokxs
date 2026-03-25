package o;

import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25718jDu {
    public final boolean AEQbTJ;
    public final int EZpvd;
    public final boolean KWHzl;
    public final java.util.List<LeaderBoardCardUIModel> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25718jDu() {
        this(0, null, false, false, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.jDu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25718jDu copy$default(C25718jDu c25718jDu, int i, java.util.List list, boolean z, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c25718jDu.EZpvd;
        }
        if ((i2 & 2) != 0) {
            list = c25718jDu.OLrzqt;
        }
        java.util.List list2 = list;
        if ((i2 & 4) != 0) {
            z = c25718jDu.KWHzl;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z2 = c25718jDu.copydefault;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            z3 = c25718jDu.AEQbTJ;
        }
        return c25718jDu.EZpvd(i, list2, z4, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25718jDu EZpvd(int i, @NotNull java.util.List<LeaderBoardCardUIModel> list, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C25718jDu(i, list, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<LeaderBoardCardUIModel> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25718jDu)) {
            return false;
        }
        C25718jDu c25718jDu = (C25718jDu) obj;
        return this.EZpvd == c25718jDu.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c25718jDu.OLrzqt) && this.KWHzl == c25718jDu.KWHzl && this.copydefault == c25718jDu.copydefault && this.AEQbTJ == c25718jDu.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AddressTrackerRecommendationUiState(startingPosition=" + this.EZpvd + ", items=" + this.OLrzqt + ", isInitial=" + this.KWHzl + ", isLoading=" + this.copydefault + ", hasError=" + this.AEQbTJ + ")";
    }

    public C25718jDu(int i, @NotNull java.util.List<LeaderBoardCardUIModel> list, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = i;
        this.OLrzqt = list;
        this.KWHzl = z;
        this.copydefault = z2;
        this.AEQbTJ = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r6v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
 A[MD:(int, java.util.List<com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel>, boolean, boolean, boolean):void (m)] (LINE:7) call: o.jDu.<init>(int, java.util.List, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C25718jDu(int i, java.util.List list, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3);
    }
}
