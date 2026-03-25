package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class SdkConstant {
    public static final Activity EZpvd = new Activity(null);
    public static final java.util.List<SdkConstant> AEQbTJ = yDY.gEmmrt(Application.KWHzl, ActionBar.KWHzl, StateListAnimator.KWHzl, TaskDescription.KWHzl, LoaderManager.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SdkConstant.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SdkConstant(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SdkConstant() {
    }

    public static final class Application extends SdkConstant {
        public static final Application KWHzl = new Application();
        public static final java.lang.String copydefault = "ACTIVE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Active";
        }

        private Application() {
            super(null);
        }
    }

    public static final class ActionBar extends SdkConstant {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String OLrzqt = "CREATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Creating";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class StateListAnimator extends SdkConstant {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String OLrzqt = "DELETING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Deleting";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class TaskDescription extends SdkConstant {
        public static final TaskDescription KWHzl = new TaskDescription();
        public static final java.lang.String copydefault = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class LoaderManager extends SdkConstant {
        public static final LoaderManager KWHzl = new LoaderManager();
        public static final java.lang.String copydefault = "UPDATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Updating";
        }

        private LoaderManager() {
            super(null);
        }
    }

    public static final class Dialog extends SdkConstant {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.OLrzqt;
            }
            return dialog.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Dialog) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SdkConstant.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final SdkConstant EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1691918663:
                    if (str.equals("CREATING")) {
                        return ActionBar.KWHzl;
                    }
                    break;
                case 1602343848:
                    if (str.equals("DELETING")) {
                        return StateListAnimator.KWHzl;
                    }
                    break;
                case 1925346054:
                    if (str.equals("ACTIVE")) {
                        return Application.KWHzl;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return TaskDescription.KWHzl;
                    }
                    break;
                case 2105227078:
                    if (str.equals("UPDATING")) {
                        return LoaderManager.KWHzl;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
