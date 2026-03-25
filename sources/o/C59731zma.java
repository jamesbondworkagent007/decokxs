package o;

/* JADX INFO: renamed from: o.zma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59731zma implements InterfaceC59808zny {
    public final C59737zmg AEQbTJ;
    public final InterfaceC59808zny EZpvd;
    public final java.lang.String KWHzl;

    public C59731zma(InterfaceC59808zny interfaceC59808zny, C59737zmg c59737zmg, java.lang.String str) {
        this.EZpvd = interfaceC59808zny;
        this.AEQbTJ = c59737zmg;
        this.KWHzl = str == null ? C59514ziV.EZpvd.name() : str;
    }

    @Override // o.InterfaceC59808zny
    public void OLrzqt(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.EZpvd.OLrzqt(bArr, i, i2);
        if (this.AEQbTJ.AEQbTJ()) {
            this.AEQbTJ.EZpvd(bArr, i, i2);
        }
    }

    @Override // o.InterfaceC59808zny
    public void AEQbTJ(int i) throws java.io.IOException {
        this.EZpvd.AEQbTJ(i);
        if (this.AEQbTJ.AEQbTJ()) {
            this.AEQbTJ.EZpvd(i);
        }
    }

    @Override // o.InterfaceC59808zny
    public void OLrzqt() throws java.io.IOException {
        this.EZpvd.OLrzqt();
    }

    @Override // o.InterfaceC59808zny
    public void copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer) throws java.io.IOException {
        this.EZpvd.copydefault(charArrayBuffer);
        if (this.AEQbTJ.AEQbTJ()) {
            this.AEQbTJ.AEQbTJ((new java.lang.String(charArrayBuffer.buffer(), 0, charArrayBuffer.length()) + "\r\n").getBytes(this.KWHzl));
        }
    }

    @Override // o.InterfaceC59808zny
    public void KWHzl(java.lang.String str) throws java.io.IOException {
        this.EZpvd.KWHzl(str);
        if (this.AEQbTJ.AEQbTJ()) {
            this.AEQbTJ.AEQbTJ((str + "\r\n").getBytes(this.KWHzl));
        }
    }

    @Override // o.InterfaceC59808zny
    public InterfaceC59809znz EZpvd() {
        return this.EZpvd.EZpvd();
    }
}
