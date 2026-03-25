package com.okinc.liveness.lca.debugtool.data;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C43393roT;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes19.dex */
public interface LcaDebugHttpApiService {
    public static final Companion Companion = Companion.$$INSTANCE;

    @POST("lightcaptcha/config/get")
    Object getConfig(@Body @NotNull LcaJwstGetConfigRequest lcaJwstGetConfigRequest, @NotNull Continuation<? super ResponseData<LcaSdkLivenessConfig>> continuation);

    @POST("lightcaptcha/ws-session-id/get")
    Object getWsSessionId(@Body @NotNull LcaJwstWsSessionIdRequest lcaJwstWsSessionIdRequest, @NotNull Continuation<? super ResponseData<LcaJwstWsSessionIdData>> continuation);

    @POST("lightcaptcha/result/query")
    Object queryResult(@Body @NotNull LcaJwstQueryResultRequest lcaJwstQueryResultRequest, @NotNull Continuation<? super ResponseData<LcaJwstQueryResultData>> continuation);

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final LcaDebugHttpApiService getInstance(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return (LcaDebugHttpApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(LcaDebugHttpApiService.class), new LcaRequestConfig(str));
        }
    }
}
