package o;

import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.proxy.SafeProxySelector;
import com.okinc.websocket.connection.OKWsDoh;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57558ykg {
    public static final C57558ykg AEQbTJ = new C57558ykg();
    public static final ConcurrentHashMap<java.lang.String, OkHttpClient> EZpvd = new ConcurrentHashMap<>();
    public static final int KWHzl = 8;

    private C57558ykg() {
    }

    public final OkHttpClient OLrzqt(@NotNull InterfaceC57564ykm interfaceC57564ykm) {
        Intrinsics.checkNotNullParameter(interfaceC57564ykm, "");
        try {
            OKWsDoh oKWsDohOLrzqt = interfaceC57564ykm.OLrzqt();
            long jKWHzl = interfaceC57564ykm.KWHzl();
            java.lang.String str = oKWsDohOLrzqt.name() + "_" + jKWHzl;
            java.lang.String strName = oKWsDohOLrzqt.name();
            ConcurrentHashMap<java.lang.String, OkHttpClient> concurrentHashMap = EZpvd;
            pUU.KWHzl("OKWsHttpClientFactory", "getHttpClientWithConnConfig, wsDoh: " + strName + ", pingInterval: " + jKWHzl + ", mapSize : " + concurrentHashMap.size());
            if (concurrentHashMap.get(str) != null) {
                OkHttpClient okHttpClient = concurrentHashMap.get(str);
                Intrinsics.copydefault(okHttpClient);
                return okHttpClient;
            }
            OkHttpClient okHttpClientCopydefault = copydefault(interfaceC57564ykm);
            concurrentHashMap.put(str, okHttpClientCopydefault);
            return okHttpClientCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.valueOf("OKWsHttpClientFactory", "getHttpClientWithConnConfig,error: " + th);
            return copydefault(interfaceC57564ykm);
        }
    }

    public final OkHttpClient copydefault(InterfaceC57564ykm interfaceC57564ykm) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        builder.readTimeout(20L, timeUnit);
        builder.connectTimeout(20L, timeUnit);
        builder.pingInterval(interfaceC57564ykm.KWHzl(), timeUnit);
        builder.retryOnConnectionFailure(true);
        builder.dns(interfaceC57564ykm.OLrzqt().getDns$OKNetwork_websocket());
        builder.addInterceptor(interfaceC57564ykm.OLrzqt().getDnsInterceptor$OKNetwork_websocket());
        C43463rpk.EZpvd(builder);
        builder.dispatcher(C43357rnk.KWHzl.copydefault(ThreadPoolType.WEBSOCKET));
        builder.proxySelector(new SafeProxySelector(null, 1, null));
        return builder.build();
    }
}
