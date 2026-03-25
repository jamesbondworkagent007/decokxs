package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25149irK {
    public java.lang.String AEQbTJ;
    public Function0<Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25149irK() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.irK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25149irK copy$default(C25149irK c25149irK, java.lang.String str, java.lang.String str2, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c25149irK.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c25149irK.copydefault;
        }
        if ((i & 4) != 0) {
            function0 = c25149irK.KWHzl;
        }
        if ((i & 8) != 0) {
            function02 = c25149irK.EZpvd;
        }
        return c25149irK.AEQbTJ(str, str2, function0, function02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25149irK AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25149irK(str, str2, function0, function02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25149irK)) {
            return false;
        }
        C25149irK c25149irK = (C25149irK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25149irK.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c25149irK.copydefault) && Intrinsics.EZpvd(this.KWHzl, c25149irK.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c25149irK.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        Function0<Unit> function0 = this.KWHzl;
        int iHashCode3 = function0 == null ? 0 : function0.hashCode();
        Function0<Unit> function02 = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function02 != null ? function02.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionNetWorkFeeInfoBean(title=" + this.AEQbTJ + ", value=" + this.copydefault + ", headerTitleUnderLineClick=" + this.KWHzl + ", rootClickCallback=" + this.EZpvd + ")";
    }

    public C25149irK(@NotNull java.lang.String str, @NotNull java.lang.String str2, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.KWHzl = function0;
        this.EZpvd = function02;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r4v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:60) call: o.irK.<init>(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C25149irK(java.lang.String str, java.lang.String str2, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function02);
    }
}
