package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kbD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28457kbD {

    /* JADX INFO: renamed from: o.kbD$ActionBar */
    public static final class ActionBar implements InterfaceC28457kbD {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kbD$TaskDescription */
    public static final class TaskDescription implements InterfaceC28457kbD {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kbD$PendingIntent */
    public static final class PendingIntent implements InterfaceC28457kbD {
        public static final PendingIntent OLrzqt = new PendingIntent();

        private PendingIntent() {
        }
    }

    /* JADX INFO: renamed from: o.kbD$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28457kbD {
        public final C28456kbC AEQbTJ;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C28456kbC c28456kbC, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28456kbC = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(c28456kbC, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull C28456kbC c28456kbC, boolean z) {
            Intrinsics.checkNotNullParameter(c28456kbC, "");
            return new StateListAnimator(c28456kbC, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C28456kbC KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(homeFavoriteUiModel=" + this.AEQbTJ + ", isRefreshingData=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull C28456kbC c28456kbC, boolean z) {
            Intrinsics.checkNotNullParameter(c28456kbC, "");
            this.AEQbTJ = c28456kbC;
            this.KWHzl = z;
        }
    }

    /* JADX INFO: renamed from: o.kbD$Activity */
    public static final class Activity implements InterfaceC28457kbD {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.kbD$Application */
    public static final class Application implements InterfaceC28457kbD {
        public static final Application OLrzqt = new Application();

        private Application() {
        }
    }
}
