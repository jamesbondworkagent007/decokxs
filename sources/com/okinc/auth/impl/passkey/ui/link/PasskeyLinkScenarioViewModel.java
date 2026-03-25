package com.okinc.auth.impl.passkey.ui.link;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C5894aFA;
import o.C5942aFw;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyLinkScenarioViewModel extends AbstractC33073mpa {
    public final SharedFlow<Boolean> AYXKKw;
    public final SharedFlow<PasskeyAuthenticateRequest> AhwBna;
    public final C5894aFA DbNXlk;
    public final MutableSharedFlow<Boolean> EZpvd;
    public final MutableSharedFlow<PasskeyLinkState> KWHzl;
    public final MutableSharedFlow<String> OLrzqt;
    public final MutableSharedFlow<PasskeyAuthenticateRequest> copydefault;
    public final C5942aFw djBIcL;
    public final SharedFlow<PasskeyLinkState> gEmmrt;
    public final SharedFlow<String> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PasskeyLinkState> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PasskeyAuthenticateRequest> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public PasskeyLinkScenarioViewModel(@NotNull C5894aFA c5894aFA, @NotNull C5942aFw c5942aFw) {
        Intrinsics.checkNotNullParameter(c5894aFA, "");
        Intrinsics.checkNotNullParameter(c5942aFw, "");
        this.DbNXlk = c5894aFA;
        this.djBIcL = c5942aFw;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<PasskeyAuthenticateRequest> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<PasskeyLinkState> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default4;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyLinkScenarioViewModel$start$1(this, null), 3, null);
    }

    public final Job copydefault(@NotNull PasskeyAuthenticateState passkeyAuthenticateState) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateState, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyLinkScenarioViewModel$finish$1(passkeyAuthenticateState, this, null), 3, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
