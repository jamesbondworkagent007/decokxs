package o;

import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.abK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7010abK {
    public final int AEQbTJ;
    public final int[] KWHzl;
    public int[] copydefault;
    public boolean[] EZpvd = new boolean[256];
    public int[] gEmmrt = new int[64];
    public int[] OLrzqt = new int[64];

    public C7010abK(int[] iArr, int i) {
        this.KWHzl = iArr;
        this.AEQbTJ = i;
        int[] iArr2 = new int[18];
        this.copydefault = iArr2;
        iArr2[0] = OLrzqt(2048, 0, i - 1);
        for (int i2 = 1; i2 <= 16; i2++) {
            int[] iArr3 = this.copydefault;
            iArr3[i2] = OLrzqt(i2 << 12, iArr3[i2 - 1], this.AEQbTJ - 1);
        }
        this.copydefault[17] = this.AEQbTJ - 1;
        OLrzqt();
    }

    public boolean EZpvd(int i) {
        if (i <= 255) {
            return this.EZpvd[i];
        }
        if (i <= 2047) {
            return (this.gEmmrt[i & 63] & (1 << (i >> 6))) != 0;
        }
        if (i >= 55296 && (i < 57344 || i > 65535)) {
            if (i > 1114111) {
                return false;
            }
            int[] iArr = this.copydefault;
            return copydefault(i, iArr[13], iArr[17]);
        }
        int i2 = i >> 12;
        int i3 = (this.OLrzqt[(i >> 6) & 63] >> i2) & 65537;
        if (i3 <= 1) {
            return i3 != 0;
        }
        int[] iArr2 = this.copydefault;
        return copydefault(i, iArr2[i2], iArr2[i2 + 1]);
    }

    public final int OLrzqt(java.lang.CharSequence charSequence, int i, UnicodeSet.SpanCondition spanCondition, C7253agO c7253agO) {
        int i2;
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int length = charSequence.length();
        char c = 57344;
        char c2 = 55296;
        char c3 = 2047;
        char c4 = 255;
        int i5 = 0;
        if (UnicodeSet.SpanCondition.NOT_CONTAINED != spanCondition) {
            i2 = i;
            while (i2 < length) {
                char cCharAt3 = charSequence.charAt(i2);
                if (cCharAt3 <= c4) {
                    if (!this.EZpvd[cCharAt3]) {
                        break;
                    }
                    i2++;
                    c = 57344;
                    c2 = 55296;
                    c4 = 255;
                } else if (cCharAt3 <= 2047) {
                    if ((this.gEmmrt[cCharAt3 & '?'] & (1 << (cCharAt3 >> 6))) == 0) {
                        break;
                    }
                    i2++;
                    c = 57344;
                    c2 = 55296;
                    c4 = 255;
                } else if (cCharAt3 < c2 || cCharAt3 >= 56320 || (i4 = i2 + 1) == length || (cCharAt2 = charSequence.charAt(i4)) < 56320 || cCharAt2 >= c) {
                    int i6 = cCharAt3 >> '\f';
                    int i7 = (this.OLrzqt[(cCharAt3 >> 6) & 63] >> i6) & 65537;
                    if (i7 > 1) {
                        int[] iArr = this.copydefault;
                        if (!copydefault(cCharAt3, iArr[i6], iArr[i6 + 1])) {
                            break;
                        }
                        i2++;
                        c = 57344;
                        c2 = 55296;
                        c4 = 255;
                    } else {
                        if (i7 == 0) {
                            break;
                        }
                        i2++;
                        c = 57344;
                        c2 = 55296;
                        c4 = 255;
                    }
                } else {
                    int codePoint = java.lang.Character.toCodePoint(cCharAt3, cCharAt2);
                    int[] iArr2 = this.copydefault;
                    if (!copydefault(codePoint, iArr2[16], iArr2[17])) {
                        break;
                    }
                    i5++;
                    i2 = i4;
                    i2++;
                    c = 57344;
                    c2 = 55296;
                    c4 = 255;
                }
            }
        } else {
            i2 = i;
            while (i2 < length) {
                char cCharAt4 = charSequence.charAt(i2);
                if (cCharAt4 <= 255) {
                    if (this.EZpvd[cCharAt4]) {
                        break;
                    }
                } else if (cCharAt4 <= c3) {
                    if ((this.gEmmrt[cCharAt4 & '?'] & (1 << (cCharAt4 >> 6))) != 0) {
                        break;
                    }
                } else if (cCharAt4 < 55296 || cCharAt4 >= 56320 || (i3 = i2 + 1) == length || (cCharAt = charSequence.charAt(i3)) < 56320 || cCharAt >= 57344) {
                    int i8 = cCharAt4 >> '\f';
                    int i9 = (this.OLrzqt[(cCharAt4 >> 6) & 63] >> i8) & 65537;
                    if (i9 > 1) {
                        int[] iArr3 = this.copydefault;
                        if (copydefault(cCharAt4, iArr3[i8], iArr3[i8 + 1])) {
                            break;
                        }
                    } else if (i9 != 0) {
                        break;
                    }
                } else {
                    int codePoint2 = java.lang.Character.toCodePoint(cCharAt4, cCharAt);
                    int[] iArr4 = this.copydefault;
                    if (copydefault(codePoint2, iArr4[16], iArr4[17])) {
                        break;
                    }
                    i5++;
                    i2 = i3;
                }
                i2++;
                c3 = 2047;
            }
        }
        if (c7253agO != null) {
            c7253agO.OLrzqt = (i2 - i) - i5;
        }
        return i2;
    }

    public final int AEQbTJ(java.lang.CharSequence charSequence, int i, UnicodeSet.SpanCondition spanCondition) {
        int i2;
        char cCharAt;
        char cCharAt2;
        if (UnicodeSet.SpanCondition.NOT_CONTAINED != spanCondition) {
            do {
                i2 = i - 1;
                char cCharAt3 = charSequence.charAt(i2);
                if (cCharAt3 <= 255) {
                    if (!this.EZpvd[cCharAt3]) {
                    }
                    i = i2;
                } else if (cCharAt3 <= 2047) {
                    if ((this.gEmmrt[cCharAt3 & '?'] & (1 << (cCharAt3 >> 6))) == 0) {
                    }
                    i = i2;
                } else if (cCharAt3 < 55296 || cCharAt3 < 56320 || i2 == 0 || (cCharAt2 = charSequence.charAt(i - 2)) < 55296 || cCharAt2 >= 56320) {
                    int i3 = cCharAt3 >> '\f';
                    int i4 = (this.OLrzqt[(cCharAt3 >> 6) & 63] >> i3) & 65537;
                    if (i4 <= 1) {
                        if (i4 == 0) {
                        }
                        i = i2;
                    } else {
                        int[] iArr = this.copydefault;
                        if (!copydefault(cCharAt3, iArr[i3], iArr[i3 + 1])) {
                        }
                        i = i2;
                    }
                } else {
                    int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                    int[] iArr2 = this.copydefault;
                    if (!copydefault(codePoint, iArr2[16], iArr2[17])) {
                    }
                }
            } while (i != 0);
            return 0;
        }
        do {
            i2 = i - 1;
            char cCharAt4 = charSequence.charAt(i2);
            if (cCharAt4 <= 255) {
                if (this.EZpvd[cCharAt4]) {
                }
                i = i2;
            } else if (cCharAt4 <= 2047) {
                if ((this.gEmmrt[cCharAt4 & '?'] & (1 << (cCharAt4 >> 6))) != 0) {
                }
                i = i2;
            } else if (cCharAt4 < 55296 || cCharAt4 < 56320 || i2 == 0 || (cCharAt = charSequence.charAt(i - 2)) < 55296 || cCharAt >= 56320) {
                int i5 = cCharAt4 >> '\f';
                int i6 = (this.OLrzqt[(cCharAt4 >> 6) & 63] >> i5) & 65537;
                if (i6 <= 1) {
                    if (i6 != 0) {
                    }
                    i = i2;
                } else {
                    int[] iArr3 = this.copydefault;
                    if (copydefault(cCharAt4, iArr3[i5], iArr3[i5 + 1])) {
                    }
                    i = i2;
                }
            } else {
                int codePoint2 = java.lang.Character.toCodePoint(cCharAt, cCharAt4);
                int[] iArr4 = this.copydefault;
                if (copydefault(codePoint2, iArr4[16], iArr4[17])) {
                }
            }
        } while (i != 0);
        return 0;
        return i2 + 1;
    }

    public static void EZpvd(int[] iArr, int i, int i2) {
        int i3 = i >> 6;
        int i4 = i & 63;
        int i5 = 1 << i3;
        if (i + 1 == i2) {
            iArr[i4] = iArr[i4] | i5;
            return;
        }
        int i6 = i2 >> 6;
        int i7 = i2 & 63;
        if (i3 == i6) {
            while (i4 < i7) {
                iArr[i4] = iArr[i4] | i5;
                i4++;
            }
            return;
        }
        if (i4 > 0) {
            while (true) {
                int i8 = i4 + 1;
                iArr[i4] = iArr[i4] | i5;
                if (i8 >= 64) {
                    break;
                } else {
                    i4 = i8;
                }
            }
            i3++;
        }
        if (i3 < i6) {
            int i9 = ~((1 << i3) - 1);
            if (i6 < 32) {
                i9 &= (1 << i6) - 1;
            }
            for (int i10 = 0; i10 < 64; i10++) {
                iArr[i10] = iArr[i10] | i9;
            }
        }
        for (int i11 = 0; i11 < i7; i11++) {
            iArr[i11] = iArr[i11] | (1 << i6);
        }
    }

    public final void OLrzqt() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (true) {
            int[] iArr = this.KWHzl;
            int i6 = i5 + 1;
            i = iArr[i5];
            if (i6 < this.AEQbTJ) {
                i5 += 2;
                i2 = iArr[i6];
            } else {
                i5 = i6;
                i2 = 1114112;
            }
            if (i >= 256) {
                break;
            }
            while (true) {
                i4 = i + 1;
                this.EZpvd[i] = true;
                if (i4 >= i2 || i4 >= 256) {
                    break;
                } else {
                    i = i4;
                }
            }
            if (i2 > 256) {
                i = i4;
                break;
            }
        }
        while (true) {
            i3 = 2048;
            if (i >= 2048) {
                break;
            }
            EZpvd(this.gEmmrt, i, i2 <= 2048 ? i2 : 2048);
            if (i2 > 2048) {
                i = 2048;
                break;
            }
            int[] iArr2 = this.KWHzl;
            int i7 = i5 + 1;
            i = iArr2[i5];
            if (i7 < this.AEQbTJ) {
                i5 += 2;
                i2 = iArr2[i7];
            } else {
                i5 = i7;
                i2 = 1114112;
            }
        }
        while (i < 65536) {
            if (i2 > 65536) {
                i2 = 65536;
            }
            if (i < i3) {
                i = i3;
            }
            if (i < i2) {
                if ((i & 63) != 0) {
                    int i8 = i >> 6;
                    int[] iArr3 = this.OLrzqt;
                    int i9 = i8 & 63;
                    iArr3[i9] = (65537 << (i >> 12)) | iArr3[i9];
                    i3 = (i8 + 1) << 6;
                    i = i3;
                }
                if (i < i2) {
                    if (i < (i2 & (-64))) {
                        EZpvd(this.OLrzqt, i >> 6, i2 >> 6);
                    }
                    if ((i2 & 63) != 0) {
                        int i10 = i2 >> 6;
                        int[] iArr4 = this.OLrzqt;
                        int i11 = i10 & 63;
                        iArr4[i11] = (65537 << (i2 >> 12)) | iArr4[i11];
                        i2 = (i10 + 1) << 6;
                        i3 = i2;
                    }
                }
            }
            if (i2 == 65536) {
                return;
            }
            int[] iArr5 = this.KWHzl;
            int i12 = i5 + 1;
            int i13 = iArr5[i5];
            if (i12 < this.AEQbTJ) {
                i5 += 2;
                i2 = iArr5[i12];
            } else {
                i5 = i12;
                i2 = 1114112;
            }
            i = i13;
        }
    }

    public final int OLrzqt(int i, int i2, int i3) {
        int[] iArr = this.KWHzl;
        if (i < iArr[i2]) {
            return i2;
        }
        if (i2 >= i3 || i >= iArr[i3 - 1]) {
            return i3;
        }
        while (true) {
            int i4 = (i2 + i3) >>> 1;
            if (i4 == i2) {
                return i3;
            }
            if (i < this.KWHzl[i4]) {
                i3 = i4;
            } else {
                i2 = i4;
            }
        }
    }

    public final boolean copydefault(int i, int i2, int i3) {
        return (OLrzqt(i, i2, i3) & 1) != 0;
    }
}
