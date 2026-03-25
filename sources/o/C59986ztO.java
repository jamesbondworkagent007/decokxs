package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;

/* JADX INFO: renamed from: o.ztO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C59986ztO extends AbstractC59987ztP {
    public final java.io.PrintStream AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59986ztO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59986ztO(@NotNull Level level) {
        super(level);
        Intrinsics.checkNotNullParameter(level, "");
        this.AEQbTJ = level.compareTo(Level.WARNING) >= 0 ? java.lang.System.err : java.lang.System.out;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:org.koin.core.logger.Level:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:org.koin.core.logger.Level:0x0004: SGET  A[WRAPPED] (LINE:22) org.koin.core.logger.Level.INFO org.koin.core.logger.Level) : (r1v0 org.koin.core.logger.Level))
 A[MD:(org.koin.core.logger.Level):void (m)] (LINE:22) call: o.ztO.<init>(org.koin.core.logger.Level):void type: THIS */
    public /* synthetic */ C59986ztO(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }

    @Override // o.AbstractC59987ztP
    public void EZpvd(@NotNull Level level, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.println(AbstractJsonLexerKt.BEGIN_LIST + level + "] [Koin] " + str);
    }
}
