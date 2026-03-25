package com.reown.android.verify.data;

import com.reown.android.verify.model.Origin;
import com.reown.android.verify.model.RegisterAttestationBody;
import com.reown.android.verify.model.VerifyServerPublicKey;
import com.reown.android.verify.model.VerifyServerResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
public interface VerifyService {
    @GET("v2/public-key")
    Object getPublicKey(@NotNull Continuation<? super Response<VerifyServerPublicKey>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("attestation")
    Object registerAttestation(@Body @NotNull RegisterAttestationBody registerAttestationBody, @NotNull Continuation<? super Response<VerifyServerResponse.RegisterAttestation>> continuation);

    @Headers({"Content-Type: application/json"})
    @GET("attestation/{attestationId}?v2Supported=true")
    Object resolveAttestation(@Path("attestationId") @NotNull String str, @NotNull Continuation<? super Response<Origin>> continuation);
}
