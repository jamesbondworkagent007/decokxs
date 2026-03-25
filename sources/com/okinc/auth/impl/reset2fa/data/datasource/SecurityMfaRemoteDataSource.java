package com.okinc.auth.impl.reset2fa.data.datasource;

import com.okinc.auth.api.service.NonAuthMfaCheckResultRequest;
import com.okinc.auth.api.service.NonAuthMfaCheckResultResponse;
import com.okinc.auth.api.service.NonAuthMfaCreateSessionRequest;
import com.okinc.auth.api.service.NonAuthMfaCreateSessionResponse;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCheckResultRequest;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCheckResultResponse;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCreateSessionRequest;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCreateSessionResponse;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import o.C56524yIo;
import o.C8215ayY;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface SecurityMfaRemoteDataSource {
    public static final StateListAnimator Companion = StateListAnimator.copydefault;

    @POST("/v3/users/mobile/mfa/na/check-result")
    Object nonAuthCheckResult(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull NonAuthMfaCheckResultRequest nonAuthMfaCheckResultRequest, @NotNull Continuation<? super ResponseData<NonAuthMfaCheckResultResponse>> continuation);

    @POST("/v3/users/mobile/mfa/na/create-session")
    Object nonAuthCreateSession(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull NonAuthMfaCreateSessionRequest nonAuthMfaCreateSessionRequest, @NotNull Continuation<? super ResponseData<NonAuthMfaCreateSessionResponse>> continuation);

    @POST("/v3/users/mobile/mfa/pa/check-result")
    Object partialAuthCheckResult(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull PartialAuthMfaCheckResultRequest partialAuthMfaCheckResultRequest, @NotNull Continuation<? super ResponseData<PartialAuthMfaCheckResultResponse>> continuation);

    @POST("/v3/users/mobile/mfa/pa/create-session")
    Object partialAuthCreateSession(@Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy, @Body @NotNull PartialAuthMfaCreateSessionRequest partialAuthMfaCreateSessionRequest, @NotNull Continuation<? super ResponseData<PartialAuthMfaCreateSessionResponse>> continuation);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }

        public final SecurityMfaRemoteDataSource KWHzl() {
            return (SecurityMfaRemoteDataSource) C8215ayY.EZpvd(C56524yIo.AEQbTJ(SecurityMfaRemoteDataSource.class), new Interceptor[0]);
        }
    }

    public static final class SecurityMfaRemoteDataSourceHiltModule {
        public final SecurityMfaRemoteDataSource KWHzl() {
            return SecurityMfaRemoteDataSource.Companion.KWHzl();
        }
    }
}
