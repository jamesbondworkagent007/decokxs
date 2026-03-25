package com.okinc.auth.impl.passkey.ui.recover;

import com.okinc.auth.api.passkey.PasskeyRecoverState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6236aLY;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRecoverActivity$onCreate$8 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC6236aLY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRecoverActivity$onCreate$8(ActivityC6236aLY activityC6236aLY, Continuation<? super PasskeyRecoverActivity$onCreate$8> continuation) {
        super(2, continuation);
        this.this$0 = activityC6236aLY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRecoverActivity$onCreate$8(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((PasskeyRecoverActivity$onCreate$8) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault(this.this$0.getTAG(), "showReachMaximum");
            this.this$0.EZpvd(PasskeyRecoverState.Close.OLrzqt);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
