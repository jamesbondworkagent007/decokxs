package com.okinc.business.dexui.main.swap.trade.savings.ui;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C23212htv;
import o.C23274hvD;
import o.C24856ili;
import o.C24857ilj;
import o.C25389ivm;
import o.C33070mpX;
import o.C59443zhD;
import o.InterfaceC24858ilk;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SavingsSummaryViewModel extends ViewModel {
    public final StateFlow<InterfaceC24858ilk> AEQbTJ;
    public final C23212htv AhwBna;
    public final StateFlow<C24856ili> EZpvd;
    public final C24857ilj KWHzl;
    public final MutableStateFlow<C24856ili> OLrzqt;
    public final MutableStateFlow<InterfaceC24858ilk> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24858ilk> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C24856ili> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public SavingsSummaryViewModel(@NotNull C24857ilj c24857ilj, @NotNull C23212htv c23212htv) {
        Intrinsics.checkNotNullParameter(c24857ilj, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        this.KWHzl = c24857ilj;
        this.AhwBna = c23212htv;
        MutableStateFlow<InterfaceC24858ilk> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC24858ilk.ActionBar.OLrzqt);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C24856ili> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C24856ili(null, null, 3, null));
        this.OLrzqt = MutableStateFlow2;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final void EZpvd() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SavingsSummaryViewModel$loadData$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        String strCopydefault = this.AhwBna.copydefault();
        if (strCopydefault.length() <= 0) {
            strCopydefault = null;
        }
        this.OLrzqt.setValue(new C24856ili(strCopydefault, strCopydefault != null ? KWHzl(strCopydefault) : null));
    }

    public final String KWHzl(String str) {
        return (C33070mpX.AYXKKw(C23274hvD.Fragment.vLaW) + "/dex/market") + "?ref=" + str;
    }

    public final boolean copydefault(SavingsSummaryResponse savingsSummaryResponse) {
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(savingsSummaryResponse.getTotalTradeCount());
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        Double dAuCTel = C59443zhD.AuCTel(savingsSummaryResponse.getTotalSavingValueUsd());
        double dDoubleValue = dAuCTel != null ? dAuCTel.doubleValue() : 0.0d;
        Double dAuCTel2 = C59443zhD.AuCTel(savingsSummaryResponse.getTotalSurplusValueUsd());
        double dDoubleValue2 = dAuCTel2 != null ? dAuCTel2.doubleValue() : 0.0d;
        Double dAuCTel3 = C59443zhD.AuCTel(savingsSummaryResponse.getTotalTradeValueUsd());
        return iIntValue == 0 && dDoubleValue == AudioStats.AUDIO_AMPLITUDE_NONE && dDoubleValue2 == AudioStats.AUDIO_AMPLITUDE_NONE && (dAuCTel3 != null ? dAuCTel3.doubleValue() : 0.0d) == AudioStats.AUDIO_AMPLITUDE_NONE;
    }
}
