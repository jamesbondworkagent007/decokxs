package com.okinc.auth.impl.twofactorauth.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.account.api.model.security.otp.OtpAction;
import com.okinc.account.api.model.security.otp.OtpState;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C8211ayU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpViewModel extends ViewModel {
    public final MutableSharedFlow<String> AEQbTJ;
    public final SharedFlow<OtpState> AhwBna;
    public final SharedFlow<OtpState> EZpvd;
    public final SharedFlow<String> KWHzl;
    public final MutableSharedFlow<OtpState> OLrzqt;
    public final MutableSharedFlow<OtpState> copydefault;
    public final SavedStateHandle djBIcL;
    public final SubdomainStrategy gEmmrt;
    public final C8211ayU valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<OtpState> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<OtpState> OLrzqt() {
        return this.AhwBna;
    }

    @yCM
    public OtpViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C8211ayU c8211ayU) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c8211ayU, "");
        this.djBIcL = savedStateHandle;
        this.valueOf = c8211ayU;
        this.gEmmrt = (SubdomainStrategy) savedStateHandle.get("KEY_SUBDOMAIN_STRATEGY");
        MutableSharedFlow<OtpState> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<OtpState> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default3;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    public final void KWHzl(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2, @NotNull OtpAction otpAction, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(otpAction, "");
        FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(FlowKt.onStart(this.valueOf.KWHzl(i, str, str2, str3, i2, str4, this.gEmmrt), new OtpViewModel$requestPhoneOtpForRebind2fa$1(otpAction, this, null)), new OtpViewModel$requestPhoneOtpForRebind2fa$2(otpAction, this, i2, null)), new OtpViewModel$requestPhoneOtpForRebind2fa$3(otpAction, this, null)), ViewModelKt.getViewModelScope(this));
    }

    public final void copydefault(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2, @NotNull OtpAction otpAction, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(otpAction, "");
        FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(FlowKt.onStart(this.valueOf.EZpvd(i, str, str2, str3, i2, str4, this.gEmmrt), new OtpViewModel$requestPhoneOtpForForgetPasswordRebind2fa$1(otpAction, this, null)), new OtpViewModel$requestPhoneOtpForForgetPasswordRebind2fa$2(otpAction, this, i2, null)), new OtpViewModel$requestPhoneOtpForForgetPasswordRebind2fa$3(otpAction, this, null)), ViewModelKt.getViewModelScope(this));
    }

    public static /* synthetic */ void requestEmailOtpForRebind2fa$default(OtpViewModel otpViewModel, int i, String str, String str2, OtpAction otpAction, String str3, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        otpViewModel.AEQbTJ(i, str, str2, otpAction, str3);
    }

    public final void AEQbTJ(int i, @NotNull String str, @NotNull String str2, @NotNull OtpAction otpAction, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(otpAction, "");
        FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(FlowKt.onStart(this.valueOf.AEQbTJ(i, str, str2, str3, this.gEmmrt), new OtpViewModel$requestEmailOtpForRebind2fa$1(otpAction, this, null)), new OtpViewModel$requestEmailOtpForRebind2fa$2(otpAction, this, null)), new OtpViewModel$requestEmailOtpForRebind2fa$3(otpAction, this, null)), ViewModelKt.getViewModelScope(this));
    }

    public static /* synthetic */ void requestEmailOtpForForgetPasswordRebind2fa$default(OtpViewModel otpViewModel, int i, String str, String str2, OtpAction otpAction, String str3, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        otpViewModel.EZpvd(i, str, str2, otpAction, str3);
    }

    public final void EZpvd(int i, @NotNull String str, @NotNull String str2, @NotNull OtpAction otpAction, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(otpAction, "");
        FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(FlowKt.onStart(this.valueOf.OLrzqt(i, str, str2, str3, this.gEmmrt), new OtpViewModel$requestEmailOtpForForgetPasswordRebind2fa$1(otpAction, this, null)), new OtpViewModel$requestEmailOtpForForgetPasswordRebind2fa$2(otpAction, this, null)), new OtpViewModel$requestEmailOtpForForgetPasswordRebind2fa$3(otpAction, this, null)), ViewModelKt.getViewModelScope(this));
    }
}
