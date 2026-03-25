package com.okinc.business.market.features.ai_summary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C25389ivm;
import o.C25624jAh;
import o.C25794jGp;
import o.InterfaceC25627jAk;
import o.InterfaceC25784jGf;
import o.InterfaceC25788jGj;
import o.pTU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeAiViewModel extends AbstractC33073mpa {
    public final pTU AEQbTJ;
    public final C25624jAh AhwBna;
    public final MutableLiveData<InterfaceC25627jAk> EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final MutableStateFlow<InterfaceC25788jGj> OLrzqt;
    public final C25794jGp copydefault;
    public final StateFlow<InterfaceC25788jGj> djBIcL;
    public final LiveData<InterfaceC25627jAk> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC25788jGj> KWHzl() {
        return this.djBIcL;
    }

    @yCM
    public MemeAiViewModel(@NotNull C25624jAh c25624jAh, @NotNull C25794jGp c25794jGp, @NotNull pTU ptu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25624jAh, "");
        Intrinsics.checkNotNullParameter(c25794jGp, "");
        Intrinsics.checkNotNullParameter(ptu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AhwBna = c25624jAh;
        this.copydefault = c25794jGp;
        this.AEQbTJ = ptu;
        this.KWHzl = coroutineDispatcher;
        MutableLiveData<InterfaceC25627jAk> mutableLiveData = new MutableLiveData<>();
        this.EZpvd = mutableLiveData;
        this.gEmmrt = mutableLiveData;
        MutableStateFlow<InterfaceC25788jGj> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC25788jGj.Dialog.KWHzl);
        this.OLrzqt = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.KWHzl, null, new MemeAiViewModel$loadInsightsSummary$1(this, str, str2, str3, null), 2, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC25788jGj value = this.OLrzqt.getValue();
        if (value instanceof InterfaceC25788jGj.Activity) {
            this.OLrzqt.setValue(InterfaceC25788jGj.Activity.copy$default((InterfaceC25788jGj.Activity) value, null, null, !r8.OLrzqt(), false, null, 27, null));
        } else if (value instanceof InterfaceC25784jGf) {
            InterfaceC25784jGf interfaceC25784jGf = (InterfaceC25784jGf) value;
            this.OLrzqt.setValue(new InterfaceC25788jGj.Application(interfaceC25784jGf.KWHzl(), interfaceC25784jGf.EZpvd(), interfaceC25784jGf.AEQbTJ()));
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.KWHzl, null, new MemeAiViewModel$toggleTranslation$1(this, str, str2, str3, value, null), 2, null);
        }
    }
}
