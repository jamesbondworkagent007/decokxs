package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface jOU {

    public static final class Application implements jOU {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    public static final class ActionBar implements jOU {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }

    public static final class TaskDescription implements jOU {
        public final jNU AEQbTJ;
        public final java.util.List<jNX> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jOU$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, jNU jnu, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jnu = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(jnu, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final jNU KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull jNU jnu, @NotNull java.util.List<jNX> list) {
            Intrinsics.checkNotNullParameter(jnu, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(jnu, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<jNX> copydefault() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(headerData=" + this.AEQbTJ + ", tokenList=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull jNU jnu, @NotNull java.util.List<jNX> list) {
            Intrinsics.checkNotNullParameter(jnu, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = jnu;
            this.EZpvd = list;
        }
    }
}
