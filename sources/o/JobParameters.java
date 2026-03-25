package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class JobParameters {
    public static final Activity copydefault = new Activity(null);
    public static final java.util.List<JobParameters> EZpvd = yDY.gEmmrt(StateListAnimator.OLrzqt, ActionBar.AEQbTJ, TaskDescription.OLrzqt, Application.OLrzqt, PendingIntent.KWHzl, Fragment.KWHzl, FragmentManager.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JobParameters.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ JobParameters(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private JobParameters() {
    }

    public static final class StateListAnimator extends JobParameters {
        public static final StateListAnimator OLrzqt = new StateListAnimator();
        public static final java.lang.String KWHzl = "ARCHIVED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Archived";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class ActionBar extends JobParameters {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String KWHzl = "COMPROMISED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Compromised";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class TaskDescription extends JobParameters {
        public static final TaskDescription OLrzqt = new TaskDescription();
        public static final java.lang.String AEQbTJ = "CONFIRMED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Confirmed";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Application extends JobParameters {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String KWHzl = "FORCE_CHANGE_PASSWORD";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ForceChangePassword";
        }

        private Application() {
            super(null);
        }
    }

    public static final class PendingIntent extends JobParameters {
        public static final PendingIntent KWHzl = new PendingIntent();
        public static final java.lang.String AEQbTJ = "RESET_REQUIRED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ResetRequired";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class Fragment extends JobParameters {
        public static final Fragment KWHzl = new Fragment();
        public static final java.lang.String OLrzqt = "UNCONFIRMED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Unconfirmed";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class FragmentManager extends JobParameters {
        public static final FragmentManager KWHzl = new FragmentManager();
        public static final java.lang.String OLrzqt = "UNKNOWN";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Unknown";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class Dialog extends JobParameters {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.KWHzl;
            }
            return dialog.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Dialog) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JobParameters.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final JobParameters copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -2024960849:
                    if (str.equals("RESET_REQUIRED")) {
                        return PendingIntent.KWHzl;
                    }
                    break;
                case -933681182:
                    if (str.equals("ARCHIVED")) {
                        return StateListAnimator.OLrzqt;
                    }
                    break;
                case -429560054:
                    if (str.equals("COMPROMISED")) {
                        return ActionBar.AEQbTJ;
                    }
                    break;
                case 433141802:
                    if (str.equals("UNKNOWN")) {
                        return FragmentManager.KWHzl;
                    }
                    break;
                case 1148218582:
                    if (str.equals("FORCE_CHANGE_PASSWORD")) {
                        return Application.OLrzqt;
                    }
                    break;
                case 1417290950:
                    if (str.equals("UNCONFIRMED")) {
                        return Fragment.KWHzl;
                    }
                    break;
                case 1982485311:
                    if (str.equals("CONFIRMED")) {
                        return TaskDescription.OLrzqt;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
