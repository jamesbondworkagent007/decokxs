package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pUV {
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public interface TaskDescription {

        public static final class StateListAnimator {
            public static boolean copydefault(@NotNull TaskDescription taskDescription) {
                return true;
            }
        }

        boolean KWHzl();

        boolean OLrzqt();

        java.lang.String copydefault();
    }

    public pUV(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = z;
        this.KWHzl = z2;
        this.copydefault = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, boolean, boolean, boolean):void (m)] (LINE:3) call: o.pUV.<init>(java.lang.String, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ pUV(java.lang.String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3);
    }

    public final void AEQbTJ(@NotNull TaskDescription taskDescription) {
        Application application;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (!this.KWHzl) {
            application = Application.C0915Application.OLrzqt;
        } else if (!taskDescription.KWHzl()) {
            application = Application.ActionBar.KWHzl;
        } else {
            application = taskDescription.OLrzqt() ? Application.StateListAnimator.KWHzl : Application.TaskDescription.EZpvd;
        }
        OLrzqt(taskDescription.copydefault(), application);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String str2 = "【" + this.EZpvd + "】- " + str + " " + application.copydefault();
        if (Intrinsics.EZpvd(application, Application.StateListAnimator.KWHzl)) {
            pUU.KWHzl("OKVerifyLog", str2);
            return;
        }
        if (Intrinsics.EZpvd(application, Application.TaskDescription.EZpvd)) {
            pUU.copydefault("OKVerifyLog", str2);
        } else if (Intrinsics.EZpvd(application, Application.ActionBar.KWHzl)) {
            pUU.valueOf("OKVerifyLog", str2);
        } else {
            if (!Intrinsics.EZpvd(application, Application.C0915Application.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.KWHzl("OKVerifyLog", str2);
        }
    }

    public final pUV EZpvd(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AEQbTJ((TaskDescription) new Dialog(obj.toString()));
        return this;
    }

    public final pUV copydefault(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AEQbTJ((TaskDescription) new StateListAnimator(obj.toString(), true, this.OLrzqt));
        return this;
    }

    public final pUV AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AEQbTJ((TaskDescription) new StateListAnimator(obj.toString(), false, this.OLrzqt));
        return this;
    }

    public static abstract class Activity implements TaskDescription {
        public final boolean copydefault;

        public abstract boolean AEQbTJ();

        public Activity(boolean z) {
            this.copydefault = z;
        }

        @Override // o.pUV.TaskDescription
        public boolean KWHzl() {
            return TaskDescription.StateListAnimator.copydefault(this);
        }

        @Override // o.pUV.TaskDescription
        public boolean OLrzqt() {
            if (this.copydefault) {
                return !AEQbTJ();
            }
            return AEQbTJ();
        }
    }

    public static final class Dialog implements TaskDescription {
        public final java.lang.String copydefault;

        @Override // o.pUV.TaskDescription
        public boolean KWHzl() {
            return false;
        }

        @Override // o.pUV.TaskDescription
        public boolean OLrzqt() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.pUV.TaskDescription
        public java.lang.String copydefault() {
            return this.copydefault;
        }

        public Dialog(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    public static final class StateListAnimator extends Activity {
        public final java.lang.String AEQbTJ;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.pUV.Activity
        public boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.pUV.TaskDescription
        public java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, boolean z, boolean z2) {
            super(z2);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.KWHzl = z;
        }
    }

    public static abstract class Application {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.pUV.Application.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public static final class StateListAnimator extends Application {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            private StateListAnimator() {
                super("✅", null);
            }
        }

        public Application(java.lang.String str) {
            this.copydefault = str;
        }

        public static final class TaskDescription extends Application {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
                super("❌", null);
            }
        }

        public static final class ActionBar extends Application {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
                super("👀", null);
            }
        }

        /* JADX INFO: renamed from: o.pUV$Application$Application, reason: collision with other inner class name */
        public static final class C0915Application extends Application {
            public static final C0915Application OLrzqt = new C0915Application();

            private C0915Application() {
                super("↩️", null);
            }
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pUV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
