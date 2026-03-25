package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lSr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30284lSr {

    /* JADX INFO: renamed from: o.lSr$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements InterfaceC30284lSr {
        public final java.util.List<mHM> KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lSr$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                z = activity.OLrzqt;
            }
            return activity.OLrzqt(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<mHM> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.util.List<mHM> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Loaded(placedOrders=" + this.KWHzl + ", isLoadingNextPage=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull java.util.List<mHM> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: renamed from: o.lSr$TaskDescription */
    public static final class TaskDescription implements InterfaceC30284lSr {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.lSr$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application implements InterfaceC30284lSr {
        public static final Application EZpvd = new Application();

        private Application() {
        }
    }
}
