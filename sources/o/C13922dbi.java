package o;

import com.okinc.network.okg.tag.RequestTagEnum;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.dbi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13922dbi extends C43280rmM {
    public static final C13922dbi AEQbTJ = new C13922dbi();

    private C13922dbi() {
        super(null, 1, null);
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return C56402yEa.EZpvd(new xYR());
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new mNR());
        return builder;
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }
}
