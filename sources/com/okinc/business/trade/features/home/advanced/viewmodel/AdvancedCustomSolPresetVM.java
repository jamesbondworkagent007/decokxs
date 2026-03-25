package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityParam;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.dexlogic.bean.SlippageSelectionBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.PriorityFeeInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C23313hvq;
import o.C25389ivm;
import o.C28299kWg;
import o.C30563ldX;
import o.kRG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedCustomSolPresetVM extends ViewModel {
    public final MutableStateFlow<List<PrioritySelectionBean>> AEQbTJ;
    public boolean AYXKKw;
    public AdvancedMainConfig AhwBna;
    public final StateFlow<String> AkhnZx;
    public final StateFlow<C30563ldX> DbNXlk;
    public MutableStateFlow<PresetRouteType> EZpvd;
    public MutableStateFlow<SlippageMode> KWHzl;
    public MutableStateFlow<String> OLrzqt;
    public MutableStateFlow<C30563ldX> copydefault;
    public final StateFlow<List<PrioritySelectionBean>> djBIcL;
    public final C28299kWg ejfBZ;
    public int fARcdN;
    public final StateFlow<List<SlippageSelectionBean>> fIwbmz;
    public final kRG fJNWhG;
    public final StateFlow<PresetRouteType> fetchVPNInfo;
    public MutableStateFlow<List<SlippageSelectionBean>> gEmmrt;
    public int isConnected;
    public final MutableStateFlow<String> valueOf;
    public final StateFlow<SlippageMode> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedMainConfig AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<PrioritySelectionBean>> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(AdvancedMainConfig advancedMainConfig) {
        this.AhwBna = advancedMainConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.fARcdN = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<PresetRouteType> djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<SlippageMode> gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<SlippageSelectionBean>> isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C30563ldX> valueOf() {
        return this.DbNXlk;
    }

    @yCM
    public AdvancedCustomSolPresetVM(@NotNull C28299kWg c28299kWg, @NotNull kRG krg) {
        Intrinsics.checkNotNullParameter(c28299kWg, "");
        Intrinsics.checkNotNullParameter(krg, "");
        this.ejfBZ = c28299kWg;
        this.fJNWhG = krg;
        AdvancedPriorityFeeType advancedPriorityFeeType = AdvancedPriorityFeeType.Market;
        this.isConnected = advancedPriorityFeeType.getValue();
        this.fARcdN = AdvancedSlippageType.Auto.getValue();
        this.AYXKKw = true;
        MutableStateFlow<List<SlippageSelectionBean>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.gEmmrt = MutableStateFlow;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<PresetRouteType> MutableStateFlow2 = StateFlowKt.MutableStateFlow(PresetRouteType.RouteTypeAuto);
        this.EZpvd = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.OLrzqt = MutableStateFlow3;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<SlippageMode> MutableStateFlow4 = StateFlowKt.MutableStateFlow(SlippageMode.Dynamic);
        this.KWHzl = MutableStateFlow4;
        this.values = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<C30563ldX> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new C30563ldX(advancedPriorityFeeType, "", false));
        this.copydefault = MutableStateFlow5;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow5);
        this.valueOf = StateFlowKt.MutableStateFlow("");
        MutableStateFlow<List<PrioritySelectionBean>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow6;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow6);
    }

    public final DexMultiTokenInfoBean copydefault() {
        AdvancedMainConfig advancedMainConfig = this.AhwBna;
        if (advancedMainConfig != null) {
            return advancedMainConfig.getNativeTokenInfo();
        }
        return null;
    }

    public final PriorityFeeInfo EZpvd() {
        AdvancedMainConfig advancedMainConfig = this.AhwBna;
        if (advancedMainConfig != null) {
            return advancedMainConfig.getPriorityFeeInfo();
        }
        return null;
    }

    public final void OLrzqt(@NotNull String str, @NotNull SlippageMode slippageMode, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomSolPresetVM$initParameters$1(this, i, str2, str, slippageMode, null), 3, null);
    }

    public final void AEQbTJ(int i, AdvancedQuoteUiData advancedQuoteUiData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomSolPresetVM$initPriority$1(advancedQuoteUiData, this, i, str, null), 3, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomSolPresetVM$updateSlippage$1(this, str, null), 3, null);
    }

    private final void EZpvd(PriorityParam priorityParam) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomSolPresetVM$updatePriority$1(this, priorityParam, null), 3, null);
    }

    public final void AEQbTJ(@NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomSolPresetVM$updateRouteType$1(this, presetRouteType, null), 3, null);
    }

    public final String AEQbTJ(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        NonMevPriorityFeeInfo newProxyInstance = null;
        MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl2.fIwbmz();
        if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) != null) {
            newProxyInstance = advancedQuoteAndCallDataKWHzl.getNewProxyInstance();
        }
        return this.fJNWhG.KWHzl(mevInfoBeanFIwbmz, newProxyInstance, this.AYXKKw);
    }

    public final String KWHzl(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        NonMevPriorityFeeInfo newProxyInstance = null;
        MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl2.fIwbmz();
        if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) != null) {
            newProxyInstance = advancedQuoteAndCallDataKWHzl.getNewProxyInstance();
        }
        return this.fJNWhG.AEQbTJ(mevInfoBeanFIwbmz, newProxyInstance, this.AYXKKw);
    }

    public final void AEQbTJ(@NotNull PriorityParam priorityParam) {
        Intrinsics.checkNotNullParameter(priorityParam, "");
        EZpvd(priorityParam);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomSolPresetVM$priorityValueCallbackEvent$1(this, priorityParam, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String KWHzl(int i) {
        if (i == AdvancedPriorityFeeType.Market.getValue()) {
            return DexTrackEventParameter.ButtonName.FEE_LOW.getValue();
        }
        if (i == AdvancedPriorityFeeType.Fast.getValue()) {
            return DexTrackEventParameter.ButtonName.FEE_MID.getValue();
        }
        if (i == AdvancedPriorityFeeType.Turbo.getValue()) {
            return DexTrackEventParameter.ButtonName.FEE_HIGH.getValue();
        }
        if (i == AdvancedPriorityFeeType.Custom.getValue()) {
            return DexTrackEventParameter.ButtonName.FEE_CUSTOM.getValue();
        }
        return DexTrackEventParameter.ButtonName.FEE_LOW.getValue();
    }

    public final String KWHzl(int i, AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        NonMevPriorityFeeInfo newProxyInstance = null;
        MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl2.fIwbmz();
        if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) != null) {
            newProxyInstance = advancedQuoteAndCallDataKWHzl.getNewProxyInstance();
        }
        return i == AdvancedPriorityFeeType.Custom.getValue() ? this.copydefault.getValue().OLrzqt() : i == AdvancedPriorityFeeType.Market.getValue() ? this.fJNWhG.KWHzl(mevInfoBeanFIwbmz, newProxyInstance, this.AYXKKw) : i == AdvancedPriorityFeeType.Fast.getValue() ? this.fJNWhG.copydefault(mevInfoBeanFIwbmz, newProxyInstance, this.AYXKKw) : i == AdvancedPriorityFeeType.Turbo.getValue() ? this.fJNWhG.AEQbTJ(mevInfoBeanFIwbmz, newProxyInstance, this.AYXKKw) : this.copydefault.getValue().OLrzqt();
    }

    public final String EZpvd(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        NonMevPriorityFeeInfo newProxyInstance = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.getNewProxyInstance();
        String baseFee = newProxyInstance != null ? newProxyInstance.getBaseFee() : null;
        return baseFee == null ? "" : baseFee;
    }

    public final String EZpvd(int i, AdvancedQuoteUiData advancedQuoteUiData) {
        return C23313hvq.addCheckS$default(KWHzl(i, advancedQuoteUiData), EZpvd(advancedQuoteUiData), null, null, null, 14, null);
    }

    public final void copydefault(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomSolPresetVM$initSlippage$1(str2, i, str, this, null), 3, null);
    }

    public final boolean OLrzqt(@NotNull String str, AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        return this.fJNWhG.OLrzqt(str, (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl.fetchVPNInfo());
    }

    public final void OLrzqt(@NotNull SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(slippageMode, "");
        this.ejfBZ.AEQbTJ(slippageMode);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomSolPresetVM$setSlippageMode$1(this, slippageMode, null), 3, null);
    }

    public final SlippageMode values() {
        SlippageMode slippageModeCopydefault = this.ejfBZ.copydefault();
        return slippageModeCopydefault == null ? SlippageMode.Dynamic : slippageModeCopydefault;
    }

    public final void OLrzqt(String str) {
        this.ejfBZ.KWHzl(str);
    }

    public final String OLrzqt() {
        return this.ejfBZ.EZpvd();
    }
}
