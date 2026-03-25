package o;

import com.okinc.crcore.coreapi.repository.CRRubikRepository$getAllMarketCapRankCoins$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getChartsForTokens$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getDexTokenRankingList$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getFairPrice$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getHotFeverRankCoins$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getMarketSpotBuyAndSellV2$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getNewCoins$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getRecommendPairs$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getRecommendTokens$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getSearchHotRankCoins$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getUpDownRankCoins$2;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$searchDexTokenList$2;
import com.okinc.crcore.shared.net.responsebean.CoinBean;
import com.okinc.crcore.shared.net.responsebean.DexTokenBean;
import com.okinc.crcore.shared.net.responsebean.FairPriceBean;
import com.okinc.crcore.shared.net.responsebean.FavoriteRecommendBean;
import com.okinc.crcore.shared.net.responsebean.SpotBuyAndSellBean;
import com.okinc.crcore.shared.net.responsebean.TokenChartBeans;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mCk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31747mCk implements InterfaceC31767mDd {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC31771mDh OLrzqt;

    @yCM
    public C31747mCk(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC31771mDh interfaceC31771mDh) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC31771mDh, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = interfaceC31771mDh;
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getSearchHotRankCoins$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object copydefault(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getAllMarketCapRankCoins$2(this, num, num2, str, str2, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object EZpvd(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getHotFeverRankCoins$2(this, num, num2, str, str2, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object AEQbTJ(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getUpDownRankCoins$2(this, num, num2, str, str2, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object copydefault(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SpotBuyAndSellBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getMarketSpotBuyAndSellV2$2(this, str, str2, str3, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object copydefault(java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getRecommendTokens$2(this, str, num, str2, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TokenChartBeans>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getChartsForTokens$2(this, list, str, z, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object EZpvd(@NotNull java.lang.String str, java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<FairPriceBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getFairPrice$2(this, str, list, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object EZpvd(java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<FavoriteRecommendBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getRecommendPairs$2(this, num, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object AEQbTJ(java.lang.Integer num, java.lang.Integer num2, java.lang.Long l, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getNewCoins$2(this, num, num2, l, str, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexTokenBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$getDexTokenRankingList$2(this, str, str2, str3, i, z, null), continuation);
    }

    @Override // o.InterfaceC31767mDd
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexTokenBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CRRubikRepository$searchDexTokenList$2(this, str, str2, null), continuation);
    }
}
