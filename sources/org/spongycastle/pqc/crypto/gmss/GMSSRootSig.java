package org.spongycastle.pqc.crypto.gmss;

import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes25.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;
    private int ii;
    private int k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;
    private int r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;
    private int w;

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getSig() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.ii, this.r, this.steps, this.keysize, this.height, this.w, this.checksum};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getStatLong() {
        long j = this.test8;
        long j2 = this.big8;
        return new byte[]{(byte) (j & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 56) & 255), (byte) (j2 & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 24) & 255), (byte) ((j2 >> 32) & 255), (byte) ((j2 >> 40) & 255), (byte) ((j2 >> 48) & 255), (byte) (255 & (j2 >> 56))};
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.ii = iArr[2];
        this.r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.w = iArr[7];
        this.checksum = iArr[8];
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int i = this.w;
        this.k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i));
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        byte[] bArr2 = bArr[4];
        this.test8 = (((long) (bArr2[1] & UnsignedBytes.MAX_VALUE)) << 8) | ((long) (bArr2[0] & UnsignedBytes.MAX_VALUE)) | (((long) (bArr2[2] & UnsignedBytes.MAX_VALUE)) << 16) | (((long) (bArr2[3] & UnsignedBytes.MAX_VALUE)) << 24) | (((long) (bArr2[4] & UnsignedBytes.MAX_VALUE)) << 32) | (((long) (bArr2[5] & UnsignedBytes.MAX_VALUE)) << 40) | (((long) (bArr2[6] & UnsignedBytes.MAX_VALUE)) << 48) | (((long) (bArr2[7] & UnsignedBytes.MAX_VALUE)) << 56);
        this.big8 = ((long) (bArr2[8] & UnsignedBytes.MAX_VALUE)) | (((long) (bArr2[9] & UnsignedBytes.MAX_VALUE)) << 8) | (((long) (bArr2[10] & UnsignedBytes.MAX_VALUE)) << 16) | (((long) (bArr2[11] & UnsignedBytes.MAX_VALUE)) << 24) | (((long) (bArr2[12] & UnsignedBytes.MAX_VALUE)) << 32) | (((long) (bArr2[13] & UnsignedBytes.MAX_VALUE)) << 40) | (((long) (bArr2[14] & UnsignedBytes.MAX_VALUE)) << 48) | (((long) (bArr2[15] & UnsignedBytes.MAX_VALUE)) << 56);
    }

    public GMSSRootSig(Digest digest, int i, int i2) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        this.w = i;
        this.height = i2;
        this.k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i));
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr3;
        this.messDigestOTS.doFinal(bArr3, 0);
        int i3 = this.mdsize;
        byte[] bArr4 = new byte[i3];
        System.arraycopy(this.hash, 0, bArr4, 0, i3);
        int log = getLog((this.messagesize << this.w) + 1);
        int i4 = this.w;
        int i5 = 8;
        if (8 % i4 == 0) {
            int i6 = 8 / i4;
            i = 0;
            for (int i7 = 0; i7 < this.mdsize; i7++) {
                for (int i8 = 0; i8 < i6; i8++) {
                    byte b = bArr4[i7];
                    i += this.k & b;
                    bArr4[i7] = (byte) (b >>> this.w);
                }
            }
            int i9 = (this.messagesize << this.w) - i;
            this.checksum = i9;
            int i10 = 0;
            while (i10 < log) {
                i += this.k & i9;
                int i11 = this.w;
                i9 >>>= i11;
                i10 += i11;
            }
        } else if (i4 < 8) {
            int i12 = this.mdsize / i4;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < i12) {
                long j = 0;
                for (int i16 = 0; i16 < this.w; i16++) {
                    j ^= (long) ((bArr4[i14] & UnsignedBytes.MAX_VALUE) << (i16 << 3));
                    i14++;
                }
                int i17 = 0;
                while (i17 < i5) {
                    i15 += (int) (((long) this.k) & j);
                    j >>>= this.w;
                    i17++;
                    i12 = i12;
                    i5 = 8;
                }
                i13++;
                i5 = 8;
            }
            int i18 = this.mdsize % this.w;
            long j2 = 0;
            for (int i19 = 0; i19 < i18; i19++) {
                j2 ^= (long) ((bArr4[i14] & UnsignedBytes.MAX_VALUE) << (i19 << 3));
                i14++;
            }
            int i20 = 0;
            while (i20 < (i18 << 3)) {
                i15 += (int) (((long) this.k) & j2);
                int i21 = this.w;
                j2 >>>= i21;
                i20 += i21;
            }
            int i22 = (this.messagesize << this.w) - i15;
            this.checksum = i22;
            int i23 = 0;
            i = i15;
            while (i23 < log) {
                i += this.k & i22;
                int i24 = this.w;
                i22 >>>= i24;
                i23 += i24;
            }
        } else if (i4 < 57) {
            int i25 = 0;
            int i26 = 0;
            while (true) {
                i2 = this.mdsize;
                int i27 = this.w;
                if (i25 > (i2 << 3) - i27) {
                    break;
                }
                int i28 = i27 + i25;
                int i29 = 0;
                long j3 = 0;
                for (int i30 = i25 >>> 3; i30 < ((i28 + 7) >>> 3); i30++) {
                    j3 ^= (long) ((bArr4[i30] & UnsignedBytes.MAX_VALUE) << (i29 << 3));
                    i29++;
                }
                i26 = (int) (((long) i26) + ((j3 >>> (i25 % 8)) & ((long) this.k)));
                i25 = i28;
            }
            int i31 = i25 >>> 3;
            if (i31 < i2) {
                int i32 = 0;
                long j4 = 0;
                while (i31 < this.mdsize) {
                    j4 ^= (long) ((bArr4[i31] & UnsignedBytes.MAX_VALUE) << (i32 << 3));
                    i32++;
                    i31++;
                }
                i26 = (int) (((long) i26) + ((j4 >>> (i25 % 8)) & ((long) this.k)));
            }
            int i33 = (this.messagesize << this.w) - i26;
            this.checksum = i33;
            int i34 = 0;
            i = i26;
            while (i34 < log) {
                i += this.k & i33;
                int i35 = this.w;
                i33 >>>= i35;
                i34 += i35;
            }
        } else {
            i = 0;
        }
        int iCeil = this.messagesize + ((int) Math.ceil(((double) log) / ((double) this.w)));
        this.keysize = iCeil;
        this.steps = (int) Math.ceil(((double) (iCeil + i)) / ((double) (1 << this.height)));
        int i36 = this.keysize;
        int i37 = this.mdsize;
        this.sign = new byte[i36 * i37];
        this.counter = 0;
        this.test = 0;
        this.ii = 0;
        this.test8 = 0L;
        this.r = 0;
        this.privateKeyOTS = new byte[i37];
        byte[] bArr5 = new byte[i37];
        this.seed = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i37);
    }

    public boolean updateSign() {
        for (int i = 0; i < this.steps; i++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }

    private void oneStep() {
        int i = this.w;
        if (8 % i == 0) {
            int i2 = this.test;
            if (i2 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i3 = this.ii;
                if (i3 < this.mdsize) {
                    byte[] bArr = this.hash;
                    byte b = bArr[i3];
                    this.test = this.k & b;
                    bArr[i3] = (byte) (b >>> this.w);
                } else {
                    int i4 = this.checksum;
                    this.test = this.k & i4;
                    this.checksum = i4 >>> this.w;
                }
            } else if (i2 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i5 = this.counter;
                int i6 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i5 * i6, i6);
                int i7 = this.counter + 1;
                this.counter = i7;
                if (i7 % (8 / this.w) == 0) {
                    this.ii++;
                    return;
                }
                return;
            }
            return;
        }
        if (i >= 8) {
            if (i < 57) {
                long j = this.test8;
                if (j == 0) {
                    this.big8 = 0L;
                    this.ii = 0;
                    int i8 = this.r;
                    int i9 = i8 >>> 3;
                    int i10 = this.mdsize;
                    if (i9 < i10) {
                        int i11 = (i10 << 3) - i;
                        int i12 = i + i8;
                        this.r = i12;
                        if (i8 <= i11) {
                            i10 = (i12 + 7) >>> 3;
                        }
                        while (i9 < i10) {
                            long j2 = this.big8;
                            byte b2 = this.hash[i9];
                            int i13 = this.ii;
                            this.big8 = j2 ^ ((long) ((b2 & UnsignedBytes.MAX_VALUE) << (i13 << 3)));
                            this.ii = i13 + 1;
                            i9++;
                        }
                        long j3 = this.big8 >>> (i8 % 8);
                        this.big8 = j3;
                        this.test8 = j3 & ((long) this.k);
                    } else {
                        int i14 = this.checksum;
                        this.test8 = this.k & i14;
                        this.checksum = i14 >>> i;
                    }
                    this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                } else if (j > 0) {
                    Digest digest2 = this.messDigestOTS;
                    byte[] bArr6 = this.privateKeyOTS;
                    digest2.update(bArr6, 0, bArr6.length);
                    byte[] bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.privateKeyOTS = bArr7;
                    this.messDigestOTS.doFinal(bArr7, 0);
                    this.test8--;
                }
                if (this.test8 == 0) {
                    byte[] bArr8 = this.privateKeyOTS;
                    byte[] bArr9 = this.sign;
                    int i15 = this.counter;
                    int i16 = this.mdsize;
                    System.arraycopy(bArr8, 0, bArr9, i15 * i16, i16);
                    this.counter++;
                    return;
                }
                return;
            }
            return;
        }
        int i17 = this.test;
        if (i17 == 0) {
            int i18 = this.counter;
            if (i18 % 8 == 0) {
                int i19 = this.ii;
                int i20 = this.mdsize;
                if (i19 < i20) {
                    this.big8 = 0L;
                    if (i18 < ((i20 / i) << 3)) {
                        for (int i21 = 0; i21 < this.w; i21++) {
                            long j4 = this.big8;
                            byte[] bArr10 = this.hash;
                            int i22 = this.ii;
                            this.big8 = j4 ^ ((long) ((bArr10[i22] & UnsignedBytes.MAX_VALUE) << (i21 << 3)));
                            this.ii = i22 + 1;
                        }
                    } else {
                        for (int i23 = 0; i23 < this.mdsize % this.w; i23++) {
                            long j5 = this.big8;
                            byte[] bArr11 = this.hash;
                            int i24 = this.ii;
                            this.big8 = j5 ^ ((long) ((bArr11[i24] & UnsignedBytes.MAX_VALUE) << (i23 << 3)));
                            this.ii = i24 + 1;
                        }
                    }
                }
            }
            if (this.counter == this.messagesize) {
                this.big8 = this.checksum;
            }
            this.test = (int) (this.big8 & ((long) this.k));
            this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
        } else if (i17 > 0) {
            Digest digest3 = this.messDigestOTS;
            byte[] bArr12 = this.privateKeyOTS;
            digest3.update(bArr12, 0, bArr12.length);
            byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
            this.privateKeyOTS = bArr13;
            this.messDigestOTS.doFinal(bArr13, 0);
            this.test--;
        }
        if (this.test == 0) {
            byte[] bArr14 = this.privateKeyOTS;
            byte[] bArr15 = this.sign;
            int i25 = this.counter;
            int i26 = this.mdsize;
            System.arraycopy(bArr14, 0, bArr15, i25 * i26, i26);
            this.big8 >>>= this.w;
            this.counter++;
        }
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public String toString() {
        String str = "" + this.big8 + "  ";
        int[] statInt = getStatInt();
        byte[][] statByte = getStatByte();
        for (int i = 0; i < 9; i++) {
            str = str + statInt[i] + " ";
        }
        for (int i2 = 0; i2 < 5; i2++) {
            str = str + new String(Hex.encode(statByte[i2])) + " ";
        }
        return str;
    }
}
