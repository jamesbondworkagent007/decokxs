package o;

import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes22.dex */
public class Zf extends java.io.FilterInputStream {
    private static final short OLrzqt = (short) ((java.lang.Math.sqrt(5.0d) - 1.0d) * java.lang.Math.pow(2.0d, 15.0d));
    private byte[] AEQbTJ;
    private int AYXKKw;
    private int AhwBna;
    private int AkhnZx;
    private int DbNXlk;
    private byte[] EZpvd;
    private int KWHzl;
    private byte[] copydefault;
    private int djBIcL;
    private int ejfBZ;
    private int fetchVPNInfo;
    private int gEmmrt;
    private final int isConnected;
    private int valueOf;
    private final int values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public Zf(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        this(inputStream, iArr, i, bArr, i2, i3, 100, 100);
    }

    public Zf(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, int i4, int i5) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.gEmmrt = Integer.MAX_VALUE;
        this.ejfBZ = 1;
        this.AEQbTJ = new byte[8];
        this.EZpvd = new byte[8];
        this.copydefault = new byte[8];
        this.KWHzl = 8;
        this.djBIcL = 8;
        this.AYXKKw = java.lang.Math.min(java.lang.Math.max(i2, 5), 16);
        this.valueOf = i3;
        if (i3 == 3) {
            java.lang.System.arraycopy(bArr, 0, this.EZpvd, 0, 8);
        }
        OLrzqt((((long) iArr[1]) & BodyPartID.bodyIdMax) | ((((long) iArr[0]) & BodyPartID.bodyIdMax) << 32), i);
        this.values = i4;
        this.isConnected = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        EZpvd();
        int i = this.KWHzl;
        if (i >= this.djBIcL) {
            return -1;
        }
        byte[] bArr = this.AEQbTJ;
        this.KWHzl = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            EZpvd();
            int i5 = this.KWHzl;
            if (i5 >= this.djBIcL) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AEQbTJ;
            this.KWHzl = i5 + 1;
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
        EZpvd();
        return this.djBIcL - this.KWHzl;
    }

    private void OLrzqt(long j, int i) {
        if (i == 0) {
            copydefault(j);
            return;
        }
        int i2 = (int) j;
        this.AhwBna = i2;
        this.AkhnZx = i2 * i;
        this.DbNXlk = i ^ i2;
        this.fetchVPNInfo = (int) (j >> 32);
    }

    private void copydefault(long j) {
        this.AhwBna = (int) j;
        long j2 = j >> 3;
        short s = OLrzqt;
        this.AkhnZx = (int) ((((long) s) * j2) >> 32);
        this.DbNXlk = (int) (j >> 32);
        this.fetchVPNInfo = (int) (j2 + ((long) s));
    }

    private void copydefault() {
        if (this.valueOf == 3) {
            byte[] bArr = this.AEQbTJ;
            java.lang.System.arraycopy(bArr, 0, this.copydefault, 0, bArr.length);
        }
        byte[] bArr2 = this.AEQbTJ;
        int i = ((bArr2[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & UnsignedBytes.MAX_VALUE);
        int i2 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UnsignedBytes.MAX_VALUE);
        int i3 = 0;
        while (true) {
            int i4 = this.AYXKKw;
            if (i3 >= i4) {
                break;
            }
            short s = OLrzqt;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.DbNXlk)) ^ ((i >>> 5) + this.fetchVPNInfo);
            i -= (((i2 << 4) + this.AhwBna) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.AkhnZx);
            i3++;
        }
        byte[] bArr3 = this.AEQbTJ;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.valueOf == 3) {
            KWHzl();
            byte[] bArr4 = this.copydefault;
            java.lang.System.arraycopy(bArr4, 0, this.EZpvd, 0, bArr4.length);
        }
    }

    private void KWHzl() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.AEQbTJ;
            bArr[i] = (byte) (bArr[i] ^ this.EZpvd[i]);
        }
    }

    private int EZpvd() throws java.io.IOException {
        if (this.gEmmrt == Integer.MAX_VALUE) {
            this.gEmmrt = this.in.read();
        }
        if (this.KWHzl == 8) {
            byte[] bArr = this.AEQbTJ;
            int i = this.gEmmrt;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = this.in.read(this.AEQbTJ, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i4 = this.values;
            if (i4 == this.isConnected) {
                copydefault();
            } else {
                if (this.ejfBZ <= i4) {
                    copydefault();
                }
                OLrzqt();
            }
            int i5 = this.in.read();
            this.gEmmrt = i5;
            this.KWHzl = 0;
            this.djBIcL = i5 < 0 ? 8 - (this.AEQbTJ[7] & UnsignedBytes.MAX_VALUE) : 8;
        }
        return this.djBIcL;
    }

    private void OLrzqt() {
        int i = this.ejfBZ;
        if (i < this.isConnected) {
            this.ejfBZ = i + 1;
        } else {
            this.ejfBZ = 1;
        }
    }
}
