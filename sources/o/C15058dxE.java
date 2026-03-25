package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15058dxE implements Interceptor {
    public final java.lang.String copydefault;

    public C15058dxE(java.lang.String str) {
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
        builderHeader.header("Subdomain-Strategy", SubdomainStrategy.Global.INSTANCE.toString());
        for (Map.Entry<java.lang.String, java.lang.String> entry : ((xWO) C43251rlk.copydefault(xWO.class)).aM_().entrySet()) {
            builderHeader.header(entry.getKey(), entry.getValue());
        }
        return chain.proceed(builderHeader.build());
    }
}
