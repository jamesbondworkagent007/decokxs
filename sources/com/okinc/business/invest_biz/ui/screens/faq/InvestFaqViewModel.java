package com.okinc.business.invest_biz.ui.screens.faq;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC26375jbD;
import o.AbstractC33073mpa;
import o.InterfaceC23641iDx;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestFaqViewModel extends AbstractC33073mpa {
    public final StateFlow<AbstractC26375jbD> AEQbTJ;
    public final InterfaceC23641iDx EZpvd;
    public final MutableStateFlow<AbstractC26375jbD> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC26375jbD> KWHzl() {
        return this.AEQbTJ;
    }

    @yCM
    public InvestFaqViewModel(@NotNull InterfaceC23641iDx interfaceC23641iDx) {
        Intrinsics.checkNotNullParameter(interfaceC23641iDx, "");
        this.EZpvd = interfaceC23641iDx;
        MutableStateFlow<AbstractC26375jbD> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC26375jbD.ActionBar.KWHzl);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestFaqViewModel$loadFaqData$1(this, null), 3, null);
    }
}
