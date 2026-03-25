package o;

/* JADX INFO: renamed from: o.afK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7196afK {
    public byte AEQbTJ;
    public int EZpvd;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return (this.AEQbTJ & 1) == 0;
    }

    public C7196afK() {
        this(0, 0, (byte) 0);
    }

    public C7196afK(int i, int i2, byte b) {
        this.OLrzqt = i;
        this.EZpvd = i2;
        this.AEQbTJ = b;
    }

    public void OLrzqt(C7196afK c7196afK) {
        this.OLrzqt = c7196afK.OLrzqt;
        this.EZpvd = c7196afK.EZpvd;
        this.AEQbTJ = c7196afK.AEQbTJ;
        this.copydefault = c7196afK.copydefault;
    }

    public java.lang.String toString() {
        return "BidiRun " + this.OLrzqt + " - " + this.EZpvd + " @ " + ((int) this.AEQbTJ);
    }
}
