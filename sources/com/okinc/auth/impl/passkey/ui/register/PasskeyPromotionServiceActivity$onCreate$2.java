package com.okinc.auth.impl.passkey.ui.register;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6299aMi;
import o.C56391yDq;
import o.C56442yFn;
import o.C5922aFc;
import o.C6319aNB;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceActivity$onCreate$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC6299aMi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceActivity$onCreate$2(ActivityC6299aMi activityC6299aMi, Continuation<? super PasskeyPromotionServiceActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC6299aMi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceActivity$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceActivity$onCreate$2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "without passkey", 2, null);
            this.this$0.getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, C6319aNB.Companion.EZpvd(), C6319aNB.class.getName()).commitAllowingStateLoss();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
