package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6879aXh implements Interceptor {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ = C43292rmY.OLrzqt.fJNWhG();

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        int port;
        Intrinsics.checkNotNullParameter(chain, "");
        java.lang.String strFJNWhG = C43292rmY.OLrzqt.fJNWhG();
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        java.lang.String strHost = httpUrlUrl.host();
        java.net.URL url = new java.net.URL(this.AEQbTJ);
        java.net.URL url2 = new java.net.URL(strFJNWhG);
        java.lang.String host = url.getHost();
        java.lang.String host2 = url2.getHost();
        pUU.EZpvd("DebugUrlInterceptor", "debug -- baseUrl: " + this.AEQbTJ + ", originUrl: " + httpUrlUrl + ", originalHost: " + strHost + ", debugHost: " + host2 + ", debugPort: " + url2.getPort());
        if (Intrinsics.EZpvd((java.lang.Object) strHost, (java.lang.Object) host) && !Intrinsics.EZpvd((java.lang.Object) strHost, (java.lang.Object) host2)) {
            if (url2.getPort() != -1) {
                port = url2.getPort();
            } else {
                port = C59449zhJ.startsWith$default(strFJNWhG, "https", false, 2, null) ? 443 : 8443;
            }
            HttpUrl.Builder builderNewBuilder = httpUrlUrl.newBuilder();
            java.lang.String protocol = url2.getProtocol();
            Intrinsics.checkNotNullExpressionValue(protocol, "");
            HttpUrl.Builder builderScheme = builderNewBuilder.scheme(protocol);
            Intrinsics.copydefault((java.lang.Object) host2);
            request = request.newBuilder().url(builderScheme.host(host2).port(port).build()).build();
        }
        return chain.proceed(request);
    }

    /* JADX INFO: renamed from: o.aXh$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXh.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
