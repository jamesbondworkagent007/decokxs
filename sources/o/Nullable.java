package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Nullable {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public static final java.util.List<Nullable> KWHzl = yDY.gEmmrt(StateListAnimator.EZpvd, Application.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Nullable.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Nullable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String OLrzqt();

    private Nullable() {
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class StateListAnimator extends Nullable {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String OLrzqt = "not_remembered";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.Nullable
        public java.lang.String OLrzqt() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NotRemembered";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application extends Nullable {
        public static final Application copydefault = new Application();
        public static final java.lang.String OLrzqt = "remembered";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.Nullable
        public java.lang.String OLrzqt() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Remembered";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Nullable.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
