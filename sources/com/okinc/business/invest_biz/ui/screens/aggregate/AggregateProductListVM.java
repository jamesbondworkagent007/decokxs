package com.okinc.business.invest_biz.ui.screens.aggregate;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C23692iFu;
import o.C27493jwI;
import o.C55276xgr;
import o.InterfaceC23688iFq;
import o.InterfaceC23690iFs;
import o.iWU;
import o.iWV;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AggregateProductListVM extends ViewModel {
    public final MutableStateFlow<C55276xgr> AEQbTJ;
    public final C23692iFu AYXKKw;
    public final InterfaceC23690iFs AhwBna;
    public final InterfaceC23688iFq DbNXlk;
    public final MutableStateFlow<iWU> EZpvd;
    public final MutableStateFlow<iWV> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final StateFlow<C55276xgr> copydefault;
    public final StateFlow<iWU> djBIcL;
    public final SharedFlow<Unit> gEmmrt;
    public final StateFlow<iWV> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C55276xgr> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<iWV> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<iWU> OLrzqt() {
        return this.djBIcL;
    }

    @yCM
    public AggregateProductListVM(@NotNull InterfaceC23690iFs interfaceC23690iFs, @NotNull InterfaceC23688iFq interfaceC23688iFq, @NotNull C23692iFu c23692iFu) {
        Intrinsics.checkNotNullParameter(interfaceC23690iFs, "");
        Intrinsics.checkNotNullParameter(interfaceC23688iFq, "");
        Intrinsics.checkNotNullParameter(c23692iFu, "");
        this.AhwBna = interfaceC23690iFs;
        this.DbNXlk = interfaceC23688iFq;
        this.AYXKKw = c23692iFu;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<iWU> MutableStateFlow = StateFlowKt.MutableStateFlow(iWU.Application.EZpvd);
        this.EZpvd = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<iWV> MutableStateFlow2 = StateFlowKt.MutableStateFlow(iWV.StateListAnimator.OLrzqt);
        this.KWHzl = MutableStateFlow2;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<C55276xgr> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow3;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final void KWHzl(int i, String str, String str2) {
        this.EZpvd.setValue(iWU.Application.EZpvd);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AggregateProductListVM$fetchHeaderData$1(this, i, str, str2, null), 3, null);
    }

    public final Job copydefault() {
        return C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AggregateProductListVM$refreshData$1(this, null), 3, null);
    }

    public final void AEQbTJ(C55276xgr c55276xgr) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AggregateProductListVM$updateCommonFilter$1(this, c55276xgr, null), 3, null);
    }

    public final void copydefault(Integer num) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AggregateProductListVM$trackTabChange$1(this, num, null), 3, null);
    }

    public static /* synthetic */ void trackScreenView$default(AggregateProductListVM aggregateProductListVM, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        aggregateProductListVM.AEQbTJ(num, str);
    }

    public final void AEQbTJ(Integer num, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AggregateProductListVM$trackScreenView$1(this, num, str, null), 3, null);
    }
}
