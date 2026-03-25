package com.okinc.auth.impl.passkey.ui.recover;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyRecoverState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5894aFA;
import o.C5942aFw;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRecoverViewModel extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<Boolean> AEQbTJ;
    public final C5942aFw AYXKKw;
    public final MutableSharedFlow<String> AhwBna;
    public final SharedFlow<Unit> AkhnZx;
    public final SharedFlow<PasskeyAuthenticateRequest> DbNXlk;
    public final MutableSharedFlow<PasskeyRecoverState> EZpvd;
    public final MutableSharedFlow<PasskeyAuthenticateRequest> KWHzl;
    public final MutableSharedFlow<String> copydefault;
    public final InterfaceC8196ayF djBIcL;
    public final SharedFlow<String> fARcdN;
    public final C5894aFA fetchVPNInfo;
    public final SharedFlow<PasskeyRecoverState> gEmmrt;
    public final SharedFlow<String> isConnected;
    public final MutableSharedFlow<Unit> valueOf;
    public final SharedFlow<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PasskeyAuthenticateRequest> AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PasskeyRecoverState> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.AkhnZx;
    }

    @yCM
    public PasskeyRecoverViewModel(@NotNull C5894aFA c5894aFA, @NotNull C5942aFw c5942aFw, @NotNull InterfaceC8196ayF interfaceC8196ayF) {
        Intrinsics.checkNotNullParameter(c5894aFA, "");
        Intrinsics.checkNotNullParameter(c5942aFw, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        this.fetchVPNInfo = c5894aFA;
        this.AYXKKw = c5942aFw;
        this.djBIcL = interfaceC8196ayF;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<PasskeyAuthenticateRequest> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default3;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default4;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default5;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<PasskeyRecoverState> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default6;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        PasskeyRecoverViewModel$isCompatible$1 passkeyRecoverViewModel$isCompatible$1;
        PasskeyRecoverViewModel passkeyRecoverViewModel;
        MutableSharedFlow<Boolean> mutableSharedFlow;
        Boolean boolKWHzl;
        boolean z;
        if (continuation instanceof PasskeyRecoverViewModel$isCompatible$1) {
            passkeyRecoverViewModel$isCompatible$1 = (PasskeyRecoverViewModel$isCompatible$1) continuation;
            int i = passkeyRecoverViewModel$isCompatible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyRecoverViewModel$isCompatible$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyRecoverViewModel$isCompatible$1 = new PasskeyRecoverViewModel$isCompatible$1(this, continuation);
            }
        }
        Object objCopydefault = passkeyRecoverViewModel$isCompatible$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = passkeyRecoverViewModel$isCompatible$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            MutableSharedFlow<Boolean> mutableSharedFlow2 = this.AEQbTJ;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            passkeyRecoverViewModel$isCompatible$1.L$0 = this;
            passkeyRecoverViewModel$isCompatible$1.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, passkeyRecoverViewModel$isCompatible$1) == objCopydefault2) {
                return objCopydefault2;
            }
            passkeyRecoverViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = passkeyRecoverViewModel$isCompatible$1.Z$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    return C56443yFo.KWHzl(z);
                }
                passkeyRecoverViewModel = (PasskeyRecoverViewModel) passkeyRecoverViewModel$isCompatible$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                boolean zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                mutableSharedFlow = passkeyRecoverViewModel.AEQbTJ;
                boolKWHzl = C56443yFo.KWHzl(false);
                passkeyRecoverViewModel$isCompatible$1.L$0 = null;
                passkeyRecoverViewModel$isCompatible$1.Z$0 = zBooleanValue;
                passkeyRecoverViewModel$isCompatible$1.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, passkeyRecoverViewModel$isCompatible$1) != objCopydefault2) {
                    return objCopydefault2;
                }
                z = zBooleanValue;
                return C56443yFo.KWHzl(z);
            }
            passkeyRecoverViewModel = (PasskeyRecoverViewModel) passkeyRecoverViewModel$isCompatible$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        InterfaceC8196ayF interfaceC8196ayF = passkeyRecoverViewModel.djBIcL;
        PasskeyScenario.CedefiWallet cedefiWallet = new PasskeyScenario.CedefiWallet(null, false, 3, null);
        passkeyRecoverViewModel$isCompatible$1.L$0 = passkeyRecoverViewModel;
        passkeyRecoverViewModel$isCompatible$1.label = 2;
        objCopydefault = interfaceC8196ayF.copydefault(cedefiWallet, false, passkeyRecoverViewModel$isCompatible$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        boolean zBooleanValue2 = ((Boolean) objCopydefault).booleanValue();
        mutableSharedFlow = passkeyRecoverViewModel.AEQbTJ;
        boolKWHzl = C56443yFo.KWHzl(false);
        passkeyRecoverViewModel$isCompatible$1.L$0 = null;
        passkeyRecoverViewModel$isCompatible$1.Z$0 = zBooleanValue2;
        passkeyRecoverViewModel$isCompatible$1.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, passkeyRecoverViewModel$isCompatible$1) != objCopydefault2) {
        }
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyRecoverViewModel$clickReset$1(this, null), 3, null);
    }

    public final Job copydefault() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyRecoverViewModel$clickVerify$1(this, null), 3, null);
    }

    public final Job EZpvd(@NotNull PasskeyAuthenticateState passkeyAuthenticateState) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateState, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyRecoverViewModel$finish$1(passkeyAuthenticateState, this, null), 3, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
