package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lSd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30270lSd {

    /* JADX INFO: renamed from: o.lSd$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements InterfaceC30270lSd {
        public final java.util.List<C30273lSg> AEQbTJ;
        public final boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lSd$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.util.List<C30273lSg> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C30273lSg> copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Loaded(items=" + this.AEQbTJ + ", isLoadingNextPage=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull java.util.List<C30273lSg> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
            this.EZpvd = z;
        }
    }

    /* JADX INFO: renamed from: o.lSd$Application */
    public static final class Application implements InterfaceC30270lSd {
        public static final Application EZpvd = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.lSd$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator implements InterfaceC30270lSd {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.lSd$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar implements InterfaceC30270lSd {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }
}
