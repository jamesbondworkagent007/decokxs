package o;

import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC19873gSm {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gSm.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC19873gSm(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.gSm$TaskDescription */
    public static final class TaskDescription extends AbstractC19873gSm {
        public final CopyTradingStrategy EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, CopyTradingStrategy copyTradingStrategy, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                copyTradingStrategy = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(copyTradingStrategy);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CopyTradingStrategy EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull CopyTradingStrategy copyTradingStrategy) {
            Intrinsics.checkNotNullParameter(copyTradingStrategy, "");
            return new TaskDescription(copyTradingStrategy);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(updatedStrategy=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull CopyTradingStrategy copyTradingStrategy) {
            super(null);
            Intrinsics.checkNotNullParameter(copyTradingStrategy, "");
            this.EZpvd = copyTradingStrategy;
        }
    }

    private AbstractC19873gSm() {
    }

    /* JADX INFO: renamed from: o.gSm$StateListAnimator */
    public static final class StateListAnimator extends AbstractC19873gSm {
        public static final StateListAnimator EZpvd = new StateListAnimator();

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
            return 1286816162;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Cancelled";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.gSm$Activity */
    public static final class Activity extends AbstractC19873gSm {
        public static final Activity copydefault = new Activity();

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
            return -850016884;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Activity() {
            super(null);
        }
    }
}
