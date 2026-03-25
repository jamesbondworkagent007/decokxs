package o;

import com.okinc.okex.ui.search.SearchInputChecker;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qGZ {
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            if (str.length() > 0) {
                android.content.Context applicationContext = activity.getApplicationContext();
                java.util.Locale locale = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (SearchInputChecker.copydefault(applicationContext, lowerCase)) {
                    C40375qTn.AEQbTJ.copydefault("IDebuggerInterceptor", "jumpToPandoraHome [keyword: " + str + "]");
                    C31977mKy.AEQbTJ.OLrzqt(activity);
                    z = true;
                } else {
                    z = false;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(z));
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C40375qTn.AEQbTJ.copydefault("IDebuggerInterceptor", "SearchInputChecker error [keyword: " + str + "]", thM7380exceptionOrNullimpl);
            C6777aVl.Companion.EZpvd(new java.lang.Exception("SearchInputChecker error", thM7380exceptionOrNullimpl));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }
}
