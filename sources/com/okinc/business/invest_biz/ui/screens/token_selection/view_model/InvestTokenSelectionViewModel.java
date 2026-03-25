package com.okinc.business.invest_biz.ui.screens.token_selection.view_model;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C26608jfY;
import o.C26663jga;
import o.C27493jwI;
import o.InterfaceC26664jgb;
import o.iDA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTokenSelectionViewModel extends ViewModel implements InterfaceC26664jgb {
    public final iDA AEQbTJ;
    public final Flow<C26663jga> AhwBna;
    public final Flow<List<C26608jfY>> EZpvd;
    public final Flow<List<C26608jfY>> KWHzl;
    public final MutableStateFlow<C26663jga> OLrzqt;
    public final MutableStateFlow<String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26664jgb
    public Flow<C26663jga> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26664jgb
    public Flow<List<C26608jfY>> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public InvestTokenSelectionViewModel(@NotNull iDA ida) {
        Intrinsics.checkNotNullParameter(ida, "");
        this.AEQbTJ = ida;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.copydefault = MutableStateFlow;
        MutableStateFlow<C26663jga> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C26663jga(null, true, null, 5, null));
        this.OLrzqt = MutableStateFlow2;
        Flow<List<C26608jfY>> flowCombine = FlowKt.combine(MutableStateFlow2, MutableStateFlow, new InvestTokenSelectionViewModel$_listState$1(null));
        this.EZpvd = flowCombine;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        this.KWHzl = flowCombine;
    }

    @Override // o.InterfaceC26664jgb
    public void OLrzqt(@NotNull String str, @NotNull TokenSelectionParams tokenSelectionParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenSelectionParams, "");
        this.copydefault.setValue(str);
    }

    @Override // o.InterfaceC26664jgb
    public InvestTokenWithAmount copydefault(@NotNull C26608jfY c26608jfY) {
        Object next;
        Intrinsics.checkNotNullParameter(c26608jfY, "");
        Iterator<T> it = this.OLrzqt.getValue().KWHzl().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next).getTokenAddress(), (Object) c26608jfY.copydefault())) {
                break;
            }
        }
        return (InvestTokenWithAmount) next;
    }

    @Override // o.InterfaceC26664jgb
    public void AEQbTJ(@NotNull TokenSelectionParams tokenSelectionParams) {
        Intrinsics.checkNotNullParameter(tokenSelectionParams, "");
        MutableStateFlow<C26663jga> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new C26663jga(null, true, null, 5, null))) {
        }
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestTokenSelectionViewModel$loadInitialData$2(this, tokenSelectionParams, null), 3, null);
    }
}
