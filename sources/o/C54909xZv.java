package o;

import com.okinc.web3.security.utils.WrapApi;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54909xZv {
    public static final C54909xZv OLrzqt = new C54909xZv();

    private C54909xZv() {
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(WrapApi.dataWrap(context, str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            obj = objM7377constructorimpl;
        } else {
            pUU.AEQbTJ("SafeWrapApi", "WrapApi.dataWrap failed [" + java.lang.Thread.currentThread().getName() + "]", thM7380exceptionOrNullimpl);
        }
        return (java.lang.String) obj;
    }

    public final boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(WrapApi.isEqual(context, str, str2)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("SafeWrapApi", "WrapApi.isEqual failed [" + java.lang.Thread.currentThread().getName() + "]", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }
}
