package o;

import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jXb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC26239jXb {

    /* JADX INFO: renamed from: o.jXb$Activity */
    public static final class Activity implements InterfaceC26239jXb {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.jXb$Application */
    public static final class Application implements InterfaceC26239jXb {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jXb$TaskDescription */
    public static final class TaskDescription implements InterfaceC26239jXb {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.jXb$ActionBar */
    public static final class ActionBar implements InterfaceC26239jXb {
        public final java.util.List<CommonGroupUiModel> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jXb$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.EZpvd;
            }
            return actionBar.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<CommonGroupUiModel> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.util.List<CommonGroupUiModel> list) {
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
            return "Content(groups=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.util.List<CommonGroupUiModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }
}
