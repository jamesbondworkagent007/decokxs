package com.okinc.business.dex.tee.swap.limit.ui.viewmodel;

import com.okinc.business.dex.trade.order.domain.model.BoostInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C19757gOe;
import o.C19758gOf;
import o.C30457lbX;
import o.C30516lcd;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleSwapLimitPlaceOrderViewModel$fetchAndAddBoostData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LimitCalResult $calResult;
    final /* synthetic */ LimitPairRateResponse $quote;
    int label;
    final /* synthetic */ SingleSwapLimitPlaceOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSwapLimitPlaceOrderViewModel$fetchAndAddBoostData$1(LimitPairRateResponse limitPairRateResponse, LimitCalResult limitCalResult, SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel, Continuation<? super SingleSwapLimitPlaceOrderViewModel$fetchAndAddBoostData$1> continuation) {
        super(2, continuation);
        this.$quote = limitPairRateResponse;
        this.$calResult = limitCalResult;
        this.this$0 = singleSwapLimitPlaceOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleSwapLimitPlaceOrderViewModel$fetchAndAddBoostData$1(this.$quote, this.$calResult, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleSwapLimitPlaceOrderViewModel$fetchAndAddBoostData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BoostInfo boostInfo;
        DexMultiTokenInfoBean fromToken;
        String fromAmount;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LimitOrderInfo limitOrderInfo = this.$quote.getLimitOrderInfo();
                if (limitOrderInfo != null && (fromToken = limitOrderInfo.getFromToken()) != null) {
                    DexMultiTokenInfoBean toToken = this.$quote.getLimitOrderInfo().getToToken();
                    if (toToken == null) {
                        return Unit.INSTANCE;
                    }
                    int iAhwBna = C33129mqd.AhwBna(fromToken.getChainId());
                    String originContractAddress = fromToken.getOriginContractAddress();
                    String originContractAddress2 = toToken.getOriginContractAddress();
                    LimitCalResult limitCalResult = this.$calResult;
                    if (limitCalResult != null && (fromAmount = limitCalResult.getFromAmount()) != null) {
                        String minimumReceived = this.$calResult.getMinimumReceived();
                        ServiceFeeInfo serviceFeeInfo = this.$quote.getServiceFeeInfo();
                        C19757gOe c19757gOe = this.this$0.valueOf;
                        this.label = 1;
                        Object objAEQbTJ = c19757gOe.AEQbTJ(iAhwBna, originContractAddress, originContractAddress2, fromAmount, minimumReceived, serviceFeeInfo, this);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        objM7386unboximpl = objAEQbTJ;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            boostInfo = (BoostInfo) objM7386unboximpl;
        } catch (Exception e) {
            pUU.AEQbTJ("SingleSwapLimitPlaceOrderViewModel", "Failed to fetch boost data", e);
            boostInfo = null;
        }
        C30516lcd c30516lcdCopydefault = C19758gOf.AEQbTJ.copydefault(boostInfo != null ? boostInfo.getBoostVolume() : null, C33129mqd.gEmmrt(boostInfo != null ? boostInfo.getWeighted() : null));
        C30457lbX c30457lbX = (C30457lbX) this.this$0.EZpvd.getValue();
        List<C30516lcd> listEZpvd = c30457lbX.EZpvd();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listEZpvd) {
            if (((C30516lcd) obj2).OLrzqt() != ConfirmOrderTag.BOOST) {
                arrayList.add(obj2);
            }
        }
        this.this$0.EZpvd.setValue(c30457lbX.copydefault((8159 & 1) != 0 ? c30457lbX.EZpvd : null, (8159 & 2) != 0 ? c30457lbX.OLrzqt : null, (8159 & 4) != 0 ? c30457lbX.AYXKKw : null, (8159 & 8) != 0 ? c30457lbX.DbNXlk : null, (8159 & 16) != 0 ? c30457lbX.djBIcL : null, (8159 & 32) != 0 ? c30457lbX.AEQbTJ : CollectionsKt___CollectionsKt.copydefault((Collection<? extends C30516lcd>) arrayList, c30516lcdCopydefault), (8159 & 64) != 0 ? c30457lbX.fetchVPNInfo : null, (8159 & 128) != 0 ? c30457lbX.KWHzl : null, (8159 & 256) != 0 ? c30457lbX.gEmmrt : null, (8159 & 512) != 0 ? c30457lbX.AhwBna : null, (8159 & 1024) != 0 ? c30457lbX.copydefault : null, (8159 & 2048) != 0 ? c30457lbX.values : null, (8159 & 4096) != 0 ? c30457lbX.valueOf : null));
        return Unit.INSTANCE;
    }
}
