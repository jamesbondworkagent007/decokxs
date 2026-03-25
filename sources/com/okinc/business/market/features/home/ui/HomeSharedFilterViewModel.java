package com.okinc.business.market.features.home.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C25981jNn;
import o.C25983jNp;
import o.C28451kay;
import o.C28548kcp;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeSharedFilterViewModel extends ViewModel {
    public final C25981jNn AEQbTJ;
    public final StateFlow<C28451kay> EZpvd;
    public final MutableStateFlow<C28451kay> KWHzl;
    public final C28548kcp OLrzqt;
    public final C25983jNp copydefault;
    public final TimeIntervalType djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28451kay> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public HomeSharedFilterViewModel(@NotNull C25983jNp c25983jNp, @NotNull C25981jNn c25981jNn, @NotNull C28548kcp c28548kcp) {
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(c25981jNn, "");
        Intrinsics.checkNotNullParameter(c28548kcp, "");
        this.copydefault = c25983jNp;
        this.AEQbTJ = c25981jNn;
        this.OLrzqt = c28548kcp;
        TimeIntervalType timeIntervalType = (TimeIntervalType) BuildersKt__BuildersKt.runBlocking$default(null, new HomeSharedFilterViewModel$initialInterval$1(this, null), 1, null);
        this.djBIcL = timeIntervalType;
        MutableStateFlow<C28451kay> MutableStateFlow = StateFlowKt.MutableStateFlow(new C28451kay(null, timeIntervalType, timeIntervalType == null, null, 9, null));
        this.KWHzl = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
        AEQbTJ();
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeSharedFilterViewModel$changeNetworkByValidChainId$1(this, str, null), 3, null);
    }

    public final void AEQbTJ() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeSharedFilterViewModel$loadPopularChains$1(this, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kay.copy$default(o.kay, com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List, int, java.lang.Object):o.kay */
    public final void AEQbTJ(@NotNull HomeChainFilterUiModel homeChainFilterUiModel) {
        C28451kay value;
        Intrinsics.checkNotNullParameter(homeChainFilterUiModel, "");
        MutableStateFlow<C28451kay> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C28451kay.copy$default(value, homeChainFilterUiModel, null, false, null, 14, null)));
    }

    public final void copydefault(@NotNull TimeIntervalType timeIntervalType) {
        C28451kay value;
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        MutableStateFlow<C28451kay> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C28451kay.copy$default(value, null, timeIntervalType, false, null, 9, null)));
    }
}
