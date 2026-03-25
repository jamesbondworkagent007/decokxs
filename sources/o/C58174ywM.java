package o;

import com.google.common.base.Ascii;
import o.AbstractC58176ywO;
import okio.Utf8;

/* JADX INFO: renamed from: o.ywM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58174ywM extends AbstractC58176ywO {
    public final int AhwBna;
    public final int copydefault;
    public final byte[] djBIcL;
    public final byte[] gEmmrt;
    public final byte[] valueOf;
    public static final byte[] OLrzqt = {Ascii.CR, 10};
    public static final byte[] AEQbTJ = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] EZpvd = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] KWHzl = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public C58174ywM() {
        this(0);
    }

    public C58174ywM(boolean z) {
        this(76, OLrzqt, z);
    }

    public C58174ywM(int i) {
        this(i, OLrzqt);
    }

    public C58174ywM(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public C58174ywM(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.valueOf = KWHzl;
        if (bArr == null) {
            this.AhwBna = 4;
            this.gEmmrt = null;
        } else {
            if (OLrzqt(bArr)) {
                throw new java.lang.IllegalArgumentException("lineSeparator must not contain base64 characters: [" + C58178ywQ.EZpvd(bArr) + "]");
            }
            if (i > 0) {
                this.AhwBna = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.gEmmrt = bArr2;
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.AhwBna = 4;
                this.gEmmrt = null;
            }
        }
        this.copydefault = this.AhwBna - 1;
        this.djBIcL = z ? EZpvd : AEQbTJ;
    }

    @Override // o.AbstractC58176ywO
    public void AEQbTJ(byte[] bArr, int i, int i2, AbstractC58176ywO.StateListAnimator stateListAnimator) {
        if (stateListAnimator.AEQbTJ) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] bArrCopydefault = copydefault(this.AhwBna, stateListAnimator);
                int i4 = (stateListAnimator.AhwBna + 1) % 3;
                stateListAnimator.AhwBna = i4;
                int i5 = bArr[i];
                if (i5 < 0) {
                    i5 += 256;
                }
                int i6 = (stateListAnimator.KWHzl << 8) + i5;
                stateListAnimator.KWHzl = i6;
                if (i4 == 0) {
                    int i7 = stateListAnimator.AYXKKw;
                    byte[] bArr2 = this.djBIcL;
                    bArrCopydefault[i7] = bArr2[(i6 >> 18) & 63];
                    bArrCopydefault[i7 + 1] = bArr2[(i6 >> 12) & 63];
                    bArrCopydefault[i7 + 2] = bArr2[(i6 >> 6) & 63];
                    int i8 = i7 + 4;
                    stateListAnimator.AYXKKw = i8;
                    bArrCopydefault[i7 + 3] = bArr2[i6 & 63];
                    int i9 = stateListAnimator.copydefault + 4;
                    stateListAnimator.copydefault = i9;
                    int i10 = this.AkhnZx;
                    if (i10 > 0 && i10 <= i9) {
                        byte[] bArr3 = this.gEmmrt;
                        java.lang.System.arraycopy(bArr3, 0, bArrCopydefault, i8, bArr3.length);
                        stateListAnimator.AYXKKw += this.gEmmrt.length;
                        stateListAnimator.copydefault = 0;
                    }
                }
                i3++;
                i++;
            }
            return;
        }
        stateListAnimator.AEQbTJ = true;
        if (stateListAnimator.AhwBna == 0 && this.AkhnZx == 0) {
            return;
        }
        byte[] bArrCopydefault2 = copydefault(this.AhwBna, stateListAnimator);
        int i11 = stateListAnimator.AYXKKw;
        int i12 = stateListAnimator.AhwBna;
        if (i12 != 0) {
            if (i12 == 1) {
                byte[] bArr4 = this.djBIcL;
                int i13 = stateListAnimator.KWHzl;
                bArrCopydefault2[i11] = bArr4[(i13 >> 2) & 63];
                int i14 = i11 + 2;
                stateListAnimator.AYXKKw = i14;
                bArrCopydefault2[i11 + 1] = bArr4[(i13 << 4) & 63];
                if (bArr4 == AEQbTJ) {
                    byte b = this.fetchVPNInfo;
                    bArrCopydefault2[i14] = b;
                    stateListAnimator.AYXKKw = i11 + 4;
                    bArrCopydefault2[i11 + 3] = b;
                }
            } else if (i12 == 2) {
                byte[] bArr5 = this.djBIcL;
                int i15 = stateListAnimator.KWHzl;
                bArrCopydefault2[i11] = bArr5[(i15 >> 10) & 63];
                bArrCopydefault2[i11 + 1] = bArr5[(i15 >> 4) & 63];
                int i16 = i11 + 3;
                stateListAnimator.AYXKKw = i16;
                bArrCopydefault2[i11 + 2] = bArr5[(i15 << 2) & 63];
                if (bArr5 == AEQbTJ) {
                    stateListAnimator.AYXKKw = i11 + 4;
                    bArrCopydefault2[i16] = this.fetchVPNInfo;
                }
            } else {
                throw new java.lang.IllegalStateException("Impossible modulus " + stateListAnimator.AhwBna);
            }
        }
        int i17 = stateListAnimator.copydefault;
        int i18 = stateListAnimator.AYXKKw;
        int i19 = i17 + (i18 - i11);
        stateListAnimator.copydefault = i19;
        if (this.AkhnZx <= 0 || i19 <= 0) {
            return;
        }
        byte[] bArr6 = this.gEmmrt;
        java.lang.System.arraycopy(bArr6, 0, bArrCopydefault2, i18, bArr6.length);
        stateListAnimator.AYXKKw += this.gEmmrt.length;
    }

    @Override // o.AbstractC58176ywO
    public void copydefault(byte[] bArr, int i, int i2, AbstractC58176ywO.StateListAnimator stateListAnimator) {
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
            byte[] bArrCopydefault = copydefault(this.copydefault, stateListAnimator);
            byte b2 = bArr[i];
            if (b2 == this.fetchVPNInfo) {
                stateListAnimator.AEQbTJ = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = KWHzl;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i4 = (stateListAnimator.AhwBna + 1) % 4;
                    stateListAnimator.AhwBna = i4;
                    int i5 = (stateListAnimator.KWHzl << 6) + b;
                    stateListAnimator.KWHzl = i5;
                    if (i4 == 0) {
                        int i6 = stateListAnimator.AYXKKw;
                        bArrCopydefault[i6] = (byte) ((i5 >> 16) & 255);
                        bArrCopydefault[i6 + 1] = (byte) ((i5 >> 8) & 255);
                        stateListAnimator.AYXKKw = i6 + 3;
                        bArrCopydefault[i6 + 2] = (byte) (i5 & 255);
                    }
                }
            }
            i3++;
            i++;
        }
        if (!stateListAnimator.AEQbTJ || stateListAnimator.AhwBna == 0) {
            return;
        }
        byte[] bArrCopydefault2 = copydefault(this.copydefault, stateListAnimator);
        int i7 = stateListAnimator.AhwBna;
        if (i7 != 1) {
            if (i7 == 2) {
                int i8 = stateListAnimator.KWHzl >> 4;
                stateListAnimator.KWHzl = i8;
                int i9 = stateListAnimator.AYXKKw;
                stateListAnimator.AYXKKw = i9 + 1;
                bArrCopydefault2[i9] = (byte) (i8 & 255);
                return;
            }
            if (i7 == 3) {
                int i10 = stateListAnimator.KWHzl;
                int i11 = i10 >> 2;
                stateListAnimator.KWHzl = i11;
                int i12 = stateListAnimator.AYXKKw;
                bArrCopydefault2[i12] = (byte) ((i10 >> 10) & 255);
                stateListAnimator.AYXKKw = i12 + 2;
                bArrCopydefault2[i12 + 1] = (byte) (i11 & 255);
                return;
            }
            throw new java.lang.IllegalStateException("Impossible modulus " + stateListAnimator.AhwBna);
        }
    }

    public static java.lang.String EZpvd(byte[] bArr) {
        return C58178ywQ.KWHzl(KWHzl(bArr, false));
    }

    public static byte[] AEQbTJ(byte[] bArr) {
        return OLrzqt(bArr, false, true);
    }

    public static java.lang.String copydefault(byte[] bArr) {
        return C58178ywQ.KWHzl(OLrzqt(bArr, false, true));
    }

    public static byte[] KWHzl(byte[] bArr, boolean z) {
        return OLrzqt(bArr, z, false);
    }

    public static byte[] OLrzqt(byte[] bArr, boolean z, boolean z2) {
        return copydefault(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] copydefault(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C58174ywM c58174ywM = z ? new C58174ywM(z2) : new C58174ywM(0, OLrzqt, z2);
        long jAYXKKw = c58174ywM.AYXKKw(bArr);
        if (jAYXKKw > i) {
            throw new java.lang.IllegalArgumentException("Input array too big, the output array would be bigger (" + jAYXKKw + ") than the specified maximum size of " + i);
        }
        return c58174ywM.gEmmrt(bArr);
    }

    public static byte[] KWHzl(java.lang.String str) {
        return new C58174ywM().copydefault(str);
    }

    public static byte[] KWHzl(byte[] bArr) {
        return new C58174ywM().valueOf(bArr);
    }

    @Override // o.AbstractC58176ywO
    public boolean AEQbTJ(byte b) {
        if (b >= 0) {
            byte[] bArr = this.valueOf;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }
}
