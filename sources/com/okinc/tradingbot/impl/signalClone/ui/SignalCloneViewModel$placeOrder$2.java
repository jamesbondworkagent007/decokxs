package com.okinc.tradingbot.impl.signalClone.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C53735wrB;
import o.C53826wsn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalCloneViewModel$placeOrder$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C53826wsn.StateListAnimator.Activity $action;
    int label;
    final /* synthetic */ C53826wsn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneViewModel$placeOrder$2(C53826wsn c53826wsn, C53826wsn.StateListAnimator.Activity activity, Continuation<? super SignalCloneViewModel$placeOrder$2> continuation) {
        super(2, continuation);
        this.this$0 = c53826wsn;
        this.$action = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalCloneViewModel$placeOrder$2(this.this$0, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalCloneViewModel$placeOrder$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C53735wrB c53735wrB = this.this$0.values;
            C53735wrB.TaskDescription taskDescription = new C53735wrB.TaskDescription(this.$action.OLrzqt());
            this.label = 1;
            obj = c53735wrB.KWHzl(taskDescription, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C53735wrB.ActionBar actionBar = (C53735wrB.ActionBar) obj;
        pUU.EZpvd("SignalCloneViewModel", "Order placed successfully: algoId=" + actionBar.KWHzl().getAlgoId());
        this.this$0.EZpvd(new C53826wsn.TaskDescription.ActionBar(actionBar.KWHzl()));
        return Unit.INSTANCE;
    }
}
