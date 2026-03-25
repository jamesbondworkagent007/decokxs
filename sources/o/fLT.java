package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapePassKeyWalletSignViewModel$batchEscapeAllTransaction$1;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapePassKeyWalletSignViewModel$signEscapeSingleTransaction$1;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapePassKeyWalletSignViewModel$updateCurrentSignSuccessStatus$1;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapePasskeyWalletInfoReq;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fLT extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<java.lang.Integer> AEQbTJ;
    public java.util.ArrayList<EscapeSignAddressData> AYXKKw;
    public boolean AhwBna;
    public final StateFlow<InterfaceC49371unL<PasskeyWalletCreateUopRes>> AkhnZx;
    public boolean DbNXlk;
    public final MutableStateFlow<InterfaceC49371unL<java.util.List<java.lang.Long>>> EZpvd;
    public final StateFlow<InterfaceC49371unL<java.util.List<java.lang.Long>>> OLrzqt;
    public final MutableStateFlow<InterfaceC49371unL<PasskeyWalletCreateUopRes>> copydefault;
    public int djBIcL;
    public java.lang.String fetchVPNInfo;
    public final C17652fNg<EscapePasskeyWalletInfoReq> gEmmrt;
    public final StateFlow<java.lang.Integer> isConnected;
    public final fJO valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<EscapeSignAddressData> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Integer> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.util.ArrayList<EscapeSignAddressData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AYXKKw = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC49371unL<java.util.List<java.lang.Long>>> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC49371unL<PasskeyWalletCreateUopRes>> valueOf() {
        return this.AkhnZx;
    }

    public fLT(@NotNull SavedStateHandle savedStateHandle, @NotNull C17652fNg<EscapePasskeyWalletInfoReq> c17652fNg, @NotNull fJO fjo) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c17652fNg, "");
        Intrinsics.checkNotNullParameter(fjo, "");
        this.gEmmrt = c17652fNg;
        this.valueOf = fjo;
        java.util.ArrayList<EscapeSignAddressData> arrayList = (java.util.ArrayList) savedStateHandle.get("escape_confirm_address_data");
        this.AYXKKw = arrayList == null ? new java.util.ArrayList<>() : arrayList;
        java.lang.Boolean bool = (java.lang.Boolean) savedStateHandle.get("escape_confirm_bound_web3_wallet");
        this.AhwBna = bool != null ? bool.booleanValue() : false;
        MutableStateFlow<InterfaceC49371unL<PasskeyWalletCreateUopRes>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow2;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<InterfaceC49371unL<java.util.List<java.lang.Long>>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow3;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fLT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapePassKeyWalletSignViewModel$signEscapeSingleTransaction$1(this, null), 3, null);
    }

    public final java.lang.String gEmmrt() {
        PasskeyWalletCreateUopRes passkeyWalletCreateUopRes;
        InterfaceC49371unL<PasskeyWalletCreateUopRes> value = this.AkhnZx.getValue();
        InterfaceC49371unL.Activity activity = value instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) value : null;
        if (activity == null || (passkeyWalletCreateUopRes = (PasskeyWalletCreateUopRes) activity.copydefault()) == null) {
            return null;
        }
        return passkeyWalletCreateUopRes.getUopHash();
    }

    public final PasskeyAuthenticateRequest OLrzqt() {
        PasskeyWalletCreateUopRes passkeyWalletCreateUopRes;
        InterfaceC49371unL<PasskeyWalletCreateUopRes> value = this.AkhnZx.getValue();
        InterfaceC49371unL.Activity activity = value instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) value : null;
        if (activity == null || (passkeyWalletCreateUopRes = (PasskeyWalletCreateUopRes) activity.copydefault()) == null) {
            return null;
        }
        return passkeyWalletCreateUopRes.getServerOption();
    }

    public final void OLrzqt(int i, @NotNull java.lang.String str, @NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, PasskeyAuthenticateResponse passkeyAuthenticateResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapePassKeyWalletSignViewModel$updateCurrentSignSuccessStatus$1(this, i, passkeyAuthenticateRequest, str, passkeyAuthenticateResponse, null), 3, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapePassKeyWalletSignViewModel$batchEscapeAllTransaction$1(this, null), 3, null);
    }

    public final EscapeSignAddressData KWHzl() {
        int i = this.djBIcL;
        if (i < 0 || i >= this.AYXKKw.size()) {
            pUU.copydefault("EscapePassKeyWalletSignViewModel", "Invalid index: " + this.djBIcL + ", list size: " + this.AYXKKw.size());
            return null;
        }
        return this.AYXKKw.get(this.djBIcL);
    }
}
