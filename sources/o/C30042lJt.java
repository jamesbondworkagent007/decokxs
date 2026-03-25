package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.lJG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lJt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30042lJt {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final boolean EZpvd;
    public final lJG OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C30042lJt() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C30042lJt copy$default(C30042lJt c30042lJt, boolean z, lJG ljg, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c30042lJt.EZpvd;
        }
        if ((i & 2) != 0) {
            ljg = c30042lJt.OLrzqt;
        }
        return c30042lJt.copydefault(z, ljg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lJG EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30042lJt copydefault(boolean z, @NotNull lJG ljg) {
        Intrinsics.checkNotNullParameter(ljg, "");
        return new C30042lJt(z, ljg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30042lJt)) {
            return false;
        }
        C30042lJt c30042lJt = (C30042lJt) obj;
        return this.EZpvd == c30042lJt.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c30042lJt.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySellDexEnableUiState(isShowExternalLink=" + this.EZpvd + ", enableDexStatus=" + this.OLrzqt + ")";
    }

    public C30042lJt(boolean z, @NotNull lJG ljg) {
        Intrinsics.checkNotNullParameter(ljg, "");
        this.EZpvd = z;
        this.OLrzqt = ljg;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:o.lJG:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.lJG:0x0011: CONSTRUCTOR 
  (wrap:java.util.List:0x000b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED])
  ("")
 A[MD:(java.util.List<o.lJv>, java.lang.String):void (m), WRAPPED] (LINE:6) call: o.lJG.Application.<init>(java.util.List, java.lang.String):void type: CONSTRUCTOR) : (r2v0 o.lJG))
 A[MD:(boolean, o.lJG):void (m)] (LINE:3) call: o.lJt.<init>(boolean, o.lJG):void type: THIS */
    public /* synthetic */ C30042lJt(boolean z, lJG ljg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new lJG.Application(yDY.AhwBna(), "") : ljg);
    }

    /* JADX INFO: renamed from: o.lJt$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lJt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
