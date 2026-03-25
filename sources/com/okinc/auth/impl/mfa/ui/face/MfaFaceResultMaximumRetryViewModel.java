package com.okinc.auth.impl.mfa.ui.face;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C5766aCf;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaFaceResultMaximumRetryViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<MfaFailure> AEQbTJ;
    public final MutableSharedFlow<Boolean> EZpvd;
    public final SharedFlow<Boolean> KWHzl;
    public final MutableSharedFlow<MfaResponse> OLrzqt;
    public final C5766aCf copydefault;
    public final SharedFlow<MfaResponse> djBIcL;
    public final SharedFlow<MfaFailure> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaResponse> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public MfaFaceResultMaximumRetryViewModel(@NotNull C5766aCf c5766aCf) {
        Intrinsics.checkNotNullParameter(c5766aCf, "");
        this.copydefault = c5766aCf;
        MutableSharedFlow<MfaResponse> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default3;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    public final void KWHzl(@NotNull String str, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaFaceResultMaximumRetryViewModel$clickNext$1(this, str, subdomainStrategy, mfaScenario, null), 3, null);
    }
}
