package o;

import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18118fcP {

    /* JADX INFO: renamed from: o.fcP$Activity */
    public static final class Activity implements InterfaceC18118fcP {
        public final java.util.List<DefiOnboardingTile> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fcP$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = activity.KWHzl;
            }
            return activity.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DefiOnboardingTile> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.util.List<? extends DefiOnboardingTile> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(list);
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
            return "Content(tiles=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull java.util.List<? extends DefiOnboardingTile> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }
    }

    /* JADX INFO: renamed from: o.fcP$Application */
    public static final class Application implements InterfaceC18118fcP {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }
}
