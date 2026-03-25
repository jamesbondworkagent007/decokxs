package o;

/* JADX INFO: renamed from: o.zoQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C59827zoQ {
    public static boolean KWHzl(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean copydefault(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (!java.lang.Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean OLrzqt(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (java.lang.Character.isWhitespace(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
