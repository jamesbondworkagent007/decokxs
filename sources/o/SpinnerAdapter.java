package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SpinnerAdapter {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public static final java.util.List<SpinnerAdapter> EZpvd = yDY.gEmmrt(TaskDescription.KWHzl, Activity.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SpinnerAdapter.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SpinnerAdapter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private SpinnerAdapter() {
    }

    public static final class TaskDescription extends SpinnerAdapter {
        public static final TaskDescription KWHzl = new TaskDescription();
        public static final java.lang.String AEQbTJ = "INDEX";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SpinnerAdapter
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Index";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Activity extends SpinnerAdapter {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String KWHzl = "TIMESTAMP";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SpinnerAdapter
        public java.lang.String copydefault() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Timestamp";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SpinnerAdapter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
