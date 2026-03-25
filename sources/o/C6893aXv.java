package o;

import com.google.common.net.HttpHeaders;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6893aXv implements Interceptor {
    public final java.util.List<java.lang.String> KWHzl = yDY.gEmmrt("Host", "x-id", "x-site-info", HttpHeaders.REFERER);
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        if (!C43466rpn.OLrzqt.AEQbTJ(chain)) {
            return chain.proceed(chain.request());
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        for (kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair : request.headers()) {
            if (this.KWHzl.contains(pair.getFirst()) || C43386roM.EZpvd.AEQbTJ().keySet().contains(pair.getFirst())) {
                builderNewBuilder.removeHeader(pair.getFirst());
            }
        }
        yHT<java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, Unit> yhtValueOf = C43292rmY.OLrzqt.valueOf();
        if (yhtValueOf != null) {
            yhtValueOf.invoke("ignore_header_request", null, null, C56424yEw.djBIcL(C56390yDp.OLrzqt("full_url", request.url().toString())));
        }
        pUU.KWHzl("RemovePrivateHeadersInterceptor", "RemovePrivateHeadersInterceptor, finished. full_url: " + request.url());
        return chain.proceed(builderNewBuilder.build());
    }

    /* JADX INFO: renamed from: o.aXv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
