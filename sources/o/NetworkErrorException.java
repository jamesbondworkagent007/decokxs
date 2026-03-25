package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NetworkErrorException {
    public static final ActionBar EZpvd = new ActionBar(null);
    public static final java.util.List<NetworkErrorException> OLrzqt = yDY.gEmmrt(TaskDescription.AEQbTJ, Activity.copydefault, Application.AEQbTJ, StateListAnimator.AEQbTJ, Fragment.copydefault, FragmentManager.copydefault, PendingIntent.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkErrorException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkErrorException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String KWHzl();

    private NetworkErrorException() {
    }

    public static final class TaskDescription extends NetworkErrorException {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String copydefault = "ADMIN_NO_SRP_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkErrorException
        public java.lang.String KWHzl() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AdminNoSrpAuth";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Activity extends NetworkErrorException {
        public static final Activity copydefault = new Activity();
        public static final java.lang.String KWHzl = "ADMIN_USER_PASSWORD_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkErrorException
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AdminUserPasswordAuth";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class Application extends NetworkErrorException {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String copydefault = "CUSTOM_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkErrorException
        public java.lang.String KWHzl() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CustomAuth";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends NetworkErrorException {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String copydefault = "REFRESH_TOKEN";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkErrorException
        public java.lang.String KWHzl() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RefreshToken";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Fragment extends NetworkErrorException {
        public static final Fragment copydefault = new Fragment();
        public static final java.lang.String KWHzl = "REFRESH_TOKEN_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkErrorException
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RefreshTokenAuth";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class FragmentManager extends NetworkErrorException {
        public static final FragmentManager copydefault = new FragmentManager();
        public static final java.lang.String KWHzl = "USER_PASSWORD_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkErrorException
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UserPasswordAuth";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class PendingIntent extends NetworkErrorException {
        public static final PendingIntent KWHzl = new PendingIntent();
        public static final java.lang.String AEQbTJ = "USER_SRP_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkErrorException
        public java.lang.String KWHzl() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UserSrpAuth";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkErrorException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
