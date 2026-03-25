package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6875aXd implements Interceptor {
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        try {
            return chain.proceed(chain.request());
        } catch (java.lang.Throwable th) {
            if (th instanceof java.io.IOException) {
                throw th;
            }
            throw new java.io.IOException(th);
        }
    }
}
