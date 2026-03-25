package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DoubleDigitManager {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public static final java.util.List<DoubleDigitManager> KWHzl = yDY.gEmmrt(StateListAnimator.AEQbTJ, Application.copydefault, Activity.AEQbTJ, ActionBar.copydefault, Dialog.copydefault, Fragment.AEQbTJ, FragmentManager.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DoubleDigitManager.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DoubleDigitManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DoubleDigitManager() {
    }

    public static final class StateListAnimator extends DoubleDigitManager {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String copydefault = "CREATE_COMPLETE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CreateComplete";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Application extends DoubleDigitManager {
        public static final Application copydefault = new Application();
        public static final java.lang.String EZpvd = "CREATE_FAILED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CreateFailed";
        }

        private Application() {
            super(null);
        }
    }

    public static final class Activity extends DoubleDigitManager {
        public static final Activity AEQbTJ = new Activity();
        public static final java.lang.String EZpvd = "CREATE_IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CreateInProgress";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class ActionBar extends DoubleDigitManager {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String EZpvd = "DELETE_IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DeleteInProgress";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Dialog extends DoubleDigitManager {
        public static final Dialog copydefault = new Dialog();
        public static final java.lang.String AEQbTJ = "UPDATE_COMPLETE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UpdateComplete";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class Fragment extends DoubleDigitManager {
        public static final Fragment AEQbTJ = new Fragment();
        public static final java.lang.String EZpvd = "UPDATE_FAILED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UpdateFailed";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class FragmentManager extends DoubleDigitManager {
        public static final FragmentManager AEQbTJ = new FragmentManager();
        public static final java.lang.String copydefault = "UPDATE_IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UpdateInProgress";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class LoaderManager extends DoubleDigitManager {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.AEQbTJ;
            }
            return loaderManager.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.AEQbTJ;
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
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DoubleDigitManager.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final DoubleDigitManager OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -835019552:
                    if (str.equals("CREATE_FAILED")) {
                        return Application.copydefault;
                    }
                    break;
                case -569796324:
                    if (str.equals("CREATE_COMPLETE")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
                case -282520461:
                    if (str.equals("UPDATE_FAILED")) {
                        return Fragment.AEQbTJ;
                    }
                    break;
                case 43560260:
                    if (str.equals("CREATE_IN_PROGRESS")) {
                        return Activity.AEQbTJ;
                    }
                    break;
                case 1089799027:
                    if (str.equals("DELETE_IN_PROGRESS")) {
                        return ActionBar.copydefault;
                    }
                    break;
                case 1375009169:
                    if (str.equals("UPDATE_IN_PROGRESS")) {
                        return FragmentManager.AEQbTJ;
                    }
                    break;
                case 2100852719:
                    if (str.equals("UPDATE_COMPLETE")) {
                        return Dialog.copydefault;
                    }
                    break;
            }
            return new LoaderManager(str);
        }
    }
}
