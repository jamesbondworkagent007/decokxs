package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.jDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25706jDi {
    public final java.lang.Throwable AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25706jDi() {
        this(false, false, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25706jDi copy$default(C25706jDi c25706jDi, boolean z, boolean z2, boolean z3, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25706jDi.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = c25706jDi.EZpvd;
        }
        if ((i & 4) != 0) {
            z3 = c25706jDi.KWHzl;
        }
        if ((i & 8) != 0) {
            th = c25706jDi.AEQbTJ;
        }
        return c25706jDi.AEQbTJ(z, z2, z3, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25706jDi AEQbTJ(boolean z, boolean z2, boolean z3, java.lang.Throwable th) {
        return new C25706jDi(z, z2, z3, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable OLrzqt() {
        return this.AEQbTJ;
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
        if (!(obj instanceof C25706jDi)) {
            return false;
        }
        C25706jDi c25706jDi = (C25706jDi) obj;
        return this.copydefault == c25706jDi.copydefault && this.EZpvd == c25706jDi.EZpvd && this.KWHzl == c25706jDi.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c25706jDi.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Throwable th = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardLoadMoreUiState(canLoadMore=" + this.copydefault + ", isLoading=" + this.EZpvd + ", isLoadingMore=" + this.KWHzl + ", error=" + this.AEQbTJ + ")";
    }

    public C25706jDi(boolean z, boolean z2, boolean z3, java.lang.Throwable th) {
        this.copydefault = z;
        this.EZpvd = z2;
        this.KWHzl = z3;
        this.AEQbTJ = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r5v0 java.lang.Throwable))
 A[MD:(boolean, boolean, boolean, java.lang.Throwable):void (m)] (LINE:28) call: o.jDi.<init>(boolean, boolean, boolean, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C25706jDi(boolean z, boolean z2, boolean z3, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : th);
    }
}
