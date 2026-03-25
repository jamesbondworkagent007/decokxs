package o;

import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jiV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26764jiV {

    /* JADX INFO: renamed from: o.jiV$Activity */
    public static final class Activity implements InterfaceC26764jiV {
        public final TransactionMethod KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, TransactionMethod transactionMethod, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transactionMethod = activity.KWHzl;
            }
            return activity.AEQbTJ(transactionMethod);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull TransactionMethod transactionMethod) {
            Intrinsics.checkNotNullParameter(transactionMethod, "");
            return new Activity(transactionMethod);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionMethod copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && this.KWHzl == ((Activity) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Switch(method=" + this.KWHzl + ")";
        }

        public Activity(@NotNull TransactionMethod transactionMethod) {
            Intrinsics.checkNotNullParameter(transactionMethod, "");
            this.KWHzl = transactionMethod;
        }
    }

    /* JADX INFO: renamed from: o.jiV$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26764jiV {
        public final ValidatorSelectionParams OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, ValidatorSelectionParams validatorSelectionParams, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validatorSelectionParams = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(validatorSelectionParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ValidatorSelectionParams EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull ValidatorSelectionParams validatorSelectionParams) {
            Intrinsics.checkNotNullParameter(validatorSelectionParams, "");
            return new StateListAnimator(validatorSelectionParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Validator(params=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull ValidatorSelectionParams validatorSelectionParams) {
            Intrinsics.checkNotNullParameter(validatorSelectionParams, "");
            this.OLrzqt = validatorSelectionParams;
        }
    }

    /* JADX INFO: renamed from: o.jiV$Application */
    public static final class Application implements InterfaceC26764jiV {
        public static final Application OLrzqt = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jiV$TaskDescription */
    public static final class TaskDescription implements InterfaceC26764jiV {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }
    }
}
