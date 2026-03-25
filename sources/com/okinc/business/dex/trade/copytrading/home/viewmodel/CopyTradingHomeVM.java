package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.C25389ivm;
import o.InterfaceC19946gVe;
import o.gWN;
import o.gWP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingHomeVM extends AbstractC33073mpa {
    public final StateFlow<Boolean> AEQbTJ;
    public final StateFlow<Boolean> AYXKKw;
    public Long AhwBna;
    public final MutableStateFlow<InterfaceC19946gVe> EZpvd;
    public final StateFlow<InterfaceC19946gVe> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableStateFlow<Boolean> copydefault;
    public final gWN djBIcL;
    public final gWP gEmmrt;
    public final C19700gMb valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC19946gVe> copydefault() {
        return this.KWHzl;
    }

    @yCM
    public CopyTradingHomeVM(@NotNull gWN gwn, @NotNull gWP gwp, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(gwn, "");
        Intrinsics.checkNotNullParameter(gwp, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.djBIcL = gwn;
        this.gEmmrt = gwp;
        this.valueOf = c19700gMb;
        MutableStateFlow<InterfaceC19946gVe> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC19946gVe.ActionBar.OLrzqt);
        this.EZpvd = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.copydefault = MutableStateFlow2;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.OLrzqt = MutableStateFlow3;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final void EZpvd(@NotNull InterfaceC19946gVe interfaceC19946gVe) {
        Intrinsics.checkNotNullParameter(interfaceC19946gVe, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingHomeVM$updateHomeError$1(this, interfaceC19946gVe, null), 3, null);
    }

    public final void EZpvd(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingHomeVM$updateLoadingState$1(this, z, null), 3, null);
    }

    public final void AEQbTJ(Long l) {
        this.AhwBna = l;
        EZpvd();
    }

    public final void EZpvd() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingHomeVM$checkWalletState$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingHomeVM$trackViewEvent$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingHomeVM$trackClickEvent$1(this, str, null), 3, null);
    }
}
