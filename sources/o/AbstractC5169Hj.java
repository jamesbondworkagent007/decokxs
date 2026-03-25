package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.Hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5169Hj {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Hj.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC5169Hj(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.Hj$TaskDescription */
    public static final class TaskDescription extends AbstractC5169Hj {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "incomplete input";
        }

        private TaskDescription() {
            super(null);
        }
    }

    private AbstractC5169Hj() {
    }

    /* JADX INFO: renamed from: o.Hj$Activity */
    public static final class Activity extends AbstractC5169Hj {
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.copydefault;
            }
            return activity.AEQbTJ(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(int i) {
            return new Activity(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && this.copydefault == ((Activity) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.copydefault);
        }

        public Activity(int i) {
            super(null);
            this.copydefault = i;
        }

        public java.lang.String toString() {
            return "incomplete input needed (" + this.copydefault + ')';
        }
    }
}
