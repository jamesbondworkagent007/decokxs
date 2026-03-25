package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import com.okinc.network.okg.dns.model.DOHProcessParam;
import java.net.SocketException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6889aXr implements Interceptor {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.aXr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        java.lang.String strKWHzl;
        HttpUrl requestUrl;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        if (C43400roa.Companion.AEQbTJ(request)) {
            return chain.proceed(request);
        }
        try {
            return chain.proceed(request);
        } catch (java.io.IOException e) {
            DOHProcessParam dOHProcessParam = (DOHProcessParam) chain.request().tag(DOHProcessParam.class);
            if (dOHProcessParam == null) {
                pUU.copydefault("OKDefaultErrorRetryInterceptor", "dohProcessParam is null. be careful.path:" + request.url());
            }
            boolean requestUrlIsCORHost = dOHProcessParam != null ? dOHProcessParam.getRequestUrlIsCORHost() : false;
            if (dOHProcessParam == null || (requestUrl = dOHProcessParam.getRequestUrl()) == null || (strKWHzl = requestUrl.host()) == null) {
                strKWHzl = OKDohConfig.Companion.KWHzl(DohTypeEnum.HTTP);
            }
            java.lang.String str = strKWHzl;
            SubdomainStrategy originSubdomainStrategy = dOHProcessParam != null ? dOHProcessParam.getOriginSubdomainStrategy() : null;
            java.lang.String strAEQbTJ = originSubdomainStrategy instanceof SubdomainStrategy.Subdomain ? ((SubdomainStrategy.Subdomain) originSubdomainStrategy).AEQbTJ() : null;
            if (!copydefault(e) || !copydefault(requestUrlIsCORHost, strAEQbTJ)) {
                return OLrzqt(chain, e, str, requestUrlIsCORHost, strAEQbTJ);
            }
            try {
                return AEQbTJ(chain, e, requestUrlIsCORHost, strAEQbTJ);
            } catch (java.io.IOException e2) {
                return OLrzqt(chain, e2, str, requestUrlIsCORHost, strAEQbTJ);
            }
        }
    }

    public final boolean copydefault(java.io.IOException iOException) {
        return iOException instanceof SocketException;
    }

    public final boolean copydefault(boolean z, java.lang.String str) {
        C43372rnz c43372rnz = C43372rnz.copydefault;
        if (c43372rnz.AYXKKw()) {
            return c43372rnz.AEQbTJ(DohTypeEnum.HTTP, z, str);
        }
        return false;
    }

    public final Response OLrzqt(Interceptor.Chain chain, java.io.IOException iOException, java.lang.String str, boolean z, java.lang.String str2) throws java.io.IOException {
        Request request = chain.request();
        if (EZpvd(iOException, request)) {
            HttpUrl httpUrlUrl = request.url();
            java.lang.String string = httpUrlUrl.toString();
            java.lang.String strHost = httpUrlUrl.host();
            if (C43396roW.EZpvd().AhwBna() && C43412rom.OLrzqt.copydefault((java.lang.Throwable) iOException)) {
                pUU.KWHzl("OKDefaultErrorRetryInterceptor", "vpn error " + iOException.getClass().getSimpleName() + " retry with default domain, originHost:" + strHost + ", replaceHost:" + ((java.lang.Object) str));
            } else {
                str = OLrzqt(z, str2);
                pUU.valueOf("OKDefaultErrorRetryInterceptor", "Exception: " + iOException.getClass().getSimpleName() + "\n retry url : " + chain.request().url() + ", oldHost:" + strHost + ", newHost:" + ((java.lang.Object) str));
            }
            if (str != null) {
                pUU.KWHzl("OKDefaultErrorRetryInterceptor", "request retry : " + chain.request().url() + ", newHost: " + ((java.lang.Object) str));
                Request.Builder builderNewBuilder = request.newBuilder();
                builderNewBuilder.url(new java.net.URL(C59449zhJ.replaceFirst$default(string, strHost, str, false, 4, (java.lang.Object) null)));
                builderNewBuilder.header("Host", str);
                Request requestBuild = builderNewBuilder.build();
                C43466rpn.OLrzqt.OLrzqt(requestBuild);
                return chain.proceed(requestBuild);
            }
            throw iOException;
        }
        throw iOException;
    }

    public final java.lang.String OLrzqt(boolean z, java.lang.String str) {
        return C43372rnz.copydefault.EZpvd(DohTypeEnum.HTTP, z, str);
    }

    public final boolean EZpvd(java.io.IOException iOException, Request request) {
        return C43412rom.OLrzqt.AEQbTJ(iOException) && Intrinsics.EZpvd((java.lang.Object) request.method(), (java.lang.Object) "GET") && Intrinsics.EZpvd((java.lang.Object) "1", (java.lang.Object) request.header("change"));
    }

    public final Response AEQbTJ(Interceptor.Chain chain, java.io.IOException iOException, boolean z, java.lang.String str) throws java.io.IOException {
        Request request = chain.request();
        if (EZpvd(iOException, request)) {
            HttpUrl httpUrlUrl = request.url();
            java.lang.String string = httpUrlUrl.toString();
            java.lang.String strHost = httpUrlUrl.host();
            java.lang.String strOLrzqt = OLrzqt(z, str);
            pUU.valueOf("OKDefaultErrorRetryInterceptor", "retryBackup, Exception: " + iOException.getClass().getSimpleName() + "\n retry url : " + chain.request().url() + ", oldHost:" + strHost + ", newHost:" + strOLrzqt);
            if (strOLrzqt != null) {
                pUU.KWHzl("OKDefaultErrorRetryInterceptor", "request  retryBackup : " + chain.request().url() + ", newHost: " + strOLrzqt);
                Request.Builder builderNewBuilder = request.newBuilder();
                builderNewBuilder.url(new java.net.URL(C59449zhJ.replaceFirst$default(string, strHost, strOLrzqt, false, 4, (java.lang.Object) null)));
                builderNewBuilder.header("Host", strOLrzqt);
                Request requestBuild = builderNewBuilder.build();
                C43466rpn.OLrzqt.OLrzqt(requestBuild);
                return chain.proceed(requestBuild);
            }
            throw iOException;
        }
        throw iOException;
    }
}
