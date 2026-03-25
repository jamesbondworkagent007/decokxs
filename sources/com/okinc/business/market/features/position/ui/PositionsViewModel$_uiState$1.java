package com.okinc.business.market.features.position.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C29092knC;
import o.C29095knF;
import o.C29109knT;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel$_uiState$1 extends SuspendLambda implements yHO<C29095knF, C29092knC, Continuation<? super C29109knT>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$_uiState$1(PositionsViewModel positionsViewModel, Continuation<? super PositionsViewModel$_uiState$1> continuation) {
        super(3, continuation);
        this.this$0 = positionsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(C29095knF c29095knF, C29092knC c29092knC, Continuation<? super C29109knT> continuation) {
        PositionsViewModel$_uiState$1 positionsViewModel$_uiState$1 = new PositionsViewModel$_uiState$1(this.this$0, continuation);
        positionsViewModel$_uiState$1.L$0 = c29095knF;
        positionsViewModel$_uiState$1.L$1 = c29092knC;
        return positionsViewModel$_uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.EZpvd((C29095knF) this.L$0, (C29092knC) this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
