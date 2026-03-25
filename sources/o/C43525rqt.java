package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rqt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43525rqt implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(chain.request().newBuilder().header("Subdomain-Strategy", SubdomainStrategy.Global.INSTANCE.toString()).build());
    }
}
