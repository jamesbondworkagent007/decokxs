package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.ocw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC36545ocw {

    /* JADX INFO: renamed from: o.ocw$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC36545ocw {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.ocw$Dialog */
    public static final class Dialog implements InterfaceC36545ocw {
        public static final Dialog EZpvd = new Dialog();

        private Dialog() {
        }
    }

    /* JADX INFO: renamed from: o.ocw$TaskDescription */
    public static final class TaskDescription implements InterfaceC36545ocw {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.ocw$Activity */
    public static final class Activity implements InterfaceC36545ocw {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.ocw$Application */
    public static final class Application implements InterfaceC36545ocw {
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.OLrzqt;
            }
            return application.EZpvd(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(boolean z) {
            return new Application(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && this.OLrzqt == ((Application) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LiveWithKeyboard(isLoading=" + this.OLrzqt + ")";
        }

        public Application(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:8) call: o.ocw.Application.<init>(boolean):void type: THIS */
        public /* synthetic */ Application(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.ocw$ActionBar */
    public static final class ActionBar implements InterfaceC36545ocw {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }
}
