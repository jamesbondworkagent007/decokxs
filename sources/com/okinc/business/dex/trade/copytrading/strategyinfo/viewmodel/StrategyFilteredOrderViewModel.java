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
import o.C20006gXk;
import o.InterfaceC20068gZs;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyFilteredOrderViewModel extends AbstractC33073mpa {
    public final C20004gXi AEQbTJ;
    public String EZpvd;
    public final MutableStateFlow<InterfaceC20068gZs> KWHzl;
    public final StateFlow<InterfaceC20068gZs> OLrzqt;
    public final C20006gXk copydefault;
    public String gEmmrt;
    public final C19700gMb valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC20068gZs> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<InterfaceC20068gZs> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    @yCM
    public StrategyFilteredOrderViewModel(@NotNull C20006gXk c20006gXk, @NotNull C19700gMb c19700gMb, @NotNull C20004gXi c20004gXi) {
        Intrinsics.checkNotNullParameter(c20006gXk, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c20004gXi, "");
        this.copydefault = c20006gXk;
        this.valueOf = c19700gMb;
        this.AEQbTJ = c20004gXi;
        this.gEmmrt = "";
        MutableStateFlow<InterfaceC20068gZs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC20068gZs.TaskDescription.OLrzqt);
        this.KWHzl = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC20068gZs.StateListAnimator copydefault() {
        InterfaceC20068gZs value = this.KWHzl.getValue();
        if (value instanceof InterfaceC20068gZs.StateListAnimator) {
            return (InterfaceC20068gZs.StateListAnimator) value;
        }
        return null;
    }

    public static /* synthetic */ void loadFilteredOrders$default(StrategyFilteredOrderViewModel strategyFilteredOrderViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        strategyFilteredOrderViewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        InterfaceC20068gZs interfaceC20068gZs;
        MutableStateFlow<InterfaceC20068gZs> mutableStateFlow = this.KWHzl;
        if (z) {
            interfaceC20068gZs = InterfaceC20068gZs.Activity.OLrzqt;
        } else {
            interfaceC20068gZs = InterfaceC20068gZs.TaskDescription.OLrzqt;
        }
        mutableStateFlow.setValue(interfaceC20068gZs);
        this.EZpvd = null;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyFilteredOrderViewModel$loadFilteredOrders$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyFilteredOrderViewModel$loadMoreFilteredOrders$1(this, null), 3, null);
    }
}
