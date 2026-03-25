package com.okinc.auth.impl.mfa.data;

import com.okinc.auth.api.service.MfaCheckResultRequest;
import com.okinc.auth.api.service.MfaCheckResultResponse;
import com.okinc.auth.api.service.MfaCreateSessionRequest;
import com.okinc.auth.api.service.MfaCreateSessionResponse;
import com.okinc.auth.impl.mfa.model.FinishAuthPasskeyRequest;
import com.okinc.auth.impl.mfa.model.MaxOutSupportRequest;
import com.okinc.auth.impl.mfa.model.MfaCreateFacialRequest;
import com.okinc.auth.impl.mfa.model.MfaCreateFacialResponse;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaRetrieveFacialRequest;
import com.okinc.auth.impl.mfa.model.SendCodeRequest;
import com.okinc.auth.impl.mfa.model.StartAuthPasskeyRequest;
import com.okinc.auth.impl.mfa.model.StartRequest;
import com.okinc.auth.impl.mfa.model.SwitchStepRequest;
import com.okinc.auth.impl.mfa.model.VerifyCodeRequest;
import com.okinc.auth.impl.mfa.model.VerifyPasswordRequest;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.C30370lVw;
import o.C56524yIo;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface MfaApiService {
    public static final TaskDescription Companion = TaskDescription.EZpvd;

    @POST("/v3/users/mobile/mfa-module/na/face-verify/max-out-support")
    Object AEQbTJ(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MaxOutSupportRequest maxOutSupportRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/face-verify/result")
    Object AEQbTJ(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MfaRetrieveFacialRequest mfaRetrieveFacialRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/send-code")
    Object AEQbTJ(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SendCodeRequest sendCodeRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/passkey/start")
    Object AEQbTJ(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull StartAuthPasskeyRequest startAuthPasskeyRequest, @NotNull Continuation<? super ResponseData<AuthenticationStartResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/switch-step")
    Object AEQbTJ(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SwitchStepRequest switchStepRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/verify-otp")
    Object AEQbTJ(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull VerifyCodeRequest verifyCodeRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/verify-pwd")
    Object AEQbTJ(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull VerifyPasswordRequest verifyPasswordRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/passkey/finish")
    Object EZpvd(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull FinishAuthPasskeyRequest finishAuthPasskeyRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/face-verify/max-out-support")
    Object EZpvd(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MaxOutSupportRequest maxOutSupportRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/face-verify/create")
    Object EZpvd(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MfaCreateFacialRequest mfaCreateFacialRequest, @NotNull Continuation<? super ResponseData<MfaCreateFacialResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/na/send-code")
    Object EZpvd(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SendCodeRequest sendCodeRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/mfa-module/passkey/start")
    Object EZpvd(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull StartAuthPasskeyRequest startAuthPasskeyRequest, @NotNull Continuation<? super ResponseData<AuthenticationStartResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/na/start")
    Object EZpvd(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull StartRequest startRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/na/verify-otp")
    Object EZpvd(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull VerifyCodeRequest verifyCodeRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/verify-pwd")
    Object EZpvd(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull VerifyPasswordRequest verifyPasswordRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa/check-result")
    Object KWHzl(@Body @NotNull MfaCheckResultRequest mfaCheckResultRequest, @NotNull Continuation<? super ResponseData<MfaCheckResultResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/face-verify/create")
    Object KWHzl(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MfaCreateFacialRequest mfaCreateFacialRequest, @NotNull Continuation<? super ResponseData<MfaCreateFacialResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/switch-step")
    Object KWHzl(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SwitchStepRequest switchStepRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/verify-otp")
    Object KWHzl(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull VerifyCodeRequest verifyCodeRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa/create-session")
    Object OLrzqt(@Body @NotNull MfaCreateSessionRequest mfaCreateSessionRequest, @NotNull Continuation<? super ResponseData<MfaCreateSessionResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/passkey/finish")
    Object OLrzqt(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull FinishAuthPasskeyRequest finishAuthPasskeyRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/na/face-verify/result")
    Object OLrzqt(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MfaRetrieveFacialRequest mfaRetrieveFacialRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/send-code")
    Object OLrzqt(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SendCodeRequest sendCodeRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/mfa-module/start")
    Object OLrzqt(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull StartRequest startRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/face-verify/max-out-support")
    Object copydefault(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MaxOutSupportRequest maxOutSupportRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/na/face-verify/create")
    Object copydefault(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MfaCreateFacialRequest mfaCreateFacialRequest, @NotNull Continuation<? super ResponseData<MfaCreateFacialResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/face-verify/result")
    Object copydefault(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull MfaRetrieveFacialRequest mfaRetrieveFacialRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    @POST("/v3/users/mobile/mfa-module/pa/start")
    Object copydefault(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull StartRequest startRequest, @NotNull Continuation<? super ResponseData<MfaResponse>> continuation);

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }

        public final MfaApiService AEQbTJ() {
            return (MfaApiService) C30370lVw.AEQbTJ(C56524yIo.AEQbTJ(MfaApiService.class), new Interceptor[0]);
        }
    }

    public static final class MfaApiServiceHiltModule {
        public final MfaApiService AEQbTJ() {
            return MfaApiService.Companion.AEQbTJ();
        }
    }
}
