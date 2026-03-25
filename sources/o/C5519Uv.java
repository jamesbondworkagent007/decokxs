package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: renamed from: o.Uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5519Uv {
    public static final char[] AEQbTJ = C5521Ux.AEQbTJ(true);
    public static final byte[] KWHzl = C5521Ux.EZpvd(true);
    public static final C5519Uv OLrzqt = new C5519Uv();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C5519Uv AEQbTJ() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final char[] EZpvd() {
        return new char[]{AbstractJsonLexerKt.STRING_ESC, 0, '0', '0', 0, 0};
    }

    public char[] copydefault(java.lang.String str) {
        int iEZpvd;
        int length = str.length();
        char[] cArrGEmmrt = new char[KWHzl(length)];
        int[] iArrOLrzqt = C5521Ux.OLrzqt();
        int length2 = iArrOLrzqt.length;
        C5544Vu c5544VuOLrzqt = null;
        char[] cArrEZpvd = null;
        int i = 0;
        int i2 = 0;
        loop0: while (i2 < length) {
            do {
                char cCharAt = str.charAt(i2);
                if (cCharAt >= length2 || iArrOLrzqt[cCharAt] == 0) {
                    if (i >= cArrGEmmrt.length) {
                        if (c5544VuOLrzqt == null) {
                            c5544VuOLrzqt = C5544Vu.OLrzqt(cArrGEmmrt);
                        }
                        cArrGEmmrt = c5544VuOLrzqt.gEmmrt();
                        i = 0;
                    }
                    cArrGEmmrt[i] = cCharAt;
                    i2++;
                    i++;
                } else {
                    if (cArrEZpvd == null) {
                        cArrEZpvd = EZpvd();
                    }
                    char cCharAt2 = str.charAt(i2);
                    int i3 = iArrOLrzqt[cCharAt2];
                    if (i3 < 0) {
                        iEZpvd = AEQbTJ(cCharAt2, cArrEZpvd);
                    } else {
                        iEZpvd = EZpvd(i3, cArrEZpvd);
                    }
                    int i4 = i + iEZpvd;
                    if (i4 > cArrGEmmrt.length) {
                        int length3 = cArrGEmmrt.length - i;
                        if (length3 > 0) {
                            java.lang.System.arraycopy(cArrEZpvd, 0, cArrGEmmrt, i, length3);
                        }
                        if (c5544VuOLrzqt == null) {
                            c5544VuOLrzqt = C5544Vu.OLrzqt(cArrGEmmrt);
                        }
                        cArrGEmmrt = c5544VuOLrzqt.gEmmrt();
                        int i5 = iEZpvd - length3;
                        java.lang.System.arraycopy(cArrEZpvd, length3, cArrGEmmrt, 0, i5);
                        i = i5;
                    } else {
                        java.lang.System.arraycopy(cArrEZpvd, 0, cArrGEmmrt, i, iEZpvd);
                        i = i4;
                    }
                    i2++;
                }
            } while (i2 < length);
        }
        if (c5544VuOLrzqt == null) {
            return java.util.Arrays.copyOfRange(cArrGEmmrt, 0, i);
        }
        c5544VuOLrzqt.copydefault(i);
        return c5544VuOLrzqt.KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] KWHzl(java.lang.String str) {
        int i;
        int i2;
        int length = str.length();
        byte[] bArrEZpvd = new byte[AEQbTJ(length)];
        C5537Vn c5537VnAEQbTJ = null;
        int iAEQbTJ = 0;
        int i3 = 0;
        loop0: while (i3 < length) {
            int[] iArrOLrzqt = C5521Ux.OLrzqt();
            do {
                char cCharAt = str.charAt(i3);
                if (cCharAt <= 127 && iArrOLrzqt[cCharAt] == 0) {
                    if (iAEQbTJ >= bArrEZpvd.length) {
                        if (c5537VnAEQbTJ == null) {
                            c5537VnAEQbTJ = C5537Vn.AEQbTJ(bArrEZpvd, iAEQbTJ);
                        }
                        bArrEZpvd = c5537VnAEQbTJ.KWHzl();
                        iAEQbTJ = 0;
                    }
                    bArrEZpvd[iAEQbTJ] = (byte) cCharAt;
                    i3++;
                    iAEQbTJ++;
                } else {
                    if (c5537VnAEQbTJ == null) {
                        c5537VnAEQbTJ = C5537Vn.AEQbTJ(bArrEZpvd, iAEQbTJ);
                    }
                    if (iAEQbTJ >= bArrEZpvd.length) {
                        bArrEZpvd = c5537VnAEQbTJ.KWHzl();
                        iAEQbTJ = 0;
                    }
                    int i4 = i3 + 1;
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 <= 127) {
                        i3 = i4;
                        iAEQbTJ = AEQbTJ(cCharAt2, iArrOLrzqt[cCharAt2], c5537VnAEQbTJ, iAEQbTJ);
                        bArrEZpvd = c5537VnAEQbTJ.EZpvd();
                    } else {
                        if (cCharAt2 <= 2047) {
                            i = iAEQbTJ + 1;
                            bArrEZpvd[iAEQbTJ] = (byte) ((cCharAt2 >> 6) | 192);
                        } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                            int i5 = iAEQbTJ + 1;
                            bArrEZpvd[iAEQbTJ] = (byte) ((cCharAt2 >> '\f') | 224);
                            if (i5 >= bArrEZpvd.length) {
                                bArrEZpvd = c5537VnAEQbTJ.KWHzl();
                                i5 = 0;
                            }
                            bArrEZpvd[i5] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                            i = i5 + 1;
                        } else {
                            if (cCharAt2 > 56319) {
                                OLrzqt(cCharAt2);
                            }
                            if (i4 >= length) {
                                OLrzqt(cCharAt2);
                            }
                            int iEZpvd = EZpvd(cCharAt2, str.charAt(i4));
                            if (iEZpvd > 1114111) {
                                OLrzqt(iEZpvd);
                            }
                            int i6 = iAEQbTJ + 1;
                            bArrEZpvd[iAEQbTJ] = (byte) ((iEZpvd >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            if (i6 >= bArrEZpvd.length) {
                                bArrEZpvd = c5537VnAEQbTJ.KWHzl();
                                i6 = 0;
                            }
                            int i7 = i6 + 1;
                            bArrEZpvd[i6] = (byte) (((iEZpvd >> 12) & 63) | 128);
                            if (i7 >= bArrEZpvd.length) {
                                bArrEZpvd = c5537VnAEQbTJ.KWHzl();
                                i7 = 0;
                            }
                            bArrEZpvd[i7] = (byte) (((iEZpvd >> 6) & 63) | 128);
                            i4 = i3 + 2;
                            i = i7 + 1;
                            i2 = (iEZpvd & 63) | 128;
                            if (i >= bArrEZpvd.length) {
                                bArrEZpvd = c5537VnAEQbTJ.KWHzl();
                                i = 0;
                            }
                            bArrEZpvd[i] = (byte) i2;
                            iAEQbTJ = i + 1;
                            i3 = i4;
                        }
                        i2 = (cCharAt2 & '?') | 128;
                        if (i >= bArrEZpvd.length) {
                        }
                        bArrEZpvd[i] = (byte) i2;
                        iAEQbTJ = i + 1;
                        i3 = i4;
                    }
                }
            } while (i3 < length);
        }
        if (c5537VnAEQbTJ == null) {
            return java.util.Arrays.copyOfRange(bArrEZpvd, 0, iAEQbTJ);
        }
        return c5537VnAEQbTJ.AEQbTJ(iAEQbTJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] AEQbTJ(java.lang.String str) {
        int i;
        int i2;
        int length = str.length();
        int iAEQbTJ = AEQbTJ(length);
        byte[] bArrKWHzl = new byte[iAEQbTJ];
        C5537Vn c5537VnAEQbTJ = null;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            int i5 = i4 + 1;
            int iCharAt = str.charAt(i4);
            while (iCharAt <= 127) {
                if (i3 >= iAEQbTJ) {
                    if (c5537VnAEQbTJ == null) {
                        c5537VnAEQbTJ = C5537Vn.AEQbTJ(bArrKWHzl, i3);
                    }
                    byte[] bArrKWHzl2 = c5537VnAEQbTJ.KWHzl();
                    i3 = 0;
                    bArrKWHzl = bArrKWHzl2;
                    iAEQbTJ = bArrKWHzl2.length;
                }
                int i6 = i3 + 1;
                bArrKWHzl[i3] = (byte) iCharAt;
                if (i5 >= length) {
                    i3 = i6;
                    break loop0;
                }
                iCharAt = str.charAt(i5);
                i5++;
                i3 = i6;
            }
            if (c5537VnAEQbTJ == null) {
                c5537VnAEQbTJ = C5537Vn.AEQbTJ(bArrKWHzl, i3);
            }
            if (i3 >= iAEQbTJ) {
                bArrKWHzl = c5537VnAEQbTJ.KWHzl();
                iAEQbTJ = bArrKWHzl.length;
                i3 = 0;
            }
            if (iCharAt < 2048) {
                i = i3 + 1;
                bArrKWHzl[i3] = (byte) ((iCharAt >> 6) | 192);
            } else if (iCharAt < 55296 || iCharAt > 57343) {
                int i7 = i3 + 1;
                bArrKWHzl[i3] = (byte) ((iCharAt >> 12) | 224);
                if (i7 >= iAEQbTJ) {
                    bArrKWHzl = c5537VnAEQbTJ.KWHzl();
                    iAEQbTJ = bArrKWHzl.length;
                    i7 = 0;
                }
                bArrKWHzl[i7] = (byte) (((iCharAt >> 6) & 63) | 128);
                i = i7 + 1;
            } else {
                if (iCharAt > 56319) {
                    OLrzqt(iCharAt);
                }
                if (i5 >= length) {
                    OLrzqt(iCharAt);
                }
                iCharAt = EZpvd(iCharAt, str.charAt(i5));
                if (iCharAt > 1114111) {
                    OLrzqt(iCharAt);
                }
                int i8 = i3 + 1;
                bArrKWHzl[i3] = (byte) ((iCharAt >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                if (i8 >= iAEQbTJ) {
                    bArrKWHzl = c5537VnAEQbTJ.KWHzl();
                    iAEQbTJ = bArrKWHzl.length;
                    i8 = 0;
                }
                int i9 = i8 + 1;
                bArrKWHzl[i8] = (byte) (((iCharAt >> 12) & 63) | 128);
                if (i9 >= iAEQbTJ) {
                    bArrKWHzl = c5537VnAEQbTJ.KWHzl();
                    iAEQbTJ = bArrKWHzl.length;
                    i9 = 0;
                }
                bArrKWHzl[i9] = (byte) (((iCharAt >> 6) & 63) | 128);
                i5++;
                i2 = i9 + 1;
                int i10 = i5;
                int i11 = iCharAt;
                i4 = i10;
                if (i2 < iAEQbTJ) {
                    byte[] bArrKWHzl3 = c5537VnAEQbTJ.KWHzl();
                    i2 = 0;
                    bArrKWHzl = bArrKWHzl3;
                    iAEQbTJ = bArrKWHzl3.length;
                }
                bArrKWHzl[i2] = (byte) ((i11 & 63) | 128);
                i3 = i2 + 1;
            }
            i2 = i;
            int i102 = i5;
            int i112 = iCharAt;
            i4 = i102;
            if (i2 < iAEQbTJ) {
            }
            bArrKWHzl[i2] = (byte) ((i112 & 63) | 128);
            i3 = i2 + 1;
        }
        if (c5537VnAEQbTJ == null) {
            return java.util.Arrays.copyOfRange(bArrKWHzl, 0, i3);
        }
        return c5537VnAEQbTJ.AEQbTJ(i3);
    }

    public final int AEQbTJ(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = AEQbTJ;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    public final int EZpvd(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    public final int AEQbTJ(int i, int i2, C5537Vn c5537Vn, int i3) {
        c5537Vn.KWHzl(i3);
        c5537Vn.copydefault(92);
        if (i2 < 0) {
            c5537Vn.copydefault(117);
            if (i > 255) {
                byte[] bArr = KWHzl;
                c5537Vn.copydefault(bArr[i >> 12]);
                c5537Vn.copydefault(bArr[(i >> 8) & 15]);
                i &= 255;
            } else {
                c5537Vn.copydefault(48);
                c5537Vn.copydefault(48);
            }
            byte[] bArr2 = KWHzl;
            c5537Vn.copydefault(bArr2[i >> 4]);
            c5537Vn.copydefault(bArr2[i & 15]);
        } else {
            c5537Vn.copydefault((byte) i2);
        }
        return c5537Vn.copydefault();
    }

    public static int EZpvd(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - Utf8.LOG_SURROGATE_HEADER);
        }
        throw new java.lang.IllegalArgumentException("Broken surrogate pair: first char 0x" + java.lang.Integer.toHexString(i) + ", second 0x" + java.lang.Integer.toHexString(i2) + "; illegal combination");
    }

    public static void OLrzqt(int i) {
        throw new java.lang.IllegalArgumentException(UG.OLrzqt(i));
    }

    public static int KWHzl(int i) {
        return java.lang.Math.min(java.lang.Math.max(16, i + java.lang.Math.min((i >> 3) + 6, 1000)), 32000);
    }

    public static int AEQbTJ(int i) {
        return java.lang.Math.min(java.lang.Math.max(24, i + 6 + (i >> 1)), 32000);
    }
}
