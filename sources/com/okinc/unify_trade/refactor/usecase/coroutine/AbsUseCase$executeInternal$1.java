package com.okinc.unify_trade.refactor.usecase.coroutine;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.xKQ;

/* JADX INFO: loaded from: classes12.dex */
public final class AbsUseCase$executeInternal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delay;
    final /* synthetic */ boolean $isFlowData;
    int label;
    final /* synthetic */ xKQ<Resp> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsUseCase$executeInternal$1(xKQ<Resp> xkq, long j, boolean z, Continuation<? super AbsUseCase$executeInternal$1> continuation) {
        super(2, continuation);
        this.this$0 = xkq;
        this.$delay = j;
        this.$isFlowData = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AbsUseCase$executeInternal$1(this.this$0, this.$delay, this.$isFlowData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AbsUseCase$executeInternal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("AbsUseCaseCoroutine", this.this$0.bB_() + " request start(delay: " + this.$delay + "), please wait");
            long j = this.$delay;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
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
        xKQ<Resp> xkq = this.this$0;
        boolean z = this.$isFlowData;
        this.label = 2;
        if (xkq.KWHzl(z, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
