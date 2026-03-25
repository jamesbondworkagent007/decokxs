package o;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yOE {
    public static final Fragment AEQbTJ;
    public static final yOE OLrzqt = new yOE();
    public static final java.util.Map<yOD, java.lang.Integer> copydefault;

    public static final class StateListAnimator extends yOD {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super("private", false);
        }
    }

    private yOE() {
    }

    public static final class PendingIntent extends yOD {
        public static final PendingIntent copydefault = new PendingIntent();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yOD
        public java.lang.String copydefault() {
            return "private/*private to this*/";
        }

        private PendingIntent() {
            super("private_to_this", false);
        }
    }

    public static final class LoaderManager extends yOD {
        public static final LoaderManager AEQbTJ = new LoaderManager();

        private LoaderManager() {
            super("protected", true);
        }
    }

    public static final class Application extends yOD {
        public static final Application KWHzl = new Application();

        private Application() {
            super("internal", false);
        }
    }

    public static final class Fragment extends yOD {
        public static final Fragment OLrzqt = new Fragment();

        private Fragment() {
            super("public", true);
        }
    }

    public static final class ActionBar extends yOD {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super(ImagesContract.LOCAL, false);
        }
    }

    public static final class Activity extends yOD {
        public static final Activity EZpvd = new Activity();

        private Activity() {
            super("inherited", false);
        }
    }

    public static final class TaskDescription extends yOD {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
            super("invisible_fake", false);
        }
    }

    public static final class Dialog extends yOD {
        public static final Dialog OLrzqt = new Dialog();

        private Dialog() {
            super("unknown", false);
        }
    }

    static {
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        mapOLrzqt.put(PendingIntent.copydefault, 0);
        mapOLrzqt.put(StateListAnimator.OLrzqt, 0);
        mapOLrzqt.put(Application.KWHzl, 1);
        mapOLrzqt.put(LoaderManager.AEQbTJ, 1);
        Fragment fragment = Fragment.OLrzqt;
        mapOLrzqt.put(fragment, 2);
        copydefault = C56423yEv.AYXKKw(mapOLrzqt);
        AEQbTJ = fragment;
    }

    public final java.lang.Integer KWHzl(@NotNull yOD yod, @NotNull yOD yod2) {
        Intrinsics.checkNotNullParameter(yod, "");
        Intrinsics.checkNotNullParameter(yod2, "");
        if (yod == yod2) {
            return 0;
        }
        java.util.Map<yOD, java.lang.Integer> map = copydefault;
        java.lang.Integer num = map.get(yod);
        java.lang.Integer num2 = map.get(yod2);
        if (num == null || num2 == null || Intrinsics.EZpvd(num, num2)) {
            return null;
        }
        return java.lang.Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean AEQbTJ(@NotNull yOD yod) {
        Intrinsics.checkNotNullParameter(yod, "");
        return yod == StateListAnimator.OLrzqt || yod == PendingIntent.copydefault;
    }
}
