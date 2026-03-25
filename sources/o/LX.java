package o;

import com.amplitude.experiment.evaluation.Level;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LX implements LV {
    public final java.lang.String EZpvd;
    public final Level copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LX() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public LX(@NotNull Level level, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = level;
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.amplitude.experiment.evaluation.Level:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.amplitude.experiment.evaluation.Level:0x0004: SGET  A[WRAPPED] (LINE:30) com.amplitude.experiment.evaluation.Level.ERROR com.amplitude.experiment.evaluation.Level) : (r1v0 com.amplitude.experiment.evaluation.Level))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Experiment") : (r2v0 java.lang.String))
 A[MD:(com.amplitude.experiment.evaluation.Level, java.lang.String):void (m)] (LINE:29) call: o.LX.<init>(com.amplitude.experiment.evaluation.Level, java.lang.String):void type: THIS */
    public /* synthetic */ LX(Level level, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.ERROR : level, (i & 2) != 0 ? "Experiment" : str);
    }

    @Override // o.LV
    public void OLrzqt(@NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.copydefault.compareTo(Level.VERBOSE) <= 0) {
            java.lang.System.out.println((java.lang.Object) ("VERBOSE [" + this.EZpvd + "] " + function0.invoke()));
        }
    }

    @Override // o.LV
    public void KWHzl(@NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.copydefault.compareTo(Level.DEBUG) <= 0) {
            java.lang.System.out.println((java.lang.Object) ("DEBUG [" + this.EZpvd + "] " + function0.invoke()));
        }
    }
}
