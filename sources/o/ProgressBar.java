package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ProgressBar {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public static final java.util.List<ProgressBar> EZpvd = yDY.gEmmrt(ActionBar.copydefault, TaskDescription.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ProgressBar.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ProgressBar(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String AEQbTJ();

    private ProgressBar() {
    }

    public static final class ActionBar extends ProgressBar {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String AEQbTJ = "GENERAL_LABELS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ProgressBar
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GeneralLabels";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class TaskDescription extends ProgressBar {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String copydefault = "IMAGE_PROPERTIES";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ProgressBar
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ImageProperties";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ProgressBar.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
