package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6852aXG implements Interceptor {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.aXG$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.net.URL url = request.url().url();
        java.lang.String host = url.getHost();
        try {
            Intrinsics.copydefault((java.lang.Object) host);
            if (C59449zhJ.endsWith$default(host, "bafang.com", false, 2, null)) {
                pUU.EZpvd("HttpProxyInterceptor", "originalRequest " + url + " User-Agent :" + request.header("User-Agent"));
                Request.Builder builderHeader = request.newBuilder().removeHeader("User-Agent").header("User-Agent", C43384roK.KWHzl.copydefault());
                java.lang.String strCopydefault = xVW.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                return chain.proceed(builderHeader.header("devId", strCopydefault).build());
            }
        } catch (java.lang.Exception e) {
            pUU.EZpvd("HttpProxyInterceptor", java.lang.String.valueOf(e));
        }
        return chain.proceed(request);
    }
}
