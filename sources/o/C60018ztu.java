package o;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;

/* JADX INFO: renamed from: o.ztu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60018ztu {
    public static final Application OLrzqt = new Application(null);
    public boolean EZpvd;
    public final C60022zty KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ztu.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C60018ztu(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60022zty OLrzqt() {
        return this.KWHzl;
    }

    private C60018ztu() {
        this.KWHzl = new C60022zty();
        this.EZpvd = true;
    }

    public final C60018ztu OLrzqt(@NotNull C59991ztT c59991ztT) {
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        return KWHzl(C56402yEa.EZpvd(c59991ztT));
    }

    public final C60018ztu EZpvd(@NotNull C59991ztT... c59991ztTArr) {
        Intrinsics.checkNotNullParameter(c59991ztTArr, "");
        return KWHzl(yDV.AwvSrB(c59991ztTArr));
    }

    public final C60018ztu KWHzl(@NotNull java.util.List<C59991ztT> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC59987ztP abstractC59987ztPKWHzl = this.KWHzl.KWHzl();
        Level level = Level.INFO;
        if (!abstractC59987ztPKWHzl.copydefault(level)) {
            copydefault(list);
        } else {
            long jCopydefault = C60072zuv.OLrzqt.copydefault();
            copydefault(list);
            double dDoubleValue = ((java.lang.Number) new kotlin.Pair(Unit.INSTANCE, java.lang.Double.valueOf((r0.copydefault() - jCopydefault) / 1000000.0d)).getSecond()).doubleValue();
            int iCopydefault = this.KWHzl.OLrzqt().copydefault();
            this.KWHzl.KWHzl().EZpvd(level, "Started " + iCopydefault + " definitions in " + dDoubleValue + " ms");
        }
        return this;
    }

    public final void AEQbTJ() {
        this.KWHzl.AEQbTJ();
    }

    public final void copydefault(java.util.List<C59991ztT> list) {
        this.KWHzl.copydefault(list, this.EZpvd, false);
    }

    public final C60018ztu AEQbTJ(@NotNull AbstractC59987ztP abstractC59987ztP) {
        Intrinsics.checkNotNullParameter(abstractC59987ztP, "");
        this.KWHzl.copydefault(abstractC59987ztP);
        return this;
    }

    public static /* synthetic */ C60018ztu printLogger$default(C60018ztu c60018ztu, Level level, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            level = Level.INFO;
        }
        return c60018ztu.EZpvd(level);
    }

    public final C60018ztu EZpvd(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "");
        this.KWHzl.copydefault(C60071zuu.OLrzqt.OLrzqt(level));
        return this;
    }

    /* JADX INFO: renamed from: o.ztu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ztu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C60018ztu AEQbTJ() {
            return new C60018ztu(null);
        }
    }
}
