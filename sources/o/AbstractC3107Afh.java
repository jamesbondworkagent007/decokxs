package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.SendCodeType;

/* JADX INFO: renamed from: o.Afh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC3107Afh {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Afh.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC3107Afh(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3107Afh() {
    }

    /* JADX INFO: renamed from: o.Afh$Activity */
    public static final class Activity extends AbstractC3107Afh {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afh$Application */
    public static final class Application extends AbstractC3107Afh {
        public static final int $stable = 0;
        public static final Application INSTANCE = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afh$ActionBar */
    public static final class ActionBar extends AbstractC3107Afh {
        public static final int $stable = 0;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(int i) {
            return new ActionBar(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && this.copydefault == ((ActionBar) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CountDown(seconds=" + this.copydefault + ")";
        }

        public ActionBar(int i) {
            super(null);
            this.copydefault = i;
        }
    }

    /* JADX INFO: renamed from: o.Afh$TaskDescription */
    public static final class TaskDescription extends AbstractC3107Afh {
        public static final int $stable = 0;
        public final boolean EZpvd;
        public final SendCodeType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, SendCodeType sendCodeType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                sendCodeType = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(z, sendCodeType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(boolean z, SendCodeType sendCodeType) {
            return new TaskDescription(z, sendCodeType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SendCodeType copydefault() {
            return this.OLrzqt;
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
            return this.EZpvd == taskDescription.EZpvd && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
            SendCodeType sendCodeType = this.OLrzqt;
            return (iHashCode * 31) + (sendCodeType == null ? 0 : sendCodeType.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(isResend=" + this.EZpvd + ", sendCodeType=" + this.OLrzqt + ")";
        }

        public TaskDescription(boolean z, SendCodeType sendCodeType) {
            super(null);
            this.EZpvd = z;
            this.OLrzqt = sendCodeType;
        }
    }

    /* JADX INFO: renamed from: o.Afh$StateListAnimator */
    public static final class StateListAnimator extends AbstractC3107Afh {
        public static final int $stable = 8;
        public final C60231zyo AEQbTJ;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, C60231zyo c60231zyo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                c60231zyo = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.AEQbTJ(z, c60231zyo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(boolean z, @NotNull C60231zyo c60231zyo) {
            Intrinsics.checkNotNullParameter(c60231zyo, "");
            return new StateListAnimator(z, c60231zyo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C60231zyo OLrzqt() {
            return this.AEQbTJ;
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
            return this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(isResend=" + this.KWHzl + ", error=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(boolean z, @NotNull C60231zyo c60231zyo) {
            super(null);
            Intrinsics.checkNotNullParameter(c60231zyo, "");
            this.KWHzl = z;
            this.AEQbTJ = c60231zyo;
        }
    }
}
