package com.okinc.auth.impl.mfa.ui.verifymfaotp;

import android.text.BidiFormatter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.uilab.code.OKCodeInput;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C5771aCk;
import o.C5775aCo;
import o.C5776aCp;
import o.C5779aCs;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaOtpViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<String> AEQbTJ;
    public final MutableSharedFlow<Unit> AYXKKw;
    public final MutableSharedFlow<OKCodeInput.AutofillType> AhwBna;
    public final SharedFlow<String> AkhnZx;
    public final SharedFlow<Unit> AuCTel;
    public final MutableStateFlow<C5779aCs> DbNXlk;
    public final MutableLiveData<OTP> EZpvd;
    public final MutableSharedFlow<MfaFailure> KWHzl;
    public final MutableLiveData<MfaScenario> OLrzqt;
    public final MutableSharedFlow<MfaResponse> copydefault;
    public final MutableLiveData<SubdomainStrategy> djBIcL;
    public final C5771aCk ejfBZ;
    public final SharedFlow<OKCodeInput.AutofillType> fARcdN;
    public final SharedFlow<MfaFailure> fIwbmz;
    public final SharedFlow<MfaResponse> fJNWhG;
    public final MutableSharedFlow<Unit> fetchVPNInfo;
    public final MutableLiveData<MfaResponse> gEmmrt;
    public final C5775aCo getFieldNames;
    public final SharedFlow<Long> getNewProxyInstance;
    public final SharedFlow<C5779aCs> hDKMBd;
    public final BidiFormatter isConnected;
    public final C5776aCp iwGUEr;
    public final SharedFlow<Unit> uzCIH;
    public final MutableLiveData<String> valueOf;
    public final MutableSharedFlow<Long> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> AEQbTJ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Long> AYXKKw() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C5779aCs> AhwBna() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<OKCodeInput.AutofillType> KWHzl() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaResponse> OLrzqt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<OTP> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> gEmmrt() {
        return this.AuCTel;
    }

    @yCM
    public VerifyMfaOtpViewModel(@NotNull C5771aCk c5771aCk, @NotNull C5776aCp c5776aCp, @NotNull C5775aCo c5775aCo) {
        Intrinsics.checkNotNullParameter(c5771aCk, "");
        Intrinsics.checkNotNullParameter(c5776aCp, "");
        Intrinsics.checkNotNullParameter(c5775aCo, "");
        this.ejfBZ = c5771aCk;
        this.iwGUEr = c5776aCp;
        this.getFieldNames = c5775aCo;
        this.isConnected = BidiFormatter.getInstance();
        this.valueOf = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        MutableSharedFlow<MfaResponse> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Long> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.values = mutableSharedFlowMutableSharedFlow$default3;
        this.getNewProxyInstance = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fetchVPNInfo = mutableSharedFlowMutableSharedFlow$default4;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableStateFlow<C5779aCs> MutableStateFlow = StateFlowKt.MutableStateFlow(new C5779aCs(false, null, null, null, null, false, null, 127, null));
        this.DbNXlk = MutableStateFlow;
        this.hDKMBd = FlowKt.asSharedFlow(MutableStateFlow);
        MutableSharedFlow<OKCodeInput.AutofillType> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default5;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default6;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default7;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
    }

    public final Job copydefault(@NotNull String str, MfaResponse mfaResponse, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaOtpViewModel$initFlow$1(this, str, mfaResponse, mfaScenario, subdomainStrategy, null), 3, null);
    }

    public final Job AEQbTJ(OTP otp) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaOtpViewModel$setupUiFor$1(this, otp, null), 3, null);
    }

    public final void valueOf() {
        OTP value = copydefault().getValue();
        if (value != null) {
            OLrzqt(value);
        }
    }

    public final Job OLrzqt(OTP otp) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaOtpViewModel$sendOtpCode$1(this, otp, null), 3, null);
    }

    public final Job KWHzl(@NotNull OTP otp, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(otp, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaOtpViewModel$switchOtpType$1(this, otp, mfaScenario, null), 3, null);
    }

    public final Job OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaOtpViewModel$verifyOtpCode$1(this, str, null), 3, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(str);
    }
}
