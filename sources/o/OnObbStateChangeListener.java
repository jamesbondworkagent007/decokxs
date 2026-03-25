package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class OnObbStateChangeListener {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public static final java.util.List<OnObbStateChangeListener> copydefault = yDY.gEmmrt(Activity.EZpvd, StateListAnimator.KWHzl, PendingIntent.KWHzl, Application.EZpvd, Dialog.KWHzl, Fragment.KWHzl, FragmentManager.AEQbTJ, LoaderManager.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OnObbStateChangeListener.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OnObbStateChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private OnObbStateChangeListener() {
    }

    public static final class Activity extends OnObbStateChangeListener {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String AEQbTJ = "DELETING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Deleting";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class StateListAnimator extends OnObbStateChangeListener {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String EZpvd = "IN_ERROR";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InError";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class PendingIntent extends OnObbStateChangeListener {
        public static final PendingIntent KWHzl = new PendingIntent();
        public static final java.lang.String EZpvd = "STOPPED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopped";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class Application extends OnObbStateChangeListener {
        public static final Application EZpvd = new Application();
        public static final java.lang.String KWHzl = "STOP_REQUESTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StopRequested";
        }

        private Application() {
            super(null);
        }
    }

    public static final class Dialog extends OnObbStateChangeListener {
        public static final Dialog KWHzl = new Dialog();
        public static final java.lang.String AEQbTJ = "SUBMITTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Submitted";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class Fragment extends OnObbStateChangeListener {
        public static final Fragment KWHzl = new Fragment();
        public static final java.lang.String EZpvd = "TRAINED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Trained";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class FragmentManager extends OnObbStateChangeListener {
        public static final FragmentManager AEQbTJ = new FragmentManager();
        public static final java.lang.String KWHzl = "TRAINED_WITH_WARNING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TrainedWithWarning";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class LoaderManager extends OnObbStateChangeListener {
        public static final LoaderManager AEQbTJ = new LoaderManager();
        public static final java.lang.String KWHzl = "TRAINING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Training";
        }

        private LoaderManager() {
            super(null);
        }
    }

    public static final class ActionBar extends OnObbStateChangeListener {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            return actionBar.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OnObbStateChangeListener
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OnObbStateChangeListener.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [58=8] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final OnObbStateChangeListener copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1166336595:
                    if (str.equals("STOPPED")) {
                        return PendingIntent.KWHzl;
                    }
                    break;
                case -1159694117:
                    if (str.equals("SUBMITTED")) {
                        return Dialog.KWHzl;
                    }
                    break;
                case -605681839:
                    if (str.equals("STOP_REQUESTED")) {
                        return Application.EZpvd;
                    }
                    break;
                case -349230969:
                    if (str.equals("TRAINED")) {
                        return Fragment.KWHzl;
                    }
                    break;
                case 664140219:
                    if (str.equals("TRAINED_WITH_WARNING")) {
                        return FragmentManager.AEQbTJ;
                    }
                    break;
                case 1602343848:
                    if (str.equals("DELETING")) {
                        return Activity.EZpvd;
                    }
                    break;
                case 1667962446:
                    if (str.equals("IN_ERROR")) {
                        return StateListAnimator.KWHzl;
                    }
                    break;
                case 2058746074:
                    if (str.equals("TRAINING")) {
                        return LoaderManager.AEQbTJ;
                    }
                    break;
            }
            return new ActionBar(str);
        }
    }
}
