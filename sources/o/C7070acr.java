package o;

import androidx.core.internal.view.SupportMenu;

/* JADX INFO: renamed from: o.acr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7070acr {
    public static final byte[] OLrzqt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 0, 3, 3, 0, 3, 0, 3, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final byte[] EZpvd = {2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 9};
    public static final int[] copydefault = {0, -1, SupportMenu.CATEGORY_MASK, 2147418367, 2146435070, SupportMenu.CATEGORY_MASK, 4194303, -1048576, -242, 65537};
    public static final int[] AEQbTJ = {0, -1, -16384, 2147419135, 2146435070, SupportMenu.CATEGORY_MASK, 4194303, -1048576, -242, 65537};

    public static boolean copydefault(int i) {
        if (i < 0) {
            return false;
        }
        if (i <= 255) {
            return OLrzqt[i] != 0;
        }
        if (i < 8206) {
            return false;
        }
        if (i <= 12336) {
            return ((AEQbTJ[EZpvd[(i + (-8192)) >> 5]] >> (i & 31)) & 1) != 0;
        }
        if (64830 > i || i > 65094) {
            return false;
        }
        return i <= 64831 || 65093 <= i;
    }

    public static boolean AEQbTJ(int i) {
        if (i < 0) {
            return false;
        }
        if (i <= 255) {
            return OLrzqt[i] == 5;
        }
        if (8206 > i || i > 8233) {
            return false;
        }
        return i <= 8207 || 8232 <= i;
    }

    public static int KWHzl(java.lang.CharSequence charSequence, int i) {
        while (i < charSequence.length() && AEQbTJ(charSequence.charAt(i))) {
            i++;
        }
        return i;
    }

    public static java.lang.String copydefault(java.lang.String str) {
        if (str.length() == 0) {
            return str;
        }
        int i = 0;
        if (!AEQbTJ(str.charAt(0)) && !AEQbTJ(str.charAt(str.length() - 1))) {
            return str;
        }
        int length = str.length();
        while (i < length && AEQbTJ(str.charAt(i))) {
            i++;
        }
        if (i < length) {
            while (AEQbTJ(str.charAt(length - 1))) {
                length--;
            }
        }
        return str.substring(i, length);
    }

    public static boolean KWHzl(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (copydefault(charSequence.charAt(i))) {
                return false;
            }
            if (i2 >= length) {
                return true;
            }
            i = i2;
        }
    }

    public static int AEQbTJ(java.lang.CharSequence charSequence, int i) {
        while (i < charSequence.length() && !copydefault(charSequence.charAt(i))) {
            i++;
        }
        return i;
    }
}
