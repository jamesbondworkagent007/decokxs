package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.unify_trade.biz.FundingRateArbResult;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.vNB;
import o.wTS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbCustomOrderViewModel extends ViewModel {
    public final wTS AEQbTJ;
    public final StateFlow<vNB<FundingRateArbResult>> EZpvd;
    public final MutableStateFlow<vNB<FundingRateArbResult>> KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<FundingRateArbResult>> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public SmartArbCustomOrderViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull wTS wts) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(wts, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = wts;
        MutableStateFlow<vNB<FundingRateArbResult>> MutableStateFlow = StateFlowKt.MutableStateFlow(vNB.Activity.copydefault);
        this.KWHzl = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt() {
        this.KWHzl.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new SmartArbCustomOrderViewModel$fetchFundingRate$1(this, null), 2, null);
    }
}
