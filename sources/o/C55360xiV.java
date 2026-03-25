package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xiV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55360xiV {
    public final boolean EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.Float OLrzqt;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55360xiV() {
        this(null, null, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55360xiV copy$default(C55360xiV c55360xiV, java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.Float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c55360xiV.copydefault;
        }
        if ((i & 2) != 0) {
            num2 = c55360xiV.KWHzl;
        }
        if ((i & 4) != 0) {
            z = c55360xiV.EZpvd;
        }
        if ((i & 8) != 0) {
            f = c55360xiV.OLrzqt;
        }
        return c55360xiV.KWHzl(num, num2, z, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55360xiV KWHzl(java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.Float f) {
        return new C55360xiV(num, num2, z, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55360xiV)) {
            return false;
        }
        C55360xiV c55360xiV = (C55360xiV) obj;
        return Intrinsics.EZpvd(this.copydefault, c55360xiV.copydefault) && Intrinsics.EZpvd(this.KWHzl, c55360xiV.KWHzl) && this.EZpvd == c55360xiV.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c55360xiV.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.copydefault;
        int iHashCode = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.KWHzl;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.Float f = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f != null ? f.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKSkeletonConfig(shimmerHeight=" + this.copydefault + ", shimmerWidth=" + this.KWHzl + ", isCircleImage=" + this.EZpvd + ", cornerRadius=" + this.OLrzqt + ")";
    }

    public C55360xiV(java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.Float f) {
        this.copydefault = num;
        this.KWHzl = num2;
        this.EZpvd = z;
        this.OLrzqt = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r5v0 java.lang.Float))
 A[MD:(java.lang.Integer, java.lang.Integer, boolean, java.lang.Float):void (m)] (LINE:41) call: o.xiV.<init>(java.lang.Integer, java.lang.Integer, boolean, java.lang.Float):void type: THIS */
    public /* synthetic */ C55360xiV(java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : f);
    }
}
