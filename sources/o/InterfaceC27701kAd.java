package o;

import com.okinc.business.market.features.trader.domain.model.Traders;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kAd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC27701kAd {

    /* JADX INFO: renamed from: o.kAd$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC27701kAd {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kAd$ActionBar */
    public static final class ActionBar implements InterfaceC27701kAd {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kAd$Application */
    public static final class Application implements InterfaceC27701kAd {
        public final java.util.List<Traders> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kAd$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.KWHzl;
            }
            return application.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Traders> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.util.List<Traders> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.KWHzl, ((Application) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(list=" + this.KWHzl + ")";
        }

        public Application(@NotNull java.util.List<Traders> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }
    }

    /* JADX INFO: renamed from: o.kAd$TaskDescription */
    public static final class TaskDescription implements InterfaceC27701kAd {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kAd$Activity */
    public static final class Activity implements InterfaceC27701kAd {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }
    }
}
