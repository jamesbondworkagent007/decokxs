package o;

import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32915mmb implements Interceptor {
    public static final Application Companion = new Application(null);
    public final AmplitudeName KWHzl;

    /* JADX INFO: renamed from: o.mmb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mmb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public C32915mmb(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        this.KWHzl = amplitudeName;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.net.URL url = request.url().url();
        java.lang.String host = url.getHost();
        pUU.KWHzl("ByteDanceInterceptor", "ByteDanceHeaderInterceptor-->url:" + url);
        Intrinsics.copydefault((java.lang.Object) host);
        if (C59449zhJ.endsWith$default(host, "bafang.com", false, 2, null)) {
            try {
                Request.Builder builderHeader = request.newBuilder().removeHeader("User-Agent").header("User-Agent", C43384roK.KWHzl.copydefault());
                java.lang.String strCopydefault = xVW.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                Request.Builder builderHeader2 = builderHeader.header("devId", strCopydefault);
                if (this.KWHzl == AmplitudeName.WEB3) {
                    pUU.KWHzl("ByteDanceInterceptor", "WEB3 add SUBDOMAIN_STRATEGY_KEY Global");
                    builderHeader2.header("Subdomain-Strategy", SubdomainStrategy.Global.INSTANCE.toString());
                }
                request = builderHeader2.build();
            } catch (java.lang.Exception e) {
                pUU.copydefault("ByteDanceInterceptor", "ByteDanceHeaderInterceptor Header " + e);
            }
            return chain.proceed(request);
        }
        return chain.proceed(request);
    }
}
