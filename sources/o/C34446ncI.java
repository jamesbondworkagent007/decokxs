package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ncI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34446ncI {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final java.lang.Throwable OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34446ncI() {
        this(false, false, false, false, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34446ncI copy$default(C34446ncI c34446ncI, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34446ncI.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = c34446ncI.copydefault;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = c34446ncI.EZpvd;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            z4 = c34446ncI.KWHzl;
        }
        boolean z7 = z4;
        if ((i & 16) != 0) {
            th = c34446ncI.OLrzqt;
        }
        return c34446ncI.KWHzl(z, z5, z6, z7, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34446ncI KWHzl(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th) {
        return new C34446ncI(z, z2, z3, z4, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34446ncI)) {
            return false;
        }
        C34446ncI c34446ncI = (C34446ncI) obj;
        return this.AEQbTJ == c34446ncI.AEQbTJ && this.copydefault == c34446ncI.copydefault && this.EZpvd == c34446ncI.EZpvd && this.KWHzl == c34446ncI.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c34446ncI.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode4 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Throwable th = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PositionUiState(canLoadMore=" + this.AEQbTJ + ", isLoading=" + this.copydefault + ", isLoadingMore=" + this.EZpvd + ", showReminder=" + this.KWHzl + ", error=" + this.OLrzqt + ")";
    }

    public C34446ncI(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th) {
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.EZpvd = z3;
        this.KWHzl = z4;
        this.OLrzqt = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 boolean) : false)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r8v0 java.lang.Throwable))
 A[MD:(boolean, boolean, boolean, boolean, java.lang.Throwable):void (m)] (LINE:6) call: o.ncI.<init>(boolean, boolean, boolean, boolean, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C34446ncI(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? null : th);
    }
}
