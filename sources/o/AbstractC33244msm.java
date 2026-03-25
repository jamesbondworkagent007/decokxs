package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33244msm {
    public AbstractC33247msp EZpvd;
    public final java.lang.String copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public static final InterfaceC56387yDm<java.util.List<AbstractC33244msm>> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.msl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC33244msm.OLrzqt();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.msm.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC33244msm(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull AbstractC33247msp abstractC33247msp) {
        Intrinsics.checkNotNullParameter(abstractC33247msp, "");
        this.EZpvd = abstractC33247msp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.copydefault;
    }

    public AbstractC33244msm(java.lang.String str) {
        this.copydefault = str;
    }

    public final AbstractC33247msp KWHzl() {
        AbstractC33247msp abstractC33247msp = this.EZpvd;
        if (abstractC33247msp != null) {
            return abstractC33247msp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void AEQbTJ(@NotNull AbstractC33247msp abstractC33247msp) {
        Intrinsics.checkNotNullParameter(abstractC33247msp, "");
        OLrzqt(abstractC33247msp);
    }

    /* JADX INFO: renamed from: o.msm$Application */
    public static final class Application extends AbstractC33244msm {
        public static final Application KWHzl = new Application();

        private Application() {
            super("exchange", null);
        }
    }

    /* JADX INFO: renamed from: o.msm$Fragment */
    public static final class Fragment extends AbstractC33244msm {
        public static final Fragment KWHzl = new Fragment();

        private Fragment() {
            super("simple", null);
        }
    }

    /* JADX INFO: renamed from: o.msm$ActionBar */
    public static final class ActionBar extends AbstractC33244msm {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
            super("advanced", null);
        }
    }

    /* JADX INFO: renamed from: o.msm$Activity */
    public static final class Activity extends AbstractC33244msm {
        public static final Activity KWHzl = new Activity();

        private Activity() {
            super("legacy", null);
        }
    }

    /* JADX INFO: renamed from: o.msm$PendingIntent */
    public static final class PendingIntent extends AbstractC33244msm {
        public static final PendingIntent KWHzl = new PendingIntent();

        private PendingIntent() {
            super("wallet", null);
        }
    }

    /* JADX INFO: renamed from: o.msm$TaskDescription */
    public static final class TaskDescription extends AbstractC33244msm {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
            super("pay", null);
        }
    }

    /* JADX INFO: renamed from: o.msm$Dialog */
    public static final class Dialog extends AbstractC33244msm {
        public static final Dialog KWHzl = new Dialog();

        private Dialog() {
            super("unknown", null);
        }
    }

    /* JADX INFO: renamed from: o.msm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.msm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.util.List<AbstractC33244msm> EZpvd() {
            return (java.util.List) AbstractC33244msm.OLrzqt.getValue();
        }

        public final AbstractC33244msm OLrzqt(java.lang.String str) {
            java.lang.Object next;
            java.util.Iterator<T> it = EZpvd().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC33244msm) next).EZpvd(), (java.lang.Object) str)) {
                    break;
                }
            }
            return (AbstractC33244msm) next;
        }

        public final AbstractC33244msm AEQbTJ(java.lang.String str) {
            return OLrzqt(str);
        }
    }

    public static final java.util.List OLrzqt() {
        return yDY.gEmmrt(Application.KWHzl, Fragment.KWHzl, ActionBar.KWHzl, Activity.KWHzl, PendingIntent.KWHzl, TaskDescription.KWHzl);
    }
}
