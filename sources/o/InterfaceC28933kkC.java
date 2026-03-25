package o;

import com.okinc.business.market.features.module.ui.detail.ModuleInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kkC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28933kkC {

    /* JADX INFO: renamed from: o.kkC$ActionBar */
    public static final class ActionBar implements InterfaceC28933kkC {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kkC$TaskDescription */
    public static final class TaskDescription implements InterfaceC28933kkC {
        public final ModuleInfo AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ModuleInfo moduleInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moduleInfo = taskDescription.AEQbTJ;
            }
            return taskDescription.KWHzl(moduleInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ModuleInfo EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull ModuleInfo moduleInfo) {
            Intrinsics.checkNotNullParameter(moduleInfo, "");
            return new TaskDescription(moduleInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Ready(moduleInfo=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull ModuleInfo moduleInfo) {
            Intrinsics.checkNotNullParameter(moduleInfo, "");
            this.AEQbTJ = moduleInfo;
        }
    }

    /* JADX INFO: renamed from: o.kkC$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements InterfaceC28933kkC {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }
}
