package com.okinc.auth.impl.reset2fa.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaPreconditionResponse;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
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
import o.AbstractC6596aSN;
import o.C32989mnw;
import o.C5763aCc;
import o.C5765aCe;
import o.C6618aSj;
import o.C6619aSk;
import o.C6620aSl;
import o.C6621aSm;
import o.C6623aSo;
import o.C8206ayP;
import o.InterfaceC47278tmy;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMfaViewModel extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<String>> AEQbTJ;
    public final MutableLiveData<C32989mnw<String>> AYXKKw;
    public final MutableLiveData<Unit> AhwBna;
    public final C5763aCc AkhnZx;
    public final C5765aCe AuCTel;
    public final SavedStateHandle AuCTelauCTel;
    public final LiveData<C32989mnw<String>> AubY;
    public final LiveData<C32989mnw<Unit>> AwvSrB;
    public final LiveData<C32989mnw<Unit>> AxsJAY;
    public final MutableLiveData<C32989mnw<String>> DbNXlk;
    public final MutableLiveData<C32989mnw<Boolean>> KWHzl;
    public final MutableLiveData<C32989mnw<String>> OLrzqt;
    public final MutableLiveData<ResetMfaInitiateResponse> copydefault;
    public final MutableSharedFlow<AbstractC6596aSN> djBIcL;
    public final LiveData<C32989mnw<String>> ejfBZ;
    public final SharedFlow<AbstractC6596aSN> fARcdN;
    public final LiveData<C32989mnw<String>> fIwbmz;
    public final LiveData<C32989mnw<Boolean>> fJNWhG;
    public final MutableLiveData<C32989mnw<Unit>> fetchVPNInfo;
    public ResetMfaPreconditionResponse gEmmrt;
    public final SubdomainStrategy gHZMYf;
    public final C6619aSk getFieldNames;
    public final C6618aSj getNewProxyInstance;
    public final LiveData<C32989mnw<String>> hDKMBd;
    public RebindMfaEntryPoint isConnected;
    public final C6621aSm iwGUEr;
    public final InterfaceC47278tmy sSMYrx;
    public final C6620aSl uzCIH;
    public final MutableLiveData<C32989mnw<String>> valueOf;
    public final MutableLiveData<C32989mnw<Unit>> values;
    public final LiveData<Unit> wlaJM;
    public final C6623aSo zLjUOn;
    public final LiveData<C32989mnw<String>> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> AEQbTJ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> AYXKKw() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> DbNXlk() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> EZpvd() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC6596aSN> OLrzqt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> copydefault() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC47278tmy fIwbmz() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> fetchVPNInfo() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> gEmmrt() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubdomainStrategy isConnected() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> valueOf() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> values() {
        return this.zsXlph;
    }

    @yCM
    public ResetMfaViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull C6623aSo c6623aSo, @NotNull C5765aCe c5765aCe, @NotNull C5763aCc c5763aCc, @NotNull C6621aSm c6621aSm, @NotNull C6620aSl c6620aSl, @NotNull C6619aSk c6619aSk, @NotNull C6618aSj c6618aSj) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(c6623aSo, "");
        Intrinsics.checkNotNullParameter(c5765aCe, "");
        Intrinsics.checkNotNullParameter(c5763aCc, "");
        Intrinsics.checkNotNullParameter(c6621aSm, "");
        Intrinsics.checkNotNullParameter(c6620aSl, "");
        Intrinsics.checkNotNullParameter(c6619aSk, "");
        Intrinsics.checkNotNullParameter(c6618aSj, "");
        this.AuCTelauCTel = savedStateHandle;
        this.sSMYrx = interfaceC47278tmy;
        this.zLjUOn = c6623aSo;
        this.AuCTel = c5765aCe;
        this.AkhnZx = c5763aCc;
        this.iwGUEr = c6621aSm;
        this.uzCIH = c6620aSl;
        this.getFieldNames = c6619aSk;
        this.getNewProxyInstance = c6618aSj;
        this.gHZMYf = (SubdomainStrategy) savedStateHandle.get("KEY_SUBDOMAIN_STRATEGY");
        MutableSharedFlow<AbstractC6596aSN> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        RebindMfaEntryPoint rebindMfaEntryPoint = (RebindMfaEntryPoint) savedStateHandle.get("KEY_ENTRY_POINT");
        this.isConnected = rebindMfaEntryPoint == null ? RebindMfaEntryPoint.PostLogin.INSTANCE : rebindMfaEntryPoint;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData = new MutableLiveData<>();
        this.values = mutableLiveData;
        this.AwvSrB = mutableLiveData;
        this.copydefault = new MutableLiveData<>();
        MutableLiveData<Unit> mutableLiveData2 = new MutableLiveData<>();
        this.AhwBna = mutableLiveData2;
        this.wlaJM = mutableLiveData2;
        MutableLiveData<C32989mnw<Boolean>> mutableLiveData3 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData3;
        this.fJNWhG = mutableLiveData3;
        MutableLiveData<C32989mnw<String>> mutableLiveData4 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData4;
        this.fIwbmz = mutableLiveData4;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData5 = new MutableLiveData<>();
        this.fetchVPNInfo = mutableLiveData5;
        this.AxsJAY = mutableLiveData5;
        MutableLiveData<C32989mnw<String>> mutableLiveData6 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData6;
        this.ejfBZ = mutableLiveData6;
        MutableLiveData<C32989mnw<String>> mutableLiveData7 = new MutableLiveData<>();
        this.valueOf = mutableLiveData7;
        this.AubY = mutableLiveData7;
        MutableLiveData<C32989mnw<String>> mutableLiveData8 = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData8;
        this.hDKMBd = mutableLiveData8;
        MutableLiveData<C32989mnw<String>> mutableLiveData9 = new MutableLiveData<>();
        this.DbNXlk = mutableLiveData9;
        this.zsXlph = mutableLiveData9;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.reset2fa.ui.ResetMfaViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void copydefault(@NotNull ResetMfaInitiateResponse resetMfaInitiateResponse) {
        Intrinsics.checkNotNullParameter(resetMfaInitiateResponse, "");
        this.copydefault.setValue(resetMfaInitiateResponse);
    }

    public final void OLrzqt(@NotNull RebindMfaEntryPoint rebindMfaEntryPoint) {
        Intrinsics.checkNotNullParameter(rebindMfaEntryPoint, "");
        this.isConnected = rebindMfaEntryPoint;
        this.AuCTelauCTel.set("KEY_ENTRY_POINT", rebindMfaEntryPoint);
    }

    public final ResetMfaInitiateResponse KWHzl() {
        ResetMfaInitiateResponse value = this.copydefault.getValue();
        return value == null ? new ResetMfaInitiateResponse((String) null, (String) null, (List) null, (List) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : value;
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$getPrecondition$1(this, null), 3, null);
    }

    public final void copydefault(C6623aSo.StateListAnimator stateListAnimator) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$handleResult$1(stateListAnimator, this, null), 3, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$nextStepAction$1(str, this, null), 3, null);
    }

    public final Job OLrzqt(@NotNull String str, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$createMfaSession$1(this, str, subdomainStrategy, null), 3, null);
    }

    public final void EZpvd(@NotNull String str, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        RebindMfaEntryPoint rebindMfaEntryPoint = this.isConnected;
        if (rebindMfaEntryPoint instanceof RebindMfaEntryPoint.PreLogin) {
            KWHzl(str, subdomainStrategy);
        } else if (rebindMfaEntryPoint instanceof RebindMfaEntryPoint.ForgetPassword) {
            AEQbTJ(str, subdomainStrategy);
        } else {
            EZpvd(str);
        }
    }

    public final Job OLrzqt(String str) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$postLoginCreateMfaSession$1(this, str, null), 3, null);
    }

    public final void EZpvd(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$postLoginCheckMfaResult$1(this, str, null), 3, null);
    }

    public final Job copydefault(String str, SubdomainStrategy subdomainStrategy) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$partialAuthCreateMfaSession$1(this, str, subdomainStrategy, null), 3, null);
    }

    public final void KWHzl(String str, SubdomainStrategy subdomainStrategy) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$partialAuthCheckMfaResult$1(this, str, subdomainStrategy, null), 3, null);
    }

    public final Job AEQbTJ(SubdomainStrategy subdomainStrategy) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$nonAuthCreateMfaSession$1(this, subdomainStrategy, null), 3, null);
    }

    public final void AEQbTJ(String str, SubdomainStrategy subdomainStrategy) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaViewModel$nonAuthCheckMfaResult$1(this, str, subdomainStrategy, null), 3, null);
    }

    public final void KWHzl(OKServerException oKServerException) {
        if (oKServerException.getCode() == 5006) {
            MutableLiveData<C32989mnw<String>> mutableLiveData = this.DbNXlk;
            String message = oKServerException.getMessage();
            if (message == null) {
                message = "";
            }
            mutableLiveData.setValue(new C32989mnw<>(message));
            return;
        }
        MutableLiveData<C32989mnw<String>> mutableLiveData2 = this.AEQbTJ;
        String message2 = oKServerException.getMessage();
        if (message2 == null) {
            message2 = DbNXlk(C8206ayP.Dialog.DPHNDa);
        }
        mutableLiveData2.setValue(new C32989mnw<>(message2));
    }

    public final void fARcdN() {
        this.AhwBna.setValue(Unit.INSTANCE);
    }

    public final boolean ejfBZ() {
        ResetMfaPreconditionResponse resetMfaPreconditionResponse = this.gEmmrt;
        if (resetMfaPreconditionResponse != null) {
            return resetMfaPreconditionResponse.isEmail2faAvailable();
        }
        return false;
    }

    public final boolean fJNWhG() {
        ResetMfaPreconditionResponse resetMfaPreconditionResponse = this.gEmmrt;
        if (resetMfaPreconditionResponse != null) {
            return resetMfaPreconditionResponse.isMobile2faAvailable();
        }
        return false;
    }

    public final boolean AuCTel() {
        ResetMfaPreconditionResponse resetMfaPreconditionResponse = this.gEmmrt;
        if (resetMfaPreconditionResponse != null) {
            return resetMfaPreconditionResponse.isAuthApp2faAvailable();
        }
        return false;
    }

    public final String AhwBna() {
        String maskedEmail;
        ResetMfaPreconditionResponse resetMfaPreconditionResponse = this.gEmmrt;
        if (resetMfaPreconditionResponse != null && (maskedEmail = resetMfaPreconditionResponse.getMaskedEmail()) != null) {
            if (this.isConnected instanceof RebindMfaEntryPoint.ForgetPassword) {
                maskedEmail = null;
            }
            if (maskedEmail != null) {
                return maskedEmail;
            }
        }
        return DbNXlk(C8206ayP.Dialog.getPriority);
    }

    public final String AkhnZx() {
        String maskedPhone;
        ResetMfaPreconditionResponse resetMfaPreconditionResponse = this.gEmmrt;
        if (resetMfaPreconditionResponse != null && (maskedPhone = resetMfaPreconditionResponse.getMaskedPhone()) != null) {
            if (this.isConnected instanceof RebindMfaEntryPoint.ForgetPassword) {
                maskedPhone = null;
            }
            if (maskedPhone != null) {
                return maskedPhone;
            }
        }
        return DbNXlk(C8206ayP.Dialog.DGUQLIOvDItG);
    }
}
