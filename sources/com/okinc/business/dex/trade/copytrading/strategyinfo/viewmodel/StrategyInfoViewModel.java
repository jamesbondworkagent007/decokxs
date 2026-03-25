package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.gWN;
import o.gWP;
import o.gWU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyInfoViewModel extends AbstractC33073mpa {
    public final gWN AEQbTJ;
    public final C19700gMb AYXKKw;
    public final SharedFlow<String> AhwBna;
    public final MutableSharedFlow<String> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final gWP OLrzqt;
    public final MutableSharedFlow<gWU> copydefault;
    public final SharedFlow<gWU> djBIcL;
    public final SharedFlow<Unit> gEmmrt;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<gWU> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    @yCM
    public StrategyInfoViewModel(@NotNull C19700gMb c19700gMb, @NotNull gWN gwn, @NotNull gWP gwp) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(gwn, "");
        Intrinsics.checkNotNullParameter(gwp, "");
        this.AYXKKw = c19700gMb;
        this.AEQbTJ = gwn;
        this.OLrzqt = gwp;
        this.valueOf = "";
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<gWU> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default3;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.valueOf, (Object) str)) {
            return;
        }
        OLrzqt(str);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyInfoViewModel$reloadOrderByStrategyId$1(this, str, null), 3, null);
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyInfoViewModel$startPullToRefresh$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull gWU gwu) {
        Intrinsics.checkNotNullParameter(gwu, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyInfoViewModel$finishRefresh$1(this, gwu, null), 3, null);
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AYXKKw.KWHzl(str);
    }

    public final Flow<Boolean> copydefault() {
        return FlowKt.flow(new StrategyInfoViewModel$isSaAvailable$1(this, null));
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyInfoViewModel$trackViewEvent$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyInfoViewModel$trackClickEvent$1(this, str, str2, null), 3, null);
    }
}
