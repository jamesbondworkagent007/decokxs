package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class oXS {
    public final int AEQbTJ;
    public final int AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final int djBIcL;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oXS OLrzqt(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, @androidx.annotation.ColorInt int i4, @androidx.annotation.ColorInt int i5, @androidx.annotation.ColorInt int i6, int i7, int i8) {
        return new oXS(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oXS)) {
            return false;
        }
        oXS oxs = (oXS) obj;
        return this.KWHzl == oxs.KWHzl && this.EZpvd == oxs.EZpvd && this.AEQbTJ == oxs.AEQbTJ && this.copydefault == oxs.copydefault && this.valueOf == oxs.valueOf && this.OLrzqt == oxs.OLrzqt && this.djBIcL == oxs.djBIcL && this.AhwBna == oxs.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.djBIcL)) * 31) + java.lang.Integer.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DrawOption(bgLineColor=" + this.KWHzl + ", bgBoxColor=" + this.EZpvd + ", boxColor=" + this.AEQbTJ + ", boxHighLightColor=" + this.copydefault + ", shadowColor=" + this.valueOf + ", boxMaskColor=" + this.OLrzqt + ", boxbgAlpha=" + this.djBIcL + ", linebgAlpha=" + this.AhwBna + ")";
    }

    public oXS(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, @androidx.annotation.ColorInt int i4, @androidx.annotation.ColorInt int i5, @androidx.annotation.ColorInt int i6, int i7, int i8) {
        this.KWHzl = i;
        this.EZpvd = i2;
        this.AEQbTJ = i3;
        this.copydefault = i4;
        this.valueOf = i5;
        this.OLrzqt = i6;
        this.djBIcL = i7;
        this.AhwBna = i8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r13v0 int)
  (r14v0 int)
  (r15v0 int)
  (r16v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (61 int) : (r19v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (61 int) : (r20v0 int))
 A[MD:(int, int, int, int, int, int, int, int):void (m)] (LINE:286) call: o.oXS.<init>(int, int, int, int, int, int, int, int):void type: THIS */
    public /* synthetic */ oXS(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i9 & 16) != 0 ? 0 : i5, (i9 & 32) != 0 ? 0 : i6, (i9 & 64) != 0 ? 61 : i7, (i9 & 128) != 0 ? 61 : i8);
    }
}
