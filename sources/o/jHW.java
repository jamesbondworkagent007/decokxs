package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class jHW {
    public final float AEQbTJ;
    public final boolean AYXKKw;
    public boolean AhwBna;
    public final int AkhnZx;
    public final int EZpvd;
    public final boolean KWHzl;
    public final float OLrzqt;
    public final boolean copydefault;
    public final float djBIcL;
    public final boolean fetchVPNInfo;
    public final java.lang.Integer gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jHW copydefault(int i, float f, float f2, float f3, java.lang.Integer num, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, boolean z6) {
        return new jHW(i, f, f2, f3, num, z, z2, z3, z4, i2, z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jHW)) {
            return false;
        }
        jHW jhw = (jHW) obj;
        return this.EZpvd == jhw.EZpvd && java.lang.Float.compare(this.djBIcL, jhw.djBIcL) == 0 && java.lang.Float.compare(this.AEQbTJ, jhw.AEQbTJ) == 0 && java.lang.Float.compare(this.OLrzqt, jhw.OLrzqt) == 0 && Intrinsics.EZpvd(this.gEmmrt, jhw.gEmmrt) && this.valueOf == jhw.valueOf && this.KWHzl == jhw.KWHzl && this.AYXKKw == jhw.AYXKKw && this.copydefault == jhw.copydefault && this.AkhnZx == jhw.AkhnZx && this.AhwBna == jhw.AhwBna && this.fetchVPNInfo == jhw.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Float.hashCode(this.djBIcL);
        int iHashCode3 = java.lang.Float.hashCode(this.AEQbTJ);
        int iHashCode4 = java.lang.Float.hashCode(this.OLrzqt);
        java.lang.Integer num = this.gEmmrt;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.AkhnZx)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChartDataSetConfig(color=" + this.EZpvd + ", lineWidth=" + this.djBIcL + ", circleRadius=" + this.AEQbTJ + ", circleHoleRadius=" + this.OLrzqt + ", fillColor=" + this.gEmmrt + ", enableFill=" + this.valueOf + ", enableCircles=" + this.KWHzl + ", enableValues=" + this.AYXKKw + ", enableDynamicColor=" + this.copydefault + ", targetPointIndex=" + this.AkhnZx + ", highlightEnable=" + this.AhwBna + ", showMaxMinValue=" + this.fetchVPNInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AYXKKw;
    }

    public jHW(int i, float f, float f2, float f3, java.lang.Integer num, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, boolean z6) {
        this.EZpvd = i;
        this.djBIcL = f;
        this.AEQbTJ = f2;
        this.OLrzqt = f3;
        this.gEmmrt = num;
        this.valueOf = z;
        this.KWHzl = z2;
        this.AYXKKw = z3;
        this.copydefault = z4;
        this.AkhnZx = i2;
        this.AhwBna = z5;
        this.fetchVPNInfo = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0073: CONSTRUCTOR 
  (r13v0 int)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (2.0f float) : (r14v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (4.0f float) : (r15v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0012: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (3.0f float) : (r16v0 float))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r25v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : false)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r21v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r22v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r25v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : true)
 A[MD:(int, float, float, float, java.lang.Integer, boolean, boolean, boolean, boolean, int, boolean, boolean):void (m)] (LINE:8) call: o.jHW.<init>(int, float, float, float, java.lang.Integer, boolean, boolean, boolean, boolean, int, boolean, boolean):void type: THIS */
    public /* synthetic */ jHW(int i, float f, float f2, float f3, java.lang.Integer num, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, boolean z6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 2.0f : f, (i3 & 4) != 0 ? 4.0f : f2, (i3 & 8) != 0 ? 3.0f : f3, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? true : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) == 0 ? z3 : false, (i3 & 256) != 0 ? true : z4, (i3 & 512) != 0 ? -1 : i2, (i3 & 1024) != 0 ? true : z5, (i3 & 2048) == 0 ? z6 : true);
    }
}
