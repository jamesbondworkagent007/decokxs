package o;

import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.proxy.SafeProxySelector;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.rmR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43285rmR extends C43280rmM {
    public static final C43285rmR AEQbTJ = new C43285rmR();

    private C43285rmR() {
        super(null, 1, null);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderNewBuilder = C43282rmO.OLrzqt.OLrzqt().build().newBuilder();
        builderNewBuilder.addInterceptor(new C6886aXo());
        builderNewBuilder.addInterceptor(new C43334rnN(DohTypeEnum.HTTP));
        builderNewBuilder.addInterceptor(new C6881aXj());
        builderNewBuilder.addInterceptor(new C6880aXi());
        builderNewBuilder.addInterceptor(new C43421rov());
        builderNewBuilder.proxySelector(new SafeProxySelector(null, 1, null));
        return builderNewBuilder;
    }
}
