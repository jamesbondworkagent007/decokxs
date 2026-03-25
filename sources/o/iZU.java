package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iZU {

    public static final class Application implements iZU {
        public static final Application EZpvd = new Application();

        private Application() {
        }
    }

    public static final class TaskDescription implements iZU {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    public static final class Activity implements iZU {
        public final iDV KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, iDV idv, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                idv = activity.KWHzl;
            }
            return activity.OLrzqt(idv);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final iDV OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull iDV idv) {
            Intrinsics.checkNotNullParameter(idv, "");
            return new Activity(idv);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(data=" + this.KWHzl + ")";
        }

        public Activity(@NotNull iDV idv) {
            Intrinsics.checkNotNullParameter(idv, "");
            this.KWHzl = idv;
        }
    }
}
