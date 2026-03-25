package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RemoteException {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public static final java.util.List<RemoteException> EZpvd = yDY.gEmmrt(StateListAnimator.copydefault, Application.copydefault, Activity.KWHzl, PendingIntent.KWHzl, Fragment.KWHzl, Dialog.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RemoteException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RemoteException() {
    }

    public static final class StateListAnimator extends RemoteException {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "COMPLETED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Completed";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Application extends RemoteException {
        public static final Application copydefault = new Application();
        public static final java.lang.String KWHzl = "EVALUATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Evaluating";
        }

        private Application() {
            super(null);
        }
    }

    public static final class Activity extends RemoteException {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String AEQbTJ = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class PendingIntent extends RemoteException {
        public static final PendingIntent KWHzl = new PendingIntent();
        public static final java.lang.String AEQbTJ = "STOPPED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopped";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class Fragment extends RemoteException {
        public static final Fragment KWHzl = new Fragment();
        public static final java.lang.String copydefault = "STOP_REQUESTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StopRequested";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class Dialog extends RemoteException {
        public static final Dialog copydefault = new Dialog();
        public static final java.lang.String AEQbTJ = "TRAINING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Training";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class ActionBar extends RemoteException {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=6] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final RemoteException KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1166336595:
                    if (str.equals("STOPPED")) {
                        return PendingIntent.KWHzl;
                    }
                    break;
                case -605681839:
                    if (str.equals("STOP_REQUESTED")) {
                        return Fragment.KWHzl;
                    }
                    break;
                case 1343615766:
                    if (str.equals("EVALUATING")) {
                        return Application.copydefault;
                    }
                    break;
                case 1383663147:
                    if (str.equals("COMPLETED")) {
                        return StateListAnimator.copydefault;
                    }
                    break;
                case 2058746074:
                    if (str.equals("TRAINING")) {
                        return Dialog.copydefault;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return Activity.KWHzl;
                    }
                    break;
            }
            return new ActionBar(str);
        }
    }
}
