package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.dns.model.DOHProcessParam;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6880aXi implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        java.lang.String oKXSiteInfo$default;
        Intrinsics.checkNotNullParameter(chain, "");
        C43655rtQ c43655rtQ = C43655rtQ.OLrzqt;
        java.lang.String strAEQbTJ = c43655rtQ.AEQbTJ(c43655rtQ.AhwBna());
        DOHProcessParam dOHProcessParam = (DOHProcessParam) chain.request().tag(DOHProcessParam.class);
        SubdomainStrategy originSubdomainStrategy = dOHProcessParam != null ? dOHProcessParam.getOriginSubdomainStrategy() : null;
        if (originSubdomainStrategy instanceof SubdomainStrategy.Subdomain) {
            oKXSiteInfo$default = c43655rtQ.AEQbTJ(((SubdomainStrategy.Subdomain) originSubdomainStrategy).AEQbTJ());
            pUU.KWHzl("EntityInterceptor", "force cor.path:" + chain.request().url().encodedPath() + ", before:" + strAEQbTJ + ", after:" + oKXSiteInfo$default);
        } else {
            if (originSubdomainStrategy instanceof SubdomainStrategy.Global) {
                oKXSiteInfo$default = C43655rtQ.getOKXSiteInfo$default(c43655rtQ, null, 1, null);
                pUU.KWHzl("EntityInterceptor", "no cor.path:" + chain.request().url().encodedPath() + ", before:" + strAEQbTJ + ", after:" + oKXSiteInfo$default);
            }
            return chain.proceed(chain.request().newBuilder().header("x-site-info", strAEQbTJ).build());
        }
        strAEQbTJ = oKXSiteInfo$default;
        return chain.proceed(chain.request().newBuilder().header("x-site-info", strAEQbTJ).build());
    }
}
