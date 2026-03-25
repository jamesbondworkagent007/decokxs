package o;

import com.okinc.crcore.shared.net.responsebean.CoinBean;
import com.okinc.crcore.shared.net.responsebean.DexTokenBean;
import com.okinc.crcore.shared.net.responsebean.FairPriceBean;
import com.okinc.crcore.shared.net.responsebean.FavoriteRecommendBean;
import com.okinc.crcore.shared.net.responsebean.SpotBuyAndSellBean;
import com.okinc.crcore.shared.net.responsebean.TokenChartBeans;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC31767mDd {
    java.lang.Object AEQbTJ(java.lang.Integer num, java.lang.Integer num2, java.lang.Long l, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation);

    java.lang.Object AEQbTJ(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation);

    java.lang.Object AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexTokenBean>, OKServerException>> continuation);

    java.lang.Object EZpvd(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation);

    java.lang.Object EZpvd(java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<FavoriteRecommendBean>, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<FairPriceBean>, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TokenChartBeans>, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexTokenBean>, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SpotBuyAndSellBean>, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>> continuation);

    /* JADX INFO: renamed from: o.mDd$Application */
    public static final class Application {
        public static /* synthetic */ java.lang.Object getSearchHotRankCoins$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchHotRankCoins");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC31767mDd.copydefault(str, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getAllMarketCapRankCoins$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31767mDd.copydefault((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, str2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllMarketCapRankCoins");
        }

        public static /* synthetic */ java.lang.Object getHotFeverRankCoins$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31767mDd.EZpvd((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, str2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHotFeverRankCoins");
        }

        public static /* synthetic */ java.lang.Object getUpDownRankCoins$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31767mDd.AEQbTJ((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, str2, (Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUpDownRankCoins");
        }

        public static /* synthetic */ java.lang.Object getMarketSpotBuyAndSellV2$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketSpotBuyAndSellV2");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                str3 = "NO_CACHE";
            }
            return interfaceC31767mDd.copydefault(str, str2, str3, (Continuation<? super AbstractC43419rot<? extends java.util.List<SpotBuyAndSellBean>, OKServerException>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getRecommendTokens$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.String str, java.lang.Integer num, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendTokens");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return interfaceC31767mDd.copydefault(str, num, str2, (Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getChartsForTokens$default(InterfaceC31767mDd interfaceC31767mDd, java.util.List list, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChartsForTokens");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return interfaceC31767mDd.EZpvd(list, str, z, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mDd */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getFairPrice$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.String str, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFairPrice");
            }
            if ((i & 2) != 0) {
                list = null;
            }
            return interfaceC31767mDd.EZpvd(str, list, continuation);
        }

        public static /* synthetic */ java.lang.Object getRecommendPairs$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendPairs");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return interfaceC31767mDd.EZpvd(num, continuation);
        }

        public static /* synthetic */ java.lang.Object getNewCoins$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.Integer num, java.lang.Integer num2, java.lang.Long l, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31767mDd.AEQbTJ((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : l, str, (Continuation<? super AbstractC43419rot<? extends java.util.List<CoinBean>, OKServerException>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewCoins");
        }

        public static /* synthetic */ java.lang.Object getDexTokenRankingList$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexTokenRankingList");
            }
            if ((i2 & 1) != 0) {
                str = null;
            }
            java.lang.String str4 = str;
            if ((i2 & 2) != 0) {
                str2 = "9";
            }
            java.lang.String str5 = str2;
            if ((i2 & 4) != 0) {
                str3 = "4";
            }
            java.lang.String str6 = str3;
            if ((i2 & 8) != 0) {
                i = 100;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                z = false;
            }
            return interfaceC31767mDd.AEQbTJ(str4, str5, str6, i3, z, continuation);
        }

        public static /* synthetic */ java.lang.Object searchDexTokenList$default(InterfaceC31767mDd interfaceC31767mDd, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchDexTokenList");
            }
            if ((i & 2) != 0) {
                str2 = "4";
            }
            return interfaceC31767mDd.OLrzqt(str, str2, continuation);
        }
    }
}
