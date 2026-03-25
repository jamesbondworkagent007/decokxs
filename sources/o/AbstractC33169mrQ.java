package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C33238msg;

/* JADX INFO: renamed from: o.mrQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC33169mrQ {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mrQ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC33169mrQ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC33169mrQ() {
    }

    /* JADX INFO: renamed from: o.mrQ$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends AbstractC33169mrQ {
        public static final Application OLrzqt = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.mrQ$TaskDescription */
    public static final class TaskDescription extends AbstractC33169mrQ {
        public final int AEQbTJ;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public TaskDescription() {
            int i = 0;
            this(i, i, 3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = taskDescription.copydefault;
            }
            if ((i3 & 2) != 0) {
                i2 = taskDescription.AEQbTJ;
            }
            return taskDescription.KWHzl(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
            return new TaskDescription(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.copydefault == taskDescription.copydefault && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Tab(leftResId=" + this.copydefault + ", rightResId=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.msg.Application.EZpvd int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.msg.Application.copydefault int) : (r2v0 int))
 A[MD:(int, int):void (m)] (LINE:47) call: o.mrQ.TaskDescription.<init>(int, int):void type: THIS */
        public /* synthetic */ TaskDescription(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? C33238msg.Application.EZpvd : i, (i3 & 2) != 0 ? C33238msg.Application.copydefault : i2);
        }

        public TaskDescription(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
            super(null);
            this.copydefault = i;
            this.AEQbTJ = i2;
        }
    }
}
