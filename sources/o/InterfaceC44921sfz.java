package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.article.bean.ArticleListResponse;
import com.okinc.okex.campaign.bean.CampaignStatus;
import com.okinc.okex.campaign.bean.RecentCampaignResponse;
import com.okinc.okex.center.bean.AssistantConfig;
import com.okinc.okex.center.bean.ChatbotUnreadMessageResponse;
import com.okinc.okex.center.bean.HomeTicketStaus;
import com.okinc.okex.center.bean.HotTopicsResponse;
import com.okinc.okex.center.bean.IntegratedSolutionResponse;
import com.okinc.okex.center.bean.LandingTransactionItemBean;
import com.okinc.okex.center.bean.MoreTransactionListV2Response;
import com.okinc.okex.center.bean.PopupAnnouncementReadReq;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.SupportBannerBean;
import com.okinc.okex.center.bean.SupportLandingResponse;
import com.okinc.okex.center.bean.TopicSectionsResponse;
import com.okinc.okex.center.bean.TransactionListV2Response;
import com.okinc.okex.center.bean.TxnContextualModel;
import com.okinc.okex.center.bean.TxnCurrencyBean;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.search.bean.SearchArticleResponse;
import com.okinc.okex.search.bean.SearchSectionResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.sfz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44921sfz {
    public static final java.lang.String BANNER_CACHE_EXPIRY = "86400";
    public static final Application Companion = Application.KWHzl;

    @GET("/v2/support/service-center/landing-page/transactions")
    java.lang.Object AEQbTJ(@Query("enabledGreyscaleFeatures") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<LandingTransactionItemBean>>> continuation);

    @GET("/v2/support/service-center/hot-topics")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<HotTopicsResponse>> continuation);

    @POST("/priapi/v1/assistant/service-center/popup-announcement/read")
    AbstractC58185ywX<ResponseData<java.lang.Object>> AEQbTJ(@Body @NotNull PopupAnnouncementReadReq popupAnnouncementReadReq);

    @GET("/v2/support/service-center/details/transaction-list")
    java.lang.Object EZpvd(@Query("page") java.lang.Integer num, @Query("size") java.lang.Integer num2, @Query("type") TransactionType transactionType, @Query("enabledGreyscaleFeatures") java.lang.String str, @NotNull Continuation<? super ResponseData<MoreTransactionListV2Response>> continuation);

    @GET("/v2/support/service-center/sections")
    java.lang.Object EZpvd(@Query("category") java.lang.String str, @NotNull Continuation<? super ResponseData<TopicSectionsResponse>> continuation);

    @GET("/v2/support/home/support-center/banner")
    java.lang.Object EZpvd(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<SupportBannerBean>>> continuation);

    @GET("/v2/support/service-center/transactions/currency")
    java.lang.Object KWHzl(@Header("Cache-Strategy") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TxnCurrencyBean>>> continuation);

    @GET("/v2/support/service-center/self-service-tools")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<SelfServiceTools>> continuation);

    @GET("/priapi/v1/assistant/config")
    AbstractC58185ywX<ResponseData<AssistantConfig>> KWHzl(@Header("Cache-Strategy") @NotNull CacheStrategy cacheStrategy, @Header("Cache-Expire") int i);

    @GET(" /v2/support/service-center/details/transactions")
    java.lang.Object OLrzqt(@Query("enabledGreyscaleFeatures") java.lang.String str, @NotNull Continuation<? super ResponseData<TransactionListV2Response>> continuation);

    @GET("/priapi/v1/assistant/ticket/indicator")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<HomeTicketStaus>> continuation);

    @GET("/v2/support/service-center/transactions/deposit/detect-issues")
    java.lang.Object copydefault(@Query("currencyId") int i, @Query("chainId") java.lang.Integer num, @Query("txid") java.lang.String str, @NotNull Continuation<? super ResponseData<TxnContextualModel>> continuation);

    @GET("/priapi/v1/assistant/service-center/campaign")
    java.lang.Object copydefault(@NotNull @Query("status") CampaignStatus campaignStatus, @NotNull Continuation<? super ResponseData<RecentCampaignResponse>> continuation);

    @GET("/v2/support/service-center/search/sections")
    java.lang.Object copydefault(@NotNull @Query("category") CategorySlug categorySlug, @NotNull Continuation<? super ResponseData<SearchSectionResponse>> continuation);

    @GET("/v2/support/service-center/solution")
    java.lang.Object copydefault(@Query("type") IntegratedSolutionPageType integratedSolutionPageType, @Query("transactionType") TransactionType transactionType, @Query("id") java.lang.String str, @NotNull Continuation<? super ResponseData<IntegratedSolutionResponse>> continuation);

    @GET("/v2/support/service-center/search/articles")
    java.lang.Object copydefault(@Query(FirebaseAnalytics.Param.TERM) java.lang.String str, @Query("categories") java.lang.String str2, @Query("sectionIds") java.lang.String str3, @Query("tagIds") java.lang.String str4, @Query("page") java.lang.Integer num, @Query("size") java.lang.Integer num2, @Query("sort") java.lang.String str5, @Query("exclude") java.lang.String str6, @Query("highlight") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<SearchArticleResponse>> continuation);

    @GET("/v2/support/service-center/articles")
    java.lang.Object copydefault(@Query("tagIds") java.lang.String str, @Query("sectionIds") java.lang.String str2, @Query("transactionType") java.lang.String str3, @Query("sort") java.lang.String str4, @Query("page") java.lang.Integer num, @Query("size") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<ArticleListResponse>> continuation);

    @GET("/v2/support/service-center/recommended")
    java.lang.Object copydefault(@Query("slug") java.lang.String str, @Query("enabledGreyscaleFeatures") java.lang.String str2, @NotNull Continuation<? super ResponseData<SupportLandingResponse>> continuation);

    @GET("/priapi/v1/assistant/session/unread-message-count")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<ChatbotUnreadMessageResponse>> continuation);

    /* JADX INFO: renamed from: o.sfz$Application */
    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();

        private Application() {
        }

        public final InterfaceC44921sfz AEQbTJ() {
            return (InterfaceC44921sfz) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC44921sfz.class), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.sfz$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sfz */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getSupportBannerList$default(InterfaceC44921sfz interfaceC44921sfz, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSupportBannerList");
            }
            if ((i & 1) != 0) {
                map = C56424yEw.gEmmrt(C56390yDp.OLrzqt("Cache-Strategy", "FIRST_CACHE"), C56390yDp.OLrzqt("Cache-Expire", "86400"));
            }
            return interfaceC44921sfz.EZpvd((java.util.Map<java.lang.String, java.lang.String>) map, (Continuation<? super ResponseData<java.util.List<SupportBannerBean>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getArticleList$default(InterfaceC44921sfz interfaceC44921sfz, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC44921sfz.copydefault((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getArticleList");
        }

        public static /* synthetic */ java.lang.Object getTopicSections$default(InterfaceC44921sfz interfaceC44921sfz, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTopicSections");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC44921sfz.EZpvd(str, (Continuation<? super ResponseData<TopicSectionsResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getSupportLandingSections$default(InterfaceC44921sfz interfaceC44921sfz, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSupportLandingSections");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC44921sfz.copydefault(str, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getIntegratedSolution$default(InterfaceC44921sfz interfaceC44921sfz, IntegratedSolutionPageType integratedSolutionPageType, TransactionType transactionType, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntegratedSolution");
            }
            if ((i & 1) != 0) {
                integratedSolutionPageType = null;
            }
            if ((i & 2) != 0) {
                transactionType = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return interfaceC44921sfz.copydefault(integratedSolutionPageType, transactionType, str, (Continuation<? super ResponseData<IntegratedSolutionResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getTxnCurrencyList$default(InterfaceC44921sfz interfaceC44921sfz, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTxnCurrencyList");
            }
            if ((i & 1) != 0) {
                str = "FIRST_CACHE";
            }
            return interfaceC44921sfz.KWHzl(str, (Continuation<? super ResponseData<java.util.List<TxnCurrencyBean>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getDepositIssue$default(InterfaceC44921sfz interfaceC44921sfz, int i, java.lang.Integer num, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDepositIssue");
            }
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            return interfaceC44921sfz.copydefault(i, num, str, (Continuation<? super ResponseData<TxnContextualModel>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getSearchArticles$default(InterfaceC44921sfz interfaceC44921sfz, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC44921sfz.copydefault((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? "content" : str6, (i & 256) != 0 ? java.lang.Boolean.FALSE : bool, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchArticles");
        }

        public static /* synthetic */ java.lang.Object getTransactionListsNew$default(InterfaceC44921sfz interfaceC44921sfz, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactionListsNew");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC44921sfz.OLrzqt(str, continuation);
        }

        public static /* synthetic */ java.lang.Object getMoreTransactionListsNew$default(InterfaceC44921sfz interfaceC44921sfz, java.lang.Integer num, java.lang.Integer num2, TransactionType transactionType, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMoreTransactionListsNew");
            }
            if ((i & 1) != 0) {
                num = 1;
            }
            java.lang.Integer num3 = num;
            if ((i & 2) != 0) {
                num2 = 10;
            }
            java.lang.Integer num4 = num2;
            if ((i & 4) != 0) {
                transactionType = TransactionType.Deposit;
            }
            TransactionType transactionType2 = transactionType;
            if ((i & 8) != 0) {
                str = null;
            }
            return interfaceC44921sfz.EZpvd(num3, num4, transactionType2, str, continuation);
        }

        public static /* synthetic */ java.lang.Object getLandingTransactions$default(InterfaceC44921sfz interfaceC44921sfz, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLandingTransactions");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC44921sfz.AEQbTJ(str, continuation);
        }
    }
}
