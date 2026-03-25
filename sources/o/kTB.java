package o;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedQuotePollingDelegate$startLimitQuote$1$execute$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedQuotePollingDelegate$startMarketQuote$1;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteParams;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateRequest;
import com.okinc.network.okg.response.OKServerException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC25391ivo;
import o.InterfaceC30595leC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kTB {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<AdvancedQuoteUiData> AEQbTJ;
    public final C28160kRc AYXKKw;
    public final MutableStateFlow<TokenPairRateQuote> AhwBna;
    public final StateFlow<AdvancedQuoteUiData> DbNXlk;
    public final kRE EZpvd;
    public final InterfaceC25414iwK KWHzl;
    public final kPS copydefault;
    public Job djBIcL;
    public AdvancedQuoteParams fetchVPNInfo;
    public Function2<? super AdvancedQuoteUiData, ? super Continuation<? super InterfaceC30595leC>, ? extends java.lang.Object> gEmmrt;
    public final InterfaceC25391ivo isConnected;
    public final MutableStateFlow<java.lang.Throwable> valueOf;
    public final MutableStateFlow<Result<V6BaseQuoteResponse>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AdvancedQuoteUiData> AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.lang.Throwable> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function2<? super AdvancedQuoteUiData, ? super Continuation<? super InterfaceC30595leC>, ? extends java.lang.Object> function2) {
        this.gEmmrt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<TokenPairRateQuote> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Result<V6BaseQuoteResponse>> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData, ? super kotlin.coroutines.Continuation<? super o.leC>, ? extends java.lang.Object>, kotlin.jvm.functions.Function2<com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData, kotlin.coroutines.Continuation<? super o.leC>, java.lang.Object> */
    public final Function2<AdvancedQuoteUiData, Continuation<? super InterfaceC30595leC>, java.lang.Object> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public kTB(@NotNull kRE kre, @NotNull C28160kRc c28160kRc, @NotNull InterfaceC25391ivo interfaceC25391ivo, @NotNull kPS kps, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(kre, "");
        Intrinsics.checkNotNullParameter(c28160kRc, "");
        Intrinsics.checkNotNullParameter(interfaceC25391ivo, "");
        Intrinsics.checkNotNullParameter(kps, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        this.EZpvd = kre;
        this.AYXKKw = c28160kRc;
        this.isConnected = interfaceC25391ivo;
        this.copydefault = kps;
        this.KWHzl = interfaceC25414iwK;
        MutableStateFlow<AdvancedQuoteUiData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        this.values = StateFlowKt.MutableStateFlow(null);
        this.AhwBna = StateFlowKt.MutableStateFlow(null);
        this.valueOf = StateFlowKt.MutableStateFlow(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kTB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final StateFlow<java.lang.Boolean> OLrzqt(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        return FlowKt.stateIn(FlowKt.flow(new AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1(null)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), java.lang.Boolean.FALSE);
    }

    public final void AhwBna() {
        this.AhwBna.setValue(null);
        this.valueOf.setValue(null);
    }

    public final java.lang.String OLrzqt(C30808liD c30808liD) {
        java.lang.String strKWHzl = c30808liD != null ? c30808liD.KWHzl() : null;
        if (strKWHzl != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
            return strKWHzl;
        }
        java.lang.String strAkhnZx = c30808liD != null ? c30808liD.AkhnZx() : null;
        return strAkhnZx == null ? "" : strAkhnZx;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        double dAEQbTJ = this.copydefault.AEQbTJ();
        if (str == null) {
            str = "";
        }
        return C33129mqd.divS$default(str, java.lang.Double.valueOf(dAEQbTJ), null, null, null, 14, null);
    }

    public final java.lang.Object EZpvd(@NotNull AdvancedTradeType advancedTradeType, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super V6QuoteAndCalldataRequest> continuation) {
        kRE kre = this.EZpvd;
        AdvancedQuoteParams advancedQuoteParams = this.fetchVPNInfo;
        if (advancedQuoteParams == null) {
            return null;
        }
        return kre.KWHzl(advancedTradeType, str, z, advancedQuoteParams, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super V6QuoteRequest> continuation) {
        kRE kre = this.EZpvd;
        AdvancedQuoteParams advancedQuoteParams = this.fetchVPNInfo;
        if (advancedQuoteParams == null) {
            return null;
        }
        return kre.OLrzqt(str, z, advancedQuoteParams, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r3
  0x002f: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v25 java.lang.String) binds: [B:9:0x001d, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdvancedQuoteParams AEQbTJ(@NotNull C30626leh c30626leh, C30808liD c30808liD, boolean z, boolean z2, java.lang.String str) {
        java.lang.String str2;
        SlippageMode slippageModeCopydefault;
        Intrinsics.checkNotNullParameter(c30626leh, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = c30626leh.AhwBna();
        java.lang.String chainId = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) chainId)) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = c30626leh.AEQbTJ();
            chainId = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainId() : null;
            if (chainId == null) {
                str2 = "";
            }
        } else {
            str2 = chainId;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna2 = c30626leh.AhwBna();
        java.lang.String tokenContractAddress = dexMultiTokenInfoBeanAhwBna2 != null ? dexMultiTokenInfoBeanAhwBna2.getTokenContractAddress() : null;
        java.lang.String str3 = tokenContractAddress == null ? "" : tokenContractAddress;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2 = c30626leh.AEQbTJ();
        java.lang.String tokenContractAddress2 = dexMultiTokenInfoBeanAEQbTJ2 != null ? dexMultiTokenInfoBeanAEQbTJ2.getTokenContractAddress() : null;
        java.lang.String str4 = tokenContractAddress2 == null ? "" : tokenContractAddress2;
        java.lang.String strGEmmrt = c30626leh.gEmmrt();
        java.lang.String str5 = strGEmmrt == null ? "" : strGEmmrt;
        C30805liA c30805liADjBIcL = c30626leh.djBIcL();
        java.lang.String strEZpvd = c30805liADjBIcL != null ? c30805liADjBIcL.EZpvd() : null;
        C30805liA c30805liADjBIcL2 = c30626leh.djBIcL();
        if (c30805liADjBIcL2 == null || (slippageModeCopydefault = c30805liADjBIcL2.copydefault()) == null) {
            slippageModeCopydefault = SlippageMode.Dynamic;
        }
        int type = slippageModeCopydefault.getType();
        C30805liA c30805liADjBIcL3 = c30626leh.djBIcL();
        AdvancedQuoteParams advancedQuoteParams = new AdvancedQuoteParams(str2, str3, str4, str5, strEZpvd, java.lang.Integer.valueOf(type), c30805liADjBIcL3 != null ? c30805liADjBIcL3.OLrzqt() : null, c30626leh.copydefault(), str, c30808liD != null ? c30808liD.AhwBna() : null, c30808liD != null ? c30808liD.valueOf() : null, c30808liD != null ? java.lang.Integer.valueOf(c30808liD.copydefault()).toString() : null, z && z2, c30626leh.valueOf(), c30626leh.KWHzl());
        this.fetchVPNInfo = advancedQuoteParams;
        this.EZpvd.copydefault(advancedQuoteParams);
        return advancedQuoteParams;
    }

    public final void copydefault(SlippageMode slippageMode, java.lang.String str) {
        if (slippageMode == SlippageMode.Fixed) {
            if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                C31200lpY.OLrzqt("slippageMode=Fixed but slippageValue=" + str);
            }
        }
    }

    public final void copydefault(@NotNull CoroutineScope coroutineScope, boolean z, boolean z2, @NotNull C28141kQk c28141kQk, @NotNull kTG ktg, @NotNull Function1<? super V6BaseQuoteResponse, java.lang.String> function1, @NotNull Function1<? super InterfaceC30595leC, Unit> function12, @NotNull Function1<? super java.lang.Boolean, Unit> function13, @NotNull Function1<? super java.lang.String, Unit> function14) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(c28141kQk, "");
        Intrinsics.checkNotNullParameter(ktg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        if (!z2) {
            stopChecking$default(this, false, false, 1, null);
        }
        if (z) {
            AEQbTJ(coroutineScope, ktg, function12);
        } else {
            EZpvd(coroutineScope, c28141kQk, function1, function12, function13, function14);
        }
    }

    public final void EZpvd(CoroutineScope coroutineScope, C28141kQk c28141kQk, Function1<? super V6BaseQuoteResponse, java.lang.String> function1, Function1<? super InterfaceC30595leC, Unit> function12, Function1<? super java.lang.Boolean, Unit> function13, Function1<? super java.lang.String, Unit> function14) {
        this.djBIcL = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AdvancedQuotePollingDelegate$startMarketQuote$1(this, c28141kQk, function1, function12, function14, function13, null), 3, null);
    }

    public final void AEQbTJ(CoroutineScope coroutineScope, kTG ktg, Function1<? super InterfaceC30595leC, Unit> function1) {
        this.djBIcL = this.isConnected.KWHzl(coroutineScope, 5000L, new Activity(ktg, function1));
    }

    public static final class Activity implements InterfaceC25391ivo.StateListAnimator {
        public final /* synthetic */ kTG AEQbTJ;
        public final /* synthetic */ Function1<InterfaceC30595leC, Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.leC, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(kTG ktg, Function1<? super InterfaceC30595leC, Unit> function1) {
            this.AEQbTJ = ktg;
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: kotlin.jvm.functions.Function2<com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData, kotlin.coroutines.Continuation<? super o.leC>, java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // o.InterfaceC25391ivo.StateListAnimator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object KWHzl(Continuation<? super Unit> continuation) throws java.lang.Throwable {
            AdvancedQuotePollingDelegate$startLimitQuote$1$execute$1 advancedQuotePollingDelegate$startLimitQuote$1$execute$1;
            java.lang.Object objKWHzl;
            Activity activity;
            Function1<InterfaceC30595leC, Unit> function1;
            java.lang.String strOLrzqt;
            java.lang.Object value;
            java.lang.Object obj;
            InterfaceC30595leC interfaceC30595leC;
            Function1<InterfaceC30595leC, Unit> function12;
            kTB ktb;
            Function1<InterfaceC30595leC, Unit> function13;
            java.lang.Throwable thM7380exceptionOrNullimpl;
            java.lang.Throwable origin;
            AdvancedQuoteUiData advancedQuoteUiData;
            kTB ktb2;
            Function1<InterfaceC30595leC, Unit> function14;
            AdvancedQuoteUiData advancedQuoteUiData2;
            MutableStateFlow mutableStateFlow;
            java.lang.Object value2;
            if (continuation instanceof AdvancedQuotePollingDelegate$startLimitQuote$1$execute$1) {
                advancedQuotePollingDelegate$startLimitQuote$1$execute$1 = (AdvancedQuotePollingDelegate$startLimitQuote$1$execute$1) continuation;
                int i = advancedQuotePollingDelegate$startLimitQuote$1$execute$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    advancedQuotePollingDelegate$startLimitQuote$1$execute$1.label = i - Integer.MIN_VALUE;
                } else {
                    advancedQuotePollingDelegate$startLimitQuote$1$execute$1 = new AdvancedQuotePollingDelegate$startLimitQuote$1$execute$1(this, continuation);
                }
            }
            java.lang.Object objInvoke = advancedQuotePollingDelegate$startLimitQuote$1$execute$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = advancedQuotePollingDelegate$startLimitQuote$1$execute$1.label;
            InterfaceC30595leC interfaceC30595leC2 = null;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objInvoke);
                C28160kRc c28160kRc = kTB.this.AYXKKw;
                DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl = this.AEQbTJ.KWHzl();
                LimitPairRateRequest limitPairRateRequest = new LimitPairRateRequest(C33129mqd.valueOf(dexMultiTokenInfoBeanKWHzl != null ? dexMultiTokenInfoBeanKWHzl.getChainId() : null), kTB.this.KWHzl(this.AEQbTJ.KWHzl()), kTB.this.KWHzl(this.AEQbTJ.djBIcL()), this.AEQbTJ.valueOf(), (java.lang.String) null, this.AEQbTJ.AEQbTJ(), (java.lang.String) null, 80, (DefaultConstructorMarker) null);
                advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$0 = this;
                advancedQuotePollingDelegate$startLimitQuote$1$execute$1.label = 1;
                objKWHzl = c28160kRc.KWHzl(limitPairRateRequest, advancedQuotePollingDelegate$startLimitQuote$1$execute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                activity = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        advancedQuoteUiData2 = (AdvancedQuoteUiData) advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$3;
                        function14 = (Function1) advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$2;
                        ktb2 = (kTB) advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$1;
                        C56391yDq.AEQbTJ(objInvoke);
                        interfaceC30595leC2 = (InterfaceC30595leC) objInvoke;
                        advancedQuoteUiData = advancedQuoteUiData2;
                        function13 = function14;
                        ktb = ktb2;
                        function13.invoke(interfaceC30595leC2);
                        mutableStateFlow = ktb.AEQbTJ;
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value2, advancedQuoteUiData));
                        return Unit.INSTANCE;
                    }
                    function12 = (Function1) advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$2;
                    obj = advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$1;
                    activity = (Activity) advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$0;
                    C56391yDq.AEQbTJ(objInvoke);
                    interfaceC30595leC = (InterfaceC30595leC) objInvoke;
                    function1 = function12;
                    function1.invoke(interfaceC30595leC);
                    objKWHzl = obj;
                    ktb = kTB.this;
                    function13 = activity.EZpvd;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                    if (thM7380exceptionOrNullimpl != null) {
                        ktb.KWHzl().setValue(null);
                        MutableStateFlow<java.lang.Throwable> mutableStateFlowEZpvd = ktb.EZpvd();
                        boolean z = thM7380exceptionOrNullimpl instanceof OKServerException;
                        OKServerException oKServerException = z ? (OKServerException) thM7380exceptionOrNullimpl : null;
                        if (oKServerException == null || (origin = oKServerException.getOrigin()) == null) {
                            origin = thM7380exceptionOrNullimpl;
                        }
                        mutableStateFlowEZpvd.setValue(origin);
                        OKServerException oKServerException2 = z ? (OKServerException) thM7380exceptionOrNullimpl : null;
                        if (oKServerException2 != null) {
                            java.lang.Throwable origin2 = oKServerException2.getOrigin();
                            OKServerException oKServerException3 = origin2 instanceof OKServerException ? (OKServerException) origin2 : null;
                            if (oKServerException3 != null) {
                                oKServerException2 = oKServerException3;
                            }
                        } else {
                            oKServerException2 = null;
                        }
                        advancedQuoteUiData = new AdvancedQuoteUiData(new AdvancedQuoteAndCallData.LegacyLimit(new AdvancedQuoteResponse((AdvancedCommonDexInfo) null, (TraceData) null, true, oKServerException2 != null ? C56443yFo.AEQbTJ(oKServerException2.getCode()) : null, oKServerException2 != null ? oKServerException2.getMessage() : null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, 227, (DefaultConstructorMarker) null), null));
                        Function2<AdvancedQuoteUiData, Continuation<? super InterfaceC30595leC>, java.lang.Object> function2Copydefault = ktb.copydefault();
                        if (function2Copydefault != null) {
                            advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$0 = objKWHzl;
                            advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$1 = ktb;
                            advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$2 = function13;
                            advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$3 = advancedQuoteUiData;
                            advancedQuotePollingDelegate$startLimitQuote$1$execute$1.label = 3;
                            objInvoke = function2Copydefault.invoke(advancedQuoteUiData, advancedQuotePollingDelegate$startLimitQuote$1$execute$1);
                            if (objInvoke == objCopydefault) {
                                return objCopydefault;
                            }
                            ktb2 = ktb;
                            function14 = function13;
                            advancedQuoteUiData2 = advancedQuoteUiData;
                            interfaceC30595leC2 = (InterfaceC30595leC) objInvoke;
                            advancedQuoteUiData = advancedQuoteUiData2;
                            function13 = function14;
                            ktb = ktb2;
                        }
                        function13.invoke(interfaceC30595leC2);
                        mutableStateFlow = ktb.AEQbTJ;
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value2, advancedQuoteUiData));
                    }
                    return Unit.INSTANCE;
                }
                Activity activity2 = (Activity) advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                objKWHzl = ((Result) objInvoke).m7386unboximpl();
                activity = activity2;
            }
            kTB ktb3 = kTB.this;
            kTG ktg = activity.AEQbTJ;
            function1 = activity.EZpvd;
            if (Result.m7384isSuccessimpl(objKWHzl)) {
                TokenPairRateQuote tokenPairRateQuote = (TokenPairRateQuote) objKWHzl;
                ktb3.KWHzl().setValue(tokenPairRateQuote);
                ktb3.EZpvd().setValue(null);
                if (ktg.AhwBna() == AdvancedLimitBy.MCap) {
                    java.lang.String strOLrzqt2 = ktg.EZpvd().OLrzqt();
                    if (C30565ldZ.EZpvd(strOLrzqt2)) {
                        strOLrzqt = C33129mqd.divS$default(ktg.OLrzqt(), strOLrzqt2, null, null, null, 14, null);
                    } else {
                        function1.invoke(new InterfaceC30595leC.TaskStackBuilder(ktg.copydefault()));
                    }
                } else {
                    strOLrzqt = ktg.OLrzqt();
                }
                AdvancedQuoteResponse advancedQuoteResponseOLrzqt = ktb3.AYXKKw.OLrzqt(tokenPairRateQuote, strOLrzqt, ktg.gEmmrt());
                MutableStateFlow mutableStateFlow2 = ktb3.AEQbTJ;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, new AdvancedQuoteUiData(new AdvancedQuoteAndCallData.LegacyLimit(advancedQuoteResponseOLrzqt, tokenPairRateQuote))));
                Function2<AdvancedQuoteUiData, Continuation<? super InterfaceC30595leC>, java.lang.Object> function2Copydefault2 = ktb3.copydefault();
                if (function2Copydefault2 != 0) {
                    java.lang.Object value3 = ktb3.AEQbTJ.getValue();
                    advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$0 = activity;
                    advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$1 = objKWHzl;
                    advancedQuotePollingDelegate$startLimitQuote$1$execute$1.L$2 = function1;
                    advancedQuotePollingDelegate$startLimitQuote$1$execute$1.label = 2;
                    java.lang.Object objInvoke2 = function2Copydefault2.invoke(value3, advancedQuotePollingDelegate$startLimitQuote$1$execute$1);
                    if (objInvoke2 == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objKWHzl;
                    objInvoke = objInvoke2;
                    function12 = function1;
                    interfaceC30595leC = (InterfaceC30595leC) objInvoke;
                    function1 = function12;
                    function1.invoke(interfaceC30595leC);
                    objKWHzl = obj;
                } else {
                    obj = objKWHzl;
                    interfaceC30595leC = null;
                    function1.invoke(interfaceC30595leC);
                    objKWHzl = obj;
                }
            }
            ktb = kTB.this;
            function13 = activity.EZpvd;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void stopChecking$default(kTB ktb, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = z;
        }
        ktb.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        if (z) {
            this.AEQbTJ.setValue(null);
            if (z2) {
                MutableStateFlow<Result<V6BaseQuoteResponse>> mutableStateFlow = this.values;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
                }
            }
        }
    }

    public final java.lang.String KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        return dexMultiTokenInfoBean == null ? "" : dexMultiTokenInfoBean.getTokenContractAddress();
    }

    public final void copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Result<V6BaseQuoteResponse> value;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        MutableStateFlow<AdvancedQuoteUiData> mutableStateFlow = this.AEQbTJ;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new AdvancedQuoteUiData(new AdvancedQuoteAndCallData.V6(v6BaseQuoteResponse)))) {
        }
        MutableStateFlow<Result<V6BaseQuoteResponse>> mutableStateFlow2 = this.values;
        do {
            value = mutableStateFlow2.getValue();
            Result.Application application = Result.Companion;
        } while (!mutableStateFlow2.compareAndSet(value, Result.m7376boximpl(Result.m7377constructorimpl(v6BaseQuoteResponse))));
    }
}
