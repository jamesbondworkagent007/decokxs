package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.common.bean.UnifiedEntranceRequest;
import com.okinc.okex.common.bean.UnifiedEntranceResponse;
import com.okinc.okex.search.bean.SearchHintResponse;
import com.okinc.okex.search.bean.SearchIntentResponse;
import com.okinc.okex.uploadlog.bean.TicketAttachmentResponse;
import com.okinc.okex.uploadlog.bean.TicketFormResponse;
import com.okinc.okex.uploadlog.bean.TicketSubmitRequest;
import com.okinc.okex.uploadlog.bean.TicketSubmitResponse;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.snH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC45301snH {
    public static final Activity Companion = Activity.copydefault;

    @GET("/priapi/v1/assistant/service-center/search/hints")
    java.lang.Object AEQbTJ(@NotNull @Query("searchTerm") java.lang.String str, @Query("categories") java.lang.String str2, @Query("articleCount") java.lang.Integer num, @Query("intentCount") java.lang.Integer num2, @Query("defi") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<SearchHintResponse>> continuation);

    @GET("/priapi/v1/assistant/ticket-form/{formId}")
    java.lang.Object AEQbTJ(@retrofit2.http.Path("formId") @NotNull java.lang.String str, @Query(OtcExtraKeys.SESSIONID) java.lang.String str2, @Query("contextId") java.lang.String str3, @NotNull Continuation<? super ResponseData<TicketFormResponse>> continuation);

    @POST("/priapi/v1/assistant/ticket-attachment")
    @Multipart
    java.lang.Object EZpvd(@Header("ReadTimeout") int i, @Header("WriteTimeout") int i2, @NotNull @Part MultipartBody.Part part, @NotNull Continuation<? super ResponseData<TicketAttachmentResponse>> continuation);

    @POST("/priapi/v1/assistant/ticket")
    java.lang.Object KWHzl(@Body @NotNull TicketSubmitRequest ticketSubmitRequest, @NotNull Continuation<? super ResponseData<TicketSubmitResponse>> continuation);

    @GET("/priapi/v1/assistant/intent/rich-intent/{intentId}")
    java.lang.Object OLrzqt(@retrofit2.http.Path("intentId") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<SearchIntentResponse>> continuation);

    @POST("/priapi/v1/assistant/unified-entrance")
    java.lang.Object copydefault(@Body @NotNull UnifiedEntranceRequest unifiedEntranceRequest, @NotNull Continuation<? super ResponseData<UnifiedEntranceResponse>> continuation);

    /* JADX INFO: renamed from: o.snH$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity copydefault = new Activity();

        private Activity() {
        }

        public final InterfaceC45301snH EZpvd() {
            return (InterfaceC45301snH) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC45301snH.class));
        }
    }

    /* JADX INFO: renamed from: o.snH$Application */
    public static final class Application {
        public static /* synthetic */ java.lang.Object getAssistantTicketForm$default(InterfaceC45301snH interfaceC45301snH, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssistantTicketForm");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return interfaceC45301snH.AEQbTJ(str, str2, str3, continuation);
        }

        public static /* synthetic */ java.lang.Object uploadAssistantTicketAttachment$default(InterfaceC45301snH interfaceC45301snH, int i, int i2, MultipartBody.Part part, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadAssistantTicketAttachment");
            }
            if ((i3 & 1) != 0) {
                i = 300;
            }
            if ((i3 & 2) != 0) {
                i2 = 300;
            }
            return interfaceC45301snH.EZpvd(i, i2, part, continuation);
        }
    }
}
