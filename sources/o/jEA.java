package o;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressGroup;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityWsParam;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendDetailRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendWsParam;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface jEA {
    java.lang.Object AEQbTJ(@NotNull TrackerActivityWsParam trackerActivityWsParam, @NotNull Continuation<? super Flow<? extends java.util.List<TrackerActivityResponse>>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<GetTrackingAddressGroup>, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull TrackerTrendWsParam trackerTrendWsParam, @NotNull Continuation<? super Flow<TrackerTrendResponse>> continuation);

    void EZpvd();

    java.lang.Object KWHzl(@NotNull TrackerActivityRequest trackerActivityRequest, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TrackerActivityResponse>, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull TrackerTrendDetailRequest trackerTrendDetailRequest, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TrendTrader>, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<TrackerAddressSourceResponse, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super Flow<? extends java.util.List<TrackerActivityResponse>>> continuation);

    java.lang.Object OLrzqt(@NotNull TrackerTrendRequest trackerTrendRequest, @NotNull Continuation<? super AbstractC43419rot<TrackerTrendResponse, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.Long l, int i, int i2, @NotNull AddressTrackerSortType addressTrackerSortType, boolean z, @NotNull Continuation<? super AbstractC43419rot<GetTrackingAddressListResponse, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, long j, @NotNull java.util.List<java.lang.Long> list2, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation);

    void OLrzqt();

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, java.lang.Long l, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation);

    void copydefault();
}
