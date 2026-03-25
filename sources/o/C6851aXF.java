package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6851aXF implements Interceptor {
    public static final C6851aXF EZpvd = new C6851aXF();

    private C6851aXF() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.lang.String strHeader = request.header("ConnectTimeout");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strHeader)) {
            chain = chain.withConnectTimeout(C33129mqd.AhwBna(strHeader), java.util.concurrent.TimeUnit.SECONDS);
        }
        java.lang.String strHeader2 = request.header("ReadTimeout");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strHeader2)) {
            chain = chain.withReadTimeout(C33129mqd.AhwBna(strHeader2), java.util.concurrent.TimeUnit.SECONDS);
        }
        java.lang.String strHeader3 = request.header("WriteTimeout");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strHeader3)) {
            chain = chain.withWriteTimeout(C33129mqd.AhwBna(strHeader3), java.util.concurrent.TimeUnit.SECONDS);
        }
        return chain.proceed(chain.request());
    }
}
