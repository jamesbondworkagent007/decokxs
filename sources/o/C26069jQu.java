package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.jQu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26069jQu {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final java.lang.Throwable EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26069jQu() {
        this(false, false, false, false, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26069jQu copy$default(C26069jQu c26069jQu, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c26069jQu.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = c26069jQu.copydefault;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = c26069jQu.AYXKKw;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = c26069jQu.KWHzl;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            th = c26069jQu.EZpvd;
        }
        java.lang.Throwable th2 = th;
        if ((i & 32) != 0) {
            z5 = c26069jQu.OLrzqt;
        }
        return c26069jQu.KWHzl(z, z6, z7, z8, th2, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26069jQu KWHzl(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, boolean z5) {
        return new C26069jQu(z, z2, z3, z4, th, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26069jQu)) {
            return false;
        }
        C26069jQu c26069jQu = (C26069jQu) obj;
        return this.AEQbTJ == c26069jQu.AEQbTJ && this.copydefault == c26069jQu.copydefault && this.AYXKKw == c26069jQu.AYXKKw && this.KWHzl == c26069jQu.KWHzl && Intrinsics.EZpvd(this.EZpvd, c26069jQu.EZpvd) && this.OLrzqt == c26069jQu.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode3 = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode4 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Throwable th = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th == null ? 0 : th.hashCode())) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LiquidityUiState(canLoadMore=" + this.AEQbTJ + ", isLoading=" + this.copydefault + ", isLoadingMore=" + this.AYXKKw + ", isInternalLoading=" + this.KWHzl + ", error=" + this.EZpvd + ", isInit=" + this.OLrzqt + ")";
    }

    public C26069jQu(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, boolean z5) {
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.AYXKKw = z3;
        this.KWHzl = z4;
        this.EZpvd = th;
        this.OLrzqt = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:java.lang.Throwable:0x0022: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r10v0 java.lang.Throwable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean, java.lang.Throwable, boolean):void (m)] (LINE:3) call: o.jQu.<init>(boolean, boolean, boolean, boolean, java.lang.Throwable, boolean):void type: THIS */
    public /* synthetic */ C26069jQu(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : th, (i & 32) != 0 ? false : z5);
    }
}
