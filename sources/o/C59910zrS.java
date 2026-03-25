package o;

/* JADX INFO: renamed from: o.zrS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C59910zrS {
    public static final java.lang.String[] OLrzqt = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          "};

    public static boolean KWHzl(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static java.lang.String AEQbTJ(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("width must be > 0");
        }
        java.lang.String[] strArr = OLrzqt;
        if (i < strArr.length) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = ' ';
        }
        return java.lang.String.valueOf(cArr);
    }

    public static boolean AEQbTJ(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!KWHzl(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int length = str.length();
        int iCharCount = 0;
        boolean z = false;
        boolean z2 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!KWHzl(iCodePointAt)) {
                sb.appendCodePoint(iCodePointAt);
                z2 = false;
            } else if (z2) {
                z = true;
            } else {
                if (iCodePointAt != 32) {
                    z = true;
                }
                sb.append(' ');
                z2 = true;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
        return z ? sb.toString() : str;
    }

    public static boolean AEQbTJ(java.lang.String str, java.lang.String... strArr) {
        for (java.lang.String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
