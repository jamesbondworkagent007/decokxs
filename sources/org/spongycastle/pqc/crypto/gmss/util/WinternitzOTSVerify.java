package org.spongycastle.pqc.crypto.gmss.util;

import com.google.common.primitives.UnsignedBytes;
import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: classes25.dex */
public class WinternitzOTSVerify {
    private Digest messDigestOTS;
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

    public WinternitzOTSVerify(Digest digest, int i) {
        this.w = i;
        this.messDigestOTS = digest;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i = this.w;
        int i2 = ((digestSize << 3) + (i - 1)) / i;
        int log = getLog((i2 << i) + 1);
        return digestSize * (i2 + (((log + r3) - 1) / this.w));
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        byte[] bArr3 = bArr2;
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        int i3 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize2 = this.messDigestOTS.getDigestSize();
        byte[] bArr5 = new byte[digestSize2];
        this.messDigestOTS.doFinal(bArr5, 0);
        int i4 = digestSize << 3;
        int i5 = this.w;
        int i6 = ((i5 - 1) + i4) / i5;
        int log = getLog((i6 << i5) + 1);
        int i7 = this.w;
        int i8 = ((((log + i7) - 1) / i7) + i6) * digestSize;
        if (i8 != bArr3.length) {
            return null;
        }
        byte[] bArr6 = new byte[i8];
        int i9 = 8;
        if (8 % i7 == 0) {
            int i10 = 8 / i7;
            int i11 = (1 << i7) - 1;
            byte[] bArr7 = new byte[digestSize];
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < digestSize2) {
                while (i3 < i10) {
                    int i15 = bArr5[i12] & i11;
                    i13 += i15;
                    int i16 = digestSize2;
                    int i17 = i14 * digestSize;
                    int i18 = i10;
                    System.arraycopy(bArr3, i17, bArr7, 0, digestSize);
                    int i19 = i15;
                    while (i19 < i11) {
                        this.messDigestOTS.update(bArr7, 0, bArr7.length);
                        bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr7, 0);
                        i19++;
                        i13 = i13;
                        i8 = i8;
                    }
                    System.arraycopy(bArr7, 0, bArr6, i17, digestSize);
                    bArr5[i12] = (byte) (bArr5[i12] >>> this.w);
                    i14++;
                    i3++;
                    digestSize2 = i16;
                    bArr3 = bArr2;
                    i10 = i18;
                }
                i12++;
                bArr3 = bArr2;
                i3 = 0;
            }
            i = i8;
            int i20 = (i6 << this.w) - i13;
            int i21 = 0;
            while (i21 < log) {
                int i22 = i14 * digestSize;
                System.arraycopy(bArr2, i22, bArr7, 0, digestSize);
                for (int i23 = i20 & i11; i23 < i11; i23++) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                System.arraycopy(bArr7, 0, bArr6, i22, digestSize);
                int i24 = this.w;
                i20 >>>= i24;
                i14++;
                i21 += i24;
            }
        } else {
            i = i8;
            if (i7 < 8) {
                int i25 = digestSize / i7;
                int i26 = (1 << i7) - 1;
                byte[] bArr8 = new byte[digestSize];
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (i27 < i25) {
                    int i31 = 0;
                    long j = 0;
                    while (i31 < this.w) {
                        j ^= (long) ((bArr5[i28] & UnsignedBytes.MAX_VALUE) << (i31 << 3));
                        i28++;
                        i31++;
                        bArr8 = bArr8;
                    }
                    int i32 = 0;
                    while (i32 < i9) {
                        int i33 = i27;
                        int i34 = (int) (j & ((long) i26));
                        i29 += i34;
                        int i35 = i30 * digestSize;
                        System.arraycopy(bArr3, i35, bArr8, 0, digestSize);
                        while (i34 < i26) {
                            this.messDigestOTS.update(bArr8, 0, bArr8.length);
                            bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                            this.messDigestOTS.doFinal(bArr8, 0);
                            i34++;
                            i25 = i25;
                            i28 = i28;
                        }
                        System.arraycopy(bArr8, 0, bArr6, i35, digestSize);
                        j >>>= this.w;
                        i30++;
                        i32++;
                        i27 = i33;
                        i9 = 8;
                    }
                    i27++;
                    i9 = 8;
                }
                byte[] bArr9 = bArr8;
                int i36 = digestSize % this.w;
                long j2 = 0;
                for (int i37 = 0; i37 < i36; i37++) {
                    j2 ^= (long) ((bArr5[i28] & 255) << (i37 << 3));
                    i28++;
                }
                byte[] bArr10 = bArr9;
                int i38 = 0;
                while (i38 < (i36 << 3)) {
                    int i39 = (int) (j2 & ((long) i26));
                    i29 += i39;
                    int i40 = i30 * digestSize;
                    System.arraycopy(bArr3, i40, bArr10, 0, digestSize);
                    while (i39 < i26) {
                        this.messDigestOTS.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr10, 0);
                        i39++;
                    }
                    System.arraycopy(bArr10, 0, bArr6, i40, digestSize);
                    int i41 = this.w;
                    j2 >>>= i41;
                    i30++;
                    i38 += i41;
                }
                int i42 = (i6 << this.w) - i29;
                int i43 = 0;
                while (i43 < log) {
                    int i44 = i30 * digestSize;
                    System.arraycopy(bArr3, i44, bArr10, 0, digestSize);
                    for (int i45 = i42 & i26; i45 < i26; i45++) {
                        this.messDigestOTS.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr10, 0);
                    }
                    System.arraycopy(bArr10, 0, bArr6, i44, digestSize);
                    int i46 = this.w;
                    i42 >>>= i46;
                    i30++;
                    i43 += i46;
                }
            } else if (i7 < 57) {
                int i47 = i4 - i7;
                int i48 = (1 << i7) - 1;
                byte[] bArr11 = new byte[digestSize];
                int i49 = 0;
                int i50 = 0;
                int i51 = 0;
                while (i50 <= i47) {
                    int i52 = i50 >>> 3;
                    int i53 = this.w + i50;
                    int i54 = 0;
                    long j3 = 0;
                    while (true) {
                        i2 = i47;
                        if (i52 >= ((i53 + 7) >>> 3)) {
                            break;
                        }
                        j3 ^= (long) ((bArr5[i52] & UnsignedBytes.MAX_VALUE) << (i54 << 3));
                        i54++;
                        i52++;
                        log = log;
                        i47 = i2;
                        i6 = i6;
                    }
                    int i55 = log;
                    int i56 = i6;
                    long j4 = i48;
                    long j5 = (j3 >>> (i50 % 8)) & j4;
                    i49 = (int) (((long) i49) + j5);
                    int i57 = i51 * digestSize;
                    System.arraycopy(bArr3, i57, bArr11, 0, digestSize);
                    while (j5 < j4) {
                        this.messDigestOTS.update(bArr11, 0, bArr11.length);
                        bArr11 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr11, 0);
                        j5++;
                        i49 = i49;
                        j4 = j4;
                    }
                    System.arraycopy(bArr11, 0, bArr6, i57, digestSize);
                    i51++;
                    i50 = i53;
                    log = i55;
                    i47 = i2;
                    i6 = i56;
                }
                int i58 = log;
                int i59 = i6;
                int i60 = i50 >>> 3;
                if (i60 < digestSize) {
                    int i61 = 0;
                    long j6 = 0;
                    while (i60 < digestSize) {
                        j6 ^= (long) ((bArr5[i60] & UnsignedBytes.MAX_VALUE) << (i61 << 3));
                        i61++;
                        i60++;
                    }
                    long j7 = i48;
                    long j8 = (j6 >>> (i50 % 8)) & j7;
                    i49 = (int) (((long) i49) + j8);
                    int i62 = i51 * digestSize;
                    System.arraycopy(bArr3, i62, bArr11, 0, digestSize);
                    while (j8 < j7) {
                        this.messDigestOTS.update(bArr11, 0, bArr11.length);
                        bArr11 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr11, 0);
                        j8++;
                    }
                    System.arraycopy(bArr11, 0, bArr6, i62, digestSize);
                    i51++;
                }
                int i63 = (i59 << this.w) - i49;
                int i64 = i51;
                int i65 = 0;
                while (i65 < i58) {
                    int i66 = i64 * digestSize;
                    System.arraycopy(bArr3, i66, bArr11, 0, digestSize);
                    for (long j9 = i63 & i48; j9 < i48; j9++) {
                        this.messDigestOTS.update(bArr11, 0, bArr11.length);
                        bArr11 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr11, 0);
                    }
                    System.arraycopy(bArr11, 0, bArr6, i66, digestSize);
                    int i67 = this.w;
                    i63 >>>= i67;
                    i64++;
                    i65 += i67;
                }
            }
        }
        byte[] bArr12 = new byte[digestSize];
        this.messDigestOTS.update(bArr6, 0, i);
        byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr13, 0);
        return bArr13;
    }
}
