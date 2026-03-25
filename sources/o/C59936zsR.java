package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;

/* JADX INFO: renamed from: o.zsR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C59936zsR extends AbstractC59987ztP {

    /* JADX INFO: renamed from: o.zsR$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[Level.DEBUG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Level.INFO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Level.WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[Level.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59936zsR() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59936zsR(@NotNull Level level) {
        super(level);
        Intrinsics.checkNotNullParameter(level, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:org.koin.core.logger.Level:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:org.koin.core.logger.Level:0x0004: SGET  A[WRAPPED] (LINE:29) org.koin.core.logger.Level.INFO org.koin.core.logger.Level) : (r1v0 org.koin.core.logger.Level))
 A[MD:(org.koin.core.logger.Level):void (m)] (LINE:29) call: o.zsR.<init>(org.koin.core.logger.Level):void type: THIS */
    public /* synthetic */ C59936zsR(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }

    @Override // o.AbstractC59987ztP
    public void EZpvd(@NotNull Level level, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = StateListAnimator.KWHzl[level.ordinal()];
    }
}
