package com.okinc.business.market.features.watch_list_groups.ui.filter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31200lpY;
import o.kCH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListFilterViewModel extends ViewModel {
    public final MutableStateFlow<kCH> AEQbTJ;
    public final StateFlow<kCH> EZpvd;
    public final SavedStateHandle copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<kCH> OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public WatchListFilterViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = savedStateHandle;
        MutableStateFlow<kCH> MutableStateFlow = StateFlowKt.MutableStateFlow(new kCH(KWHzl().copydefault().djBIcL(), KWHzl().copydefault().copydefault(), KWHzl(KWHzl().copydefault())));
        this.AEQbTJ = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final WatchListFilterParams KWHzl() {
        WatchListFilterParams watchListFilterParams = (WatchListFilterParams) this.copydefault.get("key.watchlist_filter");
        return watchListFilterParams == null ? (WatchListFilterParams) C31200lpY.throwIfDebug$default(new WatchListFilterParams(null, null, null, false, 15, null), null, 2, null) : watchListFilterParams;
    }

    public final void KWHzl(@NotNull TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        KWHzl(kCH.copy$default(this.AEQbTJ.getValue(), timeIntervalType, null, false, 6, null));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kCH.copy$default(o.kCH, com.okinc.business.market.common.constants.TimeIntervalType, com.okinc.business.dexlogic.main.market.chain.MarketChainBean, boolean, int, java.lang.Object):o.kCH */
    public final void KWHzl(@NotNull MarketChainBean marketChainBean) {
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        KWHzl(kCH.copy$default(this.AEQbTJ.getValue(), null, marketChainBean, false, 5, null));
    }

    public final void KWHzl(kCH kch) {
        String str = null;
        int i = 0;
        this.AEQbTJ.setValue(kCH.copy$default(kch, null, null, KWHzl(new HomeFavoriteListFilter(str, i, kch.AEQbTJ(), null, false, kch.KWHzl(), null, 91, null)), 3, null));
    }

    public final boolean KWHzl(HomeFavoriteListFilter homeFavoriteListFilter) {
        String chainId = homeFavoriteListFilter.copydefault().getChainId();
        HomeFavoriteListFilter.Activity activity = HomeFavoriteListFilter.Companion;
        return (Intrinsics.EZpvd((Object) chainId, (Object) activity.KWHzl().copydefault().getChainId()) && homeFavoriteListFilter.djBIcL() == activity.KWHzl().djBIcL()) ? false : true;
    }
}
