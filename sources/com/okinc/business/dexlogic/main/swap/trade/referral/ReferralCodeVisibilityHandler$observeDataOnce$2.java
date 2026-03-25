package com.okinc.business.dexlogic.main.swap.trade.referral;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C22904hoE;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes6.dex */
public final class ReferralCodeVisibilityHandler$observeDataOnce$2<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C22904hoE<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCodeVisibilityHandler$observeDataOnce$2(C22904hoE<T> c22904hoE, Continuation<? super ReferralCodeVisibilityHandler$observeDataOnce$2> continuation) {
        super(2, continuation);
        this.this$0 = c22904hoE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralCodeVisibilityHandler$observeDataOnce$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(T t, Continuation<? super Unit> continuation) {
        return ((ReferralCodeVisibilityHandler$observeDataOnce$2) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.invoke();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
