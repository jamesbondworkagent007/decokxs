package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface kLL<T> {

    public static final class Activity<T> implements kLL<T> {
        public final T AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kLL$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = activity.AEQbTJ;
            }
            return activity.OLrzqt(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity<T> OLrzqt(T t) {
            return new Activity<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            T t = this.AEQbTJ;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(item=" + this.AEQbTJ + ")";
        }

        public Activity(T t) {
            this.AEQbTJ = t;
        }
    }

    public static final class FragmentManager implements kLL {
        public static final FragmentManager EZpvd = new FragmentManager();

        private FragmentManager() {
        }
    }

    public static final class Application implements kLL {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    public static final class StateListAnimator implements kLL {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    public static final class ActionBar implements kLL {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    public static final class TaskDescription implements kLL {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }
}
