package o;

import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC43737rut {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rut.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC43737rut(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC43737rut() {
    }

    /* JADX INFO: renamed from: o.rut$StateListAnimator */
    public static final class StateListAnimator extends AbstractC43737rut {
        public final ResultStatus EZpvd;
        public final From copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, ResultStatus resultStatus, From from, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                resultStatus = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                from = stateListAnimator.copydefault;
            }
            return stateListAnimator.KWHzl(resultStatus, from);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResultStatus KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(ResultStatus resultStatus, @NotNull From from) {
            Intrinsics.checkNotNullParameter(from, "");
            return new StateListAnimator(resultStatus, from);
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
            return this.EZpvd == stateListAnimator.EZpvd && this.copydefault == stateListAnimator.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ResultStatus resultStatus = this.EZpvd;
            return ((resultStatus == null ? 0 : resultStatus.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(result=" + this.EZpvd + ", exitTarget=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(ResultStatus resultStatus, @NotNull From from) {
            super(null);
            Intrinsics.checkNotNullParameter(from, "");
            this.EZpvd = resultStatus;
            this.copydefault = from;
        }
    }

    /* JADX INFO: renamed from: o.rut$TaskDescription */
    public static final class TaskDescription extends AbstractC43737rut {
        public final From OLrzqt;
        public final ResultStatus copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ResultStatus resultStatus, From from, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                resultStatus = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                from = taskDescription.OLrzqt;
            }
            return taskDescription.AEQbTJ(resultStatus, from);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(ResultStatus resultStatus, @NotNull From from) {
            Intrinsics.checkNotNullParameter(from, "");
            return new TaskDescription(resultStatus, from);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final From KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResultStatus copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.copydefault == taskDescription.copydefault && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ResultStatus resultStatus = this.copydefault;
            return ((resultStatus == null ? 0 : resultStatus.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Exit(result=" + this.copydefault + ", exitTarget=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(ResultStatus resultStatus, @NotNull From from) {
            super(null);
            Intrinsics.checkNotNullParameter(from, "");
            this.copydefault = resultStatus;
            this.OLrzqt = from;
        }
    }

    /* JADX INFO: renamed from: o.rut$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity extends AbstractC43737rut {
        public final From AEQbTJ;
        public final ResultStatus OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, ResultStatus resultStatus, From from, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                resultStatus = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                from = activity.AEQbTJ;
            }
            return activity.AEQbTJ(resultStatus, from);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(ResultStatus resultStatus, @NotNull From from) {
            Intrinsics.checkNotNullParameter(from, "");
            return new Activity(resultStatus, from);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.OLrzqt == activity.OLrzqt && this.AEQbTJ == activity.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ResultStatus resultStatus = this.OLrzqt;
            return ((resultStatus == null ? 0 : resultStatus.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Cancel(result=" + this.OLrzqt + ", exitTarget=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(ResultStatus resultStatus, @NotNull From from) {
            super(null);
            Intrinsics.checkNotNullParameter(from, "");
            this.OLrzqt = resultStatus;
            this.AEQbTJ = from;
        }
    }

    /* JADX INFO: renamed from: o.rut$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar extends AbstractC43737rut {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.rut$Application */
    public static final class Application extends AbstractC43737rut {
        public static final Application copydefault = new Application();

        private Application() {
            super(null);
        }
    }
}
