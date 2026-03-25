package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C15438eIi;
import o.C15443eIn;
import o.InterfaceC15430eIa;
import o.InterfaceC57039yar;
import o.eHS;
import o.eHT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckSeedPhraseNotChangedViewModel extends ViewModel implements InterfaceC15430eIa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public String AEQbTJ;
    public final StateFlow<eHS> AYXKKw;
    public final MutableStateFlow<OneKeyConnectEvent> AhwBna;
    public final InterfaceC57039yar EZpvd;
    public final C15443eIn KWHzl;
    public final C15438eIi copydefault;
    public final String gEmmrt;
    public final StateFlow<OneKeyConnectEvent> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<OneKeyConnectEvent> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC15430eIa
    public StateFlow<eHS> KWHzl() {
        return this.AYXKKw;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckSeedPhraseNotChangedViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCM
    public CheckSeedPhraseNotChangedViewModel(@NotNull InterfaceC57039yar interfaceC57039yar, @NotNull eHT eht, @NotNull C15443eIn c15443eIn, @NotNull C15438eIi c15438eIi, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        Intrinsics.checkNotNullParameter(eht, "");
        Intrinsics.checkNotNullParameter(c15443eIn, "");
        Intrinsics.checkNotNullParameter(c15438eIi, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = interfaceC57039yar;
        this.KWHzl = c15443eIn;
        this.copydefault = c15438eIi;
        this.gEmmrt = (String) savedStateHandle.get("rootWalletId");
        MutableStateFlow<OneKeyConnectEvent> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AhwBna = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        this.AYXKKw = FlowKt.stateIn(eht.EZpvd(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), new eHS(0, false, 3, null));
    }

    @Override // o.InterfaceC15430eIa
    public void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CheckSeedPhraseNotChangedViewModel$handleBluetoothConnected$1(this, null), 3, null);
    }

    @Override // o.InterfaceC15430eIa
    public void copydefault() {
        String str = this.AEQbTJ;
        if (str != null) {
            this.EZpvd.EZpvd(str);
        }
    }
}
