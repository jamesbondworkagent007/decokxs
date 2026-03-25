package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.util.ICUUncheckedIOException;
import java.text.Format;

/* JADX INFO: renamed from: o.acB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7028acB {
    public static final java.lang.String[][] copydefault = {new java.lang.String[]{"{0} {1}", "\u0002\u0000ā \u0001"}, new java.lang.String[]{"{0} ({1})", "\u0002\u0000Ă (\u0001ā)"}, new java.lang.String[]{"{0}, {1}", "\u0002\u0000Ă, \u0001"}, new java.lang.String[]{"{0} – {1}", "\u0002\u0000ă – \u0001"}};

    private C7028acB() {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String OLrzqt(java.lang.CharSequence charSequence, java.lang.StringBuilder sb, int i, int i2) {
        int i3;
        int iCharAt;
        int i4 = 1;
        if (i <= 2 && 2 <= i2) {
            for (java.lang.String[] strArr : copydefault) {
                if (strArr[0].contentEquals(charSequence)) {
                    return strArr[1];
                }
            }
        }
        int length = charSequence.length();
        sb.ensureCapacity(length);
        sb.setLength(1);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1;
        while (i5 < length) {
            int i9 = i5 + 1;
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt != '\'') {
                if (i7 == 0 && cCharAt == '{') {
                    if (i6 > 0) {
                        sb.setCharAt((sb.length() - i6) - i4, (char) (i6 + 256));
                        i6 = 0;
                    }
                    int i10 = i5 + 2;
                    if (i10 < length && charSequence.charAt(i9) - '0' >= 0 && iCharAt <= 9 && charSequence.charAt(i10) == '}') {
                        i5 += 3;
                    } else {
                        if (i9 < length) {
                            cCharAt = charSequence.charAt(i9);
                            if ('1' > cCharAt || cCharAt > '9') {
                                i9 = i10;
                                iCharAt = -1;
                                if (iCharAt < 0) {
                                }
                                throw new java.lang.IllegalArgumentException("Argument syntax error in pattern \"" + ((java.lang.Object) charSequence) + "\" at index " + i5 + ": " + ((java.lang.Object) charSequence.subSequence(i5, i9)));
                            }
                            int i11 = cCharAt - 48;
                            while (i10 < length) {
                                int i12 = i10 + 1;
                                cCharAt = charSequence.charAt(i10);
                                if ('0' > cCharAt || cCharAt > '9' || (i11 = (i11 * 10) + (cCharAt - 48)) >= 256) {
                                    i10 = i12;
                                    break;
                                }
                                i10 = i12;
                            }
                            i9 = i10;
                            iCharAt = i11;
                            if (iCharAt < 0) {
                            }
                            throw new java.lang.IllegalArgumentException("Argument syntax error in pattern \"" + ((java.lang.Object) charSequence) + "\" at index " + i5 + ": " + ((java.lang.Object) charSequence.subSequence(i5, i9)));
                        }
                        iCharAt = -1;
                        if (iCharAt < 0 || cCharAt != '}') {
                            throw new java.lang.IllegalArgumentException("Argument syntax error in pattern \"" + ((java.lang.Object) charSequence) + "\" at index " + i5 + ": " + ((java.lang.Object) charSequence.subSequence(i5, i9)));
                        }
                        i5 = i9;
                    }
                    if (iCharAt > i8) {
                        i8 = iCharAt;
                    }
                    sb.append((char) iCharAt);
                }
                i4 = 1;
            } else if (i9 < length && (cCharAt = charSequence.charAt(i9)) == '\'') {
                i9 = i5 + 2;
            } else if (i7 != 0) {
                i5 = i9;
                i7 = 0;
            } else if (cCharAt == '{' || cCharAt == '}') {
                i9 = i5 + 2;
                i7 = i4;
            } else {
                cCharAt = '\'';
            }
            if (i6 == 0) {
                sb.append((char) 65535);
            }
            sb.append(cCharAt);
            i6++;
            i5 = i9;
            if (i6 == 65279) {
                i6 = 0;
            }
            i4 = 1;
        }
        if (i6 > 0) {
            i3 = 1;
            sb.setCharAt((sb.length() - i6) - 1, (char) (i6 + 256));
        } else {
            i3 = 1;
        }
        int i13 = i8 + i3;
        if (i13 < i) {
            throw new java.lang.IllegalArgumentException("Fewer than minimum " + i + " arguments in pattern \"" + ((java.lang.Object) charSequence) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (i13 > i2) {
            throw new java.lang.IllegalArgumentException("More than maximum " + i2 + " arguments in pattern \"" + ((java.lang.Object) charSequence) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        sb.setCharAt(0, (char) i13);
        return sb.toString();
    }

    public static int EZpvd(java.lang.String str) {
        return str.charAt(0);
    }

    public static java.lang.String EZpvd(java.lang.String str, java.lang.CharSequence... charSequenceArr) {
        return copydefault(str, new java.lang.StringBuilder(), null, charSequenceArr).toString();
    }

    public static java.lang.String OLrzqt(java.lang.String str, int i, int i2, java.lang.CharSequence... charSequenceArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strOLrzqt = OLrzqt(str, sb, i, i2);
        sb.setLength(0);
        return copydefault(strOLrzqt, sb, null, charSequenceArr).toString();
    }

    public static java.lang.StringBuilder copydefault(java.lang.String str, java.lang.StringBuilder sb, int[] iArr, java.lang.CharSequence... charSequenceArr) {
        if ((charSequenceArr != null ? charSequenceArr.length : 0) < EZpvd(str)) {
            throw new java.lang.IllegalArgumentException("Too few values.");
        }
        return KWHzl(str, charSequenceArr, sb, null, true, iArr);
    }

    public static java.lang.StringBuilder AEQbTJ(java.lang.String str, java.lang.StringBuilder sb, int[] iArr, java.lang.CharSequence... charSequenceArr) {
        if ((charSequenceArr != null ? charSequenceArr.length : 0) < EZpvd(str)) {
            throw new java.lang.IllegalArgumentException("Too few values.");
        }
        java.lang.String string = null;
        int i = -1;
        if (EZpvd(str) > 0) {
            int i2 = 1;
            while (i2 < str.length()) {
                int i3 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt >= 256) {
                    i3 += cCharAt - 256;
                } else if (charSequenceArr[cCharAt] == sb) {
                    if (i3 == 2) {
                        i = cCharAt;
                    } else if (string == null) {
                        string = sb.toString();
                    }
                }
                i2 = i3;
            }
        }
        java.lang.String str2 = string;
        if (i < 0) {
            sb.setLength(0);
        }
        return KWHzl(str, charSequenceArr, sb, str2, false, iArr);
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        int i = 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder((str.length() - 1) - EZpvd(str));
        while (i < str.length()) {
            int i2 = i + 1;
            int iCharAt = str.charAt(i) - 256;
            if (iCharAt > 0) {
                i = iCharAt + i2;
                sb.append((java.lang.CharSequence) str, i2, i);
            } else {
                i = i2;
            }
        }
        return sb.toString();
    }

    public static int OLrzqt(java.lang.String str, boolean z) {
        int iCodePointCount = 0;
        int i = 1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iCharAt = str.charAt(i) - 256;
            if (iCharAt > 0) {
                i = iCharAt + i2;
                iCodePointCount += z ? java.lang.Character.codePointCount(str, i2, i) : i - i2;
            } else {
                i = i2;
            }
        }
        return iCodePointCount;
    }

    public static int copydefault(java.lang.String str) {
        if (str.length() == 1) {
            return 0;
        }
        if (str.charAt(0) == 0) {
            return str.length() - 2;
        }
        if (str.charAt(1) <= 256) {
            return 0;
        }
        return str.charAt(1) - 256;
    }

    public static int OLrzqt(java.lang.String str, Format.Field field, int i, int i2, C7020abU c7020abU) {
        int iEZpvd;
        int i3;
        if (EZpvd(str) == 0) {
            return c7020abU.copydefault(i, i2, str, 2, str.length(), field);
        }
        if (str.charAt(1) != 0) {
            char cCharAt = str.charAt(1);
            iEZpvd = c7020abU.EZpvd(i, str, 2, cCharAt - 254, field);
            i3 = cCharAt - 253;
        } else {
            iEZpvd = 0;
            i3 = 2;
        }
        if (i3 >= str.length()) {
            return iEZpvd;
        }
        int i4 = i3 + 1;
        return iEZpvd + c7020abU.EZpvd(i2 + iEZpvd, str, i4, i4 + (str.charAt(i3) - 256), field);
    }

    /* JADX INFO: renamed from: o.acB$TaskDescription */
    public static class TaskDescription {
        public static int AEQbTJ(long j) {
            return (int) j;
        }

        public static long EZpvd(long j, java.lang.CharSequence charSequence, java.lang.Appendable appendable) {
            int i = ((int) (j >>> 32)) + 1;
            while (i < charSequence.length() && charSequence.charAt(i) > 256) {
                int iCharAt = (charSequence.charAt(i) + i) - 255;
                try {
                    appendable.append(charSequence, i + 1, iCharAt);
                    i = iCharAt;
                } catch (java.io.IOException e) {
                    throw new ICUUncheckedIOException(e);
                }
            }
            if (i == charSequence.length()) {
                return -1L;
            }
            return ((long) charSequence.charAt(i)) | (((long) i) << 32);
        }
    }

    public static java.lang.StringBuilder KWHzl(java.lang.String str, java.lang.CharSequence[] charSequenceArr, java.lang.StringBuilder sb, java.lang.String str2, boolean z, int[] iArr) {
        int length;
        if (iArr == null) {
            length = 0;
        } else {
            length = iArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = -1;
            }
        }
        int i2 = 1;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 256) {
                java.lang.CharSequence charSequence = charSequenceArr[cCharAt];
                if (charSequence != sb) {
                    if (cCharAt < length) {
                        iArr[cCharAt] = sb.length();
                    }
                    sb.append(charSequence);
                } else {
                    if (z) {
                        throw new java.lang.IllegalArgumentException("Value must not be same object as result");
                    }
                    if (i3 != 2) {
                        if (cCharAt < length) {
                            iArr[cCharAt] = sb.length();
                        }
                        sb.append(str2);
                    } else if (cCharAt < length) {
                        iArr[cCharAt] = 0;
                    }
                }
                i2 = i3;
            } else {
                i2 = (cCharAt - 256) + i3;
                sb.append((java.lang.CharSequence) str, i3, i2);
            }
        }
        return sb;
    }
}
