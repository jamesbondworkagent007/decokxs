package o;

import com.google.common.base.Ascii;
import o.AbstractC58176ywO;

/* JADX INFO: renamed from: o.ywN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58175ywN extends AbstractC58176ywO {
    public final byte[] AYXKKw;
    public final byte[] AhwBna;
    public final int djBIcL;
    public final byte[] gEmmrt;
    public final int valueOf;
    public static final byte[] OLrzqt = {Ascii.CR, 10};
    public static final byte[] AEQbTJ = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM};
    public static final byte[] KWHzl = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    public static final byte[] copydefault = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US};
    public static final byte[] EZpvd = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};

    public C58175ywN() {
        this(false);
    }

    public C58175ywN(boolean z) {
        this(0, null, z, (byte) 61);
    }

    public C58175ywN(int i, byte[] bArr, boolean z, byte b) {
        super(5, 8, i, bArr == null ? 0 : bArr.length, b);
        if (z) {
            this.AYXKKw = EZpvd;
            this.gEmmrt = copydefault;
        } else {
            this.AYXKKw = KWHzl;
            this.gEmmrt = AEQbTJ;
        }
        if (i <= 0) {
            this.valueOf = 8;
            this.AhwBna = null;
        } else {
            if (bArr == null) {
                throw new java.lang.IllegalArgumentException("lineLength " + i + " > 0, but lineSeparator is null");
            }
            if (OLrzqt(bArr)) {
                throw new java.lang.IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + C58178ywQ.EZpvd(bArr) + "]");
            }
            this.valueOf = bArr.length + 8;
            byte[] bArr2 = new byte[bArr.length];
            this.AhwBna = bArr2;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.djBIcL = this.valueOf - 1;
        if (AEQbTJ(b) || AbstractC58176ywO.EZpvd(b)) {
            throw new java.lang.IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // o.AbstractC58176ywO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(byte[] bArr, int i, int i2, AbstractC58176ywO.StateListAnimator stateListAnimator) {
        int i3;
        byte b;
        if (stateListAnimator.AEQbTJ) {
            return;
        }
        ?? r3 = 1;
        if (i2 < 0) {
            stateListAnimator.AEQbTJ = true;
        }
        int i4 = 0;
        int i5 = i;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            byte b2 = bArr[i5];
            if (b2 == this.fetchVPNInfo) {
                stateListAnimator.AEQbTJ = r3;
                break;
            }
            byte[] bArrCopydefault = copydefault(this.djBIcL, stateListAnimator);
            if (b2 >= 0) {
                byte[] bArr2 = this.gEmmrt;
                if (b2 >= bArr2.length || (b = bArr2[b2]) < 0) {
                    i3 = i5;
                } else {
                    int i6 = (stateListAnimator.AhwBna + r3) % 8;
                    stateListAnimator.AhwBna = i6;
                    i3 = i5;
                    stateListAnimator.EZpvd = (stateListAnimator.EZpvd << 5) + ((long) b);
                    if (i6 == 0) {
                        int i7 = stateListAnimator.AYXKKw;
                        bArrCopydefault[i7] = (byte) ((r13 >> 32) & 255);
                        bArrCopydefault[i7 + 1] = (byte) ((r13 >> 24) & 255);
                        bArrCopydefault[i7 + 2] = (byte) ((r13 >> 16) & 255);
                        bArrCopydefault[i7 + 3] = (byte) ((r13 >> 8) & 255);
                        stateListAnimator.AYXKKw = i7 + 5;
                        bArrCopydefault[i7 + 4] = (byte) (r13 & 255);
                    }
                }
            }
            i4++;
            i5 = i3 + 1;
            r3 = 1;
        }
        if (!stateListAnimator.AEQbTJ || stateListAnimator.AhwBna < 2) {
            return;
        }
        byte[] bArrCopydefault2 = copydefault(this.djBIcL, stateListAnimator);
        switch (stateListAnimator.AhwBna) {
            case 2:
                int i8 = stateListAnimator.AYXKKw;
                stateListAnimator.AYXKKw = i8 + 1;
                bArrCopydefault2[i8] = (byte) ((stateListAnimator.EZpvd >> 2) & 255);
                return;
            case 3:
                int i9 = stateListAnimator.AYXKKw;
                stateListAnimator.AYXKKw = i9 + 1;
                bArrCopydefault2[i9] = (byte) ((stateListAnimator.EZpvd >> 7) & 255);
                return;
            case 4:
                stateListAnimator.EZpvd = stateListAnimator.EZpvd >> 4;
                int i10 = stateListAnimator.AYXKKw;
                bArrCopydefault2[i10] = (byte) ((r3 >> 12) & 255);
                stateListAnimator.AYXKKw = i10 + 2;
                bArrCopydefault2[i10 + 1] = (byte) (r5 & 255);
                return;
            case 5:
                stateListAnimator.EZpvd = stateListAnimator.EZpvd >> 1;
                int i11 = stateListAnimator.AYXKKw;
                bArrCopydefault2[i11] = (byte) ((r4 >> 17) & 255);
                bArrCopydefault2[i11 + 1] = (byte) ((r4 >> 9) & 255);
                stateListAnimator.AYXKKw = i11 + 3;
                bArrCopydefault2[i11 + 2] = (byte) (r9 & 255);
                return;
            case 6:
                stateListAnimator.EZpvd = stateListAnimator.EZpvd >> 6;
                int i12 = stateListAnimator.AYXKKw;
                bArrCopydefault2[i12] = (byte) ((r4 >> 22) & 255);
                bArrCopydefault2[i12 + 1] = (byte) ((r4 >> 14) & 255);
                stateListAnimator.AYXKKw = i12 + 3;
                bArrCopydefault2[i12 + 2] = (byte) (r9 & 255);
                return;
            case 7:
                stateListAnimator.EZpvd = stateListAnimator.EZpvd >> 3;
                int i13 = stateListAnimator.AYXKKw;
                bArrCopydefault2[i13] = (byte) ((r3 >> 27) & 255);
                bArrCopydefault2[i13 + 1] = (byte) ((r3 >> 19) & 255);
                bArrCopydefault2[i13 + 2] = (byte) ((r3 >> 11) & 255);
                stateListAnimator.AYXKKw = i13 + 4;
                bArrCopydefault2[i13 + 3] = (byte) (r9 & 255);
                return;
            default:
                throw new java.lang.IllegalStateException("Impossible modulus " + stateListAnimator.AhwBna);
        }
    }

    @Override // o.AbstractC58176ywO
    public void AEQbTJ(byte[] bArr, int i, int i2, AbstractC58176ywO.StateListAnimator stateListAnimator) {
        if (stateListAnimator.AEQbTJ) {
            return;
        }
        int i3 = 1;
        if (i2 >= 0) {
            int i4 = i;
            int i5 = 0;
            while (i5 < i2) {
                byte[] bArrCopydefault = copydefault(this.valueOf, stateListAnimator);
                int i6 = (stateListAnimator.AhwBna + i3) % 5;
                stateListAnimator.AhwBna = i6;
                int i7 = i4 + 1;
                int i8 = bArr[i4];
                if (i8 < 0) {
                    i8 += 256;
                }
                long j = (stateListAnimator.EZpvd << 8) + ((long) i8);
                stateListAnimator.EZpvd = j;
                if (i6 == 0) {
                    int i9 = stateListAnimator.AYXKKw;
                    byte[] bArr2 = this.AYXKKw;
                    bArrCopydefault[i9] = bArr2[((int) (j >> 35)) & 31];
                    bArrCopydefault[i9 + 1] = bArr2[((int) (j >> 30)) & 31];
                    bArrCopydefault[i9 + 2] = bArr2[((int) (j >> 25)) & 31];
                    bArrCopydefault[i9 + 3] = bArr2[((int) (j >> 20)) & 31];
                    bArrCopydefault[i9 + 4] = bArr2[((int) (j >> 15)) & 31];
                    bArrCopydefault[i9 + 5] = bArr2[((int) (j >> 10)) & 31];
                    bArrCopydefault[i9 + 6] = bArr2[((int) (j >> 5)) & 31];
                    int i10 = i9 + 8;
                    stateListAnimator.AYXKKw = i10;
                    bArrCopydefault[i9 + 7] = bArr2[((int) j) & 31];
                    int i11 = stateListAnimator.copydefault + 8;
                    stateListAnimator.copydefault = i11;
                    int i12 = this.AkhnZx;
                    if (i12 > 0 && i12 <= i11) {
                        byte[] bArr3 = this.AhwBna;
                        java.lang.System.arraycopy(bArr3, 0, bArrCopydefault, i10, bArr3.length);
                        stateListAnimator.AYXKKw += this.AhwBna.length;
                        stateListAnimator.copydefault = 0;
                    }
                }
                i5++;
                i4 = i7;
                i3 = 1;
            }
            return;
        }
        stateListAnimator.AEQbTJ = true;
        if (stateListAnimator.AhwBna == 0 && this.AkhnZx == 0) {
            return;
        }
        byte[] bArrCopydefault2 = copydefault(this.valueOf, stateListAnimator);
        int i13 = stateListAnimator.AYXKKw;
        int i14 = stateListAnimator.AhwBna;
        if (i14 != 0) {
            if (i14 == 1) {
                byte[] bArr4 = this.AYXKKw;
                long j2 = stateListAnimator.EZpvd;
                bArrCopydefault2[i13] = bArr4[((int) (j2 >> 3)) & 31];
                bArrCopydefault2[i13 + 1] = bArr4[((int) (j2 << 2)) & 31];
                byte b = this.fetchVPNInfo;
                bArrCopydefault2[i13 + 2] = b;
                bArrCopydefault2[i13 + 3] = b;
                bArrCopydefault2[i13 + 4] = b;
                bArrCopydefault2[i13 + 5] = b;
                bArrCopydefault2[i13 + 6] = b;
                stateListAnimator.AYXKKw = i13 + 8;
                bArrCopydefault2[i13 + 7] = b;
            } else if (i14 == 2) {
                byte[] bArr5 = this.AYXKKw;
                long j3 = stateListAnimator.EZpvd;
                bArrCopydefault2[i13] = bArr5[((int) (j3 >> 11)) & 31];
                bArrCopydefault2[i13 + 1] = bArr5[((int) (j3 >> 6)) & 31];
                bArrCopydefault2[i13 + 2] = bArr5[((int) (j3 >> 1)) & 31];
                bArrCopydefault2[i13 + 3] = bArr5[((int) (j3 << 4)) & 31];
                byte b2 = this.fetchVPNInfo;
                bArrCopydefault2[i13 + 4] = b2;
                bArrCopydefault2[i13 + 5] = b2;
                bArrCopydefault2[i13 + 6] = b2;
                stateListAnimator.AYXKKw = i13 + 8;
                bArrCopydefault2[i13 + 7] = b2;
            } else if (i14 == 3) {
                byte[] bArr6 = this.AYXKKw;
                long j4 = stateListAnimator.EZpvd;
                bArrCopydefault2[i13] = bArr6[((int) (j4 >> 19)) & 31];
                bArrCopydefault2[i13 + 1] = bArr6[((int) (j4 >> 14)) & 31];
                bArrCopydefault2[i13 + 2] = bArr6[((int) (j4 >> 9)) & 31];
                bArrCopydefault2[i13 + 3] = bArr6[((int) (j4 >> 4)) & 31];
                bArrCopydefault2[i13 + 4] = bArr6[((int) (j4 << 1)) & 31];
                byte b3 = this.fetchVPNInfo;
                bArrCopydefault2[i13 + 5] = b3;
                bArrCopydefault2[i13 + 6] = b3;
                stateListAnimator.AYXKKw = i13 + 8;
                bArrCopydefault2[i13 + 7] = b3;
            } else if (i14 == 4) {
                byte[] bArr7 = this.AYXKKw;
                long j5 = stateListAnimator.EZpvd;
                bArrCopydefault2[i13] = bArr7[((int) (j5 >> 27)) & 31];
                bArrCopydefault2[i13 + 1] = bArr7[((int) (j5 >> 22)) & 31];
                bArrCopydefault2[i13 + 2] = bArr7[((int) (j5 >> 17)) & 31];
                bArrCopydefault2[i13 + 3] = bArr7[((int) (j5 >> 12)) & 31];
                bArrCopydefault2[i13 + 4] = bArr7[((int) (j5 >> 7)) & 31];
                bArrCopydefault2[i13 + 5] = bArr7[((int) (j5 >> 2)) & 31];
                bArrCopydefault2[i13 + 6] = bArr7[((int) (j5 << 3)) & 31];
                stateListAnimator.AYXKKw = i13 + 8;
                bArrCopydefault2[i13 + 7] = this.fetchVPNInfo;
            } else {
                throw new java.lang.IllegalStateException("Impossible modulus " + stateListAnimator.AhwBna);
            }
        }
        int i15 = stateListAnimator.copydefault;
        int i16 = stateListAnimator.AYXKKw;
        int i17 = i15 + (i16 - i13);
        stateListAnimator.copydefault = i17;
        if (this.AkhnZx <= 0 || i17 <= 0) {
            return;
        }
        byte[] bArr8 = this.AhwBna;
        java.lang.System.arraycopy(bArr8, 0, bArrCopydefault2, i16, bArr8.length);
        stateListAnimator.AYXKKw += this.AhwBna.length;
    }

    @Override // o.AbstractC58176ywO
    public boolean AEQbTJ(byte b) {
        if (b >= 0) {
            byte[] bArr = this.gEmmrt;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }
}
