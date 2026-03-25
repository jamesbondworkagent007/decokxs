package com.okinc.business.market.features.meme.explanation.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C29715kyq;
import o.InterfaceC28706kfo;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeLabelExplanationViewModel extends ViewModel {
    public final CoroutineDispatcher AEQbTJ;
    public final C29715kyq KWHzl;
    public final StateFlow<InterfaceC28706kfo> OLrzqt;
    public final MutableStateFlow<InterfaceC28706kfo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28706kfo> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29715kyq copydefault() {
        return this.KWHzl;
    }

    @yCM
    public MemeLabelExplanationViewModel(@NotNull C29715kyq c29715kyq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29715kyq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c29715kyq;
        this.AEQbTJ = coroutineDispatcher;
        MutableStateFlow<InterfaceC28706kfo> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28706kfo.ActionBar.AEQbTJ);
        this.copydefault = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AEQbTJ, null, new MemeLabelExplanationViewModel$loadData$1(this, list, null), 2, null);
    }
}
