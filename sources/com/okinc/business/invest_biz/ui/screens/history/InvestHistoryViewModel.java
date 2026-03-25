package com.okinc.business.invest_biz.ui.screens.history;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.models.InvestHistoryBean;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC26383jbL;
import o.AbstractC26387jbP;
import o.AbstractC33073mpa;
import o.InterfaceC23641iDx;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHistoryViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<AbstractC26383jbL> AEQbTJ;
    public int AYXKKw;
    public final InterfaceC23641iDx AhwBna;
    public final LinkedHashSet<InvestHistoryBean> EZpvd;
    public final MutableSharedFlow<AbstractC26387jbP> KWHzl;
    public final SharedFlow<AbstractC26387jbP> OLrzqt;
    public final StateFlow<AbstractC26383jbL> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC26387jbP> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC26383jbL> copydefault() {
        return this.copydefault;
    }

    @yCM
    public InvestHistoryViewModel(@NotNull InterfaceC23641iDx interfaceC23641iDx) {
        Intrinsics.checkNotNullParameter(interfaceC23641iDx, "");
        this.AhwBna = interfaceC23641iDx;
        this.EZpvd = new LinkedHashSet<>();
        MutableStateFlow<AbstractC26383jbL> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC26383jbL.TaskDescription.EZpvd);
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<AbstractC26387jbP> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AYXKKw = 1;
    }

    public final void KWHzl(long j, long j2, @NotNull LoadHistoryType loadHistoryType, int i, boolean z) {
        Intrinsics.checkNotNullParameter(loadHistoryType, "");
        if (loadHistoryType == LoadHistoryType.REFRESH_PAGE) {
            this.AYXKKw = 1;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHistoryViewModel$loadHistoryOrders$1(z, this, j, j2, i, loadHistoryType, null), 3, null);
    }
}
