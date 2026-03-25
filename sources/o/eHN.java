package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignViewModel$handleBluetoothConnected$1;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.eHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eHN extends ViewModel implements InterfaceC15430eIa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC57039yar AEQbTJ;
    public final MutableStateFlow<eHO> AYXKKw;
    public final C15446eIq AhwBna;
    public final StateFlow<eHS> DbNXlk;
    public final C15438eIi EZpvd;
    public final C15443eIn KWHzl;
    public java.lang.String OLrzqt;
    public final java.lang.String djBIcL;
    public final C15451eIv fetchVPNInfo;
    public final OneKeySignHelper.OneKeySignData gEmmrt;
    public final C15455eIz isConnected;
    public final StateFlow<eHO> valueOf;
    public final C15453eIx values;

    public interface Activity {
        eHN AEQbTJ(@NotNull SavedStateHandle savedStateHandle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC15430eIa
    public StateFlow<eHS> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<eHO> OLrzqt() {
        return this.valueOf;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eHN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public eHN(@NotNull eHT eht, @NotNull C15443eIn c15443eIn, @NotNull C15438eIi c15438eIi, @NotNull C15446eIq c15446eIq, @NotNull C15453eIx c15453eIx, @NotNull C15451eIv c15451eIv, @NotNull C15455eIz c15455eIz, @NotNull InterfaceC57039yar interfaceC57039yar, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(eht, "");
        Intrinsics.checkNotNullParameter(c15443eIn, "");
        Intrinsics.checkNotNullParameter(c15438eIi, "");
        Intrinsics.checkNotNullParameter(c15446eIq, "");
        Intrinsics.checkNotNullParameter(c15453eIx, "");
        Intrinsics.checkNotNullParameter(c15451eIv, "");
        Intrinsics.checkNotNullParameter(c15455eIz, "");
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = c15443eIn;
        this.EZpvd = c15438eIi;
        this.AhwBna = c15446eIq;
        this.values = c15453eIx;
        this.fetchVPNInfo = c15451eIv;
        this.isConnected = c15455eIz;
        this.AEQbTJ = interfaceC57039yar;
        this.djBIcL = (java.lang.String) savedStateHandle.get("rootWalletId");
        this.gEmmrt = (OneKeySignHelper.OneKeySignData) savedStateHandle.get("signData");
        this.DbNXlk = FlowKt.stateIn(eht.EZpvd(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), new eHS(0, false, 3, null));
        MutableStateFlow<eHO> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AYXKKw = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // o.InterfaceC15430eIa
    public void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CheckAndSignViewModel$handleBluetoothConnected$1(this, null), 3, null);
    }

    public final java.lang.Object EZpvd(OneKeyConnectedDevice oneKeyConnectedDevice, OneKeySignHelper.OneKeySignData oneKeySignData, Continuation<? super eHO> continuation) {
        if (oneKeySignData == null) {
            pUU.copydefault("CheckAndSignViewModel", "signData: signData is null");
            return new eHO.Application(new OneKeyException("signData is null"));
        }
        if (oneKeySignData instanceof OneKeySignHelper.OneKeySignData.BtcTransaction) {
            return this.AhwBna.KWHzl(oneKeyConnectedDevice, ((OneKeySignHelper.OneKeySignData.BtcTransaction) oneKeySignData).EZpvd(), continuation);
        }
        if (oneKeySignData instanceof OneKeySignHelper.OneKeySignData.EvmTransaction) {
            OneKeySignHelper.OneKeySignData.EvmTransaction evmTransaction = (OneKeySignHelper.OneKeySignData.EvmTransaction) oneKeySignData;
            return this.values.AEQbTJ(oneKeyConnectedDevice, evmTransaction.KWHzl(), evmTransaction.copydefault(), continuation);
        }
        if (oneKeySignData instanceof OneKeySignHelper.OneKeySignData.EvmTypedData) {
            OneKeySignHelper.OneKeySignData.EvmTypedData evmTypedData = (OneKeySignHelper.OneKeySignData.EvmTypedData) oneKeySignData;
            return this.fetchVPNInfo.OLrzqt(oneKeyConnectedDevice, evmTypedData.KWHzl(), evmTypedData.EZpvd(), continuation);
        }
        if (!(oneKeySignData instanceof OneKeySignHelper.OneKeySignData.EvmMessage)) {
            throw new NoWhenBranchMatchedException();
        }
        OneKeySignHelper.OneKeySignData.EvmMessage evmMessage = (OneKeySignHelper.OneKeySignData.EvmMessage) oneKeySignData;
        return this.isConnected.OLrzqt(oneKeyConnectedDevice, evmMessage.OLrzqt(), evmMessage.KWHzl(), continuation);
    }

    @Override // o.InterfaceC15430eIa
    public void copydefault() {
        java.lang.String str = this.OLrzqt;
        if (str != null) {
            this.AEQbTJ.EZpvd(str);
        }
    }
}
