package o;

/* JADX INFO: renamed from: o.znn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59797znn extends java.io.InputStream {
    public final InterfaceC59758znA EZpvd;
    public boolean copydefault = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.copydefault = true;
    }

    public C59797znn(InterfaceC59758znA interfaceC59758znA) {
        this.EZpvd = (InterfaceC59758znA) C59851zoo.AEQbTJ(interfaceC59758znA, "Session input buffer");
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        InterfaceC59758znA interfaceC59758znA = this.EZpvd;
        if (interfaceC59758znA instanceof InterfaceC59801znr) {
            return ((InterfaceC59801znr) interfaceC59758znA).valueOf();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.copydefault) {
            return -1;
        }
        return this.EZpvd.KWHzl();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.copydefault) {
            return -1;
        }
        return this.EZpvd.EZpvd(bArr, i, i2);
    }
}
