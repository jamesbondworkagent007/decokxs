package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ltq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC31430ltq {

    /* JADX INFO: renamed from: o.ltq$ActionBar */
    public static final class ActionBar implements InterfaceC31430ltq {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.ltq$TaskDescription */
    public static final class TaskDescription implements InterfaceC31430ltq {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.ltq$Activity */
    public static final class Activity implements InterfaceC31430ltq {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.ltq$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC31430ltq {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.ltq$Application */
    public static final class Application implements InterfaceC31430ltq {
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            return application.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(java.lang.String str) {
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Application) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AccountRemoveFailed(errorMessage=" + this.KWHzl + ")";
        }

        public Application(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:8) call: o.ltq.Application.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: o.ltq$FragmentManager */
    public static final class FragmentManager implements InterfaceC31430ltq {
        public static final FragmentManager EZpvd = new FragmentManager();

        private FragmentManager() {
        }
    }

    /* JADX INFO: renamed from: o.ltq$Dialog */
    public static final class Dialog implements InterfaceC31430ltq {
        public static final Dialog OLrzqt = new Dialog();

        private Dialog() {
        }
    }

    /* JADX INFO: renamed from: o.ltq$LoaderManager */
    public static final class LoaderManager implements InterfaceC31430ltq {
        public static final LoaderManager EZpvd = new LoaderManager();

        private LoaderManager() {
        }
    }

    /* JADX INFO: renamed from: o.ltq$PendingIntent */
    public static final class PendingIntent implements InterfaceC31430ltq {
        public java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.AEQbTJ;
            }
            return pendingIntent.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent OLrzqt(java.lang.String str) {
            return new PendingIntent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((PendingIntent) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AddAccountError(errorMessage=" + this.AEQbTJ + ")";
        }

        public PendingIntent(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:12) call: o.ltq.PendingIntent.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ PendingIntent(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
