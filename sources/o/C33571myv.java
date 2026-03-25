package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.myv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33571myv {
    public static final C33564myo OLrzqt(java.lang.String str) {
        java.lang.String str2 = str == null ? "" : str;
        java.util.List listSplit$default = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "_", false, 2, (java.lang.Object) null) ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null) : StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() >= 2) {
            java.lang.String str3 = (java.lang.String) listSplit$default.get(0);
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str3.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String str4 = (java.lang.String) listSplit$default.get(1);
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = str4.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return new C33564myo(lowerCase, lowerCase2);
        }
        return new C33564myo(null, null, 3, null);
    }
}
