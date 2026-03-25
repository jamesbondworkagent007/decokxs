package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC30234lQv {

    /* JADX INFO: renamed from: o.lQv$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar implements InterfaceC30234lQv {
        public final lQE KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, lQE lqe, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                lqe = actionBar.KWHzl;
            }
            return actionBar.OLrzqt(lqe);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final lQE OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull lQE lqe) {
            Intrinsics.checkNotNullParameter(lqe, "");
            return new ActionBar(lqe);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Loaded(uiModel=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull lQE lqe) {
            Intrinsics.checkNotNullParameter(lqe, "");
            this.KWHzl = lqe;
        }
    }

    /* JADX INFO: renamed from: o.lQv$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements InterfaceC30234lQv {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.lQv$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity implements InterfaceC30234lQv {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
        }
    }
}
