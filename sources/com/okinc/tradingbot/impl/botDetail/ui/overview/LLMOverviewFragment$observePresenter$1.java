package com.okinc.tradingbot.impl.botDetail.ui.overview;

import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C48227uJr;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class LLMOverviewFragment$observePresenter$1 extends SuspendLambda implements Function2<TacticsData, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48227uJr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLMOverviewFragment$observePresenter$1(C48227uJr c48227uJr, Continuation<? super LLMOverviewFragment$observePresenter$1> continuation) {
        super(2, continuation);
        this.this$0 = c48227uJr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LLMOverviewFragment$observePresenter$1 lLMOverviewFragment$observePresenter$1 = new LLMOverviewFragment$observePresenter$1(this.this$0, continuation);
        lLMOverviewFragment$observePresenter$1.L$0 = obj;
        return lLMOverviewFragment$observePresenter$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TacticsData tacticsData, Continuation<? super Unit> continuation) {
        return ((LLMOverviewFragment$observePresenter$1) create(tacticsData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TacticsData tacticsData = (TacticsData) this.L$0;
            if (tacticsData != null) {
                this.this$0.AEQbTJ(tacticsData);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
