package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC25657jBn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface jAC {
    public static final Application Companion = Application.AEQbTJ;

    public static final class StateListAnimator implements jAC {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    public static final class TaskDescription implements jAC {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    public static final class Activity implements jAC {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    public static final class ActionBar implements jAC {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    public static final class Application {
        public static final /* synthetic */ Application AEQbTJ = new Application();

        private Application() {
        }

        public final jAC KWHzl(java.lang.Integer num) {
            return (num != null && num.intValue() == 0) ? ActionBar.copydefault : (num != null && num.intValue() == 10062) ? StateListAnimator.OLrzqt : (num != null && num.intValue() == 10066) ? Activity.EZpvd : TaskDescription.EZpvd;
        }

        public final int OLrzqt(@NotNull jAC jac, @NotNull InterfaceC25657jBn interfaceC25657jBn) {
            Intrinsics.checkNotNullParameter(jac, "");
            Intrinsics.checkNotNullParameter(interfaceC25657jBn, "");
            if (jac instanceof StateListAnimator) {
                return C23274hvD.Fragment.mayLaunchUrl;
            }
            if (jac instanceof Activity) {
                return C23274hvD.Fragment.getInterfaceDescriptor;
            }
            if (jac instanceof TaskDescription) {
                return C23274hvD.Fragment.RbMRq;
            }
            if (!(jac instanceof ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.EZpvd(interfaceC25657jBn, InterfaceC25657jBn.ActionBar.copydefault)) {
                return C23274hvD.Fragment.asBinder;
            }
            if (Intrinsics.EZpvd(interfaceC25657jBn, InterfaceC25657jBn.Application.EZpvd)) {
                return C23274hvD.Fragment.onTransact;
            }
            if (Intrinsics.EZpvd(interfaceC25657jBn, InterfaceC25657jBn.StateListAnimator.KWHzl)) {
                return C23274hvD.Fragment.extraCommand;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
