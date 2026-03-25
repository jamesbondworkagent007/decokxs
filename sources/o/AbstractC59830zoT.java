package o;

/* JADX INFO: renamed from: o.zoT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59830zoT implements InterfaceC59833zoW {
    public int AEQbTJ;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59833zoW
    public void AEQbTJ(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59833zoW
    public void OLrzqt(int i) {
        this.copydefault = i;
    }

    public java.lang.String toString() {
        return "(line=" + AEQbTJ() + ", col=" + EZpvd() + ")";
    }
}
