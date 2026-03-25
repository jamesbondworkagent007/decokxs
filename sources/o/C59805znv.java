package o;

/* JADX INFO: renamed from: o.znv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59805znv extends java.io.OutputStream {
    public final InterfaceC59808zny EZpvd;
    public boolean OLrzqt = false;

    public C59805znv(InterfaceC59808zny interfaceC59808zny) {
        this.EZpvd = (InterfaceC59808zny) C59851zoo.AEQbTJ(interfaceC59808zny, "Session output buffer");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.EZpvd.OLrzqt();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.EZpvd.OLrzqt();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.OLrzqt) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        this.EZpvd.OLrzqt(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        if (this.OLrzqt) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        this.EZpvd.AEQbTJ(i);
    }
}
