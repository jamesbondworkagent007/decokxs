package o;

import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC10317bmF {

    /* JADX INFO: renamed from: o.bmF$ActionBar */
    public static final class ActionBar implements InterfaceC10317bmF {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.bmF$TaskDescription */
    public static final class TaskDescription implements InterfaceC10317bmF {
        public final java.lang.Throwable EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = taskDescription.EZpvd;
            }
            return taskDescription.AEQbTJ(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new TaskDescription(th);
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
            return "Error(e=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.EZpvd = th;
        }
    }

    /* JADX INFO: renamed from: o.bmF$Application */
    public static final class Application implements InterfaceC10317bmF {
        public final java.util.List<UtxoItem> EZpvd;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bmF$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = application.EZpvd;
            }
            if ((i2 & 2) != 0) {
                i = application.copydefault;
            }
            return application.copydefault(list, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<UtxoItem> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.util.List<UtxoItem> list, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list, i);
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
            return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(items=" + this.EZpvd + ", totalUtxoCount=" + this.copydefault + ")";
        }

        public Application(@NotNull java.util.List<UtxoItem> list, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            this.copydefault = i;
        }
    }
}
