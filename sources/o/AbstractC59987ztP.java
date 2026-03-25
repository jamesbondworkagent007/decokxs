package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;

/* JADX INFO: renamed from: o.ztP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59987ztP {
    public Level copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC59987ztP() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public abstract void EZpvd(@NotNull Level level, @NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Level KWHzl() {
        return this.copydefault;
    }

    public AbstractC59987ztP(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "");
        this.copydefault = level;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:org.koin.core.logger.Level:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:org.koin.core.logger.Level:0x0004: SGET  A[WRAPPED] (LINE:23) org.koin.core.logger.Level.INFO org.koin.core.logger.Level) : (r1v0 org.koin.core.logger.Level))
 A[MD:(org.koin.core.logger.Level):void (m)] (LINE:23) call: o.ztP.<init>(org.koin.core.logger.Level):void type: THIS */
    public /* synthetic */ AbstractC59987ztP(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(Level.DEBUG, str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(Level.INFO, str);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(Level.WARNING, str);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(Level.ERROR, str);
    }

    public final boolean copydefault(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "");
        return this.copydefault.compareTo(level) <= 0;
    }

    public final void OLrzqt(@NotNull Level level, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (copydefault(level)) {
            EZpvd(level, str);
        }
    }

    public final void KWHzl(@NotNull Level level, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (copydefault(level)) {
            EZpvd(level, function0.invoke());
        }
    }
}
