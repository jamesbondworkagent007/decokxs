package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel.EnableLimitOrderViewModel$createUop$1;
import com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel.EnableLimitOrderViewModel$sendUop$1;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg;
import com.okinc.business.defi.wallet.passkey.common.bean.UpdatePasskeyWalletInfoReq;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class fMW extends ViewModel {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final MutableStateFlow<Result<PasskeyWalletCreateUopRes>> AEQbTJ;
    public final C17657fNl AhwBna;
    public final C17652fNg<UpdatePasskeyWalletInfoReq> KWHzl;
    public final MutableSharedFlow<Result<kotlin.Pair<java.lang.String, java.lang.Boolean>>> OLrzqt;
    public final StateFlow<Result<PasskeyWalletCreateUopRes>> copydefault;
    public final SharedFlow<Result<kotlin.Pair<java.lang.String, java.lang.Boolean>>> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Result<kotlin.Pair<java.lang.String, java.lang.Boolean>>> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<PasskeyWalletCreateUopRes>> copydefault() {
        return this.copydefault;
    }

    public fMW(@NotNull C17652fNg<UpdatePasskeyWalletInfoReq> c17652fNg, @NotNull C17657fNl c17657fNl) {
        Intrinsics.checkNotNullParameter(c17652fNg, "");
        Intrinsics.checkNotNullParameter(c17657fNl, "");
        this.KWHzl = c17652fNg;
        this.AhwBna = c17657fNl;
        MutableStateFlow<Result<PasskeyWalletCreateUopRes>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = MutableStateFlow;
        MutableSharedFlow<Result<kotlin.Pair<java.lang.String, java.lang.Boolean>>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EnableLimitOrderViewModel$createUop$1(this, str, null), 3, null);
    }

    public final void copydefault(@NotNull PasskeyWalletSignedMsg passkeyWalletSignedMsg) {
        Intrinsics.checkNotNullParameter(passkeyWalletSignedMsg, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EnableLimitOrderViewModel$sendUop$1(this, passkeyWalletSignedMsg, null), 3, null);
    }
}
