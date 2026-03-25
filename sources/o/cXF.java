package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class cXF implements Interceptor {
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;

    public cXF(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.header("sign", this.OLrzqt).header("key-id", this.KWHzl).header("timestamp", this.AEQbTJ);
        return chain.proceed(builderNewBuilder.build());
    }
}
