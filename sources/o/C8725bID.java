package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.bID, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8725bID {
    public final boolean EZpvd;
    public int KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8725bID() {
        this(false, false, false, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C8725bID copy$default(C8725bID c8725bID, boolean z, boolean z2, boolean z3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c8725bID.EZpvd;
        }
        if ((i2 & 2) != 0) {
            z2 = c8725bID.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            z3 = c8725bID.copydefault;
        }
        if ((i2 & 8) != 0) {
            i = c8725bID.KWHzl;
        }
        return c8725bID.EZpvd(z, z2, z3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8725bID EZpvd(boolean z, boolean z2, boolean z3, int i) {
        return new C8725bID(z, z2, z3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8725bID)) {
            return false;
        }
        C8725bID c8725bID = (C8725bID) obj;
        return this.EZpvd == c8725bID.EZpvd && this.OLrzqt == c8725bID.OLrzqt && this.copydefault == c8725bID.copydefault && this.KWHzl == c8725bID.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RefreshUTXOVenue(isChangedAmtOrAddress=" + this.EZpvd + ", isLoop=" + this.OLrzqt + ", isSubmit=" + this.copydefault + ", count=" + this.KWHzl + ")";
    }

    public C8725bID(boolean z, boolean z2, boolean z3, int i) {
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.copydefault = z3;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
 A[MD:(boolean, boolean, boolean, int):void (m)] (LINE:22) call: o.bID.<init>(boolean, boolean, boolean, int):void type: THIS */
    public /* synthetic */ C8725bID(boolean z, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 1 : i);
    }
}
