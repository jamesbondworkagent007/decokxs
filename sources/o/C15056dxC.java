package o;

import com.okinc.network.okg.tag.RequestTagEnum;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.dxC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15056dxC extends C43280rmM {
    public static final C15056dxC EZpvd = new C15056dxC();

    private C15056dxC() {
        super(null, 1, null);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(new C15058dxE(null));
        return builderInitClientBuilder;
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }
}
