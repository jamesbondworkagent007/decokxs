package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC33247msp;

/* JADX INFO: renamed from: o.mso, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33246mso {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final java.lang.String AEQbTJ;
    public final java.util.List<AbstractC33247msp> EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.util.List) A[MD:(java.lang.String, java.util.List<? extends o.msp>):void (m)] call: o.mso.<init>(java.lang.String, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC33246mso(java.lang.String str, java.util.List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33247msp> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.msp> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC33246mso(java.lang.String str, java.util.List<? extends AbstractC33247msp> list) {
        this.AEQbTJ = str;
        this.EZpvd = list;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC33247msp) it.next()).OLrzqt(this);
        }
    }

    /* JADX INFO: renamed from: o.mso$StateListAnimator */
    public static final class StateListAnimator extends AbstractC33246mso {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super("CeFi", yDY.gEmmrt(AbstractC33247msp.Activity.AEQbTJ, AbstractC33247msp.StateListAnimator.AEQbTJ), null);
        }
    }

    /* JADX INFO: renamed from: o.mso$TaskDescription */
    public static final class TaskDescription extends AbstractC33246mso {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
            super("DeFi", C56402yEa.EZpvd(AbstractC33247msp.TaskDescription.AEQbTJ), null);
        }
    }

    /* JADX INFO: renamed from: o.mso$ActionBar */
    public static final class ActionBar extends AbstractC33246mso {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
            super("Pay", C56402yEa.EZpvd(AbstractC33247msp.Application.AEQbTJ), null);
        }
    }

    /* JADX INFO: renamed from: o.mso$Activity */
    public static final class Activity extends AbstractC33246mso {
        public static final Activity copydefault = new Activity();

        private Activity() {
            super("Unknown", C56402yEa.EZpvd(AbstractC33247msp.Dialog.AEQbTJ), null);
        }
    }

    /* JADX INFO: renamed from: o.mso$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mso.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void copydefault() {
            StateListAnimator stateListAnimator = StateListAnimator.OLrzqt;
            TaskDescription taskDescription = TaskDescription.OLrzqt;
            ActionBar actionBar = ActionBar.copydefault;
            Activity activity = Activity.copydefault;
        }
    }
}
