package o;

import com.okinc.business.defi.biz.net.bean.WalletSearchResp;
import com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletHotSearchResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18906frJ {
    java.lang.Object AEQbTJ(long j, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<WalletSearchResp>, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<WalletHotSearchResponse, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MarketChainBean>, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<WalletSearchResp>, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<SearchRecommendResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.Long l, @NotNull java.util.List<java.lang.String> list, @NotNull DiscoverSearchParam discoverSearchParam, @NotNull Continuation<? super AbstractC43419rot<WalletSearchResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SearchAddressResponse>, OKServerException>> continuation);
}
