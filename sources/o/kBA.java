package o;

import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.ui.VibesKolUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kBA {

    public static final class TaskDescription implements kBA {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements kBA {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar implements kBA {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application implements kBA {
        public final java.util.List<VibesKolUiModel> KWHzl;
        public final VibesSortType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kBA$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, VibesSortType vibesSortType, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                vibesSortType = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                list = application.KWHzl;
            }
            return application.OLrzqt(vibesSortType, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<VibesKolUiModel> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull VibesSortType vibesSortType, @NotNull java.util.List<VibesKolUiModel> list) {
            Intrinsics.checkNotNullParameter(vibesSortType, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(vibesSortType, list);
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
            return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(sortType=" + this.OLrzqt + ", vibesKolList=" + this.KWHzl + ")";
        }

        public Application(@NotNull VibesSortType vibesSortType, @NotNull java.util.List<VibesKolUiModel> list) {
            Intrinsics.checkNotNullParameter(vibesSortType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = vibesSortType;
            this.KWHzl = list;
        }
    }
}
