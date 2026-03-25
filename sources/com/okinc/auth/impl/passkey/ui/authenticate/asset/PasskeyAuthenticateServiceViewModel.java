package com.okinc.auth.impl.passkey.ui.authenticate.asset;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC5990aGr;
import o.C5941aFv;
import o.C5973aGa;
import o.C5978aGf;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyAuthenticateServiceViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final MutableSharedFlow<String> AYXKKw;
    public final C5941aFv AhwBna;
    public final SharedFlow<Unit> AkhnZx;
    public final SharedFlow<AbstractC5990aGr> AuCTel;
    public final SharedFlow<PasskeyState> DbNXlk;
    public final MutableSharedFlow<Boolean> KWHzl;
    public final MutableSharedFlow<PasskeyState> OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public final InterfaceC8196ayF djBIcL;
    public final C5978aGf ejfBZ;
    public final C5973aGa fARcdN;
    public final SavedStateHandle fIwbmz;
    public final boolean fJNWhG;
    public final SharedFlow<Unit> fetchVPNInfo;
    public final MutableSharedFlow<Boolean> gEmmrt;
    public final SharedFlow<String> hDKMBd;
    public final SharedFlow<Boolean> isConnected;
    public final MutableSharedFlow<AbstractC5990aGr> valueOf;
    public final SharedFlow<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AYXKKw() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PasskeyState> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC5990aGr> gEmmrt() {
        return this.AuCTel;
    }

    @yCM
    public PasskeyAuthenticateServiceViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull C5973aGa c5973aGa, @NotNull C5978aGf c5978aGf, @NotNull C5941aFv c5941aFv) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(c5973aGa, "");
        Intrinsics.checkNotNullParameter(c5978aGf, "");
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        this.fIwbmz = savedStateHandle;
        this.djBIcL = interfaceC8196ayF;
        this.fARcdN = c5973aGa;
        this.ejfBZ = c5978aGf;
        this.AhwBna = c5941aFv;
        Boolean bool = (Boolean) savedStateHandle.get("KEY_SKIP_CHECK_PASSKEY");
        this.fJNWhG = bool != null ? bool.booleanValue() : false;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default2;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<AbstractC5990aGr> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default3;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<PasskeyState> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default4;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default5;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default6;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default7;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Object OLrzqt(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PasskeyAuthenticateServiceViewModel$isCompatibleAndRegistered$2(this, null), continuation);
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyAuthenticateServiceViewModel$clickVerify$1(this, null), 3, null);
    }

    public final void OLrzqt(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyAuthenticateServiceViewModel$postVerify$1(passkeySdkResult, this, null), 3, null);
    }
}
