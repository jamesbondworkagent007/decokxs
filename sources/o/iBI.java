package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iBI implements Interceptor {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public final java.lang.String OLrzqt;

    public iBI(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request.Builder builderHeader = chain.request().newBuilder().header("sign", this.EZpvd).header("key-id", this.AEQbTJ);
        java.lang.String str = this.OLrzqt;
        if (str != null) {
            builderHeader.header("Encrypt-Strategy", str);
        }
        return chain.proceed(builderHeader.build());
    }
}
