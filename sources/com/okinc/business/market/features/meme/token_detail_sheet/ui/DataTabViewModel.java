package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC28783khL;
import o.AbstractC28866kip;
import o.C27629jym;
import o.C28620keH;
import o.C28727kgI;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DataTabViewModel extends ViewModel {
    public final MutableStateFlow<AbstractC28783khL> AEQbTJ;
    public final C27629jym AhwBna;
    public final MutableStateFlow<String> EZpvd;
    public final MutableStateFlow<AbstractC28866kip> KWHzl;
    public final StateFlow<AbstractC28783khL> OLrzqt;
    public final StateFlow<String> copydefault;
    public final C28620keH djBIcL;
    public final StateFlow<AbstractC28866kip> gEmmrt;
    public final C28727kgI valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC28783khL> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> copydefault() {
        return this.copydefault;
    }

    @yCM
    public DataTabViewModel(@NotNull C28620keH c28620keH, @NotNull C28727kgI c28727kgI, @NotNull C27629jym c27629jym) {
        Intrinsics.checkNotNullParameter(c28620keH, "");
        Intrinsics.checkNotNullParameter(c28727kgI, "");
        Intrinsics.checkNotNullParameter(c27629jym, "");
        this.djBIcL = c28620keH;
        this.valueOf = c28727kgI;
        this.AhwBna = c27629jym;
        MutableStateFlow<AbstractC28783khL> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC28783khL.Activity.AEQbTJ);
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC28866kip> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC28866kip.StateListAnimator.EZpvd);
        this.KWHzl = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.EZpvd = MutableStateFlow3;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final void KWHzl(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DataTabViewModel$fetchBubbleMap$1(this, str2, str, null), 3, null);
    }

    public final void loadData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AEQbTJ(str, str2);
        if (str3.length() > 0) {
            copydefault(str, str2, str3);
        }
        KWHzl(str, str2);
    }

    public final void AEQbTJ(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DataTabViewModel$fetchBundleDetail$1(this, str, str2, null), 3, null);
    }

    public final void copydefault(String str, String str2, String str3) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DataTabViewModel$fetchHolderInfo$1(this, str, str2, str3, null), 3, null);
    }
}
