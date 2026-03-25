package o;

import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface hHS {

    public static final class Application implements hHS {
        public static final Application EZpvd = new Application();

        private Application() {
        }
    }

    public static final class Activity implements hHS {
        public final java.util.List<SwapBridgeDAppInfo> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hHS$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = activity.KWHzl;
            }
            return activity.OLrzqt(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.util.List<SwapBridgeDAppInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SwapBridgeDAppInfo> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DAppList(swapBridgeDAppList=" + this.KWHzl + ")";
        }

        public Activity(@NotNull java.util.List<SwapBridgeDAppInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }
    }

    public static final class TaskDescription implements hHS {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }

    public static final class ActionBar implements hHS {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
        }
    }

    public static final class StateListAnimator implements hHS {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}
