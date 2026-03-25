package o;

import com.okinc.network.okg.tag.RequestTagEnum;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes12.dex */
public final class xYK extends C43280rmM {
    public static final xYK AEQbTJ = new xYK();

    private xYK() {
        super(null, 1, null);
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return C56402yEa.EZpvd(new xYR());
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }
}
