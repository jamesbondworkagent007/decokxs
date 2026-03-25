package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25647jBd {
    public static final TaskDescription Companion = TaskDescription.copydefault;

    /* JADX INFO: renamed from: o.jBd$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC25647jBd {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jBd$Activity */
    public static final class Activity implements InterfaceC25647jBd {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.jBd$Application */
    public static final class Application implements InterfaceC25647jBd {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jBd$ActionBar */
    public static final class ActionBar implements InterfaceC25647jBd {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jBd$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC25647jBd copydefault(java.lang.Integer num) {
            return (num != null && num.intValue() == 0) ? ActionBar.KWHzl : (num != null && num.intValue() == 10063) ? StateListAnimator.AEQbTJ : (num != null && num.intValue() == 10066) ? Activity.OLrzqt : Application.AEQbTJ;
        }

        public final java.lang.Integer KWHzl(@NotNull InterfaceC25647jBd interfaceC25647jBd) {
            Intrinsics.checkNotNullParameter(interfaceC25647jBd, "");
            if (interfaceC25647jBd instanceof StateListAnimator) {
                return java.lang.Integer.valueOf(C23274hvD.Fragment.ZAwExL);
            }
            if (interfaceC25647jBd instanceof Activity) {
                return java.lang.Integer.valueOf(C23274hvD.Fragment.getInterfaceDescriptor);
            }
            if (interfaceC25647jBd instanceof Application) {
                return java.lang.Integer.valueOf(C23274hvD.Fragment.RbMRq);
            }
            if (interfaceC25647jBd instanceof ActionBar) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
