package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.kvs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29558kvs {
    public final java.lang.Throwable AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29558kvs() {
        this(false, false, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29558kvs copy$default(C29558kvs c29558kvs, boolean z, boolean z2, boolean z3, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29558kvs.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c29558kvs.OLrzqt;
        }
        if ((i & 4) != 0) {
            z3 = c29558kvs.KWHzl;
        }
        if ((i & 8) != 0) {
            th = c29558kvs.AEQbTJ;
        }
        return c29558kvs.AEQbTJ(z, z2, z3, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29558kvs AEQbTJ(boolean z, boolean z2, boolean z3, java.lang.Throwable th) {
        return new C29558kvs(z, z2, z3, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29558kvs)) {
            return false;
        }
        C29558kvs c29558kvs = (C29558kvs) obj;
        return this.EZpvd == c29558kvs.EZpvd && this.OLrzqt == c29558kvs.OLrzqt && this.KWHzl == c29558kvs.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c29558kvs.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Throwable th = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalUiState(canLoadMore=" + this.EZpvd + ", isLoading=" + this.OLrzqt + ", isLoadingMore=" + this.KWHzl + ", error=" + this.AEQbTJ + ")";
    }

    public C29558kvs(boolean z, boolean z2, boolean z3, java.lang.Throwable th) {
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.KWHzl = z3;
        this.AEQbTJ = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r5v0 java.lang.Throwable))
 A[MD:(boolean, boolean, boolean, java.lang.Throwable):void (m)] (LINE:3) call: o.kvs.<init>(boolean, boolean, boolean, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C29558kvs(boolean z, boolean z2, boolean z3, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : th);
    }
}
