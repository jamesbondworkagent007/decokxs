package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.naq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34374naq {
    public final java.lang.Throwable AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34374naq() {
        this(false, false, false, false, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34374naq copy$default(C34374naq c34374naq, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34374naq.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = c34374naq.OLrzqt;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = c34374naq.djBIcL;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = c34374naq.EZpvd;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            th = c34374naq.AEQbTJ;
        }
        java.lang.Throwable th2 = th;
        if ((i & 32) != 0) {
            z5 = c34374naq.KWHzl;
        }
        return c34374naq.KWHzl(z, z6, z7, z8, th2, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34374naq KWHzl(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, boolean z5) {
        return new C34374naq(z, z2, z3, z4, th, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
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
        if (!(obj instanceof C34374naq)) {
            return false;
        }
        C34374naq c34374naq = (C34374naq) obj;
        return this.copydefault == c34374naq.copydefault && this.OLrzqt == c34374naq.OLrzqt && this.djBIcL == c34374naq.djBIcL && this.EZpvd == c34374naq.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, c34374naq.AEQbTJ) && this.KWHzl == c34374naq.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode3 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode4 = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.Throwable th = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th == null ? 0 : th.hashCode())) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HistoryChangeUiState(canLoadMore=" + this.copydefault + ", isLoading=" + this.OLrzqt + ", isLoadingMore=" + this.djBIcL + ", finishLoadingMore=" + this.EZpvd + ", error=" + this.AEQbTJ + ", isInit=" + this.KWHzl + ")";
    }

    public C34374naq(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, boolean z5) {
        this.copydefault = z;
        this.OLrzqt = z2;
        this.djBIcL = z3;
        this.EZpvd = z4;
        this.AEQbTJ = th;
        this.KWHzl = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:java.lang.Throwable:0x0022: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r10v0 java.lang.Throwable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean, java.lang.Throwable, boolean):void (m)] (LINE:3) call: o.naq.<init>(boolean, boolean, boolean, boolean, java.lang.Throwable, boolean):void type: THIS */
    public /* synthetic */ C34374naq(boolean z, boolean z2, boolean z3, boolean z4, java.lang.Throwable th, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : th, (i & 32) != 0 ? false : z5);
    }
}
