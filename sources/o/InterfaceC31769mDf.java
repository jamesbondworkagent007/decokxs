package o;

import com.okinc.crcore.coreapi.net.responsebean.NewsArticleResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostFeedResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31769mDf {
    public static final Activity Companion = Activity.EZpvd;

    @GET("/priapi/v5/content/public/timeline/2")
    java.lang.Object AEQbTJ(@Query("type") int i, @Query("queryName") java.lang.String str, @Query("cursor") java.lang.String str2, @Query("size") java.lang.String str3, @Query("group") java.lang.String str4, @NotNull Continuation<? super ResponseData<CommunityPostFeedResponse>> continuation);

    @GET("/priapi/v5/content/public/feed/2")
    java.lang.Object OLrzqt(@Query("cursor") java.lang.String str, @Query("size") java.lang.String str2, @Query("group") java.lang.String str3, @NotNull Continuation<? super ResponseData<CommunityPostFeedResponse>> continuation);

    @GET("/priapi/v5/content/public/rank/cr-digest")
    java.lang.Object copydefault(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @NotNull Continuation<? super ResponseData<java.util.List<NewsArticleResponseBean>>> continuation);

    /* JADX INFO: renamed from: o.mDf$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object getNewsArticles$default(InterfaceC31769mDf interfaceC31769mDf, java.lang.String str, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewsArticles");
            }
            if ((i3 & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i3 & 2) != 0) {
                i = 300;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return interfaceC31769mDf.copydefault(str, i, i2, continuation);
        }
    }

    /* JADX INFO: renamed from: o.mDf$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity EZpvd = new Activity();

        private Activity() {
        }
    }
}
