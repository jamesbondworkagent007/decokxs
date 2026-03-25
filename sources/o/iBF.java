package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iBF implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(chain.request().newBuilder().header(MTPushConstants.PlatformNode.KEY_PLATFORM, "android").header("real-app-version", C32979mnm.EZpvd.EZpvd()).build());
    }
}
