package o;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43710ruS implements Interceptor {
    public final java.lang.String EZpvd;
    public final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt;

    public C43710ruS(@NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = str;
        this.OLrzqt = map;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        java.lang.String json = new Gson().toJson(this.OLrzqt);
        Request.Builder builderHeader = chain.request().newBuilder().header("playbook", this.EZpvd);
        Intrinsics.copydefault((java.lang.Object) json);
        return chain.proceed(builderHeader.header("action-param", json).build());
    }
}
