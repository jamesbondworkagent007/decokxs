package o;

/* JADX INFO: renamed from: o.acn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7066acn {
    public static java.util.Locale copydefault(java.lang.String str) {
        java.lang.String strSubstring;
        java.lang.String str2;
        int iIndexOf = str.indexOf(95);
        java.lang.String strSubstring2 = "";
        if (iIndexOf < 0) {
            str2 = "";
        } else {
            java.lang.String strSubstring3 = str.substring(0, iIndexOf);
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(95, i);
            if (iIndexOf2 < 0) {
                strSubstring2 = str.substring(i);
                strSubstring = "";
            } else {
                java.lang.String strSubstring4 = str.substring(i, iIndexOf2);
                strSubstring = str.substring(iIndexOf2 + 1);
                strSubstring2 = strSubstring4;
            }
            str2 = strSubstring;
            str = strSubstring3;
        }
        return new java.util.Locale(str, strSubstring2, str2);
    }

    public static boolean copydefault(java.lang.String str, java.lang.String str2) {
        if (!str2.startsWith(str)) {
            return false;
        }
        int length = str.length();
        return length == str2.length() || str2.charAt(length) == '_';
    }
}
