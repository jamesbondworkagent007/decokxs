package o;

import com.google.common.base.Ascii;
import o.AbstractC59501ziI;
import okio.Utf8;

/* JADX INFO: renamed from: o.ziE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59497ziE extends AbstractC59501ziI {
    public final byte[] AYXKKw;
    public final byte[] AhwBna;
    public final int OLrzqt;
    public final int djBIcL;
    public final byte[] valueOf;
    public static final byte[] copydefault = {Ascii.CR, 10};
    public static final byte[] AEQbTJ = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] KWHzl = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] EZpvd = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public C59497ziE() {
        this(0);
    }

    public C59497ziE(boolean z) {
        this(76, copydefault, z);
    }

    public C59497ziE(int i) {
        this(i, copydefault);
    }

    public C59497ziE(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public C59497ziE(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.AYXKKw = EZpvd;
        if (bArr == null) {
            this.djBIcL = 4;
            this.AhwBna = null;
        } else {
            if (AhwBna(bArr)) {
                throw new java.lang.IllegalArgumentException("lineSeparator must not contain base64 characters: [" + C59500ziH.AEQbTJ(bArr) + "]");
            }
            if (i > 0) {
                this.djBIcL = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.AhwBna = bArr2;
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.djBIcL = 4;
                this.AhwBna = null;
            }
        }
        this.OLrzqt = this.djBIcL - 1;
        this.valueOf = z ? KWHzl : AEQbTJ;
    }

    @Override // o.AbstractC59501ziI
    public void copydefault(byte[] bArr, int i, int i2, AbstractC59501ziI.StateListAnimator stateListAnimator) {
        if (stateListAnimator.AEQbTJ) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] bArrCopydefault = copydefault(this.djBIcL, stateListAnimator);
                int i4 = (stateListAnimator.djBIcL + 1) % 3;
                stateListAnimator.djBIcL = i4;
                int i5 = bArr[i];
                if (i5 < 0) {
                    i5 += 256;
                }
                int i6 = (stateListAnimator.EZpvd << 8) + i5;
                stateListAnimator.EZpvd = i6;
                if (i4 == 0) {
                    int i7 = stateListAnimator.AhwBna;
                    byte[] bArr2 = this.valueOf;
                    bArrCopydefault[i7] = bArr2[(i6 >> 18) & 63];
                    bArrCopydefault[i7 + 1] = bArr2[(i6 >> 12) & 63];
                    bArrCopydefault[i7 + 2] = bArr2[(i6 >> 6) & 63];
                    int i8 = i7 + 4;
                    stateListAnimator.AhwBna = i8;
                    bArrCopydefault[i7 + 3] = bArr2[i6 & 63];
                    int i9 = stateListAnimator.OLrzqt + 4;
                    stateListAnimator.OLrzqt = i9;
                    int i10 = this.isConnected;
                    if (i10 > 0 && i10 <= i9) {
                        byte[] bArr3 = this.AhwBna;
                        java.lang.System.arraycopy(bArr3, 0, bArrCopydefault, i8, bArr3.length);
                        stateListAnimator.AhwBna += this.AhwBna.length;
                        stateListAnimator.OLrzqt = 0;
                    }
                }
                i3++;
                i++;
            }
            return;
        }
        stateListAnimator.AEQbTJ = true;
        if (stateListAnimator.djBIcL == 0 && this.isConnected == 0) {
            return;
        }
        byte[] bArrCopydefault2 = copydefault(this.djBIcL, stateListAnimator);
        int i11 = stateListAnimator.AhwBna;
        int i12 = stateListAnimator.djBIcL;
        if (i12 != 0) {
            if (i12 == 1) {
                byte[] bArr4 = this.valueOf;
                int i13 = stateListAnimator.EZpvd;
                bArrCopydefault2[i11] = bArr4[(i13 >> 2) & 63];
                int i14 = i11 + 2;
                stateListAnimator.AhwBna = i14;
                bArrCopydefault2[i11 + 1] = bArr4[(i13 << 4) & 63];
                if (bArr4 == AEQbTJ) {
                    byte b = this.fetchVPNInfo;
                    bArrCopydefault2[i14] = b;
                    stateListAnimator.AhwBna = i11 + 4;
                    bArrCopydefault2[i11 + 3] = b;
                }
            } else if (i12 == 2) {
                byte[] bArr5 = this.valueOf;
                int i15 = stateListAnimator.EZpvd;
                bArrCopydefault2[i11] = bArr5[(i15 >> 10) & 63];
                bArrCopydefault2[i11 + 1] = bArr5[(i15 >> 4) & 63];
                int i16 = i11 + 3;
                stateListAnimator.AhwBna = i16;
                bArrCopydefault2[i11 + 2] = bArr5[(i15 << 2) & 63];
                if (bArr5 == AEQbTJ) {
                    stateListAnimator.AhwBna = i11 + 4;
                    bArrCopydefault2[i16] = this.fetchVPNInfo;
                }
            } else {
                throw new java.lang.IllegalStateException("Impossible modulus " + stateListAnimator.djBIcL);
            }
        }
        int i17 = stateListAnimator.OLrzqt;
        int i18 = stateListAnimator.AhwBna;
        int i19 = i17 + (i18 - i11);
        stateListAnimator.OLrzqt = i19;
        if (this.isConnected <= 0 || i19 <= 0) {
            return;
        }
        byte[] bArr6 = this.AhwBna;
        java.lang.System.arraycopy(bArr6, 0, bArrCopydefault2, i18, bArr6.length);
        stateListAnimator.AhwBna += this.AhwBna.length;
    }

    @Override // o.AbstractC59501ziI
    public void AEQbTJ(byte[] bArr, int i, int i2, AbstractC59501ziI.StateListAnimator stateListAnimator) {
        byte b;
        if (stateListAnimator.AEQbTJ) {
            return;
        }
        if (i2 < 0) {
            stateListAnimator.AEQbTJ = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] bArrCopydefault = copydefault(this.OLrzqt, stateListAnimator);
            byte b2 = bArr[i];
            if (b2 == this.fetchVPNInfo) {
                stateListAnimator.AEQbTJ = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = EZpvd;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i4 = (stateListAnimator.djBIcL + 1) % 4;
                    stateListAnimator.djBIcL = i4;
                    int i5 = (stateListAnimator.EZpvd << 6) + b;
                    stateListAnimator.EZpvd = i5;
                    if (i4 == 0) {
                        int i6 = stateListAnimator.AhwBna;
                        bArrCopydefault[i6] = (byte) ((i5 >> 16) & 255);
                        bArrCopydefault[i6 + 1] = (byte) ((i5 >> 8) & 255);
                        stateListAnimator.AhwBna = i6 + 3;
                        bArrCopydefault[i6 + 2] = (byte) (i5 & 255);
                    }
                }
            }
            i3++;
            i++;
        }
        if (!stateListAnimator.AEQbTJ || stateListAnimator.djBIcL == 0) {
            return;
        }
        byte[] bArrCopydefault2 = copydefault(this.OLrzqt, stateListAnimator);
        int i7 = stateListAnimator.djBIcL;
        if (i7 != 1) {
            if (i7 == 2) {
                int i8 = stateListAnimator.EZpvd >> 4;
                stateListAnimator.EZpvd = i8;
                int i9 = stateListAnimator.AhwBna;
                stateListAnimator.AhwBna = i9 + 1;
                bArrCopydefault2[i9] = (byte) (i8 & 255);
                return;
            }
            if (i7 == 3) {
                int i10 = stateListAnimator.EZpvd;
                int i11 = i10 >> 2;
                stateListAnimator.EZpvd = i11;
                int i12 = stateListAnimator.AhwBna;
                bArrCopydefault2[i12] = (byte) ((i10 >> 10) & 255);
                stateListAnimator.AhwBna = i12 + 2;
                bArrCopydefault2[i12 + 1] = (byte) (i11 & 255);
                return;
            }
            throw new java.lang.IllegalStateException("Impossible modulus " + stateListAnimator.djBIcL);
        }
    }

    public static byte[] OLrzqt(byte[] bArr) {
        return KWHzl(bArr, false);
    }

    public static java.lang.String KWHzl(byte[] bArr) {
        return C59500ziH.AEQbTJ(KWHzl(bArr, false));
    }

    public static byte[] EZpvd(byte[] bArr) {
        return copydefault(bArr, false, true);
    }

    public static java.lang.String AEQbTJ(byte[] bArr) {
        return C59500ziH.AEQbTJ(copydefault(bArr, false, true));
    }

    public static byte[] KWHzl(byte[] bArr, boolean z) {
        return copydefault(bArr, z, false);
    }

    public static byte[] copydefault(byte[] bArr, boolean z, boolean z2) {
        return EZpvd(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] EZpvd(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C59497ziE c59497ziE = z ? new C59497ziE(z2) : new C59497ziE(0, copydefault, z2);
        long jGEmmrt = c59497ziE.gEmmrt(bArr);
        if (jGEmmrt > i) {
            throw new java.lang.IllegalArgumentException("Input array too big, the output array would be bigger (" + jGEmmrt + ") than the specified maximum size of " + i);
        }
        return c59497ziE.AYXKKw(bArr);
    }

    public static byte[] KWHzl(java.lang.String str) {
        return new C59497ziE().EZpvd(str);
    }

    public static byte[] copydefault(byte[] bArr) {
        return new C59497ziE().valueOf(bArr);
    }

    @Override // o.AbstractC59501ziI
    public boolean copydefault(byte b) {
        if (b >= 0) {
            byte[] bArr = this.AYXKKw;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }
}
