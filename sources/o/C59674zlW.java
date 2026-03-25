package o;

/* JADX INFO: renamed from: o.zlW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59674zlW implements InterfaceC59758znA, InterfaceC59803znt {
    public final InterfaceC59803znt AEQbTJ;
    public final C59737zmg KWHzl;
    public final java.lang.String OLrzqt;
    public final InterfaceC59758znA copydefault;

    public C59674zlW(InterfaceC59758znA interfaceC59758znA, C59737zmg c59737zmg, java.lang.String str) {
        this.copydefault = interfaceC59758znA;
        this.AEQbTJ = interfaceC59758znA instanceof InterfaceC59803znt ? (InterfaceC59803znt) interfaceC59758znA : null;
        this.KWHzl = c59737zmg;
        this.OLrzqt = str == null ? C59514ziV.EZpvd.name() : str;
    }

    @Override // o.InterfaceC59758znA
    public boolean copydefault(int i) throws java.io.IOException {
        return this.copydefault.copydefault(i);
    }

    @Override // o.InterfaceC59758znA
    public int EZpvd(byte[] bArr, int i, int i2) throws java.io.IOException {
        int iEZpvd = this.copydefault.EZpvd(bArr, i, i2);
        if (this.KWHzl.AEQbTJ() && iEZpvd > 0) {
            this.KWHzl.KWHzl(bArr, i, iEZpvd);
        }
        return iEZpvd;
    }

    @Override // o.InterfaceC59758znA
    public int KWHzl() throws java.io.IOException {
        int iKWHzl = this.copydefault.KWHzl();
        if (this.KWHzl.AEQbTJ() && iKWHzl != -1) {
            this.KWHzl.OLrzqt(iKWHzl);
        }
        return iKWHzl;
    }

    @Override // o.InterfaceC59758znA
    public int EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer) throws java.io.IOException {
        int iEZpvd = this.copydefault.EZpvd(charArrayBuffer);
        if (this.KWHzl.AEQbTJ() && iEZpvd >= 0) {
            this.KWHzl.copydefault((new java.lang.String(charArrayBuffer.buffer(), charArrayBuffer.length() - iEZpvd, iEZpvd) + "\r\n").getBytes(this.OLrzqt));
        }
        return iEZpvd;
    }

    @Override // o.InterfaceC59758znA
    public InterfaceC59809znz AEQbTJ() {
        return this.copydefault.AEQbTJ();
    }

    @Override // o.InterfaceC59803znt
    public boolean copydefault() {
        InterfaceC59803znt interfaceC59803znt = this.AEQbTJ;
        if (interfaceC59803znt != null) {
            return interfaceC59803znt.copydefault();
        }
        return false;
    }
}
