package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class pXH {
    public static final pXH AEQbTJ = new pXH();

    public final java.lang.String EZpvd(java.lang.String str) {
        return str;
    }

    private pXH() {
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        java.lang.String strReplace$default;
        if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "-", "_", false, 4, (java.lang.Object) null)) == null) {
            return null;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strReplace$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }
}
