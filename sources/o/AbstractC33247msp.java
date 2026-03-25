package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33247msp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final java.util.List<AbstractC33244msm> EZpvd;
    public final java.lang.String OLrzqt;
    public AbstractC33246mso copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.util.List) A[MD:(java.lang.String, java.util.List<? extends o.msm>):void (m)] call: o.msp.<init>(java.lang.String, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC33247msp(java.lang.String str, java.util.List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33244msm> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AbstractC33246mso abstractC33246mso) {
        Intrinsics.checkNotNullParameter(abstractC33246mso, "");
        this.copydefault = abstractC33246mso;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.msm> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC33247msp(java.lang.String str, java.util.List<? extends AbstractC33244msm> list) {
        this.OLrzqt = str;
        this.EZpvd = list;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC33244msm) it.next()).AEQbTJ(this);
        }
    }

    public final AbstractC33246mso OLrzqt() {
        AbstractC33246mso abstractC33246mso = this.copydefault;
        if (abstractC33246mso != null) {
            return abstractC33246mso;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void OLrzqt(@NotNull AbstractC33246mso abstractC33246mso) {
        Intrinsics.checkNotNullParameter(abstractC33246mso, "");
        copydefault(abstractC33246mso);
    }

    /* JADX INFO: renamed from: o.msp$Activity */
    public static final class Activity extends AbstractC33247msp {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
            super("Pro", C56402yEa.EZpvd(AbstractC33244msm.Application.KWHzl), null);
        }
    }

    /* JADX INFO: renamed from: o.msp$StateListAnimator */
    public static final class StateListAnimator extends AbstractC33247msp {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
            super("Lite", yDY.gEmmrt(AbstractC33244msm.Activity.KWHzl, AbstractC33244msm.Fragment.KWHzl, AbstractC33244msm.ActionBar.KWHzl), null);
        }
    }

    /* JADX INFO: renamed from: o.msp$TaskDescription */
    public static final class TaskDescription extends AbstractC33247msp {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
            super("OnChain", C56402yEa.EZpvd(AbstractC33244msm.PendingIntent.KWHzl), null);
        }
    }

    /* JADX INFO: renamed from: o.msp$Application */
    public static final class Application extends AbstractC33247msp {
        public static final Application AEQbTJ = new Application();

        private Application() {
            super("Pay", C56402yEa.EZpvd(AbstractC33244msm.TaskDescription.KWHzl), null);
        }
    }

    /* JADX INFO: renamed from: o.msp$Dialog */
    public static final class Dialog extends AbstractC33247msp {
        public static final Dialog AEQbTJ = new Dialog();

        private Dialog() {
            super("Unknown", C56402yEa.EZpvd(AbstractC33244msm.Dialog.KWHzl), null);
        }
    }

    /* JADX INFO: renamed from: o.msp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.msp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
