package com.okinc.network.okg.log;

import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import o.AbstractC58185ywX;
import o.C43393roT;
import o.C43415rop;
import o.C56524yIo;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes9.dex */
public interface NetEventMetricApi {
    public static final StateListAnimator Companion = StateListAnimator.AEQbTJ;

    @POST("/umd/app/metric/doh/link")
    Object reportDOHLinkEvent(@Header("token") @NotNull String str, @Header("ts") @NotNull String str2, @Header("userId") @NotNull String str3, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super ResponseBody> continuation);

    @POST("/umd/app/metric/latency")
    AbstractC58185ywX<ResponseBody> reportNetEvents(@Header("token") @NotNull String str, @Header("ts") @NotNull String str2, @Header("userId") @NotNull String str3, @Body @NotNull RequestBody requestBody, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }

        public final NetEventMetricApi OLrzqt() {
            return (NetEventMetricApi) C43393roT.EZpvd(C56524yIo.AEQbTJ(NetEventMetricApi.class), C43415rop.AEQbTJ);
        }
    }

    public static final class ActionBar {
        public static /* synthetic */ AbstractC58185ywX reportNetEvents$default(NetEventMetricApi netEventMetricApi, String str, String str2, String str3, RequestBody requestBody, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportNetEvents");
            }
            if ((i & 16) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return netEventMetricApi.reportNetEvents(str, str2, str3, requestBody, subdomainStrategy);
        }

        public static /* synthetic */ Object reportDOHLinkEvent$default(NetEventMetricApi netEventMetricApi, String str, String str2, String str3, SubdomainStrategy subdomainStrategy, RequestBody requestBody, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDOHLinkEvent");
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return netEventMetricApi.reportDOHLinkEvent(str, str2, str3, subdomainStrategy, requestBody, continuation);
        }
    }
}
