package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C15432eIc;
import o.InterfaceC15430eIa;
import o.InterfaceC57039yar;
import o.eHS;
import o.eHT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckWalletNotAddedViewModel extends ViewModel implements InterfaceC15430eIa {
    public final StateFlow<OneKeyConnectEvent> AEQbTJ;
    public final InterfaceC57039yar EZpvd;
    public final String KWHzl;
    public final MutableStateFlow<OneKeyConnectEvent> OLrzqt;
    public final C15432eIc copydefault;
    public final StateFlow<eHS> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC15430eIa
    public StateFlow<eHS> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<OneKeyConnectEvent> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public CheckWalletNotAddedViewModel(@NotNull InterfaceC57039yar interfaceC57039yar, @NotNull eHT eht, @NotNull C15432eIc c15432eIc, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        Intrinsics.checkNotNullParameter(eht, "");
        Intrinsics.checkNotNullParameter(c15432eIc, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = interfaceC57039yar;
        this.copydefault = c15432eIc;
        this.KWHzl = (String) savedStateHandle.get("connectId");
        this.djBIcL = FlowKt.stateIn(eht.EZpvd(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), new eHS(0, false, 3, null));
        MutableStateFlow<OneKeyConnectEvent> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // o.InterfaceC15430eIa
    public void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CheckWalletNotAddedViewModel$handleBluetoothConnected$1(this, null), 3, null);
    }

    @Override // o.InterfaceC15430eIa
    public void copydefault() {
        String str = this.KWHzl;
        if (str != null) {
            this.EZpvd.EZpvd(str);
        }
    }
}
