package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dTK {
    public static final Activity Companion = new Activity(null);
    public final java.lang.String KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 java.lang.String) A[MD:(int, java.lang.String):void (m)] call: o.dTK.<init>(int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ dTK(int i, java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    public dTK(int i, java.lang.String str) {
        this.copydefault = i;
        this.KWHzl = str;
    }

    public static final class Fragment extends dTK {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int EZpvd = 0;

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTK.Fragment.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final int OLrzqt() {
                return Fragment.EZpvd;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str) {
            super(EZpvd, str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static class TaskDescription extends dTK {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(int i, @NotNull java.lang.String str) {
            super(i, str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static class ActionBar extends TaskDescription {
        public static final Application Companion = new Application(null);
        public static final int EZpvd = 1;

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTK.ActionBar.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }

            public final int EZpvd() {
                return ActionBar.EZpvd;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str, int i) {
            super(i, str);
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.dTK.ActionBar.EZpvd int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:20) call: o.dTK.ActionBar.<init>(java.lang.String, int):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? EZpvd : i);
        }
    }

    public static final class StateListAnimator extends ActionBar {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int OLrzqt = 2;

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTK.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final int EZpvd() {
                return StateListAnimator.OLrzqt;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(str, OLrzqt);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class Application extends TaskDescription {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int EZpvd = 3;

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTK.Application.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final int OLrzqt() {
                return Application.EZpvd;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str) {
            super(EZpvd, str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final dTK copydefault(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
            if (dtq != null && !dtq.OLrzqt(str)) {
                return new Fragment(str);
            }
            if (i == 0) {
                return new Fragment(str);
            }
            int i2 = 2;
            if (i == 1) {
                return new ActionBar(str, 0, i2, null);
            }
            if (i == 2) {
                return new StateListAnimator(str);
            }
            if (i == 3) {
                return new Application(str);
            }
            return new Fragment(str);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        dTK dtk = (dTK) obj;
        return this.copydefault == dtk.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dtk.KWHzl);
    }

    public int hashCode() {
        return (this.copydefault * 31) + this.KWHzl.hashCode();
    }
}
