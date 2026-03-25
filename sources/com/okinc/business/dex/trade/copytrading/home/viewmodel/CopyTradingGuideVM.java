package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.C25389ivm;
import o.gLQ;
import o.gWN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingGuideVM extends AbstractC33073mpa {
    public final StateFlow<gLQ> AEQbTJ;
    public final gWN KWHzl;
    public final MutableStateFlow<gLQ> OLrzqt;
    public final C19700gMb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gLQ> AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public CopyTradingGuideVM(@NotNull C19700gMb c19700gMb, @NotNull gWN gwn) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(gwn, "");
        this.copydefault = c19700gMb;
        this.KWHzl = gwn;
        MutableStateFlow<gLQ> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final boolean OLrzqt() {
        return this.copydefault.KWHzl() != null;
    }

    public final boolean KWHzl() {
        return this.copydefault.djBIcL();
    }

    public final boolean EZpvd() {
        return this.copydefault.AYXKKw();
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingGuideVM$getSAState$1(this, null), 3, null);
    }
}
