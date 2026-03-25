package o;

import com.okinc.kyc.api.biz.bean.BannerModelBean;
import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FinalConsentReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HomeNotifyResultReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UrlVendorResultResp;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeAvailableBean;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderGroupBean;
import com.okinc.ok_kyc_core_api.model.UrlVendorTokenResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: o.ruK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43702ruK {
    public static final Activity Companion = Activity.OLrzqt;

    @GET("/v3/users/mobile/kyc/infos")
    java.lang.Object AEQbTJ(@NotNull @Query("version") java.lang.String str, @Header("Cache-Strategy") java.lang.String str2, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Token-Valid") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<KycInfoListBean>> continuation);

    @GET
    java.lang.Object AEQbTJ(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<UrlVendorResultResp>> continuation);

    @GET("/v3/comp/travelRule/exchangeList")
    AbstractC58185ywX<ResponseData<java.util.ArrayList<ExchangeReminderGroupBean>>> AEQbTJ();

    @POST("/v3/users/kyc/final/consent")
    AbstractC58185ywX<ResponseData<java.lang.Object>> EZpvd(@Body @NotNull FinalConsentReq finalConsentReq);

    @GET("/v3/users/kyc/riskStatus")
    AbstractC58185ywX<ResponseData<CheckUKRiskStatusResponse>> EZpvd(@Query("hasEnoughAsset") java.lang.Boolean bool, @Query("type") java.lang.String str);

    @GET("/v3/comp/kyc/platform/getBannerContent")
    AbstractC58185ywX<ResponseData<java.util.ArrayList<BannerModelBean>>> KWHzl();

    @GET("/v3/comp/kyc/platform/getBannerContent")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.ArrayList<BannerModelBean>>> continuation);

    @GET("/v3/comp/travelRule/exchange/available")
    AbstractC58185ywX<ResponseData<ExchangeAvailableBean>> OLrzqt(@Query("exchangeId") long j);

    @GET("/v3/comp/kyc/vendor/transaction/start")
    AbstractC58185ywX<ResponseData<UrlVendorTokenResp>> OLrzqt(@NotNull @Query("transactionId") java.lang.String str);

    @POST("/v3/users/kyc/support/homepage/notifycallback")
    AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@Body @NotNull HomeNotifyResultReq homeNotifyResultReq);

    @POST("/v3/comp/kyc/vendor/transaction/callback")
    AbstractC58185ywX<ResponseData<Unit>> copydefault(@Body @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    /* JADX INFO: renamed from: o.ruK$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.ruK$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC43702ruK getInstance$default(Activity activity, java.lang.String str, java.util.HashMap map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return activity.copydefault(str, map);
        }

        public final InterfaceC43702ruK copydefault(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map) {
            if (str != null && map != null) {
                return (InterfaceC43702ruK) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC43702ruK.class), new C43706ruO(str, map));
            }
            return (InterfaceC43702ruK) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC43702ruK.class), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.ruK$Application */
    public static final class Application {
        public static /* synthetic */ java.lang.Object getKycInfoData$default(InterfaceC43702ruK interfaceC43702ruK, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKycInfoData");
            }
            if ((i & 2) != 0) {
                str2 = "NO_CACHE";
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                num = Integer.MAX_VALUE;
            }
            java.lang.Integer num3 = num;
            if ((i & 8) != 0) {
                num2 = 1;
            }
            return interfaceC43702ruK.AEQbTJ(str, str3, num3, num2, continuation);
        }

        public static /* synthetic */ AbstractC58185ywX checkUKRiskStatus$default(InterfaceC43702ruK interfaceC43702ruK, java.lang.Boolean bool, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUKRiskStatus");
            }
            if ((i & 1) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC43702ruK.EZpvd(bool, str);
        }
    }
}
