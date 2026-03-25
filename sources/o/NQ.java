package o;

/* JADX INFO: loaded from: classes2.dex */
public final class NQ extends java.io.OutputStream {
    public int AEQbTJ;
    public OF KWHzl;
    public final java.io.OutputStream OLrzqt;
    public byte[] copydefault;

    public NQ(@androidx.annotation.NonNull java.io.OutputStream outputStream, @androidx.annotation.NonNull OF of) {
        this(outputStream, of, 65536);
    }

    public NQ(@androidx.annotation.NonNull java.io.OutputStream outputStream, OF of, int i) {
        this.OLrzqt = outputStream;
        this.KWHzl = of;
        this.copydefault = (byte[]) of.EZpvd(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        byte[] bArr = this.copydefault;
        int i2 = this.AEQbTJ;
        this.AEQbTJ = i2 + 1;
        bArr[i2] = (byte) i;
        KWHzl();
    }

    @Override // java.io.OutputStream
    public void write(@androidx.annotation.NonNull byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@androidx.annotation.NonNull byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.AEQbTJ;
            if (i6 == 0 && i4 >= this.copydefault.length) {
                this.OLrzqt.write(bArr, i5, i4);
                return;
            }
            int iMin = java.lang.Math.min(i4, this.copydefault.length - i6);
            java.lang.System.arraycopy(bArr, i5, this.copydefault, this.AEQbTJ, iMin);
            this.AEQbTJ += iMin;
            i3 += iMin;
            KWHzl();
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        EZpvd();
        this.OLrzqt.flush();
    }

    public final void EZpvd() throws java.io.IOException {
        int i = this.AEQbTJ;
        if (i > 0) {
            this.OLrzqt.write(this.copydefault, 0, i);
            this.AEQbTJ = 0;
        }
    }

    public final void KWHzl() throws java.io.IOException {
        if (this.AEQbTJ == this.copydefault.length) {
            EZpvd();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        try {
            flush();
            this.OLrzqt.close();
            OLrzqt();
        } catch (java.lang.Throwable th) {
            this.OLrzqt.close();
            throw th;
        }
    }

    public final void OLrzqt() {
        byte[] bArr = this.copydefault;
        if (bArr != null) {
            this.KWHzl.EZpvd(bArr);
            this.copydefault = null;
        }
    }
}
