package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8114awd {
    public Application OLrzqt;

    public final Application KWHzl() {
        Application application = this.OLrzqt;
        if (application == null) {
            Intrinsics.gEmmrt("");
        }
        return application;
    }

    public final void AEQbTJ(@NotNull Function1<? super Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application();
        function1.invoke(application);
        this.OLrzqt = application;
    }

    /* JADX INFO: renamed from: o.awd$Application */
    public final class Application {
        public yHO<? super java.lang.Boolean, ? super java.lang.String, ? super android.view.View, Unit> AEQbTJ;
        public Function0<Unit> EZpvd;
        public Function1<? super android.view.View, Unit> KWHzl;
        public Function1<? super android.view.View, Unit> OLrzqt;
        public Function2<? super android.view.View, ? super android.view.MotionEvent, Unit> copydefault;
        public Function1<? super android.view.View, Unit> djBIcL;
        public Function2<? super android.view.View, ? super android.view.MotionEvent, Unit> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super android.view.View, ? super android.view.MotionEvent, kotlin.Unit>, kotlin.jvm.functions.Function2<android.view.View, android.view.MotionEvent, kotlin.Unit> */
        public final Function2<android.view.View, android.view.MotionEvent, Unit> AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
        public final Function1<android.view.View, Unit> AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super android.view.View, ? super android.view.MotionEvent, kotlin.Unit>, kotlin.jvm.functions.Function2<android.view.View, android.view.MotionEvent, kotlin.Unit> */
        public final Function2<android.view.View, android.view.MotionEvent, Unit> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
        public final Function1<android.view.View, Unit> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.EZpvd = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super java.lang.Boolean, ? super java.lang.String, ? super android.view.View, kotlin.Unit>, o.yHO<java.lang.Boolean, java.lang.String, android.view.View, kotlin.Unit> */
        public final yHO<java.lang.Boolean, java.lang.String, android.view.View, Unit> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull yHO<? super java.lang.Boolean, ? super java.lang.String, ? super android.view.View, Unit> yho) {
            Intrinsics.checkNotNullParameter(yho, "");
            this.AEQbTJ = yho;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
        public final Function1<android.view.View, Unit> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }
    }
}
