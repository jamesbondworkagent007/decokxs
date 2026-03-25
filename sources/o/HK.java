package o;

import aws.smithy.kotlin.runtime.util.OsFamily;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class HK {
    public static final boolean AEQbTJ() {
        try {
            java.lang.Class.forName("android.os.Build");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        java.util.Locale locale = java.util.Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return new Regex("[^a-z0-9+]").replace(lowerCase, "");
    }

    public static final HJ EZpvd() {
        OsFamily osFamily;
        java.lang.Object objM7377constructorimpl;
        java.lang.String property = java.lang.System.getProperty("os.name");
        Intrinsics.checkNotNullExpressionValue(property, "");
        java.lang.String strOLrzqt = OLrzqt(property);
        if (AEQbTJ()) {
            osFamily = OsFamily.Android;
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) "windows", false, 2, (java.lang.Object) null)) {
            osFamily = OsFamily.Windows;
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) "linux", false, 2, (java.lang.Object) null)) {
            osFamily = OsFamily.Linux;
        } else {
            osFamily = StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) "macosx", false, 2, (java.lang.Object) null) ? OsFamily.MacOs : OsFamily.Unknown;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.System.getProperty("os.version"));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return new HJ(osFamily, (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl));
    }
}
