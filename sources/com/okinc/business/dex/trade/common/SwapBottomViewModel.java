package com.okinc.business.dex.trade.common;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.InterfaceC19753gOa;
import o.kTW;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SwapBottomViewModel extends AbstractC33073mpa {
    public final StateFlow<InterfaceC19753gOa> AEQbTJ;
    public final kTW KWHzl;
    public final C19700gMb OLrzqt;
    public final MutableStateFlow<InterfaceC19753gOa> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC19753gOa> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public SwapBottomViewModel(@NotNull C19700gMb c19700gMb, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.OLrzqt = c19700gMb;
        this.KWHzl = ktw;
        MutableStateFlow<InterfaceC19753gOa> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC19753gOa.ActionBar.copydefault);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = MutableStateFlow;
        copydefault();
    }

    public final boolean EZpvd() {
        return this.OLrzqt.djBIcL();
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SwapBottomViewModel$checkEoaAutoConfirmStatus$1(this, null), 3, null);
    }
}
