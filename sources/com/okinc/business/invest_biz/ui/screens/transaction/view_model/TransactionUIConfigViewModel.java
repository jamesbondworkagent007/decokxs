package com.okinc.business.invest_biz.ui.screens.transaction.view_model;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C27493jwI;
import o.InterfaceC24182iXy;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TransactionUIConfigViewModel extends ViewModel {
    public final SavedStateHandle AEQbTJ;
    public final StateFlow<InterfaceC24182iXy> EZpvd;
    public final MutableStateFlow<InterfaceC24182iXy> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24182iXy> EZpvd() {
        return this.EZpvd;
    }

    @yCM
    public TransactionUIConfigViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = savedStateHandle;
        MutableStateFlow<InterfaceC24182iXy> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC24182iXy.ActionBar.copydefault);
        this.copydefault = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionConfig AEQbTJ() {
        TransactionConfig transactionConfig = (TransactionConfig) this.AEQbTJ.get("key.trx_config");
        if (transactionConfig != null) {
            return transactionConfig;
        }
        throw new IllegalArgumentException("TransactionConfig can't null");
    }

    public final void OLrzqt(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        this.AEQbTJ.set("key.trx_config", transactionConfig);
    }

    public final void OLrzqt() {
        this.copydefault.setValue(InterfaceC24182iXy.ActionBar.copydefault);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TransactionUIConfigViewModel$generateActivityContent$1(this, null), 3, null);
    }
}
