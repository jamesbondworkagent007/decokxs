package com.okinc.localization.report;

import com.okinc.network.okg.cor.SubdomainStrategy;
import o.AbstractC58185ywX;
import o.C43285rmR;
import o.C43393roT;
import o.C56524yIo;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes9.dex */
public interface LocalizationReportApi {
    public static final Activity Companion = Activity.OLrzqt;
    public static final String PATH_APP_UPLOAD = "/priapi/v2/i18n/app/appupload";

    @POST(PATH_APP_UPLOAD)
    AbstractC58185ywX<ResponseBody> reportEvents(@Body @NotNull RequestBody requestBody, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    public static final class Activity {
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }

        public final LocalizationReportApi OLrzqt() {
            return (LocalizationReportApi) C43393roT.EZpvd(C56524yIo.AEQbTJ(LocalizationReportApi.class), C43285rmR.AEQbTJ);
        }
    }

    public static final class TaskDescription {
        public static /* synthetic */ AbstractC58185ywX reportEvents$default(LocalizationReportApi localizationReportApi, RequestBody requestBody, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportEvents");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return localizationReportApi.reportEvents(requestBody, subdomainStrategy);
        }
    }
}
