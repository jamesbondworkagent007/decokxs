package com.okinc.auth.impl.passkey.data;

import com.okinc.account.api.model.social.SocialEligibilityResponse;
import com.okinc.auth.api.passkey.InitiateMfaSessionResponse;
import com.okinc.auth.api.passkey.TargetDeviceVerificationInfo;
import com.okinc.auth.impl.mfa.model.FinishCrossDeviceVerificationRequest;
import com.okinc.auth.impl.mfa.model.StartCrossDeviceVerificationRequest;
import com.okinc.auth.impl.passkey.model.AuthSendEmailOTPRequest;
import com.okinc.auth.impl.passkey.model.AuthSendSMSRequest;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.model.DecisionInHouseAuthenticationRequest;
import com.okinc.auth.impl.passkey.model.DexAccountStatusResponse;
import com.okinc.auth.impl.passkey.model.DexFinishAuthenticationRequest;
import com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationRequest;
import com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationResponse;
import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import com.okinc.auth.impl.passkey.model.PasskeyFinishUpgradeRequestBody;
import com.okinc.auth.impl.passkey.model.PasskeyMfaInitRequest;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishRequestBody;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse;
import com.okinc.auth.impl.passkey.model.PasskeyRebindStartRequestBody;
import com.okinc.auth.impl.passkey.model.PasskeyRegistrationFinishRequestBody;
import com.okinc.auth.impl.passkey.model.PasskeyRegistrationStartRequestBody;
import com.okinc.auth.impl.passkey.model.PasskeyRemovalRequest;
import com.okinc.auth.impl.passkey.model.PasskeyResetInitRequest;
import com.okinc.auth.impl.passkey.model.PasskeyResetStatusResponse;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.auth.impl.passkey.model.RegistrationInitiateResponse;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.auth.impl.passkey.model.ResetMfaInitiateResponse;
import com.okinc.auth.impl.passkey.model.StartInHouseAuthenticationRequest;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.C56524yIo;
import o.C5986aGn;
import o.C5989aGq;
import o.C5993aGu;
import o.C5994aGv;
import o.C5996aGx;
import o.C8215ayY;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
public interface PasskeyApiService {
    public static final TaskDescription Companion = TaskDescription.KWHzl;

    @GET("/v3/users/mobile/support/common/social-login-eligibility")
    Object checkSocialLoginEligibility(@Header("Cache-Expire") int i, @Header("Cache-Strategy") @NotNull String str, @NotNull Continuation<? super ResponseData<SocialEligibilityResponse>> continuation);

