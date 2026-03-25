package com.okinc.auth.impl.passkey.ui.register;

import com.okinc.auth.api.passkey.PasskeyRegisterState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6299aMi;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceActivity$onCreate$5 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC6299aMi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceActivity$onCreate$5(ActivityC6299aMi activityC6299aMi, Continuation<? super PasskeyPromotionServiceActivity$onCreate$5> continuation) {
        super(2, continuation);
        this.this$0 = activityC6299aMi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceActivity$onCreate$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceActivity$onCreate$5) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl(PasskeyRegisterState.Success.KWHzl);
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C8206ayP.Dialog.zDUObI), 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
