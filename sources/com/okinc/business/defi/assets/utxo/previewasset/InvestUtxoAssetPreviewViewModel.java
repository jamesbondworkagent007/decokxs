package com.okinc.business.defi.assets.utxo.previewasset;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C10306blv;
import o.C13934dbu;
import o.InterfaceC10310blz;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoAssetPreviewViewModel extends ViewModel {
    public final C10306blv AEQbTJ;
    public final MutableStateFlow<InterfaceC10310blz> KWHzl;
    public final StateFlow<InterfaceC10310blz> OLrzqt;
    public final C13934dbu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC10310blz> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public InvestUtxoAssetPreviewViewModel(@NotNull C13934dbu c13934dbu, @NotNull C10306blv c10306blv) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c10306blv, "");
        this.copydefault = c13934dbu;
        this.AEQbTJ = c10306blv;
        MutableStateFlow<InterfaceC10310blz> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC10310blz.Activity.copydefault);
        this.KWHzl = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt(@NotNull InvestUtxoAssetPreviewParams investUtxoAssetPreviewParams) {
        Intrinsics.checkNotNullParameter(investUtxoAssetPreviewParams, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUtxoAssetPreviewViewModel$loadData$1(this, investUtxoAssetPreviewParams, null), 3, null);
    }
}
