package o;

/* JADX INFO: renamed from: o.znk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59794znk extends java.io.OutputStream {
    public boolean AEQbTJ;
    public int EZpvd;
    public boolean KWHzl;
    public final byte[] OLrzqt;
    public final InterfaceC59808zny copydefault;

    @java.lang.Deprecated
    public C59794znk(InterfaceC59808zny interfaceC59808zny) throws java.io.IOException {
        this(2048, interfaceC59808zny);
    }

    public C59794znk(int i, InterfaceC59808zny interfaceC59808zny) {
        this.EZpvd = 0;
        this.KWHzl = false;
        this.AEQbTJ = false;
        this.OLrzqt = new byte[i];
        this.copydefault = interfaceC59808zny;
    }

    public void KWHzl() throws java.io.IOException {
        int i = this.EZpvd;
        if (i > 0) {
            this.copydefault.KWHzl(java.lang.Integer.toHexString(i));
            this.copydefault.OLrzqt(this.OLrzqt, 0, this.EZpvd);
            this.copydefault.KWHzl("");
            this.EZpvd = 0;
        }
    }

    public void OLrzqt(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.copydefault.KWHzl(java.lang.Integer.toHexString(this.EZpvd + i2));
        this.copydefault.OLrzqt(this.OLrzqt, 0, this.EZpvd);
        this.copydefault.OLrzqt(bArr, i, i2);
        this.copydefault.KWHzl("");
        this.EZpvd = 0;
    }

    public void OLrzqt() throws java.io.IOException {
        this.copydefault.KWHzl("0");
        this.copydefault.KWHzl("");
    }

    public void EZpvd() throws java.io.IOException {
        if (this.KWHzl) {
            return;
        }
        KWHzl();
        OLrzqt();
        this.KWHzl = true;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        if (this.AEQbTJ) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        byte[] bArr = this.OLrzqt;
        int i2 = this.EZpvd;
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        this.EZpvd = i3;
        if (i3 == bArr.length) {
            KWHzl();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.AEQbTJ) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        byte[] bArr2 = this.OLrzqt;
        int length = bArr2.length;
        int i3 = this.EZpvd;
        if (i2 >= length - i3) {
            OLrzqt(bArr, i, i2);
        } else {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.EZpvd += i2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        KWHzl();
        this.copydefault.OLrzqt();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        EZpvd();
        this.copydefault.OLrzqt();
    }
}
