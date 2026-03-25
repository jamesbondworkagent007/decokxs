package o;

import com.okinc.business.web3pay.lib.core.model.TransactionAlertType;
import com.okinc.business.web3pay.lib.features.account.data.model.CreateSmartAccountResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC31280lqz {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lqz.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC31280lqz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.lqz$Fragment */
    public static final class Fragment extends AbstractC31280lqz {
        public final CreateSmartAccountResponse EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, CreateSmartAccountResponse createSmartAccountResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createSmartAccountResponse = fragment.EZpvd;
            }
            return fragment.AEQbTJ(createSmartAccountResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment AEQbTJ(@NotNull CreateSmartAccountResponse createSmartAccountResponse) {
            Intrinsics.checkNotNullParameter(createSmartAccountResponse, "");
            return new Fragment(createSmartAccountResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && Intrinsics.EZpvd(this.EZpvd, ((Fragment) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(createSmartAccountResponse=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull CreateSmartAccountResponse createSmartAccountResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(createSmartAccountResponse, "");
            this.EZpvd = createSmartAccountResponse;
        }
    }

    private AbstractC31280lqz() {
    }

    /* JADX INFO: renamed from: o.lqz$ActionBar */
    public static final class ActionBar extends AbstractC31280lqz {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.lqz$Application */
    public static final class Application extends AbstractC31280lqz {
        public static final Application AEQbTJ = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.lqz$Activity */
    public static final class Activity extends AbstractC31280lqz {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.lqz$TaskDescription */
    public static final class TaskDescription extends AbstractC31280lqz {
        public final TransactionAlertType KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, TransactionAlertType transactionAlertType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transactionAlertType = taskDescription.KWHzl;
            }
            return taskDescription.EZpvd(transactionAlertType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull TransactionAlertType transactionAlertType) {
            Intrinsics.checkNotNullParameter(transactionAlertType, "");
            return new TaskDescription(transactionAlertType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.KWHzl == ((TaskDescription) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RiskError(errorType=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull TransactionAlertType transactionAlertType) {
            super(null);
            Intrinsics.checkNotNullParameter(transactionAlertType, "");
            this.KWHzl = transactionAlertType;
        }
    }

    /* JADX INFO: renamed from: o.lqz$StateListAnimator */
    public static final class StateListAnimator extends AbstractC31280lqz {
        public final java.lang.Exception copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = stateListAnimator.copydefault;
            }
            return stateListAnimator.copydefault(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            return new StateListAnimator(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(exception=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.Exception exc) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, "");
            this.copydefault = exc;
        }
    }
}
