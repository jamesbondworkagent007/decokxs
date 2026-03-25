package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rqv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43527rqv implements Interceptor {
    public final java.lang.String copydefault;

    public C43527rqv(java.lang.String str) {
        this.copydefault = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request.Builder builderHeader = chain.request().newBuilder().header("real-app-version", C32979mnm.EZpvd.EZpvd());
        java.lang.String str = this.copydefault;
        if (str != null) {
            builderHeader.header("timestamp", str);
        }
        return chain.proceed(builderHeader.build());
    }
}
