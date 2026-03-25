package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState$Companion$DEFAULT$1;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56778yRz {
    public final Function1<C56933yXs, ReportLevel> EZpvd;
    public final boolean KWHzl;
    public final C56776yRx OLrzqt;
    public static final Application copydefault = new Application(null);
    public static final C56778yRz AEQbTJ = new C56778yRz(C56769yRq.getDefaultJsr305Settings$default(null, 1, null), JavaTypeEnhancementState$Companion$DEFAULT$1.INSTANCE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C56933yXs, ReportLevel> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56776yRx copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.yXs, ? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56778yRz(@NotNull C56776yRx c56776yRx, @NotNull Function1<? super C56933yXs, ? extends ReportLevel> function1) {
        Intrinsics.checkNotNullParameter(c56776yRx, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = c56776yRx;
        this.EZpvd = function1;
        this.KWHzl = c56776yRx.KWHzl() || function1.invoke(C56769yRq.AEQbTJ()) == ReportLevel.IGNORE;
    }

    /* JADX INFO: renamed from: o.yRz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yRz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C56778yRz KWHzl() {
            return C56778yRz.AEQbTJ;
        }
    }

    public java.lang.String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.OLrzqt + ", getReportLevelForAnnotation=" + this.EZpvd + ')';
    }
}
