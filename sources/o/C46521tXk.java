package o;

/* JADX INFO: renamed from: o.tXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46521tXk implements InterfaceC46522tXl {
    public final int KWHzl = 100;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.KWHzl;
    }

    public C46521tXk(int i) {
        this.copydefault = i;
    }

    @Override // o.InterfaceC46522tXl
    public int copydefault() {
        int i = this.copydefault;
        if (i >= 0 && i <= 99) {
            return AEQbTJ() + this.copydefault;
        }
        if (i > 99) {
            return AEQbTJ() + 99;
        }
        return AEQbTJ();
    }
}
