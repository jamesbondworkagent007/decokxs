package o;

import com.immomo.mls.fun.lt.SILoading;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28386kZm {

    /* JADX INFO: renamed from: o.kZm$Dialog */
    public static final class Dialog implements InterfaceC28386kZm {
        public static final Dialog AEQbTJ = new Dialog();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 687204261;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "None";
        }

        private Dialog() {
        }
    }

    /* JADX INFO: renamed from: o.kZm$Activity */
    public static final class Activity implements InterfaceC28386kZm {
        public static final Activity EZpvd = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 901068207;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.kZm$TaskDescription */
    public static final class TaskDescription implements InterfaceC28386kZm {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1524946302;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CollectionNeedConnectWallet";
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kZm$ActionBar */
    public static final class ActionBar implements InterfaceC28386kZm {
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.OLrzqt;
            }
            return actionBar.OLrzqt(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(boolean z) {
            return new ActionBar(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && this.OLrzqt == ((ActionBar) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Empty(isSearch=" + this.OLrzqt + ")";
        }

        public ActionBar(boolean z) {
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: renamed from: o.kZm$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28386kZm {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -179722437;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error";
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kZm$Application */
    public static final class Application implements InterfaceC28386kZm {
        public final java.util.List<java.lang.Object> KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kZm$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.KWHzl;
            }
            if ((i & 2) != 0) {
                z = application.copydefault;
            }
            return application.copydefault(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Object> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.util.List<? extends java.lang.Object> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(list=" + this.KWHzl + ", isSearch=" + this.copydefault + ")";
        }

        public Application(@NotNull java.util.List<? extends java.lang.Object> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.copydefault = z;
        }
    }
}
