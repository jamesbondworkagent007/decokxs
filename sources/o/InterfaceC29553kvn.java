package o;

import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29553kvn {

    /* JADX INFO: renamed from: o.kvn$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC29553kvn {
        public final java.util.List<SignalGemsCardsUiModel> KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kvn$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.copydefault(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SignalGemsCardsUiModel> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.util.List<SignalGemsCardsUiModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list, z);
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
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(list=" + this.KWHzl + ", hasNoFilterResults=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull java.util.List<SignalGemsCardsUiModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: renamed from: o.kvn$Activity */
    public static final class Activity implements InterfaceC29553kvn {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.kvn$TaskDescription */
    public static final class TaskDescription implements InterfaceC29553kvn {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }
}
