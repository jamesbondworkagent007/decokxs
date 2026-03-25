package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.bbd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9758bbd {
    public java.lang.String AEQbTJ;
    public C9701baZ EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C9758bbd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C9758bbd copy$default(C9758bbd c9758bbd, java.lang.String str, C9701baZ c9701baZ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c9758bbd.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c9701baZ = c9758bbd.EZpvd;
        }
        return c9758bbd.OLrzqt(str, c9701baZ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9701baZ OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9758bbd OLrzqt(java.lang.String str, C9701baZ c9701baZ) {
        return new C9758bbd(str, c9701baZ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9758bbd)) {
            return false;
        }
        C9758bbd c9758bbd = (C9758bbd) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c9758bbd.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c9758bbd.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        C9701baZ c9701baZ = this.EZpvd;
        return (iHashCode * 31) + (c9701baZ != null ? c9701baZ.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DappSignExtInfo(risk=" + this.AEQbTJ + ", approveInfo=" + this.EZpvd + ")";
    }

    public C9758bbd(java.lang.String str, C9701baZ c9701baZ) {
        this.AEQbTJ = str;
        this.EZpvd = c9701baZ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:o.baZ:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.baZ) : (r3v0 o.baZ))
 A[MD:(java.lang.String, o.baZ):void (m)] (LINE:372) call: o.bbd.<init>(java.lang.String, o.baZ):void type: THIS */
    public /* synthetic */ C9758bbd(java.lang.String str, C9701baZ c9701baZ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : c9701baZ);
    }

    public final boolean KWHzl() {
        return "high".equals(this.AEQbTJ) || "middle".equals(this.AEQbTJ);
    }

    public final boolean EZpvd() {
        return "high".equals(this.AEQbTJ);
    }
}
