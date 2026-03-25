package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C52761wXj;

/* JADX INFO: loaded from: classes18.dex */
public final class jHX {
    public final boolean AEQbTJ;
    public final float AYXKKw;
    public final int AhwBna;
    public final float AkhnZx;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final float djBIcL;
    public final float gEmmrt;
    public final int isConnected;
    public final float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jHX() {
        this(false, false, false, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jHX EZpvd(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        return new jHX(z, z2, z3, i, i2, i3, i4, f, f2, f3, f4, f5);
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
    public final float copydefault() {
        return this.gEmmrt;
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
        if (!(obj instanceof jHX)) {
            return false;
        }
        jHX jhx = (jHX) obj;
        return this.EZpvd == jhx.EZpvd && this.AEQbTJ == jhx.AEQbTJ && this.KWHzl == jhx.KWHzl && this.AhwBna == jhx.AhwBna && this.copydefault == jhx.copydefault && this.isConnected == jhx.isConnected && this.OLrzqt == jhx.OLrzqt && java.lang.Float.compare(this.AYXKKw, jhx.AYXKKw) == 0 && java.lang.Float.compare(this.valueOf, jhx.valueOf) == 0 && java.lang.Float.compare(this.djBIcL, jhx.djBIcL) == 0 && java.lang.Float.compare(this.gEmmrt, jhx.gEmmrt) == 0 && java.lang.Float.compare(this.AkhnZx, jhx.AkhnZx) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.AhwBna)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.isConnected)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.AYXKKw)) * 31) + java.lang.Float.hashCode(this.valueOf)) * 31) + java.lang.Float.hashCode(this.djBIcL)) * 31) + java.lang.Float.hashCode(this.gEmmrt)) * 31) + java.lang.Float.hashCode(this.AkhnZx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChartConfig(enableTouch=" + this.EZpvd + ", enableDrag=" + this.AEQbTJ + ", enableScale=" + this.KWHzl + ", gridColor=" + this.AhwBna + ", borderColor=" + this.copydefault + ", textColor=" + this.isConnected + ", animationDuration=" + this.OLrzqt + ", extraLeftOffset=" + this.AYXKKw + ", extraRightOffset=" + this.valueOf + ", extraTopOffset=" + this.djBIcL + ", extraBottomOffset=" + this.gEmmrt + ", textSize=" + this.AkhnZx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float valueOf() {
        return this.valueOf;
    }

    public jHX(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.EZpvd = z;
        this.AEQbTJ = z2;
        this.KWHzl = z3;
        this.AhwBna = i;
        this.copydefault = i2;
        this.isConnected = i3;
        this.OLrzqt = i4;
        this.AYXKKw = f;
        this.valueOf = f2;
        this.djBIcL = f3;
        this.gEmmrt = f4;
        this.AkhnZx = f5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007e: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r14v0 boolean) : true)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: SGET  A[WRAPPED] o.wXj.Activity.zuBGHE int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: SGET  A[WRAPPED] o.wXj.Activity.zuBGHE int) : (r17v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] o.wXj.Activity.QwvEab int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0032: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (1000 int) : (r19v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x003b: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (8.0f float) : (r20v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0045: ARITH (r25v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 float) : (8.0f float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x004c: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (40.0f float) : (r22v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0055: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (30.0f float) : (r23v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x005e: ARITH (r25v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (10.0f float) : (r24v0 float))
 A[MD:(boolean, boolean, boolean, int, int, int, int, float, float, float, float, float):void (m)] (LINE:28) call: o.jHX.<init>(boolean, boolean, boolean, int, int, int, int, float, float, float, float, float):void type: THIS */
    public /* synthetic */ jHX(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? true : z, (i5 & 2) == 0 ? z2 : true, (i5 & 4) != 0 ? false : z3, (i5 & 8) != 0 ? C52761wXj.Activity.zuBGHE : i, (i5 & 16) != 0 ? C52761wXj.Activity.zuBGHE : i2, (i5 & 32) != 0 ? C52761wXj.Activity.QwvEab : i3, (i5 & 64) != 0 ? 1000 : i4, (i5 & 128) != 0 ? 8.0f : f, (i5 & 256) == 0 ? f2 : 8.0f, (i5 & 512) != 0 ? 40.0f : f3, (i5 & 1024) != 0 ? 30.0f : f4, (i5 & 2048) != 0 ? 10.0f : f5);
    }
}
