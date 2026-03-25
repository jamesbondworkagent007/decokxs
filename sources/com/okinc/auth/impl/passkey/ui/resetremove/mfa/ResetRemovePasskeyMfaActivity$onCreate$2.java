package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6373aOC;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class ResetRemovePasskeyMfaActivity$onCreate$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6373aOC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeyMfaActivity$onCreate$2(ActivityC6373aOC activityC6373aOC, Continuation<? super ResetRemovePasskeyMfaActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC6373aOC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResetRemovePasskeyMfaActivity$onCreate$2 resetRemovePasskeyMfaActivity$onCreate$2 = new ResetRemovePasskeyMfaActivity$onCreate$2(this.this$0, continuation);
        resetRemovePasskeyMfaActivity$onCreate$2.L$0 = obj;
        return resetRemovePasskeyMfaActivity$onCreate$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeyMfaActivity$onCreate$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
