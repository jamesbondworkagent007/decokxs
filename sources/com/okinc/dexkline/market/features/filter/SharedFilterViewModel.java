package com.okinc.dexkline.market.features.filter;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.market.features.filter.SharedFilterViewModel;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32866mlf;
import o.C34663ngO;
import o.mUR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SharedFilterViewModel extends ViewModel {
    public final StateFlow<ChartDetailSubTabName> AEQbTJ;
    public final MutableSharedFlow<TokenFilter> EZpvd;
    public final HashMap<String, TokenFilter> KWHzl;
    public HashMap<String, String> OLrzqt;
    public final MutableStateFlow<ChartDetailSubTabName> copydefault;
    public final SharedFlow<TokenFilter> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TokenFilter> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ChartDetailSubTabName> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public SharedFilterViewModel() {
        MutableSharedFlow<TokenFilter> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.KWHzl = new HashMap<>();
        MutableStateFlow<ChartDetailSubTabName> MutableStateFlow = StateFlowKt.MutableStateFlow(ChartDetailSubTabName.HISTORY_CHANGE);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.OLrzqt = new HashMap<>();
    }

    public final void EZpvd(@NotNull final TokenFilter tokenFilter, boolean z) {
        String str;
        TokenFilter tokenFilterAEQbTJ;
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        final String tabName = this.copydefault.getValue().getTabName();
        C34663ngO.OLrzqt(EZpvd().copydefault(), new Function1() { // from class: o.mYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SharedFilterViewModel.AEQbTJ(this.OLrzqt, tabName, (java.lang.String) obj);
            }
        });
        if (!tokenFilter.EZpvd().isEmpty() || z) {
            str = tabName;
            tokenFilterAEQbTJ = tokenFilter;
        } else {
            String str2 = this.OLrzqt.get(tabName);
            str = tabName;
            tokenFilterAEQbTJ = tokenFilter.AEQbTJ((15359 & 1) != 0 ? tokenFilter.copydefault : null, (15359 & 2) != 0 ? tokenFilter.isConnected : null, (15359 & 4) != 0 ? tokenFilter.DbNXlk : null, (15359 & 8) != 0 ? tokenFilter.AhwBna : null, (15359 & 16) != 0 ? tokenFilter.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilter.valueOf : false, (15359 & 64) != 0 ? tokenFilter.djBIcL : false, (15359 & 128) != 0 ? tokenFilter.EZpvd : str2 == null ? "" : str2, (15359 & 256) != 0 ? tokenFilter.AYXKKw : false, (15359 & 512) != 0 ? tokenFilter.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilter.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilter.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilter.KWHzl : null, (15359 & 8192) != 0 ? tokenFilter.AkhnZx : null);
        }
        this.KWHzl.put(str, tokenFilterAEQbTJ);
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SharedFilterViewModel$setTokenFilter$2(this, tokenFilterAEQbTJ, null), 3, null);
        if (z) {
            C32866mlf.onEvent$default("CedefiMarket_Token_HistoryAddressLabel_Click", (TrackChannel[]) null, new Function1() { // from class: o.mYV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SharedFilterViewModel.OLrzqt(tokenFilter, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }
    }

    public static final Unit AEQbTJ(SharedFilterViewModel sharedFilterViewModel, String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        sharedFilterViewModel.OLrzqt.put(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(TokenFilter tokenFilter, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chain_id", tokenFilter.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", tokenFilter.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", tokenFilter.DbNXlk(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", tokenFilter.fetchVPNInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_label", tokenFilter.copydefault(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final TokenFilter EZpvd() {
        TokenFilter tokenFilter = this.KWHzl.get(this.copydefault.getValue().getTabName());
        return tokenFilter == null ? new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, null, 16383, null) : tokenFilter;
    }

    public final void EZpvd(@NotNull ChartDetailSubTabName chartDetailSubTabName) {
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        this.KWHzl.clear();
        this.OLrzqt.clear();
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SharedFilterViewModel$clearCache$1(this, null), 3, null);
        MutableStateFlow<ChartDetailSubTabName> mutableStateFlow = this.copydefault;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), chartDetailSubTabName)) {
        }
    }

    public final void KWHzl(@NotNull ChartDetailSubTabName chartDetailSubTabName) {
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        MutableStateFlow<ChartDetailSubTabName> mutableStateFlow = this.copydefault;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), chartDetailSubTabName)) {
        }
    }
}
