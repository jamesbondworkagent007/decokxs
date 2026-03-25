package com.okinc.auth.impl.passkey.ui.register.base;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5922aFc;
import o.C6268aMD;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceBaseFragment$initObserveEvent$4 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C6268aMD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseFragment$initObserveEvent$4(C6268aMD c6268aMD, Continuation<? super PasskeyPromotionServiceBaseFragment$initObserveEvent$4> continuation) {
        super(2, continuation);
        this.this$0 = c6268aMD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceBaseFragment$initObserveEvent$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseFragment$initObserveEvent$4) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " biometric not setup dialog", 2, null);
            Context context = this.this$0.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            this.this$0.KWHzl(context);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
