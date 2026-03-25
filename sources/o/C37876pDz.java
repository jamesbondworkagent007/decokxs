package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37876pDz {
    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C33564myo c33564myoOLrzqt = C33571myv.OLrzqt(str);
        java.lang.String strEZpvd = c33564myoOLrzqt.EZpvd();
        java.lang.String strAEQbTJ = c33564myoOLrzqt.AEQbTJ();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd) || !C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
            return "";
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strEZpvd.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase2 = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase + "/" + upperCase2;
    }
}
