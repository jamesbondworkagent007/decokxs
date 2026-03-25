package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.InterfaceC49371unL;
import o.fJP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletCheckStatusViewModel extends AbstractC33073mpa {
    public final fJP EZpvd;
    public final MutableStateFlow<InterfaceC49371unL<Boolean>> KWHzl;
    public StateFlow<? extends InterfaceC49371unL<Boolean>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.StateFlow<? extends o.unL<java.lang.Boolean>>, kotlinx.coroutines.flow.StateFlow<o.unL<java.lang.Boolean>> */
    public final StateFlow<InterfaceC49371unL<Boolean>> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public EscapePassKeyWalletCheckStatusViewModel(@NotNull fJP fjp) {
        Intrinsics.checkNotNullParameter(fjp, "");
        this.EZpvd = fjp;
        MutableStateFlow<InterfaceC49371unL<Boolean>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapePassKeyWalletCheckStatusViewModel$getEscapeStatus$1(this, null), 3, null);
    }
}
