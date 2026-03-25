package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.ItemData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C54121wyQ;
import o.C55804xqp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class BenefitDetailsFragment$refreshBenefitList$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<BenefitDetails> $benefitDetails;
    final /* synthetic */ C55804xqp<StrategyDetailsResponse> $it;
    final /* synthetic */ Ref.ObjectRef<List<ItemData>> $refreshList;
    int label;
    final /* synthetic */ C54121wyQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitDetailsFragment$refreshBenefitList$1$1$1(Ref.ObjectRef<BenefitDetails> objectRef, C54121wyQ c54121wyQ, C55804xqp<StrategyDetailsResponse> c55804xqp, Ref.ObjectRef<List<ItemData>> objectRef2, Continuation<? super BenefitDetailsFragment$refreshBenefitList$1$1$1> continuation) {
        super(2, continuation);
        this.$benefitDetails = objectRef;
        this.this$0 = c54121wyQ;
        this.$it = c55804xqp;
        this.$refreshList = objectRef2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenefitDetailsFragment$refreshBenefitList$1$1$1(this.$benefitDetails, this.this$0, this.$it, this.$refreshList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenefitDetailsFragment$refreshBenefitList$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.okinc.unify_trade.bot.data.BenefitDetails] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$benefitDetails.element = this.this$0.dxcTrN().copydefault(this.$it);
            this.$refreshList.element = this.this$0.dxcTrN().KWHzl(this.$benefitDetails.element);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
