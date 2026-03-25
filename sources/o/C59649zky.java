package o;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.zky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59649zky {
    public static final Pattern KWHzl = Pattern.compile("^(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    public static final Pattern OLrzqt = Pattern.compile("^::[fF]{4}:(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    public static final Pattern copydefault = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
    public static final Pattern AEQbTJ = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");

    private C59649zky() {
    }

    public static boolean OLrzqt(java.lang.String str) {
        return KWHzl.matcher(str).matches();
    }

    public static boolean EZpvd(java.lang.String str) {
        return copydefault.matcher(str).matches();
    }

    public static boolean KWHzl(java.lang.String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ':') {
                i++;
            }
        }
        return i <= 7 && AEQbTJ.matcher(str).matches();
    }

    public static boolean AEQbTJ(java.lang.String str) {
        return EZpvd(str) || KWHzl(str);
    }
}
