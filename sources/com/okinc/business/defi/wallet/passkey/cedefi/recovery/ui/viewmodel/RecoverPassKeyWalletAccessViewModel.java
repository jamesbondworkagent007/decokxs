package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C17637fMs;
import o.InterfaceC49371unL;
import o.fLX;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class RecoverPassKeyWalletAccessViewModel extends AbstractC33073mpa {
    public final fLX AEQbTJ;
    public final MutableSharedFlow<InterfaceC49371unL<Boolean>> EZpvd;
    public final MutableSharedFlow<InterfaceC49371unL<Boolean>> KWHzl;
    public SharedFlow<? extends InterfaceC49371unL<Boolean>> OLrzqt;
    public final MutableStateFlow<InterfaceC49371unL<C17637fMs>> copydefault;
    public StateFlow<? extends InterfaceC49371unL<C17637fMs>> djBIcL;
    public SharedFlow<? extends InterfaceC49371unL<Boolean>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.SharedFlow<? extends o.unL<java.lang.Boolean>>, kotlinx.coroutines.flow.SharedFlow<o.unL<java.lang.Boolean>> */
    public final SharedFlow<InterfaceC49371unL<Boolean>> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.SharedFlow<? extends o.unL<java.lang.Boolean>>, kotlinx.coroutines.flow.SharedFlow<o.unL<java.lang.Boolean>> */
    public final SharedFlow<InterfaceC49371unL<Boolean>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.StateFlow<? extends o.unL<o.fMs>>, kotlinx.coroutines.flow.StateFlow<o.unL<o.fMs>> */
    public final StateFlow<InterfaceC49371unL<C17637fMs>> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public RecoverPassKeyWalletAccessViewModel(@NotNull fLX flx) {
        Intrinsics.checkNotNullParameter(flx, "");
        this.AEQbTJ = flx;
        MutableStateFlow<InterfaceC49371unL<C17637fMs>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<InterfaceC49371unL<Boolean>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<InterfaceC49371unL<Boolean>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecoverPassKeyWalletAccessViewModel$preCheckRecoverInfo$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecoverPassKeyWalletAccessViewModel$checkDeviceSupportPasskey$1(this, null), 3, null);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecoverPassKeyWalletAccessViewModel$checkAccountHasPasskey$1(this, null), 3, null);
    }
}
