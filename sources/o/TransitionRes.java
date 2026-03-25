package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class TransitionRes {
    public static final LoaderManager KWHzl = new LoaderManager(null);
    public static final java.util.List<TransitionRes> copydefault = yDY.gEmmrt(Application.EZpvd, TaskDescription.EZpvd, StateListAnimator.EZpvd, ActionBar.EZpvd, Activity.AEQbTJ, FragmentManager.OLrzqt, Fragment.AEQbTJ, Dialog.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TransitionRes.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TransitionRes(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private TransitionRes() {
    }

    public static final class Application extends TransitionRes {
        public static final Application EZpvd = new Application();
        public static final java.lang.String AEQbTJ = "ADMIN_NO_SRP_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AdminNoSrpAuth";
        }

        private Application() {
            super(null);
        }
    }

    public static final class TaskDescription extends TransitionRes {
        public static final TaskDescription EZpvd = new TaskDescription();
        public static final java.lang.String AEQbTJ = "ALLOW_ADMIN_USER_PASSWORD_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AllowAdminUserPasswordAuth";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class StateListAnimator extends TransitionRes {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "ALLOW_CUSTOM_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AllowCustomAuth";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class ActionBar extends TransitionRes {
        public static final ActionBar EZpvd = new ActionBar();
        public static final java.lang.String AEQbTJ = "ALLOW_REFRESH_TOKEN_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AllowRefreshTokenAuth";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Activity extends TransitionRes {
        public static final Activity AEQbTJ = new Activity();
        public static final java.lang.String OLrzqt = "ALLOW_USER_PASSWORD_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AllowUserPasswordAuth";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class FragmentManager extends TransitionRes {
        public static final FragmentManager OLrzqt = new FragmentManager();
        public static final java.lang.String AEQbTJ = "ALLOW_USER_SRP_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AllowUserSrpAuth";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class Fragment extends TransitionRes {
        public static final Fragment AEQbTJ = new Fragment();
        public static final java.lang.String OLrzqt = "CUSTOM_AUTH_FLOW_ONLY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CustomAuthFlowOnly";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class Dialog extends TransitionRes {
        public static final Dialog OLrzqt = new Dialog();
        public static final java.lang.String AEQbTJ = "USER_PASSWORD_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UserPasswordAuth";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class PendingIntent extends TransitionRes {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.OLrzqt;
            }
            return pendingIntent.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.TransitionRes
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PendingIntent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((PendingIntent) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    public static final class LoaderManager {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TransitionRes.LoaderManager.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ LoaderManager(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LoaderManager() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [58=8] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final TransitionRes OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -2054351826:
                    if (str.equals("ALLOW_USER_PASSWORD_AUTH")) {
                        return Activity.AEQbTJ;
                    }
                    break;
                case -1767288130:
                    if (str.equals("ALLOW_ADMIN_USER_PASSWORD_AUTH")) {
                        return TaskDescription.EZpvd;
                    }
                    break;
                case -1521679528:
                    if (str.equals("USER_PASSWORD_AUTH")) {
                        return Dialog.OLrzqt;
                    }
                    break;
                case -1054250316:
                    if (str.equals("ALLOW_USER_SRP_AUTH")) {
                        return FragmentManager.OLrzqt;
                    }
                    break;
                case -810131160:
                    if (str.equals("ALLOW_REFRESH_TOKEN_AUTH")) {
                        return ActionBar.EZpvd;
                    }
                    break;
                case -728587872:
                    if (str.equals("ALLOW_CUSTOM_AUTH")) {
                        return StateListAnimator.EZpvd;
                    }
                    break;
                case 1330737924:
                    if (str.equals("ADMIN_NO_SRP_AUTH")) {
                        return Application.EZpvd;
                    }
                    break;
                case 1605910740:
                    if (str.equals("CUSTOM_AUTH_FLOW_ONLY")) {
                        return Fragment.AEQbTJ;
                    }
                    break;
            }
            return new PendingIntent(str);
        }
    }
}
