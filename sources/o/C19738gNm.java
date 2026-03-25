package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.gNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19738gNm {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C19738gNm() {
        this(false, false, false, false, false, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C19738gNm copy$default(C19738gNm c19738gNm, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c19738gNm.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c19738gNm.OLrzqt;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = c19738gNm.copydefault;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = c19738gNm.gEmmrt;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = c19738gNm.KWHzl;
        }
        boolean z10 = z5;
        if ((i & 32) != 0) {
            z6 = c19738gNm.AEQbTJ;
        }
        return c19738gNm.EZpvd(z, z7, z8, z9, z10, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19738gNm EZpvd(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new C19738gNm(z, z2, z3, z4, z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
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
        if (!(obj instanceof C19738gNm)) {
            return false;
        }
        C19738gNm c19738gNm = (C19738gNm) obj;
        return this.EZpvd == c19738gNm.EZpvd && this.OLrzqt == c19738gNm.OLrzqt && this.copydefault == c19738gNm.copydefault && this.gEmmrt == c19738gNm.gEmmrt && this.KWHzl == c19738gNm.KWHzl && this.AEQbTJ == c19738gNm.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InputLimit(iconClick=" + this.EZpvd + ", inputCanEdit=" + this.OLrzqt + ", clickMax=" + this.copydefault + ", rateInputCanEdit=" + this.gEmmrt + ", rateCanEdit=" + this.KWHzl + ", iconLockVisible=" + this.AEQbTJ + ")";
    }

    public C19738gNm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.copydefault = z3;
        this.gEmmrt = z4;
        this.KWHzl = z5;
        this.AEQbTJ = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:135) call: o.gNm.<init>(boolean, boolean, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C19738gNm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6);
    }
}
