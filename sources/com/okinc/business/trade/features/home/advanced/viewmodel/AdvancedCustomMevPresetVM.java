package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
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
import o.C25389ivm;
import o.C28159kRb;
import o.C28161kRd;
import o.C28299kWg;
import o.C30563ldX;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedCustomMevPresetVM extends ViewModel {
    public final MutableStateFlow<C30563ldX> AEQbTJ;
    public final C28159kRb AYXKKw;
    public final C28161kRd AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public String DbNXlk;
    public MutableStateFlow<SlippageMode> EZpvd;
    public final MutableStateFlow<List<PrioritySelectionBean>> KWHzl;
    public final MutableStateFlow<String> OLrzqt;
    public final MutableStateFlow<List<SlippageSelectionBean>> copydefault;
    public final MutableStateFlow<String> djBIcL;
    public final StateFlow<List<SlippageSelectionBean>> ejfBZ;
    public final C28299kWg fARcdN;
    public final StateFlow<SlippageMode> fIwbmz;
    public final StateFlow<String> fJNWhG;
    public final StateFlow<String> fetchVPNInfo;
    public AdvancedMainConfig gEmmrt;
    public final StateFlow<C30563ldX> isConnected;
    public boolean valueOf;
    public final StateFlow<List<PrioritySelectionBean>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> DbNXlk() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<PrioritySelectionBean>> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.AuCTel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(AdvancedMainConfig advancedMainConfig) {
        this.gEmmrt = advancedMainConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C30563ldX> gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<SlippageSelectionBean>> isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<SlippageMode> valueOf() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.AuCTel;
    }

    @yCM
    public AdvancedCustomMevPresetVM(@NotNull C28299kWg c28299kWg, @NotNull C28159kRb c28159kRb, @NotNull C28161kRd c28161kRd) {
        Intrinsics.checkNotNullParameter(c28299kWg, "");
        Intrinsics.checkNotNullParameter(c28159kRb, "");
        Intrinsics.checkNotNullParameter(c28161kRd, "");
        this.fARcdN = c28299kWg;
        this.AYXKKw = c28159kRb;
        this.AhwBna = c28161kRd;
        AdvancedPriorityFeeType advancedPriorityFeeType = AdvancedPriorityFeeType.Market;
        this.AkhnZx = advancedPriorityFeeType.getValue();
        this.AuCTel = AdvancedSlippageType.Auto.getValue();
        this.DbNXlk = "";
        MutableStateFlow<List<SlippageSelectionBean>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.OLrzqt = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<C30563ldX> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new C30563ldX(advancedPriorityFeeType, "", false));
        this.AEQbTJ = MutableStateFlow3;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<SlippageMode> MutableStateFlow4 = StateFlowKt.MutableStateFlow(SlippageMode.Dynamic);
        this.EZpvd = MutableStateFlow4;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow("");
        this.djBIcL = MutableStateFlow5;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<List<PrioritySelectionBean>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow6;
        this.values = FlowKt.asStateFlow(MutableStateFlow6);
    }

    public final DexMultiTokenInfoBean OLrzqt() {
        AdvancedMainConfig advancedMainConfig = this.gEmmrt;
        if (advancedMainConfig != null) {
            return advancedMainConfig.getNativeTokenInfo();
        }
        return null;
    }

    public final PriorityFeeInfo AEQbTJ() {
        AdvancedMainConfig advancedMainConfig = this.gEmmrt;
        if (advancedMainConfig != null) {
            return advancedMainConfig.getPriorityFeeInfo();
        }
        return null;
    }

    public final void AEQbTJ(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomMevPresetVM$initSlippage$1(str2, i, str, this, null), 3, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull SlippageMode slippageMode, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomMevPresetVM$initParameters$1(this, i, str2, str, slippageMode, null), 3, null);
    }

    public final void copydefault(int i, AdvancedQuoteUiData advancedQuoteUiData) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomMevPresetVM$initPriority$1(this, i, advancedQuoteUiData, null), 3, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomMevPresetVM$updateSlippage$1(this, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull PriorityParam priorityParam) {
        Intrinsics.checkNotNullParameter(priorityParam, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomMevPresetVM$updatePriority$1(this, priorityParam, null), 3, null);
    }

    public final String AEQbTJ(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl3;
        Boolean boolAkhnZx = AkhnZx();
        NonMevPriorityFeeInfo newProxyInstance = null;
        MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl3 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl3.fIwbmz();
        if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) != null) {
            newProxyInstance = advancedQuoteAndCallDataKWHzl2.getNewProxyInstance();
        }
        return this.AYXKKw.OLrzqt(Intrinsics.EZpvd(boolAkhnZx, Boolean.TRUE), this.AhwBna.KWHzl(this.DbNXlk, (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl.fetchVPNInfo()), mevInfoBeanFIwbmz, newProxyInstance);
    }

    public final String KWHzl(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl3;
        Boolean boolAkhnZx = AkhnZx();
        NonMevPriorityFeeInfo newProxyInstance = null;
        MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl3 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl3.fIwbmz();
        if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) != null) {
            newProxyInstance = advancedQuoteAndCallDataKWHzl2.getNewProxyInstance();
        }
        return this.AYXKKw.EZpvd(Intrinsics.EZpvd(boolAkhnZx, Boolean.TRUE), this.AhwBna.KWHzl(this.DbNXlk, (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl.fetchVPNInfo()), mevInfoBeanFIwbmz, newProxyInstance);
    }

    public final String EZpvd(int i, AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl3;
        NonMevPriorityFeeInfo newProxyInstance = null;
        MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl3 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl3.fIwbmz();
        if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) != null) {
            newProxyInstance = advancedQuoteAndCallDataKWHzl2.getNewProxyInstance();
        }
        boolean zKWHzl = this.AhwBna.KWHzl(this.DbNXlk, (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl.fetchVPNInfo());
        if (i == AdvancedPriorityFeeType.Custom.getValue()) {
            return this.AEQbTJ.getValue().OLrzqt();
        }
        if (i == AdvancedPriorityFeeType.Market.getValue()) {
            return this.AYXKKw.OLrzqt(Intrinsics.EZpvd(AkhnZx(), Boolean.TRUE), zKWHzl, mevInfoBeanFIwbmz, newProxyInstance);
        }
        if (i == AdvancedPriorityFeeType.Fast.getValue()) {
            return this.AYXKKw.KWHzl(Intrinsics.EZpvd(AkhnZx(), Boolean.TRUE), zKWHzl, mevInfoBeanFIwbmz, newProxyInstance);
        }
        if (i == AdvancedPriorityFeeType.Turbo.getValue()) {
            return this.AYXKKw.EZpvd(Intrinsics.EZpvd(AkhnZx(), Boolean.TRUE), zKWHzl, mevInfoBeanFIwbmz, newProxyInstance);
        }
        return this.AEQbTJ.getValue().OLrzqt();
    }

    public final void EZpvd(@NotNull PriorityParam priorityParam) {
        Intrinsics.checkNotNullParameter(priorityParam, "");
        int priorityType = priorityParam.getPriorityType();
        this.AkhnZx = priorityType;
        this.valueOf = priorityType == AdvancedPriorityFeeType.Custom.getValue();
        AEQbTJ(priorityParam);
        this.djBIcL.setValue(EZpvd(priorityParam.getPriorityType()));
    }

    private final String EZpvd(int i) {
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

    public final String copydefault(AdvancedQuoteUiData advancedQuoteUiData, @NotNull String str, @NotNull String str2) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl3 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl3.fIwbmz();
        NonMevPriorityFeeInfo newProxyInstance = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl2.getNewProxyInstance();
        boolean zKWHzl = this.AhwBna.KWHzl(this.DbNXlk, (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl.fetchVPNInfo());
        C28159kRb c28159kRb = this.AYXKKw;
        boolean zEZpvd = Intrinsics.EZpvd(AkhnZx(), Boolean.TRUE);
        int i = this.AkhnZx;
        AdvancedMainConfig advancedMainConfig = this.gEmmrt;
        String gasPriceUnitDecimal = advancedMainConfig != null ? advancedMainConfig.getGasPriceUnitDecimal() : null;
        return c28159kRb.OLrzqt(zEZpvd, i, mevInfoBeanFIwbmz, newProxyInstance, zKWHzl, str, gasPriceUnitDecimal != null ? gasPriceUnitDecimal : "", str2, this.isConnected.getValue().OLrzqt());
    }

    public final Boolean AkhnZx() {
        AdvancedMainConfig advancedMainConfig = this.gEmmrt;
        if (advancedMainConfig != null) {
            return advancedMainConfig.getSupportEip1559();
        }
        return null;
    }

    public final String KWHzl() {
        AdvancedMainConfig advancedMainConfig = this.gEmmrt;
        String gasPriceUnitDecimal = advancedMainConfig != null ? advancedMainConfig.getGasPriceUnitDecimal() : null;
        return gasPriceUnitDecimal == null ? "" : gasPriceUnitDecimal;
    }

    public final void OLrzqt(int i, AdvancedQuoteUiData advancedQuoteUiData) {
        copydefault(i, advancedQuoteUiData);
    }

    public final boolean OLrzqt(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        return this.AhwBna.KWHzl(this.DbNXlk, (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl.fetchVPNInfo());
    }

    public final void OLrzqt(@NotNull SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(slippageMode, "");
        this.fARcdN.AEQbTJ(slippageMode);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedCustomMevPresetVM$setSlippageMode$1(this, slippageMode, null), 3, null);
    }

    public final SlippageMode fetchVPNInfo() {
        SlippageMode slippageModeCopydefault = this.fARcdN.copydefault();
        return slippageModeCopydefault == null ? SlippageMode.Dynamic : slippageModeCopydefault;
    }

    public final void OLrzqt(String str) {
        this.fARcdN.KWHzl(str);
    }

    public final String copydefault() {
        return this.fARcdN.EZpvd();
    }
}
