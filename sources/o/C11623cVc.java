package o;

import com.okinc.network.okg.tag.RequestTagEnum;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cVc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C11623cVc extends C43280rmM {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11623cVc(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return C56402yEa.EZpvd(new xYR());
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(new C13929dbp());
        builderInitClientBuilder.addInterceptor(new cXF(this.EZpvd, this.KWHzl, this.OLrzqt));
        return builderInitClientBuilder;
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }
}
