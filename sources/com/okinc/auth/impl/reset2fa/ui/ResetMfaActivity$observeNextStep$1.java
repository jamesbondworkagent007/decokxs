package com.okinc.auth.impl.reset2fa.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC6596aSN;
import o.ActivityC6629aSu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class ResetMfaActivity$observeNextStep$1 extends SuspendLambda implements Function2<AbstractC6596aSN, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6629aSu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetMfaActivity$observeNextStep$1(ActivityC6629aSu activityC6629aSu, Continuation<? super ResetMfaActivity$observeNextStep$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC6629aSu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResetMfaActivity$observeNextStep$1 resetMfaActivity$observeNextStep$1 = new ResetMfaActivity$observeNextStep$1(this.this$0, continuation);
        resetMfaActivity$observeNextStep$1.L$0 = obj;
        return resetMfaActivity$observeNextStep$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC6596aSN abstractC6596aSN, Continuation<? super Unit> continuation) {
        return ((ResetMfaActivity$observeNextStep$1) create(abstractC6596aSN, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl((AbstractC6596aSN) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
