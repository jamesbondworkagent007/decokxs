package o;

import com.ibm.icu.text.Normalizer;
import okio.Utf8;

/* JADX INFO: renamed from: o.agD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7242agD {
    public static boolean AEQbTJ(char c) {
        return (c & (-1024)) == 55296;
    }

    public static char EZpvd(int i) {
        return i >= 65536 ? (char) ((i & 1023) + Utf8.LOG_SURROGATE_HEADER) : (char) i;
    }

    public static boolean EZpvd(char c) {
        return (c & (-2048)) == 55296;
    }

    public static char OLrzqt(int i) {
        if (i >= 65536) {
            return (char) ((i >> 10) + Utf8.HIGH_SURROGATE_HEADER);
        }
        return (char) 0;
    }

    public static boolean OLrzqt(char c) {
        return (c & (-1024)) == 56320;
    }

    public static int copydefault(int i) {
        return i < 65536 ? 1 : 2;
    }

    private C7242agD() {
    }

    public static int AEQbTJ(java.lang.String str, int i) {
        char cCharAt = str.charAt(i);
        return cCharAt < 55296 ? cCharAt : EZpvd(str, i, cCharAt);
    }

    public static int EZpvd(java.lang.String str, int i, char c) {
        char cCharAt;
        char cCharAt2;
        if (c > 57343) {
            return c;
        }
        if (c <= 56319) {
            int i2 = i + 1;
            if (str.length() != i2 && (cCharAt2 = str.charAt(i2)) >= 56320 && cCharAt2 <= 57343) {
                return java.lang.Character.toCodePoint(c, cCharAt2);
            }
        } else {
            int i3 = i - 1;
            if (i3 >= 0 && (cCharAt = str.charAt(i3)) >= 55296 && cCharAt <= 56319) {
                return java.lang.Character.toCodePoint(cCharAt, c);
            }
        }
        return c;
    }

    public static int OLrzqt(java.lang.CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        return cCharAt < 55296 ? cCharAt : AEQbTJ(charSequence, i, cCharAt);
    }

    public static int AEQbTJ(java.lang.CharSequence charSequence, int i, char c) {
        char cCharAt;
        char cCharAt2;
        if (c > 57343) {
            return c;
        }
        if (c <= 56319) {
            int i2 = i + 1;
            if (charSequence.length() != i2 && (cCharAt2 = charSequence.charAt(i2)) >= 56320 && cCharAt2 <= 57343) {
                return java.lang.Character.toCodePoint(c, cCharAt2);
            }
        } else {
            int i3 = i - 1;
            if (i3 >= 0 && (cCharAt = charSequence.charAt(i3)) >= 55296 && cCharAt <= 56319) {
                return java.lang.Character.toCodePoint(cCharAt, c);
            }
        }
        return c;
    }

    public static int KWHzl(java.lang.StringBuffer stringBuffer, int i) {
        if (i < 0 || i >= stringBuffer.length()) {
            throw new java.lang.StringIndexOutOfBoundsException(i);
        }
        char cCharAt = stringBuffer.charAt(i);
        if (!EZpvd(cCharAt)) {
            return cCharAt;
        }
        if (cCharAt <= 56319) {
            int i2 = i + 1;
            if (stringBuffer.length() != i2) {
                char cCharAt2 = stringBuffer.charAt(i2);
                if (OLrzqt(cCharAt2)) {
                    return java.lang.Character.toCodePoint(cCharAt, cCharAt2);
                }
            }
        } else {
            int i3 = i - 1;
            if (i3 >= 0) {
                char cCharAt3 = stringBuffer.charAt(i3);
                if (AEQbTJ(cCharAt3)) {
                    return java.lang.Character.toCodePoint(cCharAt3, cCharAt);
                }
            }
        }
        return cCharAt;
    }

    public static int KWHzl(char[] cArr, int i, int i2, int i3) {
        int i4 = i3 + i;
        if (i4 < i || i4 >= i2) {
            throw new java.lang.ArrayIndexOutOfBoundsException(i4);
        }
        char c = cArr[i4];
        if (!EZpvd(c)) {
            return c;
        }
        if (c <= 56319) {
            int i5 = i4 + 1;
            if (i5 >= i2) {
                return c;
            }
            char c2 = cArr[i5];
            if (OLrzqt(c2)) {
                return java.lang.Character.toCodePoint(c, c2);
            }
        } else {
            if (i4 == i) {
                return c;
            }
            char c3 = cArr[i4 - 1];
            if (AEQbTJ(c3)) {
                return java.lang.Character.toCodePoint(c3, c);
            }
        }
        return c;
    }

    public static java.lang.String KWHzl(int i) {
        if (i < 0 || i > 1114111) {
            throw new java.lang.IllegalArgumentException("Illegal codepoint");
        }
        return AEQbTJ(i);
    }

    public static java.lang.StringBuffer copydefault(java.lang.StringBuffer stringBuffer, int i) {
        if (i < 0 || i > 1114111) {
            throw new java.lang.IllegalArgumentException("Illegal codepoint: " + java.lang.Integer.toHexString(i));
        }
        if (i >= 65536) {
            stringBuffer.append(OLrzqt(i));
            stringBuffer.append(EZpvd(i));
        } else {
            stringBuffer.append((char) i);
        }
        return stringBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void EZpvd(java.lang.StringBuffer stringBuffer, int i, int i2) {
        int i3;
        int i4;
        char cCharAt = stringBuffer.charAt(i);
        if (EZpvd(cCharAt)) {
            i3 = 2;
            if (!AEQbTJ(cCharAt) || stringBuffer.length() <= (i4 = i + 1) || !OLrzqt(stringBuffer.charAt(i4))) {
                if (OLrzqt(cCharAt) && i > 0 && AEQbTJ(stringBuffer.charAt(i - 1))) {
                    i--;
                } else {
                    i3 = 1;
                }
            }
        }
        stringBuffer.replace(i, i3 + i, KWHzl(i2));
    }

    public static boolean EZpvd(java.lang.String str, int i) {
        if (i < 0) {
            return true;
        }
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (((length + 1) >> 1) > i) {
            return true;
        }
        int i2 = length - i;
        if (i2 <= 0) {
            return false;
        }
        int i3 = 0;
        while (length != 0) {
            if (i == 0) {
                return true;
            }
            int i4 = i3 + 1;
            if (AEQbTJ(str.charAt(i3)) && i4 != length && OLrzqt(str.charAt(i4))) {
                i3 += 2;
                i2--;
                if (i2 <= 0) {
                    return false;
                }
            } else {
                i3 = i4;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: o.agD$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar implements java.util.Comparator<java.lang.String> {
        public boolean AEQbTJ;
        public int EZpvd;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd(boolean z) {
            this.OLrzqt = z ? 32768 : 0;
        }

        public ActionBar() {
            this(false, false, 0);
        }

        public ActionBar(boolean z, boolean z2, int i) {
            EZpvd(z);
            this.AEQbTJ = z2;
            if (i < 0 || i > 1) {
                throw new java.lang.IllegalArgumentException("Invalid fold case option");
            }
            this.EZpvd = i;
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.String str, java.lang.String str2) {
            if (C7045acS.AEQbTJ(str, str2)) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            if (this.AEQbTJ) {
                return OLrzqt(str, str2);
            }
            return EZpvd(str, str2);
        }

        public final int OLrzqt(java.lang.String str, java.lang.String str2) {
            return Normalizer.AEQbTJ(str, str2, this.EZpvd | this.OLrzqt | 65536);
        }

        public final int EZpvd(java.lang.String str, java.lang.String str2) {
            int i;
            int i2;
            int i3;
            int i4;
            int length = str.length();
            int length2 = str2.length();
            if (length < length2) {
                i2 = -1;
                i = length;
            } else if (length > length2) {
                i = length2;
                i2 = 1;
            } else {
                i = length;
                i2 = 0;
            }
            int i5 = 0;
            char cCharAt = 0;
            char cCharAt2 = 0;
            while (i5 < i) {
                cCharAt2 = str.charAt(i5);
                cCharAt = str2.charAt(i5);
                if (cCharAt2 != cCharAt) {
                    break;
                }
                i5++;
            }
            if (i5 == i) {
                return i2;
            }
            boolean z = this.OLrzqt == 32768;
            if (cCharAt2 >= 55296 && cCharAt >= 55296 && z) {
                if ((cCharAt2 > 56319 || (i4 = i5 + 1) == length || !C7242agD.OLrzqt(str.charAt(i4))) && (!C7242agD.OLrzqt(cCharAt2) || i5 == 0 || !C7242agD.AEQbTJ(str.charAt(i5 - 1)))) {
                    cCharAt2 = (char) (cCharAt2 - 10240);
                }
                if ((cCharAt > 56319 || (i3 = i5 + 1) == length2 || !C7242agD.OLrzqt(str2.charAt(i3))) && (!C7242agD.OLrzqt(cCharAt) || i5 == 0 || !C7242agD.AEQbTJ(str2.charAt(i5 - 1)))) {
                    cCharAt = (char) (cCharAt - 10240);
                }
            }
            return cCharAt2 - cCharAt;
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:char:INVOKE), (wrap:char:INVOKE) */
    public static java.lang.String AEQbTJ(int i) {
        if (i < 65536) {
            return java.lang.String.valueOf((char) i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(OLrzqt(i));
        sb.append(EZpvd(i));
        return sb.toString();
    }
}
