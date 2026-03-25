package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel.UpdateInfoViewModel$createUop$1;
import com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel.UpdateInfoViewModel$sendUop$1;
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

/* JADX INFO: loaded from: classes18.dex */
public final class fMX extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<Result<java.lang.String>> AEQbTJ;
    public final StateFlow<Result<PasskeyWalletCreateUopRes>> EZpvd;
    public final C17652fNg<UpdatePasskeyWalletInfoReq> KWHzl;
    public final MutableStateFlow<Result<PasskeyWalletCreateUopRes>> copydefault;
    public final C17657fNl gEmmrt;
    public final SharedFlow<Result<java.lang.String>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Result<java.lang.String>> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<PasskeyWalletCreateUopRes>> copydefault() {
        return this.EZpvd;
    }

    public fMX(@NotNull C17652fNg<UpdatePasskeyWalletInfoReq> c17652fNg, @NotNull C17657fNl c17657fNl) {
        Intrinsics.checkNotNullParameter(c17652fNg, "");
        Intrinsics.checkNotNullParameter(c17657fNl, "");
        this.KWHzl = c17652fNg;
        this.gEmmrt = c17657fNl;
        MutableStateFlow<Result<PasskeyWalletCreateUopRes>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.EZpvd = MutableStateFlow;
        MutableSharedFlow<Result<java.lang.String>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = mutableSharedFlowMutableSharedFlow$default;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UpdateInfoViewModel$createUop$1(this, str, null), 3, null);
    }

    public final void EZpvd(@NotNull PasskeyWalletSignedMsg passkeyWalletSignedMsg) {
        Intrinsics.checkNotNullParameter(passkeyWalletSignedMsg, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UpdateInfoViewModel$sendUop$1(this, passkeyWalletSignedMsg, null), 3, null);
    }
}
