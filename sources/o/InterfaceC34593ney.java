package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ney, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC34593ney<T> {

    /* JADX INFO: renamed from: o.ney$Application */
    public static final class Application<T> implements InterfaceC34593ney<T> {
        public final T EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ney$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = application.EZpvd;
            }
            return application.AEQbTJ(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application<T> AEQbTJ(T t) {
            return new Application<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            T t = this.EZpvd;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(item=" + this.EZpvd + ")";
        }

        public Application(T t) {
            this.EZpvd = t;
        }
    }

    /* JADX INFO: renamed from: o.ney$TaskDescription */
    public static final class TaskDescription implements InterfaceC34593ney {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.ney$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC34593ney {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.ney$Activity */
    public static final class Activity implements InterfaceC34593ney {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.ney$ActionBar */
    public static final class ActionBar implements InterfaceC34593ney {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }
}
