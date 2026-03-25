package com.okinc.auth.impl.passkey.ui.resetremove.resetremove;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
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
import o.C5916aFW;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityResetRemovePasskeyServiceViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<String> AEQbTJ;
    public final SharedFlow<Unit> AYXKKw;
    public final SharedFlow<String> AhwBna;
    public final SharedFlow<Unit> AkhnZx;
    public final SharedFlow<PasskeyResetRemoveType> DbNXlk;
    public final MutableLiveData<PasskeyResetRemoveType> KWHzl;
    public final MutableSharedFlow<Unit> copydefault;
    public final MutableLiveData<Boolean> djBIcL;
    public final LiveData<Boolean> fetchVPNInfo;
    public final MutableSharedFlow<PasskeyResetRemoveType> gEmmrt;
    public final C5916aFW isConnected;
    public final MutableSharedFlow<Unit> valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final String EZpvd = "ResetRemovePasskeyServiceViewModel";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PasskeyResetRemoveType> AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.AYXKKw;
    }

    @yCM
    public SecurityResetRemovePasskeyServiceViewModel(@NotNull C5916aFW c5916aFW) {
        Intrinsics.checkNotNullParameter(c5916aFW, "");
        this.isConnected = c5916aFW;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.djBIcL = mutableLiveData;
        this.fetchVPNInfo = mutableLiveData;
        MutableSharedFlow<PasskeyResetRemoveType> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default2;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default3;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default4;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        this.KWHzl = new MutableLiveData<>();
    }

    public final Job KWHzl(@NotNull PasskeyResetRemoveType passkeyResetRemoveType) {
        Intrinsics.checkNotNullParameter(passkeyResetRemoveType, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityResetRemovePasskeyServiceViewModel$initCheckResetStatus$1(this, passkeyResetRemoveType, null), 3, null);
    }

    public final Job copydefault(@NotNull PasskeyResetRemoveType passkeyResetRemoveType) {
        Intrinsics.checkNotNullParameter(passkeyResetRemoveType, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityResetRemovePasskeyServiceViewModel$checkResetStatus$1(this, passkeyResetRemoveType, null), 3, null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String copydefault() {
            return SecurityResetRemovePasskeyServiceViewModel.EZpvd;
        }
    }
}
