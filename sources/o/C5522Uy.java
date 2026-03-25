package o;

import com.huawei.hms.framework.common.ExceptionCode;
import java.math.BigDecimal;

/* JADX INFO: renamed from: o.Uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5522Uy {
    public static final java.lang.String copydefault = java.lang.String.valueOf(Long.MIN_VALUE).substring(1);
    public static final java.lang.String KWHzl = java.lang.String.valueOf(Long.MAX_VALUE);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int EZpvd(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 7:
                i3 += (cArr[i] - '0') * 1000000;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 8:
                i3 += (cArr[i] - '0') * ExceptionCode.CRASH_EXCEPTION;
                i++;
                i3 += (cArr[i] - '0') * 1000000;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
                i3 += (cArr[i] - '0') * ExceptionCode.CRASH_EXCEPTION;
                i++;
                i3 += (cArr[i] - '0') * 1000000;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int EZpvd(java.lang.String str) {
        char cCharAt = str.charAt(0);
        int length = str.length();
        int i = 1;
        boolean z = cCharAt == '-';
        if (z) {
            if (length == 1 || length > 10) {
                return java.lang.Integer.parseInt(str);
            }
            cCharAt = str.charAt(1);
            i = 2;
        } else if (length > 9) {
            return java.lang.Integer.parseInt(str);
        }
        if (cCharAt > '9' || cCharAt < '0') {
            return java.lang.Integer.parseInt(str);
        }
        int i2 = cCharAt - '0';
        if (i < length) {
            int i3 = i + 1;
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return java.lang.Integer.parseInt(str);
            }
            i2 = (i2 * 10) + (cCharAt2 - '0');
            if (i3 < length) {
                int i4 = i + 2;
                char cCharAt3 = str.charAt(i3);
                if (cCharAt3 > '9' || cCharAt3 < '0') {
                    return java.lang.Integer.parseInt(str);
                }
                i2 = (i2 * 10) + (cCharAt3 - '0');
                if (i4 < length) {
                    while (true) {
                        int i5 = i4 + 1;
                        char cCharAt4 = str.charAt(i4);
                        if (cCharAt4 > '9' || cCharAt4 < '0') {
                            break;
                        }
                        i2 = (i2 * 10) + (cCharAt4 - '0');
                        if (i5 >= length) {
                            break;
                        }
                        i4 = i5;
                    }
                }
            }
        }
        return z ? -i2 : i2;
    }

    public static long copydefault(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) EZpvd(cArr, i, i3)) * com.google.android.exoplayer2.C.NANOS_PER_SECOND) + ((long) EZpvd(cArr, i + i3, 9));
    }

    public static long AYXKKw(java.lang.String str) {
        if (str.length() <= 9) {
            return EZpvd(str);
        }
        return java.lang.Long.parseLong(str);
    }

    public static boolean OLrzqt(char[] cArr, int i, int i2, boolean z) {
        java.lang.String str = z ? copydefault : KWHzl;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int iCharAt = cArr[i + i3] - str.charAt(i3);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static boolean copydefault(java.lang.String str, boolean z) {
        java.lang.String str2 = z ? copydefault : KWHzl;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int iCharAt = str.charAt(i) - str2.charAt(i);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static int AEQbTJ(java.lang.String str, int i) {
        java.lang.String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return i;
        }
        int i2 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i2 = 1;
        }
        while (i2 < length) {
            char cCharAt2 = strTrim.charAt(i2);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (int) KWHzl(strTrim, true);
                } catch (java.lang.NumberFormatException unused) {
                    return i;
                }
            }
            i2++;
        }
        try {
            return java.lang.Integer.parseInt(strTrim);
        } catch (java.lang.NumberFormatException unused2) {
            return i;
        }
    }

    public static long copydefault(java.lang.String str, long j) {
        java.lang.String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return j;
        }
        int i = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i = 1;
        }
        while (i < length) {
            char cCharAt2 = strTrim.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (long) KWHzl(strTrim, true);
                } catch (java.lang.NumberFormatException unused) {
                    return j;
                }
            }
            i++;
        }
        try {
            return java.lang.Long.parseLong(strTrim);
        } catch (java.lang.NumberFormatException unused2) {
            return j;
        }
    }

    public static double copydefault(java.lang.String str, double d) {
        return KWHzl(str, d, false);
    }

    public static double KWHzl(java.lang.String str, double d, boolean z) {
        if (str == null) {
            return d;
        }
        java.lang.String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return d;
        }
        try {
            return KWHzl(strTrim, z);
        } catch (java.lang.NumberFormatException unused) {
            return d;
        }
    }

    public static double copydefault(java.lang.String str) throws java.lang.NumberFormatException {
        return KWHzl(str, false);
    }

    public static double KWHzl(java.lang.String str, boolean z) throws java.lang.NumberFormatException {
        return z ? UK.copydefault(str) : java.lang.Double.parseDouble(str);
    }

    public static float AEQbTJ(java.lang.String str) throws java.lang.NumberFormatException {
        return OLrzqt(str, false);
    }

    public static float OLrzqt(java.lang.String str, boolean z) throws java.lang.NumberFormatException {
        return z ? UO.EZpvd(str) : java.lang.Float.parseFloat(str);
    }

    public static BigDecimal OLrzqt(java.lang.String str) throws java.lang.NumberFormatException {
        return C5520Uw.KWHzl(str);
    }

    public static java.math.BigInteger KWHzl(java.lang.String str) throws java.lang.NumberFormatException {
        if (str.length() > 1250) {
            return C5520Uw.KWHzl(str).toBigInteger();
        }
        return new java.math.BigInteger(str);
    }
}
