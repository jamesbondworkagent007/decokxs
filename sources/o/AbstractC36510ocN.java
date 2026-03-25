package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.ocN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC36510ocN {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ocN.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC36510ocN(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.ocN$StateListAnimator */
    public static final class StateListAnimator extends AbstractC36510ocN {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    private AbstractC36510ocN() {
    }

    /* JADX INFO: renamed from: o.ocN$TaskDescription */
    public static final class TaskDescription extends AbstractC36510ocN {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ocN$Application */
    public static final class Application extends AbstractC36510ocN {
        public static final Application KWHzl = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ocN$ActionBar */
    public static final class ActionBar extends AbstractC36510ocN {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ocN$Activity */
    public static final class Activity extends AbstractC36510ocN {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ocN$FragmentManager */
    public static final class FragmentManager extends AbstractC36510ocN {
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = fragmentManager.copydefault;
            }
            return fragmentManager.AEQbTJ(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager AEQbTJ(int i) {
            return new FragmentManager(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && this.copydefault == ((FragmentManager) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TimerUpdate(timeText=" + this.copydefault + ")";
        }

        public FragmentManager(int i) {
            super(null);
            this.copydefault = i;
        }
    }
}
