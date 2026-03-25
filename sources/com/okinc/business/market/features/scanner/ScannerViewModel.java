package com.okinc.business.market.features.scanner;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC29288kqn;
import o.C25389ivm;
import o.C25983jNp;
import o.C28446kat;
import o.C29709kyk;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ScannerViewModel extends ViewModel {
    public final C29709kyk AEQbTJ;
    public final MutableStateFlow<AbstractC29288kqn> EZpvd;
    public final C25983jNp KWHzl;
    public final StateFlow<AbstractC29288kqn> OLrzqt;
    public final C28446kat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC29288kqn> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public ScannerViewModel(@NotNull C25983jNp c25983jNp, @NotNull C28446kat c28446kat, @NotNull C29709kyk c29709kyk) {
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(c28446kat, "");
        Intrinsics.checkNotNullParameter(c29709kyk, "");
        this.KWHzl = c25983jNp;
        this.copydefault = c28446kat;
        this.AEQbTJ = c29709kyk;
        MutableStateFlow<AbstractC29288kqn> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC29288kqn.Activity.EZpvd);
        this.EZpvd = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        KWHzl();
    }

    public final void KWHzl() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ScannerViewModel$loadData$1(this, null), 3, null);
    }
}
