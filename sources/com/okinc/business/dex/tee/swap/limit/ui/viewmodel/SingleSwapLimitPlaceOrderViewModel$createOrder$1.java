package com.okinc.business.dex.tee.swap.limit.ui.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.domain.model.CreateOrderReq;
import com.okinc.business.dex.tee.domain.model.LimitPreset;
import com.okinc.business.dex.tee.domain.model.LimitSourceType;
import com.okinc.business.dex.tee.domain.model.Preset;
import com.okinc.business.dex.tee.domain.model.Rule;
import com.okinc.business.dex.tee.domain.model.StrategyDirection;
import com.okinc.business.dex.tee.domain.model.StrategyType;
import com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams;
import com.okinc.business.dex.tee.swap.limit.ui.viewmodel.SingleSwapLimitPlaceOrderViewModel$createOrder$1;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C19700gMb;
import o.C19745gNt;
import o.C30565ldZ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleSwapLimitPlaceOrderViewModel$createOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ LimitCalResult $calResult;
    final /* synthetic */ CreateOrderReq $createOrderReq;
    final /* synthetic */ boolean $forceManualSign;
    final /* synthetic */ DexMultiTokenInfoBean $fromToken;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback;
    final /* synthetic */ LimitPairRateResponse $quote;
    final /* synthetic */ DexMultiTokenInfoBean $toToken;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SingleSwapLimitPlaceOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSwapLimitPlaceOrderViewModel$createOrder$1(SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, LimitCalResult limitCalResult, CreateOrderReq createOrderReq, LimitPairRateResponse limitPairRateResponse, boolean z, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, Continuation<? super SingleSwapLimitPlaceOrderViewModel$createOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = singleSwapLimitPlaceOrderViewModel;
        this.$fromToken = dexMultiTokenInfoBean;
        this.$toToken = dexMultiTokenInfoBean2;
        this.$calResult = limitCalResult;
        this.$createOrderReq = createOrderReq;
        this.$quote = limitPairRateResponse;
        this.$forceManualSign = z;
        this.$activity = fragmentActivity;
        this.$loadingCallback = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleSwapLimitPlaceOrderViewModel$createOrder$1(this.this$0, this.$fromToken, this.$toToken, this.$calResult, this.$createOrderReq, this.$quote, this.$forceManualSign, this.$activity, this.$loadingCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleSwapLimitPlaceOrderViewModel$createOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0226  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19745gNt c19745gNt = this.this$0.fARcdN;
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.this$0.fIwbmz.KWHzl();
            String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
            String str = strDbNXlk == null ? "" : strDbNXlk;
            String strIsConnected = this.this$0.fIwbmz.isConnected();
            StrategyType strategyType = StrategyType.StrategyLimitOrderClassic;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$fromToken;
            String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
            String str2 = chainId == null ? "" : chainId;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$fromToken;
            String tokenContractAddress = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenContractAddress() : null;
            String str3 = tokenContractAddress == null ? "" : tokenContractAddress;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = this.$toToken;
            String tokenContractAddress2 = dexMultiTokenInfoBean3 != null ? dexMultiTokenInfoBean3.getTokenContractAddress() : null;
            String str4 = tokenContractAddress2 == null ? "" : tokenContractAddress2;
            String fromAmount = this.$calResult.getFromAmount();
            String toAmount = this.$calResult.getToAmount();
            C19700gMb c19700gMb = this.this$0.fIwbmz;
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = this.$fromToken;
            String chainId2 = dexMultiTokenInfoBean4 != null ? dexMultiTokenInfoBean4.getChainId() : null;
            if (chainId2 == null) {
                chainId2 = "";
            }
            String strKWHzl = c19700gMb.KWHzl(chainId2);
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = this.$fromToken;
            String tokenContractAddress3 = dexMultiTokenInfoBean5 != null ? dexMultiTokenInfoBean5.getTokenContractAddress() : null;
            String str5 = tokenContractAddress3 == null ? "" : tokenContractAddress3;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = this.$toToken;
            String tokenContractAddress4 = dexMultiTokenInfoBean6 != null ? dexMultiTokenInfoBean6.getTokenContractAddress() : null;
            Rule rule = new Rule(str5, tokenContractAddress4 == null ? "" : tokenContractAddress4, this.$calResult.getFromAmount(), this.$calResult.getToAmount(), this.$calResult.getExchangeRate(), (String) null, (String) null, 96, (DefaultConstructorMarker) null);
            String slippageType = this.$createOrderReq.getSlippageType();
            String slippageLevel = this.$createOrderReq.getSlippageLevel();
            String slippageValue = this.$createOrderReq.getSlippageValue();
            String dynamicMaxSlippageValue = this.$createOrderReq.getDynamicMaxSlippageValue();
            String limitOrderFeeLevel = this.$createOrderReq.getLimitOrderFeeLevel();
            String limitOrderFeeValue = this.$createOrderReq.getLimitOrderFeeValue();
            List<String> dexIds = this.$createOrderReq.getDexIds();
            LimitPreset limitPreset = new LimitPreset((String) null, new Preset(slippageType, slippageLevel, slippageValue, dynamicMaxSlippageValue, this.$createOrderReq.getRouterModeType(), (String) null, (String) null, limitOrderFeeLevel, limitOrderFeeValue, dexIds != null ? CollectionsKt___CollectionsKt.joinToString$default(dexIds, ",", null, null, 0, null, null, 62, null) : null, 96, (DefaultConstructorMarker) null), (Preset) null, 5, (DefaultConstructorMarker) null);
            String estimateGasFee = this.$quote.getEstimateGasFee();
            int value = StrategyDirection.SWAP.getValue();
            int value2 = LimitSourceType.SWAP.getValue();
            String expireTime = this.$createOrderReq.getExpireTime();
            ServiceFeeInfo serviceFeeInfo = this.$quote.getServiceFeeInfo();
            DexMultiTokenInfoBean dexMultiTokenInfoBean7 = this.$fromToken;
            String decimals = dexMultiTokenInfoBean7 != null ? dexMultiTokenInfoBean7.getDecimals() : null;
            String str6 = decimals == null ? "" : decimals;
            DexMultiTokenInfoBean dexMultiTokenInfoBean8 = this.$toToken;
            String decimals2 = dexMultiTokenInfoBean8 != null ? dexMultiTokenInfoBean8.getDecimals() : null;
            TeeLimitPlaceOrderParams teeLimitPlaceOrderParams = new TeeLimitPlaceOrderParams(str, strIsConnected, strategyType, str2, str3, str4, fromAmount, toAmount, strKWHzl, rule, limitPreset, (String) null, value2, C56443yFo.AEQbTJ(value), (String) null, expireTime, serviceFeeInfo, str6, decimals2 == null ? "" : decimals2, estimateGasFee, this.$calResult.getMinimumReceived(), this.$createOrderReq.isCustomExpireTime(), (String) null, this.this$0.AhwBna.KWHzl(this.$forceManualSign, true, this.$quote.isAutoConfirmQuotaRemaining()), 4212736, (DefaultConstructorMarker) null);
            FragmentActivity fragmentActivity = this.$activity;
            InterfaceC9740bbL.TaskDescription taskDescription = this.$loadingCallback;
            this.label = 1;
            objKWHzl = c19745gNt.KWHzl(teeLimitPlaceOrderParams, fragmentActivity, taskDescription, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                singleSwapLimitPlaceOrderViewModel = (SingleSwapLimitPlaceOrderViewModel) this.L$1;
                objKWHzl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                singleSwapLimitPlaceOrderViewModel.AkhnZx.EZpvd();
                final SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel2 = this.this$0;
                final LimitCalResult limitCalResult = this.$calResult;
                final CreateOrderReq createOrderReq = this.$createOrderReq;
                final LimitPairRateResponse limitPairRateResponse = this.$quote;
                final FragmentActivity fragmentActivity2 = this.$activity;
                final InterfaceC9740bbL.TaskDescription taskDescription2 = this.$loadingCallback;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                    singleSwapLimitPlaceOrderViewModel2.KWHzl.setValue(C56443yFo.KWHzl(false));
                    pUU.KWHzl("SingleSwapLimitPlaceOrderViewModel", "createOrder failure, entering retry handler");
                    OrderRetryHelper.handleErrorWithRetry$default(singleSwapLimitPlaceOrderViewModel2.AkhnZx, thM7380exceptionOrNullimpl, new Function1() { // from class: o.gNC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return SingleSwapLimitPlaceOrderViewModel$createOrder$1.invokeSuspend$lambda$3$lambda$1(singleSwapLimitPlaceOrderViewModel2, limitCalResult, createOrderReq, limitPairRateResponse, fragmentActivity2, taskDescription2, ((java.lang.Boolean) obj2).booleanValue());
                        }
                    }, new Function1() { // from class: o.gNK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return SingleSwapLimitPlaceOrderViewModel$createOrder$1.invokeSuspend$lambda$3$lambda$2(singleSwapLimitPlaceOrderViewModel2, (java.lang.Throwable) obj2);
                        }
                    }, "RETRY -> createOrder failed", null, 16, null);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            pUU.KWHzl("SingleSwapLimitPlaceOrderViewModel", "createOrder success");
            singleSwapLimitPlaceOrderViewModel3.KWHzl.setValue(C56443yFo.KWHzl(false));
            MutableSharedFlow mutableSharedFlow = singleSwapLimitPlaceOrderViewModel3.OLrzqt;
            this.L$0 = objKWHzl;
            this.L$1 = singleSwapLimitPlaceOrderViewModel3;
            this.label = 2;
            if (mutableSharedFlow.emit((LimitOrderDetailBean) objKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            singleSwapLimitPlaceOrderViewModel = singleSwapLimitPlaceOrderViewModel3;
            singleSwapLimitPlaceOrderViewModel.AkhnZx.EZpvd();
        }
        final SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel22 = this.this$0;
        final LimitCalResult limitCalResult2 = this.$calResult;
        final CreateOrderReq createOrderReq2 = this.$createOrderReq;
        final LimitPairRateResponse limitPairRateResponse2 = this.$quote;
        final FragmentActivity fragmentActivity22 = this.$activity;
        final InterfaceC9740bbL.TaskDescription taskDescription22 = this.$loadingCallback;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel, LimitCalResult limitCalResult, CreateOrderReq createOrderReq, LimitPairRateResponse limitPairRateResponse, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z) {
        pUU.KWHzl("SingleSwapLimitPlaceOrderViewModel", "createOrder retryAction invoked, forceManualSign=" + z);
        singleSwapLimitPlaceOrderViewModel.EZpvd(limitCalResult, createOrderReq, limitPairRateResponse, fragmentActivity, taskDescription, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel, Throwable th) {
        pUU.copydefault("SingleSwapLimitPlaceOrderViewModel", "createOrder non JWT code = " + C30565ldZ.EZpvd(th));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(singleSwapLimitPlaceOrderViewModel), null, null, new SingleSwapLimitPlaceOrderViewModel$createOrder$1$2$2$1(singleSwapLimitPlaceOrderViewModel, th, null), 3, null);
        return Unit.INSTANCE;
    }
}
