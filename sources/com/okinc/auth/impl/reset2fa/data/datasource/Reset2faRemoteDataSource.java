package com.okinc.auth.impl.reset2fa.data.datasource;

import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateRequest;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaPreconditionResponse;
import com.okinc.auth.api.reset2fa.data.model.SendEmailCodeForRebind2faRequest;
import com.okinc.auth.api.reset2fa.data.model.SendSMSForRebind2faRequest;
import com.okinc.auth.api.reset2fa.data.model.SubmitRebindMfaRequest;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.C56524yIo;
import o.C8215ayY;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
public interface Reset2faRemoteDataSource {
    public static final Activity Companion = Activity.OLrzqt;

    @GET("/v3/users/mobile/non-auth/reset-2fa/pre-condition/v2")
    Object nonAuthPrecondition(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @NotNull @Query("token") String str, @NotNull Continuation<? super ResponseData<ResetMfaPreconditionResponse>> continuation);

    @POST("/v3/users/mobile/non-auth/reset-2fa/initiate/v2")
    Object nonAuthReset2faInitiateV2(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull ResetMfaInitiateRequest resetMfaInitiateRequest, @NotNull Continuation<? super ResponseData<ResetMfaInitiateResponse>> continuation);

    @POST("/v3/users/mobile/non-auth/reset-2fa/link-new-mfa")
    Object nonAuthSubmit(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SubmitRebindMfaRequest submitRebindMfaRequest, @NotNull Continuation<? super ResponseData<Object>> continuation);

    @GET("/v3/users/mobile/reset-2fa/pre-condition")
    Object precondition(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super ResponseData<ResetMfaPreconditionResponse>> continuation);

    @POST("/v3/users/mobile/reset-2fa/initiate")
    Object reset2faInitiate(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull ResetMfaInitiateRequest resetMfaInitiateRequest, @NotNull Continuation<? super ResponseData<ResetMfaInitiateResponse>> continuation);

    @POST("/v3/users/mobile/code-auth/send-email")
    Object sendEmailOtp(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SendEmailCodeForRebind2faRequest sendEmailCodeForRebind2faRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/code/send-msg")
    Object sendForgetPasswordReset2FaPhoneOtp(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SendSMSForRebind2faRequest sendSMSForRebind2faRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/code/send-email")
    Object sendForgetPasswordResetMfaEmailOtp(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SendEmailCodeForRebind2faRequest sendEmailCodeForRebind2faRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/code-auth/send-msg")
    Object sendPhoneOtp(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SendSMSForRebind2faRequest sendSMSForRebind2faRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/reset-2fa/link-new-mfa")
    Object submit(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull SubmitRebindMfaRequest submitRebindMfaRequest, @NotNull Continuation<? super ResponseData<Object>> continuation);

    public static final class Activity {
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }

        public final Reset2faRemoteDataSource AEQbTJ() {
            return (Reset2faRemoteDataSource) C8215ayY.EZpvd(C56524yIo.AEQbTJ(Reset2faRemoteDataSource.class), new Interceptor[0]);
        }
    }

    public static final class Rebind2faRemoteDataSourceModule {
        public final Reset2faRemoteDataSource AEQbTJ() {
            return Reset2faRemoteDataSource.Companion.AEQbTJ();
        }
    }
}
