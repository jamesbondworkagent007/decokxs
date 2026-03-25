package o;

import com.okinc.business.web3pay.lib.features.account.data.model.AccountInfoApiModel;
import com.okinc.business.web3pay.lib.features.account.data.model.CheckUserStatusResponse;
import com.okinc.business.web3pay.lib.features.account.data.model.CreateMfaSessionRequest;
import com.okinc.business.web3pay.lib.features.account.data.model.CreatePayUniversalLinkRequest;
import com.okinc.business.web3pay.lib.features.account.data.model.CreateSessionResponse;
import com.okinc.business.web3pay.lib.features.account.data.model.CreateSmartAccountResponse;
import com.okinc.business.web3pay.lib.features.account.data.model.GetKycNameResponse;
import com.okinc.business.web3pay.lib.features.account.data.model.UserKycInfoResponse;
import com.okinc.business.web3pay.lib.features.account.model.AvailableArea;
import com.okinc.business.web3pay.lib.features.account.model.RecoverEmailData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.lqt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31274lqt {
    @GET("/priapi/v5/smart-account/v1/user/judge-email")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<RecoverEmailData>> continuation);

    @POST("/priapi/v5/smart-account/mfa/create-session")
    java.lang.Object EZpvd(@Body @NotNull CreateMfaSessionRequest createMfaSessionRequest, @NotNull Continuation<? super ResponseData<CreateSessionResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/tool/create-universal-link")
    java.lang.Object EZpvd(@Body @NotNull CreatePayUniversalLinkRequest createPayUniversalLinkRequest, @NotNull Continuation<? super ResponseData<java.lang.String>> continuation);

    @POST("/priapi/v5/smart-account/user/create-account")
    java.lang.Object EZpvd(@Body @NotNull JsonObject jsonObject, @NotNull Continuation<? super ResponseData<CreateSmartAccountResponse>> continuation);

    @GET("/priapi/v5/smart-account/user/getUserKycInfo")
    java.lang.Object KWHzl(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<UserKycInfoResponse>> continuation);

    @GET("/priapi/v5/smart-account/user/info")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<AccountInfoApiModel>> continuation);

    @GET("/priapi/v5/smart-account/user/check-user-status")
    java.lang.Object copydefault(@Query("checkFreeze") java.lang.Boolean bool, @Query("checkCefi") java.lang.Boolean bool2, @Query("checkEmail") java.lang.Boolean bool3, @Query("checkIp") java.lang.Boolean bool4, @NotNull Continuation<? super ResponseData<CheckUserStatusResponse>> continuation);

    @GET("/priapi/v5/smart-account/v1/user/preview")
    java.lang.Object copydefault(@NotNull @Query("contactType") java.lang.String str, @NotNull @Query("contactValue") java.lang.String str2, @Query("areaCode") java.lang.String str3, @NotNull Continuation<? super ResponseData<GetKycNameResponse>> continuation);

    @GET("/priapi/v5/smart-account/transfer/available-area-codes")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<AvailableArea>>> continuation);

    /* JADX INFO: renamed from: o.lqt$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object getUserKycInfo$default(InterfaceC31274lqt interfaceC31274lqt, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserKycInfo");
            }
            if ((i2 & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 2) != 0) {
                i = 300;
            }
            return interfaceC31274lqt.KWHzl(str, i, continuation);
        }

        public static /* synthetic */ java.lang.Object createSmartAccount$default(InterfaceC31274lqt interfaceC31274lqt, JsonObject jsonObject, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSmartAccount");
            }
            if ((i & 1) != 0) {
                jsonObject = new JsonObjectBuilder().build();
            }
            return interfaceC31274lqt.EZpvd(jsonObject, (Continuation<? super ResponseData<CreateSmartAccountResponse>>) continuation);
        }
    }
}
