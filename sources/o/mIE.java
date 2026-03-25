package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mIE {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public final Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public mIE() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.mIE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ mIE copy$default(mIE mie, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = mie.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = mie.KWHzl;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = mie.EZpvd;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = mie.AEQbTJ;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            function0 = mie.copydefault;
        }
        return mie.EZpvd(num, str4, str5, str6, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mIE EZpvd(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0<Unit> function0) {
        return new mIE(num, str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mIE)) {
            return false;
        }
        mIE mie = (mIE) obj;
        return Intrinsics.EZpvd(this.OLrzqt, mie.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) mie.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) mie.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) mie.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, mie.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.OLrzqt;
        int iHashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Function0<Unit> function0 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CommonEmptyViewParams(type=" + this.OLrzqt + ", title=" + this.KWHzl + ", subtitle=" + this.EZpvd + ", retryText=" + this.AEQbTJ + ", onRetry=" + this.copydefault + ")";
    }

    public mIE(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0<Unit> function0) {
        this.OLrzqt = num;
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r9v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:3) call: o.mIE.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ mIE(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : function0);
    }
}
