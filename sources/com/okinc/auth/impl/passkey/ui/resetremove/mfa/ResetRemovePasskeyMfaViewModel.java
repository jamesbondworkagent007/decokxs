package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyRebindRequest;
import com.okinc.auth.api.passkey.PasskeyRebindState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaViewModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.C56392yDr;
import o.C5763aCc;
import o.C5765aCe;
import o.C5905aFL;
import o.C5917aFX;
import o.C5919aFZ;
import o.InterfaceC56387yDm;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetRemovePasskeyMfaViewModel extends AbstractC33073mpa {
    public final MutableLiveData<Pair<PasskeyResetRemoveType, List<String>>> AEQbTJ;
    public final MutableSharedFlow<Boolean> AYXKKw;
    public final MutableLiveData<C32989mnw<Unit>> AhwBna;
    public final MutableLiveData<C32989mnw<Pair<String, String>>> AkhnZx;
    public final LiveData<String> AuCTel;
    public final C5917aFX AuCTelauCTel;
    public final InterfaceC56387yDm AubY;
    public final SavedStateHandle AwvSrB;
    public final LiveData<C32989mnw<Pair<String, String>>> AxsJAY;
    public final MutableLiveData<C32989mnw<Unit>> DbNXlk;
    public final MutableLiveData<C32989mnw<Unit>> EZpvd;
    public final MutableLiveData<String> OLrzqt;
    public final MutableLiveData<String> djBIcL;
    public final C5763aCc ejfBZ;
    public final InterfaceC8196ayF fARcdN;
    public final LiveData<C32989mnw<Unit>> fIwbmz;
    public final LiveData<String> fJNWhG;
    public final MutableSharedFlow<String> fetchVPNInfo;
    public final MutableLiveData<String> gEmmrt;
    public final SharedFlow<String> gHZMYf;
    public final SharedFlow<Boolean> getFieldNames;
    public final C5765aCe getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public final MutableSharedFlow<String> isConnected;
    public final C5905aFL iwGUEr;
    public final LiveData<C32989mnw<Unit>> sSMYrx;
    public final LiveData<Boolean> uzCIH;
    public final MutableLiveData<Boolean> valueOf;
    public final MutableLiveData<C32989mnw<PasskeyRebindRequest>> values;
    public final LiveData<C32989mnw<PasskeyRebindRequest>> wlaJM;
    public final C5919aFZ zLjUOn;
    public final LiveData<C32989mnw<Unit>> zsXlph;
    public final SharedFlow<String> zuBGHE;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static final String KWHzl = "ResetRemovePasskeyServiceViewModel";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> AEQbTJ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AYXKKw() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AhwBna() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> DbNXlk() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> EZpvd() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> copydefault() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<PasskeyRebindRequest>> djBIcL() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> gEmmrt() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> isConnected() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> valueOf() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<String, String>>> values() {
        return this.AxsJAY;
    }

    @yCM
    public ResetRemovePasskeyMfaViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C5905aFL c5905aFL, @NotNull C5765aCe c5765aCe, @NotNull C5763aCc c5763aCc, @NotNull C5919aFZ c5919aFZ, @NotNull C5917aFX c5917aFX, @NotNull InterfaceC8196ayF interfaceC8196ayF) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c5905aFL, "");
        Intrinsics.checkNotNullParameter(c5765aCe, "");
        Intrinsics.checkNotNullParameter(c5763aCc, "");
        Intrinsics.checkNotNullParameter(c5919aFZ, "");
        Intrinsics.checkNotNullParameter(c5917aFX, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        this.AwvSrB = savedStateHandle;
        this.iwGUEr = c5905aFL;
        this.getNewProxyInstance = c5765aCe;
        this.ejfBZ = c5763aCc;
        this.zLjUOn = c5919aFZ;
        this.AuCTelauCTel = c5917aFX;
        this.fARcdN = interfaceC8196ayF;
        this.AubY = C56392yDr.copydefault(new Function0() { // from class: o.aOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeyMfaViewModel.iwGUEr(this.AEQbTJ);
            }
        });
        this.hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.aPb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ResetRemovePasskeyMfaViewModel.uzCIH(this.copydefault));
            }
        });
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.isConnected = mutableSharedFlowMutableSharedFlow$default2;
        this.zuBGHE = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fetchVPNInfo = mutableSharedFlowMutableSharedFlow$default3;
        this.gHZMYf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableLiveData<C32989mnw<PasskeyRebindRequest>> mutableLiveData = new MutableLiveData<>();
        this.values = mutableLiveData;
        this.wlaJM = mutableLiveData;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.fIwbmz = mutableLiveData2;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData3 = new MutableLiveData<>();
        this.DbNXlk = mutableLiveData3;
        this.sSMYrx = mutableLiveData3;
        MutableLiveData<C32989mnw<Pair<String, String>>> mutableLiveData4 = new MutableLiveData<>();
        this.AkhnZx = mutableLiveData4;
        this.AxsJAY = mutableLiveData4;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData5 = new MutableLiveData<>();
        this.AhwBna = mutableLiveData5;
        this.zsXlph = mutableLiveData5;
        MutableLiveData<String> mutableLiveData6 = new MutableLiveData<>();
        this.djBIcL = mutableLiveData6;
        this.AuCTel = mutableLiveData6;
        MutableLiveData<String> mutableLiveData7 = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData7;
        this.fJNWhG = mutableLiveData7;
        this.AEQbTJ = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>("");
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>(Boolean.FALSE);
        this.valueOf = mutableLiveData8;
        this.uzCIH = mutableLiveData8;
    }

    public final PasskeyScenario KWHzl() {
        return (PasskeyScenario) this.AubY.getValue();
    }

    public static final PasskeyScenario iwGUEr(ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel) {
        return (PasskeyScenario) resetRemovePasskeyMfaViewModel.AwvSrB.get("ARG_PASSKEY_SCENARIO");
    }

    public final boolean AkhnZx() {
        return ((Boolean) this.hDKMBd.getValue()).booleanValue();
    }

    public static final boolean uzCIH(ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel) {
        Boolean bool = (Boolean) resetRemovePasskeyMfaViewModel.AwvSrB.get("ARG_IS_FORCE_INCOMPATIBLE_FOR_PASSKEY_ERROR");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Job copydefault(@NotNull ResetRemovePasskeySelectionActivity.ResetRemoveResponse resetRemoveResponse) {
        Intrinsics.checkNotNullParameter(resetRemoveResponse, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetRemovePasskeyMfaViewModel$postResetRemoveSelection$1(resetRemoveResponse, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job AEQbTJ(String str) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetRemovePasskeyMfaViewModel$createSessionIdAndStartMfa$1(this, str, null), 3, null);
    }

    public final Job EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetRemovePasskeyMfaViewModel$postMfaCheckResult$1(this, str, null), 3, null);
    }

    public final Job OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetRemovePasskeyMfaViewModel$remove$1(this, str, null), 3, null);
    }

    public final Job AEQbTJ(@NotNull String str, PasskeyScenario passkeyScenario) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetRemovePasskeyMfaViewModel$resetInit$1(this, str, passkeyScenario, null), 3, null);
    }

    public final Job copydefault(@NotNull PasskeyRebindState passkeyRebindState) {
        Intrinsics.checkNotNullParameter(passkeyRebindState, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetRemovePasskeyMfaViewModel$postPasskeyRebind$1(passkeyRebindState, this, null), 3, null);
    }

    public final void fJNWhG() {
        this.valueOf.setValue(Boolean.TRUE);
    }

    public final Job fetchVPNInfo() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetRemovePasskeyMfaViewModel$postMfaUnableToVerifyForRemove$1(this, null), 3, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String EZpvd() {
            return ResetRemovePasskeyMfaViewModel.KWHzl;
        }
    }
}
