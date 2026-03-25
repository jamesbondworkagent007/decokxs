package o;

import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.log.NetEventLogListener;
import com.okinc.network.proxy.SafeProxySelector;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.rop, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43415rop extends C43280rmM {
    public static final C43415rop AEQbTJ = new C43415rop();

    private C43415rop() {
        super(null, 1, null);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        builder.readTimeout(5L, timeUnit);
        builder.connectTimeout(1L, timeUnit);
        builder.retryOnConnectionFailure(false);
        DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
        builder.dns(new C43337rnQ(dohTypeEnum));
        builder.eventListenerFactory(NetEventLogListener.Companion.OLrzqt(C43292rmY.OLrzqt.DbNXlk(), NetEventLogListener.Companion.RequestType.NATIVE));
        builder.addInterceptor(new C43334rnN(dohTypeEnum));
        builder.addInterceptor(new C6881aXj());
        builder.addInterceptor(new C6880aXi());
        builder.addInterceptor(new C43421rov());
        builder.dispatcher(C43357rnk.KWHzl.copydefault(ThreadPoolType.HTTP));
        builder.proxySelector(new SafeProxySelector(null, 1, null));
        return builder;
    }
}
