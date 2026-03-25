package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeAliTokenRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChinaAddressBean;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadAuthenticationResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormatCompleteAddresses;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupList;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormSubmissionBody;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorVerifyResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OkxGroupedValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OkxValues;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKycFormSubmissionBody;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OssImageUrlResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WCResultResp;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: o.ruR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43709ruR {
    public static final Activity Companion = Activity.EZpvd;

    @POST("/v3/comp/kyc/support/card/create-session-id")
    java.lang.Object AEQbTJ(@Body @NotNull CreateSessionIdRequest createSessionIdRequest, @NotNull Continuation<? super ResponseData<CreateSessionIdResponse>> continuation);

    @POST("/v3/users/kyc/support/callbackForClientUploadImage")
    java.lang.Object AEQbTJ(@Body @NotNull SingleFileUploadResultReq singleFileUploadResultReq, @NotNull Continuation<? super ResponseData<SingleFileUploadResultResp>> continuation);

    @POST("/v3/users/{featureUri}/onboarding/{playbook}")
    java.lang.Object AEQbTJ(@retrofit2.http.Path(encoded = true, value = "playbook") @NotNull java.lang.String str, @retrofit2.http.Path(encoded = true, value = "featureUri") @NotNull java.lang.String str2, @Body @NotNull OnDemandKycFormSubmissionBody onDemandKycFormSubmissionBody, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<OnDemandKYCResponse>> continuation);

    @GET("/v3/comp/kyc/support/cn/division")
    java.lang.Object AEQbTJ(@NotNull @Query(FirebaseAnalytics.Param.LEVEL) java.lang.String str, @Query("parentId") java.lang.String str2, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Strategy") java.lang.String str3, @Header("Cache-Token-Valid") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<java.util.ArrayList<ChinaAddressBean>>> continuation);

    @DELETE
    java.lang.Object AEQbTJ(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.ArrayList<FieldDisplay>>> continuation);

    @GET("/v3/comp/kyc/support/getInformation")
    java.lang.Object AEQbTJ(@NotNull @Query(OtcExtraKeys.SESSIONID) java.lang.String str, @NotNull Continuation<? super ResponseData<VendorConfig>> continuation);

    @POST("/v3/users/kyc/support/accountConflict/session")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<MergeAccountResponse>> continuation);

    @POST("/v3/comp/kyc/vendor/session/callback")
    AbstractC58185ywX<ResponseData<Unit>> AEQbTJ(@Body @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    @GET
    java.lang.Object AYXKKw(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<OkxValues>> continuation);

    @GET
    java.lang.Object AhwBna(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<OkxGroupedValue>> continuation);

    @POST("/v3/users/mobile/kyc/ali/token")
    java.lang.Object EZpvd(@Body @NotNull AccountMergeAliTokenRequest accountMergeAliTokenRequest, @NotNull Continuation<? super ResponseData<AlifaceTokenResp>> continuation);

    @POST
    java.lang.Object EZpvd(@Url @NotNull java.lang.String str, @Body @NotNull InfoFormSubmissionBody infoFormSubmissionBody, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.ArrayList<FieldDisplay>>> continuation);

    @GET("/v3/users/{featureUri}/onboarding")
    java.lang.Object EZpvd(@retrofit2.http.Path(encoded = true, value = "featureUri") @NotNull java.lang.String str, @NotNull @Query("playbook") java.lang.String str2, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<OnDemandKYCResponse>> continuation);

    @GET
    java.lang.Object EZpvd(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.HashMap<java.lang.String, ValueAndName>>> continuation);

    @GET("/v3/users/kyc/support/accountConflict/result")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<OnDemandKYCResponse>> continuation);

    @GET("/v3/users/kyc/support/clientBatchUploadImagesInit")
    java.lang.Object KWHzl(@Query("imageNum") int i, @NotNull Continuation<? super ResponseData<FilesUploadAuthenticationResp>> continuation);

    @POST("/v3/comp/kyc/support/encryptable/verify")
    java.lang.Object KWHzl(@Body @NotNull MultiVendorRequest multiVendorRequest, @Header("Encrypt-Strategy") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<MultiVendorVerifyResponse>> continuation);

    @POST("/v3/comp/kyc/support/verify")
    java.lang.Object KWHzl(@Body @NotNull MultiVendorRequest multiVendorRequest, @NotNull Continuation<? super ResponseData<MultiVendorVerifyResponse>> continuation);

    @POST("/v3/users/kyc/support/callbackForClientUploadImageOCR")
    java.lang.Object KWHzl(@Body @NotNull SingleFileUploadResultReq singleFileUploadResultReq, @NotNull Continuation<? super ResponseData<SingleFileUploadResultResp>> continuation);

    @GET
    java.lang.Object KWHzl(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<GroupList>> continuation);

    @GET("/v3/users/kyc/support/ali/result")
    java.lang.Object KWHzl(@Query("token") java.lang.String str, @NotNull Continuation<? super ResponseData<AlifaceResultResp>> continuation);

    @POST("/v3/users/kyc/support/callbackForClientBatchUploadImages")
    java.lang.Object KWHzl(@Body @NotNull java.util.List<SingleFileUploadResultReq> list, @NotNull Continuation<? super ResponseData<FilesUploadResultResp>> continuation);

    @GET("/v3/users/kyc/support/ali/token")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<AlifaceTokenResp>> continuation);

    @POST("/v3/comp/kyc/support/card/sync-result")
    java.lang.Object OLrzqt(@Body @NotNull CardSyncRequest cardSyncRequest, @NotNull Continuation<? super ResponseData<CardSyncResponse>> continuation);

    @GET
    java.lang.Object OLrzqt(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<FormatCompleteAddresses>>> continuation);

    @GET("/v3/users/kyc/support/alibabacloud/checkResult")
    java.lang.Object OLrzqt(@Query("transactionId") java.lang.String str, @NotNull Continuation<? super ResponseData<AlifaceResultResp>> continuation);

    @POST("/v3/users/kyc/progress/exit")
    java.lang.Object OLrzqt(@Body @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.lang.String>> continuation);

    @GET("/v3/comp/kyc/support/getSession")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<MultiVendorTokenResp>> continuation);

    @GET("/v3/users/kyc/support/getImageUrl")
    java.lang.Object copydefault(@Query("imageId") long j, @NotNull Continuation<? super ResponseData<OssImageUrlResp>> continuation);

    @POST
    java.lang.Object copydefault(@Url @NotNull java.lang.String str, @Body @NotNull InfoFormSubmissionBody infoFormSubmissionBody, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.ArrayList<FieldDisplay>>> continuation);

    @GET
    java.lang.Object copydefault(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<AutoCompleteAddresses>> continuation);

    @GET
    java.lang.Object djBIcL(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<Value>>> continuation);

    @GET
    java.lang.Object valueOf(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<WCResultResp>> continuation);

    /* JADX INFO: renamed from: o.ruR$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity EZpvd = new Activity();

        private Activity() {
        }

        public final InterfaceC43709ruR AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            return (InterfaceC43709ruR) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC43709ruR.class), new C43706ruO(str, map));
        }
    }

    /* JADX INFO: renamed from: o.ruR$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruR */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getOnboardingInfo$default(InterfaceC43709ruR interfaceC43709ruR, java.lang.String str, java.lang.String str2, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOnboardingInfo");
            }
            if ((i & 4) != 0) {
                map = new java.util.HashMap();
            }
            return interfaceC43709ruR.EZpvd(str, str2, (java.util.Map<java.lang.String, java.lang.String>) map, (Continuation<? super ResponseData<OnDemandKYCResponse>>) continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.ruR */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object postOnboardingInfo$default(InterfaceC43709ruR interfaceC43709ruR, java.lang.String str, java.lang.String str2, OnDemandKycFormSubmissionBody onDemandKycFormSubmissionBody, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnboardingInfo");
            }
            if ((i & 8) != 0) {
                map = new java.util.HashMap();
            }
            return interfaceC43709ruR.AEQbTJ(str, str2, onDemandKycFormSubmissionBody, map, continuation);
        }

        public static /* synthetic */ java.lang.Object getMultiVendorInformation$default(InterfaceC43709ruR interfaceC43709ruR, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMultiVendorInformation");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return interfaceC43709ruR.AEQbTJ(str, (Continuation<? super ResponseData<VendorConfig>>) continuation);
        }

        public static /* synthetic */ java.lang.Object postEncryptVerify$default(InterfaceC43709ruR interfaceC43709ruR, MultiVendorRequest multiVendorRequest, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postEncryptVerify");
            }
            if ((i & 2) != 0) {
                str = "TIME";
            }
            return interfaceC43709ruR.KWHzl(multiVendorRequest, str, (Continuation<? super ResponseData<MultiVendorVerifyResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getAlifaceResult$default(InterfaceC43709ruR interfaceC43709ruR, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAlifaceResult");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC43709ruR.KWHzl(str, (Continuation<? super ResponseData<AlifaceResultResp>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getAlifaceGlobalResult$default(InterfaceC43709ruR interfaceC43709ruR, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAlifaceGlobalResult");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC43709ruR.OLrzqt(str, (Continuation<? super ResponseData<AlifaceResultResp>>) continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruR */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object addInfoFormEntry$default(InterfaceC43709ruR interfaceC43709ruR, java.lang.String str, InfoFormSubmissionBody infoFormSubmissionBody, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addInfoFormEntry");
            }
            if ((i & 4) != 0) {
                map = new java.util.HashMap();
            }
            return interfaceC43709ruR.copydefault(str, infoFormSubmissionBody, map, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruR */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object updateInfoFormEntry$default(InterfaceC43709ruR interfaceC43709ruR, java.lang.String str, InfoFormSubmissionBody infoFormSubmissionBody, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateInfoFormEntry");
            }
            if ((i & 4) != 0) {
                map = new java.util.HashMap();
            }
            return interfaceC43709ruR.EZpvd(str, infoFormSubmissionBody, (java.util.Map<java.lang.String, java.lang.String>) map, (Continuation<? super ResponseData<java.util.ArrayList<FieldDisplay>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getChinaAddresses$default(InterfaceC43709ruR interfaceC43709ruR, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChinaAddresses");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                num = Integer.MAX_VALUE;
            }
            java.lang.Integer num3 = num;
            if ((i & 8) != 0) {
                str3 = "FIRST_CACHE";
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                num2 = 1;
            }
            return interfaceC43709ruR.AEQbTJ(str, str4, num3, str5, num2, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruR */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object kycProgressExit$default(InterfaceC43709ruR interfaceC43709ruR, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: kycProgressExit");
            }
            if ((i & 1) != 0) {
                map = new java.util.HashMap();
            }
            return interfaceC43709ruR.OLrzqt((java.util.Map<java.lang.String, java.lang.String>) map, (Continuation<? super ResponseData<java.lang.String>>) continuation);
        }
    }
}
