package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GrantCredentialsPermissionActivity {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public static final java.util.List<GrantCredentialsPermissionActivity> KWHzl = yDY.gEmmrt(ActionBar.AEQbTJ, Application.AEQbTJ, StateListAnimator.AEQbTJ, Activity.EZpvd, Fragment.EZpvd, Dialog.OLrzqt, FragmentManager.EZpvd, PendingIntent.OLrzqt, VoiceInteractor.AEQbTJ, SharedElementCallback.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.GrantCredentialsPermissionActivity.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ GrantCredentialsPermissionActivity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private GrantCredentialsPermissionActivity() {
    }

    public static final class ActionBar extends GrantCredentialsPermissionActivity {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String OLrzqt = "ADMIN_NO_SRP_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AdminNoSrpAuth";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Application extends GrantCredentialsPermissionActivity {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String EZpvd = "CUSTOM_CHALLENGE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CustomChallenge";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends GrantCredentialsPermissionActivity {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String OLrzqt = "DEVICE_PASSWORD_VERIFIER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DevicePasswordVerifier";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends GrantCredentialsPermissionActivity {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String OLrzqt = "DEVICE_SRP_AUTH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DeviceSrpAuth";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class Fragment extends GrantCredentialsPermissionActivity {
        public static final Fragment EZpvd = new Fragment();
        public static final java.lang.String OLrzqt = "MFA_SETUP";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MfaSetup";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class Dialog extends GrantCredentialsPermissionActivity {
        public static final Dialog OLrzqt = new Dialog();
        public static final java.lang.String AEQbTJ = "NEW_PASSWORD_REQUIRED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NewPasswordRequired";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class FragmentManager extends GrantCredentialsPermissionActivity {
        public static final FragmentManager EZpvd = new FragmentManager();
        public static final java.lang.String OLrzqt = "PASSWORD_VERIFIER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PasswordVerifier";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class PendingIntent extends GrantCredentialsPermissionActivity {
        public static final PendingIntent OLrzqt = new PendingIntent();
        public static final java.lang.String AEQbTJ = "SELECT_MFA_TYPE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectMfaType";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class VoiceInteractor extends GrantCredentialsPermissionActivity {
        public static final VoiceInteractor AEQbTJ = new VoiceInteractor();
        public static final java.lang.String EZpvd = "SMS_MFA";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SmsMfa";
        }

        private VoiceInteractor() {
            super(null);
        }
    }

    public static final class SharedElementCallback extends GrantCredentialsPermissionActivity {
        public static final SharedElementCallback EZpvd = new SharedElementCallback();
        public static final java.lang.String OLrzqt = "SOFTWARE_TOKEN_MFA";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SoftwareTokenMfa";
        }

        private SharedElementCallback() {
            super(null);
        }
    }

    public static final class LoaderManager extends GrantCredentialsPermissionActivity {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.OLrzqt;
            }
            return loaderManager.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.GrantCredentialsPermissionActivity
        public java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((LoaderManager) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.GrantCredentialsPermissionActivity.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [68=10] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final GrantCredentialsPermissionActivity EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1737337862:
                    if (str.equals("PASSWORD_VERIFIER")) {
                        return FragmentManager.EZpvd;
                    }
                    break;
                case -1362602558:
                    if (str.equals("SMS_MFA")) {
                        return VoiceInteractor.AEQbTJ;
                    }
                    break;
                case 161754570:
                    if (str.equals("SOFTWARE_TOKEN_MFA")) {
                        return SharedElementCallback.EZpvd;
                    }
                    break;
                case 325396255:
                    if (str.equals("DEVICE_SRP_AUTH")) {
                        return Activity.EZpvd;
                    }
                    break;
                case 338106308:
                    if (str.equals("NEW_PASSWORD_REQUIRED")) {
                        return Dialog.OLrzqt;
                    }
                    break;
                case 359356710:
                    if (str.equals("MFA_SETUP")) {
                        return Fragment.EZpvd;
                    }
                    break;
                case 645737717:
                    if (str.equals("CUSTOM_CHALLENGE")) {
                        return Application.AEQbTJ;
                    }
                    break;
                case 872896308:
                    if (str.equals("SELECT_MFA_TYPE")) {
                        return PendingIntent.OLrzqt;
                    }
                    break;
                case 1330737924:
                    if (str.equals("ADMIN_NO_SRP_AUTH")) {
                        return ActionBar.AEQbTJ;
                    }
                    break;
                case 1362077265:
                    if (str.equals("DEVICE_PASSWORD_VERIFIER")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
            }
            return new LoaderManager(str);
        }
    }
}
