package com.okinc.auth.impl.facerecognition.data;

import com.okinc.auth.impl.facerecognition.model.FaceRecognitionResultRequest;
import com.okinc.auth.impl.facerecognition.model.FaceRecognitionResultResponse;
import com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import o.C30370lVw;
import o.C56524yIo;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
public interface FaceRecognitionApiService {
    public static final Application Companion = Application.AEQbTJ;

    @POST("/v3/users/mobile/common/face-verify/overseas/result")
    Object AEQbTJ(@Header("Subdomain-Strategy") String str, @Body @NotNull FaceRecognitionResultRequest faceRecognitionResultRequest, @NotNull Continuation<? super ResponseData<FaceRecognitionResultResponse>> continuation);

    @GET("/v3/users/mobile/common/face-verify/overseas/create")
    Object EZpvd(@Header("Subdomain-Strategy") String str, @Query("businessId") int i, @Query("businessRecordId") String str2, @NotNull Continuation<? super ResponseData<FaceVerifyCreateSessionResponse>> continuation);

    public static final class Application {
        public static final /* synthetic */ Application AEQbTJ = new Application();

        private Application() {
        }

        public final FaceRecognitionApiService AEQbTJ() {
            return (FaceRecognitionApiService) C30370lVw.AEQbTJ(C56524yIo.AEQbTJ(FaceRecognitionApiService.class), new Interceptor[0]);
        }
    }

    public static final class FaceRecognitionApiServiceHiltModule {
        public final FaceRecognitionApiService EZpvd() {
            return FaceRecognitionApiService.Companion.AEQbTJ();
        }
    }
}
