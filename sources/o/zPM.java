package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.SyncViolatedPrecondition;

/* JADX INFO: loaded from: classes17.dex */
public abstract class zPM {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zPM.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ zPM(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private zPM() {
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class TaskDescription extends zPM {
        public static final int $stable = 0;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowError(message=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class StateListAnimator extends zPM {
        public static final int $stable = 0;
        public static final StateListAnimator INSTANCE = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Activity extends zPM {
        public static final int $stable = 0;
        public final SyncViolatedPrecondition AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, SyncViolatedPrecondition syncViolatedPrecondition, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                syncViolatedPrecondition = activity.AEQbTJ;
            }
            return activity.KWHzl(syncViolatedPrecondition);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SyncViolatedPrecondition AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull SyncViolatedPrecondition syncViolatedPrecondition) {
            Intrinsics.checkNotNullParameter(syncViolatedPrecondition, "");
            return new Activity(syncViolatedPrecondition);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && this.AEQbTJ == ((Activity) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViolatedPrecondition(precondition=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull SyncViolatedPrecondition syncViolatedPrecondition) {
            super(null);
            Intrinsics.checkNotNullParameter(syncViolatedPrecondition, "");
            this.AEQbTJ = syncViolatedPrecondition;
        }
    }
}
