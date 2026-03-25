package o;

/* JADX INFO: renamed from: o.yts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58047yts {
    public int EZpvd = 1;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(long j) {
        this.EZpvd++;
        this.copydefault = (int) (((long) this.copydefault) + j);
    }

    public C58047yts(int i, int i2, int i3) {
        this.OLrzqt = i;
        this.copydefault = i2;
        this.KWHzl = i3;
    }

    public java.lang.String toString() {
        return this.KWHzl + "," + this.OLrzqt + "," + this.EZpvd + "," + this.copydefault;
    }

    public java.lang.String OLrzqt() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < this.KWHzl; i++) {
            stringBuffer.append('.');
        }
        return stringBuffer.toString() + this.OLrzqt + " " + this.EZpvd + " " + this.copydefault;
    }
}
