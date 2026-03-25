package com.okinc.business.market.features.rwa.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C29162koT;
import o.InterfaceC29168koZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RwaStatusesViewModel extends ViewModel {
    public final C29162koT AEQbTJ;
    public final StateFlow<InterfaceC29168koZ> KWHzl;
    public final MutableStateFlow<InterfaceC29168koZ> OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC29168koZ> copydefault() {
        return this.KWHzl;
    }

    @yCM
    public RwaStatusesViewModel(@NotNull C29162koT c29162koT, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29162koT, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c29162koT;
        this.copydefault = coroutineDispatcher;
        MutableStateFlow<InterfaceC29168koZ> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC29168koZ.Activity.copydefault);
        this.OLrzqt = MutableStateFlow;
        this.KWHzl = MutableStateFlow;
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<InterfaceC29168koZ> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), InterfaceC29168koZ.Activity.copydefault)) {
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new RwaStatusesViewModel$loadData$2(this, str, null), 2, null);
    }
}
