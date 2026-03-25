package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ClientTransactionHandler {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public static final java.util.List<ClientTransactionHandler> OLrzqt = yDY.gEmmrt(ActionBar.AEQbTJ, Activity.KWHzl, Application.KWHzl, StateListAnimator.AEQbTJ, Fragment.AEQbTJ, FragmentManager.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ClientTransactionHandler.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ClientTransactionHandler(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String AEQbTJ();

    private ClientTransactionHandler() {
    }

    public static final class ActionBar extends ClientTransactionHandler {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String copydefault = "Facebook";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ClientTransactionHandler
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Facebook";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Activity extends ClientTransactionHandler {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String copydefault = "Google";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ClientTransactionHandler
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Google";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class Application extends ClientTransactionHandler {
        public static final Application KWHzl = new Application();
        public static final java.lang.String AEQbTJ = "LoginWithAmazon";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ClientTransactionHandler
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LoginWithAmazon";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends ClientTransactionHandler {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String copydefault = "OIDC";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ClientTransactionHandler
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Oidc";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Fragment extends ClientTransactionHandler {
        public static final Fragment AEQbTJ = new Fragment();
        public static final java.lang.String KWHzl = "SAML";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ClientTransactionHandler
        public java.lang.String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Saml";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class FragmentManager extends ClientTransactionHandler {
        public static final FragmentManager copydefault = new FragmentManager();
        public static final java.lang.String KWHzl = "SignInWithApple";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ClientTransactionHandler
        public java.lang.String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignInWithApple";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class LoaderManager extends ClientTransactionHandler {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.AEQbTJ;
            }
            return loaderManager.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ClientTransactionHandler
        public java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((LoaderManager) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ClientTransactionHandler.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=6] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ClientTransactionHandler KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1898476909:
                    if (str.equals("LoginWithAmazon")) {
                        return Application.KWHzl;
                    }
                    break;
                case 2425817:
                    if (str.equals("OIDC")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
                case 2537581:
                    if (str.equals("SAML")) {
                        return Fragment.AEQbTJ;
                    }
                    break;
                case 561774310:
                    if (str.equals("Facebook")) {
                        return ActionBar.AEQbTJ;
                    }
                    break;
                case 605942898:
                    if (str.equals("SignInWithApple")) {
                        return FragmentManager.copydefault;
                    }
                    break;
                case 2138589785:
                    if (str.equals("Google")) {
                        return Activity.KWHzl;
                    }
                    break;
            }
            return new LoaderManager(str);
        }
    }
}
