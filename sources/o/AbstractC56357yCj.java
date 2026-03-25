package o;

/* JADX INFO: renamed from: o.yCj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC56357yCj {
    public static java.lang.String copydefault(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return ((str.indexOf(66) != -1) || (str.indexOf(98) != -1)) ? KWHzl(str) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String KWHzl(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int i = 0;
        char c = ' ';
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ') {
                if (cCharAt != 'B' && cCharAt != 'b') {
                    sb.append(cCharAt);
                }
            } else if (i == 0 || (c != 'B' && c != 'b')) {
            }
            i++;
            c = cCharAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }
}
