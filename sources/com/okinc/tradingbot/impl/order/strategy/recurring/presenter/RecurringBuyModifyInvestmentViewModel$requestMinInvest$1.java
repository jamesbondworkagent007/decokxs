package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel$requestMinInvest$1;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.MinInvestReq;
import com.okinc.unify_trade.biz.MinInvestResp;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56183xxx;
import o.C56391yDq;
import o.C56442yFn;
import o.xKK;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyModifyInvestmentViewModel$requestMinInvest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $investCcy;
    final /* synthetic */ List<CoinRatioParam> $recurringList;
    int label;
    final /* synthetic */ RecurringBuyModifyInvestmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyModifyInvestmentViewModel$requestMinInvest$1(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, String str, List<CoinRatioParam> list, Continuation<? super RecurringBuyModifyInvestmentViewModel$requestMinInvest$1> continuation) {
        super(2, continuation);
        this.this$0 = recurringBuyModifyInvestmentViewModel;
        this.$investCcy = str;
        this.$recurringList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyModifyInvestmentViewModel$requestMinInvest$1(this.this$0, this.$investCcy, this.$recurringList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyModifyInvestmentViewModel$requestMinInvest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C56183xxx c56183xxxSSMYrx = this.this$0.sSMYrx();
            String str = this.$investCcy;
            List<CoinRatioParam> list = this.$recurringList;
            final RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel = this.this$0;
            c56183xxxSSMYrx.AEQbTJ(new MinInvestReq(str, list, str));
            c56183xxxSSMYrx.KWHzl(new Function1() { // from class: o.vUJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return RecurringBuyModifyInvestmentViewModel$requestMinInvest$1.invokeSuspend$lambda$2$lambda$1(recurringBuyModifyInvestmentViewModel, (ResponseData) obj2);
                }
            });
            xKK.Activity.execute$default(c56183xxxSSMYrx, 0L, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, ResponseData responseData) {
        MinInvestResp minInvestResp;
        List list = (List) responseData.getData();
        if (list != null && (minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
            recurringBuyModifyInvestmentViewModel.KWHzl.setValue(minInvestResp);
        }
        return Unit.INSTANCE;
    }
}
