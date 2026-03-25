package o;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.aJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC6105aJ {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public static final java.util.List<AbstractC6105aJ> KWHzl = yDY.gEmmrt(Activity.EZpvd, ActionBar.copydefault, StateListAnimator.OLrzqt, Application.OLrzqt, LoaderManager.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aJ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC6105aJ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private AbstractC6105aJ() {
    }

    /* JADX INFO: renamed from: o.aJ$Activity */
    public static final class Activity extends AbstractC6105aJ {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String OLrzqt = "AUTO";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC6105aJ
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Auto";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aJ$ActionBar */
    public static final class ActionBar extends AbstractC6105aJ {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String EZpvd = VerifyDAppDomainUrlResponse.LEVEL_HIGH;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC6105aJ
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "High";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aJ$StateListAnimator */
    public static final class StateListAnimator extends AbstractC6105aJ {
        public static final StateListAnimator OLrzqt = new StateListAnimator();
        public static final java.lang.String copydefault = VerifyDAppDomainUrlResponse.LEVEL_LOW;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC6105aJ
        public java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Low";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aJ$Application */
    public static final class Application extends AbstractC6105aJ {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String copydefault = VerifyDAppDomainUrlResponse.LEVEL_MEDIUM;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC6105aJ
        public java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Medium";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aJ$LoaderManager */
    public static final class LoaderManager extends AbstractC6105aJ {
        public static final LoaderManager OLrzqt = new LoaderManager();
        public static final java.lang.String EZpvd = "NONE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC6105aJ
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "None";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aJ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
