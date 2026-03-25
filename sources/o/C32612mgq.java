package o;

import com.okinc.network.okg.unifieddomain.DomainType;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32612mgq implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        try {
            return chain.proceed(request.newBuilder().url(C43385roL.Companion.EZpvd().copydefault(DomainType.CDN, request.url())).build());
        } catch (java.lang.Throwable th) {
            if (th instanceof java.io.IOException) {
                throw th;
            }
            pUU.copydefault("CdnImageDomainInterceptor exception url: " + request.url() + ", message: " + th.getMessage());
            return new Response.Builder().request(request).protocol(Protocol.HTTP_1_1).code(400).body(ResponseBody.Companion.create("CDN replacement failed", MediaType.Companion.parse("text/plain"))).message("CDN URL replacement failed: " + th.getMessage()).build();
        }
    }
}
