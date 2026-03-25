package com.okinc.tradingbot.impl.signalClone.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C48158uHc;
import o.C53826wsn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalCloneViewModel$fetchParameter$1$balanceResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C48158uHc.Activity>, Object> {
    final /* synthetic */ C53826wsn.StateListAnimator.TaskDescription $action;
    int label;
    final /* synthetic */ C53826wsn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneViewModel$fetchParameter$1$balanceResult$1(C53826wsn c53826wsn, C53826wsn.StateListAnimator.TaskDescription taskDescription, Continuation<? super SignalCloneViewModel$fetchParameter$1$balanceResult$1> continuation) {
        super(2, continuation);
        this.this$0 = c53826wsn;
        this.$action = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalCloneViewModel$fetchParameter$1$balanceResult$1(this.this$0, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C48158uHc.Activity> continuation) {
        return ((SignalCloneViewModel$fetchParameter$1$balanceResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C48158uHc c48158uHc = this.this$0.gEmmrt;
            C48158uHc.StateListAnimator stateListAnimatorAEQbTJ = this.$action.AEQbTJ();
            this.label = 1;
            obj = c48158uHc.KWHzl(stateListAnimatorAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
