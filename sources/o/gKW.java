package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gKW {
    public final java.lang.Exception AEQbTJ;
    public final gKR KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public gKW() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ gKW copy$default(gKW gkw, boolean z, gKR gkr, java.lang.Exception exc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = gkw.OLrzqt;
        }
        if ((i & 2) != 0) {
            gkr = gkw.KWHzl;
        }
        if ((i & 4) != 0) {
            exc = gkw.AEQbTJ;
        }
        return gkw.EZpvd(z, gkr, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Exception EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gKW EZpvd(boolean z, gKR gkr, java.lang.Exception exc) {
        return new gKW(z, gkr, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gKR KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gKW)) {
            return false;
        }
        gKW gkw = (gKW) obj;
        return this.OLrzqt == gkw.OLrzqt && Intrinsics.EZpvd(this.KWHzl, gkw.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, gkw.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
        gKR gkr = this.KWHzl;
        int iHashCode2 = gkr == null ? 0 : gkr.hashCode();
        java.lang.Exception exc = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (exc != null ? exc.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeResult(success=" + this.OLrzqt + ", info=" + this.KWHzl + ", error=" + this.AEQbTJ + ")";
    }

    public gKW(boolean z, gKR gkr, java.lang.Exception exc) {
        this.OLrzqt = z;
        this.KWHzl = gkr;
        this.AEQbTJ = exc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:o.gKR:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.gKR) : (r3v0 o.gKR))
  (wrap:java.lang.Exception:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Exception) : (r4v0 java.lang.Exception))
 A[MD:(boolean, o.gKR, java.lang.Exception):void (m)] (LINE:150) call: o.gKW.<init>(boolean, o.gKR, java.lang.Exception):void type: THIS */
    public /* synthetic */ gKW(boolean z, gKR gkr, java.lang.Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : gkr, (i & 4) != 0 ? null : exc);
    }
}
