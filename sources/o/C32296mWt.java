package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.mWt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32296mWt {
    public final boolean AEQbTJ;
    public final C32299mWw KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C32296mWt() {
        this(false, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32296mWt copy$default(C32296mWt c32296mWt, boolean z, C32299mWw c32299mWw, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c32296mWt.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c32299mWw = c32296mWt.KWHzl;
        }
        if ((i & 4) != 0) {
            z2 = c32296mWt.OLrzqt;
        }
        return c32296mWt.KWHzl(z, c32299mWw, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32296mWt KWHzl(boolean z, C32299mWw c32299mWw, boolean z2) {
        return new C32296mWt(z, c32299mWw, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32299mWw copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32296mWt)) {
            return false;
        }
        C32296mWt c32296mWt = (C32296mWt) obj;
        return this.AEQbTJ == c32296mWt.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c32296mWt.KWHzl) && this.OLrzqt == c32296mWt.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        C32299mWw c32299mWw = this.KWHzl;
        return (((iHashCode * 31) + (c32299mWw == null ? 0 : c32299mWw.hashCode())) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoinCheckUiState(isLoading=" + this.AEQbTJ + ", coinRisk=" + this.KWHzl + ", isError=" + this.OLrzqt + ")";
    }

    public C32296mWt(boolean z, C32299mWw c32299mWw, boolean z2) {
        this.AEQbTJ = z;
        this.KWHzl = c32299mWw;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:o.mWw:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.mWw) : (r3v0 o.mWw))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, o.mWw, boolean):void (m)] (LINE:15) call: o.mWt.<init>(boolean, o.mWw, boolean):void type: THIS */
    public /* synthetic */ C32296mWt(boolean z, C32299mWw c32299mWw, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : c32299mWw, (i & 4) != 0 ? false : z2);
    }
}
