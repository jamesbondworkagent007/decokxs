package o;

import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29663kxr {

    /* JADX INFO: renamed from: o.kxr$TaskDescription */
    public static final class TaskDescription implements InterfaceC29663kxr {
    }

    /* JADX INFO: renamed from: o.kxr$ActionBar */
    public static final class ActionBar implements InterfaceC29663kxr {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kxr$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC29663kxr {
        public final SignalOverviewUiModel EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, SignalOverviewUiModel signalOverviewUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signalOverviewUiModel = stateListAnimator.EZpvd;
            }
            return stateListAnimator.KWHzl(signalOverviewUiModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignalOverviewUiModel EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull SignalOverviewUiModel signalOverviewUiModel) {
            Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
            return new StateListAnimator(signalOverviewUiModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(signalOverviewUiModel=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull SignalOverviewUiModel signalOverviewUiModel) {
            Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
            this.EZpvd = signalOverviewUiModel;
        }
    }
}
