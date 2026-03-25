package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43380roG implements Interceptor {
    public final java.lang.String OLrzqt = "OKPostDiffRequestInterceptor";

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        if (C43466rpn.OLrzqt.AEQbTJ(request)) {
            builderNewBuilder.removeHeader("Authorization");
            pUU.EZpvd(this.OLrzqt, "remove authorization header, path: " + request.url().encodedPath() + "}");
        }
        builderNewBuilder.removeHeader("na-req-tag");
        return chain.proceed(builderNewBuilder.build());
    }
}
