package o;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28415kaO {

    /* JADX INFO: renamed from: o.kaO$Activity */
    public static final class Activity implements InterfaceC28415kaO {
        public static final Activity KWHzl = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.kaO$TaskDescription */
    public static final class TaskDescription implements InterfaceC28415kaO {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kaO$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28415kaO {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kaO$Application */
    public static final class Application implements InterfaceC28415kaO {
        public static final Application OLrzqt = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kaO$ActionBar */
    public static final class ActionBar implements InterfaceC28415kaO {
        public final java.util.List<CommonGroupData> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kaO$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.copydefault;
            }
            return actionBar.copydefault(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<CommonGroupData> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.util.List<CommonGroupData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.copydefault, ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Added(groups=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull java.util.List<CommonGroupData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }
    }

    /* JADX INFO: renamed from: o.kaO$LoaderManager */
    public static final class LoaderManager implements InterfaceC28415kaO {
        public static final LoaderManager OLrzqt = new LoaderManager();

        private LoaderManager() {
        }
    }

    /* JADX INFO: renamed from: o.kaO$Fragment */
    public static final class Fragment implements InterfaceC28415kaO {
        public final java.util.List<HomeToken> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kaO$Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = fragment.OLrzqt;
            }
            return fragment.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment AEQbTJ(@NotNull java.util.List<HomeToken> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Fragment(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && Intrinsics.EZpvd(this.OLrzqt, ((Fragment) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SavedChanges(tokens=" + this.OLrzqt + ")";
        }

        public Fragment(@NotNull java.util.List<HomeToken> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }
    }

    /* JADX INFO: renamed from: o.kaO$Dialog */
    public static final class Dialog implements InterfaceC28415kaO {
        public final java.util.List<HomeToken> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kaO$Dialog */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = dialog.EZpvd;
            }
            return dialog.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<HomeToken> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(@NotNull java.util.List<HomeToken> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Dialog(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd(this.EZpvd, ((Dialog) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowGroupSelection(tokens=" + this.EZpvd + ")";
        }

        public Dialog(@NotNull java.util.List<HomeToken> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }
}
