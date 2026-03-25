package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.PasskeyOperationType;

/* JADX INFO: renamed from: o.zVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC58948zVk {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zVk.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC58948zVk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC58948zVk() {
    }

    /* JADX INFO: renamed from: o.zVk$Application */
    public static final class Application extends AbstractC58948zVk {
        public static final int $stable = 0;
        public final boolean AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.AEQbTJ;
            }
            return application.OLrzqt(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(boolean z) {
            return new Application(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && this.AEQbTJ == ((Application) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Complete(isTicketSubmit=" + this.AEQbTJ + ")";
        }

        public Application(boolean z) {
            super(null);
            this.AEQbTJ = z;
        }
    }

    /* JADX INFO: renamed from: o.zVk$StateListAnimator */
    public static final class StateListAnimator extends AbstractC58948zVk {
        public static final int $stable = 0;
        public final PasskeyOperationType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, PasskeyOperationType passkeyOperationType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyOperationType = stateListAnimator.copydefault;
            }
            return stateListAnimator.OLrzqt(passkeyOperationType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasskeyOperationType KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull PasskeyOperationType passkeyOperationType) {
            Intrinsics.checkNotNullParameter(passkeyOperationType, "");
            return new StateListAnimator(passkeyOperationType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.copydefault == ((StateListAnimator) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UnableVerify(operationType=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull PasskeyOperationType passkeyOperationType) {
            super(null);
            Intrinsics.checkNotNullParameter(passkeyOperationType, "");
            this.copydefault = passkeyOperationType;
        }
    }

    /* JADX INFO: renamed from: o.zVk$Activity */
    public static final class Activity extends AbstractC58948zVk {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zVk$ActionBar */
    public static final class ActionBar extends AbstractC58948zVk {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zVk$TaskDescription */
    public static final class TaskDescription extends AbstractC58948zVk {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }
}
