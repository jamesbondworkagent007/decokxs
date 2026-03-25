package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC9357bU {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final java.util.List<AbstractC9357bU> copydefault = yDY.gEmmrt(StateListAnimator.EZpvd, ActionBar.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bU.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC9357bU(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String KWHzl();

    private AbstractC9357bU() {
    }

    /* JADX INFO: renamed from: o.bU$StateListAnimator */
    public static final class StateListAnimator extends AbstractC9357bU {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "ConnectedHomeMinConfidence";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC9357bU
        public java.lang.String KWHzl() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ConnectedHomeMinConfidence";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bU$ActionBar */
    public static final class ActionBar extends AbstractC9357bU {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String EZpvd = "RegionsOfInterest";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC9357bU
        public java.lang.String KWHzl() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RegionsOfInterest";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
