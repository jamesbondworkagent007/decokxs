package com.reown.android.pulse.data;

import com.reown.android.pulse.model.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes12.dex */
public interface PulseService {
    @Headers({"Content-Type: application/json"})
    @POST("/e")
    Object sendEvent(@Header("x-sdk-type") @NotNull String str, @Body @NotNull Event event, @NotNull Continuation<? super Response<Unit>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("/batch")
    Object sendEventBatch(@Header("x-sdk-type") @NotNull String str, @Body @NotNull List<Event> list, @NotNull Continuation<? super Response<Unit>> continuation);
}
