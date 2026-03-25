package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jNF {
    public static final int OLrzqt = C4147AzP.$stable;
    public final C4147AzP AEQbTJ;
    public final boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jNF() {
        this(false, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jNF copy$default(jNF jnf, boolean z, C4147AzP c4147AzP, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = jnf.copydefault;
        }
        if ((i & 2) != 0) {
            c4147AzP = jnf.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z2 = jnf.KWHzl;
        }
        return jnf.OLrzqt(z, c4147AzP, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jNF OLrzqt(boolean z, C4147AzP c4147AzP, boolean z2) {
        return new jNF(z, c4147AzP, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4147AzP copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jNF)) {
            return false;
        }
        jNF jnf = (jNF) obj;
        return this.copydefault == jnf.copydefault && Intrinsics.EZpvd(this.AEQbTJ, jnf.AEQbTJ) && this.KWHzl == jnf.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        C4147AzP c4147AzP = this.AEQbTJ;
        return (((iHashCode * 31) + (c4147AzP == null ? 0 : c4147AzP.hashCode())) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoinCheckUiState(isLoading=" + this.copydefault + ", coinRisk=" + this.AEQbTJ + ", isError=" + this.KWHzl + ")";
    }

    public jNF(boolean z, C4147AzP c4147AzP, boolean z2) {
        this.copydefault = z;
        this.AEQbTJ = c4147AzP;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:o.AzP:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.AzP) : (r3v0 o.AzP))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, o.AzP, boolean):void (m)] (LINE:15) call: o.jNF.<init>(boolean, o.AzP, boolean):void type: THIS */
    public /* synthetic */ jNF(boolean z, C4147AzP c4147AzP, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : c4147AzP, (i & 4) != 0 ? false : z2);
    }
}
