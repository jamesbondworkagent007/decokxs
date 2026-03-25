package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28618keF {

    /* JADX INFO: renamed from: o.keF$TaskDescription */
    public static final class TaskDescription implements InterfaceC28618keF {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.keF$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28618keF {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.keF$Application */
    public static final class Application implements InterfaceC28618keF {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.keF$ActionBar */
    public static final class ActionBar implements InterfaceC28618keF {
        public final java.util.List<C28653keo> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.keF$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.KWHzl;
            }
            return actionBar.OLrzqt(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C28653keo> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.util.List<C28653keo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(items=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull java.util.List<C28653keo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }
    }
}
