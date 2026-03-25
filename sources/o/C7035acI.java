package o;

import com.google.common.primitives.UnsignedBytes;
import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.acI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7035acI {
    public static final C7035acI KWHzl;
    public static final java.lang.String[] copydefault;
    public char[] AYXKKw;
    public byte[] AkhnZx;
    public char[] DbNXlk;
    public Application[] OLrzqt;
    public byte[] valueOf;
    public int AEQbTJ = 0;
    public int gEmmrt = 0;
    public char[] djBIcL = new char[33];
    public char[] AhwBna = new char[33];
    public int[] values = new int[8];
    public int[] EZpvd = new int[8];
    public java.lang.StringBuffer isConnected = new java.lang.StringBuffer();
    public int[] fetchVPNInfo = new int[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        this.AEQbTJ = i;
        this.gEmmrt = i2;
        return true;
    }

    static {
        try {
            KWHzl = new C7035acI();
            copydefault = new java.lang.String[]{"unassigned", "uppercase letter", "lowercase letter", "titlecase letter", "modifier letter", "other letter", "non spacing mark", "enclosing mark", "combining spacing mark", "decimal digit number", "letter number", "other number", "space separator", "line separator", "paragraph separator", "control", "format", "private use area", "surrogate", "dash punctuation", "start punctuation", "end punctuation", "connector punctuation", "other punctuation", "math symbol", "currency symbol", "modifier symbol", "other symbol", "initial punctuation", "final punctuation", "noncharacter", "lead surrogate", "trail surrogate"};
        } catch (java.io.IOException unused) {
            throw new MissingResourceException("Could not construct UCharacterName. Missing unames.icu", "", "");
        }
    }

    public int OLrzqt(int i, java.lang.String str) {
        if (i >= 4 || str == null || str.length() == 0) {
            return -1;
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        int iCopydefault = copydefault(str.toLowerCase(locale), i);
        if (iCopydefault >= -1) {
            return iCopydefault;
        }
        java.lang.String upperCase = str.toUpperCase(locale);
        if (i == 0 || i == 2) {
            Application[] applicationArr = this.OLrzqt;
            for (int length = (applicationArr != null ? applicationArr.length : 0) - 1; length >= 0; length--) {
                int iAEQbTJ = this.OLrzqt[length].AEQbTJ(upperCase);
                if (iAEQbTJ >= 0) {
                    return iAEQbTJ;
                }
            }
        }
        if (i == 2) {
            int iAEQbTJ2 = AEQbTJ(upperCase, 0);
            return iAEQbTJ2 == -1 ? AEQbTJ(upperCase, 3) : iAEQbTJ2;
        }
        return AEQbTJ(upperCase, i);
    }

    public int OLrzqt(int i, char[] cArr, char[] cArr2) {
        int i2 = i * this.gEmmrt;
        char[] cArr3 = this.AYXKKw;
        int iEZpvd = C7037acK.EZpvd(cArr3[i2 + 1], cArr3[i2 + 2]);
        int i3 = 0;
        cArr[0] = 0;
        byte b = 65535;
        while (i3 < 32) {
            byte b2 = this.valueOf[iEZpvd];
            for (int i4 = 4; i4 >= 0; i4 -= 4) {
                byte b3 = (byte) ((b2 >> i4) & 15);
                if (b != 65535 || b3 <= 11) {
                    if (b != 65535) {
                        cArr2[i3] = (char) ((b | b3) + 12);
                    } else {
                        cArr2[i3] = (char) b3;
                    }
                    if (i3 < 32) {
                        cArr[i3 + 1] = (char) (cArr[i3] + cArr2[i3]);
                    }
                    i3++;
                    b = 65535;
                } else {
                    b = (char) ((b3 - 12) << 4);
                }
            }
            iEZpvd++;
        }
        return iEZpvd;
    }

    /* JADX INFO: renamed from: o.acI$Application */
    public static final class Application {
        public byte[] AEQbTJ;
        public byte AYXKKw;
        public char[] EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public java.lang.String copydefault;
        public byte djBIcL;
        public java.lang.StringBuffer gEmmrt = new java.lang.StringBuffer();
        public int[] AhwBna = new int[256];

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean OLrzqt(int i, int i2, byte b, byte b2) {
            if (i < 0 || i > i2 || i2 > 1114111) {
                return false;
            }
            if (b != 0 && b != 1) {
                return false;
            }
            this.OLrzqt = i;
            this.KWHzl = i2;
            this.djBIcL = b;
            this.AYXKKw = b2;
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean OLrzqt(byte[] bArr) {
            this.AEQbTJ = bArr;
            return true;
        }

        public boolean copydefault(char[] cArr) {
            if (cArr.length != this.AYXKKw) {
                return false;
            }
            this.EZpvd = cArr;
            return true;
        }

        public boolean copydefault(java.lang.String str) {
            if (str == null || str.length() <= 0) {
                return false;
            }
            this.copydefault = str;
            return true;
        }

        public int AEQbTJ(java.lang.String str) {
            int length = this.copydefault.length();
            if (str.length() < length || !this.copydefault.equals(str.substring(0, length))) {
                return -1;
            }
            byte b = this.djBIcL;
            if (b == 0) {
                try {
                    int i = java.lang.Integer.parseInt(str.substring(length), 16);
                    if (this.OLrzqt > i) {
                        return -1;
                    }
                    if (i <= this.KWHzl) {
                        return i;
                    }
                    return -1;
                } catch (java.lang.NumberFormatException unused) {
                    return -1;
                }
            }
            if (b != 1) {
                return -1;
            }
            for (int i2 = this.OLrzqt; i2 <= this.KWHzl; i2++) {
                int i3 = i2 - this.OLrzqt;
                int[] iArr = this.AhwBna;
                synchronized (iArr) {
                    for (int i4 = this.AYXKKw - 1; i4 > 0; i4--) {
                        int i5 = this.EZpvd[i4] & 255;
                        iArr[i4] = i3 % i5;
                        i3 /= i5;
                    }
                    iArr[0] = i3;
                    if (AEQbTJ(iArr, this.AYXKKw, str, length)) {
                        return i2;
                    }
                }
            }
            return -1;
        }

        public final boolean AEQbTJ(int[] iArr, int i, java.lang.String str, int i2) {
            int length = this.EZpvd.length;
            if (iArr == null || i != length) {
                return false;
            }
            int i3 = length - 1;
            int iAEQbTJ = 0;
            for (int i4 = 0; i4 <= i3; i4++) {
                char c = this.EZpvd[i4];
                iAEQbTJ = C7037acK.AEQbTJ(this.AEQbTJ, iAEQbTJ, iArr[i4]);
                i2 = C7037acK.EZpvd(str, this.AEQbTJ, i2, iAEQbTJ);
                if (i2 < 0) {
                    return false;
                }
                if (i4 != i3) {
                    iAEQbTJ = C7037acK.AEQbTJ(this.AEQbTJ, iAEQbTJ, c - iArr[i4]);
                }
            }
            return i2 == str.length();
        }
    }

    public boolean OLrzqt(char[] cArr, byte[] bArr) {
        if (cArr == null || bArr == null || cArr.length <= 0 || bArr.length <= 0) {
            return false;
        }
        this.DbNXlk = cArr;
        this.AkhnZx = bArr;
        return true;
    }

    public boolean KWHzl(Application[] applicationArr) {
        if (applicationArr == null || applicationArr.length == 0) {
            return false;
        }
        this.OLrzqt = applicationArr;
        return true;
    }

    public boolean EZpvd(char[] cArr, byte[] bArr) {
        if (cArr == null || bArr == null || cArr.length <= 0 || bArr.length <= 0) {
            return false;
        }
        this.AYXKKw = cArr;
        this.valueOf = bArr;
        return true;
    }

    private C7035acI() throws java.io.IOException {
        new C7036acJ(C7024abY.copydefault("unames.icu")).KWHzl(this);
    }

    public final int AEQbTJ(java.lang.String str, int i) {
        synchronized (this) {
            for (int i2 = 0; i2 < this.AEQbTJ; i2++) {
                int iEZpvd = EZpvd(OLrzqt(i2, this.djBIcL, this.AhwBna), this.AhwBna, str, i);
                if (iEZpvd != -1) {
                    return (this.AYXKKw[i2 * this.gEmmrt] << 5) | iEZpvd;
                }
            }
            return -1;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [char] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    public final int EZpvd(int i, char[] cArr, java.lang.String str, int i2) {
        int length = str.length();
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = -1;
            if (i4 > 32) {
                return -1;
            }
            char c = cArr[i4];
            if (i2 != 0) {
                if (i2 != 2) {
                    int i6 = i2 != 4 ? i2 : 2;
                    do {
                        int iAEQbTJ = C7037acK.AEQbTJ(this.valueOf, i3, c, (byte) 59) + i3;
                        c -= iAEQbTJ - i3;
                        i6--;
                        i3 = iAEQbTJ;
                    } while (i6 > 0);
                }
            }
            int i7 = 0;
            int iEZpvd = 0;
            while (i7 < c && iEZpvd != i5 && iEZpvd < length) {
                byte[] bArr = this.valueOf;
                byte b = bArr[i3 + i7];
                int i8 = i7 + 1;
                char[] cArr2 = this.DbNXlk;
                if (b >= cArr2.length) {
                    iEZpvd = str.charAt(iEZpvd) != (b & UnsignedBytes.MAX_VALUE) ? i5 : iEZpvd + 1;
                    i7 = i8;
                } else {
                    int i9 = b & UnsignedBytes.MAX_VALUE;
                    char c2 = cArr2[i9];
                    if (c2 == 65534) {
                        c2 = cArr2[(b << 8) | (bArr[i8 + i3] & UnsignedBytes.MAX_VALUE)];
                        i7 += 2;
                    } else {
                        i7 = i8;
                    }
                    if (c2 == 65535) {
                        if (str.charAt(iEZpvd) != i9) {
                            i5 = -1;
                            iEZpvd = -1;
                        } else {
                            iEZpvd++;
                        }
                    } else {
                        iEZpvd = C7037acK.EZpvd(str, this.AkhnZx, iEZpvd, c2);
                    }
                    i5 = -1;
                }
            }
            if (length == iEZpvd && (i7 == c || this.valueOf[i7 + i3] == 59)) {
                break;
            }
            i3 += c;
            i4++;
        }
        return i4;
    }

    public static int KWHzl(int i) {
        if (C7037acK.AEQbTJ(i)) {
            return 30;
        }
        int iDjBIcL = C7223afl.djBIcL(i);
        return iDjBIcL == 18 ? i <= 56319 ? 31 : 32 : iDjBIcL;
    }

    public static int copydefault(java.lang.String str, int i) {
        int iLastIndexOf;
        int i2;
        int i3;
        if (str.charAt(0) != '<') {
            return -2;
        }
        if (i != 2) {
            return -1;
        }
        int length = str.length() - 1;
        if (str.charAt(length) != '>' || (iLastIndexOf = str.lastIndexOf(45)) < 0 || (i3 = length - (i2 = iLastIndexOf + 1)) < 1 || 8 < i3) {
            return -1;
        }
        try {
            int i4 = java.lang.Integer.parseInt(str.substring(i2, length), 16);
            if (i4 < 0 || 1114111 < i4) {
                return -1;
            }
            int iKWHzl = KWHzl(i4);
            java.lang.String strSubstring = str.substring(1, iLastIndexOf);
            int length2 = copydefault.length;
            for (int i5 = 0; i5 < length2; i5++) {
                if (strSubstring.compareTo(copydefault[i5]) == 0) {
                    if (iKWHzl == i5) {
                        return i4;
                    }
                    return -1;
                }
            }
            return -1;
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }
}
