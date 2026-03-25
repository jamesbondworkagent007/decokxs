package o;

/* JADX INFO: renamed from: o.adK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7090adK {
    public static char AEQbTJ(char c) {
        return (c < 'A' || c > 'Z') ? c : (char) (c + ' ');
    }

    public static boolean EZpvd(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static char OLrzqt(char c) {
        return (c < 'a' || c > 'z') ? c : (char) (c - ' ');
    }

    public static boolean copydefault(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean copydefault(java.lang.String str, java.lang.String str2) {
        if (C7045acS.AEQbTJ(str, str2)) {
            return true;
        }
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2 && AEQbTJ(cCharAt) != AEQbTJ(cCharAt2)) {
                break;
            }
            i++;
        }
        return i == length;
    }

    public static int OLrzqt(java.lang.String str, java.lang.String str2) {
        if (C7045acS.AEQbTJ(str, str2)) {
            return 0;
        }
        return AEQbTJ(str).compareTo(AEQbTJ(str2));
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        char cCharAt;
        int i = 0;
        while (i < str.length() && ((cCharAt = str.charAt(i)) < 'A' || cCharAt > 'Z')) {
            i++;
        }
        if (i == str.length()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.substring(0, i));
        while (i < str.length()) {
            sb.append(AEQbTJ(str.charAt(i)));
            i++;
        }
        return sb.toString();
    }

    public static java.lang.String valueOf(java.lang.String str) {
        char cCharAt;
        int i = 0;
        while (i < str.length() && ((cCharAt = str.charAt(i)) < 'a' || cCharAt > 'z')) {
            i++;
        }
        if (i == str.length()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.substring(0, i));
        while (i < str.length()) {
            sb.append(OLrzqt(str.charAt(i)));
            i++;
        }
        return sb.toString();
    }

    /* JADX DEBUG: Duplicate block (B:29:0x005a) to fix multi-entry loop: BACK_EDGE: B:28:0x004f -> B:29:0x005a */
    public static java.lang.String copydefault(java.lang.String str) {
        int i;
        if (str.length() == 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt < 'a' || cCharAt > 'z') {
            i = 1;
            while (i < str.length() && (cCharAt < 'A' || cCharAt > 'Z')) {
                i++;
            }
        } else {
            i = 0;
        }
        if (i == str.length()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.substring(0, i));
        if (i == 0) {
            sb.append(OLrzqt(str.charAt(i)));
            i++;
        }
        while (i < str.length()) {
            sb.append(AEQbTJ(str.charAt(i)));
            i++;
        }
        return sb.toString();
    }

    public static boolean EZpvd(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!EZpvd(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean OLrzqt(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!copydefault(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean KWHzl(char c) {
        return EZpvd(c) || copydefault(c);
    }

    public static boolean KWHzl(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!KWHzl(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o.adK$TaskDescription */
    public static class TaskDescription {
        public int EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd;
        }

        public TaskDescription(java.lang.String str) {
            this.OLrzqt = str;
            this.EZpvd = C7090adK.AEQbTJ(str).hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TaskDescription) {
                return C7090adK.copydefault(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
            }
            return false;
        }
    }
}
