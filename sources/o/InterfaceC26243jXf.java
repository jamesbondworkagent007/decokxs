package o;

import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jXf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC26243jXf {
    public static final Activity Companion = Activity.KWHzl;

    /* JADX INFO: renamed from: o.jXf$Dialog */
    public static final class Dialog implements InterfaceC26243jXf {
        public static final Dialog AEQbTJ = new Dialog();

        private Dialog() {
        }
    }

    /* JADX INFO: renamed from: o.jXf$Application */
    public static final class Application implements InterfaceC26243jXf {
        public static final Application EZpvd = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jXf$ActionBar */
    public static final class ActionBar implements InterfaceC26243jXf {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jXf$TaskDescription */
    public static final class TaskDescription implements InterfaceC26243jXf {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.jXf$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26243jXf {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jXf$PendingIntent */
    public static final class PendingIntent implements InterfaceC26243jXf {
        public static final PendingIntent copydefault = new PendingIntent();

        private PendingIntent() {
        }
    }

    /* JADX INFO: renamed from: o.jXf$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity KWHzl = new Activity();

        private Activity() {
        }

        public final int KWHzl(@NotNull InterfaceC26243jXf interfaceC26243jXf) {
            Intrinsics.checkNotNullParameter(interfaceC26243jXf, "");
            return Intrinsics.EZpvd(interfaceC26243jXf, TaskDescription.OLrzqt) ? C23274hvD.Fragment.getDefaultCipherSuites : Intrinsics.EZpvd(interfaceC26243jXf, ActionBar.copydefault) ? C23274hvD.Fragment.zqaRxl : Intrinsics.EZpvd(interfaceC26243jXf, StateListAnimator.KWHzl) ? C23274hvD.Fragment.getSupportedCipherSuites : C23274hvD.Fragment.heceqZ;
        }
    }
}
