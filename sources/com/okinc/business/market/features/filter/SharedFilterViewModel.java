package com.okinc.business.market.features.filter;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.HashMap;
import java.util.Locale;
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
import o.C25389ivm;
import o.C31256lqb;
import o.C32866mlf;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SharedFilterViewModel extends ViewModel {
    public final StateFlow<ChartDetailSubTabName> AEQbTJ;
    public final SharedFlow<TokenFilter> AYXKKw;
    public final HashMap<String, TokenFilter> EZpvd;
    public final MutableStateFlow<ChartDetailSubTabName> KWHzl;
    public HashMap<String, String> OLrzqt;
    public final MutableSharedFlow<TokenFilter> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ChartDetailSubTabName> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TokenFilter> OLrzqt() {
        return this.AYXKKw;
    }

    @yCM
    public SharedFilterViewModel() {
        MutableSharedFlow<TokenFilter> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.EZpvd = new HashMap<>();
        MutableStateFlow<ChartDetailSubTabName> MutableStateFlow = StateFlowKt.MutableStateFlow(ChartDetailSubTabName.HISTORY_CHANGE);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.OLrzqt = new HashMap<>();
    }

    public final void KWHzl(@NotNull final TokenFilter tokenFilter, boolean z) {
        String str;
        TokenFilter tokenFilterOLrzqt;
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        final String tabName = this.KWHzl.getValue().getTabName();
        C31256lqb.EZpvd(copydefault().EZpvd(), new Function1() { // from class: o.jUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SharedFilterViewModel.EZpvd(this.copydefault, tabName, (java.lang.String) obj);
            }
        });
        if (!tokenFilter.OLrzqt().isEmpty() || z) {
            str = tabName;
            tokenFilterOLrzqt = tokenFilter;
        } else {
            String str2 = this.OLrzqt.get(tabName);
            str = tabName;
            tokenFilterOLrzqt = tokenFilter.OLrzqt((6143 & 1) != 0 ? tokenFilter.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilter.isConnected : null, (6143 & 4) != 0 ? tokenFilter.AkhnZx : null, (6143 & 8) != 0 ? tokenFilter.AhwBna : null, (6143 & 16) != 0 ? tokenFilter.KWHzl : null, (6143 & 32) != 0 ? tokenFilter.AYXKKw : false, (6143 & 64) != 0 ? tokenFilter.valueOf : false, (6143 & 128) != 0 ? tokenFilter.EZpvd : str2 == null ? "" : str2, (6143 & 256) != 0 ? tokenFilter.gEmmrt : false, (6143 & 512) != 0 ? tokenFilter.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilter.copydefault : null, (6143 & 2048) != 0 ? tokenFilter.djBIcL : null, (6143 & 4096) != 0 ? tokenFilter.fetchVPNInfo : null);
        }
        this.EZpvd.put(str, tokenFilterOLrzqt);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SharedFilterViewModel$setTokenFilter$2(this, tokenFilterOLrzqt, null), 3, null);
        if (z) {
            C32866mlf.onEvent$default("DEXMarket_Token_HolderLabel_Click", (TrackChannel[]) null, new Function1() { // from class: o.jUF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SharedFilterViewModel.copydefault(tokenFilter, this, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }
    }

    public static final Unit EZpvd(SharedFilterViewModel sharedFilterViewModel, String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        sharedFilterViewModel.OLrzqt.put(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(TokenFilter tokenFilter, SharedFilterViewModel sharedFilterViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_chain", tokenFilter.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", tokenFilter.isConnected(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", sharedFilterViewModel.KWHzl.getValue().getTabName(), false, 4, null);
        String lowerCase = tokenFilter.EZpvd().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (lowerCase.length() == 0) {
            lowerCase = "all";
        }
        EventParamsList.put$default(eventParamsList, "holder_label_tab", lowerCase, false, 4, null);
        return Unit.INSTANCE;
    }

    public final TokenFilter copydefault() {
        TokenFilter tokenFilter = this.EZpvd.get(this.KWHzl.getValue().getTabName());
        return tokenFilter == null ? new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, 8191, null) : tokenFilter;
    }

    public final void AEQbTJ(@NotNull ChartDetailSubTabName chartDetailSubTabName) {
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        this.EZpvd.clear();
        this.OLrzqt.clear();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SharedFilterViewModel$clearCache$1(this, null), 3, null);
        MutableStateFlow<ChartDetailSubTabName> mutableStateFlow = this.KWHzl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), chartDetailSubTabName)) {
        }
    }

    public final void OLrzqt(@NotNull ChartDetailSubTabName chartDetailSubTabName) {
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        MutableStateFlow<ChartDetailSubTabName> mutableStateFlow = this.KWHzl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), chartDetailSubTabName)) {
        }
    }
}
