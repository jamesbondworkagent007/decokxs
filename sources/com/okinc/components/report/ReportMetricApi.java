package com.okinc.components.report;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes15.dex */
public interface ReportMetricApi {
    public static final ActionBar Companion = ActionBar.KWHzl;

    @POST("/umd/app/metric/event")
    AbstractC58185ywX<ResponseBody> reportEvent(@Header("token") @NotNull String str, @Header("ts") @NotNull String str2, @Header("userId") @NotNull String str3, @Header(OtcExtraKeys.SESSIONID) @NotNull String str4, @Body @NotNull RequestBody requestBody, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }

        public final ReportMetricApi AEQbTJ() {
            return (ReportMetricApi) C43393roT.EZpvd(C56524yIo.AEQbTJ(ReportMetricApi.class), C43415rop.AEQbTJ);
        }
    }

    public static final class TaskDescription {
        public static /* synthetic */ AbstractC58185ywX reportEvent$default(ReportMetricApi reportMetricApi, String str, String str2, String str3, String str4, RequestBody requestBody, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportEvent");
            }
            if ((i & 32) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return reportMetricApi.reportEvent(str, str2, str3, str4, requestBody, subdomainStrategy);
        }
    }
}
