package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.kqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29259kqK {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29259kqK() {
        this(false, false, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29259kqK copy$default(C29259kqK c29259kqK, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29259kqK.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c29259kqK.KWHzl;
        }
        if ((i & 4) != 0) {
            z3 = c29259kqK.AEQbTJ;
        }
        return c29259kqK.AEQbTJ(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29259kqK AEQbTJ(boolean z, boolean z2, boolean z3) {
        return new C29259kqK(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
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
        if (!(obj instanceof C29259kqK)) {
            return false;
        }
        C29259kqK c29259kqK = (C29259kqK) obj;
        return this.EZpvd == c29259kqK.EZpvd && this.KWHzl == c29259kqK.KWHzl && this.AEQbTJ == c29259kqK.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FieldValidationState(marketCapValid=" + this.EZpvd + ", volumeValid=" + this.KWHzl + ", tokenAgeValid=" + this.AEQbTJ + ")";
    }

    public C29259kqK(boolean z, boolean z2, boolean z3) {
        this.EZpvd = z;
        this.KWHzl = z2;
        this.AEQbTJ = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:58) call: o.kqK.<init>(boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C29259kqK(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
