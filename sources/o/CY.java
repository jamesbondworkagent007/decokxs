package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CY implements InterfaceC5056Da {
    public final TaskDescription copydefault = new TaskDescription();

    public static final class TaskDescription {
        public boolean KWHzl;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.KWHzl = z;
        }
    }

    @Override // o.InterfaceC5056Da
    public void KWHzl() {
        synchronized (this.copydefault) {
            if (!(!this.copydefault.EZpvd())) {
                throw new java.lang.IllegalStateException("caller attempted to share() a fully unshared object".toString());
            }
            TaskDescription taskDescription = this.copydefault;
            taskDescription.copydefault(taskDescription.KWHzl() + 1);
        }
    }

    @Override // o.InterfaceC5056Da
    public boolean AEQbTJ() {
        synchronized (this.copydefault) {
            if (this.copydefault.EZpvd()) {
                return false;
            }
            TaskDescription taskDescription = this.copydefault;
            taskDescription.copydefault(taskDescription.KWHzl() - 1);
            if (this.copydefault.KWHzl() > 0) {
                return false;
            }
            this.copydefault.copydefault(true);
            return true;
        }
    }
}
