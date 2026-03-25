package com.okinc.business.dex.tee.swap.market.ui.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.domain.model.PlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.C19703gMe;
import o.C19750gNy;
import o.C19757gOe;
import o.C22301hcl;
import o.C22303hcn;
import o.C22380heK;
import o.C23212htv;
import o.C30457lbX;
import o.C30516lcd;
import o.C31200lpY;
import o.InterfaceC9740bbL;
import o.gLQ;
import o.gNO;
import o.kTW;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleSwapMarketPlaceOrderViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<String> AYXKKw;
    public final C19703gMe AhwBna;
    public final StateFlow<Boolean> AkhnZx;
    public final SharedFlow<String> AuCTel;
    public final StateFlow<C30457lbX> DbNXlk;
    public final MutableStateFlow<MarketTransactionFeeCacheParams> EZpvd;
    public final MutableStateFlow<C30457lbX> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableStateFlow<Boolean> copydefault;
    public final MutableSharedFlow<SignAndBroadcastRes> djBIcL;
    public final OrderRetryHelper ejfBZ;
    public final gNO fARcdN;
    public final C22301hcl fIwbmz;
    public final C22303hcn fJNWhG;
    public final C19757gOe fetchVPNInfo;
    public final kTW gEmmrt;
    public final StateFlow<PresetRouteType> getFieldNames;
    public final C19700gMb getNewProxyInstance;
    public final C19750gNy hDKMBd;
    public final StateFlow<MarketTransactionFeeCacheParams> isConnected;
    public final SharedFlow<SignAndBroadcastRes> iwGUEr;
    public final String uzCIH;
    public final MutableStateFlow<PresetRouteType> valueOf;
    public final StateFlow<Boolean> values;
    public final C23212htv zsXlph;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<PresetRouteType> AhwBna() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C30457lbX> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<MarketTransactionFeeCacheParams> copydefault() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<SignAndBroadcastRes> valueOf() {
        return this.iwGUEr;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.swap.market.ui.viewmodel.SingleSwapMarketPlaceOrderViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @yCM
    public SingleSwapMarketPlaceOrderViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C19750gNy c19750gNy, @NotNull C19700gMb c19700gMb, @NotNull gNO gno, @NotNull C22301hcl c22301hcl, @NotNull C19703gMe c19703gMe, @NotNull C22303hcn c22303hcn, @NotNull C19757gOe c19757gOe, @NotNull C23212htv c23212htv, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c19750gNy, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(gno, "");
        Intrinsics.checkNotNullParameter(c22301hcl, "");
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(c22303hcn, "");
        Intrinsics.checkNotNullParameter(c19757gOe, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.hDKMBd = c19750gNy;
        this.getNewProxyInstance = c19700gMb;
        this.fARcdN = gno;
        this.fIwbmz = c22301hcl;
        this.AhwBna = c19703gMe;
        this.fJNWhG = c22303hcn;
        this.fetchVPNInfo = c19757gOe;
        this.zsXlph = c23212htv;
        this.gEmmrt = ktw;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.copydefault = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C30457lbX> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C30457lbX(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        this.KWHzl = MutableStateFlow2;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<SignAndBroadcastRes> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default2;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.uzCIH = C31200lpY.getSourceType$default(savedStateHandle, (String) null, 1, (Object) null);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.OLrzqt = MutableStateFlow3;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<MarketTransactionFeeCacheParams> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow4;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<PresetRouteType> MutableStateFlow5 = StateFlowKt.MutableStateFlow(PresetRouteType.RouteTypeAuto);
        this.valueOf = MutableStateFlow5;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow5);
        this.ejfBZ = new OrderRetryHelper("SingleSwapMarketPlaceOrderViewModel");
    }

    public final void EZpvd(boolean z) {
        this.copydefault.setValue(Boolean.valueOf(z));
    }

    public final void copydefault(@NotNull QuotePriceRes quotePriceRes, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SwapPriorityFeeInfo priorityFeeInfo = quotePriceRes.getPriorityFeeInfo();
        if (priorityFeeInfo == null) {
            priorityFeeInfo = new SwapPriorityFeeInfo((List) null, (NonMevPriorityFeeInfo) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }
        MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsOLrzqt = OLrzqt(str2, z, priorityFeeInfo, quotePriceRes);
        List<C30516lcd> listEZpvd = this.KWHzl.getValue().EZpvd();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEZpvd) {
            if (((C30516lcd) obj).OLrzqt() == ConfirmOrderTag.BOOST) {
                arrayList.add(obj);
            }
        }
        C30457lbX c30457lbXEZpvd = this.fARcdN.EZpvd(quotePriceRes, str, marketTransactionFeeCacheParamsOLrzqt.copydefault());
        this.KWHzl.setValue(c30457lbXEZpvd.copydefault((8159 & 1) != 0 ? c30457lbXEZpvd.EZpvd : null, (8159 & 2) != 0 ? c30457lbXEZpvd.OLrzqt : null, (8159 & 4) != 0 ? c30457lbXEZpvd.AYXKKw : null, (8159 & 8) != 0 ? c30457lbXEZpvd.DbNXlk : null, (8159 & 16) != 0 ? c30457lbXEZpvd.djBIcL : null, (8159 & 32) != 0 ? c30457lbXEZpvd.AEQbTJ : CollectionsKt___CollectionsKt.djBIcL((Collection) c30457lbXEZpvd.EZpvd(), (Iterable) arrayList), (8159 & 64) != 0 ? c30457lbXEZpvd.fetchVPNInfo : null, (8159 & 128) != 0 ? c30457lbXEZpvd.KWHzl : null, (8159 & 256) != 0 ? c30457lbXEZpvd.gEmmrt : null, (8159 & 512) != 0 ? c30457lbXEZpvd.AhwBna : null, (8159 & 1024) != 0 ? c30457lbXEZpvd.copydefault : null, (8159 & 2048) != 0 ? c30457lbXEZpvd.values : null, (8159 & 4096) != 0 ? c30457lbXEZpvd.valueOf : null));
        EZpvd(quotePriceRes);
    }

    public final void EZpvd(QuotePriceRes quotePriceRes) {
        if (quotePriceRes.isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
            String defiPlatformId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getDefiPlatformId() : null;
            if (defiPlatformId == null) {
                defiPlatformId = "";
            }
            if (this.fetchVPNInfo.KWHzl(defiPlatformId)) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SingleSwapMarketPlaceOrderViewModel$fetchAndAddBoostData$1(quotePriceRes, this, null), 3, null);
                return;
            }
            C30457lbX value = this.KWHzl.getValue();
            List<C30516lcd> listEZpvd = value.EZpvd();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listEZpvd) {
                if (((C30516lcd) obj).OLrzqt() != ConfirmOrderTag.BOOST) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != value.EZpvd().size()) {
                this.KWHzl.setValue(value.copydefault((8159 & 1) != 0 ? value.EZpvd : null, (8159 & 2) != 0 ? value.OLrzqt : null, (8159 & 4) != 0 ? value.AYXKKw : null, (8159 & 8) != 0 ? value.DbNXlk : null, (8159 & 16) != 0 ? value.djBIcL : null, (8159 & 32) != 0 ? value.AEQbTJ : arrayList, (8159 & 64) != 0 ? value.fetchVPNInfo : null, (8159 & 128) != 0 ? value.KWHzl : null, (8159 & 256) != 0 ? value.gEmmrt : null, (8159 & 512) != 0 ? value.AhwBna : null, (8159 & 1024) != 0 ? value.copydefault : null, (8159 & 2048) != 0 ? value.values : null, (8159 & 4096) != 0 ? value.valueOf : null));
            }
        }
    }

    public final boolean EZpvd(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = C22380heK.OLrzqt.copydefault(this.uzCIH).AkhnZx().EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        Boolean boolValueOf = defiChainInfo != null ? Boolean.valueOf(defiChainInfo.getSupportSmartAccount()) : null;
        boolean z = false;
        gLQ glqAEQbTJ = this.AhwBna.AEQbTJ(str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
        boolean zAEQbTJ = glqAEQbTJ != null ? glqAEQbTJ.AEQbTJ() : false;
        boolean zDjBIcL = this.getNewProxyInstance.djBIcL();
        pUU.KWHzl("SingleSwapMarketPlaceOrderViewModel", "swap market, chainId=" + str + ", supportSmartAccount=" + boolValueOf + "  canUseSmartAccount= " + zAEQbTJ + "  teeActiveAndABTestEnabled= " + zDjBIcL);
        if (zDjBIcL && zAEQbTJ) {
            z = true;
        }
        this.OLrzqt.tryEmit(Boolean.valueOf(z));
        return z;
    }

    public final TeeSaStatus AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(str) ? TeeSaStatus.TEE_ACTIVE : this.getNewProxyInstance.AhwBna() ? TeeSaStatus.TEE_EXPIRED : TeeSaStatus.NON_TEE_ACTIVE_AND_EXPIRED;
    }

    public final AccountInfo AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getNewProxyInstance.OLrzqt(EZpvd(str), z);
    }

    public final void KWHzl(boolean z, @NotNull String str, @NotNull PlaceOrderParams placeOrderParams, @NotNull QuotePriceRes quotePriceRes, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(placeOrderParams, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.copydefault.setValue(Boolean.TRUE);
        if (z2) {
            pUU.KWHzl("SingleSwapMarketPlaceOrderViewModel", "submitPlaceOrder forceManualSign requested");
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1(quotePriceRes, this, z, placeOrderParams, str, fragmentActivity, taskDescription, z2, null), 3, null);
    }

    public final String AEQbTJ(@NotNull String str, boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fIwbmz.KWHzl(str, z, swapPriorityFeeInfo);
    }

    public final void copydefault(@NotNull String str, @NotNull MarketTransactionFeeCacheParams marketTransactionFeeCacheParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marketTransactionFeeCacheParams, "");
        this.fIwbmz.EZpvd(str, marketTransactionFeeCacheParams);
    }

    public final MarketTransactionFeeCacheParams OLrzqt(@NotNull String str, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, QuotePriceRes quotePriceRes) {
        CommonDexInfo commonDexInfo;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        PriorityFeeType priorityFeeType = PriorityFeeType.PriorityMarket;
        int value = priorityFeeType.getValue();
        String nativeTokenUnitPriceUsd = null;
        String strEstimateGasFee = quotePriceRes != null ? quotePriceRes.estimateGasFee() : null;
        String str2 = strEstimateGasFee == null ? "" : strEstimateGasFee;
        if (quotePriceRes != null && (commonDexInfo = quotePriceRes.getCommonDexInfo()) != null) {
            nativeTokenUnitPriceUsd = commonDexInfo.getNativeTokenUnitPriceUsd();
        }
        String strCopydefault = copydefault(str, value, z, swapPriorityFeeInfo, "", str2, nativeTokenUnitPriceUsd == null ? "" : nativeTokenUnitPriceUsd);
        String strAEQbTJ = AEQbTJ(str, priorityFeeType.getValue(), z, swapPriorityFeeInfo, "");
        MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsOLrzqt = this.fIwbmz.OLrzqt(str);
        if (marketTransactionFeeCacheParamsOLrzqt == null) {
            marketTransactionFeeCacheParamsOLrzqt = new MarketTransactionFeeCacheParams(strAEQbTJ, strCopydefault, priorityFeeType);
        }
        this.EZpvd.tryEmit(marketTransactionFeeCacheParamsOLrzqt);
        return marketTransactionFeeCacheParamsOLrzqt;
    }

    public final String AEQbTJ(@NotNull String str, int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.fIwbmz.copydefault(str, i, z, swapPriorityFeeInfo, str2);
    }

    public final String copydefault(@NotNull String str, int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return this.fIwbmz.EZpvd(str, i, z, swapPriorityFeeInfo, str2, str3, str4);
    }

    public final void AYXKKw() {
        this.fIwbmz.AEQbTJ();
    }

    public final boolean OLrzqt(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.fJNWhG.copydefault(str, str2, z, str3);
    }

    public static /* synthetic */ PresetRouteType getRouterModeType$default(SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = PresetRouteType.RouteTypeAuto.getValue();
        }
        return singleSwapMarketPlaceOrderViewModel.OLrzqt(str, z, str2);
    }

    public final PresetRouteType OLrzqt(@NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        PresetRouteType presetRouteTypeOLrzqt = this.fJNWhG.OLrzqt(str, z, str2);
        this.valueOf.tryEmit(presetRouteTypeOLrzqt);
        return presetRouteTypeOLrzqt;
    }

    public final void copydefault(@NotNull String str, @NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        this.fJNWhG.OLrzqt(str, presetRouteType);
    }

    public final void KWHzl() {
        this.fJNWhG.KWHzl();
    }
}
