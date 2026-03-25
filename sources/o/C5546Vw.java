package o;

import com.fasterxml.jackson.core.Version;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5546Vw {
    public static final Pattern OLrzqt = Pattern.compile("[-_./;:]");

    public static Version OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str != null) {
            java.lang.String strTrim = str.trim();
            if (strTrim.length() > 0) {
                java.lang.String[] strArrSplit = OLrzqt.split(strTrim);
                return new Version(EZpvd(strArrSplit[0]), strArrSplit.length > 1 ? EZpvd(strArrSplit[1]) : 0, strArrSplit.length > 2 ? EZpvd(strArrSplit[2]) : 0, strArrSplit.length > 3 ? strArrSplit[3] : null, str2, str3);
            }
        }
        return Version.unknownVersion();
    }

    public static int EZpvd(java.lang.String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
            }
            i = (i * 10) + (cCharAt - '0');
        }
        return i;
    }

    public static final void OLrzqt() {
        throw new java.lang.RuntimeException("Internal error: this code path should never get executed");
    }
}
