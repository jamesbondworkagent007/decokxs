package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel$subscribeCopyTradeCount$2 extends SuspendLambda implements yHO<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isSuccess;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardViewModel$subscribeCopyTradeCount$2(Ref.BooleanRef booleanRef, Continuation<? super LeaderBoardViewModel$subscribeCopyTradeCount$2> continuation) {
        super(3, continuation);
        this.$isSuccess = booleanRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new LeaderBoardViewModel$subscribeCopyTradeCount$2(this.$isSuccess, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.$isSuccess.element = false;
        return Unit.INSTANCE;
    }
}
