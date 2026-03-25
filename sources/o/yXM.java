package o;

/* JADX INFO: loaded from: classes13.dex */
public class yXM {
    public volatile yXQ AEQbTJ;
    public yXE KWHzl;
    public yXD OLrzqt;
    public volatile boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yXQ copydefault(yXQ yxq) {
        yXQ yxq2 = this.AEQbTJ;
        this.AEQbTJ = yxq;
        this.OLrzqt = null;
        this.copydefault = true;
        return yxq2;
    }

    public yXQ OLrzqt(yXQ yxq) {
        AEQbTJ(yxq);
        return this.AEQbTJ;
    }

    public int AEQbTJ() {
        if (this.copydefault) {
            return this.AEQbTJ.getSerializedSize();
        }
        return this.OLrzqt.EZpvd();
    }

    public void AEQbTJ(yXQ yxq) {
        if (this.AEQbTJ != null) {
            return;
        }
        synchronized (this) {
            if (this.AEQbTJ != null) {
                return;
            }
            try {
                if (this.OLrzqt != null) {
                    yxq = yxq.getParserForType().copydefault(this.OLrzqt, this.KWHzl);
                }
                this.AEQbTJ = yxq;
            } catch (java.io.IOException unused) {
            }
        }
    }
}
