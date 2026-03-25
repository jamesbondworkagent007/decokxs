package com.okinc.business.market.features.tag.ui;

import androidx.lifecycle.ViewModelKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C25389ivm;
import o.C29713kyo;
import o.InterfaceC29685kyM;
import o.kKG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TagExplanationViewModel extends AbstractC33073mpa {
    public final C29713kyo AEQbTJ;
    public final kKG EZpvd;
    public final MutableStateFlow<InterfaceC29685kyM> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final StateFlow<InterfaceC29685kyM> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC29685kyM> AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public TagExplanationViewModel(@NotNull C29713kyo c29713kyo, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29713kyo, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c29713kyo;
        this.EZpvd = kkg;
        this.OLrzqt = coroutineDispatcher;
        MutableStateFlow<InterfaceC29685kyM> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC29685kyM.StateListAnimator.KWHzl);
        this.KWHzl = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ void loadData$default(TagExplanationViewModel tagExplanationViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        tagExplanationViewModel.OLrzqt(str, str2, z);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.setValue(InterfaceC29685kyM.StateListAnimator.KWHzl);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new TagExplanationViewModel$loadData$1(this, str, str2, z, null), 2, null);
    }

    public final Object KWHzl(@NotNull Continuation<? super String> continuation) {
        return this.EZpvd.AEQbTJ(continuation);
    }
}
