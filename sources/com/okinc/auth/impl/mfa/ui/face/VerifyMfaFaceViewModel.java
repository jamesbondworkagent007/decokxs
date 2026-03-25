package com.okinc.auth.impl.mfa.ui.face;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C5707aBZ;
import o.C5769aCi;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaFaceViewModel extends AbstractC33073mpa {
    public final MutableLiveData<MfaScenario> AEQbTJ;
    public final MutableSharedFlow<String> AYXKKw;
    public final MutableLiveData<SubdomainStrategy> AhwBna;
    public final SharedFlow<MfaResponse> DbNXlk;
    public final MutableSharedFlow<MfaResponse> EZpvd;
    public final MutableLiveData<String> KWHzl;
    public final MutableSharedFlow<Boolean> OLrzqt;
    public final MutableSharedFlow<MfaFailure> copydefault;
    public final SharedFlow<MfaFailure> djBIcL;
    public final C5707aBZ gEmmrt;
    public final C5769aCi isConnected;
    public final SharedFlow<Boolean> valueOf;
    public final SharedFlow<String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaResponse> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SubdomainStrategy> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public VerifyMfaFaceViewModel(@NotNull C5707aBZ c5707aBZ, @NotNull C5769aCi c5769aCi) {
        Intrinsics.checkNotNullParameter(c5707aBZ, "");
        Intrinsics.checkNotNullParameter(c5769aCi, "");
        this.gEmmrt = c5707aBZ;
        this.isConnected = c5769aCi;
        this.KWHzl = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<MfaResponse> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default3;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default4;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
    }

    public final Job copydefault(@NotNull String str, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaFaceViewModel$initFlow$1(this, str, mfaScenario, subdomainStrategy, null), 3, null);
    }

    public static /* synthetic */ Job retrieveFacialResult$default(VerifyMfaFaceViewModel verifyMfaFaceViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0 && (str = verifyMfaFaceViewModel.KWHzl.getValue()) == null) {
            str = "";
        }
        return verifyMfaFaceViewModel.KWHzl(str);
    }

    public final Job KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaFaceViewModel$retrieveFacialResult$1(this, str, null), 3, null);
    }
}
