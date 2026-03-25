package o;

/* JADX INFO: renamed from: o.adj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7115adj extends AbstractC7052acZ {
    public AbstractC7239agA values;

    @Override // o.AbstractC7052acZ
    public int djBIcL() {
        return this.values.EZpvd();
    }

    @Override // o.AbstractC7052acZ
    public int fetchVPNInfo() {
        return this.values.valueOf();
    }

    @Override // o.AbstractC7052acZ
    public int isConnected() {
        return this.values.AYXKKw();
    }

    @Override // o.AbstractC7052acZ
    public long AhwBna() {
        int iKWHzl = this.values.KWHzl();
        if (iKWHzl < 0) {
            return -4294967104L;
        }
        return OLrzqt(iKWHzl, this.djBIcL.EZpvd((char) iKWHzl));
    }

    @Override // o.AbstractC7052acZ
    public char valueOf() {
        int iKWHzl = this.values.KWHzl();
        if (!AbstractC7052acZ.EZpvd(iKWHzl) && iKWHzl >= 0) {
            this.values.copydefault();
        }
        return (char) iKWHzl;
    }

    @Override // o.AbstractC7052acZ
    public void AYXKKw(int i) {
        this.values.EZpvd(i);
    }

    @Override // o.AbstractC7052acZ
    public void AEQbTJ(int i) {
        this.values.EZpvd(-i);
    }
}
