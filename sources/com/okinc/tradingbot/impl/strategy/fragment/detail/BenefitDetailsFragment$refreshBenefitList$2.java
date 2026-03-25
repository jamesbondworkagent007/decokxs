package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C51046vfd;
import o.C54121wyQ;
import o.C55804xqp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class BenefitDetailsFragment$refreshBenefitList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C54121wyQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitDetailsFragment$refreshBenefitList$2(C54121wyQ c54121wyQ, Continuation<? super BenefitDetailsFragment$refreshBenefitList$2> continuation) {
        super(2, continuation);
        this.this$0 = c54121wyQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenefitDetailsFragment$refreshBenefitList$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenefitDetailsFragment$refreshBenefitList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StrategyDetailsResponse strategyDetailsResponseCopydefault;
        BalanceDetailInfoDto balanceDetails;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C55804xqp<StrategyDetailsResponse> value = this.this$0.valueOf().getNewProxyInstance().getValue();
            if (value != null && (strategyDetailsResponseCopydefault = value.copydefault()) != null && (balanceDetails = strategyDetailsResponseCopydefault.getBalanceDetails()) != null) {
                C51046vfd.Companion.KWHzl().tryEmit(balanceDetails);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
