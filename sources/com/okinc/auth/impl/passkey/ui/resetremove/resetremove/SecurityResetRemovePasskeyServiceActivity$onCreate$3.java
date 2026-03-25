package com.okinc.auth.impl.passkey.ui.resetremove.resetremove;

import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6427aPD;
import o.ActivityC6460aPk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityResetRemovePasskeyServiceActivity$onCreate$3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC6460aPk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityResetRemovePasskeyServiceActivity$onCreate$3(ActivityC6460aPk activityC6460aPk, Continuation<? super SecurityResetRemovePasskeyServiceActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC6460aPk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityResetRemovePasskeyServiceActivity$onCreate$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((SecurityResetRemovePasskeyServiceActivity$onCreate$3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.values.launch(new Intent(this.this$0, (Class<?>) ActivityC6427aPD.class));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
