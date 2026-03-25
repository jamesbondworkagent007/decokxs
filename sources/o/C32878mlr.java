package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32878mlr implements Interceptor {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.mlr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mlr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.net.URL url = request.url().url();
        java.lang.String host = url.getHost();
        pUU.KWHzl("AmpInterceptor", "AmplitudeUserAgentInterceptor-->url:" + url);
        Intrinsics.copydefault((java.lang.Object) host);
        if (C59449zhJ.endsWith$default(host, "bafang.com", false, 2, null)) {
            try {
                Request.Builder builderHeader = request.newBuilder().removeHeader("User-Agent").header("User-Agent", C43384roK.KWHzl.copydefault());
                java.lang.String strCopydefault = xVW.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                request = builderHeader.header("devId", strCopydefault).build();
            } catch (java.lang.Exception e) {
                pUU.copydefault("AmpInterceptor", "Amplitude Header " + e);
            }
            return chain.proceed(request);
        }
        return chain.proceed(request);
    }
}
