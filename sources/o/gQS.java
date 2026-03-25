package o;

import com.immomo.mls.fun.lt.SILoading;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface gQS {

    public static final class ActionBar implements gQS {
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1570325174;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private ActionBar() {
        }
    }

    public static final class TaskDescription implements gQS {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -2029303294;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error";
        }

        private TaskDescription() {
        }
    }

    public static final class Application implements gQS {
        public final java.util.List<C30765lhN> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gQS$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.EZpvd;
            }
            return application.OLrzqt(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C30765lhN> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.util.List<C30765lhN> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list);
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
            return "Content(dataList=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.util.List<C30765lhN> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }
}
