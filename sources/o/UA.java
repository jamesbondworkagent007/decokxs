package o;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes21.dex */
public final class UA extends java.io.InputStream {
    public final C5517Ut AEQbTJ;
    public byte[] EZpvd;
    public int KWHzl;
    public final java.io.InputStream OLrzqt;
    public final int copydefault;

    public UA(C5517Ut c5517Ut, java.io.InputStream inputStream, byte[] bArr, int i, int i2) {
        this.AEQbTJ = c5517Ut;
        this.OLrzqt = inputStream;
        this.EZpvd = bArr;
        this.KWHzl = i;
        this.copydefault = i2;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return this.EZpvd != null ? this.copydefault - this.KWHzl : this.OLrzqt.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        copydefault();
        this.OLrzqt.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            if (this.EZpvd == null) {
                this.OLrzqt.mark(i);
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.EZpvd == null && this.OLrzqt.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        byte[] bArr = this.EZpvd;
        if (bArr != null) {
            int i = this.KWHzl;
            int i2 = i + 1;
            this.KWHzl = i2;
            byte b = bArr[i];
            if (i2 >= this.copydefault) {
                copydefault();
            }
            return b & UnsignedBytes.MAX_VALUE;
        }
        return this.OLrzqt.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        byte[] bArr2 = this.EZpvd;
        if (bArr2 != null) {
            int i3 = this.copydefault;
            int i4 = this.KWHzl;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            java.lang.System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.KWHzl + i2;
            this.KWHzl = i6;
            if (i6 >= this.copydefault) {
                copydefault();
            }
            return i2;
        }
        return this.OLrzqt.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
        synchronized (this) {
            if (this.EZpvd == null) {
                this.OLrzqt.reset();
            }
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        long j2;
        if (this.EZpvd != null) {
            int i = this.copydefault;
            int i2 = this.KWHzl;
            j2 = i - i2;
            if (j2 > j) {
                this.KWHzl = i2 + ((int) j);
                return j;
            }
            copydefault();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.OLrzqt.skip(j) : j2;
    }

    public final void copydefault() {
        byte[] bArr = this.EZpvd;
        if (bArr != null) {
            this.EZpvd = null;
            C5517Ut c5517Ut = this.AEQbTJ;
            if (c5517Ut != null) {
                c5517Ut.copydefault(bArr);
            }
        }
    }
}
