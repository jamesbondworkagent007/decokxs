package o;

/* JADX INFO: renamed from: o.bmq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC10354bmq {

    /* JADX INFO: renamed from: o.bmq$Application */
    public static final class Application implements InterfaceC10354bmq {
        public static final Application copydefault = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.bmq$TaskDescription */
    public static final class TaskDescription implements InterfaceC10354bmq {
        public final boolean AEQbTJ;
        public final int KWHzl;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, long j, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.KWHzl;
            }
            if ((i2 & 2) != 0) {
                j = taskDescription.copydefault;
            }
            if ((i2 & 4) != 0) {
                z = taskDescription.AEQbTJ;
            }
            return taskDescription.OLrzqt(i, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(int i, long j, boolean z) {
            return new TaskDescription(i, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
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
            return this.KWHzl == taskDescription.KWHzl && this.copydefault == taskDescription.copydefault && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NormalActionSuccess(itemCount=" + this.KWHzl + ", tokenAmount=" + this.copydefault + ", isLocking=" + this.AEQbTJ + ")";
        }

        public TaskDescription(int i, long j, boolean z) {
            this.KWHzl = i;
            this.copydefault = j;
            this.AEQbTJ = z;
        }
    }
}
