package o;

import com.okinc.business.invest_biz.data.bean.HomeTab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26472jcv {

    /* JADX INFO: renamed from: o.jcv$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26472jcv {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jcv$ActionBar */
    public static final class ActionBar implements InterfaceC26472jcv {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jcv$TaskDescription */
    public static final class TaskDescription implements InterfaceC26472jcv {
        public final java.util.List<HomeTab> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jcv$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.EZpvd;
            }
            return taskDescription.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.util.List<HomeTab> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<HomeTab> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(list=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull java.util.List<HomeTab> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }
}
