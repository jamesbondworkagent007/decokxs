package com.okinc.business.market.features.smart_money.ui;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C29512kuz;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SmartMoneySharedViewModel extends ViewModel {
    public final MutableStateFlow<SmartMoneyConfig> AEQbTJ;
    public final C29512kuz EZpvd;
    public boolean KWHzl;
    public final StateFlow<SmartMoneyConfig> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<SmartMoneyConfig> copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public SmartMoneySharedViewModel(@NotNull C29512kuz c29512kuz) {
        Intrinsics.checkNotNullParameter(c29512kuz, "");
        this.EZpvd = c29512kuz;
        MutableStateFlow<SmartMoneyConfig> MutableStateFlow = StateFlowKt.MutableStateFlow(new SmartMoneyConfig(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null));
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt() {
        if (EZpvd()) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SmartMoneySharedViewModel$loadSignalConfig$1(this, null), 3, null);
    }

    public final boolean EZpvd() {
        return !Intrinsics.EZpvd(this.AEQbTJ.getValue(), new SmartMoneyConfig(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null));
    }
}
