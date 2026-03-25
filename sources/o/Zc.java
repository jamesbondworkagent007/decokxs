package o;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes3.dex */
public class Zc extends java.io.FilterInputStream {
    private final int AYXKKw;
    private final int[] AhwBna;
    private final int AkhnZx;
    private final int DbNXlk;
    private final byte[][] djBIcL;
    private int ejfBZ;
    private int fJNWhG;
    private final byte[] fetchVPNInfo;
    private final byte[] gEmmrt;
    private int isConnected;
    private final int[] valueOf;
    private int values;
    private static final byte[] KWHzl = Za.KWHzl;
    private static final int[] AEQbTJ = Za.OLrzqt;
    private static final int[] OLrzqt = Za.EZpvd;
    private static final int[] copydefault = Za.AEQbTJ;
    private static final int[] EZpvd = Za.gEmmrt;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public Zc(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, 100, 100);
    }

    public Zc(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, int i2, int i3) {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.valueOf = new int[4];
        this.gEmmrt = new byte[16];
        this.fetchVPNInfo = new byte[16];
        this.values = 1;
        this.isConnected = Integer.MAX_VALUE;
        this.ejfBZ = 16;
        this.fJNWhG = 16;
        this.AYXKKw = i;
        this.AhwBna = Za.KWHzl(bArr, i);
        this.djBIcL = EZpvd(bArr2);
        this.AkhnZx = i2;
        this.DbNXlk = i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        OLrzqt();
        int i = this.ejfBZ;
        if (i >= this.fJNWhG) {
            return -1;
        }
        byte[] bArr = this.fetchVPNInfo;
        this.ejfBZ = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            OLrzqt();
            int i5 = this.ejfBZ;
            if (i5 >= this.fJNWhG) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.fetchVPNInfo;
            this.ejfBZ = i5 + 1;
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
        OLrzqt();
        return this.fJNWhG - this.ejfBZ;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
    }

    private byte[][] EZpvd(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    private int OLrzqt() throws java.io.IOException {
        if (this.isConnected == Integer.MAX_VALUE) {
            this.isConnected = this.in.read();
        }
        if (this.ejfBZ == 16) {
            byte[] bArr = this.gEmmrt;
            int i = this.isConnected;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = this.in.read(this.gEmmrt, i2, 16 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i4 = this.AkhnZx;
            if (i4 == this.DbNXlk) {
                EZpvd(this.gEmmrt, 0, this.fetchVPNInfo, 0);
            } else {
                if (this.values <= i4) {
                    EZpvd(this.gEmmrt, 0, this.fetchVPNInfo, 0);
                } else {
                    byte[] bArr2 = this.gEmmrt;
                    java.lang.System.arraycopy(bArr2, 0, this.fetchVPNInfo, 0, bArr2.length);
                }
                KWHzl();
            }
            int i5 = this.in.read();
            this.isConnected = i5;
            this.ejfBZ = 0;
            this.fJNWhG = i5 < 0 ? 16 - (this.fetchVPNInfo[15] & UnsignedBytes.MAX_VALUE) : 16;
        }
        return this.fJNWhG;
    }

    private void EZpvd(byte[] bArr, int i, byte[] bArr2, int i2) {
        Zc zc = this;
        int[] iArr = zc.valueOf;
        int i3 = ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i] << Ascii.CAN) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i + 3] & UnsignedBytes.MAX_VALUE);
        int[] iArr2 = zc.AhwBna;
        char c = 0;
        iArr[0] = i3 ^ iArr2[0];
        char c2 = 1;
        iArr[1] = (((((bArr[i + 5] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i + 4] << Ascii.CAN)) | ((bArr[i + 6] & UnsignedBytes.MAX_VALUE) << 8)) | (bArr[i + 7] & UnsignedBytes.MAX_VALUE)) ^ iArr2[1];
        char c3 = 2;
        iArr[2] = (((((bArr[i + 9] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i + 8] << Ascii.CAN)) | ((bArr[i + 10] & UnsignedBytes.MAX_VALUE) << 8)) | (bArr[i + 11] & UnsignedBytes.MAX_VALUE)) ^ iArr2[2];
        char c4 = 3;
        iArr[3] = (((((bArr[i + 13] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i + 12] << Ascii.CAN)) | ((bArr[i + 14] & UnsignedBytes.MAX_VALUE) << 8)) | (bArr[i + 15] & UnsignedBytes.MAX_VALUE)) ^ iArr2[3];
        int i4 = 4;
        int i5 = 1;
        while (i5 < zc.AYXKKw) {
            int[] iArr3 = AEQbTJ;
            int[] iArr4 = zc.valueOf;
            byte[][] bArr3 = zc.djBIcL;
            byte[] bArr4 = bArr3[c];
            int i6 = iArr3[iArr4[bArr4[c]] >>> 24];
            int[] iArr5 = OLrzqt;
            byte[] bArr5 = bArr3[c2];
            int i7 = i6 ^ iArr5[(iArr4[bArr5[c]] >>> 16) & 255];
            int[] iArr6 = copydefault;
            byte[] bArr6 = bArr3[c3];
            int i8 = iArr6[(iArr4[bArr6[c]] >>> 8) & 255] ^ i7;
            int[] iArr7 = EZpvd;
            byte[] bArr7 = bArr3[c4];
            int i9 = iArr7[iArr4[bArr7[c]] & 255] ^ i8;
            int[] iArr8 = zc.AhwBna;
            int i10 = i9 ^ iArr8[i4];
            int i11 = ((iArr6[(iArr4[bArr6[c2]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c2]] >>> 24] ^ iArr5[(iArr4[bArr5[c2]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[1]] & 255]) ^ iArr8[i4 + 1];
            int i12 = ((iArr6[(iArr4[bArr6[2]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[2]] >>> 24] ^ iArr5[(iArr4[bArr5[2]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i4 + 2];
            int i13 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i4 + 3];
            iArr4[0] = i10;
            iArr4[1] = i11;
            iArr4[2] = i12;
            iArr4[3] = i13;
            i5++;
            i4 += 4;
            zc = this;
            c2 = 1;
            c = 0;
            c3 = 2;
            c4 = 3;
        }
        int[] iArr9 = zc.AhwBna;
        int i14 = iArr9[i4];
        byte[] bArr8 = KWHzl;
        int[] iArr10 = zc.valueOf;
        byte[][] bArr9 = zc.djBIcL;
        byte[] bArr10 = bArr9[0];
        bArr2[i2] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i14 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[i2 + 1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i14 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[i2 + 2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i14 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[i2 + 3] = (byte) (i14 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i15 = iArr9[i4 + 1];
        bArr2[i2 + 4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i15 >>> 24));
        bArr2[i2 + 5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[i2 + 6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[i2 + 7] = (byte) (i15 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i16 = iArr9[i4 + 2];
        bArr2[i2 + 8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i16 >>> 24));
        bArr2[i2 + 9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i16 >>> 16));
        bArr2[i2 + 10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i16 >>> 8));
        bArr2[i2 + 11] = (byte) (i16 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i17 = iArr9[i4 + 3];
        bArr2[i2 + 12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i17 >>> 24));
        bArr2[i2 + 13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i17 >>> 16));
        bArr2[i2 + 14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i17 >>> 8));
        bArr2[i2 + 15] = (byte) (i17 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private void KWHzl() {
        int i = this.values;
        if (i < this.DbNXlk) {
            this.values = i + 1;
        } else {
            this.values = 1;
        }
    }
}
