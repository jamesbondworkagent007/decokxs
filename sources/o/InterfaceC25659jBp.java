package o;

import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25659jBp {

    /* JADX INFO: renamed from: o.jBp$TaskDescription */
    public static final class TaskDescription implements InterfaceC25659jBp {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.jBp$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC25659jBp {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jBp$ActionBar */
    public static final class ActionBar implements InterfaceC25659jBp {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jBp$Application */
    public static final class Application implements InterfaceC25659jBp {
        public final java.util.List<CommonGroupUiModel> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jBp$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.EZpvd;
            }
            return application.EZpvd(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.util.List<CommonGroupUiModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<CommonGroupUiModel> OLrzqt() {
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
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(groups=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.util.List<CommonGroupUiModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }
}
