package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.koh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29176koh {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.Throwable KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final java.util.List<C29182kon> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29176koh() {
        this(false, false, false, null, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.koh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29176koh copy$default(C29176koh c29176koh, boolean z, boolean z2, boolean z3, java.util.List list, java.lang.Throwable th, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29176koh.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = c29176koh.AEQbTJ;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = c29176koh.EZpvd;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            list = c29176koh.gEmmrt;
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            th = c29176koh.KWHzl;
        }
        java.lang.Throwable th2 = th;
        if ((i & 32) != 0) {
            z4 = c29176koh.OLrzqt;
        }
        return c29176koh.KWHzl(z, z5, z6, list2, th2, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29176koh KWHzl(boolean z, boolean z2, boolean z3, java.util.List<C29182kon> list, java.lang.Throwable th, boolean z4) {
        return new C29176koh(z, z2, z3, list, th, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C29182kon> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29176koh)) {
            return false;
        }
        C29176koh c29176koh = (C29176koh) obj;
        return this.copydefault == c29176koh.copydefault && this.AEQbTJ == c29176koh.AEQbTJ && this.EZpvd == c29176koh.EZpvd && Intrinsics.EZpvd(this.gEmmrt, c29176koh.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, c29176koh.KWHzl) && this.OLrzqt == c29176koh.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        java.util.List<C29182kon> list = this.gEmmrt;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        java.lang.Throwable th = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th != null ? th.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecentTransactionsUiState(isLoading=" + this.copydefault + ", isLoadingMore=" + this.AEQbTJ + ", canLoadMore=" + this.EZpvd + ", transactions=" + this.gEmmrt + ", error=" + this.KWHzl + ", stopLoadMore=" + this.OLrzqt + ")";
    }

    public C29176koh(boolean z, boolean z2, boolean z3, java.util.List<C29182kon> list, java.lang.Throwable th, boolean z4) {
        this.copydefault = z;
        this.AEQbTJ = z2;
        this.EZpvd = z3;
        this.gEmmrt = list;
        this.KWHzl = th;
        this.OLrzqt = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r10v0 java.lang.Throwable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(boolean, boolean, boolean, java.util.List<o.kon>, java.lang.Throwable, boolean):void (m)] (LINE:18) call: o.koh.<init>(boolean, boolean, boolean, java.util.List, java.lang.Throwable, boolean):void type: THIS */
    public /* synthetic */ C29176koh(boolean z, boolean z2, boolean z3, java.util.List list, java.lang.Throwable th, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : th, (i & 32) != 0 ? false : z4);
    }
}
