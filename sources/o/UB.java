package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;

/* JADX INFO: loaded from: classes21.dex */
public final class UB {
    public static long AEQbTJ = 2147483647L;
    public static final java.lang.String[] AhwBna;
    public static int EZpvd = 1000000000;
    public static int KWHzl = 1000000;
    public static long OLrzqt = 1000000000;
    public static long copydefault = -2147483648L;
    public static final java.lang.String[] djBIcL;
    public static final java.lang.String valueOf = java.lang.String.valueOf(Integer.MIN_VALUE);
    public static final java.lang.String AYXKKw = java.lang.String.valueOf(Long.MIN_VALUE);
    public static final int[] gEmmrt = new int[1000];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    gEmmrt[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
        djBIcL = new java.lang.String[]{"0", "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8", "9", "10"};
        AhwBna = new java.lang.String[]{MultiTransferSignData.DEFAULT_INTERVAL, "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static int KWHzl(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return OLrzqt(cArr, i2);
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < KWHzl) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return OLrzqt(i - (i4 * 1000), cArr, AEQbTJ(i4, cArr, i2));
            }
            if (i < 10) {
                cArr[i2] = (char) (i + 48);
                return i2 + 1;
            }
            return AEQbTJ(i, cArr, i2);
        }
        int i5 = EZpvd;
        if (i >= i5) {
            int i6 = i - i5;
            if (i6 >= i5) {
                i6 -= i5;
                i3 = i2 + 1;
                cArr[i2] = '2';
            } else {
                i3 = i2 + 1;
                cArr[i2] = '1';
            }
            return EZpvd(i6, cArr, i3);
        }
        int i7 = i / 1000;
        int i8 = i7 / 1000;
        return OLrzqt(i - (i7 * 1000), cArr, OLrzqt(i7 - (i8 * 1000), cArr, AEQbTJ(i8, cArr, i2)));
    }

    public static int KWHzl(int i, byte[] bArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return EZpvd(bArr, i2);
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < KWHzl) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return AEQbTJ(i - (i4 * 1000), bArr, OLrzqt(i4, bArr, i2));
            }
            if (i < 10) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) (i + 48);
                return i5;
            }
            return OLrzqt(i, bArr, i2);
        }
        int i6 = EZpvd;
        if (i >= i6) {
            int i7 = i - i6;
            if (i7 >= i6) {
                i7 -= i6;
                i3 = i2 + 1;
                bArr[i2] = 50;
            } else {
                i3 = i2 + 1;
                bArr[i2] = 49;
            }
            return copydefault(i7, bArr, i3);
        }
        int i8 = i / 1000;
        int i9 = i8 / 1000;
        return AEQbTJ(i - (i8 * 1000), bArr, AEQbTJ(i8 - (i9 * 1000), bArr, OLrzqt(i9, bArr, i2)));
    }

    public static int AEQbTJ(long j, char[] cArr, int i) {
        int iEZpvd;
        if (j < 0) {
            if (j > copydefault) {
                return KWHzl((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return EZpvd(cArr, i);
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= AEQbTJ) {
            return KWHzl((int) j, cArr, i);
        }
        long j2 = OLrzqt;
        long j3 = j / j2;
        if (j3 < j2) {
            iEZpvd = copydefault((int) j3, cArr, i);
        } else {
            long j4 = j3 / j2;
            iEZpvd = EZpvd((int) (j3 - (j4 * j2)), cArr, AEQbTJ((int) j4, cArr, i));
        }
        return EZpvd((int) (j - (j3 * j2)), cArr, iEZpvd);
    }

    public static int KWHzl(long j, byte[] bArr, int i) {
        int iCopydefault;
        if (j < 0) {
            if (j > copydefault) {
                return KWHzl((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return OLrzqt(bArr, i);
            }
            bArr[i] = 45;
            j = -j;
            i++;
        } else if (j <= AEQbTJ) {
            return KWHzl((int) j, bArr, i);
        }
        long j2 = OLrzqt;
        long j3 = j / j2;
        if (j3 < j2) {
            iCopydefault = EZpvd((int) j3, bArr, i);
        } else {
            long j4 = j3 / j2;
            iCopydefault = copydefault((int) (j3 - (j4 * j2)), bArr, OLrzqt((int) j4, bArr, i));
        }
        return copydefault((int) (j - (j3 * j2)), bArr, iCopydefault);
    }

    public static java.lang.String copydefault(int i) {
        java.lang.String[] strArr = djBIcL;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            java.lang.String[] strArr2 = AhwBna;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return java.lang.Integer.toString(i);
    }

    public static java.lang.String OLrzqt(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return copydefault((int) j);
        }
        return java.lang.Long.toString(j);
    }

    public static java.lang.String OLrzqt(double d) {
        return EZpvd(d, false);
    }

    public static java.lang.String EZpvd(double d, boolean z) {
        return z ? UQ.copydefault(d) : java.lang.Double.toString(d);
    }

    public static java.lang.String copydefault(float f) {
        return copydefault(f, false);
    }

    public static java.lang.String copydefault(float f, boolean z) {
        return z ? UP.KWHzl(f) : java.lang.Float.toString(f);
    }

    public static boolean KWHzl(double d) {
        return java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d);
    }

    public static boolean AEQbTJ(float f) {
        return java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f);
    }

    public static int copydefault(int i, char[] cArr, int i2) {
        if (i < KWHzl) {
            if (i < 1000) {
                return AEQbTJ(i, cArr, i2);
            }
            int i3 = i / 1000;
            return KWHzl(cArr, i2, i3, i - (i3 * 1000));
        }
        int i4 = i / 1000;
        int i5 = i4 / 1000;
        int iAEQbTJ = AEQbTJ(i5, cArr, i2);
        int[] iArr = gEmmrt;
        int i6 = iArr[i4 - (i5 * 1000)];
        cArr[iAEQbTJ] = (char) (i6 >> 16);
        cArr[iAEQbTJ + 1] = (char) ((i6 >> 8) & 127);
        cArr[iAEQbTJ + 2] = (char) (i6 & 127);
        int i7 = iArr[i - (i4 * 1000)];
        cArr[iAEQbTJ + 3] = (char) (i7 >> 16);
        cArr[iAEQbTJ + 4] = (char) ((i7 >> 8) & 127);
        cArr[iAEQbTJ + 5] = (char) (i7 & 127);
        return iAEQbTJ + 6;
    }

    public static int EZpvd(int i, char[] cArr, int i2) {
        int i3 = i / 1000;
        int i4 = i3 / 1000;
        int[] iArr = gEmmrt;
        int i5 = iArr[i4];
        cArr[i2] = (char) (i5 >> 16);
        cArr[i2 + 1] = (char) ((i5 >> 8) & 127);
        cArr[i2 + 2] = (char) (i5 & 127);
        int i6 = iArr[i3 - (i4 * 1000)];
        cArr[i2 + 3] = (char) (i6 >> 16);
        cArr[i2 + 4] = (char) ((i6 >> 8) & 127);
        cArr[i2 + 5] = (char) (i6 & 127);
        int i7 = iArr[i - (i3 * 1000)];
        cArr[i2 + 6] = (char) (i7 >> 16);
        cArr[i2 + 7] = (char) ((i7 >> 8) & 127);
        cArr[i2 + 8] = (char) (i7 & 127);
        return i2 + 9;
    }

    public static int EZpvd(int i, byte[] bArr, int i2) {
        if (i < KWHzl) {
            if (i < 1000) {
                return OLrzqt(i, bArr, i2);
            }
            int i3 = i / 1000;
            return EZpvd(bArr, i2, i3, i - (i3 * 1000));
        }
        int i4 = i / 1000;
        int i5 = i4 / 1000;
        int iOLrzqt = OLrzqt(i5, bArr, i2);
        int[] iArr = gEmmrt;
        int i6 = iArr[i4 - (i5 * 1000)];
        bArr[iOLrzqt] = (byte) (i6 >> 16);
        bArr[iOLrzqt + 1] = (byte) (i6 >> 8);
        bArr[iOLrzqt + 2] = (byte) i6;
        int i7 = iArr[i - (i4 * 1000)];
        bArr[iOLrzqt + 3] = (byte) (i7 >> 16);
        bArr[iOLrzqt + 4] = (byte) (i7 >> 8);
        bArr[iOLrzqt + 5] = (byte) i7;
        return iOLrzqt + 6;
    }

    public static int copydefault(int i, byte[] bArr, int i2) {
        int i3 = i / 1000;
        int i4 = i3 / 1000;
        int[] iArr = gEmmrt;
        int i5 = iArr[i4];
        bArr[i2] = (byte) (i5 >> 16);
        bArr[i2 + 1] = (byte) (i5 >> 8);
        bArr[i2 + 2] = (byte) i5;
        int i6 = iArr[i3 - (i4 * 1000)];
        bArr[i2 + 3] = (byte) (i6 >> 16);
        bArr[i2 + 4] = (byte) (i6 >> 8);
        bArr[i2 + 5] = (byte) i6;
        int i7 = iArr[i - (i3 * 1000)];
        bArr[i2 + 6] = (byte) (i7 >> 16);
        bArr[i2 + 7] = (byte) (i7 >> 8);
        bArr[i2 + 8] = (byte) i7;
        return i2 + 9;
    }

    public static int KWHzl(char[] cArr, int i, int i2, int i3) {
        int[] iArr = gEmmrt;
        int i4 = iArr[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i] = (char) (i4 >> 16);
                i++;
            }
            cArr[i] = (char) ((i4 >> 8) & 127);
            i++;
        }
        cArr[i] = (char) (i4 & 127);
        int i5 = iArr[i3];
        cArr[i + 1] = (char) (i5 >> 16);
        cArr[i + 2] = (char) ((i5 >> 8) & 127);
        cArr[i + 3] = (char) (i5 & 127);
        return i + 4;
    }

    public static int EZpvd(byte[] bArr, int i, int i2, int i3) {
        int[] iArr = gEmmrt;
        int i4 = iArr[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                bArr[i] = (byte) (i4 >> 16);
                i++;
            }
            bArr[i] = (byte) (i4 >> 8);
            i++;
        }
        bArr[i] = (byte) i4;
        int i5 = iArr[i3];
        bArr[i + 1] = (byte) (i5 >> 16);
        bArr[i + 2] = (byte) (i5 >> 8);
        bArr[i + 3] = (byte) i5;
        return i + 4;
    }

    public static int AEQbTJ(int i, char[] cArr, int i2) {
        int i3 = gEmmrt[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        cArr[i2] = (char) (i3 & 127);
        return i2 + 1;
    }

    public static int OLrzqt(int i, byte[] bArr, int i2) {
        int i3 = gEmmrt[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        bArr[i2] = (byte) i3;
        return i2 + 1;
    }

    public static int OLrzqt(int i, char[] cArr, int i2) {
        int i3 = gEmmrt[i];
        cArr[i2] = (char) (i3 >> 16);
        cArr[i2 + 1] = (char) ((i3 >> 8) & 127);
        cArr[i2 + 2] = (char) (i3 & 127);
        return i2 + 3;
    }

    public static int AEQbTJ(int i, byte[] bArr, int i2) {
        int i3 = gEmmrt[i];
        bArr[i2] = (byte) (i3 >> 16);
        bArr[i2 + 1] = (byte) (i3 >> 8);
        bArr[i2 + 2] = (byte) i3;
        return i2 + 3;
    }

    public static int EZpvd(char[] cArr, int i) {
        java.lang.String str = AYXKKw;
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return i + length;
    }

    public static int OLrzqt(byte[] bArr, int i) {
        int length = AYXKKw.length();
        int i2 = 0;
        while (i2 < length) {
            bArr[i] = (byte) AYXKKw.charAt(i2);
            i2++;
            i++;
        }
        return i;
    }

    public static int OLrzqt(char[] cArr, int i) {
        java.lang.String str = valueOf;
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return i + length;
    }

    public static int EZpvd(byte[] bArr, int i) {
        int length = valueOf.length();
        int i2 = 0;
        while (i2 < length) {
            bArr[i] = (byte) valueOf.charAt(i2);
            i2++;
            i++;
        }
        return i;
    }
}
