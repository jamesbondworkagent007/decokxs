package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.xrg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55848xrg {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final boolean OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55848xrg copy$default(C55848xrg c55848xrg, int i, int i2, int i3, int i4, boolean z, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = c55848xrg.EZpvd;
        }
        if ((i5 & 2) != 0) {
            i2 = c55848xrg.AEQbTJ;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = c55848xrg.copydefault;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = c55848xrg.KWHzl;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            z = c55848xrg.OLrzqt;
        }
        return c55848xrg.EZpvd(i, i6, i7, i8, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55848xrg EZpvd(int i, int i2, int i3, int i4, boolean z) {
        return new C55848xrg(i, i2, i3, i4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55848xrg)) {
            return false;
        }
        C55848xrg c55848xrg = (C55848xrg) obj;
        return this.EZpvd == c55848xrg.EZpvd && this.AEQbTJ == c55848xrg.AEQbTJ && this.copydefault == c55848xrg.copydefault && this.KWHzl == c55848xrg.KWHzl && this.OLrzqt == c55848xrg.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MpStgyCopyDividerData(divHeight=" + this.EZpvd + ", bgColor=" + this.AEQbTJ + ", horizontalMargin=" + this.copydefault + ", verticalMargin=" + this.KWHzl + ", showDividerLine=" + this.OLrzqt + ")";
    }

    public C55848xrg(int i, int i2, int i3, int i4, boolean z) {
        this.EZpvd = i;
        this.AEQbTJ = i2;
        this.copydefault = i3;
        this.KWHzl = i4;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(int, int, int, int, boolean):void (m)] (LINE:589) call: o.xrg.<init>(int, int, int, int, boolean):void type: THIS */
    public /* synthetic */ C55848xrg(int i, int i2, int i3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? false : z);
    }
}
