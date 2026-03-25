package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public abstract class LoadedApk {
    public static final Activity EZpvd = new Activity(null);
    public static final java.util.List<LoadedApk> AEQbTJ = yDY.gEmmrt(ActionBar.OLrzqt, StateListAnimator.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LoadedApk.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LoadedApk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String AEQbTJ();

    private LoadedApk() {
    }

    public static final class ActionBar extends LoadedApk {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String KWHzl = "RESEND";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.LoadedApk
        public java.lang.String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Resend";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class StateListAnimator extends LoadedApk {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String copydefault = "SUPPRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.LoadedApk
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Suppress";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LoadedApk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
