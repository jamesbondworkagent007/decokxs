package o;

/* JADX INFO: renamed from: o.zjD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59549zjD implements java.lang.Cloneable {
    public static final C59549zjD OLrzqt = new TaskDescription().EZpvd();
    public final int EZpvd;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.KWHzl;
    }

    public C59549zjD(int i, int i2) {
        this.EZpvd = i;
        this.KWHzl = i2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C59549zjD clone() throws java.lang.CloneNotSupportedException {
        return (C59549zjD) super.clone();
    }

    public java.lang.String toString() {
        return "[maxLineLength=" + this.EZpvd + ", maxHeaderCount=" + this.KWHzl + "]";
    }

    public static TaskDescription EZpvd() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.zjD$TaskDescription */
    public static class TaskDescription {
        public int OLrzqt = -1;
        public int copydefault = -1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription EZpvd(int i) {
            this.OLrzqt = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription KWHzl(int i) {
            this.copydefault = i;
            return this;
        }

        public C59549zjD EZpvd() {
            return new C59549zjD(this.OLrzqt, this.copydefault);
        }
    }
}
