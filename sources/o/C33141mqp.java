package o;

import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.proxy.SafeProxySelector;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.mqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33141mqp {
    public static OkHttpClient KWHzl;
    public int copydefault;

    public C33141mqp(int i) {
        this.copydefault = i;
    }

    public static OkHttpClient AEQbTJ(int i) {
        if (KWHzl == null) {
            OkHttpClient.Builder builderEZpvd = C43463rpk.EZpvd(new OkHttpClient.Builder());
            long j = i;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            KWHzl = builderEZpvd.connectTimeout(j, timeUnit).retryOnConnectionFailure(true).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).dispatcher(C43357rnk.KWHzl.copydefault(ThreadPoolType.HTTP)).proxySelector(new SafeProxySelector()).build();
        }
        return KWHzl;
    }
}
