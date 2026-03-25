package o;

import com.okinc.network.okg.tag.RequestTagEnum;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.rqu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43526rqu extends C43280rmM {
    public static final C43526rqu AEQbTJ = new C43526rqu();

    private C43526rqu() {
        super(null, 1, null);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(new C43527rqv(null));
        return builderInitClientBuilder;
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return C56402yEa.EZpvd(new C43525rqt());
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }
}
