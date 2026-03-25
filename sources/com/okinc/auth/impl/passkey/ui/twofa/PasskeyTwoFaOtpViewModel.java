package com.okinc.auth.impl.passkey.ui.twofa;

import android.os.CountDownTimer;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C5975aGc;
import o.C5976aGd;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyTwoFaOtpViewModel extends AbstractC33073mpa {
    public final int AEQbTJ;
    public final MutableSharedFlow<UnlockTokenResponse> AYXKKw;
    public final MutableSharedFlow<Boolean> AhwBna;
    public boolean AkhnZx;
    public final C5975aGc AuCTel;
    public final StateListAnimator DbNXlk;
    public final long EZpvd;
    public final MutableSharedFlow<Boolean> KWHzl;
    public final MutableLiveData<Integer> OLrzqt;
    public final long copydefault;
    public final MutableSharedFlow<String> djBIcL;
    public final SharedFlow<Boolean> ejfBZ;
    public final SharedFlow<String> fARcdN;
    public final C5976aGd fIwbmz;
    public final SharedFlow<Boolean> fJNWhG;
    public final MutableSharedFlow<String> fetchVPNInfo;
    public final MutableSharedFlow<String> gEmmrt;
    public final SharedFlow<String> getFieldNames;
    public final SharedFlow<UnlockTokenResponse> getNewProxyInstance;
    public final SharedFlow<String> hDKMBd;
    public CountDownTimer isConnected;
    public final SharedFlow<Boolean> iwGUEr;
    public final MutableSharedFlow<Boolean> valueOf;
    public final PasskeyApiService values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<UnlockTokenResponse> AEQbTJ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AhwBna() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> OLrzqt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> copydefault() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> valueOf() {
        return this.fJNWhG;
    }

    @yCM
    public PasskeyTwoFaOtpViewModel(@NotNull PasskeyApiService passkeyApiService, @NotNull C5975aGc c5975aGc, @NotNull C5976aGd c5976aGd) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(c5975aGc, "");
        Intrinsics.checkNotNullParameter(c5976aGd, "");
        this.values = passkeyApiService;
        this.AuCTel = c5975aGc;
        this.fIwbmz = c5976aGd;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fetchVPNInfo = mutableSharedFlowMutableSharedFlow$default2;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default3;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default4;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default5;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default6;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<UnlockTokenResponse> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default7;
        this.getNewProxyInstance = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        this.AEQbTJ = 3181;
        this.OLrzqt = new MutableLiveData<>(0);
        this.EZpvd = 60L;
        this.copydefault = 1000L;
        this.DbNXlk = KWHzl(60L);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator extends CountDownTimer {
        public StateListAnimator(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(PasskeyTwoFaOtpViewModel.this), null, null, new PasskeyTwoFaOtpViewModel$getCountDownTimer$1$onTick$1(PasskeyTwoFaOtpViewModel.this, j, null), 3, null);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(PasskeyTwoFaOtpViewModel.this), null, null, new PasskeyTwoFaOtpViewModel$getCountDownTimer$1$onFinish$1(PasskeyTwoFaOtpViewModel.this, null), 3, null);
        }
    }

    public final StateListAnimator KWHzl(long j) {
        return new StateListAnimator(j * ((long) 1000), this.copydefault);
    }

    public final Job KWHzl(@NotNull Fido2VerificationOption fido2VerificationOption, @NotNull String str) {
        Intrinsics.checkNotNullParameter(fido2VerificationOption, "");
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyTwoFaOtpViewModel$submit$1(this, fido2VerificationOption, str, null), 3, null);
    }

    public final Job OLrzqt(@NotNull Fido2VerificationOption fido2VerificationOption, @NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fido2VerificationOption, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyTwoFaOtpViewModel$clickSend$1(fido2VerificationOption, this, fragmentActivity, null), 3, null);
    }

    public final Job OLrzqt(Fido2VerificationOption fido2VerificationOption, Map<String, String> map) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyTwoFaOtpViewModel$internalSendCodeMobile$1(this, fido2VerificationOption, map, null), 3, null);
    }

    public final void copydefault(@NotNull Fido2VerificationOption fido2VerificationOption, @NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fido2VerificationOption, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyTwoFaOtpViewModel$clickSwitch$1(this, fido2VerificationOption, fragmentActivity, null), 3, null);
    }

    public final Job AYXKKw() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyTwoFaOtpViewModel$setupSendButtonKey$1(this, null), 3, null);
    }

    public final Job OLrzqt(@NotNull Fido2VerificationOption fido2VerificationOption) {
        Intrinsics.checkNotNullParameter(fido2VerificationOption, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyTwoFaOtpViewModel$setupTitleKey$1(this, fido2VerificationOption, null), 3, null);
    }
}
