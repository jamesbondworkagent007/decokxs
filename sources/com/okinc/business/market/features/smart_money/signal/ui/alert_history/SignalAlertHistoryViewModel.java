package com.okinc.business.market.features.smart_money.signal.ui.alert_history;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC29518kvE;
import o.C25389ivm;
import o.C29504kur;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalAlertHistoryViewModel extends ViewModel {
    public final StateFlow<AbstractC29518kvE> AEQbTJ;
    public final C29504kur OLrzqt;
    public final MutableStateFlow<AbstractC29518kvE> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC29518kvE> AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public SignalAlertHistoryViewModel(@NotNull C29504kur c29504kur) {
        Intrinsics.checkNotNullParameter(c29504kur, "");
        this.OLrzqt = c29504kur;
        MutableStateFlow<AbstractC29518kvE> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC29518kvE.Application.OLrzqt);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertHistoryViewModel$loadData$1(this, str, str2, list, null), 3, null);
    }
}
