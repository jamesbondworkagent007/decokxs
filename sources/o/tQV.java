package o;

import com.okinc.network.okg.response.OKServerException;
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
import com.okinc.planet.biz_search.model.OrbitKolSearchResult;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean;
import com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo;
import com.okinc.planet.biz_userprofile.data.PlanetXAsync;
import com.okinc.planet.domain.data.OrbitSimpleInfo;
import com.okinc.planet.domain.remote.dto.LinkAnalysisResp;
import com.okinc.planet.domain.remote.dto.PublishImageUplaodResp;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import com.okinc.planet.domain.remote.dto.PublisherTopicRes;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface tQV extends tQS {
    java.lang.Object AEQbTJ(int i, java.lang.Integer num, java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<SpotlightListResponse, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull PlanetXAsync planetXAsync, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation);

    java.lang.Object AEQbTJ(java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<NewsFlashListResponse, OKServerException>> continuation);

    java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<OrbitSimpleInfo, OKServerException>> continuation);

    java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<PublisherTokenInfo>, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<OrbitCreateCentreInfo, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull C45910tAu c45910tAu, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation);

    java.lang.Object EZpvd(long j, long j2, @NotNull Continuation<? super AbstractC43419rot<EarningsHistoryInfo, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<OrbitKolSearchResult, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<DraftDataInfo, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<LinkAnalysisResp, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<OrbitBeanResp, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull OrbitOnboardingRequst orbitOnboardingRequst, @NotNull Continuation<? super AbstractC43419rot<OrbitBeanResp, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull OrbitUpgradeRequst orbitUpgradeRequst, @NotNull Continuation<? super AbstractC43419rot<OrbitBeanResp, OKServerException>> continuation);

    java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<TopTrader, OKServerException>> continuation);

    java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<PlanetBasicUserInfoResp, OKServerException>> continuation);

    java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<PublishPermissionResp, OKServerException>> continuation);

    java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation);

    java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<PublisherTopicRes, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<PlanetTwitterBindingInfo, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<NewsFlashListResponse, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.String str, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<FollowingListResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<DraftInfo, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<PublishImageUplaodResp, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation);

    java.lang.Object djBIcL(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<PlanetProfileShareBean, OKServerException>> continuation);

    java.lang.Object valueOf(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TopOrbiter>, OKServerException>> continuation);

    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object getPublisherTopicList$default(tQV tqv, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPublisherTopicList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return tqv.OLrzqt(str, continuation);
        }

        public static /* synthetic */ java.lang.Object getPublisherTokenList$default(tQV tqv, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPublisherTokenList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return tqv.AEQbTJ(str, (Continuation<? super AbstractC43419rot<? extends java.util.List<PublisherTokenInfo>, OKServerException>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getPublishPermission$default(tQV tqv, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPublishPermission");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return tqv.KWHzl(str, (Continuation<? super AbstractC43419rot<PublishPermissionResp, OKServerException>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getTopTraders$default(tQV tqv, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return tqv.KWHzl((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTopTraders");
        }

        public static /* synthetic */ java.lang.Object getRecommendOrbiters$default(tQV tqv, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendOrbiters");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return tqv.valueOf(str, continuation);
        }

        public static /* synthetic */ java.lang.Object basicInfo$default(tQV tqv, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: basicInfo");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return tqv.KWHzl(str, str2, str3, continuation);
        }

        public static /* synthetic */ java.lang.Object getSpotlightList$default(tQV tqv, int i, java.lang.Integer num, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
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
            return tqv.AEQbTJ(i, num, str, continuation);
        }

        public static /* synthetic */ java.lang.Object getNewsFlashList$default(tQV tqv, java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
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
            return tqv.copydefault(num, str, bool, continuation);
        }

        public static /* synthetic */ java.lang.Object getCrNewsFlashList$default(tQV tqv, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCrNewsFlashList");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return tqv.AEQbTJ(num, (Continuation<? super AbstractC43419rot<NewsFlashListResponse, OKServerException>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getFollowingList$default(tQV tqv, java.lang.String str, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFollowingList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return tqv.copydefault(str, num, (Continuation<? super AbstractC43419rot<FollowingListResponse, OKServerException>>) continuation);
        }
    }
}
