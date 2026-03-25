package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.ArI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC3718ArI {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ArI.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC3718ArI(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3718ArI() {
    }

    /* JADX INFO: renamed from: o.ArI$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator extends AbstractC3718ArI {
        public static final int $stable = 0;
        public static final StateListAnimator INSTANCE = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ArI$PendingIntent */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class PendingIntent extends AbstractC3718ArI {
        public static final int $stable = 0;
        public static final PendingIntent INSTANCE = new PendingIntent();

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ArI$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar extends AbstractC3718ArI {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ArI$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity extends AbstractC3718ArI {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ArI$LoaderManager */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class LoaderManager extends AbstractC3718ArI {
        public static final int $stable = 0;
        public static final LoaderManager INSTANCE = new LoaderManager();

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ArI$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application extends AbstractC3718ArI {
        public static final int $stable = 0;
        public static final Application INSTANCE = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ArI$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription extends AbstractC3718ArI {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ArI$Dialog */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Dialog extends AbstractC3718ArI {
        public static final int $stable = 0;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = dialog.OLrzqt;
            }
            return dialog.OLrzqt(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog OLrzqt(int i) {
            return new Dialog(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && this.OLrzqt == ((Dialog) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Unknown(code=" + this.OLrzqt + ")";
        }

        public Dialog(int i) {
            super(null);
            this.OLrzqt = i;
        }
    }
}
