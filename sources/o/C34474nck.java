package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34474nck {
    public final java.lang.Throwable EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34474nck() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34474nck copy$default(C34474nck c34474nck, boolean z, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34474nck.copydefault;
        }
        if ((i & 2) != 0) {
            th = c34474nck.EZpvd;
        }
        return c34474nck.KWHzl(z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34474nck KWHzl(boolean z, java.lang.Throwable th) {
        return new C34474nck(z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34474nck)) {
            return false;
        }
        C34474nck c34474nck = (C34474nck) obj;
        return this.copydefault == c34474nck.copydefault && Intrinsics.EZpvd(this.EZpvd, c34474nck.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.Throwable th = this.EZpvd;
        return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ActivePositionsUiState(isLoading=" + this.copydefault + ", error=" + this.EZpvd + ")";
    }

    public C34474nck(boolean z, java.lang.Throwable th) {
        this.copydefault = z;
        this.EZpvd = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(boolean, java.lang.Throwable):void (m)] (LINE:36) call: o.nck.<init>(boolean, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C34474nck(boolean z, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : th);
    }
}
