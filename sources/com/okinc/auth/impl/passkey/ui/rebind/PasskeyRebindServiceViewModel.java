package com.okinc.auth.impl.passkey.ui.rebind;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC5991aGs;
import o.C5906aFM;
import o.C5909aFP;
import o.C5912aFS;
import o.C5914aFU;
import o.C5941aFv;
import o.C6254aLq;
import o.C6307aMq;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindServiceViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final MutableSharedFlow<Boolean> AYXKKw;
    public final MutableSharedFlow<Unit> AhwBna;
    public final MutableSharedFlow<Unit> AkhnZx;
    public final MutableLiveData<String> AuCTel;
    public final C5909aFP AuCTelauCTel;
    public final SharedFlow<Unit> AubY;
    public final C5914aFU AwvSrB;
    public final SharedFlow<Unit> AxsJAY;
    public final SharedFlow<String> DTwDnp;
    public final MutableSharedFlow<Unit> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableLiveData<PasskeyPromotionAuthenticator> OLrzqt;
    public final SharedFlow<AbstractC5991aGs> ORxRYg;
    public final SharedFlow<Unit> OcIXYQ;
    public final MutableSharedFlow<ActivateGuardUseCase.TaskDescription> copydefault;
    public final MutableSharedFlow<Unit> djBIcL;
    public final MutableSharedFlow<String> ejfBZ;
    public final SharedFlow<ActivateGuardUseCase.TaskDescription> fARcdN;
    public final MutableSharedFlow<AbstractC5991aGs> fIwbmz;
    public final InterfaceC8196ayF fJNWhG;
    public final MutableSharedFlow<Unit> fetchVPNInfo;
    public final MutableSharedFlow<Unit> gEmmrt;
    public final SharedFlow<Unit> gHZMYf;
    public final SharedFlow<Unit> getFieldNames;
    public final C5906aFM getNewProxyInstance;
    public final SharedFlow<Unit> hDKMBd;
    public final MutableSharedFlow<Pair<String, String>> isConnected;
    public final C5941aFv iwGUEr;
    public final SharedFlow<Unit> sSMYrx;
    public final SharedFlow<Unit> uzCIH;
    public final MutableLiveData<PasskeyVersionState> valueOf;
    public final MutableSharedFlow<Unit> values;
    public final SharedFlow<Boolean> wlaJM;
    public final C5912aFS zLjUOn;
    public final SharedFlow<Unit> zsXlph;
    public final SharedFlow<Pair<String, String>> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AYXKKw() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AhwBna() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AkhnZx() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AuCTel() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> DbNXlk() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActivateGuardUseCase.TaskDescription> KWHzl() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> djBIcL() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC5991aGs> fIwbmz() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<String, String>> fetchVPNInfo() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> isConnected() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> values() {
        return this.AxsJAY;
    }

    @yCM
    public PasskeyRebindServiceViewModel(@NotNull C5914aFU c5914aFU, @NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull C5912aFS c5912aFS, @NotNull C5909aFP c5909aFP, @NotNull C5906aFM c5906aFM, @NotNull C5941aFv c5941aFv) {
        Intrinsics.checkNotNullParameter(c5914aFU, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(c5912aFS, "");
        Intrinsics.checkNotNullParameter(c5909aFP, "");
        Intrinsics.checkNotNullParameter(c5906aFM, "");
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        this.AwvSrB = c5914aFU;
        this.fJNWhG = interfaceC8196ayF;
        this.zLjUOn = c5912aFS;
        this.AuCTelauCTel = c5909aFP;
        this.getNewProxyInstance = c5906aFM;
        this.iwGUEr = c5941aFv;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.wlaJM = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<AbstractC5991aGs> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fIwbmz = mutableSharedFlowMutableSharedFlow$default2;
        this.ORxRYg = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<ActivateGuardUseCase.TaskDescription> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default3;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.ejfBZ = mutableSharedFlowMutableSharedFlow$default4;
        this.DTwDnp = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AkhnZx = mutableSharedFlowMutableSharedFlow$default5;
        this.OcIXYQ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fetchVPNInfo = mutableSharedFlowMutableSharedFlow$default6;
        this.AxsJAY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default7;
        this.gHZMYf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.values = mutableSharedFlowMutableSharedFlow$default8;
        this.sSMYrx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default9;
        this.AubY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default10;
        this.zsXlph = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default10);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default11;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default11);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default12 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default12;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default12);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default13 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default13;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default13);
        MutableSharedFlow<Pair<String, String>> mutableSharedFlowMutableSharedFlow$default14 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.isConnected = mutableSharedFlowMutableSharedFlow$default14;
        this.zuBGHE = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default14);
        this.AuCTel = new MutableLiveData<>("");
        this.OLrzqt = new MutableLiveData<>(PasskeyPromotionAuthenticator.All.KWHzl);
        this.valueOf = new MutableLiveData<>();
    }

    public final int gEmmrt() {
        return Intrinsics.EZpvd(this.valueOf.getValue(), PasskeyVersionState.Fido1v2Compatible.INSTANCE) ? 2 : 1;
    }

    public final void EZpvd() {
        C6307aMq.EZpvd.copydefault();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyRebindServiceViewModel$clickClose$1(this, null), 3, null);
    }

    public final Job AEQbTJ(@NotNull String str, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull C6254aLq c6254aLq, @NotNull PasskeyScenario passkeyScenario) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        Intrinsics.checkNotNullParameter(c6254aLq, "");
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyRebindServiceViewModel$clickEnable$1(this, str, passkeyPromotionAuthenticator, passkeyScenario, c6254aLq, null), 3, null);
    }

    public final Job copydefault(@NotNull RegistrationFinishBody registrationFinishBody) {
        Intrinsics.checkNotNullParameter(registrationFinishBody, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyRebindServiceViewModel$postRegisterFido1$1(this, registrationFinishBody, null), 3, null);
    }

    public final Job OLrzqt(@NotNull PasskeySdkResult passkeySdkResult, @NotNull PasskeyScenario passkeyScenario) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyRebindServiceViewModel$postRegister$1(passkeyScenario, passkeySdkResult, this, null), 3, null);
    }

    public final Job copydefault(Object obj) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyRebindServiceViewModel$handleRegistrationValidation$1(obj, this, null), 3, null);
    }

    public final void fJNWhG() {
        C6307aMq.EZpvd.AEQbTJ(PasskeyPromotionSource.SECURITY_CENTER);
    }

    public final void OLrzqt() {
        C6307aMq.EZpvd.EZpvd(PasskeyPromotionSource.SECURITY_CENTER);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
