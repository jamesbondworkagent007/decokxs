package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class SystemApi {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public static final java.util.List<SystemApi> AEQbTJ = yDY.gEmmrt(ActionBar.copydefault, Application.KWHzl, StateListAnimator.copydefault, Fragment.KWHzl, Dialog.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SystemApi.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SystemApi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SystemApi() {
    }

    public static final class ActionBar extends SystemApi {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String EZpvd = "ForgotPassword";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ForgotPassword";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Application extends SystemApi {
        public static final Application KWHzl = new Application();
        public static final java.lang.String copydefault = "PasswordChange";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PasswordChange";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends SystemApi {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String EZpvd = "ResendCode";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ResendCode";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Fragment extends SystemApi {
        public static final Fragment KWHzl = new Fragment();
        public static final java.lang.String copydefault = "SignIn";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignIn";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class Dialog extends SystemApi {
        public static final Dialog EZpvd = new Dialog();
        public static final java.lang.String KWHzl = "SignUp";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignUp";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class Activity extends SystemApi {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            return activity.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((Activity) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SystemApi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final SystemApi AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -2000755125:
                    if (str.equals("PasswordChange")) {
                        return Application.KWHzl;
                    }
                    break;
                case -1818601502:
                    if (str.equals("SignIn")) {
                        return Fragment.KWHzl;
                    }
                    break;
                case -1818601128:
                    if (str.equals("SignUp")) {
                        return Dialog.EZpvd;
                    }
                    break;
                case -372049154:
                    if (str.equals("ForgotPassword")) {
                        return ActionBar.copydefault;
                    }
                    break;
                case 148436200:
                    if (str.equals("ResendCode")) {
                        return StateListAnimator.copydefault;
                    }
                    break;
            }
            return new Activity(str);
        }
    }
}
