package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.SlippageSelectionBean;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28299kWg;
import o.C30563ldX;
import o.kRH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedCustomOtherChainPresetVM extends ViewModel {
    public MutableStateFlow<C30563ldX> AEQbTJ;
    public final StateFlow<PresetRouteType> AYXKKw;
    public boolean AhwBna;
    public final C28299kWg AkhnZx;
    public MutableStateFlow<String> EZpvd;
    public MutableStateFlow<PresetRouteType> KWHzl;
    public AdvancedMainConfig OLrzqt;
    public MutableStateFlow<List<SlippageSelectionBean>> copydefault;
    public final kRH djBIcL;
    public final StateFlow<String> fetchVPNInfo;
    public final StateFlow<C30563ldX> gEmmrt;
    public final StateFlow<List<SlippageSelectionBean>> isConnected;
    public int valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedMainConfig AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(AdvancedMainConfig advancedMainConfig) {
        this.OLrzqt = advancedMainConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<PresetRouteType> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C30563ldX> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<SlippageSelectionBean>> valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.AhwBna;
    }

    @yCM
    public AdvancedCustomOtherChainPresetVM(@NotNull C28299kWg c28299kWg, @NotNull kRH krh) {
        Intrinsics.checkNotNullParameter(c28299kWg, "");
        Intrinsics.checkNotNullParameter(krh, "");
        this.AkhnZx = c28299kWg;
        this.djBIcL = krh;
        AdvancedPriorityFeeType advancedPriorityFeeType = AdvancedPriorityFeeType.Market;
        this.valueOf = advancedPriorityFeeType.getValue();
        this.values = AdvancedSlippageType.Auto.getValue();
        this.AhwBna = true;
        MutableStateFlow<List<SlippageSelectionBean>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<PresetRouteType> MutableStateFlow2 = StateFlowKt.MutableStateFlow(PresetRouteType.RouteTypeAuto);
        this.KWHzl = MutableStateFlow2;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.EZpvd = MutableStateFlow3;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<C30563ldX> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new C30563ldX(advancedPriorityFeeType, "", false));
        this.AEQbTJ = MutableStateFlow4;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow4);
    }

    public final DexMultiTokenInfoBean OLrzqt() {
        AdvancedMainConfig advancedMainConfig = this.OLrzqt;
        if (advancedMainConfig != null) {
            return advancedMainConfig.getNativeTokenInfo();
        }
        return null;
    }

    public final void copydefault(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomOtherChainPresetVM$initParameters$1(this, i, str2, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomOtherChainPresetVM$updateSlippage$1(this, str, null), 3, null);
    }

    public final void OLrzqt(@NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomOtherChainPresetVM$updateRouteType$1(this, presetRouteType, null), 3, null);
    }

    public final String KWHzl(AdvancedQuoteUiData advancedQuoteUiData) {
        return this.djBIcL.AEQbTJ(advancedQuoteUiData);
    }

    public final String OLrzqt(AdvancedQuoteUiData advancedQuoteUiData, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        kRH krh = this.djBIcL;
        AdvancedMainConfig advancedMainConfig = this.OLrzqt;
        String gasPriceUnitDecimal = advancedMainConfig != null ? advancedMainConfig.getGasPriceUnitDecimal() : null;
        return krh.copydefault(advancedQuoteUiData, str, gasPriceUnitDecimal == null ? "" : gasPriceUnitDecimal, str2, z);
    }

    public final void OLrzqt(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomOtherChainPresetVM$initSlippage$1(str2, i, str, this, null), 3, null);
    }

    public final boolean isConnected() {
        return this.djBIcL.OLrzqt();
    }

    public final void AEQbTJ(@NotNull SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(slippageMode, "");
        this.AkhnZx.AEQbTJ(slippageMode);
    }

    public final SlippageMode djBIcL() {
        SlippageMode slippageModeCopydefault = this.AkhnZx.copydefault();
        return slippageModeCopydefault == null ? SlippageMode.Dynamic : slippageModeCopydefault;
    }

    public final void OLrzqt(String str) {
        this.AkhnZx.KWHzl(str);
    }

    public final String EZpvd() {
        return this.AkhnZx.EZpvd();
    }
}