    @POST("/v3/users/mobile/passkey/in-house/decision-making")
    Object decisionInHouseAuthentication(@Body @NotNull DecisionInHouseAuthenticationRequest decisionInHouseAuthenticationRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/dex-passkeys/authentication/finish")
    Object dexFinishAuthentication(@Body @NotNull DexFinishAuthenticationRequest dexFinishAuthenticationRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/dex-passkeys/registration/finish")
    Object dexFinishRegistration(@Body @NotNull PasskeyRegistrationFinishRequestBody passkeyRegistrationFinishRequestBody, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/dex-passkeys/reg-pre-condition")
    Object dexRegistrationPrecondition(@NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/dex-passkeys/authentication/start")
    Object dexStartAuthentication(@NotNull Continuation<? super ResponseData<AuthenticationStartResponse>> continuation);

    @POST("/v3/users/mobile/dex-passkeys/registration/start")
    Object dexStartRegistration(@Body @NotNull PasskeyRegistrationStartRequestBody passkeyRegistrationStartRequestBody, @NotNull Continuation<? super ResponseData<RegistrationStartResponse>> continuation);

    @POST("/v3/users/mobile/passkey/in-house/cross-device-verification/finish")
    Object finishCrossDeviceVerification(@Body @NotNull FinishCrossDeviceVerificationRequest finishCrossDeviceVerificationRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/passkey/in-house/authentication/finish")
    Object finishInHouseAuthentication(@Body @NotNull FinishInHouseAuthenticationRequest finishInHouseAuthenticationRequest, @NotNull Continuation<? super ResponseData<FinishInHouseAuthenticationResponse>> continuation);

    @POST("/v3/users/mobile/passkey/reset/rebind/finish")
    Object finishRebind(@Body @NotNull PasskeyRebindFinishRequestBody passkeyRebindFinishRequestBody, @NotNull Continuation<? super ResponseData<PasskeyRebindFinishResponse>> continuation);

    @POST("/v3/users/mobile/passkey/registration/finish")
    Object finishRegistration(@Body @NotNull PasskeyRegistrationFinishRequestBody passkeyRegistrationFinishRequestBody, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/v3/users/mobile/okx-pay/unlock/authType")
    Object getAuthenticationTypeForOkxPay(@NotNull Continuation<? super ResponseData<GetAuthenticationTypeResponse>> continuation);

    @GET("/v3/users/mobile/fido/management/authenticators")
    Object getAuthenticatorList(@NotNull Continuation<? super ResponseData<GetAuthenticatorListResponse>> continuation);

    @GET("/v3/users/mobile/okx-pay/management/authenticators")
    Object getAuthenticatorListForOkxPay(@Header("Cache-Expire") int i, @Header("Cache-Strategy") @NotNull String str, @NotNull Continuation<? super ResponseData<GetAuthenticatorListResponse>> continuation);

    @GET("/v3/users/mobile/passkey/in-house/cross-device-info")
    Object getCrossDeviceVerificationInfo(@NotNull @Query("crossDevicePasskeySessionId") String str, @NotNull Continuation<? super ResponseData<TargetDeviceVerificationInfo>> continuation);

    @GET("/v3/users/mobile/dex-passkeys/account-status")
    Object getDexAccountStatus(@NotNull Continuation<? super ResponseData<DexAccountStatusResponse>> continuation);

    @GET("/v3/users/mobile/dex-passkeys/has-available-passkeys")
    Object getDexHasAvailablePasskey(@NotNull Continuation<? super ResponseData<Boolean>> continuation);

    @GET("/v3/users/mobile/passkey/reset/status")
    Object getResetStatus(@NotNull Continuation<? super ResponseData<PasskeyResetStatusResponse>> continuation);

    @POST("/v3/users/mobile/okx-pay/unlock/token")
    Object getUnlockTokenForOkxPay(@Body @NotNull C5996aGx c5996aGx, @NotNull Continuation<? super ResponseData<Object>> continuation);

    @POST("/v3/users/mobile/okx-pay/unlock/mfa/token")
    Object getUnlockTokenForOkxPayFromMfa(@Body @NotNull C5993aGu c5993aGu, @NotNull Continuation<? super ResponseData<UnlockTokenResponse>> continuation);

    @GET("/v3/users/mobile/okx-pay/unlock/initiate")
    Object initiateOkxPayRegistration(@NotNull Continuation<? super ResponseData<RegistrationInitiateResponse>> continuation);

    @POST("/v3/users/mobile/passkey/mgt/mfa/init")
    Object mfaInit(@Body @NotNull PasskeyMfaInitRequest passkeyMfaInitRequest, @NotNull Continuation<? super ResponseData<InitiateMfaSessionResponse>> continuation);

    @POST("/v3/users/mobile/passkey/in-house/upgrade/finish")
    Object okxPasskeyFinishUpgrade(@Body @NotNull PasskeyFinishUpgradeRequestBody passkeyFinishUpgradeRequestBody, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/fido/unlock/token/start")
    Object prepareUnlockTokenWithFido(@NotNull Continuation<? super ResponseData<AuthenticationStartResponse>> continuation);

    @POST("/v3/users/mobile/passkey/mgt/remove")
    Object remove(@Body @NotNull PasskeyRemovalRequest passkeyRemovalRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/fido/management/rename")
    Object rename(@Body @NotNull C5986aGn c5986aGn, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/okx-pay/management/rename")
    Object renameAuthenticatorForOkxPay(@Body @NotNull C5986aGn c5986aGn, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/passkey/reset/init")
    Object resetInit(@Body @NotNull PasskeyResetInitRequest passkeyResetInitRequest, @NotNull Continuation<? super ResponseData<ResetMfaInitiateResponse>> continuation);

    @POST("/v3/users/mobile/code-auth/send-email")
    Object sendEmailOtp(@Body @NotNull AuthSendEmailOTPRequest authSendEmailOTPRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/code-auth/send-msg")
    Object sendPhoneOtp(@Body @NotNull AuthSendSMSRequest authSendSMSRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/passkey/in-house/cross-device-verification/start")
    Object startCrossDeviceVerification(@Body @NotNull StartCrossDeviceVerificationRequest startCrossDeviceVerificationRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/passkey/in-house/authentication/start")
    Object startInHouseAuthentication(@Body @NotNull StartInHouseAuthenticationRequest startInHouseAuthenticationRequest, @NotNull Continuation<? super ResponseData<AuthenticationStartResponse>> continuation);

    @POST("/v3/users/mobile/okx-pay/registration/start")
    Object startOkxPayRegistration(@Body @NotNull C5989aGq c5989aGq, @NotNull Continuation<? super ResponseData<RegistrationStartResponse>> continuation);

    @POST("/v3/users/mobile/passkey/reset/rebind/start")
    Object startRebind(@Body @NotNull PasskeyRebindStartRequestBody passkeyRebindStartRequestBody, @NotNull Continuation<? super ResponseData<RegistrationStartResponse>> continuation);

    @POST("/v3/users/mobile/passkey/registration/start")
    Object startRegistration(@Body @NotNull PasskeyRegistrationStartRequestBody passkeyRegistrationStartRequestBody, @NotNull Continuation<? super ResponseData<RegistrationStartResponse>> continuation);

    @POST("/v3/users/mobile/okx-pay/management/unlink")
    Object unlinkAuthenticatorForOkxPay(@Body @NotNull C5994aGv c5994aGv, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/okx-pay/registration/finish")
    Object validateOkxPayRegistration(@Body @NotNull RegistrationFinishBody registrationFinishBody, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }

        public final PasskeyApiService OLrzqt() {
            return (PasskeyApiService) C8215ayY.EZpvd(C56524yIo.AEQbTJ(PasskeyApiService.class), new Interceptor[0]);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public static /* synthetic */ Object checkSocialLoginEligibility$default(PasskeyApiService passkeyApiService, int i, String str, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkSocialLoginEligibility");
            }
            if ((i2 & 1) != 0) {
                i = 2;
            }
            if ((i2 & 2) != 0) {
                str = "FIRST_CACHE";
            }
            return passkeyApiService.checkSocialLoginEligibility(i, str, continuation);
        }

        public static /* synthetic */ Object getAuthenticatorListForOkxPay$default(PasskeyApiService passkeyApiService, int i, String str, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAuthenticatorListForOkxPay");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            if ((i2 & 2) != 0) {
                str = "FIRST_CACHE";
            }
            return passkeyApiService.getAuthenticatorListForOkxPay(i, str, continuation);
        }
    }

    public static final class PasskeyApiServiceHiltModule {
        public final PasskeyApiService OLrzqt() {
            return PasskeyApiService.Companion.OLrzqt();
        }
    }
}
