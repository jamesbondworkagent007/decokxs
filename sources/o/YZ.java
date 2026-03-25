package o;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes22.dex */
public class YZ extends java.io.FilterInputStream {
    private final int AEQbTJ;
    private int AYXKKw;
    private byte[] AhwBna;
    private int AkhnZx;
    private int EZpvd;
    private long[] KWHzl;
    private final int OLrzqt;
    private final int copydefault;
    private int djBIcL;
    private long[] gEmmrt;
    private short valueOf;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public YZ(java.io.InputStream inputStream, int i, int i2, short s, int i3, int i4) throws java.io.IOException {
        this(inputStream, i, i2, s, i3, i4, 100, 100);
    }

    public YZ(java.io.InputStream inputStream, int i, int i2, short s, int i3, int i4, int i5, int i6) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.EZpvd = 1;
        this.AYXKKw = Integer.MAX_VALUE;
        int iMin = java.lang.Math.min(java.lang.Math.max((int) s, 4), 8);
        this.OLrzqt = iMin;
        this.AhwBna = new byte[iMin];
        this.KWHzl = new long[4];
        this.gEmmrt = new long[4];
        this.djBIcL = iMin;
        this.AkhnZx = iMin;
        this.KWHzl = Zd.OLrzqt(i ^ i4, iMin ^ i4);
        this.gEmmrt = Zd.OLrzqt(i2 ^ i4, i3 ^ i4);
        this.AEQbTJ = i5;
        this.copydefault = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        copydefault();
        int i = this.djBIcL;
        if (i >= this.AkhnZx) {
            return -1;
        }
        byte[] bArr = this.AhwBna;
        this.djBIcL = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            copydefault();
            int i5 = this.djBIcL;
            if (i5 >= this.AkhnZx) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AhwBna;
            this.djBIcL = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        copydefault();
        return this.AkhnZx - this.djBIcL;
    }

    private void KWHzl() {
        Zd.KWHzl(this.KWHzl, this.gEmmrt, this.valueOf);
        for (int i = 0; i < this.OLrzqt; i++) {
            this.AhwBna[i] = (byte) (((long) r1[i]) ^ ((this.KWHzl[this.valueOf] >> (i * 8)) & 255));
        }
        this.valueOf = (short) ((this.valueOf + 1) % 4);
    }

    private int copydefault() throws java.io.IOException {
        int i;
        if (this.AYXKKw == Integer.MAX_VALUE) {
            this.AYXKKw = this.in.read();
        }
        if (this.djBIcL == this.OLrzqt) {
            byte[] bArr = this.AhwBna;
            int i2 = this.AYXKKw;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = this.in.read(this.AhwBna, i3, this.OLrzqt - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < this.OLrzqt);
            if (i3 < this.OLrzqt) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i5 = this.AEQbTJ;
            if (i5 == this.copydefault) {
                KWHzl();
            } else {
                if (this.EZpvd <= i5) {
                    KWHzl();
                }
                EZpvd();
            }
            int i6 = this.in.read();
            this.AYXKKw = i6;
            this.djBIcL = 0;
            if (i6 < 0) {
                int i7 = this.OLrzqt;
                i = i7 - (this.AhwBna[i7 - 1] & UnsignedBytes.MAX_VALUE);
            } else {
                i = this.OLrzqt;
            }
            this.AkhnZx = i;
        }
        return this.AkhnZx;
    }

    private void EZpvd() {
        int i = this.EZpvd;
        if (i < this.copydefault) {
            this.EZpvd = i + 1;
        } else {
            this.EZpvd = 1;
        }
    }
}
