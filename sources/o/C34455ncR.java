package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34455ncR {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.Throwable KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final java.util.List<C34462ncY> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34455ncR() {
        this(false, false, false, null, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.ncR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C34455ncR copy$default(C34455ncR c34455ncR, boolean z, boolean z2, boolean z3, java.util.List list, java.lang.Throwable th, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34455ncR.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c34455ncR.OLrzqt;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = c34455ncR.AEQbTJ;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            list = c34455ncR.gEmmrt;
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            th = c34455ncR.KWHzl;
        }
        java.lang.Throwable th2 = th;
        if ((i & 32) != 0) {
            z4 = c34455ncR.copydefault;
        }
        return c34455ncR.copydefault(z, z5, z6, list2, th2, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C34462ncY> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34455ncR copydefault(boolean z, boolean z2, boolean z3, @NotNull java.util.List<C34462ncY> list, java.lang.Throwable th, boolean z4) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C34455ncR(z, z2, z3, list, th, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34455ncR)) {
            return false;
        }
        C34455ncR c34455ncR = (C34455ncR) obj;
        return this.EZpvd == c34455ncR.EZpvd && this.OLrzqt == c34455ncR.OLrzqt && this.AEQbTJ == c34455ncR.AEQbTJ && Intrinsics.EZpvd(this.gEmmrt, c34455ncR.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, c34455ncR.KWHzl) && this.copydefault == c34455ncR.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode3 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode4 = this.gEmmrt.hashCode();
        java.lang.Throwable th = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th == null ? 0 : th.hashCode())) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecentTransactionsUiState(isLoading=" + this.EZpvd + ", isLoadingMore=" + this.OLrzqt + ", canLoadMore=" + this.AEQbTJ + ", transactions=" + this.gEmmrt + ", error=" + this.KWHzl + ", stopLoadMore=" + this.copydefault + ")";
    }

    public C34455ncR(boolean z, boolean z2, boolean z3, @NotNull java.util.List<C34462ncY> list, java.lang.Throwable th, boolean z4) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.AEQbTJ = z3;
        this.gEmmrt = list;
        this.KWHzl = th;
        this.copydefault = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.util.List:0x001e: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r9v0 java.util.List))
  (wrap:java.lang.Throwable:0x0024: TERNARY null = ((wrap:int:0x001f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r10v0 java.lang.Throwable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(boolean, boolean, boolean, java.util.List<o.ncY>, java.lang.Throwable, boolean):void (m)] (LINE:27) call: o.ncR.<init>(boolean, boolean, boolean, java.util.List, java.lang.Throwable, boolean):void type: THIS */
    public /* synthetic */ C34455ncR(boolean z, boolean z2, boolean z3, java.util.List list, java.lang.Throwable th, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? null : th, (i & 32) != 0 ? false : z4);
    }
}
