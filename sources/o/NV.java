package o;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes2.dex */
public final class NV extends java.io.FilterInputStream {
    public static final byte[] AEQbTJ = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};
    public static final int EZpvd = 29;
    public static final int copydefault = 31;
    public int KWHzl;
    public final byte OLrzqt;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public NV(java.io.InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.OLrzqt = (byte) i;
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int i;
        int i2;
        int i3 = this.KWHzl;
        if (i3 < 2 || i3 > (i2 = copydefault)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.OLrzqt : AEQbTJ[i3 - 2] & UnsignedBytes.MAX_VALUE;
        }
        if (i != -1) {
            this.KWHzl++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@androidx.annotation.NonNull byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3;
        int i4 = this.KWHzl;
        int i5 = copydefault;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.OLrzqt;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = java.lang.Math.min(i5 - i4, i2);
            java.lang.System.arraycopy(AEQbTJ, this.KWHzl - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.KWHzl += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.KWHzl = (int) (((long) this.KWHzl) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
        throw new java.lang.UnsupportedOperationException();
    }
}
