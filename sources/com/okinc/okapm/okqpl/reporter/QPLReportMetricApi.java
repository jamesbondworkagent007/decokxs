package com.okinc.okapm.okqpl.reporter;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.coroutines.Continuation;
import o.C42549rWz;
import o.C43285rmR;
import o.C43393roT;
import o.C56524yIo;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface QPLReportMetricApi {
    public static final Application Companion = Application.KWHzl;

    @POST("/umd/app/metric/apm/event")
    Object reportQPLEvents(@Header("token") @NotNull String str, @Header("ts") @NotNull String str2, @Header("userId") @NotNull String str3, @Header(OtcExtraKeys.PARAMS_SESSION_ID) @NotNull String str4, @Body @NotNull RequestBody requestBody, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super Response<Object>> continuation);

    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();

        private Application() {
        }

        public final QPLReportMetricApi EZpvd() {
            return (QPLReportMetricApi) C43393roT.EZpvd(C56524yIo.AEQbTJ(QPLReportMetricApi.class), C43285rmR.AEQbTJ);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public static /* synthetic */ Object reportQPLEvents$default(QPLReportMetricApi qPLReportMetricApi, String str, String str2, String str3, String str4, RequestBody requestBody, SubdomainStrategy subdomainStrategy, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return qPLReportMetricApi.reportQPLEvents(str, str2, str3, (i & 8) != 0 ? C42549rWz.copydefault() : str4, requestBody, (i & 32) != 0 ? SubdomainStrategy.Global.INSTANCE : subdomainStrategy, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportQPLEvents");
        }
    }
}
