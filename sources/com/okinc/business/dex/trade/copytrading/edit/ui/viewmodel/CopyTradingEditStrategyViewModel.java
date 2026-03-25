package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import android.content.Context;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPresetConfig;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.BuySellConfigData;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.ReferralParamInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TransactionDirection;
import com.okinc.business.dexlogic.bean.track.ReferralSwapMode;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedDefaultPreset;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData;
import com.okinc.business.trade.features.home.ui.cefi.data.PriorityFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import com.okinc.business.trade.features.home.ui.meme.data.RouteConfig;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC19873gSm;
import o.C19700gMb;
import o.C19872gSl;
import o.C19875gSo;
import o.C19876gSp;
import o.C19877gSq;
import o.C19881gSu;
import o.C20005gXj;
import o.C23212htv;
import o.C25389ivm;
import o.C30924lkN;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC19870gSj;
import o.InterfaceC19871gSk;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.gTA;
import o.gTB;
import o.gTC;
import o.gWP;
import o.kTW;
import o.kUO;
import o.pUU;
import o.yCM;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final MutableStateFlow<DexMultiTokenInfoBean> AEQbTJ;
    public final kTW AYXKKw;
    public final Channel<AbstractC19873gSm.Activity> AhwBna;
    public final StateFlow<Result<CopyTradeDetail>> AkhnZx;
    public final C20005gXj AuCTel;
    public final SavedStateHandle AuCTelauCTel;
    public final InterfaceC19871gSk AubY;
    public final C19875gSo AwvSrB;
    public final StateFlow<AdvancedSettingsContract.Input> AxsJAY;
    public final C19700gMb DTwDnp;
    public final StateFlow<String> DbNXlk;
    public final MutableStateFlow<AdvancedSettingsContract.Input> KWHzl;
    public final MutableStateFlow<ExpireTimeData> OLrzqt;
    public final StateFlow<gTB> ORxRYg;
    public final C19881gSu OcIXYQ;
    public final TradeMode QKVWgx;
    public final StateFlow<Result<List<DefiChainInfo>>> QOLQEE;
    public final MutableStateFlow<InterfaceC19870gSj> copydefault;
    public final MutableStateFlow<gTB> djBIcL;
    public final C19877gSq ejfBZ;
    public final StateFlow<ExpireTimeData> fARcdN;
    public final StateFlow<Result<CopyTradingDefaultConfig>> fIwbmz;
    public final gWP fJNWhG;
    public final StateFlow<AdvancedSettingsContract.Input> fetchVPNInfo;
    public final StateFlow<gTA> gEmmrt;
    public final StateFlow<ServiceFeeInfo> gHZMYf;
    public final boolean getFieldNames;
    public final kUO getNewProxyInstance;
    public final StateFlow<InterfaceC19870gSj> hDKMBd;
    public final MutableStateFlow<String> isConnected;
    public final C19876gSp iwGUEr;
    public final String sSMYrx;
    public final OrderRetryHelper uzCIH;
    public final MutableStateFlow<AdvancedSettingsContract.Input> valueOf;
    public final StateFlow<DefiChainInfo> values;
    public final DexTrackEventParameter.EditStrategyFrom wlaJM;
    public final C23212htv zLjUOn;
    public final MutableStateFlow<Integer> zsXlph;
    public final StateFlow<Result<gTC>> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeMode AuCTel() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gTA> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ExpireTimeData> djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gTB> ejfBZ() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<gTC>> fJNWhG() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ServiceFeeInfo> fetchVPNInfo() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DefiChainInfo> gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC19870gSj> isConnected() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean uzCIH() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTrackEventParameter.EditStrategyFrom values() {
        return this.wlaJM;
    }

    public static final class Application implements Flow<ServiceFeeInfo> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CopyTradingEditStrategyViewModel$special$$inlined$map$1$2$1 copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof CopyTradingEditStrategyViewModel$special$$inlined$map$1$2$1) {
                    copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1 = (CopyTradingEditStrategyViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1 = new CopyTradingEditStrategyViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    Result result = (Result) obj;
                    ServiceFeeInfo serviceFeeInfo = null;
                    if (result != null) {
                        Object objM7386unboximpl = result.m7386unboximpl();
                        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                            objM7386unboximpl = null;
                        }
                        gTC gtc = (gTC) objM7386unboximpl;
                        if (gtc != null) {
                            serviceFeeInfo = gtc.KWHzl().getServiceFeeInfo();
                        }
                    }
                    copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(serviceFeeInfo, copyTradingEditStrategyViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super ServiceFeeInfo> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public CopyTradingEditStrategyViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull kUO kuo, @NotNull InterfaceC19871gSk interfaceC19871gSk, @NotNull C19881gSu c19881gSu, @NotNull C19876gSp c19876gSp, @NotNull C19877gSq c19877gSq, @NotNull C20005gXj c20005gXj, @NotNull C19875gSo c19875gSo, @NotNull C19700gMb c19700gMb, @NotNull gWP gwp, @NotNull C23212htv c23212htv, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(kuo, "");
        Intrinsics.checkNotNullParameter(interfaceC19871gSk, "");
        Intrinsics.checkNotNullParameter(c19881gSu, "");
        Intrinsics.checkNotNullParameter(c19876gSp, "");
        Intrinsics.checkNotNullParameter(c19877gSq, "");
        Intrinsics.checkNotNullParameter(c20005gXj, "");
        Intrinsics.checkNotNullParameter(c19875gSo, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(gwp, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.AuCTelauCTel = savedStateHandle;
        this.getNewProxyInstance = kuo;
        this.AubY = interfaceC19871gSk;
        this.OcIXYQ = c19881gSu;
        this.iwGUEr = c19876gSp;
        this.ejfBZ = c19877gSq;
        this.AuCTel = c20005gXj;
        this.AwvSrB = c19875gSo;
        this.DTwDnp = c19700gMb;
        this.fJNWhG = gwp;
        this.zLjUOn = c23212htv;
        this.AYXKKw = ktw;
        String str = (String) savedStateHandle.get("id");
        this.sSMYrx = str;
        DexTrackEventParameter.EditStrategyFrom editStrategyFrom = (DexTrackEventParameter.EditStrategyFrom) savedStateHandle.get("key.page_from");
        this.wlaJM = editStrategyFrom == null ? DexTrackEventParameter.EditStrategyFrom.DASHBOARD : editStrategyFrom;
        Boolean bool = (Boolean) savedStateHandle.get("type");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        this.getFieldNames = zBooleanValue;
        this.QKVWgx = zBooleanValue ? TradeMode.CopyTradeEdit : TradeMode.CopyTradeCreate;
        this.uzCIH = new OrderRetryHelper("CopyTradingEditStrategyViewModel");
        String str2 = (String) savedStateHandle.get("chain_id");
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(str2 != null ? str2 : "");
        this.isConnected = MutableStateFlow;
        StateFlow<String> stateFlow = savedStateHandle.getStateFlow("user_wallet_address", null);
        this.DbNXlk = stateFlow;
        MutableStateFlow<gTB> MutableStateFlow2 = StateFlowKt.MutableStateFlow(!zBooleanValue ? gTB.Activity.EZpvd : null);
        this.djBIcL = MutableStateFlow2;
        this.ORxRYg = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.zsXlph = MutableStateFlow3;
        Flow flowCombine = FlowKt.combine(MutableStateFlow, MutableStateFlow3, new CopyTradingEditStrategyViewModel$defaultConfig$1(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<Result<CopyTradingDefaultConfig>> stateFlowStateIn = FlowKt.stateIn(flowCombine, viewModelScope, companion.getLazily(), null);
        this.fIwbmz = stateFlowStateIn;
        StateFlow<Result<List<DefiChainInfo>>> stateFlowStateIn2 = FlowKt.stateIn(FlowKt.mapLatest(MutableStateFlow3, new CopyTradingEditStrategyViewModel$supportedChains$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        this.QOLQEE = stateFlowStateIn2;
        StateFlow<Result<CopyTradeDetail>> stateFlowStateIn3 = (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) ? null : FlowKt.stateIn(FlowKt.mapLatest(MutableStateFlow3, new CopyTradingEditStrategyViewModel$copyTradeDetail$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        this.AkhnZx = stateFlowStateIn3;
        StateFlow<Result<gTC>> stateFlowStateIn4 = (stateFlowStateIn3 == null || (stateFlowStateIn4 = FlowKt.stateIn(FlowKt.combine(stateFlowStateIn, stateFlowStateIn2, stateFlowStateIn3, new CopyTradingEditStrategyViewModel$state$1$1(c19877gSq)), ViewModelKt.getViewModelScope(this), companion.getLazily(), null)) == null) ? FlowKt.stateIn(FlowKt.combine(stateFlowStateIn, stateFlowStateIn2, new CopyTradingEditStrategyViewModel$state$2(c19877gSq)), ViewModelKt.getViewModelScope(this), companion.getLazily(), null) : stateFlowStateIn4;
        this.zuBGHE = stateFlowStateIn4;
        this.gHZMYf = FlowKt.stateIn(new Application(stateFlowStateIn4), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        MutableStateFlow<ExpireTimeData> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow4;
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow4);
        StateFlow<DefiChainInfo> stateFlowStateIn5 = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, stateFlowStateIn2, new CopyTradingEditStrategyViewModel$chainInfo$1(null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        this.values = stateFlowStateIn5;
        this.gEmmrt = FlowKt.stateIn(FlowKt.combine(stateFlowStateIn5, stateFlow, new CopyTradingEditStrategyViewModel$addressInputState$1(c19881gSu)), ViewModelKt.getViewModelScope(this), companion.getLazily(), gTA.StateListAnimator.OLrzqt);
        this.AhwBna = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        MutableStateFlow<InterfaceC19870gSj> MutableStateFlow5 = StateFlowKt.MutableStateFlow(InterfaceC19870gSj.StateListAnimator.copydefault);
        this.copydefault = MutableStateFlow5;
        this.hDKMBd = FlowKt.asStateFlow(MutableStateFlow5);
        this.AEQbTJ = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<AdvancedSettingsContract.Input> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow6;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<AdvancedSettingsContract.Input> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow7;
        this.AxsJAY = FlowKt.asStateFlow(MutableStateFlow7);
    }

    public final String EZpvd() {
        return this.isConnected.getValue();
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected.setValue(str);
    }

    public final String AhwBna() {
        return this.DbNXlk.getValue();
    }

    public final void copydefault(String str) {
        this.AuCTelauCTel.set("user_wallet_address", str);
    }

    public final gTB fARcdN() {
        return this.djBIcL.getValue();
    }

    public static final /* synthetic */ Object AEQbTJ(C19877gSq c19877gSq, Result result, Result result2, Result result3, Continuation continuation) {
        return c19877gSq.EZpvd(result, result2, result3);
    }

    public static final /* synthetic */ Object copydefault(C19877gSq c19877gSq, Result result, Result result2, Continuation continuation) {
        return c19877gSq.copydefault(result, result2);
    }

    public final ExpireTimeData AYXKKw() {
        return this.OLrzqt.getValue();
    }

    public final String DbNXlk() {
        Result<CopyTradingDefaultConfig> value = this.fIwbmz.getValue();
        String minLimitNativeTokenBalance = null;
        if (value != null) {
            Object objM7386unboximpl = value.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            CopyTradingDefaultConfig copyTradingDefaultConfig = (CopyTradingDefaultConfig) objM7386unboximpl;
            if (copyTradingDefaultConfig != null) {
                minLimitNativeTokenBalance = copyTradingDefaultConfig.getMinLimitNativeTokenBalance();
            }
        }
        return minLimitNativeTokenBalance == null ? "" : minLimitNativeTokenBalance;
    }

    public static final /* synthetic */ Object AEQbTJ(C19881gSu c19881gSu, DefiChainInfo defiChainInfo, String str, Continuation continuation) {
        return c19881gSu.copydefault(defiChainInfo, str);
    }

    public final Flow<AbstractC19873gSm.Activity> fIwbmz() {
        return FlowKt.receiveAsFlow(this.AhwBna);
    }

    public final DexMultiTokenInfoBean copydefault() {
        return this.AEQbTJ.getValue();
    }

    public final void EZpvd(AdvancedSettingsContract.Input input) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingEditStrategyViewModel$updateBuyPreset$1(this, input, null), 3, null);
    }

    public final void AEQbTJ(AdvancedSettingsContract.Input input) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingEditStrategyViewModel$updateSellPreset$1(this, input, null), 3, null);
    }

    public final List<ExpireTimeConfig> AkhnZx() {
        return this.iwGUEr.EZpvd();
    }

    public final void AEQbTJ() {
        if (AYXKKw() != null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingEditStrategyViewModel$fetchExpireConfig$1(this, null), 3, null);
    }

    public final void getFieldNames() {
        Integer value;
        this.AubY.OLrzqt();
        MutableStateFlow<Integer> mutableStateFlow = this.zsXlph;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Integer.valueOf(value.intValue() + 1)));
    }

    public final String OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.DTwDnp.KWHzl();
        String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
        return strDbNXlk == null ? "" : strDbNXlk;
    }

    public final boolean iwGUEr() {
        return !this.DTwDnp.copydefault();
    }

    public final boolean getNewProxyInstance() {
        Object next;
        long jValueOf;
        Long timeMills;
        if (this.DTwDnp.gEmmrt()) {
            return false;
        }
        Iterator<T> it = AkhnZx().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String id = ((ExpireTimeConfig) next).getId();
            ExpireTimeData expireTimeDataAYXKKw = AYXKKw();
            if (Intrinsics.EZpvd((Object) id, (Object) (expireTimeDataAYXKKw != null ? expireTimeDataAYXKKw.EZpvd() : null))) {
                break;
            }
        }
        ExpireTimeConfig expireTimeConfig = (ExpireTimeConfig) next;
        if (expireTimeConfig == null || (timeMills = expireTimeConfig.getTimeMills()) == null) {
            ExpireTimeData expireTimeDataAYXKKw2 = AYXKKw();
            jValueOf = C33129mqd.valueOf(expireTimeDataAYXKKw2 != null ? expireTimeDataAYXKKw2.OLrzqt() : null);
        } else {
            jValueOf = timeMills.longValue() + System.currentTimeMillis();
        }
        return jValueOf > this.DTwDnp.EZpvd();
    }

    public final void KWHzl(@NotNull String str, @NotNull BuySettings buySettings, @NotNull SellSettings sellSettings, @NotNull TokenFilter tokenFilter, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(buySettings, "");
        Intrinsics.checkNotNullParameter(sellSettings, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.copydefault.setValue(InterfaceC19870gSj.StateListAnimator.copydefault);
        copydefault(buySettings, sellSettings, tokenFilter);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingEditStrategyViewModel$confirmEdit$1(this, str, buySettings, sellSettings, tokenFilter, fragmentActivity, z, taskDescription, null), 3, null);
    }

    public final void EZpvd(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C23212htv c23212htv = this.zLjUOn;
        String strEZpvd = EZpvd();
        String mode = ReferralSwapMode.COPY_TRADE.getMode();
        ServiceFeeInfo value = this.gHZMYf.getValue();
        String originalServiceFeeRate = value != null ? value.getOriginalServiceFeeRate() : null;
        String str = originalServiceFeeRate == null ? "" : originalServiceFeeRate;
        ServiceFeeInfo value2 = this.gHZMYf.getValue();
        String discountedServiceFeeRate = value2 != null ? value2.getDiscountedServiceFeeRate() : null;
        c23212htv.OLrzqt(context, strEZpvd, new ReferralParamInfo(mode, "", str, discountedServiceFeeRate == null ? "" : discountedServiceFeeRate, "").referralToMap(), function1);
    }

    public final boolean hDKMBd() {
        return this.zLjUOn.KWHzl(EZpvd(), true);
    }

    public final Object KWHzl(@NotNull Continuation<? super BuySettings> continuation) {
        return this.AubY.AEQbTJ(EZpvd(), continuation);
    }

    public final Object OLrzqt(@NotNull Continuation<? super SellSettings> continuation) {
        return this.AubY.copydefault(EZpvd(), continuation);
    }

    public final Object AEQbTJ(@NotNull Continuation<? super TokenFilter> continuation) {
        return this.AubY.OLrzqt(EZpvd(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super CopyTradingPreset> continuation) throws Throwable {
        CopyTradingEditStrategyViewModel$getCachedBuyPreset$1 copyTradingEditStrategyViewModel$getCachedBuyPreset$1;
        CopyTradeDetail copyTradeDetailEZpvd;
        BuySettings buySettings;
        CopyTradingPreset buyPreset;
        if (continuation instanceof CopyTradingEditStrategyViewModel$getCachedBuyPreset$1) {
            copyTradingEditStrategyViewModel$getCachedBuyPreset$1 = (CopyTradingEditStrategyViewModel$getCachedBuyPreset$1) continuation;
            int i = copyTradingEditStrategyViewModel$getCachedBuyPreset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyViewModel$getCachedBuyPreset$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyViewModel$getCachedBuyPreset$1 = new CopyTradingEditStrategyViewModel$getCachedBuyPreset$1(this, continuation);
            }
        }
        Object objKWHzl = copyTradingEditStrategyViewModel$getCachedBuyPreset$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyViewModel$getCachedBuyPreset$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            Result<gTC> value = this.zuBGHE.getValue();
            if (value != null) {
                Object objM7386unboximpl = value.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                gTC gtc = (gTC) objM7386unboximpl;
                if (gtc != null && (copyTradeDetailEZpvd = gtc.EZpvd()) != null && (buySettings = copyTradeDetailEZpvd.getBuySettings()) != null && (buyPreset = buySettings.getBuyPreset()) != null) {
                    return buyPreset;
                }
            }
            copyTradingEditStrategyViewModel$getCachedBuyPreset$1.label = 1;
            objKWHzl = KWHzl(copyTradingEditStrategyViewModel$getCachedBuyPreset$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        BuySettings buySettings2 = (BuySettings) objKWHzl;
        if (buySettings2 != null) {
            return buySettings2.getBuyPreset();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super CopyTradingPreset> continuation) throws Throwable {
        CopyTradingEditStrategyViewModel$getCachedSellPreset$1 copyTradingEditStrategyViewModel$getCachedSellPreset$1;
        CopyTradeDetail copyTradeDetailEZpvd;
        SellSettings sellSettings;
        CopyTradingPreset sellPreset;
        if (continuation instanceof CopyTradingEditStrategyViewModel$getCachedSellPreset$1) {
            copyTradingEditStrategyViewModel$getCachedSellPreset$1 = (CopyTradingEditStrategyViewModel$getCachedSellPreset$1) continuation;
            int i = copyTradingEditStrategyViewModel$getCachedSellPreset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyViewModel$getCachedSellPreset$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyViewModel$getCachedSellPreset$1 = new CopyTradingEditStrategyViewModel$getCachedSellPreset$1(this, continuation);
            }
        }
        Object objOLrzqt = copyTradingEditStrategyViewModel$getCachedSellPreset$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyViewModel$getCachedSellPreset$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            Result<gTC> value = this.zuBGHE.getValue();
            if (value != null) {
                Object objM7386unboximpl = value.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                gTC gtc = (gTC) objM7386unboximpl;
                if (gtc != null && (copyTradeDetailEZpvd = gtc.EZpvd()) != null && (sellSettings = copyTradeDetailEZpvd.getSellSettings()) != null && (sellPreset = sellSettings.getSellPreset()) != null) {
                    return sellPreset;
                }
            }
            copyTradingEditStrategyViewModel$getCachedSellPreset$1.label = 1;
            objOLrzqt = OLrzqt(copyTradingEditStrategyViewModel$getCachedSellPreset$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        SellSettings sellSettings2 = (SellSettings) objOLrzqt;
        if (sellSettings2 != null) {
            return sellSettings2.getSellPreset();
        }
        return null;
    }

    public static /* synthetic */ Object getBuySellSettings$default(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copyTradingEditStrategyViewModel.EZpvd(z, (Continuation<? super AdvancedSettingsContract.Input>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3 A[PHI: r16
  0x01b3: PHI (r16v5 java.lang.String) = (r16v1 java.lang.String), (r16v6 java.lang.String) binds: [B:87:0x01ae, B:83:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(boolean z, @NotNull Continuation<? super AdvancedSettingsContract.Input> continuation) throws Throwable {
        CopyTradingEditStrategyViewModel$getBuySellSettings$1 copyTradingEditStrategyViewModel$getBuySellSettings$1;
        CopyTradingDefaultConfig copyTradingDefaultConfigKWHzl;
        SlippageConfigPreset slippageConfig;
        Object next;
        SlippageRange slippageRange;
        FeeConfig feeConfig;
        RouteConfig routeConfig;
        Object next2;
        FeeOption feeOption;
        List<FeeOption> list;
        AdvancedSettingsContract.Input input;
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel;
        CopyTradingPreset copyTradingPreset;
        boolean zIsMevOpen;
        int value;
        String str;
        PriorityFeeType priorityFeeTypeCopydefault;
        String str2;
        String routerModeType;
        String routerModeType2;
        String feeValue;
        String feeLevel;
        String slippageLevel;
        boolean z2 = z;
        if (continuation instanceof CopyTradingEditStrategyViewModel$getBuySellSettings$1) {
            copyTradingEditStrategyViewModel$getBuySellSettings$1 = (CopyTradingEditStrategyViewModel$getBuySellSettings$1) continuation;
            int i = copyTradingEditStrategyViewModel$getBuySellSettings$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyViewModel$getBuySellSettings$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyViewModel$getBuySellSettings$1 = new CopyTradingEditStrategyViewModel$getBuySellSettings$1(this, continuation);
            }
        }
        Object obj = copyTradingEditStrategyViewModel$getBuySellSettings$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyViewModel$getBuySellSettings$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result<gTC> value2 = this.zuBGHE.getValue();
            if (value2 != null) {
                Object objM7386unboximpl = value2.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                gTC gtc = (gTC) objM7386unboximpl;
                copyTradingDefaultConfigKWHzl = gtc != null ? gtc.KWHzl() : null;
                if (copyTradingDefaultConfigKWHzl == null) {
                    pUU.KWHzl("CopyTradingEditStrategyViewModel", "defaultConfig is null");
                    return null;
                }
                CopyTradingPresetConfig preset = copyTradingDefaultConfigKWHzl.getPreset();
                BuySellPreset sellPreset = z2 ? preset.getSellPreset() : preset.getBuyPreset();
                slippageConfig = sellPreset.getSlippageConfig();
                List<SlippageRange> slippageRange2 = slippageConfig.getSlippageRange();
                Iterator<T> it = slippageRange2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((SlippageRange) next).getSelected()) {
                        break;
                    }
                }
                SlippageRange slippageRange3 = (SlippageRange) next;
                slippageRange = slippageRange3 == null ? (SlippageRange) CollectionsKt___CollectionsKt.firstOrNull(slippageRange2) : slippageRange3;
                feeConfig = sellPreset.getFeeConfig();
                routeConfig = sellPreset.getRouteConfig();
                List<FeeOption> feeOptions = feeConfig.getFeeOptions();
                Iterator<T> it2 = feeOptions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((FeeOption) next2).getSelected()) {
                        break;
                    }
                }
                FeeOption feeOption2 = (FeeOption) next2;
                feeOption = feeOption2 == null ? (FeeOption) CollectionsKt___CollectionsKt.firstOrNull(feeOptions) : feeOption2;
                AdvancedSettingsContract.Input value3 = (z2 ? this.valueOf : this.KWHzl).getValue();
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$0 = this;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$1 = copyTradingDefaultConfigKWHzl;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$2 = slippageConfig;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$3 = slippageRange;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$4 = feeConfig;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$5 = routeConfig;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$6 = feeOptions;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$7 = feeOption;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.L$8 = value3;
                copyTradingEditStrategyViewModel$getBuySellSettings$1.Z$0 = z2;
                if (z2) {
                    copyTradingEditStrategyViewModel$getBuySellSettings$1.label = 1;
                    Object objEZpvd = EZpvd(copyTradingEditStrategyViewModel$getBuySellSettings$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    list = feeOptions;
                    obj = objEZpvd;
                    input = value3;
                    copyTradingEditStrategyViewModel = this;
                    copyTradingPreset = (CopyTradingPreset) obj;
                } else {
                    copyTradingEditStrategyViewModel$getBuySellSettings$1.label = 2;
                    Object objCopydefault2 = copydefault(copyTradingEditStrategyViewModel$getBuySellSettings$1);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    list = feeOptions;
                    obj = objCopydefault2;
                    input = value3;
                    copyTradingEditStrategyViewModel = this;
                    copyTradingPreset = (CopyTradingPreset) obj;
                }
            }
        } else if (i2 == 1) {
            z2 = copyTradingEditStrategyViewModel$getBuySellSettings$1.Z$0;
            input = (AdvancedSettingsContract.Input) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$8;
            feeOption = (FeeOption) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$7;
            list = (List) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$6;
            routeConfig = (RouteConfig) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$5;
            feeConfig = (FeeConfig) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$4;
            slippageRange = (SlippageRange) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$3;
            slippageConfig = (SlippageConfigPreset) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$2;
            copyTradingDefaultConfigKWHzl = (CopyTradingDefaultConfig) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$1;
            copyTradingEditStrategyViewModel = (CopyTradingEditStrategyViewModel) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$0;
            C56391yDq.AEQbTJ(obj);
            copyTradingPreset = (CopyTradingPreset) obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = copyTradingEditStrategyViewModel$getBuySellSettings$1.Z$0;
            input = (AdvancedSettingsContract.Input) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$8;
            feeOption = (FeeOption) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$7;
            list = (List) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$6;
            routeConfig = (RouteConfig) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$5;
            feeConfig = (FeeConfig) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$4;
            slippageRange = (SlippageRange) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$3;
            slippageConfig = (SlippageConfigPreset) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$2;
            copyTradingDefaultConfigKWHzl = (CopyTradingDefaultConfig) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$1;
            copyTradingEditStrategyViewModel = (CopyTradingEditStrategyViewModel) copyTradingEditStrategyViewModel$getBuySellSettings$1.L$0;
            C56391yDq.AEQbTJ(obj);
            copyTradingPreset = (CopyTradingPreset) obj;
        }
        if (copyTradingPreset != null) {
            zIsMevOpen = Intrinsics.EZpvd((Object) copyTradingPreset.getRouterModeType(), (Object) PresetRouteType.RouteTypeMev.getValue());
        } else {
            zIsMevOpen = routeConfig.isMevOpen();
        }
        boolean z3 = zIsMevOpen;
        if (copyTradingPreset != null && (slippageLevel = copyTradingPreset.getSlippageLevel()) != null) {
            value = Integer.parseInt(slippageLevel);
        } else if (slippageRange != null) {
            value = slippageRange.getSlippageLevel();
        } else {
            value = SlippageFeeType.SlippageLow.getValue();
        }
        if (copyTradingPreset == null || (slippageValue = copyTradingPreset.getSlippageValue()) == null) {
            String slippageValue = slippageRange != null ? slippageRange.getSlippageValue() : null;
            str = slippageValue == null ? "" : slippageValue;
        }
        if (copyTradingPreset == null || (feeLevel = copyTradingPreset.getFeeLevel()) == null || (priorityFeeTypeCopydefault = PriorityFeeType.Companion.copydefault(Integer.parseInt(feeLevel))) == null) {
            if (feeOption != null) {
                priorityFeeTypeCopydefault = PriorityFeeType.Companion.copydefault(feeOption.getFeeLevel());
            } else {
                priorityFeeTypeCopydefault = PriorityFeeType.PriorityTurbo;
            }
        }
        if (copyTradingPreset == null || (feeValue = copyTradingPreset.getFeeValue()) == null) {
            String feeValue2 = feeOption != null ? feeOption.getFeeValue() : null;
            str2 = feeValue2 == null ? "" : feeValue2;
        } else {
            str2 = feeValue;
        }
        if (input != null) {
            return input;
        }
        String strEZpvd = copyTradingEditStrategyViewModel.EZpvd();
        int value4 = priorityFeeTypeCopydefault.getValue();
        if (copyTradingPreset == null || (routerModeType = copyTradingPreset.getRouterModeType()) == null) {
            routerModeType = routeConfig.getRouterModeType();
        }
        String str3 = routerModeType;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copyTradingEditStrategyViewModel.copydefault();
        if (dexMultiTokenInfoBeanCopydefault == null) {
            dexMultiTokenInfoBeanCopydefault = new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean = dexMultiTokenInfoBeanCopydefault;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = copyTradingEditStrategyViewModel.copydefault();
        String amountNum = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getAmountNum() : null;
        String str4 = amountNum == null ? "" : amountNum;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = copyTradingEditStrategyViewModel.copydefault();
        String price = dexMultiTokenInfoBeanCopydefault3 != null ? dexMultiTokenInfoBeanCopydefault3.getPrice() : null;
        String str5 = price == null ? "" : price;
        String slippageValue2 = slippageRange != null ? slippageRange.getSlippageValue() : null;
        AdvancedQuoteUiData advancedQuoteUiData = new AdvancedQuoteUiData(new AdvancedQuoteAndCallData.LegacyLimit(new AdvancedQuoteResponse(new AdvancedCommonDexInfo("", dexMultiTokenInfoBean, str4, str5, slippageValue2 == null ? "" : slippageValue2, "", copyTradingDefaultConfigKWHzl.getChainType(), new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null), "", "0", C30924lkN.EZpvd(list), C30924lkN.OLrzqt(list), Intrinsics.EZpvd((Object) routeConfig.getRouterModeType(), (Object) PresetRouteType.RouteTypeMev.getValue()), !copyTradingDefaultConfigKWHzl.getSupportAutoMode(), z3 ? "1" : "0", MevUnstableShowLevelType.NORMAL.getType(), copyTradingDefaultConfigKWHzl.getNativeTokenPrice(), false, null, "", "", "", ""), (TraceData) null, false, (Integer) null, (String) null, (String) null, (List) null, (String) null, 254, (DefaultConstructorMarker) null), null));
        int value5 = (z2 ? TransactionDirection.TransactionSell : TransactionDirection.TransactionBuy).getValue();
        String nativeTokenPrice = copyTradingDefaultConfigKWHzl.getNativeTokenPrice();
        String chainId = copyTradingDefaultConfigKWHzl.getChainId();
        DefiChainInfo value6 = copyTradingEditStrategyViewModel.values.getValue();
        Boolean boolKWHzl = value6 != null ? C56443yFo.KWHzl(value6.getSupportEip1559()) : null;
        String gasPriceUnitDecimal = copyTradingDefaultConfigKWHzl.getGasPriceUnitDecimal();
        String chainType = copyTradingDefaultConfigKWHzl.getChainType();
        DefiChainInfo value7 = copyTradingEditStrategyViewModel.values.getValue();
        String strGEmmrt = C33129mqd.gEmmrt(value7 != null ? value7.getNetworkFeeUnit() : null);
        DefiChainInfo value8 = copyTradingEditStrategyViewModel.values.getValue();
        String strGEmmrt2 = C33129mqd.gEmmrt(value8 != null ? value8.getChainName() : null);
        DefiChainInfo value9 = copyTradingEditStrategyViewModel.values.getValue();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = new DexMultiTokenInfoBean((String) null, (String) null, strGEmmrt2, strGEmmrt, (String) null, (String) null, (String) null, (String) null, (String) null, C33129mqd.gEmmrt(value9 != null ? value9.getNetworkFeeDisplayDecimals() : null), (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -525, 134217727, (DefaultConstructorMarker) null);
        MinMaxData minMaxData = new MinMaxData(value == 1 ? slippageConfig.getDynamicRecommendMinValue() : slippageConfig.getFixedRecommendMin(), value == 1 ? slippageConfig.getDynamicRecommendMaxValue() : slippageConfig.getFixedRecommendMax());
        PriorityFeeInfo priorityFeeInfo = new PriorityFeeInfo(feeConfig.getMax(), feeConfig.getMin());
        Boolean boolKWHzl2 = C56443yFo.KWHzl(z3);
        Integer numAEQbTJ = C56443yFo.AEQbTJ(priorityFeeTypeCopydefault.getValue());
        if (copyTradingPreset == null || (routerModeType2 = copyTradingPreset.getRouterModeType()) == null) {
            routerModeType2 = routeConfig.getRouterModeType();
        }
        AdvancedMainConfig advancedMainConfig = new AdvancedMainConfig(chainId, null, boolKWHzl, gasPriceUnitDecimal, "", chainType, dexMultiTokenInfoBean2, minMaxData, priorityFeeInfo, new AdvancedDefaultPreset(boolKWHzl2, numAEQbTJ, routerModeType2), "", copyTradingDefaultConfigKWHzl.getSupportAutoMode(), false, copyTradingDefaultConfigKWHzl.getSupportCustomGasFee());
        List<SlippageRange> slippageRange4 = slippageConfig.getSlippageRange();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : slippageRange4) {
            if (((SlippageRange) obj2).getSlippageLevel() != SlippageFeeType.SlippageCustom.getValue()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((SlippageRange) it3.next()).getSlippageValue());
        }
        return new AdvancedSettingsContract.Input(null, strEZpvd, str, value, "", str2, value4, z3, value5, "", "", nativeTokenPrice, str3, advancedMainConfig, new AutoSlippageInfo("", "", "", arrayList2, C56443yFo.KWHzl(copyTradingDefaultConfigKWHzl.getDynamicSupportMax()), slippageConfig.getDynamicMin(), slippageConfig.getDynamicMax(), (String) null, (String) null, "", MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null), SlippageMode.Fixed, slippageConfig.getDynamicMaxSlippageValue(), null, true, false, null, copyTradingEditStrategyViewModel.QKVWgx, advancedQuoteUiData, 1703937, null);
    }

    public static /* synthetic */ Object getBuySellConfigData$default(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copyTradingEditStrategyViewModel.AEQbTJ(z, (Continuation<? super BuySellConfigData>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016c A[PHI: r1
  0x016c: PHI (r1v16 java.lang.String) = (r1v7 java.lang.String), (r1v17 java.lang.String) binds: [B:85:0x0168, B:81:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(boolean z, @NotNull Continuation<? super BuySellConfigData> continuation) throws Throwable {
        CopyTradingEditStrategyViewModel$getBuySellConfigData$1 copyTradingEditStrategyViewModel$getBuySellConfigData$1;
        CopyTradingDefaultConfig copyTradingDefaultConfigKWHzl;
        Object next;
        Object next2;
        RouteConfig routeConfig;
        SlippageConfigPreset slippageConfigPreset;
        SlippageRange slippageRange;
        FeeOption feeOption;
        CopyTradingPreset copyTradingPreset;
        boolean zEZpvd;
        String routerModeType;
        String str;
        PriorityFeeType priorityFeeTypeCopydefault;
        String str2;
        String feeValue;
        String feeLevel;
        String slippageType;
        if (continuation instanceof CopyTradingEditStrategyViewModel$getBuySellConfigData$1) {
            copyTradingEditStrategyViewModel$getBuySellConfigData$1 = (CopyTradingEditStrategyViewModel$getBuySellConfigData$1) continuation;
            int i = copyTradingEditStrategyViewModel$getBuySellConfigData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyViewModel$getBuySellConfigData$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyViewModel$getBuySellConfigData$1 = new CopyTradingEditStrategyViewModel$getBuySellConfigData$1(this, continuation);
            }
        }
        Object obj = copyTradingEditStrategyViewModel$getBuySellConfigData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyViewModel$getBuySellConfigData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result<gTC> value = this.zuBGHE.getValue();
            if (value != null) {
                Object objM7386unboximpl = value.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                gTC gtc = (gTC) objM7386unboximpl;
                if (gtc != null && (copyTradingDefaultConfigKWHzl = gtc.KWHzl()) != null) {
                    CopyTradingPresetConfig preset = copyTradingDefaultConfigKWHzl.getPreset();
                    BuySellPreset sellPreset = z ? preset.getSellPreset() : preset.getBuyPreset();
                    SlippageConfigPreset slippageConfig = sellPreset.getSlippageConfig();
                    List<SlippageRange> slippageRange2 = slippageConfig.getSlippageRange();
                    Iterator<T> it = slippageRange2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((SlippageRange) next).getSelected()) {
                            break;
                        }
                    }
                    SlippageRange slippageRange3 = (SlippageRange) next;
                    SlippageRange slippageRange4 = slippageRange3 == null ? (SlippageRange) CollectionsKt___CollectionsKt.firstOrNull(slippageRange2) : slippageRange3;
                    FeeConfig feeConfig = sellPreset.getFeeConfig();
                    RouteConfig routeConfig2 = sellPreset.getRouteConfig();
                    List<FeeOption> feeOptions = feeConfig.getFeeOptions();
                    Iterator<T> it2 = feeOptions.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((FeeOption) next2).getSelected()) {
                            break;
                        }
                    }
                    FeeOption feeOption2 = (FeeOption) next2;
                    FeeOption feeOption3 = feeOption2 == null ? (FeeOption) CollectionsKt___CollectionsKt.firstOrNull(feeOptions) : feeOption2;
                    copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$0 = slippageConfig;
                    copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$1 = slippageRange4;
                    copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$2 = routeConfig2;
                    copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$3 = feeOption3;
                    if (z) {
                        copyTradingEditStrategyViewModel$getBuySellConfigData$1.label = 1;
                        Object objEZpvd = EZpvd(copyTradingEditStrategyViewModel$getBuySellConfigData$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        routeConfig = routeConfig2;
                        slippageConfigPreset = slippageConfig;
                        slippageRange = slippageRange4;
                        obj = objEZpvd;
                        feeOption = feeOption3;
                        copyTradingPreset = (CopyTradingPreset) obj;
                    } else {
                        copyTradingEditStrategyViewModel$getBuySellConfigData$1.label = 2;
                        Object objCopydefault2 = copydefault(copyTradingEditStrategyViewModel$getBuySellConfigData$1);
                        if (objCopydefault2 == objCopydefault) {
                            return objCopydefault;
                        }
                        routeConfig = routeConfig2;
                        slippageConfigPreset = slippageConfig;
                        slippageRange = slippageRange4;
                        obj = objCopydefault2;
                        feeOption = feeOption3;
                        copyTradingPreset = (CopyTradingPreset) obj;
                    }
                }
            }
            return null;
        }
        if (i2 == 1) {
            feeOption = (FeeOption) copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$3;
            routeConfig = (RouteConfig) copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$2;
            slippageRange = (SlippageRange) copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$1;
            slippageConfigPreset = (SlippageConfigPreset) copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            copyTradingPreset = (CopyTradingPreset) obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            feeOption = (FeeOption) copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$3;
            routeConfig = (RouteConfig) copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$2;
            slippageRange = (SlippageRange) copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$1;
            slippageConfigPreset = (SlippageConfigPreset) copyTradingEditStrategyViewModel$getBuySellConfigData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            copyTradingPreset = (CopyTradingPreset) obj;
        }
        if (copyTradingPreset == null) {
            zEZpvd = routeConfig.isMevOpen();
        } else {
            zEZpvd = Intrinsics.EZpvd((Object) copyTradingPreset.getRouterModeType(), (Object) PresetRouteType.RouteTypeMev.getValue());
        }
        boolean z2 = zEZpvd;
        PresetRouteType.TaskDescription taskDescription = PresetRouteType.Companion;
        if (copyTradingPreset == null || (routerModeType = copyTradingPreset.getRouterModeType()) == null) {
            routerModeType = routeConfig.getRouterModeType();
        }
        PresetRouteType presetRouteTypeEZpvd = taskDescription.EZpvd(routerModeType);
        SlippageMode slippageModeEZpvd = SlippageMode.Companion.EZpvd((copyTradingPreset == null || (slippageType = copyTradingPreset.getSlippageType()) == null) ? slippageConfigPreset.getSlippageType() : Integer.parseInt(slippageType));
        if (copyTradingPreset == null || (slippageValue = copyTradingPreset.getSlippageValue()) == null) {
            String slippageValue = slippageRange != null ? slippageRange.getSlippageValue() : null;
            str = slippageValue == null ? "" : slippageValue;
        }
        if (copyTradingPreset == null || (feeLevel = copyTradingPreset.getFeeLevel()) == null || (priorityFeeTypeCopydefault = PriorityFeeType.Companion.copydefault(Integer.parseInt(feeLevel))) == null) {
            if (feeOption != null) {
                priorityFeeTypeCopydefault = PriorityFeeType.Companion.copydefault(feeOption.getFeeLevel());
            } else {
                priorityFeeTypeCopydefault = PriorityFeeType.PriorityTurbo;
            }
        }
        PriorityFeeType priorityFeeType = priorityFeeTypeCopydefault;
        if (copyTradingPreset == null || (feeValue = copyTradingPreset.getFeeValue()) == null) {
            String feeValue2 = feeOption != null ? feeOption.getFeeValue() : null;
            str2 = feeValue2 == null ? "" : feeValue2;
        } else {
            str2 = feeValue;
        }
        return new BuySellConfigData(z2, presetRouteTypeEZpvd, slippageModeEZpvd, str, priorityFeeType, str2);
    }

    public static /* synthetic */ Object getBuySellPreset$default(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copyTradingEditStrategyViewModel.KWHzl(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(boolean z, @NotNull Continuation<? super CopyTradingPreset> continuation) throws Throwable {
        CopyTradingEditStrategyViewModel$getBuySellPreset$1 copyTradingEditStrategyViewModel$getBuySellPreset$1;
        if (continuation instanceof CopyTradingEditStrategyViewModel$getBuySellPreset$1) {
            copyTradingEditStrategyViewModel$getBuySellPreset$1 = (CopyTradingEditStrategyViewModel$getBuySellPreset$1) continuation;
            int i = copyTradingEditStrategyViewModel$getBuySellPreset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyViewModel$getBuySellPreset$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyViewModel$getBuySellPreset$1 = new CopyTradingEditStrategyViewModel$getBuySellPreset$1(this, continuation);
            }
        }
        Object objEZpvd = copyTradingEditStrategyViewModel$getBuySellPreset$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyViewModel$getBuySellPreset$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            copyTradingEditStrategyViewModel$getBuySellPreset$1.label = 1;
            objEZpvd = EZpvd(z, copyTradingEditStrategyViewModel$getBuySellPreset$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AdvancedSettingsContract.Input input = (AdvancedSettingsContract.Input) objEZpvd;
        if (input == null) {
            return null;
        }
        int type = input.getSlippageMode().getType();
        int slippageFeeType = input.getSlippageFeeType();
        String slippageValue = input.getSlippageValue();
        String maxSlippage = input.getMaxSlippage();
        if (maxSlippage == null) {
            maxSlippage = "";
        }
        return new CopyTradingPreset(String.valueOf(type), String.valueOf(slippageFeeType), slippageValue, maxSlippage, input.getRouterModeType(), String.valueOf(input.getPriorityFeeType()), input.getPriorityValue(), (String) null, (String) null, (JsonElement) null, FaceDetector.NUM_BOXES, (DefaultConstructorMarker) null);
    }

    public final void AubY() {
        String value;
        if (this.getFieldNames) {
            value = DexTrackEventParameter.StrategyType.EDIT_EXISTING.getValue();
        } else if (C33129mqd.OLrzqt((CharSequence) this.sSMYrx)) {
            value = DexTrackEventParameter.StrategyType.COPY_AGAIN.getValue();
        } else {
            value = DexTrackEventParameter.StrategyType.CREATE_NEW.getValue();
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingEditStrategyViewModel$trackViewEvent$1(this, value, null), 3, null);
    }

    public static /* synthetic */ void trackClickEvent$default(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        copyTradingEditStrategyViewModel.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2) {
        String value;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.getFieldNames) {
            value = DexTrackEventParameter.StrategyType.EDIT_EXISTING.getValue();
        } else if (C33129mqd.OLrzqt((CharSequence) this.sSMYrx)) {
            value = DexTrackEventParameter.StrategyType.COPY_AGAIN.getValue();
        } else {
            value = DexTrackEventParameter.StrategyType.CREATE_NEW.getValue();
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingEditStrategyViewModel$trackClickEvent$1(this, str, value, str2, null), 3, null);
    }

    public final void copydefault(BuySettings buySettings, SellSettings sellSettings, TokenFilter tokenFilter) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingEditStrategyViewModel$trackSubmitClick$1(this, buySettings.getBuyType() == 1 ? "fixed_buy" : "percentage_buy", C33129mqd.OLrzqt((CharSequence) buySettings.getMaxBuyAmount()), !buySettings.getRepeatCopyBuy(), C19872gSl.copydefault(sellSettings), C19872gSl.EZpvd(sellSettings), tokenFilter, null), 3, null);
    }

    public final String valueOf() {
        Object next;
        Long timeMills;
        Iterator<T> it = AkhnZx().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String id = ((ExpireTimeConfig) next).getId();
            ExpireTimeData expireTimeDataAYXKKw = AYXKKw();
            if (Intrinsics.EZpvd((Object) id, (Object) (expireTimeDataAYXKKw != null ? expireTimeDataAYXKKw.EZpvd() : null))) {
                break;
            }
        }
        ExpireTimeConfig expireTimeConfig = (ExpireTimeConfig) next;
        if (expireTimeConfig != null && (timeMills = expireTimeConfig.getTimeMills()) != null) {
            long jLongValue = timeMills.longValue();
            if (jLongValue == 604800000) {
                return "d7";
            }
            if (jLongValue == 2592000000L) {
                return "m1";
            }
            if (jLongValue == 7776000000L) {
                return "m3";
            }
            ExpireTimeData expireTimeDataAYXKKw2 = AYXKKw();
            String strOLrzqt = expireTimeDataAYXKKw2 != null ? expireTimeDataAYXKKw2.OLrzqt() : null;
            if (strOLrzqt != null) {
                return strOLrzqt;
            }
        }
        return "";
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.AubY.OLrzqt();
        super.onCleared();
    }

    public final void EZpvd(gTB gtb) {
        MutableStateFlow<gTB> mutableStateFlow = this.djBIcL;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), gtb)) {
        }
    }

    public final void EZpvd(ExpireTimeData expireTimeData) {
        MutableStateFlow<ExpireTimeData> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), expireTimeData)) {
        }
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        MutableStateFlow<DexMultiTokenInfoBean> mutableStateFlow = this.AEQbTJ;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), dexMultiTokenInfoBean)) {
        }
    }
}
