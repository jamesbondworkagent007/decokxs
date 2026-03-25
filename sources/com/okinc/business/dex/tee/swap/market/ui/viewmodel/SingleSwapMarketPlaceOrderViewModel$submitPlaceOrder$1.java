package com.okinc.business.dex.tee.swap.market.ui.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.domain.model.PlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.model.StrategyType;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.TpslConfig;
import com.okinc.business.dex.tee.swap.market.ui.viewmodel.SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TradeMode;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC22421hez;
import o.AbstractC28108kPe;
import o.C19750gNy;
import o.C22340hdX;
import o.C28109kPf;
import o.C28110kPg;
import o.C30565ldZ;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ boolean $forceManualSign;
    final /* synthetic */ boolean $isOpenMev;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback;
    final /* synthetic */ PlaceOrderParams $placeOrderParams;
    final /* synthetic */ QuotePriceRes $quotePriceRes;
    final /* synthetic */ String $routerModeType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SingleSwapMarketPlaceOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1(QuotePriceRes quotePriceRes, SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel, boolean z, PlaceOrderParams placeOrderParams, String str, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z2, Continuation<? super SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1> continuation) {
        super(2, continuation);
        this.$quotePriceRes = quotePriceRes;
        this.this$0 = singleSwapMarketPlaceOrderViewModel;
        this.$isOpenMev = z;
        this.$placeOrderParams = placeOrderParams;
        this.$routerModeType = str;
        this.$activity = fragmentActivity;
        this.$loadingCallback = taskDescription;
        this.$forceManualSign = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1(this.$quotePriceRes, this.this$0, this.$isOpenMev, this.$placeOrderParams, this.$routerModeType, this.$activity, this.$loadingCallback, this.$forceManualSign, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0258  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        List<MevInfoBean> mev;
        MevInfoBean mevInfoBeanKWHzl;
        SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = this.$quotePriceRes.fromToken();
            DexMultiTokenInfoBean token = this.$quotePriceRes.toToken();
            String chainId = dexMultiTokenInfoBeanFromToken.getChainId();
            SwapPriorityFeeInfo priorityFeeInfo = this.$quotePriceRes.getPriorityFeeInfo();
            MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsOLrzqt = this.this$0.OLrzqt(chainId, this.$isOpenMev, priorityFeeInfo == null ? new SwapPriorityFeeInfo((List) null, (NonMevPriorityFeeInfo) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : priorityFeeInfo, this.$quotePriceRes);
            C19750gNy c19750gNy = this.this$0.hDKMBd;
            String strIsConnected = this.this$0.getNewProxyInstance.isConnected();
            String strKWHzl = this.this$0.getNewProxyInstance.KWHzl(chainId);
            StrategyType strategyType = StrategyType.StrategySwap;
            String maxSlippage = this.$placeOrderParams.getMaxSlippage();
            String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.AEQbTJ(marketTransactionFeeCacheParamsOLrzqt.AEQbTJ().getValue()));
            String strEZpvd = marketTransactionFeeCacheParamsOLrzqt.EZpvd();
            String strAEQbTJ = this.this$0.AEQbTJ(chainId, this.$isOpenMev, priorityFeeInfo);
            String gasUsed = this.$placeOrderParams.getGasUsed();
            ServiceFeeInfo serviceFeeInfo = this.$quotePriceRes.getServiceFeeInfo();
            TradeMode tradeMode = TradeMode.SwapMode;
            TraceData traceData = this.$quotePriceRes.getTraceData();
            String chainName = dexMultiTokenInfoBeanFromToken.getChainName();
            String tokenContractAddress = dexMultiTokenInfoBeanFromToken.getTokenContractAddress();
            String tokenContractAddress2 = token.getTokenContractAddress();
            String strPayAmount = this.$quotePriceRes.payAmount();
            String slippageType = this.$placeOrderParams.getSlippageType();
            String slippage = this.$placeOrderParams.getSlippage();
            String strKWHzl2 = this.this$0.getNewProxyInstance.KWHzl(chainId);
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.this$0.getNewProxyInstance.KWHzl();
            String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
            String str = strDbNXlk == null ? "" : strDbNXlk;
            String strReceiveAmount = this.$quotePriceRes.receiveAmount();
            List listDexRouterList = this.$quotePriceRes.dexRouterList();
            if (listDexRouterList == null) {
                listDexRouterList = yDY.AhwBna();
            }
            List list = listDexRouterList;
            String teeSignMarketRelTs = this.$quotePriceRes.getCommonDexInfo().getTeeSignMarketRelTs();
            String decimals = dexMultiTokenInfoBeanFromToken.getDecimals();
            String decimals2 = token.getDecimals();
            String strMinimumReceived = this.$quotePriceRes.minimumReceived();
            String name = this.$isOpenMev ? (priorityFeeInfo == null || (mev = priorityFeeInfo.getMev()) == null || (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) == null) ? null : mevInfoBeanKWHzl.getName() : "";
            DeFiPlatformForSwap selectedDeFiPlatform = this.$quotePriceRes.getSelectedDeFiPlatform();
            String quoteId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getQuoteId() : null;
            TeeMarketPlaceOrderParams teeMarketPlaceOrderParams = new TeeMarketPlaceOrderParams(strIsConnected, strKWHzl, strategyType, maxSlippage, strGEmmrt, strEZpvd, this.$routerModeType, (TpslConfig) null, AbstractC22421hez.StateListAnimator.OLrzqt.EZpvd(), strAEQbTJ, (Boolean) null, gasUsed, name, serviceFeeInfo, tradeMode, traceData, (String) null, chainId, chainName, "swap", tokenContractAddress, tokenContractAddress2, strPayAmount, slippageType, slippage, strKWHzl2, str, strReceiveAmount, list, teeSignMarketRelTs, decimals, decimals2, strMinimumReceived, quoteId == null ? "" : quoteId, this.$placeOrderParams.getRefParam(), this.$quotePriceRes.isOKXPlatform(), this.$quotePriceRes.isAutoConfirmQuotaRemaining(), 66560, 0, (DefaultConstructorMarker) null);
            FragmentActivity fragmentActivity = this.$activity;
            InterfaceC9740bbL.TaskDescription taskDescription = this.$loadingCallback;
            boolean zKWHzl = this.this$0.gEmmrt.KWHzl(this.$forceManualSign, this.$quotePriceRes.isOKXPlatform(), this.$quotePriceRes.isAutoConfirmQuotaRemaining());
            this.L$0 = dexMultiTokenInfoBeanFromToken;
            this.label = 1;
            Object objAEQbTJ = c19750gNy.AEQbTJ(teeMarketPlaceOrderParams, fragmentActivity, taskDescription, zKWHzl, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objAEQbTJ;
            dexMultiTokenInfoBean = dexMultiTokenInfoBeanFromToken;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                singleSwapMarketPlaceOrderViewModel = (SingleSwapMarketPlaceOrderViewModel) this.L$1;
                objM7386unboximpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                singleSwapMarketPlaceOrderViewModel.ejfBZ.EZpvd();
                final SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel2 = this.this$0;
                final boolean z = this.$isOpenMev;
                final String str2 = this.$routerModeType;
                final PlaceOrderParams placeOrderParams = this.$placeOrderParams;
                final QuotePriceRes quotePriceRes = this.$quotePriceRes;
                final FragmentActivity fragmentActivity2 = this.$activity;
                final InterfaceC9740bbL.TaskDescription taskDescription2 = this.$loadingCallback;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    singleSwapMarketPlaceOrderViewModel2.copydefault.setValue(C56443yFo.KWHzl(false));
                    pUU.KWHzl("SingleSwapMarketPlaceOrderViewModel", "submitPlaceOrder failure, entering retry handler");
                    OrderRetryHelper.handleErrorWithRetry$default(singleSwapMarketPlaceOrderViewModel2.ejfBZ, thM7380exceptionOrNullimpl, new Function1() { // from class: o.gNU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1.invokeSuspend$lambda$3$lambda$1(singleSwapMarketPlaceOrderViewModel2, z, str2, placeOrderParams, quotePriceRes, fragmentActivity2, taskDescription2, ((java.lang.Boolean) obj2).booleanValue());
                        }
                    }, new Function1() { // from class: o.gNT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1.invokeSuspend$lambda$3$lambda$2(singleSwapMarketPlaceOrderViewModel2, (java.lang.Throwable) obj2);
                        }
                    }, "RETRY -> submitPlaceOrder failed", null, 16, null);
                }
                return Unit.INSTANCE;
            }
            dexMultiTokenInfoBean = (DexMultiTokenInfoBean) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        QuotePriceRes quotePriceRes2 = this.$quotePriceRes;
        SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            SignAndBroadcastRes signAndBroadcastRes = (SignAndBroadcastRes) objM7386unboximpl;
            pUU.KWHzl("SingleSwapMarketPlaceOrderViewModel", "submitPlaceOrder success");
            C28110kPg c28110kPg = C28110kPg.KWHzl;
            String chainId2 = dexMultiTokenInfoBean.getChainId();
            String chainName2 = dexMultiTokenInfoBean.getChainName();
            TraceData traceData2 = quotePriceRes2.getTraceData();
            String quoteId2 = traceData2 != null ? traceData2.getQuoteId() : null;
            C28109kPf c28109kPf = new C28109kPf(chainId2, chainName2, "swap", "swap", quoteId2 == null ? "" : quoteId2, singleSwapMarketPlaceOrderViewModel3.EZpvd(dexMultiTokenInfoBean.getChainId()));
            OrderDetailBean marketOrderDetail = signAndBroadcastRes.getMarketOrderDetail();
            String transactionHash = marketOrderDetail != null ? marketOrderDetail.getTransactionHash() : null;
            c28110kPg.copydefault(new AbstractC28108kPe.Activity(c28109kPf, transactionHash != null ? transactionHash : ""));
            singleSwapMarketPlaceOrderViewModel3.copydefault.setValue(C56443yFo.KWHzl(false));
            MutableSharedFlow mutableSharedFlow = singleSwapMarketPlaceOrderViewModel3.djBIcL;
            this.L$0 = objM7386unboximpl;
            this.L$1 = singleSwapMarketPlaceOrderViewModel3;
            this.label = 2;
            if (mutableSharedFlow.emit(signAndBroadcastRes, this) == objCopydefault) {
                return objCopydefault;
            }
            singleSwapMarketPlaceOrderViewModel = singleSwapMarketPlaceOrderViewModel3;
            singleSwapMarketPlaceOrderViewModel.ejfBZ.EZpvd();
        }
        final SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel22 = this.this$0;
        final boolean z2 = this.$isOpenMev;
        final String str22 = this.$routerModeType;
        final PlaceOrderParams placeOrderParams2 = this.$placeOrderParams;
        final QuotePriceRes quotePriceRes3 = this.$quotePriceRes;
        final FragmentActivity fragmentActivity22 = this.$activity;
        final InterfaceC9740bbL.TaskDescription taskDescription22 = this.$loadingCallback;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel, boolean z, String str, PlaceOrderParams placeOrderParams, QuotePriceRes quotePriceRes, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z2) {
        pUU.KWHzl("SingleSwapMarketPlaceOrderViewModel", "submitPlaceOrder retryAction invoked, forceManualSign=" + z2);
        singleSwapMarketPlaceOrderViewModel.KWHzl(z, str, placeOrderParams, quotePriceRes, fragmentActivity, taskDescription, z2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel, Throwable th) {
        pUU.copydefault("SingleSwapMarketPlaceOrderViewModel", "submitPlaceOrder non JWT code = " + C30565ldZ.EZpvd(th));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(singleSwapMarketPlaceOrderViewModel), null, null, new SingleSwapMarketPlaceOrderViewModel$submitPlaceOrder$1$2$2$1(singleSwapMarketPlaceOrderViewModel, th, null), 3, null);
        return Unit.INSTANCE;
    }
}
