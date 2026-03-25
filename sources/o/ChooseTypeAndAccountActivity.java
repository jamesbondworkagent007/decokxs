package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ChooseTypeAndAccountActivity {
    public static final Application EZpvd = new Application(null);
    public static final java.util.List<ChooseTypeAndAccountActivity> KWHzl = yDY.gEmmrt(ActionBar.AEQbTJ, StateListAnimator.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ChooseTypeAndAccountActivity.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ChooseTypeAndAccountActivity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChooseTypeAndAccountActivity() {
    }

    public static final class ActionBar extends ChooseTypeAndAccountActivity {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String copydefault = "Failure";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failure";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class StateListAnimator extends ChooseTypeAndAccountActivity {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String copydefault = "Success";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends ChooseTypeAndAccountActivity {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.OLrzqt;
            }
            return activity.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Activity) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ChooseTypeAndAccountActivity.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final ChooseTypeAndAccountActivity OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Failure") ? ActionBar.AEQbTJ : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Success") ? StateListAnimator.AEQbTJ : new Activity(str);
        }
    }
}
