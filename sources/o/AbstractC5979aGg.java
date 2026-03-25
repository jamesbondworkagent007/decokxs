package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.aGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC5979aGg {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aGg.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC5979aGg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.aGg$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator extends AbstractC5979aGg {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    private AbstractC5979aGg() {
    }

    /* JADX INFO: renamed from: o.aGg$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription extends AbstractC5979aGg {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aGg$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity extends AbstractC5979aGg {
        public static final Activity EZpvd = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aGg$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application extends AbstractC5979aGg {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        public Application(java.lang.String str) {
            super(null);
            this.copydefault = str;
        }
    }
}
