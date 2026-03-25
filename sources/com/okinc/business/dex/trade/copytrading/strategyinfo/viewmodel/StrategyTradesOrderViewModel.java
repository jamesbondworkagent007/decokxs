package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.C20004gXi;
import o.C20012gXq;
import o.InterfaceC20068gZs;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyTradesOrderViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<InterfaceC20068gZs> AEQbTJ;
    public final C20004gXi EZpvd;
    public final C20012gXq KWHzl;
    public String OLrzqt;
    public final StateFlow<InterfaceC20068gZs> copydefault;
    public String djBIcL;
    public final C19700gMb valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<InterfaceC20068gZs> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC20068gZs> copydefault() {
        return this.copydefault;
    }

    @yCM
    public StrategyTradesOrderViewModel(@NotNull C20012gXq c20012gXq, @NotNull C19700gMb c19700gMb, @NotNull C20004gXi c20004gXi) {
        Intrinsics.checkNotNullParameter(c20012gXq, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c20004gXi, "");
        this.KWHzl = c20012gXq;
        this.valueOf = c19700gMb;
        this.EZpvd = c20004gXi;
        this.djBIcL = "";
        MutableStateFlow<InterfaceC20068gZs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC20068gZs.TaskDescription.OLrzqt);
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC20068gZs.StateListAnimator KWHzl() {
        InterfaceC20068gZs value = this.AEQbTJ.getValue();
        if (value instanceof InterfaceC20068gZs.StateListAnimator) {
            return (InterfaceC20068gZs.StateListAnimator) value;
        }
        return null;
    }

    public static /* synthetic */ void loadTradesOrders$default(StrategyTradesOrderViewModel strategyTradesOrderViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        strategyTradesOrderViewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        InterfaceC20068gZs interfaceC20068gZs;
        MutableStateFlow<InterfaceC20068gZs> mutableStateFlow = this.AEQbTJ;
        if (z) {
            interfaceC20068gZs = InterfaceC20068gZs.Activity.OLrzqt;
        } else {
            interfaceC20068gZs = InterfaceC20068gZs.TaskDescription.OLrzqt;
        }
        mutableStateFlow.setValue(interfaceC20068gZs);
        this.OLrzqt = null;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyTradesOrderViewModel$loadTradesOrders$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyTradesOrderViewModel$loadMoreTradesOrders$1(this, null), 3, null);
    }
}
