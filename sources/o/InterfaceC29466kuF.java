package o;

import com.okinc.business.market.data.model.CoinRankingWsData;
import com.okinc.business.market.data.model.UpdateSignalAlertsRequest;
import com.okinc.business.market.data.model.smart_money.AddressResponse;
import com.okinc.business.market.data.model.smart_money.SignalActivityResponse;
import com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData;
import com.okinc.business.market.data.model.smart_money.SignalAlertResponse;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.data.model.smart_money.SignalGemsData;
import com.okinc.business.market.data.model.smart_money.SignalGemsSortType;
import com.okinc.business.market.data.model.smart_money.SignalOverviewAddressResponse;
import com.okinc.business.market.data.model.smart_money.SignalOverviewOrActivityListRequest;
import com.okinc.business.market.data.model.smart_money.SignalOverviewResponse;
import com.okinc.business.market.data.model.smart_money.SignalStatusUpdate;
import com.okinc.business.market.data.model.smart_money.SignalUpdate;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SignalConfigData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29466kuF {
    java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<SignalStatusUpdate>>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull SignalGemsSortType signalGemsSortType, boolean z, @NotNull SignalGemType signalGemType, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super AbstractC43419rot<SignalGemsData, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull UpdateSignalAlertsRequest updateSignalAlertsRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<SignalOverviewAddressResponse, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<SignalAlertResponse, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<SignalUpdate>>> continuation);

    java.lang.Object KWHzl(@NotNull SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest, @NotNull Continuation<? super AbstractC43419rot<SignalActivityResponse, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<SignalOverviewResponse, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<SignalUpdate>>> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<? extends java.util.List<java.lang.String>>, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<SignalConfigData, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest, @NotNull Continuation<? super AbstractC43419rot<SignalOverviewResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super AbstractC43419rot<SignalAlertHistoryData, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<CoinRankingWsData>> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, @NotNull Continuation<? super Flow<CoinRankingWsData>> continuation);

    java.lang.Object copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43419rot<AddressResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation);
}
