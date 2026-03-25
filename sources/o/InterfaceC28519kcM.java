package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28519kcM {

    /* JADX INFO: renamed from: o.kcM$TaskDescription */
    public static final class TaskDescription implements InterfaceC28519kcM {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kcM$Activity */
    public static final class Activity implements InterfaceC28519kcM {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.kcM$Application */
    public static final class Application implements InterfaceC28519kcM {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kcM$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28519kcM {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kcM$ActionBar */
    public static final class ActionBar implements InterfaceC28519kcM {
        public final java.util.List<kMU> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kcM$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.EZpvd;
            }
            return actionBar.EZpvd(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<kMU> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.util.List<? extends kMU> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(items=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.kMU> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull java.util.List<? extends kMU> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }
}
