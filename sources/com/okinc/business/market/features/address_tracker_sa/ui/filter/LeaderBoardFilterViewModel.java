package com.okinc.business.market.features.address_tracker_sa.ui.filter;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC25705jDh;
import o.C25389ivm;
import o.C25666jBw;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardFilterViewModel extends ViewModel {
    public final C25666jBw AEQbTJ;
    public final Flow<AbstractC25705jDh> KWHzl;
    public final MutableStateFlow<AbstractC25705jDh> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<AbstractC25705jDh> EZpvd() {
        return this.KWHzl;
    }

    @yCM
    public LeaderBoardFilterViewModel(@NotNull C25666jBw c25666jBw) {
        Intrinsics.checkNotNullParameter(c25666jBw, "");
        this.AEQbTJ = c25666jBw;
        MutableStateFlow<AbstractC25705jDh> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC25705jDh.ActionBar.EZpvd);
        this.copydefault = MutableStateFlow;
        this.KWHzl = MutableStateFlow;
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardFilterViewModel$fetchFilterData$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull LeaderBoardFilterModel leaderBoardFilterModel) {
        Intrinsics.checkNotNullParameter(leaderBoardFilterModel, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardFilterViewModel$saveFilter$1(this, leaderBoardFilterModel, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardFilterViewModel$selectFilter$1(this, str, null), 3, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardFilterViewModel$deleteFilter$1(this, str, null), 3, null);
    }
}
