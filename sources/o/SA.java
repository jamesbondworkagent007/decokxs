package o;

/* JADX INFO: loaded from: classes2.dex */
public final class SA extends java.io.FilterInputStream {
    public int AEQbTJ;
    public final long copydefault;

    public static java.io.InputStream OLrzqt(@androidx.annotation.NonNull java.io.InputStream inputStream, long j) {
        return new SA(inputStream, j);
    }

    public SA(@androidx.annotation.NonNull java.io.InputStream inputStream, long j) {
        super(inputStream);
        this.copydefault = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        int iMax;
        synchronized (this) {
            iMax = (int) java.lang.Math.max(this.copydefault - ((long) this.AEQbTJ), ((java.io.FilterInputStream) this).in.available());
        }
        return iMax;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int i;
        synchronized (this) {
            i = super.read();
            OLrzqt(i >= 0 ? 1 : -1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int iOLrzqt;
        synchronized (this) {
            iOLrzqt = OLrzqt(super.read(bArr, i, i2));
        }
        return iOLrzqt;
    }

    public final int OLrzqt(int i) throws java.io.IOException {
        if (i >= 0) {
            this.AEQbTJ += i;
        } else if (this.copydefault - ((long) this.AEQbTJ) > 0) {
            throw new java.io.IOException("Failed to read all expected data, expected: " + this.copydefault + ", but read: " + this.AEQbTJ);
        }
        return i;
    }
}
