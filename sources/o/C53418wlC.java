package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53418wlC {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(java.lang.String str) {
        return str == null ? "--" : str;
    }

    public static final java.lang.String KWHzl(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : str;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.String scheme;
        java.lang.String host;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            android.net.Uri uri = android.net.Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            objM7377constructorimpl = Result.m7377constructorimpl(uri);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        android.net.Uri uri2 = (android.net.Uri) objM7377constructorimpl;
        if (uri2 != null && (scheme = uri2.getScheme()) != null && scheme.length() != 0 && (host = uri2.getHost()) != null && host.length() != 0) {
            return str;
        }
        try {
            Result.Application application3 = Result.Companion;
            java.lang.String strEZpvd = C43386roM.EZpvd.EZpvd();
            Intrinsics.copydefault((java.lang.Object) strEZpvd);
            android.net.Uri uri3 = android.net.Uri.parse(strEZpvd);
            Intrinsics.checkNotNullExpressionValue(uri3, "");
            objM7377constructorimpl2 = Result.m7377constructorimpl(uri3.buildUpon().path(str).toString());
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.String str2 = (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
        java.lang.String str3 = str2 != null ? str2 : "";
        return str3.length() == 0 ? str : str3;
    }

    public static final java.lang.String EZpvd(java.lang.String str) {
        return (str == null || str.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "0" : str;
    }
}
