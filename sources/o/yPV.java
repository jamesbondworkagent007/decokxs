package o;

import kotlin.jvm.internal.Intrinsics;
import o.yOE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yPV {
    public static final yPV EZpvd = new yPV();

    public static final class Application extends yOD {
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yOD
        public java.lang.String copydefault() {
            return "public/*package*/";
        }

        private Application() {
            super("package", false);
        }

        @Override // o.yOD
        public java.lang.Integer OLrzqt(@NotNull yOD yod) {
            Intrinsics.checkNotNullParameter(yod, "");
            if (this == yod) {
                return 0;
            }
            return yOE.OLrzqt.AEQbTJ(yod) ? 1 : -1;
        }

        @Override // o.yOD
        public yOD KWHzl() {
            return yOE.LoaderManager.AEQbTJ;
        }
    }

    private yPV() {
    }

    public static final class Activity extends yOD {
        public static final Activity AEQbTJ = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yOD
        public java.lang.String copydefault() {
            return "protected/*protected static*/";
        }

        private Activity() {
            super("protected_static", true);
        }

        @Override // o.yOD
        public yOD KWHzl() {
            return yOE.LoaderManager.AEQbTJ;
        }
    }

    public static final class TaskDescription extends yOD {
        public static final TaskDescription KWHzl = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yOD
        public java.lang.String copydefault() {
            return "protected/*protected and package*/";
        }

        private TaskDescription() {
            super("protected_and_package", true);
        }

        @Override // o.yOD
        public java.lang.Integer OLrzqt(@NotNull yOD yod) {
            Intrinsics.checkNotNullParameter(yod, "");
            if (Intrinsics.EZpvd(this, yod)) {
                return 0;
            }
            if (yod == yOE.Application.KWHzl) {
                return null;
            }
            return java.lang.Integer.valueOf(yOE.OLrzqt.AEQbTJ(yod) ? 1 : -1);
        }

        @Override // o.yOD
        public yOD KWHzl() {
            return yOE.LoaderManager.AEQbTJ;
        }
    }
}
