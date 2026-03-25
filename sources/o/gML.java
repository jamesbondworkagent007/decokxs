package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class gML {
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final gMM EZpvd;
    public final Function0<Unit> KWHzl;
    public final java.lang.Integer OLrzqt;
    public final int copydefault;
    public final Function1<TeeWsToastData, gMN> gEmmrt;
    public final java.lang.Integer valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.gML */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ gML copy$default(gML gml, int i, java.lang.Integer num, java.util.Map map, Function1 function1, java.lang.Integer num2, gMM gmm, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = gml.copydefault;
        }
        if ((i2 & 2) != 0) {
            num = gml.valueOf;
        }
        java.lang.Integer num3 = num;
        if ((i2 & 4) != 0) {
            map = gml.AEQbTJ;
        }
        java.util.Map map2 = map;
        if ((i2 & 8) != 0) {
            function1 = gml.gEmmrt;
        }
        Function1 function12 = function1;
        if ((i2 & 16) != 0) {
            num2 = gml.OLrzqt;
        }
        java.lang.Integer num4 = num2;
        if ((i2 & 32) != 0) {
            gmm = gml.EZpvd;
        }
        gMM gmm2 = gmm;
        if ((i2 & 64) != 0) {
            function0 = gml.KWHzl;
        }
        return gml.EZpvd(i, num3, map2, function12, num4, gmm2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<TeeWsToastData, gMN> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gML EZpvd(int i, java.lang.Integer num, java.util.Map<java.lang.String, java.lang.String> map, Function1<? super TeeWsToastData, gMN> function1, java.lang.Integer num2, gMM gmm, Function0<Unit> function0) {
        return new gML(i, num, map, function1, num2, gmm, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gML)) {
            return false;
        }
        gML gml = (gML) obj;
        return this.copydefault == gml.copydefault && Intrinsics.EZpvd(this.valueOf, gml.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, gml.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, gml.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, gml.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, gml.EZpvd) && Intrinsics.EZpvd(this.KWHzl, gml.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.copydefault);
        java.lang.Integer num = this.valueOf;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.AEQbTJ;
        int iHashCode3 = map == null ? 0 : map.hashCode();
        Function1<TeeWsToastData, gMN> function1 = this.gEmmrt;
        int iHashCode4 = function1 == null ? 0 : function1.hashCode();
        java.lang.Integer num2 = this.OLrzqt;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        gMM gmm = this.EZpvd;
        int iHashCode6 = gmm == null ? 0 : gmm.hashCode();
        Function0<Unit> function0 = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ToastConfig(state=" + this.copydefault + ", titleRes=" + this.valueOf + ", titleParams=" + this.AEQbTJ + ", titleProvider=" + this.gEmmrt + ", iconRes=" + this.OLrzqt + ", primaryAction=" + this.EZpvd + ", displayAction=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData, o.gMN> */
    /* JADX WARN: Multi-variable type inference failed */
    public gML(int i, java.lang.Integer num, java.util.Map<java.lang.String, java.lang.String> map, Function1<? super TeeWsToastData, gMN> function1, java.lang.Integer num2, gMM gmm, Function0<Unit> function0) {
        this.copydefault = i;
        this.valueOf = num;
        this.AEQbTJ = map;
        this.gEmmrt = function1;
        this.OLrzqt = num2;
        this.EZpvd = gmm;
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r8v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r10v0 java.util.Map))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r11v0 kotlin.jvm.functions.Function1))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:o.gMM:?: TERNARY null = ((wrap:int:0x001d: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.gMM) : (r13v0 o.gMM))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0024: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
 A[MD:(int, java.lang.Integer, java.util.Map<java.lang.String, java.lang.String>, kotlin.jvm.functions.Function1<? super com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData, o.gMN>, java.lang.Integer, o.gMM, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:30) call: o.gML.<init>(int, java.lang.Integer, java.util.Map, kotlin.jvm.functions.Function1, java.lang.Integer, o.gMM, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ gML(int i, java.lang.Integer num, java.util.Map map, Function1 function1, java.lang.Integer num2, gMM gmm, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? null : function1, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : gmm, (i2 & 64) == 0 ? function0 : null);
    }
}
