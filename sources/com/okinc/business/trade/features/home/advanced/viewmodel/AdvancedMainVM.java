package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.market.features.chart.domain.ChartType;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedDefaultPreset;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.C22380heK;
import o.C23311hvo;
import o.C23313hvq;
import o.C25389ivm;
import o.C28158kRa;
import o.C28161kRd;
import o.C28165kRh;
import o.C28183kRz;
import o.C28189kSe;
import o.C28200kSp;
import o.C30565ldZ;
import o.C30806liB;
import o.C30808liD;
import o.C31256lqb;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28209kSy;
import o.InterfaceC28223kTl;
import o.dTH;
import o.kQW;
import o.kQX;
import o.kRF;
import o.kRH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainVM extends AbstractC33073mpa {
    public final MutableStateFlow<ChartType> AEQbTJ;
    public final StateFlow<DexMultiTokenInfoBean> AYXKKw;
    public final MutableStateFlow<DexMultiTokenInfoBean> AhwBna;
    public final kQW AkhnZx;
    public final C28183kRz AuCTel;
    public final C28161kRd DbNXlk;
    public final MutableStateFlow<InterfaceC28209kSy> EZpvd;
    public final MutableStateFlow<InterfaceC28223kTl> KWHzl;
    public final MutableSharedFlow<C28200kSp> OLrzqt;
    public final MutableStateFlow<DexMultiTokenInfoBean> copydefault;
    public final StateFlow<InterfaceC28223kTl> djBIcL;
    public final SharedFlow<C28200kSp> ejfBZ;
    public final C28158kRa fARcdN;
    public final kRH fIwbmz;
    public final C28165kRh fJNWhG;
    public final StateFlow<ChartType> fetchVPNInfo;
    public final StateFlow<InterfaceC28209kSy> gEmmrt;
    public final StateFlow<C30806liB> getFieldNames;
    public final C28189kSe getNewProxyInstance;
    public final kRF hDKMBd;
    public final C19700gMb isConnected;
    public String iwGUEr;
    public final StateFlow<DexMultiTokenInfoBean> uzCIH;
    public final MutableStateFlow<C30806liB> valueOf;
    public final kQX values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C28200kSp> AhwBna() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28223kTl> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iwGUEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ChartType> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28209kSy> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> gEmmrt() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C30806liB> isConnected() {
        return this.getFieldNames;
    }

    @yCM
    public AdvancedMainVM(@NotNull C28165kRh c28165kRh, @NotNull kQX kqx, @NotNull kQW kqw, @NotNull C19700gMb c19700gMb, @NotNull C28158kRa c28158kRa, @NotNull C28189kSe c28189kSe, @NotNull kRH krh, @NotNull kRF krf, @NotNull C28161kRd c28161kRd, @NotNull C28183kRz c28183kRz) {
        Intrinsics.checkNotNullParameter(c28165kRh, "");
        Intrinsics.checkNotNullParameter(kqx, "");
        Intrinsics.checkNotNullParameter(kqw, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c28158kRa, "");
        Intrinsics.checkNotNullParameter(c28189kSe, "");
        Intrinsics.checkNotNullParameter(krh, "");
        Intrinsics.checkNotNullParameter(krf, "");
        Intrinsics.checkNotNullParameter(c28161kRd, "");
        Intrinsics.checkNotNullParameter(c28183kRz, "");
        this.fJNWhG = c28165kRh;
        this.values = kqx;
        this.AkhnZx = kqw;
        this.isConnected = c19700gMb;
        this.fARcdN = c28158kRa;
        this.getNewProxyInstance = c28189kSe;
        this.fIwbmz = krh;
        this.hDKMBd = krf;
        this.DbNXlk = c28161kRd;
        this.AuCTel = c28183kRz;
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.AhwBna = MutableStateFlow2;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<InterfaceC28223kTl> MutableStateFlow3 = StateFlowKt.MutableStateFlow(InterfaceC28223kTl.ActionBar.OLrzqt);
        this.KWHzl = MutableStateFlow3;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<C30806liB> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new C30806liB(false, false, false, null, 15, null));
        this.valueOf = MutableStateFlow4;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow4);
        MutableSharedFlow<C28200kSp> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<ChartType> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow5;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<InterfaceC28209kSy> MutableStateFlow6 = StateFlowKt.MutableStateFlow(InterfaceC28209kSy.Application.AEQbTJ);
        this.EZpvd = MutableStateFlow6;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow6);
        this.iwGUEr = "chain_id_all_network";
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        ejfBZ();
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedMainVM.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = AdvancedMainVM.this.copydefault;
                final AdvancedMainVM advancedMainVM = AdvancedMainVM.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
                        advancedMainVM.copydefault(true);
                        advancedMainVM.AkhnZx();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (mutableStateFlow.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final List<AdvancedMainConfig> copydefault() {
        return this.fJNWhG.AEQbTJ();
    }

    public static /* synthetic */ void fetchMainConfig$default(AdvancedMainVM advancedMainVM, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        advancedMainVM.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        AEQbTJ(true);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$fetchMainConfig$1(this, z, null), 3, null);
    }

    public final void EZpvd(@NotNull String str, @NotNull AdvancedModeParams advancedModeParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedModeParams, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$updateCache$1(this, str, advancedModeParams, null), 3, null);
    }

    public final AdvancedModeParams KWHzl(@NotNull String str, @NotNull AdvancedTradeType advancedTradeType, @NotNull TradingType tradingType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        Intrinsics.checkNotNullParameter(tradingType, "");
        return this.values.EZpvd(str, advancedTradeType, tradingType);
    }

    public final MutableLiveData<AdvancedModeParams> OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AkhnZx.KWHzl(str);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.copydefault(str);
    }

    public final void AEQbTJ(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$updateLoading$1(this, z, null), 3, null);
    }

    public final void AYXKKw(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null || !C30565ldZ.OLrzqt(dexMultiTokenInfoBean, this.AhwBna.getValue())) {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$updateQuoteToken$1(this, dexMultiTokenInfoBean, null), 3, null);
        }
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null || C30565ldZ.OLrzqt(dexMultiTokenInfoBean, this.copydefault.getValue())) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$updateBaseToken$1(this, dexMultiTokenInfoBean, null), 3, null);
    }

    public final void KWHzl(@NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$onChartTypeChanged$1(this, chartType, null), 3, null);
    }

    public final boolean EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        return dexMultiTokenInfoBean == null || this.fJNWhG.AEQbTJ(dexMultiTokenInfoBean.getChainId());
    }

    public final boolean KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        return dexMultiTokenInfoBean == null || this.fJNWhG.EZpvd(dexMultiTokenInfoBean.getChainId()) != null;
    }

    public final boolean copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        return dexMultiTokenInfoBean != null && this.fJNWhG.OLrzqt(dexMultiTokenInfoBean.getChainId());
    }

    public final boolean OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        return dexMultiTokenInfoBean != null && this.fJNWhG.copydefault(dexMultiTokenInfoBean.getChainId());
    }

    public final AdvancedMainConfig AYXKKw() {
        DexMultiTokenInfoBean value = this.copydefault.getValue();
        if (value == null) {
            return null;
        }
        return this.fJNWhG.KWHzl(value.getChainId());
    }

    public final DefiChainInfo valueOf() {
        DexMultiTokenInfoBean value = this.copydefault.getValue();
        if (value == null) {
            return null;
        }
        return this.fJNWhG.EZpvd(value.getChainId());
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strEZpvd = C23311hvo.EZpvd(str, str2, z);
        DexMultiTokenInfoBean value = this.copydefault.getValue();
        if (Intrinsics.EZpvd((Object) (value != null ? value.getUniqueId() : null), (Object) strEZpvd)) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$validateTokens$1(this, new ValidateTokensRequest(str, null, null, null, str2, 14, null), str, strEZpvd, null), 3, null);
    }

    public static /* synthetic */ void initSettingModel$default(AdvancedMainVM advancedMainVM, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        advancedMainVM.copydefault(z);
    }

    public final void copydefault(boolean z) {
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        if (advancedMainConfigAYXKKw == null) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$initSettingModel$1(this, z, advancedMainConfigAYXKKw, null), 3, null);
    }

    public final void AkhnZx() {
        DexMultiTokenInfoBean value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$getTokenMarketInfo$1(this, value, null), 3, null);
    }

    public final void values() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$onQuoteLoading$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull AdvancedQuoteUiData advancedQuoteUiData) {
        Intrinsics.checkNotNullParameter(advancedQuoteUiData, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$initConfigWithFirstQuote$1(this, advancedQuoteUiData, null), 3, null);
    }

    public final void OLrzqt(@NotNull AdvancedQuoteUiData advancedQuoteUiData) {
        Intrinsics.checkNotNullParameter(advancedQuoteUiData, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$updateConfigWithQuote$1(this, advancedQuoteUiData, null), 3, null);
    }

    public final boolean AEQbTJ(String str, AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        boolean z = false;
        if (advancedMainConfigAYXKKw == null) {
            return false;
        }
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl = advancedQuoteUiData != null ? advancedQuoteUiData.KWHzl() : null;
        if (advancedMainConfigAYXKKw.isSOl()) {
            kRF krf = this.hDKMBd;
            if (advancedQuoteAndCallDataKWHzl != null && advancedQuoteAndCallDataKWHzl.fetchVPNInfo()) {
                z = true;
            }
            return krf.AEQbTJ(str, z);
        }
        if (advancedMainConfigAYXKKw.isEvm()) {
            C28161kRd c28161kRd = this.DbNXlk;
            if (advancedQuoteAndCallDataKWHzl != null && advancedQuoteAndCallDataKWHzl.fetchVPNInfo()) {
                z = true;
            }
            return c28161kRd.KWHzl(str, z);
        }
        if (advancedMainConfigAYXKKw.isOtherChain()) {
            return this.AuCTel.OLrzqt();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String fetchVPNInfo() {
        AdvancedDefaultPreset defaultPresets;
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        String routerModeType = (advancedMainConfigAYXKKw == null || (defaultPresets = advancedMainConfigAYXKKw.getDefaultPresets()) == null) ? null : defaultPresets.getRouterModeType();
        return (routerModeType == null || routerModeType.length() == 0) ? PresetRouteType.RouteTypeAuto.getValue() : routerModeType;
    }

    public final int djBIcL() {
        AdvancedDefaultPreset defaultPresets;
        Integer priorityFeeType;
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        return (advancedMainConfigAYXKKw == null || (defaultPresets = advancedMainConfigAYXKKw.getDefaultPresets()) == null || (priorityFeeType = defaultPresets.getPriorityFeeType()) == null) ? AdvancedPriorityFeeType.Market.getValue() : priorityFeeType.intValue();
    }

    public final String EZpvd(AdvancedQuoteUiData advancedQuoteUiData, C30808liD c30808liD) {
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        return (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isEvm()) ? (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isSOl()) ? (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isOtherChain()) ? "" : this.fIwbmz.copydefault(advancedQuoteUiData) : djBIcL(advancedQuoteUiData, c30808liD) : copydefault(advancedQuoteUiData, c30808liD);
    }

    public final String copydefault(AdvancedQuoteUiData advancedQuoteUiData) {
        String marketFee;
        Boolean supportEip1559;
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        boolean zBooleanValue = (advancedMainConfigAYXKKw == null || (supportEip1559 = advancedMainConfigAYXKKw.getSupportEip1559()) == null) ? false : supportEip1559.booleanValue();
        boolean zAEQbTJ = AEQbTJ(fetchVPNInfo(), advancedQuoteUiData);
        MevInfoBean mevInfoBeanFIwbmz = advancedQuoteUiData.KWHzl().fIwbmz();
        NonMevPriorityFeeInfo newProxyInstance = advancedQuoteUiData.KWHzl().getNewProxyInstance();
        if (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isEvm()) {
            if (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isSOl()) {
                if (advancedMainConfigAYXKKw != null && advancedMainConfigAYXKKw.isOtherChain()) {
                    return this.fIwbmz.copydefault(advancedQuoteUiData);
                }
            } else if (zAEQbTJ) {
                marketFee = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getMarketFee() : null;
                if (marketFee != null) {
                    return marketFee;
                }
            } else {
                marketFee = newProxyInstance != null ? newProxyInstance.getMarketFee() : null;
                if (marketFee != null) {
                    return marketFee;
                }
            }
        } else if (zAEQbTJ) {
            marketFee = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getMarketPriority() : null;
            if (marketFee != null) {
                return marketFee;
            }
        } else if (zBooleanValue) {
            marketFee = newProxyInstance != null ? newProxyInstance.getMarketPriority() : null;
            if (marketFee != null) {
                return marketFee;
            }
        } else {
            marketFee = newProxyInstance != null ? newProxyInstance.getMarketGasPrice() : null;
            if (marketFee != null) {
                return marketFee;
            }
        }
        return "";
    }

    public final String KWHzl(AdvancedQuoteUiData advancedQuoteUiData, C30808liD c30808liD) {
        String strMulCheckS$default;
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        NonMevPriorityFeeInfo newProxyInstance = advancedQuoteUiData.KWHzl().getNewProxyInstance();
        if (advancedMainConfigAYXKKw != null && advancedMainConfigAYXKKw.isEvm()) {
            strMulCheckS$default = AEQbTJ(advancedQuoteUiData, c30808liD);
        } else {
            if (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isSOl()) {
                return (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isOtherChain()) ? "" : this.fIwbmz.AEQbTJ(advancedQuoteUiData);
            }
            strMulCheckS$default = C23313hvq.mulCheckS$default(C33129mqd.addS$default(copydefault(advancedQuoteUiData), newProxyInstance != null ? newProxyInstance.getBaseFee() : null, null, null, null, 14, null), advancedQuoteUiData.KWHzl().iwGUEr(), null, null, null, 14, null);
        }
        return strMulCheckS$default;
    }

    public final String gEmmrt(AdvancedQuoteUiData advancedQuoteUiData, C30808liD c30808liD) {
        String strMulCheckS$default;
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        NonMevPriorityFeeInfo newProxyInstance = advancedQuoteUiData.KWHzl().getNewProxyInstance();
        if (advancedMainConfigAYXKKw != null && advancedMainConfigAYXKKw.isEvm()) {
            strMulCheckS$default = AEQbTJ(advancedQuoteUiData, c30808liD);
        } else {
            if (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isSOl()) {
                return (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isOtherChain()) ? "" : this.fIwbmz.AEQbTJ(advancedQuoteUiData);
            }
            strMulCheckS$default = C23313hvq.mulCheckS$default(C33129mqd.addS$default(djBIcL(advancedQuoteUiData, c30808liD), newProxyInstance != null ? newProxyInstance.getBaseFee() : null, null, null, null, 14, null), advancedQuoteUiData.KWHzl().iwGUEr(), null, null, null, 14, null);
        }
        return strMulCheckS$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AEQbTJ(@NotNull AdvancedQuoteUiData advancedQuoteUiData, @NotNull C30808liD c30808liD) {
        Object maxBaseFee;
        String turboMaxFeeUsd;
        Boolean supportEip1559;
        Intrinsics.checkNotNullParameter(advancedQuoteUiData, "");
        Intrinsics.checkNotNullParameter(c30808liD, "");
        MevInfoBean mevInfoBeanFIwbmz = advancedQuoteUiData.KWHzl().fIwbmz();
        NonMevPriorityFeeInfo newProxyInstance = advancedQuoteUiData.KWHzl().getNewProxyInstance();
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        boolean zBooleanValue = (advancedMainConfigAYXKKw == null || (supportEip1559 = advancedMainConfigAYXKKw.getSupportEip1559()) == null) ? false : supportEip1559.booleanValue();
        if (c30808liD.fetchVPNInfo()) {
            maxBaseFee = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getMaxBaseFee() : null;
            if (maxBaseFee == null) {
                maxBaseFee = "";
            }
        } else {
            maxBaseFee = newProxyInstance != null ? newProxyInstance.getMaxBaseFee() : null;
            if (maxBaseFee == null) {
            }
        }
        int iCopydefault = c30808liD.copydefault();
        if (iCopydefault == AdvancedPriorityFeeType.Market.getValue()) {
            if (c30808liD.fetchVPNInfo()) {
                turboMaxFeeUsd = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getMarketMaxFeeUsd() : null;
                if (turboMaxFeeUsd == null) {
                    return "";
                }
            } else {
                turboMaxFeeUsd = newProxyInstance != null ? newProxyInstance.getMarketMaxFeeUsd() : null;
                if (turboMaxFeeUsd == null) {
                    return "";
                }
            }
        } else if (iCopydefault == AdvancedPriorityFeeType.Fast.getValue()) {
            if (c30808liD.fetchVPNInfo()) {
                turboMaxFeeUsd = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getFastMaxFeeUsd() : null;
                if (turboMaxFeeUsd == null) {
                    return "";
                }
            } else {
                turboMaxFeeUsd = newProxyInstance != null ? newProxyInstance.getFastMaxFeeUsd() : null;
                if (turboMaxFeeUsd == null) {
                    return "";
                }
            }
        } else {
            if (iCopydefault != AdvancedPriorityFeeType.Turbo.getValue()) {
                if (iCopydefault != AdvancedPriorityFeeType.Custom.getValue()) {
                    return "";
                }
                String strValueOf = c30808liD.valueOf();
                if (!zBooleanValue) {
                    maxBaseFee = 0;
                }
                String strMulCheckS$default = C23313hvq.mulCheckS$default(C23313hvq.addCheckS$default(strValueOf, maxBaseFee, null, null, null, 14, null), advancedQuoteUiData.KWHzl().AYXKKw(), null, null, null, 14, null);
                AdvancedMainConfig advancedMainConfigAYXKKw2 = AYXKKw();
                return C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(strMulCheckS$default, Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(advancedMainConfigAYXKKw2 != null ? advancedMainConfigAYXKKw2.getGasPriceUnitDecimal() : null))), null, null, null, 14, null), advancedQuoteUiData.KWHzl().iwGUEr(), null, null, null, 14, null);
            }
            if (c30808liD.fetchVPNInfo()) {
                turboMaxFeeUsd = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getTurboMaxFeeUsd() : null;
                if (turboMaxFeeUsd == null) {
                    return "";
                }
            } else {
                turboMaxFeeUsd = newProxyInstance != null ? newProxyInstance.getTurboMaxFeeUsd() : null;
                if (turboMaxFeeUsd == null) {
                    return "";
                }
            }
        }
        return turboMaxFeeUsd;
    }

    public final String copydefault(@NotNull AdvancedQuoteUiData advancedQuoteUiData, @NotNull C30808liD c30808liD) {
        String turboGasPrice;
        Boolean supportEip1559;
        Intrinsics.checkNotNullParameter(advancedQuoteUiData, "");
        Intrinsics.checkNotNullParameter(c30808liD, "");
        MevInfoBean mevInfoBeanFIwbmz = advancedQuoteUiData.KWHzl().fIwbmz();
        NonMevPriorityFeeInfo newProxyInstance = advancedQuoteUiData.KWHzl().getNewProxyInstance();
        AdvancedMainConfig advancedMainConfigAYXKKw = AYXKKw();
        boolean zBooleanValue = (advancedMainConfigAYXKKw == null || (supportEip1559 = advancedMainConfigAYXKKw.getSupportEip1559()) == null) ? false : supportEip1559.booleanValue();
        int iCopydefault = c30808liD.copydefault();
        if (iCopydefault == AdvancedPriorityFeeType.Market.getValue()) {
            if (c30808liD.fetchVPNInfo()) {
                turboGasPrice = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getMarketPriority() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            } else if (zBooleanValue) {
                turboGasPrice = newProxyInstance != null ? newProxyInstance.getMarketPriority() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            } else {
                turboGasPrice = newProxyInstance != null ? newProxyInstance.getMarketGasPrice() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            }
        } else if (iCopydefault == AdvancedPriorityFeeType.Fast.getValue()) {
            if (c30808liD.fetchVPNInfo()) {
                turboGasPrice = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getFastPriority() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            } else if (zBooleanValue) {
                turboGasPrice = newProxyInstance != null ? newProxyInstance.getFastPriority() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            } else {
                turboGasPrice = newProxyInstance != null ? newProxyInstance.getFastGasPrice() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            }
        } else {
            if (iCopydefault != AdvancedPriorityFeeType.Turbo.getValue()) {
                return iCopydefault == AdvancedPriorityFeeType.Custom.getValue() ? c30808liD.valueOf() : "";
            }
            if (c30808liD.fetchVPNInfo()) {
                turboGasPrice = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getTurboPriority() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            } else if (zBooleanValue) {
                turboGasPrice = newProxyInstance != null ? newProxyInstance.getTurboPriority() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            } else {
                turboGasPrice = newProxyInstance != null ? newProxyInstance.getTurboGasPrice() : null;
                if (turboGasPrice == null) {
                    return "";
                }
            }
        }
        return turboGasPrice;
    }

    public final String djBIcL(@NotNull AdvancedQuoteUiData advancedQuoteUiData, @NotNull C30808liD c30808liD) {
        String turboFee;
        Intrinsics.checkNotNullParameter(advancedQuoteUiData, "");
        Intrinsics.checkNotNullParameter(c30808liD, "");
        MevInfoBean mevInfoBeanFIwbmz = advancedQuoteUiData.KWHzl().fIwbmz();
        NonMevPriorityFeeInfo newProxyInstance = advancedQuoteUiData.KWHzl().getNewProxyInstance();
        int iCopydefault = c30808liD.copydefault();
        if (iCopydefault == AdvancedPriorityFeeType.Market.getValue()) {
            if (c30808liD.fetchVPNInfo()) {
                turboFee = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getMarketFee() : null;
                if (turboFee == null) {
                    return "";
                }
            } else {
                turboFee = newProxyInstance != null ? newProxyInstance.getMarketFee() : null;
                if (turboFee == null) {
                    return "";
                }
            }
        } else if (iCopydefault == AdvancedPriorityFeeType.Fast.getValue()) {
            if (c30808liD.fetchVPNInfo()) {
                turboFee = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getFastFee() : null;
                if (turboFee == null) {
                    return "";
                }
            } else {
                turboFee = newProxyInstance != null ? newProxyInstance.getFastFee() : null;
                if (turboFee == null) {
                    return "";
                }
            }
        } else {
            if (iCopydefault != AdvancedPriorityFeeType.Turbo.getValue()) {
                return iCopydefault == AdvancedPriorityFeeType.Custom.getValue() ? c30808liD.valueOf() : "";
            }
            if (c30808liD.fetchVPNInfo()) {
                turboFee = mevInfoBeanFIwbmz != null ? mevInfoBeanFIwbmz.getTurboFee() : null;
                if (turboFee == null) {
                    return "";
                }
            } else {
                turboFee = newProxyInstance != null ? newProxyInstance.getTurboFee() : null;
                if (turboFee == null) {
                    return "";
                }
            }
        }
        return turboFee;
    }

    private final void ejfBZ() {
        C22380heK.OLrzqt.copydefault("cefi_mode").copydefault().copydefault().DbNXlk();
    }

    public final void KWHzl(boolean z) {
        this.values.AEQbTJ(z);
    }

    public final StateFlow<dTH> DbNXlk() {
        return this.isConnected.AEQbTJ();
    }

    public final String OLrzqt(final AdvancedQuoteUiData advancedQuoteUiData, @NotNull C30808liD c30808liD) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AutoSlippageInfo autoSlippageInfoAEQbTJ;
        Intrinsics.checkNotNullParameter(c30808liD, "");
        if (c30808liD.isConnected()) {
            String autoSlippage = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null || (autoSlippageInfoAEQbTJ = advancedQuoteAndCallDataKWHzl.AEQbTJ()) == null) ? null : autoSlippageInfoAEQbTJ.getAutoSlippage();
            return C31256lqb.KWHzl(autoSlippage != null ? autoSlippage : "", (Function0<String>) new Function0() { // from class: o.kSx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AdvancedMainVM.EZpvd(advancedQuoteUiData);
                }
            });
        }
        String strGEmmrt = c30808liD.gEmmrt();
        return strGEmmrt == null ? "" : strGEmmrt;
    }

    public static final String EZpvd(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AutoSlippageInfo autoSlippageInfoAEQbTJ;
        String referenceSlippage = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null || (autoSlippageInfoAEQbTJ = advancedQuoteAndCallDataKWHzl.AEQbTJ()) == null) ? null : autoSlippageInfoAEQbTJ.getReferenceSlippage();
        return referenceSlippage == null ? "" : referenceSlippage;
    }

    public final void EZpvd(@NotNull AdvancedSettingsContract.Input input) {
        C30806liB value;
        C30806liB c30806liB;
        C30808liD c30808liDCopydefault;
        int slippageFeeType;
        Intrinsics.checkNotNullParameter(input, "");
        MutableStateFlow<C30806liB> mutableStateFlow = this.valueOf;
        do {
            value = mutableStateFlow.getValue();
            c30806liB = value;
            c30808liDCopydefault = c30806liB.copydefault();
            slippageFeeType = input.getSlippageFeeType();
        } while (!mutableStateFlow.compareAndSet(value, C30806liB.copy$default(c30806liB, false, false, false, c30808liDCopydefault.copydefault((24851 & 1) != 0 ? c30808liDCopydefault.fARcdN : null, (24851 & 2) != 0 ? c30808liDCopydefault.OLrzqt : null, (24851 & 4) != 0 ? c30808liDCopydefault.fetchVPNInfo : input.getSlippageValue(), (24851 & 8) != 0 ? c30808liDCopydefault.isConnected : slippageFeeType, (24851 & 16) != 0 ? c30808liDCopydefault.EZpvd : null, (24851 & 32) != 0 ? c30808liDCopydefault.DbNXlk : input.getPriorityValue(), (24851 & 64) != 0 ? c30808liDCopydefault.gEmmrt : input.getPriorityFeeType(), (24851 & 128) != 0 ? c30808liDCopydefault.djBIcL : input.isOpenMev(), (24851 & 256) != 0 ? c30808liDCopydefault.KWHzl : null, (24851 & 512) != 0 ? c30808liDCopydefault.values : input.getRouterModeType(), (24851 & 1024) != 0 ? c30808liDCopydefault.AkhnZx : input.getSlippageMode(), (24851 & 2048) != 0 ? c30808liDCopydefault.AhwBna : input.getMaxSlippage(), (24851 & 4096) != 0 ? c30808liDCopydefault.AuCTel : input.getTotalFee(), (24851 & 8192) != 0 ? c30808liDCopydefault.valueOf : false, (24851 & 16384) != 0 ? c30808liDCopydefault.AYXKKw : null), 5, null)));
    }
}
