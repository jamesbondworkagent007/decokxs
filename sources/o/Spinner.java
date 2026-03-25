package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public abstract class Spinner {
    public static final Application EZpvd = new Application(null);
    public static final java.util.List<Spinner> copydefault = yDY.gEmmrt(TaskDescription.AEQbTJ, Activity.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Spinner.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Spinner(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private Spinner() {
    }

    public static final class TaskDescription extends Spinner {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String KWHzl = "ALL";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.Spinner
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "All";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Activity extends Spinner {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String OLrzqt = "DEFAULT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.Spinner
        public java.lang.String EZpvd() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Default";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Spinner.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
