package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PostSupportRatingRequestBean;
import com.okinc.okex.rating.bean.PostUpdateRatingRequestBean;
import com.okinc.okex.rating.bean.RatingMetadataResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface sxL {
    public static final Application Companion = Application.OLrzqt;

    @POST("/v2/support/rating")
    java.lang.Object AEQbTJ(@Body @NotNull PostSupportRatingRequestBean postSupportRatingRequestBean, @NotNull Continuation<? super ResponseData<java.lang.String>> continuation);

    @GET("/v2/support/rating")
    java.lang.Object EZpvd(@NotNull @Query("moduleType") java.lang.String str, @Query("ratingNotificationId") java.lang.String str2, @Query("businessId") java.lang.String str3, @NotNull Continuation<? super ResponseData<GetSupportRatingBean>> continuation);

    @GET("/v2/support/rating/request-metadata")
    java.lang.Object EZpvd(@NotNull @Query("moduleType") java.lang.String str, @Query("businessId") java.lang.String str2, @NotNull Continuation<? super ResponseData<RatingMetadataResponse>> continuation);

    @POST("/v2/support/rating/update")
    java.lang.Object copydefault(@Body @NotNull PostUpdateRatingRequestBean postUpdateRatingRequestBean, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    public static final class Application {
        public static final /* synthetic */ Application OLrzqt = new Application();

        private Application() {
        }

        public final sxL EZpvd() {
            return (sxL) C43393roT.httpService$default(C56524yIo.AEQbTJ(sxL.class), null, 1, null);
        }
    }
}
