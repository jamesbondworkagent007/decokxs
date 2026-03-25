package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionSource;
import com.okinc.business.defi.wallet.passkey.cedefi.transaction.viewmodel.SignAndSendTransactionViewModel$createUop$1;
import com.okinc.business.defi.wallet.passkey.cedefi.transaction.viewmodel.SignAndSendTransactionViewModel$sendUop$1;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg;
import com.okinc.business.defi.wallet.passkey.common.bean.SignAndSendTransactionReq;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class fMC extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C17652fNg<SignAndSendTransactionReq> AEQbTJ;
    public final MutableStateFlow<Result<PasskeyWalletCreateUopRes>> EZpvd;
    public final StateFlow<Result<PasskeyWalletCreateUopRes>> OLrzqt;
    public final MutableSharedFlow<Result<java.lang.String>> copydefault;
    public final SharedFlow<Result<java.lang.String>> djBIcL;
    public final C17657fNl gEmmrt;
    public final java.lang.String valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignAndSendTransactionSource.values().length];
            try {
                iArr[SignAndSendTransactionSource.BOOST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Result<java.lang.String>> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<PasskeyWalletCreateUopRes>> OLrzqt() {
        return this.OLrzqt;
    }

    public fMC(@NotNull SignAndSendTransactionSource signAndSendTransactionSource, @NotNull C17652fNg<SignAndSendTransactionReq> c17652fNg, @NotNull C17657fNl c17657fNl) {
        Intrinsics.checkNotNullParameter(signAndSendTransactionSource, "");
        Intrinsics.checkNotNullParameter(c17652fNg, "");
        Intrinsics.checkNotNullParameter(c17657fNl, "");
        this.AEQbTJ = c17652fNg;
        this.gEmmrt = c17657fNl;
        if (ActionBar.OLrzqt[signAndSendTransactionSource.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.valueOf = "20309";
        MutableStateFlow<Result<PasskeyWalletCreateUopRes>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.OLrzqt = MutableStateFlow;
        MutableSharedFlow<Result<java.lang.String>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SignAndSendTransactionViewModel$createUop$1(this, str, null), 3, null);
    }

    public final void OLrzqt(@NotNull PasskeyWalletSignedMsg passkeyWalletSignedMsg) {
        Intrinsics.checkNotNullParameter(passkeyWalletSignedMsg, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SignAndSendTransactionViewModel$sendUop$1(this, passkeyWalletSignedMsg, null), 3, null);
    }

    public final OKServerException OLrzqt(OKServerException oKServerException) {
        JsonElement jsonElement;
        java.lang.String asString;
        java.lang.String content;
        JsonPrimitive jsonPrimitive;
        if (oKServerException.getCode() == 9998) {
            try {
                Result.Application application = Result.Companion;
                JsonObject response = oKServerException.getResponse();
                if (response == null || (jsonElement = response.get("msg")) == null || (asString = jsonElement.getAsString()) == null) {
                    Result.m7377constructorimpl(null);
                } else {
                    Json.Default r2 = Json.Default;
                    r2.getSerializersModule();
                    kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) r2.decodeFromString(kotlinx.serialization.json.JsonObject.Companion.serializer(), asString);
                    int i = java.lang.Integer.parseInt(java.lang.String.valueOf(jsonObject.get((java.lang.Object) "code")));
                    kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "msg");
                    if (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (content = jsonPrimitive.getContent()) == null) {
                        content = "";
                    }
                    return new OKServerException(i, content, null, oKServerException, 4, null);
                }
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        return oKServerException;
    }
}
