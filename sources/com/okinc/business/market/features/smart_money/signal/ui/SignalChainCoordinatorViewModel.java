package com.okinc.business.market.features.smart_money.signal.ui;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C29635kxP;
import o.yCM;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalChainCoordinatorViewModel extends ViewModel {
    public final MutableStateFlow<C29635kxP> AEQbTJ;
    public final StateFlow<C29635kxP> copydefault;

    @yCM
    public SignalChainCoordinatorViewModel() {
        MutableStateFlow<C29635kxP> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }
}
