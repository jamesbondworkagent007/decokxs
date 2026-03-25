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
import com.okinc.planet.domain.repository.PlanetRepository$agreeTnc$2;
import com.okinc.planet.domain.repository.PlanetRepository$analyzeLinks$2;
import com.okinc.planet.domain.repository.PlanetRepository$basicInfo$2;
import com.okinc.planet.domain.repository.PlanetRepository$followBatch$2;
import com.okinc.planet.domain.repository.PlanetRepository$getCrNewsFlashList$2;
import com.okinc.planet.domain.repository.PlanetRepository$getEarningsHistory$2;
import com.okinc.planet.domain.repository.PlanetRepository$getFollowingList$2;
import com.okinc.planet.domain.repository.PlanetRepository$getImagePutUrl$2;
import com.okinc.planet.domain.repository.PlanetRepository$getKeyMetrics$2;
import com.okinc.planet.domain.repository.PlanetRepository$getNewsFlashList$2;
import com.okinc.planet.domain.repository.PlanetRepository$getOrbitStatus$2;
import com.okinc.planet.domain.repository.PlanetRepository$getPublishPermission$2;
import com.okinc.planet.domain.repository.PlanetRepository$getPublisherDraft$2;
import com.okinc.planet.domain.repository.PlanetRepository$getPublisherDraftDetail$2;
import com.okinc.planet.domain.repository.PlanetRepository$getPublisherTokenList$2;
import com.okinc.planet.domain.repository.PlanetRepository$getPublisherTopicList$2;
import com.okinc.planet.domain.repository.PlanetRepository$getRecommendOrbiters$2;
import com.okinc.planet.domain.repository.PlanetRepository$getSearchKolList$2;
import com.okinc.planet.domain.repository.PlanetRepository$getShareData$2;
import com.okinc.planet.domain.repository.PlanetRepository$getSpotlightList$2;
import com.okinc.planet.domain.repository.PlanetRepository$getTopTraders$2;
import com.okinc.planet.domain.repository.PlanetRepository$getTwitterBindingInfo$2;
import com.okinc.planet.domain.repository.PlanetRepository$getUserSimpleInfo$2;
import com.okinc.planet.domain.repository.PlanetRepository$setOrbitStatus$2;
import com.okinc.planet.domain.repository.PlanetRepository$unlinkX$2;
import com.okinc.planet.domain.repository.PlanetRepository$upgradeOrbitStatus$2;
import com.okinc.planet.domain.repository.PlanetRepository$xAsync$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tQQ implements tQV {
    public final CoroutineDispatcher KWHzl;
    public final tQP copydefault;

    public tQQ(@NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = tqp;
        this.KWHzl = coroutineDispatcher;
    }

    @Override // o.tQV
    public java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<PublisherTopicRes, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getPublisherTopicList$2(this, str, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<PublisherTokenInfo>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getPublisherTokenList$2(this, str, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<PublishPermissionResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getPublishPermission$2(this, str, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<LinkAnalysisResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$analyzeLinks$2(this, list, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$agreeTnc$2(this, z, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<PublishImageUplaodResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getImagePutUrl$2(this, str, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<OrbitBeanResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getOrbitStatus$2(this, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<OrbitSimpleInfo, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getUserSimpleInfo$2(this, str, str2, str3, str4, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object KWHzl(@NotNull OrbitOnboardingRequst orbitOnboardingRequst, @NotNull Continuation<? super AbstractC43419rot<OrbitBeanResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$setOrbitStatus$2(this, orbitOnboardingRequst, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object KWHzl(@NotNull OrbitUpgradeRequst orbitUpgradeRequst, @NotNull Continuation<? super AbstractC43419rot<OrbitBeanResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$upgradeOrbitStatus$2(this, orbitUpgradeRequst, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<TopTrader, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getTopTraders$2(this, str, str2, str3, str4, str5, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object valueOf(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TopOrbiter>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getRecommendOrbiters$2(this, str, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<PlanetBasicUserInfoResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$basicInfo$2(this, str3, str, str2, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object djBIcL(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<PlanetProfileShareBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getShareData$2(this, str, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$unlinkX$2(this, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object AEQbTJ(@NotNull PlanetXAsync planetXAsync, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$xAsync$2(this, planetXAsync, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<PlanetTwitterBindingInfo, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getTwitterBindingInfo$2(this, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object AEQbTJ(@NotNull C45910tAu c45910tAu, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$followBatch$2(this, c45910tAu, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<OrbitCreateCentreInfo, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getKeyMetrics$2(this, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object EZpvd(long j, long j2, @NotNull Continuation<? super AbstractC43419rot<EarningsHistoryInfo, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getEarningsHistory$2(this, j, j2, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<DraftInfo, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getPublisherDraft$2(this, str, str2, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<DraftDataInfo, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getPublisherDraftDetail$2(this, str, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<OrbitKolSearchResult, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getSearchKolList$2(this, str, str2, num, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object AEQbTJ(int i, java.lang.Integer num, java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<SpotlightListResponse, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getSpotlightList$2(this, i, num, str, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object copydefault(java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<NewsFlashListResponse, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getNewsFlashList$2(this, num, str, bool, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object AEQbTJ(java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<NewsFlashListResponse, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getCrNewsFlashList$2(this, num, null), continuation);
    }

    @Override // o.tQV
    public java.lang.Object copydefault(java.lang.String str, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<FollowingListResponse, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetRepository$getFollowingList$2(this, str, num, null), continuation);
    }
}
