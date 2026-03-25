package com.okinc.business.dexlogic.liquiditypools;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.LiquidityPoolListingUIItem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.InterfaceC22375heF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityPoolTabListingViewModel extends AbstractC33073mpa {
    public final Flow<InterfaceC22375heF> KWHzl;
    public final MutableStateFlow<InterfaceC22375heF> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<InterfaceC22375heF> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public LiquidityPoolTabListingViewModel() {
        MutableStateFlow<InterfaceC22375heF> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC22375heF.StateListAnimator.OLrzqt);
        this.OLrzqt = MutableStateFlow;
        this.KWHzl = MutableStateFlow;
    }

    public final void AEQbTJ(@NotNull LiquidityPoolListingUIItem liquidityPoolListingUIItem) {
        Intrinsics.checkNotNullParameter(liquidityPoolListingUIItem, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LiquidityPoolTabListingViewModel$getLiquidityHistoryBottomSheetDetails$1(liquidityPoolListingUIItem, this, null), 3, null);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
