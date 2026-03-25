package o;

import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.bean.TokenMarketInfoResponse;
import com.okinc.business.dexlogic.bean.TokenPriceResponse;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.business.market.data.model.history.HistoryChangeResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedOrderBookFilter;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28152kQv {
    java.lang.Object AEQbTJ(@NotNull HistoryChangeFilterRequest historyChangeFilterRequest, @NotNull Continuation<? super AbstractC43419rot<HistoryChangeResponse, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<TokenMarketInfoResponse, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<AdvancedOrderBookFilter>, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super Flow<? extends kotlin.Pair<java.lang.String, ? extends java.util.HashMap<java.lang.String, java.lang.String>>>> continuation);

    java.lang.Object KWHzl(@NotNull JsonObject jsonObject, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<LatestMarketInfoBean, OKServerException>> continuation);

    void KWHzl(java.lang.String str);

    java.lang.Object OLrzqt(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<TokenPriceResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super Flow<? extends kotlin.Pair<java.lang.String, ? extends java.util.HashMap<java.lang.String, java.lang.String>>>> continuation);

    /* JADX INFO: renamed from: o.kQv$Activity */
    public static final class Activity {
        public static /* synthetic */ void unsubscribeMarketInfo$default(InterfaceC28152kQv interfaceC28152kQv, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsubscribeMarketInfo");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            interfaceC28152kQv.KWHzl(str);
        }
    }
}
