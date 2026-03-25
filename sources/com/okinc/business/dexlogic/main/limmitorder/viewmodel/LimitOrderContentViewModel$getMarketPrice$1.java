package com.okinc.business.dexlogic.main.limmitorder.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice;
import com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import o.C22495hgT;
import o.C23311hvo;
import o.C24695iig;
import o.C31212lpk;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.gYP;
import o.gYS;
import o.gYX;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderContentViewModel$getMarketPrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ DexMultiTokenInfoBean $fromToken;
    final /* synthetic */ String $referralCode;
    final /* synthetic */ List<String> $sleLiquidLiveData;
    final /* synthetic */ DexMultiTokenInfoBean $toToken;
    final /* synthetic */ String $userWalletAddress;
    int label;
    final /* synthetic */ C22495hgT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderContentViewModel$getMarketPrice$1(C22495hgT c22495hgT, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, List<String> list, String str2, Function0<Unit> function0, Continuation<? super LimitOrderContentViewModel$getMarketPrice$1> continuation) {
        super(2, continuation);
        this.this$0 = c22495hgT;
        this.$fromToken = dexMultiTokenInfoBean;
        this.$toToken = dexMultiTokenInfoBean2;
        this.$userWalletAddress = str;
        this.$sleLiquidLiveData = list;
        this.$referralCode = str2;
        this.$callback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOrderContentViewModel$getMarketPrice$1(this.this$0, this.$fromToken, this.$toToken, this.$userWalletAddress, this.$sleLiquidLiveData, this.$referralCode, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitOrderContentViewModel$getMarketPrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            gYX gyx = this.this$0.getPostValueLengthLimit;
            long jValueOf = C33129mqd.valueOf(this.$fromToken.getChainId());
            String originContractAddress = this.$fromToken.getOriginContractAddress();
            String originContractAddress2 = this.$toToken.getOriginContractAddress();
            String strGHZMYf = Intrinsics.EZpvd((Object) C23311hvo.fmtFiatWithThousandsNoZero$default(this.this$0.gHZMYf(), null, 1, null), (Object) "0") ? null : this.this$0.gHZMYf();
            String str = this.$userWalletAddress;
            List<String> list = this.$sleLiquidLiveData;
            String strJoinToString$default = list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null) : null;
            String str2 = this.$referralCode;
            InterfaceC9738bbJ interfaceC9738bbJHBpjJd = this.this$0.hBpjJd();
            String strDbNXlk = interfaceC9738bbJHBpjJd != null ? interfaceC9738bbJHBpjJd.DbNXlk() : null;
            Flow flowPollByStrategy$default = gYX.pollByStrategy$default(gyx, new gYS.ActionBar(new PairRateParams(jValueOf, originContractAddress, originContractAddress2, strGHZMYf, str, strJoinToString$default, str2, strDbNXlk == null ? "" : strDbNXlk)), 0L, 2, null);
            final C22495hgT c22495hgT = this.this$0;
            final Function0<Unit> function0 = this.$callback;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.dexlogic.main.limmitorder.viewmodel.LimitOrderContentViewModel$getMarketPrice$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(gYP gyp, Continuation<? super Unit> continuation) {
                    LimitMarketPrice.QuoteState quoteState;
                    TradeInputGroup data;
                    ConsumeData<ExchangeRateData> exchangeRateData;
                    ExchangeRateData data2;
                    gYP.TaskDescription taskDescription = gyp instanceof gYP.TaskDescription ? (gYP.TaskDescription) gyp : null;
                    if (taskDescription == null) {
                        return Unit.INSTANCE;
                    }
                    c22495hgT.finit().KWHzl(null);
                    AbstractC43419rot<TokenPairRateQuote, OKServerException> abstractC43419rotEZpvd = taskDescription.EZpvd();
                    boolean z = true;
                    if (abstractC43419rotEZpvd instanceof AbstractC43419rot.StateListAnimator) {
                        AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) abstractC43419rotEZpvd;
                        c22495hgT.djBIcL.setValue(stateListAnimator.KWHzl());
                        c22495hgT.AhwBna.setValue(null);
                        LimitPairRateResponse limitPairRateResponseCopydefault = c22495hgT.copydefault((TokenPairRateQuote) stateListAnimator.KWHzl());
                        LimitMarketPrice.QuoteState value = c22495hgT.QkdxfA().getValue();
                        c22495hgT.finit().copydefault(limitPairRateResponseCopydefault);
                        c22495hgT.OLrzqt.setValue(limitPairRateResponseCopydefault);
                        c22495hgT.DCUTEIdCUTEI();
                        c22495hgT.QkdxfA().setValue(limitPairRateResponseCopydefault.getQuoteState(C24695iig.AEQbTJ(c22495hgT.AxsJAYaxsJAY(), true).OLrzqt()));
                        ConsumeData<TradeInputGroup> value2 = c22495hgT.getPostValueLengthLimit().getValue();
                        if (value2 != null && (data = value2.getData()) != null && (exchangeRateData = data.getExchangeRateData()) != null && (data2 = exchangeRateData.getData()) != null) {
                            C22495hgT c22495hgT2 = c22495hgT;
                            if (c22495hgT2.OHqIaq()) {
                                String changeRate = limitPairRateResponseCopydefault.getChangeRate();
                                if (changeRate == null) {
                                    changeRate = "";
                                }
                                data2.setChangeRate(changeRate);
                                String changeRate2 = limitPairRateResponseCopydefault.getChangeRate();
                                data2.setCustomRate(changeRate2 != null ? changeRate2 : "");
                                c22495hgT2.valueOf();
                            } else {
                                c22495hgT2.aUsmxb().setValue(C56443yFo.KWHzl(true));
                            }
                        }
                        Ref.BooleanRef booleanRef2 = booleanRef;
                        if (!booleanRef2.element) {
                            booleanRef2.element = true;
                            Function0<Unit> function02 = function0;
                            if (function02 != null) {
                                function02.invoke();
                            }
                        }
                        C22495hgT c22495hgT3 = c22495hgT;
                        String changeRate3 = limitPairRateResponseCopydefault.getChangeRate();
                        if (changeRate3 != null && changeRate3.length() != 0) {
                            z = false;
                        }
                        c22495hgT3.KWHzl(z);
                        TradeStep value3 = c22495hgT.zuWLRA().getCurrentStep().getValue();
                        if (value3 != null) {
                            C22495hgT c22495hgT4 = c22495hgT;
                            pUU.KWHzl("getMarketPrice", "currentStep= " + value3);
                            c22495hgT4.zuWLRA().refreshStatePool(value3);
                        }
                        if ((value != LimitMarketPrice.QuoteState.Quoting && (value == LimitMarketPrice.QuoteState.QuoteFail || value == LimitMarketPrice.QuoteState.NoLiquidity || c22495hgT.QkdxfA().getValue() != value)) || c22495hgT.QkdxfA().getValue() == LimitMarketPrice.QuoteState.NoLiquidityAtTheMoment) {
                            c22495hgT.QbewEr().OLrzqt();
                        }
                        c22495hgT.finit().KWHzl(null);
                        c22495hgT.finit().AEQbTJ(null);
                    } else {
                        if (!(abstractC43419rotEZpvd instanceof AbstractC43419rot.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c22495hgT.KWHzl(true);
                        OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rotEZpvd).KWHzl();
                        c22495hgT.djBIcL.setValue(null);
                        c22495hgT.AhwBna.setValue(oKServerException);
                        c22495hgT.finit().KWHzl(C56443yFo.AEQbTJ(oKServerException.getCode()));
                        c22495hgT.finit().AEQbTJ(oKServerException.getMessage());
                        c22495hgT.finit().copydefault(new LimitPairRateResponse((String) null, false, (LimitOrderInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (LimitFeeData) null, (ServiceFeeInfo) null, (DexAutoSlippageInfoParam) null, 0, (Boolean) null, (String) null, (String) null, false, (String) null, (String) null, 524287, (DefaultConstructorMarker) null));
                        MutableLiveData<LimitMarketPrice.QuoteState> mutableLiveDataQkdxfA = c22495hgT.QkdxfA();
                        if (C31212lpk.copydefault.AEQbTJ(oKServerException)) {
                            quoteState = LimitMarketPrice.QuoteState.QuoteHoneyPot;
                        } else {
                            quoteState = LimitMarketPrice.QuoteState.QuoteFail;
                        }
                        mutableLiveDataQkdxfA.setValue(quoteState);
                        c22495hgT.QbewEr().OLrzqt();
                        c22495hgT.DCUTEIdCUTEI();
                        Ref.BooleanRef booleanRef3 = booleanRef;
                        if (!booleanRef3.element) {
                            booleanRef3.element = true;
                            Function0<Unit> function03 = function0;
                            if (function03 != null) {
                                function03.invoke();
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowPollByStrategy$default.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
