package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.knT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29109knT {
    public final boolean KWHzl;
    public final java.lang.Throwable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29109knT() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29109knT copy$default(C29109knT c29109knT, boolean z, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29109knT.KWHzl;
        }
        if ((i & 2) != 0) {
            th = c29109knT.copydefault;
        }
        return c29109knT.AEQbTJ(z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29109knT AEQbTJ(boolean z, java.lang.Throwable th) {
        return new C29109knT(z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29109knT)) {
            return false;
        }
        C29109knT c29109knT = (C29109knT) obj;
        return this.KWHzl == c29109knT.KWHzl && Intrinsics.EZpvd(this.copydefault, c29109knT.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Throwable th = this.copydefault;
        return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PositionUiState(isLoading=" + this.KWHzl + ", error=" + this.copydefault + ")";
    }

    public C29109knT(boolean z, java.lang.Throwable th) {
        this.KWHzl = z;
        this.copydefault = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(boolean, java.lang.Throwable):void (m)] (LINE:7) call: o.knT.<init>(boolean, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C29109knT(boolean z, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : th);
    }
}
