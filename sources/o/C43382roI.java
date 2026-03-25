package o;

import com.okinc.network.okg.tag.RequestTagEnum;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43382roI implements Interceptor {
    public final RequestTagEnum EZpvd;

    public C43382roI(@NotNull RequestTagEnum requestTagEnum) {
        Intrinsics.checkNotNullParameter(requestTagEnum, "");
        this.EZpvd = requestTagEnum;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.header("na-req-tag", this.EZpvd.getTag());
        return chain.proceed(builderNewBuilder.build());
    }
}
