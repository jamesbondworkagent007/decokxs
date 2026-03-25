package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.RiskInfoVo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.vNB;
import o.wTU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ArbitragePositioningViewModel extends AbstractC33073mpa {
    public final StateFlow<vNB<RiskInfoVo>> AEQbTJ;
    public final MutableStateFlow<vNB<RiskInfoVo>> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final wTU copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<RiskInfoVo>> KWHzl() {
        return this.AEQbTJ;
    }

    @yCM
    public ArbitragePositioningViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull wTU wtu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(wtu, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = wtu;
        MutableStateFlow<vNB<RiskInfoVo>> MutableStateFlow = StateFlowKt.MutableStateFlow(vNB.Activity.copydefault);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void EZpvd() {
        this.KWHzl.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new ArbitragePositioningViewModel$fetchRiskInfo$1(this, null), 2, null);
    }
}
