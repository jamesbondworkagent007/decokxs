package com.okinc.auth.impl.passkey.ui.authenticate.scenario;

import android.app.PendingIntent;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C5941aFv;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyAuthenticateScenarioViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<String> AEQbTJ;
    public final Fido2ApiClient AYXKKw;
    public final C5941aFv AhwBna;
    public final SharedFlow<PasskeyAuthenticateState> AkhnZx;
    public final MutableSharedFlow<String> EZpvd;
    public final MutableSharedFlow<String> KWHzl;
    public final MutableSharedFlow<PendingIntent> copydefault;
    public final MutableSharedFlow<PasskeyAuthenticateState> djBIcL;
    public final SharedFlow<String> gEmmrt;
    public final SharedFlow<PendingIntent> isConnected;
    public final SharedFlow<String> valueOf;
    public final SharedFlow<String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PasskeyAuthenticateState> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PendingIntent> KWHzl() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> copydefault() {
        return this.valueOf;
    }

    @yCM
    public PasskeyAuthenticateScenarioViewModel(@NotNull Fido2ApiClient fido2ApiClient, @NotNull C5941aFv c5941aFv) {
        Intrinsics.checkNotNullParameter(fido2ApiClient, "");
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        this.AYXKKw = fido2ApiClient;
        this.AhwBna = c5941aFv;
        MutableSharedFlow<PendingIntent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<PasskeyAuthenticateState> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default3;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default4;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default5;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
    }

    public final Job EZpvd(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, boolean z) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyAuthenticateScenarioViewModel$prepareRequestAndRunFido2CredMan$1(this, passkeyAuthenticateRequest, z, null), 3, null);
    }

    public final Job EZpvd(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyAuthenticateScenarioViewModel$postSdkAuth$1(passkeySdkResult, this, null), 3, null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
