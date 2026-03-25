package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.vNB;
import o.wTK;
import o.wTT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListViewModel extends AbstractC33073mpa {
    public final Flow<vNB<Pair<List<BillsArchive>, InterestInfoResponse>>> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final MutableStateFlow<vNB<List<BillsArchive>>> KWHzl;
    public final MutableStateFlow<vNB<InterestInfoResponse>> OLrzqt;
    public final wTK copydefault;
    public final wTT gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<vNB<Pair<List<BillsArchive>, InterestInfoResponse>>> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public TacticsListViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull wTK wtk, @NotNull wTT wtt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(wtk, "");
        Intrinsics.checkNotNullParameter(wtt, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = wtk;
        this.gEmmrt = wtt;
        vNB.Activity activity = vNB.Activity.copydefault;
        MutableStateFlow<vNB<List<BillsArchive>>> MutableStateFlow = StateFlowKt.MutableStateFlow(activity);
        this.KWHzl = MutableStateFlow;
        MutableStateFlow<vNB<InterestInfoResponse>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(activity);
        this.OLrzqt = MutableStateFlow2;
        this.AEQbTJ = FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new TacticsListViewModel$borrowInterest$1(null));
    }

    public final void AEQbTJ(Long l, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<vNB<List<BillsArchive>>> mutableStateFlow = this.KWHzl;
        vNB.Activity activity = vNB.Activity.copydefault;
        mutableStateFlow.setValue(activity);
        this.OLrzqt.setValue(activity);
        EZpvd(l);
        if (z) {
            this.OLrzqt.setValue(new vNB.TaskDescription(null));
        } else {
            copydefault(str);
        }
    }

    private final void EZpvd(Long l) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new TacticsListViewModel$getBillArchive$1(this, l, null), 2, null);
    }

    private final void copydefault(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new TacticsListViewModel$getInterestInfo$1(this, str, null), 2, null);
    }
}
