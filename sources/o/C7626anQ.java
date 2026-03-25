package o;

import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.anQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7626anQ {
    public final JDImageInfo EZpvd;
    public Function0<Unit> KWHzl;
    public final java.lang.String OLrzqt;
    public java.lang.Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.anQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C7626anQ copy$default(C7626anQ c7626anQ, JDImageInfo jDImageInfo, java.lang.String str, java.lang.Integer num, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jDImageInfo = c7626anQ.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c7626anQ.OLrzqt;
        }
        if ((i & 4) != 0) {
            num = c7626anQ.copydefault;
        }
        if ((i & 8) != 0) {
            function0 = c7626anQ.KWHzl;
        }
        return c7626anQ.KWHzl(jDImageInfo, str, num, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JDImageInfo KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7626anQ KWHzl(JDImageInfo jDImageInfo, @NotNull java.lang.String str, java.lang.Integer num, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C7626anQ(jDImageInfo, str, num, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7626anQ)) {
            return false;
        }
        C7626anQ c7626anQ = (C7626anQ) obj;
        return Intrinsics.EZpvd(this.EZpvd, c7626anQ.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c7626anQ.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c7626anQ.copydefault) && Intrinsics.EZpvd(this.KWHzl, c7626anQ.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        JDImageInfo jDImageInfo = this.EZpvd;
        int iHashCode = jDImageInfo == null ? 0 : jDImageInfo.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        java.lang.Integer num = this.copydefault;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Function0<Unit> function0 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKContextMenuItem(icon=" + this.EZpvd + ", text=" + this.OLrzqt + ", textColor=" + this.copydefault + ", onClickHandler=" + this.KWHzl + ")";
    }

    public C7626anQ(JDImageInfo jDImageInfo, @NotNull java.lang.String str, java.lang.Integer num, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = jDImageInfo;
        this.OLrzqt = str;
        this.copydefault = num;
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.immomo.mls.fun.ui.custom.data.JDImageInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.immomo.mls.fun.ui.custom.data.JDImageInfo) : (r2v0 com.immomo.mls.fun.ui.custom.data.JDImageInfo))
  (r3v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(com.immomo.mls.fun.ui.custom.data.JDImageInfo, java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:5) call: o.anQ.<init>(com.immomo.mls.fun.ui.custom.data.JDImageInfo, java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C7626anQ(JDImageInfo jDImageInfo, java.lang.String str, java.lang.Integer num, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jDImageInfo, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : function0);
    }
}
