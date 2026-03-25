package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet.biz_content.draft.DraftInfo;
import com.okinc.planet.biz_content.leaderboard.bean.FollowingListResponse;
import com.okinc.planet.biz_content.leaderboard.bean.NewsFlashListResponse;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightListResponse;
import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import com.okinc.planet.biz_content.leaderboard.bean.TopTrader;
import com.okinc.planet.biz_create_centre.data.EarningsHistoryInfo;
import com.okinc.planet.biz_create_centre.data.OrbitCreateCentreInfo;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_onboarding.data.OrbitOnboardingRequst;
import com.okinc.planet.biz_orbit_upgrade.domain.OrbitUpgradeRequst;
import com.okinc.planet.biz_performance.data.PositionAssetDto;
import com.okinc.planet.biz_performance.data.ProfileChartDto;
import com.okinc.planet.biz_performance.data.UserProfileOverviewDto;
import com.okinc.planet.biz_positions.data.CurrentPosition;
import com.okinc.planet.biz_positions.data.LatestRecordDto;
import com.okinc.planet.biz_positions.data.ProfilePositionHistoryDto;
import com.okinc.planet.biz_search.model.OrbitKolSearchResult;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.data.ModeReq;
import com.okinc.planet.biz_setting.data.ResetCurve;
import com.okinc.planet.biz_setting.data.SettingModeData;
import com.okinc.planet.biz_social_feeds.domain.FollowDynamicData;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetFollowRequest;
import com.okinc.planet.biz_userprofile.data.PlanetMarkMessageReadRequest;
import com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean;
import com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo;
import com.okinc.planet.biz_userprofile.data.PlanetXAsync;
import com.okinc.planet.domain.data.OrbitSimpleInfo;
import com.okinc.planet.domain.remote.dto.LinkAnalysisResp;
import com.okinc.planet.domain.remote.dto.MineCommentsResp;
import com.okinc.planet.domain.remote.dto.MineLikesResp;
import com.okinc.planet.domain.remote.dto.PublishImageUplaodResp;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import com.okinc.planet.domain.remote.dto.PublishRequest;
import com.okinc.planet.domain.remote.dto.PublishResponse;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import com.okinc.planet.domain.remote.dto.PublisherTopicRes;
import com.okinc.planet.domain.remote.dto.SaveDraftResponse;
import com.okinc.planet.domain.remote.dto.UnreadMsgCountResp;
import com.okinc.planet.domain.remote.dto.UnreadMsgListResp;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface tQP {
    @GET("/priapi/v5/rubik/public/content/spot_light/list/{businessType}")
    java.lang.Object AEQbTJ(@retrofit2.http.Path("businessType") int i, @Query("size") java.lang.Integer num, @Query("group") java.lang.String str, @NotNull Continuation<? super ResponseData<SpotlightListResponse>> continuation);

    @GET("/priapi/v5/content/orbiter/earnings-history")
    java.lang.Object AEQbTJ(@Query("cursor") long j, @Query("limit") long j2, @NotNull Continuation<? super ResponseData<EarningsHistoryInfo>> continuation);

    @GET("/priapi/v5/rubik/public/content/newsFlash/2")
    java.lang.Object AEQbTJ(@Query("size") java.lang.Integer num, @NotNull Continuation<? super ResponseData<NewsFlashListResponse>> continuation);

    @POST("/priapi/v5/content/user/unbind-twitter")
    java.lang.Object AEQbTJ(@Body @NotNull java.lang.Object obj, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @GET("/priapi/v5/content/ugc/publishPermission")
    java.lang.Object AEQbTJ(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Token-Valid") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<PublishPermissionResp>> continuation);

    @GET("/priapi/v5/ecotrade/public/community/user/trade-records")
    java.lang.Object AEQbTJ(@NotNull @Query("uniqueName") java.lang.String str, @Query("instId") java.lang.String str2, @Query("instType") java.lang.String str3, @Query(TtmlNode.RUBY_AFTER) java.lang.String str4, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str5, @Query("startModify") java.lang.String str6, @Query("endModify") java.lang.String str7, @Query("limit") java.lang.Integer num, @Query("page") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<java.util.List<LatestRecordDto>>> continuation);

    @GET("/priapi/v5/content/user/simple-info")
    java.lang.Object AEQbTJ(@Query("uid") java.lang.String str, @Query("userId") java.lang.String str2, @Query("uniqueName") java.lang.String str3, @Query("authorId") java.lang.String str4, @NotNull Continuation<? super ResponseData<OrbitSimpleInfo>> continuation);

    @GET("/priapi/v5/ecotrade/posts/follow-timeline")
    java.lang.Object AEQbTJ(@Query(TtmlNode.RUBY_AFTER) java.lang.String str, @NotNull @Query("count") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<FollowDynamicData>>> continuation);

    @GET("/priapi/v5/content/ugc/draft/{id}")
    java.lang.Object AEQbTJ(@retrofit2.http.Path("id") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<DraftDataInfo>> continuation);

    @GET("/priapi/v5/content/ugc/analysisLink")
    java.lang.Object AEQbTJ(@NotNull @Query("linkList") java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<LinkAnalysisResp>> continuation);

    @GET("/priapi/v5/content/user/bound-twitter-info")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<PlanetTwitterBindingInfo>> continuation);

    @POST("/priapi/v5/content/user/onboarding/mark-visited")
    java.lang.Object EZpvd(@Body @NotNull OrbitOnboardingRequst orbitOnboardingRequst, @NotNull Continuation<? super ResponseData<OrbitBeanResp>> continuation);

    @POST("/priapi/v5/content/ugc/publish")
    java.lang.Object EZpvd(@Body @NotNull PublishRequest publishRequest, @NotNull Continuation<? super ResponseData<PublishResponse>> continuation);

    @GET("/priapi/v5/content/public/community/metric-curve")
    java.lang.Object EZpvd(@NotNull @Query("authorId") java.lang.String str, @Query("metricType") java.lang.String str2, @Query("timeSpan") java.lang.Integer num, @Query("preview") boolean z, @NotNull Continuation<? super ResponseData<java.util.List<ProfileChartDto>>> continuation);

    @GET("/priapi/v5/ecotrade/public/community/user/position-history")
    java.lang.Object EZpvd(@NotNull @Query("uniqueName") java.lang.String str, @Query("limit") java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str4, @Query("instType") java.lang.String str5, @Query("instId") java.lang.String str6, @Query("sortType") java.lang.String str7, @NotNull Continuation<? super ResponseData<java.util.List<ProfilePositionHistoryDto>>> continuation);

    @GET("/priapi/v5/content/public/user-info")
    java.lang.Object EZpvd(@Query("uniqueName") java.lang.String str, @Query("uid") java.lang.String str2, @Query("authorId") java.lang.String str3, @NotNull Continuation<? super ResponseData<PlanetBasicUserInfoResp>> continuation);

    @GET("/priapi/v5/content/ugc/drafts")
    java.lang.Object EZpvd(@NotNull @Query("cursor") java.lang.String str, @NotNull @Query("pageSize") java.lang.String str2, @NotNull Continuation<? super ResponseData<DraftInfo>> continuation);

    @GET("/priapi/v5/ecotrade/public/community/user/position-current")
    java.lang.Object EZpvd(@NotNull @Query("uniqueName") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<CurrentPosition>>> continuation);

    @GET("/priapi/v5/rubik/public/content/newsFlash/1")
    java.lang.Object KWHzl(@Query("size") java.lang.Integer num, @Query("group") java.lang.String str, @Query("supportCeDeFi") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<NewsFlashListResponse>> continuation);

    @GET("/priapi/v5/content/user/my-replies")
    java.lang.Object KWHzl(@Query("cursor") java.lang.String str, @Query("size") int i, @NotNull Continuation<? super ResponseData<MineCommentsResp>> continuation);

    @GET("/priapi/v5/content/ugc/activityTagList")
    java.lang.Object KWHzl(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Token-Valid") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<PublisherTopicRes>> continuation);

    @GET("/priapi/v5/content/user/followers")
    java.lang.Object KWHzl(@Query("cursor") java.lang.String str, @Query("size") java.lang.Integer num, @NotNull Continuation<? super ResponseData<FollowingListResponse>> continuation);

    @GET("/priapi/v5/content/public/search/kol")
    java.lang.Object KWHzl(@NotNull @Query(JwtUtilsKt.DID_METHOD_KEY) java.lang.String str, @Query("cursor") java.lang.String str2, @Query("size") java.lang.Integer num, @NotNull Continuation<? super ResponseData<OrbitKolSearchResult>> continuation);

    @GET("/priapi/v5/content/public/community/user/asset")
    java.lang.Object KWHzl(@NotNull @Query("authorId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<PositionAssetDto>>> continuation);

    @POST("/priapi/v5/content/image/presign")
    java.lang.Object KWHzl(@Body @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<PublishImageUplaodResp>> continuation);

    @GET("/priapi/v5/content/orbiter/getKeyMetrics")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<OrbitCreateCentreInfo>> continuation);

    @POST("/priapi/v5/content/user/setting-model")
    AbstractC58185ywX<ResponseData<java.util.List<SettingModeData>>> KWHzl(@Body @NotNull ModeReq modeReq);

    @GET("/priapi/v5/content/msg/unread/count")
    java.lang.Object OLrzqt(@Query("eventSourceType") int i, @NotNull Continuation<? super ResponseData<UnreadMsgCountResp>> continuation);

    @POST("/priapi/v5/content/user/onboarding/activate")
    java.lang.Object OLrzqt(@Body @NotNull OrbitUpgradeRequst orbitUpgradeRequst, @NotNull Continuation<? super ResponseData<OrbitBeanResp>> continuation);

    @POST("/priapi/v5/content/user/follow")
    java.lang.Object OLrzqt(@Body @NotNull PlanetFollowRequest planetFollowRequest, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @GET("/priapi/v5/content/msg/unread/list")
    java.lang.Object OLrzqt(@Query("eventSourceType") java.lang.Integer num, @Query("cursor") java.lang.String str, @Query("size") int i, @Query("markUnreadType") int i2, @NotNull @Query("group") java.lang.String str2, @NotNull Continuation<? super ResponseData<UnreadMsgListResp>> continuation);

    @GET("/priapi/v5/rubik/public/token/getAllOnline")
    java.lang.Object OLrzqt(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Token-Valid") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<java.util.List<PublisherTokenInfo>>> continuation);

    @GET("/priapi/v5/content/public/community/metric/overview")
    java.lang.Object OLrzqt(@NotNull @Query("authorId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<UserProfileOverviewDto>>> continuation);

    @GET("/priapi/v5/content/community/user/curve-setting")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.List<CurveResetInfo>>> continuation);

    @POST("/priapi/v5/content/user/follow-batch")
    java.lang.Object OLrzqt(@Body @NotNull C45910tAu c45910tAu, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v5/content/community/user/curve-setting")
    java.lang.Object copydefault(@Body @NotNull ResetCurve resetCurve, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v5/content/msg/mark-read")
    java.lang.Object copydefault(@Body @NotNull PlanetMarkMessageReadRequest planetMarkMessageReadRequest, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v5/content/user/twitter-sync")
    java.lang.Object copydefault(@Body @NotNull PlanetXAsync planetXAsync, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v5/content/ugc/draft")
    java.lang.Object copydefault(@Body @NotNull PublishRequest publishRequest, @NotNull Continuation<? super ResponseData<SaveDraftResponse>> continuation);

    @POST("/priapi/v5/content/user/bind-twitter")
    java.lang.Object copydefault(@Body @NotNull java.lang.Object obj, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @GET("/priapi/v5/content/user/my-likes")
    java.lang.Object copydefault(@Query("cursor") java.lang.String str, @Query("size") int i, @NotNull Continuation<? super ResponseData<MineLikesResp>> continuation);

    @GET("/priapi/v5/content/public/community/leaderboard")
    java.lang.Object copydefault(@Query("size") java.lang.String str, @Query("page") java.lang.String str2, @Query("sortBy") java.lang.String str3, @Query("timeSpan") java.lang.String str4, @Query("dataVersion") java.lang.String str5, @NotNull Continuation<? super ResponseData<TopTrader>> continuation);

    @GET("/priapi/v5/content/user/share")
    java.lang.Object copydefault(@NotNull @Query("authorId") java.lang.String str, @NotNull Continuation<? super ResponseData<PlanetProfileShareBean>> continuation);

    @POST("/priapi/v5/content/ugc/agreeTnc")
    java.lang.Object copydefault(@Body @NotNull java.util.Map<java.lang.String, java.lang.Boolean> map, @NotNull Continuation<? super ResponseData<PublishPermissionResp>> continuation);

    @GET("/priapi/v5/content/user/onboarding/self-status")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<OrbitBeanResp>> continuation);

    @GET("/priapi/v5/content/public/orbiter-recommend")
    java.lang.Object valueOf(@Query("size") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TopOrbiter>>> continuation);

    public static final class Application {
        public static /* synthetic */ java.lang.Object getPublisherActivityTagList$default(tQP tqp, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPublisherActivityTagList");
            }
            if ((i & 1) != 0) {
                str = "NO_CACHE";
            }
            if ((i & 2) != 0) {
                num = Integer.MAX_VALUE;
            }
            if ((i & 4) != 0) {
                num2 = 1;
            }
            return tqp.KWHzl(str, num, num2, (Continuation<? super ResponseData<PublisherTopicRes>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getPublisherActivityTokenList$default(tQP tqp, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPublisherActivityTokenList");
            }
            if ((i & 1) != 0) {
                str = "NO_CACHE";
            }
            if ((i & 2) != 0) {
                num = Integer.MAX_VALUE;
            }
            if ((i & 4) != 0) {
                num2 = 1;
            }
            return tqp.OLrzqt(str, num, num2, continuation);
        }

        public static /* synthetic */ java.lang.Object geUnreadMsgList$default(tQP tqp, java.lang.Integer num, java.lang.String str, int i, int i2, java.lang.String str2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: geUnreadMsgList");
            }
            if ((i3 & 8) != 0) {
                i2 = 1;
            }
            int i4 = i2;
            if ((i3 & 16) != 0) {
                str2 = qTC.copydefault.AEQbTJ();
            }
            return tqp.OLrzqt(num, str, i, i4, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getPublishPermission$default(tQP tqp, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPublishPermission");
            }
            if ((i & 1) != 0) {
                str = "NO_CACHE";
            }
            if ((i & 2) != 0) {
                num = Integer.MAX_VALUE;
            }
            if ((i & 4) != 0) {
                num2 = 1;
            }
            return tqp.AEQbTJ(str, num, num2, (Continuation<? super ResponseData<PublishPermissionResp>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getUserSimpleInfo$default(tQP tqp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return tqp.AEQbTJ((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserSimpleInfo");
        }

        public static /* synthetic */ java.lang.Object getTopTraders$default(tQP tqp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return tqp.copydefault((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTopTraders");
        }

        public static /* synthetic */ java.lang.Object getRecommendOrbiters$default(tQP tqp, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendOrbiters");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return tqp.valueOf(str, continuation);
        }

        /* JADX INFO: renamed from: getChartsData-JoYFazM$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m8735getChartsDataJoYFazM$default(tQP tqp, java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChartsData-JoYFazM");
            }
            if ((i & 2) != 0) {
                str2 = "PNL";
            }
            return tqp.EZpvd(str, str2, num, z, continuation);
        }

        public static /* synthetic */ java.lang.Object followTimelineApi$default(tQP tqp, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: followTimelineApi");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = "10";
            }
            return tqp.AEQbTJ(str, str2, (Continuation<? super ResponseData<java.util.List<FollowDynamicData>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getSearchKolList$default(tQP tqp, java.lang.String str, java.lang.String str2, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchKolList");
            }
            if ((i & 4) != 0) {
                num = 20;
            }
            return tqp.KWHzl(str, str2, num, (Continuation<? super ResponseData<OrbitKolSearchResult>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getSpotlightList$default(tQP tqp, int i, java.lang.Integer num, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSpotlightList");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            return tqp.AEQbTJ(i, num, str, (Continuation<? super ResponseData<SpotlightListResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getNewsFlashList$default(tQP tqp, java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewsFlashList");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            return tqp.KWHzl(num, str, bool, (Continuation<? super ResponseData<NewsFlashListResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getCrNewsFlashList$default(tQP tqp, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCrNewsFlashList");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return tqp.AEQbTJ(num, (Continuation<? super ResponseData<NewsFlashListResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getFollowingList$default(tQP tqp, java.lang.String str, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFollowingList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return tqp.KWHzl(str, num, (Continuation<? super ResponseData<FollowingListResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getHistoryFuturePosition$default(tQP tqp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return tqp.EZpvd(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryFuturePosition");
        }

        public static /* synthetic */ java.lang.Object getLatestRecords$default(tQP tqp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return tqp.AEQbTJ(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLatestRecords");
        }
    }
}
