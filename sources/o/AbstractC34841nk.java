package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC34841nk {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final java.util.List<AbstractC34841nk> copydefault = yDY.gEmmrt(StateListAnimator.OLrzqt, Application.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nk.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC34841nk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private AbstractC34841nk() {
    }

    /* JADX INFO: renamed from: o.nk$StateListAnimator */
    public static final class StateListAnimator extends AbstractC34841nk {
        public static final StateListAnimator OLrzqt = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "FreeOfAdultContent";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC34841nk
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FreeOfAdultContent";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nk$Application */
    public static final class Application extends AbstractC34841nk {
        public static final Application EZpvd = new Application();
        public static final java.lang.String AEQbTJ = "FreeOfPersonallyIdentifiableInformation";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC34841nk
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FreeOfPersonallyIdentifiableInformation";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nk$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
