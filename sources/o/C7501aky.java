package o;

/* JADX INFO: renamed from: o.aky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7501aky {
    public long OLrzqt = 0;
    public final C7918asr EZpvd = new C7918asr();

    public long copydefault(int i, int i2) {
        int iOLrzqt = this.EZpvd.OLrzqt(i);
        if (iOLrzqt < 0) {
            long j = this.OLrzqt;
            this.OLrzqt = 1 + j;
            this.EZpvd.EZpvd(i, j);
            return j;
        }
        return this.EZpvd.AEQbTJ(iOLrzqt);
    }

    public void OLrzqt(int i) {
        int iOLrzqt = this.EZpvd.OLrzqt(i);
        if (iOLrzqt >= 0) {
            this.EZpvd.copydefault(iOLrzqt);
        }
    }

    public void KWHzl() {
        this.EZpvd.copydefault();
    }
}
