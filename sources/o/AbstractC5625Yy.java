package o;

/* JADX INFO: renamed from: o.Yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5625Yy<T> {
    public T AEQbTJ;
    public TaskDescription<T> EZpvd;
    public int KWHzl;
    public TaskDescription<T> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.KWHzl;
    }

    public abstract T OLrzqt(int i);

    public T OLrzqt() {
        KWHzl();
        T t = this.AEQbTJ;
        return t == null ? OLrzqt(12) : t;
    }

    public final T AEQbTJ(T t, int i) {
        TaskDescription<T> taskDescription = new TaskDescription<>(t, i);
        if (this.copydefault == null) {
            this.EZpvd = taskDescription;
            this.copydefault = taskDescription;
        } else {
            this.EZpvd.AEQbTJ(taskDescription);
            this.EZpvd = taskDescription;
        }
        this.KWHzl += i;
        return OLrzqt(i < 16384 ? i + i : i + (i >> 2));
    }

    public T EZpvd(T t, int i) {
        int i2 = this.KWHzl + i;
        T tOLrzqt = OLrzqt(i2);
        int iOLrzqt = 0;
        for (TaskDescription<T> taskDescriptionEZpvd = this.copydefault; taskDescriptionEZpvd != null; taskDescriptionEZpvd = taskDescriptionEZpvd.EZpvd()) {
            iOLrzqt = taskDescriptionEZpvd.OLrzqt(tOLrzqt, iOLrzqt);
        }
        java.lang.System.arraycopy(t, 0, tOLrzqt, iOLrzqt, i);
        int i3 = iOLrzqt + i;
        if (i3 == i2) {
            return tOLrzqt;
        }
        throw new java.lang.IllegalStateException("Should have gotten " + i2 + " entries, got " + i3);
    }

    public void KWHzl() {
        TaskDescription<T> taskDescription = this.EZpvd;
        if (taskDescription != null) {
            this.AEQbTJ = taskDescription.KWHzl();
        }
        this.EZpvd = null;
        this.copydefault = null;
        this.KWHzl = 0;
    }

    /* JADX INFO: renamed from: o.Yy$TaskDescription */
    public static final class TaskDescription<T> {
        public TaskDescription<T> AEQbTJ;
        public final T OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription<T> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public T KWHzl() {
            return this.OLrzqt;
        }

        public TaskDescription(T t, int i) {
            this.OLrzqt = t;
            this.copydefault = i;
        }

        public int OLrzqt(T t, int i) {
            java.lang.System.arraycopy(this.OLrzqt, 0, t, i, this.copydefault);
            return i + this.copydefault;
        }

        public void AEQbTJ(TaskDescription<T> taskDescription) {
            if (this.AEQbTJ != null) {
                throw new java.lang.IllegalStateException();
            }
            this.AEQbTJ = taskDescription;
        }
    }
}
