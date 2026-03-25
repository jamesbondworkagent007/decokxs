package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nPx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34059nPx {
    public final float AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final int AkhnZx;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final float djBIcL;
    public final java.lang.Float gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34059nPx KWHzl(float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, int i8, java.lang.Float f3) {
        return new C34059nPx(f, i, i2, i3, i4, f2, i5, i6, i7, i8, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34059nPx)) {
            return false;
        }
        C34059nPx c34059nPx = (C34059nPx) obj;
        return java.lang.Float.compare(this.djBIcL, c34059nPx.djBIcL) == 0 && this.AkhnZx == c34059nPx.AkhnZx && this.valueOf == c34059nPx.valueOf && this.AhwBna == c34059nPx.AhwBna && this.AYXKKw == c34059nPx.AYXKKw && java.lang.Float.compare(this.AEQbTJ, c34059nPx.AEQbTJ) == 0 && this.KWHzl == c34059nPx.KWHzl && this.copydefault == c34059nPx.copydefault && this.OLrzqt == c34059nPx.OLrzqt && this.EZpvd == c34059nPx.EZpvd && Intrinsics.EZpvd(this.gEmmrt, c34059nPx.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Float.hashCode(this.djBIcL);
        int iHashCode2 = java.lang.Integer.hashCode(this.AkhnZx);
        int iHashCode3 = java.lang.Integer.hashCode(this.valueOf);
        int iHashCode4 = java.lang.Integer.hashCode(this.AhwBna);
        int iHashCode5 = java.lang.Integer.hashCode(this.AYXKKw);
        int iHashCode6 = java.lang.Float.hashCode(this.AEQbTJ);
        int iHashCode7 = java.lang.Integer.hashCode(this.KWHzl);
        int iHashCode8 = java.lang.Integer.hashCode(this.copydefault);
        int iHashCode9 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode10 = java.lang.Integer.hashCode(this.EZpvd);
        java.lang.Float f = this.gEmmrt;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (f == null ? 0 : f.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AspectRatioConstraints(portraitBaseWidthRatio=" + this.djBIcL + ", portraitMinWidth=" + this.AkhnZx + ", portraitMaxWidth=" + this.valueOf + ", portraitMinHeight=" + this.AhwBna + ", portraitMaxHeight=" + this.AYXKKw + ", landscapeBaseWidthRatio=" + this.AEQbTJ + ", landscapeMinWidth=" + this.KWHzl + ", landscapeMaxWidth=" + this.copydefault + ", landscapeMinHeight=" + this.OLrzqt + ", landscapeMaxHeight=" + this.EZpvd + ", maxAspectRatio=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AYXKKw;
    }

    public C34059nPx(float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, int i8, java.lang.Float f3) {
        this.djBIcL = f;
        this.AkhnZx = i;
        this.valueOf = i2;
        this.AhwBna = i3;
        this.AYXKKw = i4;
        this.AEQbTJ = f2;
        this.KWHzl = i5;
        this.copydefault = i6;
        this.OLrzqt = i7;
        this.EZpvd = i8;
        this.gEmmrt = f3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0041: CONSTRUCTOR 
  (r15v0 float)
  (r16v0 int)
  (r17v0 int)
  (r18v0 int)
  (r19v0 int)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (r15v0 float) : (r20v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (r16v0 int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (r17v0 int) : (r22v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (r18v0 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (r19v0 int) : (r24v0 int))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x002e: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r25v0 java.lang.Float))
 A[MD:(float, int, int, int, int, float, int, int, int, int, java.lang.Float):void (m)] (LINE:3) call: o.nPx.<init>(float, int, int, int, int, float, int, int, int, int, java.lang.Float):void type: THIS */
    public /* synthetic */ C34059nPx(float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, int i8, java.lang.Float f3, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, i2, i3, i4, (i9 & 32) != 0 ? f : f2, (i9 & 64) != 0 ? i : i5, (i9 & 128) != 0 ? i2 : i6, (i9 & 256) != 0 ? i3 : i7, (i9 & 512) != 0 ? i4 : i8, (i9 & 1024) != 0 ? null : f3);
    }
}
