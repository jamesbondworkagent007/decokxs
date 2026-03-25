package o;

import com.okinc.business.market.features.vibes.domain.VibesSortType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kBE {

    public static final class ActionBar implements kBE {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application implements kBE {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements kBE {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements kBE {
        public final VibesSortType EZpvd;
        public final java.util.List<kBC> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kBE$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, VibesSortType vibesSortType, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                vibesSortType = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                list = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(vibesSortType, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull VibesSortType vibesSortType, @NotNull java.util.List<kBC> list) {
            Intrinsics.checkNotNullParameter(vibesSortType, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(vibesSortType, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<kBC> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(sortType=" + this.EZpvd + ", vibesTreemapItems=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull VibesSortType vibesSortType, @NotNull java.util.List<kBC> list) {
            Intrinsics.checkNotNullParameter(vibesSortType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = vibesSortType;
            this.copydefault = list;
        }
    }
}
