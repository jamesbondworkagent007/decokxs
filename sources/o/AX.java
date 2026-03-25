package o;

import com.google.common.net.HttpHeaders;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4025Ax;
import o.DB;
import o.DI;
import o.DL;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AX implements Authenticator {
    public final AD copydefault;

    public AX(@NotNull AD ad) {
        Intrinsics.checkNotNullParameter(ad, "");
        this.copydefault = ad;
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        if (response.request().header(HttpHeaders.PROXY_AUTHORIZATION) != null) {
            return null;
        }
        final HttpUrl httpUrlUrl = response.request().url();
        AbstractC4025Ax abstractC4025AxOLrzqt = this.copydefault.OLrzqt(DL.AEQbTJ.EZpvd(new Function1<DL.Application, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpProxyAuthenticator$authenticate$url$1$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                invoke2(application);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DL.Application application) {
                Intrinsics.checkNotNullParameter(application, "");
                application.EZpvd(new DI(httpUrlUrl.scheme(), httpUrlUrl.port()));
                application.EZpvd(DB.copydefault.KWHzl(httpUrlUrl.host()));
                application.OLrzqt(Integer.valueOf(httpUrlUrl.port()));
            }
        }));
        DU duDjBIcL = abstractC4025AxOLrzqt instanceof AbstractC4025Ax.Application ? ((AbstractC4025Ax.Application) abstractC4025AxOLrzqt).KWHzl().djBIcL() : null;
        if (duDjBIcL == null) {
            return null;
        }
        for (Challenge challenge : response.challenges()) {
            java.lang.String lowerCase = challenge.scheme().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "okhttp-preemptive") || Intrinsics.EZpvd((java.lang.Object) challenge.scheme(), (java.lang.Object) "Basic")) {
                return response.request().newBuilder().header(HttpHeaders.PROXY_AUTHORIZATION, okhttp3.Credentials.basic$default(duDjBIcL.OLrzqt().OLrzqt(), duDjBIcL.copydefault().OLrzqt(), null, 4, null)).build();
            }
        }
        return null;
    }
}
