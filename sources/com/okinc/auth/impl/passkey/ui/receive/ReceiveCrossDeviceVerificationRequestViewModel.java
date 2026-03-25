package com.okinc.auth.impl.passkey.ui.receive;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C5882aEp;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ReceiveCrossDeviceVerificationRequestViewModel extends ViewModel {
    public final MutableSharedFlow<Boolean> AEQbTJ;
    public final SharedFlow<Unit> AYXKKw;
    public final SharedFlow<Unit> AhwBna;
    public final SharedFlow<Unit> AkhnZx;
    public final SharedFlow<Unit> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public final SharedFlow<Unit> djBIcL;
    public final MutableSharedFlow<Unit> gEmmrt;
    public final SharedFlow<Boolean> valueOf;
    public final SavedStateHandle values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.AkhnZx;
    }

    @yCM
    public ReceiveCrossDeviceVerificationRequestViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.values = savedStateHandle;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default3;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default4;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default5;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default6;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
    }

    public final ReceiveCrossDeviceVerificationRequestActivity.Input AEQbTJ() {
        return (ReceiveCrossDeviceVerificationRequestActivity.Input) this.values.get("ARG_INPUT");
    }

    public final Job copydefault(boolean z) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReceiveCrossDeviceVerificationRequestViewModel$onApproved$1(this, z, null), 3, null);
    }

    public final Job AkhnZx() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReceiveCrossDeviceVerificationRequestViewModel$onRejected$1(this, null), 3, null);
    }

    public final Job AhwBna() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReceiveCrossDeviceVerificationRequestViewModel$onKickOuted$1(this, null), 3, null);
    }

    public final Job djBIcL() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReceiveCrossDeviceVerificationRequestViewModel$onClosed$1(this, null), 3, null);
    }

    public final Job AYXKKw() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReceiveCrossDeviceVerificationRequestViewModel$onBiometricChanged$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull ReceiveCrossDeviceVerificationRequestActivity.Input input) {
        Intrinsics.checkNotNullParameter(input, "");
        C5882aEp.KWHzl.KWHzl("[Receive verification request]", "on input updated, input=" + input);
        this.values.set("ARG_INPUT", input);
    }

    public final Job values() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReceiveCrossDeviceVerificationRequestViewModel$onSessionTimeout$1(this, null), 3, null);
    }
}
