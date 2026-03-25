package o;

import java.math.BigDecimal;

/* JADX INFO: renamed from: o.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5520Uw {
    private C5520Uw() {
    }

    public static BigDecimal KWHzl(java.lang.String str) {
        return OLrzqt(str.toCharArray());
    }

    public static BigDecimal EZpvd(char[] cArr, int i, int i2) {
        java.lang.String str;
        try {
            if (i2 < 500) {
                return new BigDecimal(cArr, i, i2);
            }
            return copydefault(cArr, i, i2, i2 / 10);
        } catch (java.lang.ArithmeticException | java.lang.NumberFormatException e) {
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (i2 <= 1000) {
                str = new java.lang.String(cArr, i, i2);
            } else {
                str = new java.lang.String(java.util.Arrays.copyOfRange(cArr, i, 1000)) + "(truncated, full length is " + cArr.length + " chars)";
            }
            throw new java.lang.NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigDecimal`, reason: " + message);
        }
    }

    public static BigDecimal OLrzqt(char[] cArr) {
        return EZpvd(cArr, 0, cArr.length);
    }

    public static BigDecimal copydefault(char[] cArr, int i, int i2, int i3) {
        int i4;
        int i5;
        BigDecimal bigDecimalEZpvd;
        int i6 = i + i2;
        int i7 = i;
        int i8 = i7;
        int i9 = -1;
        int i10 = -1;
        int iEZpvd = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i7 < i6) {
            char c = cArr[i7];
            if (c != '+') {
                if (c == 'E' || c == 'e') {
                    if (i9 >= 0) {
                        throw new java.lang.NumberFormatException("Multiple exponent markers");
                    }
                    i9 = i7;
                } else if (c != '-') {
                    if (c != '.') {
                        if (i10 >= 0 && i9 == -1) {
                            iEZpvd++;
                        }
                    } else {
                        if (i10 >= 0) {
                            throw new java.lang.NumberFormatException("Multiple decimal points");
                        }
                        i10 = i7;
                    }
                } else if (i9 >= 0) {
                    if (z2) {
                        throw new java.lang.NumberFormatException("Multiple signs in exponent");
                    }
                    z2 = true;
                } else {
                    if (z) {
                        throw new java.lang.NumberFormatException("Multiple signs in number");
                    }
                    i8 = i7 + 1;
                    z = true;
                    z3 = true;
                }
            } else if (i9 >= 0) {
                if (z2) {
                    throw new java.lang.NumberFormatException("Multiple signs in exponent");
                }
                z2 = true;
            } else {
                if (z) {
                    throw new java.lang.NumberFormatException("Multiple signs in number");
                }
                i8 = i7 + 1;
                z = true;
            }
            i7++;
        }
        if (i9 >= 0) {
            i4 = 1;
            i5 = java.lang.Integer.parseInt(new java.lang.String(cArr, i9 + 1, (i6 - i9) - 1));
            iEZpvd = EZpvd(iEZpvd, i5);
            i6 = i9;
        } else {
            i4 = 1;
            i5 = 0;
        }
        if (i10 >= 0) {
            int i11 = (i6 - i10) - i4;
            bigDecimalEZpvd = EZpvd(cArr, i8, i10 - i8, i5, i3).add(EZpvd(cArr, i10 + i4, i11, i5 - i11, i3));
        } else {
            bigDecimalEZpvd = EZpvd(cArr, i8, i6 - i8, i5, i3);
        }
        if (iEZpvd != 0) {
            bigDecimalEZpvd = bigDecimalEZpvd.setScale(iEZpvd);
        }
        return z3 ? bigDecimalEZpvd.negate() : bigDecimalEZpvd;
    }

    public static int EZpvd(int i, long j) {
        long j2 = ((long) i) - j;
        if (j2 <= 2147483647L && j2 >= -2147483648L) {
            return (int) j2;
        }
        throw new java.lang.NumberFormatException("Scale out of range: " + j2 + " while adjusting scale " + i + " to exponent " + j);
    }

    public static BigDecimal EZpvd(char[] cArr, int i, int i2, int i3, int i4) {
        if (i2 <= i4) {
            return i2 == 0 ? BigDecimal.ZERO : new BigDecimal(cArr, i, i2).movePointRight(i3);
        }
        int i5 = i2 / 2;
        return EZpvd(cArr, i, i5, (i3 + i2) - i5, i4).add(EZpvd(cArr, i + i5, i2 - i5, i3, i4));
    }
}
