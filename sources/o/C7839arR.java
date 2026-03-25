package o;

import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.arR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7839arR {
    public static boolean OLrzqt(java.lang.String str) {
        return C7864arq.AEQbTJ(str, ".lua");
    }

    public static boolean copydefault(java.lang.String str) {
        return C7864arq.AEQbTJ(str, ".luab");
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || Globals.OLrzqt()) {
            return str;
        }
        if (!str.endsWith("/")) {
            str = java.lang.String.format("%s/", str);
        }
        return java.lang.String.format("%s%s", str, "64");
    }
}
