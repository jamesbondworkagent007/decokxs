package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SendCrossDeviceVerificationRequestViewModel extends ViewModel {
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final MutableStateFlow<AuthenticationStartResponse.AdditionalData> AYXKKw;
    public final SharedFlow<Unit> AhwBna;
    public final SharedFlow<Unit> AkhnZx;
    public final SharedFlow<MfaFailure> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<MfaFailure> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public final MutableSharedFlow<Unit> djBIcL;
    public final StateFlow<AuthenticationStartResponse.AdditionalData> ejfBZ;
    public final SharedFlow<Unit> fARcdN;
    public final SavedStateHandle fIwbmz;
    public final SharedFlow<Unit> fetchVPNInfo;
    public final MutableSharedFlow<Unit> gEmmrt;
    public final SharedFlow<Unit> isConnected;
    public final SendCrossDeviceVerificationRequestActivity.Input valueOf;
    public final SharedFlow<Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AuthenticationStartResponse.AdditionalData> AYXKKw() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendCrossDeviceVerificationRequestActivity.Input OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> gEmmrt() {
        return this.fetchVPNInfo;
    }

    @yCM
    public SendCrossDeviceVerificationRequestViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.fIwbmz = savedStateHandle;
        this.valueOf = (SendCrossDeviceVerificationRequestActivity.Input) savedStateHandle.get("ARG_INPUT");
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableStateFlow<AuthenticationStartResponse.AdditionalData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AYXKKw = MutableStateFlow;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default3;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default4;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default5;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default6;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default7;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
    }

    public final Job OLrzqt(AuthenticationStartResponse.AdditionalData additionalData) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SendCrossDeviceVerificationRequestViewModel$onCrossDeviceVerificationStarted$1(additionalData, this, null), 3, null);
    }

    public final Job fetchVPNInfo() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SendCrossDeviceVerificationRequestViewModel$onCrossDeviceVerificationFinished$1(this, null), 3, null);
    }

    public final Job valueOf() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SendCrossDeviceVerificationRequestViewModel$onBack$1(this, null), 3, null);
    }

    public final Job DbNXlk() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SendCrossDeviceVerificationRequestViewModel$onClosed$1(this, null), 3, null);
    }

    public final Job values() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SendCrossDeviceVerificationRequestViewModel$onStartResetPasskey$1(this, null), 3, null);
    }

    public final Job AkhnZx() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SendCrossDeviceVerificationRequestViewModel$onStartQuestionAnswer$1(this, null), 3, null);
    }

    public final Job OLrzqt(@NotNull MfaFailure mfaFailure) {
        Intrinsics.checkNotNullParameter(mfaFailure, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SendCrossDeviceVerificationRequestViewModel$onMfaError$1(mfaFailure, this, null), 3, null);
    }
}
