package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC35336ntR {

    /* JADX INFO: renamed from: o.ntR$SharedElementCallback */
    public static final class SharedElementCallback implements InterfaceC35336ntR {
        public static final SharedElementCallback EZpvd = new SharedElementCallback();

        private SharedElementCallback() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC35336ntR {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$Application */
    public static final class Application implements InterfaceC35336ntR {
        public static final Application OLrzqt = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$Dialog */
    public static final class Dialog implements InterfaceC35336ntR {
        public static final Dialog KWHzl = new Dialog();

        private Dialog() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$LoaderManager */
    public static final class LoaderManager implements InterfaceC35336ntR {
        public static final LoaderManager OLrzqt = new LoaderManager();

        private LoaderManager() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$Fragment */
    public static final class Fragment implements InterfaceC35336ntR {
        public static final Fragment KWHzl = new Fragment();

        private Fragment() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$PendingIntent */
    public static final class PendingIntent implements InterfaceC35336ntR {
        public static final PendingIntent copydefault = new PendingIntent();

        private PendingIntent() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$TaskStackBuilder */
    public static final class TaskStackBuilder implements InterfaceC35336ntR {
        public final java.lang.Throwable KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskStackBuilder copy$default(TaskStackBuilder taskStackBuilder, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = taskStackBuilder.KWHzl;
            }
            return taskStackBuilder.EZpvd(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskStackBuilder EZpvd(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new TaskStackBuilder(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskStackBuilder) && Intrinsics.EZpvd(this.KWHzl, ((TaskStackBuilder) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RequestCallFailure(throwable=" + this.KWHzl + ")";
        }

        public TaskStackBuilder(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl = th;
        }
    }

    /* JADX INFO: renamed from: o.ntR$FragmentManager */
    public static final class FragmentManager implements InterfaceC35336ntR {
        public static final FragmentManager OLrzqt = new FragmentManager();

        private FragmentManager() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$Activity */
    public static final class Activity implements InterfaceC35336ntR {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$TaskDescription */
    public static final class TaskDescription implements InterfaceC35336ntR {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.ntR$ActionBar */
    public static final class ActionBar implements InterfaceC35336ntR {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }
}
