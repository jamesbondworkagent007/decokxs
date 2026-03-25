package o;

import com.ibm.icu.impl.IllegalIcuArgumentException;
import com.ibm.icu.util.ICUUncheckedIOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.acS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7045acS {
    public static java.lang.String EZpvd = java.lang.System.getProperty("line.separator");
    public static final char[] OLrzqt = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] KWHzl = {'a', 7, 'b', '\b', 'e', 27, 'f', '\f', 'n', '\n', 'r', '\r', 't', '\t', 'v', 11};
    public static final char[] AEQbTJ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static final boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2;
    }

    public static boolean OLrzqt(int i) {
        return i < 32 || i > 126;
    }

    public static final boolean EZpvd(java.lang.Object[] objArr, java.lang.Object obj) {
        if (objArr == null) {
            return obj == null;
        }
        if (!(obj instanceof java.lang.Object[])) {
            return false;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
        return objArr.length == objArr2.length && AEQbTJ(objArr, 0, objArr2, 0, objArr.length);
    }

    public static final boolean EZpvd(int[] iArr, java.lang.Object obj) {
        if (iArr == null) {
            return obj == null;
        }
        if (!(obj instanceof int[])) {
            return false;
        }
        int[] iArr2 = (int[]) obj;
        return iArr.length == iArr2.length && KWHzl(iArr, 0, iArr2, 0, iArr.length);
    }

    public static final boolean OLrzqt(double[] dArr, java.lang.Object obj) {
        if (dArr == null) {
            return obj == null;
        }
        if (!(obj instanceof double[])) {
            return false;
        }
        double[] dArr2 = (double[]) obj;
        return dArr.length == dArr2.length && OLrzqt(dArr, 0, dArr2, 0, dArr.length);
    }

    public static final boolean AEQbTJ(byte[] bArr, java.lang.Object obj) {
        if (bArr == null) {
            return obj == null;
        }
        if (!(obj instanceof byte[])) {
            return false;
        }
        byte[] bArr2 = (byte[]) obj;
        return bArr.length == bArr2.length && OLrzqt(bArr, 0, bArr2, 0, bArr.length);
    }

    public static final boolean copydefault(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof java.lang.Object[]) {
            return EZpvd((java.lang.Object[]) obj, obj2);
        }
        if (obj instanceof int[]) {
            return EZpvd((int[]) obj, obj2);
        }
        if (obj instanceof double[]) {
            return OLrzqt((double[]) obj, obj2);
        }
        if (obj instanceof byte[]) {
            return AEQbTJ((byte[]) obj, obj2);
        }
        return obj.equals(obj2);
    }

    public static final boolean AEQbTJ(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        for (int i4 = i; i4 < i3 + i; i4++) {
            if (!copydefault(objArr[i4], objArr2[(i2 - i) + i4])) {
                return false;
            }
        }
        return true;
    }

    public static final boolean KWHzl(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        for (int i4 = i; i4 < i3 + i; i4++) {
            if (iArr[i4] != iArr2[(i2 - i) + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean OLrzqt(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        for (int i4 = i; i4 < i3 + i; i4++) {
            if (dArr[i4] != dArr2[(i2 - i) + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean OLrzqt(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = i; i4 < i3 + i; i4++) {
            if (bArr[i4] != bArr2[(i2 - i) + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iCopydefault = 0;
        while (iCopydefault < str.length()) {
            int iCodePointAt = java.lang.Character.codePointAt(str, iCopydefault);
            iCopydefault += C7242agD.copydefault(iCodePointAt);
            if (iCodePointAt < 32 || iCodePointAt > 127) {
                boolean z = iCodePointAt <= 65535;
                sb.append(z ? "\\u" : "\\U");
                sb.append(AEQbTJ(iCodePointAt, z ? 4 : 8));
            } else if (iCodePointAt == 92) {
                sb.append("\\\\");
            } else {
                sb.append((char) iCodePointAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[ADDED_TO_REGION, LOOP:0: B:26:0x0062->B:35:0x0077, LOOP_START, PHI: r1 r4 r5 r13
  0x0062: PHI (r1v4 int) = (r1v2 int), (r1v9 int) binds: [B:25:0x0060, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r4v1 int) = (r4v0 int), (r4v8 int) binds: [B:25:0x0060, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r5v6 int) = (r5v4 int), (r5v10 int) binds: [B:25:0x0060, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:25:0x0060, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int copydefault(java.lang.String str, int[] iArr) {
        int codePoint;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = iArr[0];
        int length = str.length();
        if (i8 < 0 || i8 >= length) {
            return -1;
        }
        int iCodePointAt = java.lang.Character.codePointAt(str, i8);
        int iCopydefault = i8 + C7242agD.copydefault(iCodePointAt);
        if (iCodePointAt == 85) {
            codePoint = 0;
            i = 0;
            i2 = 8;
            i3 = 8;
            i4 = 4;
        } else {
            if (iCodePointAt != 117) {
                if (iCodePointAt == 120) {
                    if (iCopydefault >= length || C7242agD.AEQbTJ(str, iCopydefault) != 123) {
                        i = 0;
                        i3 = 2;
                        i4 = 4;
                        i2 = 1;
                        codePoint = 0;
                        i5 = 0;
                    } else {
                        iCopydefault++;
                        i6 = 8;
                        i7 = 1;
                        i = 0;
                        i4 = 4;
                        i3 = i6;
                        i5 = i7;
                        i2 = i5;
                        codePoint = 0;
                    }
                } else {
                    codePoint = C7223afl.KWHzl(iCodePointAt, 8);
                    if (codePoint >= 0) {
                        i5 = 0;
                        i3 = 3;
                        i4 = 3;
                        i2 = 1;
                        i = 1;
                    } else {
                        i7 = 0;
                        i6 = 0;
                        i = 0;
                        i4 = 4;
                        i3 = i6;
                        i5 = i7;
                        i2 = i5;
                        codePoint = 0;
                    }
                }
                if (i2 != 0) {
                    int i9 = 0;
                    while (true) {
                        char[] cArr = KWHzl;
                        if (i9 >= cArr.length) {
                            break;
                        }
                        char c = cArr[i9];
                        if (iCodePointAt == c) {
                            iArr[0] = iCopydefault;
                            return cArr[i9 + 1];
                        }
                        if (iCodePointAt < c) {
                            break;
                        }
                        i9 += 2;
                    }
                    if (iCodePointAt == 99 && iCopydefault < length) {
                        int iAEQbTJ = C7242agD.AEQbTJ(str, iCopydefault);
                        iArr[0] = iCopydefault + C7242agD.copydefault(iAEQbTJ);
                        return iAEQbTJ & 31;
                    }
                    iArr[0] = iCopydefault;
                    return iCodePointAt;
                }
                while (iCopydefault < length && i < i3) {
                    iCodePointAt = C7242agD.AEQbTJ(str, iCopydefault);
                    int iKWHzl = C7223afl.KWHzl(iCodePointAt, i4 == 3 ? 8 : 16);
                    if (iKWHzl < 0) {
                        break;
                    }
                    codePoint = (codePoint << i4) | iKWHzl;
                    iCopydefault += C7242agD.copydefault(iCodePointAt);
                    i++;
                }
                if (i < i2) {
                    return -1;
                }
                if (i5 != 0) {
                    if (iCodePointAt != 125) {
                        return -1;
                    }
                    iCopydefault++;
                }
                if (codePoint < 0 || codePoint >= 1114112) {
                    return -1;
                }
                if (iCopydefault < length) {
                    char c2 = (char) codePoint;
                    if (C7242agD.AEQbTJ(c2)) {
                        int i10 = iCopydefault + 1;
                        int iCharAt = str.charAt(iCopydefault);
                        if (iCharAt == 92 && i10 < length) {
                            int[] iArr2 = {i10};
                            iCharAt = copydefault(str, iArr2);
                            i10 = iArr2[0];
                        }
                        char c3 = (char) iCharAt;
                        if (C7242agD.OLrzqt(c3)) {
                            codePoint = java.lang.Character.toCodePoint(c2, c3);
                            iCopydefault = i10;
                        }
                    }
                }
                iArr[0] = iCopydefault;
                return codePoint;
            }
            codePoint = 0;
            i = 0;
            i2 = 4;
            i3 = 4;
            i4 = 4;
        }
        i5 = i;
        if (i2 != 0) {
        }
    }

    public static java.lang.String AEQbTJ(long j, int i) {
        if (j == Long.MIN_VALUE) {
            return "-8000000000000000";
        }
        boolean z = j < 0;
        if (z) {
            j = -j;
        }
        java.lang.String upperCase = java.lang.Long.toString(j, 16).toUpperCase(java.util.Locale.ENGLISH);
        if (upperCase.length() < i) {
            upperCase = "0000000000000000".substring(upperCase.length(), i) + upperCase;
        }
        if (!z) {
            return upperCase;
        }
        return '-' + upperCase;
    }

    public static <T extends java.lang.Appendable> boolean KWHzl(T t, int i) {
        try {
            if (!OLrzqt(i)) {
                return false;
            }
            t.append(AbstractJsonLexerKt.STRING_ESC);
            if (((-65536) & i) != 0) {
                t.append('U');
                char[] cArr = AEQbTJ;
                t.append(cArr[(i >> 28) & 15]);
                t.append(cArr[(i >> 24) & 15]);
                t.append(cArr[(i >> 20) & 15]);
                t.append(cArr[(i >> 16) & 15]);
            } else {
                t.append('u');
            }
            char[] cArr2 = AEQbTJ;
            t.append(cArr2[(i >> 12) & 15]);
            t.append(cArr2[(i >> 8) & 15]);
            t.append(cArr2[(i >> 4) & 15]);
            t.append(cArr2[i & 15]);
            return true;
        } catch (java.io.IOException e) {
            throw new IllegalIcuArgumentException(e);
        }
    }

    public static int EZpvd(int i, int i2) {
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) >= 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException("integer overflow");
    }

    public static boolean KWHzl(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int EZpvd(java.lang.CharSequence charSequence) {
        int iCharAt = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            iCharAt = (iCharAt * 31) + charSequence.charAt(i);
        }
        return iCharAt;
    }

    public static <A extends java.lang.Appendable> A copydefault(java.lang.CharSequence charSequence, A a2) {
        try {
            a2.append(charSequence);
            return a2;
        } catch (java.io.IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public static java.lang.String OLrzqt(java.lang.CharSequence charSequence, java.lang.Iterable<? extends java.lang.CharSequence> iterable) {
        if (charSequence == null || iterable == null) {
            throw new java.lang.NullPointerException("Delimiter or elements is null");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = true;
        for (java.lang.CharSequence charSequence2 : iterable) {
            if (charSequence2 != null) {
                if (z) {
                    z = false;
                } else {
                    sb.append(charSequence);
                }
                sb.append(charSequence2);
            }
        }
        return sb.toString();
    }
}
