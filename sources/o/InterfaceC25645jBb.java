package o;

/* JADX INFO: renamed from: o.jBb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25645jBb {
    public static final ActionBar Companion = ActionBar.KWHzl;

    /* JADX INFO: renamed from: o.jBb$Application */
    public static final class Application implements InterfaceC25645jBb {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jBb$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC25645jBb {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jBb$TaskDescription */
    public static final class TaskDescription implements InterfaceC25645jBb {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.jBb$Activity */
    public static final class Activity implements InterfaceC25645jBb {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.jBb$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }

        public final InterfaceC25645jBb EZpvd(java.lang.Integer num) {
            return (num != null && num.intValue() == 0) ? Activity.copydefault : (num != null && num.intValue() == 10070) ? Application.AEQbTJ : (num != null && num.intValue() == 10071) ? StateListAnimator.AEQbTJ : TaskDescription.AEQbTJ;
        }
    }
}
