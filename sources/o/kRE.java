package o;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedQuoteUseCase$buildV6QuoteRequest$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteParams;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC43419rot;
import o.gYP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kRE {
    public final C28196kSl AYXKKw;
    public final gYX EZpvd;
    public final C30782lhe KWHzl;
    public final MutableStateFlow<AdvancedQuoteParams> OLrzqt;
    public final C23212htv copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public kRE(@NotNull C28196kSl c28196kSl, @NotNull C23212htv c23212htv, @NotNull gYX gyx, @NotNull C30782lhe c30782lhe) {
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(c30782lhe, "");
        this.AYXKKw = c28196kSl;
        this.copydefault = c23212htv;
        this.EZpvd = gyx;
        this.KWHzl = c30782lhe;
        this.OLrzqt = StateFlowKt.MutableStateFlow(null);
    }

    public static final class StateListAnimator implements Flow<Result<? extends AdvancedQuoteAndCallData.V6>> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ kRE OLrzqt;

        /* JADX INFO: renamed from: o.kRE$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ kRE copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, kRE kre) {
                this.AEQbTJ = flowCollector;
                this.copydefault = kre;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AdvancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1 advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1;
                if (continuation instanceof AdvancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1) {
                    advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1 = (AdvancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1) continuation;
                    int i = advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1 = new AdvancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    Result resultM7376boximpl = Result.m7376boximpl(this.copydefault.EZpvd((gYP) obj));
                    advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(resultM7376boximpl, advancedQuoteUseCase$pollQuoteV6$lambda$2$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, kRE kre) {
            this.KWHzl = flow;
            this.OLrzqt = kre;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super Result<? extends AdvancedQuoteAndCallData.V6>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kRE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(@NotNull AdvancedQuoteParams advancedQuoteParams) {
        Intrinsics.checkNotNullParameter(advancedQuoteParams, "");
        pUU.KWHzl("AdvancedQuoteUseCase", "updateQuoteParams: dexIds=" + advancedQuoteParams.getDexIds());
        MutableStateFlow<AdvancedQuoteParams> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), advancedQuoteParams)) {
        }
    }

    public final java.lang.Object EZpvd(gYP gyp) {
        if (gyp instanceof gYP.ActionBar) {
            AbstractC43419rot<V6QuoteResponseData, OKServerException> abstractC43419rotKWHzl = ((gYP.ActionBar) gyp).KWHzl();
            if (abstractC43419rotKWHzl instanceof AbstractC43419rot.StateListAnimator) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(new AdvancedQuoteAndCallData.V6((V6BaseQuoteResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rotKWHzl).KWHzl()));
            }
            if (!(abstractC43419rotKWHzl instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rotKWHzl).KWHzl()));
        }
        if (gyp instanceof gYP.Application) {
            AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException> abstractC43419rotOLrzqt = ((gYP.Application) gyp).OLrzqt();
            if (abstractC43419rotOLrzqt instanceof AbstractC43419rot.StateListAnimator) {
                Result.Application application3 = Result.Companion;
                return Result.m7377constructorimpl(new AdvancedQuoteAndCallData.V6((V6BaseQuoteResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rotOLrzqt).KWHzl()));
            }
            if (!(abstractC43419rotOLrzqt instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rotOLrzqt).KWHzl()));
        }
        Result.Application application5 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException(AbstractJsonLexerKt.NULL)));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull AdvancedTradeType advancedTradeType, java.lang.String str, boolean z, @NotNull AdvancedQuoteParams advancedQuoteParams, @NotNull Continuation<? super V6QuoteAndCalldataRequest> continuation) throws java.lang.Throwable {
        AdvancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1 advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1;
        AdvancedTradeType advancedTradeType2;
        java.lang.String str2;
        kRE kre;
        java.lang.Object obj;
        AdvancedQuoteParams advancedQuoteParams2;
        boolean z2;
        AdvancedTradeType advancedTradeType3;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        LiquidityConfig liquidityConfig;
        java.lang.String str6;
        SlippageConfig slippageConfig;
        java.lang.String str7;
        QuoteExt quoteExt;
        java.lang.String str8;
        java.lang.String priorityFeeType;
        java.lang.String routerModeType;
        if (continuation instanceof AdvancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1) {
            advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1 = (AdvancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1) continuation;
            int i = advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1 = new AdvancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C28196kSl c28196kSl = this.AYXKKw;
            long jValueOf = C33129mqd.valueOf(advancedQuoteParams.getChainId());
            advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$0 = this;
            advancedTradeType2 = advancedTradeType;
            advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$1 = advancedTradeType2;
            str2 = str;
            advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$2 = str2;
            advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$3 = advancedQuoteParams;
            advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.Z$0 = z;
            advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.label = 1;
            java.lang.Object objOLrzqt = c28196kSl.OLrzqt(jValueOf, advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            kre = this;
            obj = objOLrzqt;
            advancedQuoteParams2 = advancedQuoteParams;
            z2 = z;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SlippageConfig slippageConfig2 = (SlippageConfig) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$10;
                java.lang.String str9 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$9;
                java.lang.String str10 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$8;
                java.lang.String str11 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$7;
                java.lang.String str12 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$6;
                java.lang.String str13 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$5;
                QuoteExt quoteExt2 = (QuoteExt) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$4;
                LiquidityConfig liquidityConfig2 = (LiquidityConfig) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$3;
                java.lang.String str14 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$2;
                advancedQuoteParams2 = (AdvancedQuoteParams) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$1;
                advancedTradeType3 = (AdvancedTradeType) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                str6 = str10;
                str3 = str11;
                str4 = str12;
                str7 = str13;
                quoteExt = quoteExt2;
                liquidityConfig = liquidityConfig2;
                str5 = str14;
                slippageConfig = slippageConfig2;
                str8 = str9;
                AccountInfo accountInfo = (AccountInfo) objEZpvd;
                int type = AdvancedTradeType.Companion.EZpvd(advancedTradeType3).getType();
                java.lang.String priorityFee = advancedQuoteParams2.getPriorityFee();
                priorityFeeType = advancedQuoteParams2.getPriorityFeeType();
                if (priorityFeeType == null) {
                    priorityFeeType = java.lang.String.valueOf(AdvancedPriorityFeeType.Market.getValue());
                }
                NetworkFee networkFee = new NetworkFee(priorityFee, priorityFeeType);
                routerModeType = advancedQuoteParams2.getRouterModeType();
                if (routerModeType == null) {
                    routerModeType = PresetRouteType.RouteTypeAuto.getValue();
                }
                return new V6QuoteAndCalldataRequest(quoteExt.getNeedApproveTxInfo(), slippageConfig, liquidityConfig, new PreSetConfig(routerModeType), quoteExt, str8, AbstractC22421hez.Companion.KWHzl(), networkFee, str7, str4, str3, str6, str5, java.lang.String.valueOf(type), accountInfo);
            }
            boolean z3 = advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.Z$0;
            AdvancedQuoteParams advancedQuoteParams3 = (AdvancedQuoteParams) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$3;
            java.lang.String str15 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$2;
            AdvancedTradeType advancedTradeType4 = (AdvancedTradeType) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$1;
            kRE kre2 = (kRE) advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            advancedQuoteParams2 = advancedQuoteParams3;
            kre = kre2;
            obj = objEZpvd;
            z2 = z3;
            str2 = str15;
            advancedTradeType2 = advancedTradeType4;
        }
        java.lang.String str16 = (java.lang.String) obj;
        java.lang.String str17 = str16 == null ? "" : str16;
        LiquidityConfig liquidityConfig3 = new LiquidityConfig(advancedQuoteParams2.getExcludedDexIds(), (java.lang.String) null, str2, 2, (DefaultConstructorMarker) null);
        pUU.KWHzl("AdvancedQuoteUseCase", "buildV6Request: excludedDexIds=" + liquidityConfig3.getExcludedDexIds());
        QuoteExt quoteExtEZpvd = kre.EZpvd(advancedQuoteParams2);
        java.lang.String chainId = advancedQuoteParams2.getChainId();
        java.lang.String fromTokenAddress = advancedQuoteParams2.getFromTokenAddress();
        java.lang.String toTokenAddress = advancedQuoteParams2.getToTokenAddress();
        java.lang.String amount = advancedQuoteParams2.getAmount();
        java.lang.String strValueOf = java.lang.String.valueOf(TradeMode.AdvancedMode.getType());
        java.lang.String slippage = advancedQuoteParams2.getSlippage();
        java.lang.String str18 = slippage != null ? slippage : "";
        java.lang.Integer slippageMode = advancedQuoteParams2.getSlippageMode();
        SlippageConfig slippageConfig3 = new SlippageConfig(advancedQuoteParams2.getMaxSlippage(), str18, java.lang.String.valueOf(slippageMode != null ? slippageMode.intValue() : SlippageMode.Dynamic.getType()));
        C28196kSl c28196kSl2 = kre.AYXKKw;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$0 = advancedTradeType2;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$1 = advancedQuoteParams2;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$2 = str17;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$3 = liquidityConfig3;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$4 = quoteExtEZpvd;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$5 = chainId;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$6 = fromTokenAddress;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$7 = toTokenAddress;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$8 = amount;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$9 = strValueOf;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.L$10 = slippageConfig3;
        advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1.label = 2;
        objEZpvd = c28196kSl2.EZpvd(z2, advancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        advancedTradeType3 = advancedTradeType2;
        str3 = toTokenAddress;
        str4 = fromTokenAddress;
        str5 = str17;
        liquidityConfig = liquidityConfig3;
        str6 = amount;
        slippageConfig = slippageConfig3;
        str7 = chainId;
        quoteExt = quoteExtEZpvd;
        str8 = strValueOf;
        AccountInfo accountInfo2 = (AccountInfo) objEZpvd;
        int type2 = AdvancedTradeType.Companion.EZpvd(advancedTradeType3).getType();
        java.lang.String priorityFee2 = advancedQuoteParams2.getPriorityFee();
        priorityFeeType = advancedQuoteParams2.getPriorityFeeType();
        if (priorityFeeType == null) {
        }
        NetworkFee networkFee2 = new NetworkFee(priorityFee2, priorityFeeType);
        routerModeType = advancedQuoteParams2.getRouterModeType();
        if (routerModeType == null) {
        }
        return new V6QuoteAndCalldataRequest(quoteExt.getNeedApproveTxInfo(), slippageConfig, liquidityConfig, new PreSetConfig(routerModeType), quoteExt, str8, AbstractC22421hez.Companion.KWHzl(), networkFee2, str7, str4, str3, str6, str5, java.lang.String.valueOf(type2), accountInfo2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, boolean z, @NotNull AdvancedQuoteParams advancedQuoteParams, @NotNull Continuation<? super V6QuoteRequest> continuation) throws java.lang.Throwable {
        AdvancedQuoteUseCase$buildV6QuoteRequest$1 advancedQuoteUseCase$buildV6QuoteRequest$1;
        kRE kre;
        java.lang.Object obj;
        AdvancedQuoteParams advancedQuoteParams2;
        java.lang.String str2;
        boolean z2;
        QuoteExt quoteExtEZpvd;
        SlippageConfig slippageConfig;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        LiquidityConfig liquidityConfig;
        if (continuation instanceof AdvancedQuoteUseCase$buildV6QuoteRequest$1) {
            advancedQuoteUseCase$buildV6QuoteRequest$1 = (AdvancedQuoteUseCase$buildV6QuoteRequest$1) continuation;
            int i = advancedQuoteUseCase$buildV6QuoteRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedQuoteUseCase$buildV6QuoteRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedQuoteUseCase$buildV6QuoteRequest$1 = new AdvancedQuoteUseCase$buildV6QuoteRequest$1(this, continuation);
            }
        }
        java.lang.Object obj2 = advancedQuoteUseCase$buildV6QuoteRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedQuoteUseCase$buildV6QuoteRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            C28196kSl c28196kSl = this.AYXKKw;
            long jValueOf = C33129mqd.valueOf(advancedQuoteParams.getChainId());
            advancedQuoteUseCase$buildV6QuoteRequest$1.L$0 = this;
            advancedQuoteUseCase$buildV6QuoteRequest$1.L$1 = str;
            advancedQuoteUseCase$buildV6QuoteRequest$1.L$2 = advancedQuoteParams;
            advancedQuoteUseCase$buildV6QuoteRequest$1.Z$0 = z;
            advancedQuoteUseCase$buildV6QuoteRequest$1.label = 1;
            java.lang.Object objOLrzqt = c28196kSl.OLrzqt(jValueOf, advancedQuoteUseCase$buildV6QuoteRequest$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            kre = this;
            obj = objOLrzqt;
            advancedQuoteParams2 = advancedQuoteParams;
            str2 = str;
            z2 = z;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str9 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteRequest$1.L$8;
                java.lang.String str10 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteRequest$1.L$7;
                java.lang.String str11 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteRequest$1.L$6;
                java.lang.String str12 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteRequest$1.L$5;
                quoteExtEZpvd = (QuoteExt) advancedQuoteUseCase$buildV6QuoteRequest$1.L$4;
                LiquidityConfig liquidityConfig2 = (LiquidityConfig) advancedQuoteUseCase$buildV6QuoteRequest$1.L$3;
                SlippageConfig slippageConfig2 = (SlippageConfig) advancedQuoteUseCase$buildV6QuoteRequest$1.L$2;
                java.lang.String str13 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteRequest$1.L$1;
                java.lang.String str14 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteRequest$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                str6 = str9;
                str5 = str14;
                str4 = str10;
                str3 = str13;
                str7 = str11;
                slippageConfig = slippageConfig2;
                str8 = str12;
                liquidityConfig = liquidityConfig2;
                return new V6QuoteRequest(str5, str3, slippageConfig, liquidityConfig, quoteExtEZpvd, str8, str7, str4, str6, (AccountInfo) obj2);
            }
            z2 = advancedQuoteUseCase$buildV6QuoteRequest$1.Z$0;
            AdvancedQuoteParams advancedQuoteParams3 = (AdvancedQuoteParams) advancedQuoteUseCase$buildV6QuoteRequest$1.L$2;
            java.lang.String str15 = (java.lang.String) advancedQuoteUseCase$buildV6QuoteRequest$1.L$1;
            kRE kre2 = (kRE) advancedQuoteUseCase$buildV6QuoteRequest$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            str2 = str15;
            kre = kre2;
            obj = obj2;
            advancedQuoteParams2 = advancedQuoteParams3;
        }
        java.lang.String str16 = (java.lang.String) obj;
        java.lang.String str17 = str16 == null ? "" : str16;
        LiquidityConfig liquidityConfig3 = new LiquidityConfig(advancedQuoteParams2.getExcludedDexIds(), (java.lang.String) null, str2, 2, (DefaultConstructorMarker) null);
        java.lang.String strValueOf = java.lang.String.valueOf(TradeMode.AdvancedMode.getType());
        java.lang.String slippage = advancedQuoteParams2.getSlippage();
        java.lang.String str18 = slippage != null ? slippage : "";
        java.lang.Integer slippageMode = advancedQuoteParams2.getSlippageMode();
        SlippageConfig slippageConfig3 = new SlippageConfig(advancedQuoteParams2.getMaxSlippage(), str18, java.lang.String.valueOf(slippageMode != null ? slippageMode.intValue() : SlippageMode.Dynamic.getType()));
        quoteExtEZpvd = kre.EZpvd(advancedQuoteParams2);
        java.lang.String chainId = advancedQuoteParams2.getChainId();
        java.lang.String fromTokenAddress = advancedQuoteParams2.getFromTokenAddress();
        java.lang.String toTokenAddress = advancedQuoteParams2.getToTokenAddress();
        java.lang.String amount = advancedQuoteParams2.getAmount();
        C28196kSl c28196kSl2 = kre.AYXKKw;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$0 = str17;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$1 = strValueOf;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$2 = slippageConfig3;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$3 = liquidityConfig3;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$4 = quoteExtEZpvd;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$5 = chainId;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$6 = fromTokenAddress;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$7 = toTokenAddress;
        advancedQuoteUseCase$buildV6QuoteRequest$1.L$8 = amount;
        advancedQuoteUseCase$buildV6QuoteRequest$1.label = 2;
        java.lang.Object objEZpvd = c28196kSl2.EZpvd(z2, advancedQuoteUseCase$buildV6QuoteRequest$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        slippageConfig = slippageConfig3;
        str3 = strValueOf;
        str4 = toTokenAddress;
        str5 = str17;
        str6 = amount;
        obj2 = objEZpvd;
        str7 = fromTokenAddress;
        str8 = chainId;
        liquidityConfig = liquidityConfig3;
        return new V6QuoteRequest(str5, str3, slippageConfig, liquidityConfig, quoteExtEZpvd, str8, str7, str4, str6, (AccountInfo) obj2);
    }

    public final QuoteExt EZpvd(AdvancedQuoteParams advancedQuoteParams) {
        java.lang.String chainId = advancedQuoteParams.getChainId();
        java.lang.String strOLrzqt = this.copydefault.OLrzqt(chainId);
        pUU.KWHzl("AdvancedQuoteUseCase", "getQuoteExt: chainId=" + chainId + ", referralCode=" + strOLrzqt);
        if (strOLrzqt.length() <= 0) {
            strOLrzqt = null;
        }
        java.lang.String strCopydefault = this.copydefault.copydefault(chainId);
        return new QuoteExt(strOLrzqt, strCopydefault.length() > 0 ? strCopydefault : null, advancedQuoteParams.getNeedApproveTxInfo(), advancedQuoteParams.getApproveAmount());
    }

    public final C30457lbX KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, C30808liD c30808liD, @NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        return this.KWHzl.KWHzl(v6BaseQuoteResponse, c30808liD, advancedTradeType);
    }

    public final boolean EZpvd(@NotNull C30626leh c30626leh) {
        Intrinsics.checkNotNullParameter(c30626leh, "");
        return c30626leh.values() && C33129mqd.OLrzqt((java.lang.CharSequence) c30626leh.gEmmrt()) && C33129mqd.AhwBna(c30626leh.gEmmrt(), 0);
    }

    public final boolean KWHzl(@NotNull C30626leh c30626leh) {
        Intrinsics.checkNotNullParameter(c30626leh, "");
        return c30626leh.values() && C33129mqd.OLrzqt((java.lang.CharSequence) c30626leh.gEmmrt()) && C33129mqd.AhwBna(c30626leh.gEmmrt(), 0) && C33129mqd.OLrzqt((java.lang.CharSequence) c30626leh.OLrzqt()) && C33129mqd.AhwBna(c30626leh.OLrzqt(), 0);
    }

    public final Flow<Result<AdvancedQuoteAndCallData.V6>> KWHzl(@NotNull C28141kQk c28141kQk) {
        Intrinsics.checkNotNullParameter(c28141kQk, "");
        return FlowKt.transformLatest(this.OLrzqt, new AdvancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1(null, c28141kQk, this));
    }
}
