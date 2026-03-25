package o;

import com.immomo.mls.fun.lt.SILoading;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ksE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29359ksE {

    /* JADX INFO: renamed from: o.ksE$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC29359ksE {
        public static final StateListAnimator copydefault = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2054884526;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.ksE$Activity */
    public static final class Activity implements InterfaceC29359ksE {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1018744326;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error";
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.ksE$Application */
    public static final class Application implements InterfaceC29359ksE {
        public final C29346krs OLrzqt;
        public final java.util.List<C29250kqB> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ksE$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, C29346krs c29346krs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.copydefault;
            }
            if ((i & 2) != 0) {
                c29346krs = application.OLrzqt;
            }
            return application.copydefault(list, c29346krs);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C29250kqB> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C29346krs OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.util.List<C29250kqB> list, @NotNull C29346krs c29346krs) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(c29346krs, "");
            return new Application(list, c29346krs);
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
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Loaded(trendingTokens=" + this.copydefault + ", filterUiState=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.util.List<C29250kqB> list, @NotNull C29346krs c29346krs) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(c29346krs, "");
            this.copydefault = list;
            this.OLrzqt = c29346krs;
        }
    }
}
