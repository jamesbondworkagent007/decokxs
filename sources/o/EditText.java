package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class EditText {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public static final java.util.List<EditText> KWHzl = yDY.gEmmrt(TaskDescription.OLrzqt, Application.OLrzqt, StateListAnimator.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.EditText.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EditText(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EditText() {
    }

    public static final class TaskDescription extends EditText {
        public static final TaskDescription OLrzqt = new TaskDescription();
        public static final java.lang.String copydefault = "CLIENT_ERROR";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ClientError";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Application extends EditText {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String EZpvd = "SERVICE_ERROR";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ServiceError";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends EditText {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String EZpvd = "SUCCESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends EditText {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            return activity.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str) {
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

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.EditText.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final EditText AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != -1999008834) {
                if (iHashCode != -1149187101) {
                    if (iHashCode == 2130501748 && str.equals("CLIENT_ERROR")) {
                        return TaskDescription.OLrzqt;
                    }
                } else if (str.equals("SUCCESS")) {
                    return StateListAnimator.copydefault;
                }
            } else if (str.equals("SERVICE_ERROR")) {
                return Application.OLrzqt;
            }
            return new Activity(str);
        }
    }
}
