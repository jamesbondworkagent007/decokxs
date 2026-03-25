package com.okinc.business.dex.tee.swap.market.ui.viewmodel;

import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
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
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleSwapMarketPlaceOrderViewModel$fetchAndAddBoostData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QuotePriceRes $quote;
    int label;
    final /* synthetic */ SingleSwapMarketPlaceOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSwapMarketPlaceOrderViewModel$fetchAndAddBoostData$1(QuotePriceRes quotePriceRes, SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModel, Continuation<? super SingleSwapMarketPlaceOrderViewModel$fetchAndAddBoostData$1> continuation) {
        super(2, continuation);
        this.$quote = quotePriceRes;
        this.this$0 = singleSwapMarketPlaceOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleSwapMarketPlaceOrderViewModel$fetchAndAddBoostData$1(this.$quote, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleSwapMarketPlaceOrderViewModel$fetchAndAddBoostData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BoostEstimateVolumeResponse boostEstimateVolumeResponse;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            } else {
                C56391yDq.AEQbTJ(obj);
                DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = this.$quote.fromToken();
                DexMultiTokenInfoBean token = this.$quote.toToken();
                String chainId = dexMultiTokenInfoBeanFromToken.getChainId();
                int iAhwBna = C33129mqd.AhwBna(chainId);
                String originContractAddress = dexMultiTokenInfoBeanFromToken.getOriginContractAddress();
                String originContractAddress2 = token.getOriginContractAddress();
                String fromTokenAmount = this.$quote.getCommonDexInfo().getFromTokenAmount();
                String strMinimumReceived = this.$quote.minimumReceived();
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.AEQbTJ(TradeMode.SwapMode.getType()));
                String strKWHzl = this.this$0.getNewProxyInstance.KWHzl(chainId);
                String strOLrzqt = this.this$0.zsXlph.OLrzqt(chainId);
                C19757gOe c19757gOe = this.this$0.fetchVPNInfo;
                this.label = 1;
                Object objAEQbTJ = c19757gOe.AEQbTJ(iAhwBna, originContractAddress, originContractAddress2, fromTokenAmount, strMinimumReceived, strGEmmrt, strKWHzl, strOLrzqt, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objAEQbTJ;
            }
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            boostEstimateVolumeResponse = (BoostEstimateVolumeResponse) objM7386unboximpl;
        } catch (Exception e) {
            pUU.AEQbTJ("SingleSwapMarketPlaceOrderViewModel", "Failed to fetch boost data", e);
            boostEstimateVolumeResponse = null;
        }
        C30516lcd c30516lcdCopydefault = C19758gOf.AEQbTJ.copydefault(boostEstimateVolumeResponse != null ? boostEstimateVolumeResponse.getBoostVolume() : null, boostEstimateVolumeResponse != null ? boostEstimateVolumeResponse.getBoostWeight() : null);
        C30457lbX c30457lbX = (C30457lbX) this.this$0.KWHzl.getValue();
        List<C30516lcd> listEZpvd = c30457lbX.EZpvd();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listEZpvd) {
            if (((C30516lcd) obj2).OLrzqt() != ConfirmOrderTag.BOOST) {
                arrayList.add(obj2);
            }
        }
        this.this$0.KWHzl.setValue(c30457lbX.copydefault((8159 & 1) != 0 ? c30457lbX.EZpvd : null, (8159 & 2) != 0 ? c30457lbX.OLrzqt : null, (8159 & 4) != 0 ? c30457lbX.AYXKKw : null, (8159 & 8) != 0 ? c30457lbX.DbNXlk : null, (8159 & 16) != 0 ? c30457lbX.djBIcL : null, (8159 & 32) != 0 ? c30457lbX.AEQbTJ : CollectionsKt___CollectionsKt.copydefault((Collection<? extends C30516lcd>) arrayList, c30516lcdCopydefault), (8159 & 64) != 0 ? c30457lbX.fetchVPNInfo : null, (8159 & 128) != 0 ? c30457lbX.KWHzl : null, (8159 & 256) != 0 ? c30457lbX.gEmmrt : null, (8159 & 512) != 0 ? c30457lbX.AhwBna : null, (8159 & 1024) != 0 ? c30457lbX.copydefault : null, (8159 & 2048) != 0 ? c30457lbX.values : null, (8159 & 4096) != 0 ? c30457lbX.valueOf : null));
        return Unit.INSTANCE;
    }
}
