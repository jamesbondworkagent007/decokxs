package o;

import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jGv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC25800jGv {

    /* JADX INFO: renamed from: o.jGv$TaskDescription */
    public static final class TaskDescription implements InterfaceC25800jGv {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.jGv$Activity */
    public static final class Activity implements InterfaceC25800jGv {
        public static final Activity KWHzl = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.jGv$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC25800jGv {
        public static final int AEQbTJ = TokenInfoForAlert.EZpvd;
        public final boolean EZpvd;
        public final TokenInfoForAlert KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, TokenInfoForAlert tokenInfoForAlert, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tokenInfoForAlert = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.EZpvd;
            }
            return stateListAnimator.copydefault(tokenInfoForAlert, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenInfoForAlert copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull TokenInfoForAlert tokenInfoForAlert, boolean z) {
            Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
            return new StateListAnimator(tokenInfoForAlert, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(tokenInfoForAlert=" + this.KWHzl + ", isSupported=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull TokenInfoForAlert tokenInfoForAlert, boolean z) {
            Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
            this.KWHzl = tokenInfoForAlert;
            this.EZpvd = z;
        }
    }

    /* JADX INFO: renamed from: o.jGv$Application */
    public static final class Application implements InterfaceC25800jGv {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }
}
