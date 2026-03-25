package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sIh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44235sIh implements Interceptor {
    public final java.lang.String KWHzl;

    public C44235sIh(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        C44124sEe.imLogTokenOperation$default("In-house IM API interceptor: " + chain.request().url(), null, 2, null);
        return chain.proceed(chain.request().newBuilder().header("im-token", this.KWHzl).build());
    }
}
