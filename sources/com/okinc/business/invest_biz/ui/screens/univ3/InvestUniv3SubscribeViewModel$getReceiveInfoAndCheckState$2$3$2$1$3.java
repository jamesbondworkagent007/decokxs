package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25480ixX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2$3$2$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2$3$2$1$3(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, Continuation<? super InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2$3$2$1$3> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2$3$2$1$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2$3$2$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String coinAmount;
        String coinAmount2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestTokenWithAmount fieldNames = this.this$0.getFieldNames();
            if (fieldNames != null) {
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel = this.this$0;
                MutableStateFlow<C25480ixX> mutableStateFlowAwvSrB = investUniv3SubscribeViewModel.AwvSrB();
                String coinAmount3 = fieldNames.getCoinAmount();
                String tokenSymbol = fieldNames.getTokenSymbol();
                String currencyAmount = fieldNames.getCurrencyAmount();
                String tokenLogo = fieldNames.getTokenLogo();
                InvestTokenWithAmount investTokenWithAmountGasjUx = investUniv3SubscribeViewModel.gasjUx();
                String str = (investTokenWithAmountGasjUx == null || (coinAmount = investTokenWithAmountGasjUx.getCoinAmount()) == null) ? "0" : coinAmount;
                boolean zIsBaseToken = fieldNames.isBaseToken();
                InvestTokenWithAmount investTokenWithAmountGasjUx2 = investUniv3SubscribeViewModel.gasjUx();
                boolean zKWHzl = investUniv3SubscribeViewModel.KWHzl(zIsBaseToken, C33129mqd.subS$default(investTokenWithAmountGasjUx2 != null ? investTokenWithAmountGasjUx2.getCoinAmount() : null, fieldNames.getCoinAmount(), null, null, null, 14, null));
                InvestTokenWithAmount investTokenWithAmountGasjUx3 = investUniv3SubscribeViewModel.gasjUx();
                C25480ixX c25480ixX = new C25480ixX(coinAmount3, tokenSymbol, tokenLogo, currencyAmount, C33129mqd.gEmmrt(investTokenWithAmountGasjUx3 != null ? investTokenWithAmountGasjUx3.getCoinAmount() : null, fieldNames.getCoinAmount()), zKWHzl, false, false, false, null, C33129mqd.AhwBna(fieldNames.getTokenPrecision()), str, false, 5056, null);
                this.label = 1;
                if (mutableStateFlowAwvSrB.emit(c25480ixX, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InvestTokenWithAmount investTokenWithAmountRcXXUw = this.this$0.RcXXUw();
        if (investTokenWithAmountRcXXUw != null) {
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel2 = this.this$0;
            MutableStateFlow<C25480ixX> mutableStateFlowZuBGHE = investUniv3SubscribeViewModel2.zuBGHE();
            String coinAmount4 = investTokenWithAmountRcXXUw.getCoinAmount();
            String tokenSymbol2 = investTokenWithAmountRcXXUw.getTokenSymbol();
            String currencyAmount2 = investTokenWithAmountRcXXUw.getCurrencyAmount();
            String tokenLogo2 = investTokenWithAmountRcXXUw.getTokenLogo();
            InvestTokenWithAmount investTokenWithAmountFlVtFt = investUniv3SubscribeViewModel2.flVtFt();
            String str2 = (investTokenWithAmountFlVtFt == null || (coinAmount2 = investTokenWithAmountFlVtFt.getCoinAmount()) == null) ? "0" : coinAmount2;
            boolean zIsBaseToken2 = investTokenWithAmountRcXXUw.isBaseToken();
            InvestTokenWithAmount investTokenWithAmountFlVtFt2 = investUniv3SubscribeViewModel2.flVtFt();
            boolean zKWHzl2 = investUniv3SubscribeViewModel2.KWHzl(zIsBaseToken2, C33129mqd.subS$default(investTokenWithAmountFlVtFt2 != null ? investTokenWithAmountFlVtFt2.getCoinAmount() : null, investTokenWithAmountRcXXUw.getCoinAmount(), null, null, null, 14, null));
            InvestTokenWithAmount investTokenWithAmountFlVtFt3 = investUniv3SubscribeViewModel2.flVtFt();
            C25480ixX c25480ixX2 = new C25480ixX(coinAmount4, tokenSymbol2, tokenLogo2, currencyAmount2, C33129mqd.gEmmrt(investTokenWithAmountFlVtFt3 != null ? investTokenWithAmountFlVtFt3.getCoinAmount() : null, investTokenWithAmountRcXXUw.getCoinAmount()), zKWHzl2, false, false, false, null, C33129mqd.AhwBna(investTokenWithAmountRcXXUw.getTokenPrecision()), str2, false, 5056, null);
            this.label = 2;
            if (mutableStateFlowZuBGHE.emit(c25480ixX2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
