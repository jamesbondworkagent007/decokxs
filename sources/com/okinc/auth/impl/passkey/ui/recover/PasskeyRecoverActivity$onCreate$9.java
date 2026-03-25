package com.okinc.auth.impl.passkey.ui.recover;

import com.okinc.auth.api.passkey.PasskeyRecoverState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6236aLY;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRecoverActivity$onCreate$9 extends SuspendLambda implements Function2<PasskeyRecoverState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6236aLY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRecoverActivity$onCreate$9(ActivityC6236aLY activityC6236aLY, Continuation<? super PasskeyRecoverActivity$onCreate$9> continuation) {
        super(2, continuation);
        this.this$0 = activityC6236aLY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyRecoverActivity$onCreate$9 passkeyRecoverActivity$onCreate$9 = new PasskeyRecoverActivity$onCreate$9(this.this$0, continuation);
        passkeyRecoverActivity$onCreate$9.L$0 = obj;
        return passkeyRecoverActivity$onCreate$9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PasskeyRecoverState passkeyRecoverState, Continuation<? super Unit> continuation) {
        return ((PasskeyRecoverActivity$onCreate$9) create(passkeyRecoverState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd((PasskeyRecoverState) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
