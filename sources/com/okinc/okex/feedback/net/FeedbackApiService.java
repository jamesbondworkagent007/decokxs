package com.okinc.okex.feedback.net;

import com.google.common.net.HttpHeaders;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.feedback.net.bean.FeedbackBountySummaryBean;
import com.okinc.okex.feedback.net.bean.FileLimit;
import com.okinc.okex.feedback.net.bean.FileUpload;
import com.okinc.okex.feedback.net.bean.LoopholeListResp;
import com.okinc.okex.feedback.net.bean.LoopholeReq;
import com.okinc.okex.feedback.net.bean.LoopholeResp;
import com.okinc.okex.feedback.net.bean.MainCategory;
import com.okinc.okex.feedback.net.bean.ReceiptReq;
import com.okinc.okex.uploadlog.bean.FileUploadResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.C43393roT;
import o.C56524yIo;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface FeedbackApiService {
    public static final Application Companion = Application.OLrzqt;

    @POST("/v2/support/feedback/add")
    Object addLoophole(@Body @NotNull LoopholeReq loopholeReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v2/support/feedback/receipt")
    Object feedbackReceipt(@Body @NotNull ReceiptReq receiptReq, @NotNull Continuation<? super ResponseData<Integer>> continuation);

    @GET("/v2/support/feedback/getBounty")
    Object getFeedbackBountySummary(@NotNull Continuation<? super ResponseData<FeedbackBountySummaryBean>> continuation);

    @GET("/v2/support/feedback/category")
    Object getFeedbackCategory(@Query("type") int i, @NotNull Continuation<? super ResponseData<List<MainCategory>>> continuation);

    @GET("/v2/support/feedback/verify")
    Object getFeedbackVerifyNumber(@NotNull Continuation<? super ResponseData<Integer>> continuation);

    @GET("/v2/support/feedback/fileLimit")
    Object getFileLimit(@NotNull Continuation<? super ResponseData<FileLimit>> continuation);

    @GET("/v2/support/feedback/getLoopholeDetail")
    Object getLoopholeDetail(@Query("id") int i, @NotNull Continuation<? super ResponseData<LoopholeResp>> continuation);

    @GET("/v2/support/feedback/historyList")
    Object getLoopholeList(@Query("dateOrder") int i, @Query("type") int i2, @Query("status") Integer num, @Query("pageNum") int i3, @Query("pageSize") int i4, @NotNull Continuation<? super ResponseData<LoopholeListResp>> continuation);

    @POST("/v2/support/file/upload")
    @Multipart
    Object postFileUpload(@NotNull @Part MultipartBody.Part part, @NotNull @Part MultipartBody.Part part2, @NotNull Continuation<? super ResponseData<FileUploadResponse>> continuation);

    @POST("/v2/support/feedback/upload")
    @Multipart
    Object uploadImage(@Header(HttpHeaders.REFERER) @NotNull String str, @Header("Authorization") @NotNull String str2, @Header("x-utc") @NotNull String str3, @Header("devId") String str4, @NotNull @Part MultipartBody.Part part, @NotNull Continuation<? super ResponseData<FileUpload>> continuation);

    public static final class Application {
        public static final /* synthetic */ Application OLrzqt = new Application();

        private Application() {
        }

        public final FeedbackApiService EZpvd() {
            return (FeedbackApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(FeedbackApiService.class), null, 1, null);
        }
    }
}
