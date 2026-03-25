package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class oLZ {
    public final java.lang.Integer EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.Double OLrzqt;
    public final java.lang.Double copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oLZ() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ oLZ copy$default(oLZ olz, java.lang.Double d, java.lang.Double d2, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = olz.copydefault;
        }
        if ((i & 2) != 0) {
            d2 = olz.OLrzqt;
        }
        if ((i & 4) != 0) {
            num = olz.EZpvd;
        }
        if ((i & 8) != 0) {
            num2 = olz.KWHzl;
        }
        return olz.EZpvd(d, d2, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oLZ EZpvd(java.lang.Double d, java.lang.Double d2, java.lang.Integer num, java.lang.Integer num2) {
        return new oLZ(d, d2, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oLZ)) {
            return false;
        }
        oLZ olz = (oLZ) obj;
        return Intrinsics.EZpvd(this.copydefault, olz.copydefault) && Intrinsics.EZpvd(this.OLrzqt, olz.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, olz.EZpvd) && Intrinsics.EZpvd(this.KWHzl, olz.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Double d = this.copydefault;
        int iHashCode = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.OLrzqt;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        java.lang.Integer num = this.EZpvd;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SupportResistanceVo(support=" + this.copydefault + ", resistance=" + this.OLrzqt + ", supportLineY=" + this.EZpvd + ", resistanceLineY=" + this.KWHzl + ")";
    }

    public oLZ(java.lang.Double d, java.lang.Double d2, java.lang.Integer num, java.lang.Integer num2) {
        this.copydefault = d;
        this.OLrzqt = d2;
        this.EZpvd = num;
        this.KWHzl = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r2v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r3v0 java.lang.Double))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Integer):void (m)] (LINE:69) call: o.oLZ.<init>(java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ oLZ(java.lang.Double d, java.lang.Double d2, java.lang.Integer num, java.lang.Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
