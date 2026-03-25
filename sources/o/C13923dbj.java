package o;

import com.okinc.network.okg.tag.RequestTagEnum;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.dbj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13923dbj extends C43280rmM {
    public static final C13923dbj copydefault = new C13923dbj();

    private C13923dbj() {
        super(null, 1, null);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(new C13929dbp());
        return builderInitClientBuilder;
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.EXCHANGE;
    }
}
