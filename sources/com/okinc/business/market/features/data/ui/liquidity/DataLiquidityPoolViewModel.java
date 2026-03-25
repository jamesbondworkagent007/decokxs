package com.okinc.business.market.features.data.ui.liquidity;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C26088jRm;
import o.jQN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DataLiquidityPoolViewModel extends ViewModel {
    public final jQN EZpvd;
    public final StateFlow<C26088jRm> KWHzl;
    public final MutableStateFlow<C26088jRm> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C26088jRm> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public DataLiquidityPoolViewModel(@NotNull jQN jqn) {
        Intrinsics.checkNotNullParameter(jqn, "");
        this.EZpvd = jqn;
        MutableStateFlow<C26088jRm> MutableStateFlow = StateFlowKt.MutableStateFlow(new C26088jRm(true, false, null, 6, null));
        this.OLrzqt = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt.setValue(new C26088jRm(true, false, null, 6, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DataLiquidityPoolViewModel$getLiquidityList$1(this, str, str2, null), 3, null);
    }

    public final void EZpvd(@NotNull List<LiquidityPoolPairUIItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.OLrzqt.getValue().OLrzqt() || list.isEmpty()) {
            return;
        }
        this.OLrzqt.setValue(new C26088jRm(false, false, list, 3, null));
    }
}
