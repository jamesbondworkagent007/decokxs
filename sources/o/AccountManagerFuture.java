package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AccountManagerFuture {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public static final java.util.List<AccountManagerFuture> AEQbTJ = yDY.gEmmrt(Application.KWHzl, ActionBar.KWHzl, Activity.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AccountManagerFuture.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccountManagerFuture(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private AccountManagerFuture() {
    }

    public static final class Application extends AccountManagerFuture {
        public static final Application KWHzl = new Application();
        public static final java.lang.String EZpvd = "AUDIT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AccountManagerFuture
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Audit";
        }

        private Application() {
            super(null);
        }
    }

    public static final class ActionBar extends AccountManagerFuture {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String EZpvd = "ENFORCED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AccountManagerFuture
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Enforced";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Activity extends AccountManagerFuture {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String copydefault = "OFF";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AccountManagerFuture
        public java.lang.String EZpvd() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Off";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class TaskDescription extends AccountManagerFuture {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AccountManagerFuture
        public java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AccountManagerFuture.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AccountManagerFuture EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != -1714819902) {
                if (iHashCode != 78159) {
                    if (iHashCode == 62628795 && str.equals("AUDIT")) {
                        return Application.KWHzl;
                    }
                } else if (str.equals("OFF")) {
                    return Activity.KWHzl;
                }
            } else if (str.equals("ENFORCED")) {
                return ActionBar.KWHzl;
            }
            return new TaskDescription(str);
        }
    }
}
