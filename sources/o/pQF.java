package o;

import com.okinc.liveness.eop.bean.AwsSessionResultResp;
import com.okinc.liveness.eop.bean.FacialVerifyReqBody;
import com.okinc.liveness.eop.bean.LivenessRouterRequest;
import com.okinc.liveness.eop.bean.LivenessRouterResp;
import com.okinc.liveness.eop.bean.LivenessSessionInfoRequest;
import com.okinc.liveness.eop.bean.LivenessSessionInfoResp;
import com.okinc.liveness.eop.bean.LivenessSessionResultRequest;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core_api.facial.FacialInfoResult;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes9.dex */
public interface pQF {
    public static final Activity Companion = Activity.OLrzqt;

    @POST("/v3/comp/kyc/support/liveness/router")
    java.lang.Object AEQbTJ(@Body @NotNull LivenessRouterRequest livenessRouterRequest, @HeaderMap java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<LivenessRouterResp>> continuation);

    @POST("/v3/comp/kyc/support/liveness/get-result")
    java.lang.Object EZpvd(@Body @NotNull LivenessSessionResultRequest livenessSessionResultRequest, @HeaderMap java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<AwsSessionResultResp>> continuation);

    @POST("/v3/comp/facialVerification/verify")
    java.lang.Object KWHzl(@Body @NotNull FacialVerifyReqBody facialVerifyReqBody, @HeaderMap java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<FacialInfoResult>> continuation);

    @POST("/v3/comp/kyc/support/liveness/get-result")
    java.lang.Object KWHzl(@Body @NotNull LivenessSessionResultRequest livenessSessionResultRequest, @HeaderMap java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<AwsSessionResultResp>> continuation);

    @POST("/v3/comp/kyc/support/liveness/get-session-id")
    java.lang.Object OLrzqt(@Body @NotNull LivenessSessionInfoRequest livenessSessionInfoRequest, @HeaderMap java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<LivenessSessionInfoResp>> continuation);

    public static final class Activity {
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }

        public final pQF OLrzqt() {
            return (pQF) C43393roT.httpService$default(C56524yIo.AEQbTJ(pQF.class), null, 1, null);
        }
    }
}
