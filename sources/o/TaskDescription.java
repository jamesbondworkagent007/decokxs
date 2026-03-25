package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TaskDescription {
    public static final ActionBar AEQbTJ(java.lang.String str) {
        java.lang.Object next;
        java.lang.String str2 = str == null ? "" : str;
        java.util.Iterator<T> it = Activity.copydefault.EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) next, false, 2, (java.lang.Object) null)) {
                break;
            }
        }
        java.lang.String str3 = (java.lang.String) next;
        java.util.List listSplit$default = str3 != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{str3}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default != null && listSplit$default.size() >= 2) {
            java.lang.String str4 = (java.lang.String) listSplit$default.get(0);
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String str5 = (java.lang.String) listSplit$default.get(1);
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = str5.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return new ActionBar(lowerCase, lowerCase2);
        }
        return new ActionBar(null, null, 3, null);
    }

    public static final java.lang.String AEQbTJ(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strCopydefault = actionBar.copydefault();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String strAEQbTJ = actionBar.AEQbTJ();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String upperCase2 = strAEQbTJ.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase + upperCase2;
    }

    public static final java.lang.String EZpvd(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strCopydefault = actionBar.copydefault();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String strAEQbTJ = actionBar.AEQbTJ();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String upperCase2 = strAEQbTJ.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase + "/" + upperCase2;
    }

    public static final java.lang.String copydefault(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strCopydefault = actionBar.copydefault();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String strAEQbTJ = actionBar.AEQbTJ();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String upperCase2 = strAEQbTJ.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase + "-" + upperCase2;
    }
}
