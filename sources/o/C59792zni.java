package o;

/* JADX INFO: renamed from: o.zni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59792zni extends java.io.OutputStream {
    public final long EZpvd;
    public final InterfaceC59808zny KWHzl;
    public long OLrzqt = 0;
    public boolean AEQbTJ = false;

    public C59792zni(InterfaceC59808zny interfaceC59808zny, long j) {
        this.KWHzl = (InterfaceC59808zny) C59851zoo.AEQbTJ(interfaceC59808zny, "Session output buffer");
        this.EZpvd = C59851zoo.KWHzl(j, "Content length");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        this.KWHzl.OLrzqt();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.KWHzl.OLrzqt();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.AEQbTJ) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        long j = this.OLrzqt;
        long j2 = this.EZpvd;
        if (j < j2) {
            long j3 = j2 - j;
            if (i2 > j3) {
                i2 = (int) j3;
            }
            this.KWHzl.OLrzqt(bArr, i, i2);
            this.OLrzqt += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        if (this.AEQbTJ) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        if (this.OLrzqt < this.EZpvd) {
            this.KWHzl.AEQbTJ(i);
            this.OLrzqt++;
        }
    }
}
