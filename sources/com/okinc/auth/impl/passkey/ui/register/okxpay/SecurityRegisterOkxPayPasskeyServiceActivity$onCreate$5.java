package com.okinc.auth.impl.passkey.ui.register.okxpay;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6354aNk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$5 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6354aNk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$5(ActivityC6354aNk activityC6354aNk, Continuation<? super SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$5> continuation) {
        super(2, continuation);
        this.this$0 = activityC6354aNk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$5 securityRegisterOkxPayPasskeyServiceActivity$onCreate$5 = new SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$5(this.this$0, continuation);
        securityRegisterOkxPayPasskeyServiceActivity$onCreate$5.L$0 = obj;
        return securityRegisterOkxPayPasskeyServiceActivity$onCreate$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$5) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.valueOf.launch((String) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
