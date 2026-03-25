package o;

/* JADX INFO: renamed from: o.pKu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38061pKu {
    public static boolean copydefault(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean OLrzqt(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!java.lang.Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
