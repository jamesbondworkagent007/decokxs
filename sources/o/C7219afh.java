package o;

import okio.Utf8;

/* JADX INFO: renamed from: o.afh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class C7219afh {
    @java.lang.Deprecated
    public static int KWHzl(java.lang.CharSequence charSequence, int i) {
        if (i < 0 || i > 1114111) {
            throw new java.lang.IllegalArgumentException();
        }
        int length = charSequence.length();
        if (length == 0) {
            return -1;
        }
        char cCharAt = charSequence.charAt(0);
        int i2 = i - 65536;
        if (i2 < 0) {
            int i3 = cCharAt - i;
            return i3 != 0 ? i3 : length - 1;
        }
        int i4 = cCharAt - ((char) ((i2 >>> 10) + 55296));
        if (i4 != 0) {
            return i4;
        }
        if (length > 1) {
            int iCharAt = charSequence.charAt(1) - ((char) ((i2 & 1023) + Utf8.LOG_SURROGATE_HEADER));
            if (iCharAt != 0) {
                return iCharAt;
            }
        }
        return length - 2;
    }

    @java.lang.Deprecated
    public static int EZpvd(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        if (length >= 1 && length <= 2) {
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, 0);
            if ((iCodePointAt < 65536) == (length == 1)) {
                return iCodePointAt;
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] copydefault(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 56320 && cCharAt <= 57343 && i2 != 0) {
                int i3 = i - 1;
                char c = (char) iArr[i3];
                if (c >= 55296 && c <= 56319) {
                    iArr[i3] = java.lang.Character.toCodePoint(c, cCharAt);
                }
            } else {
                iArr[i] = cCharAt;
                i++;
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    private C7219afh() {
    }
}
