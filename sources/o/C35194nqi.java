package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35194nqi {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.Integer AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final java.lang.Integer djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35194nqi copy$default(C35194nqi c35194nqi, int i, int i2, int i3, int i4, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = c35194nqi.KWHzl;
        }
        if ((i5 & 2) != 0) {
            i2 = c35194nqi.OLrzqt;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = c35194nqi.EZpvd;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = c35194nqi.copydefault;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            num = c35194nqi.AhwBna;
        }
        java.lang.Integer num4 = num;
        if ((i5 & 32) != 0) {
            num2 = c35194nqi.djBIcL;
        }
        java.lang.Integer num5 = num2;
        if ((i5 & 64) != 0) {
            num3 = c35194nqi.AEQbTJ;
        }
        return c35194nqi.EZpvd(i, i6, i7, i8, num4, num5, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35194nqi EZpvd(int i, int i2, int i3, int i4, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        return new C35194nqi(i, i2, i3, i4, num, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35194nqi)) {
            return false;
        }
        C35194nqi c35194nqi = (C35194nqi) obj;
        return this.KWHzl == c35194nqi.KWHzl && this.OLrzqt == c35194nqi.OLrzqt && this.EZpvd == c35194nqi.EZpvd && this.copydefault == c35194nqi.copydefault && Intrinsics.EZpvd(this.AhwBna, c35194nqi.AhwBna) && Intrinsics.EZpvd(this.djBIcL, c35194nqi.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, c35194nqi.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.KWHzl);
        int iHashCode2 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode3 = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode4 = java.lang.Integer.hashCode(this.copydefault);
        java.lang.Integer num = this.AhwBna;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.djBIcL;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        java.lang.Integer num3 = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ViewIdHolder(itemLayoutId=" + this.KWHzl + ", iconImage=" + this.OLrzqt + ", price=" + this.EZpvd + ", changePercent=" + this.copydefault + ", title=" + this.AhwBna + ", subTitle=" + this.djBIcL + ", klineImage=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer valueOf() {
        return this.djBIcL;
    }

    public C35194nqi(int i, int i2, int i3, int i4, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        this.KWHzl = i;
        this.OLrzqt = i2;
        this.EZpvd = i3;
        this.copydefault = i4;
        this.AhwBna = num;
        this.djBIcL = num2;
        this.AEQbTJ = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 int)
  (r13v0 int)
  (r14v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
 A[MD:(int, int, int, int, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:3) call: o.nqi.<init>(int, int, int, int, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ C35194nqi(int i, int i2, int i3, int i4, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? null : num2, (i5 & 64) != 0 ? null : num3);
    }
}
