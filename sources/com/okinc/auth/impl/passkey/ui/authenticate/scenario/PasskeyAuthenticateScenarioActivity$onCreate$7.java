package com.okinc.auth.impl.passkey.ui.authenticate.scenario;

import android.app.PendingIntent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6005aHF;
import o.C56391yDq;
import o.C56442yFn;
import o.C5922aFc;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateScenarioActivity$onCreate$7 extends SuspendLambda implements Function2<PendingIntent, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6005aHF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateScenarioActivity$onCreate$7(ActivityC6005aHF activityC6005aHF, Continuation<? super PasskeyAuthenticateScenarioActivity$onCreate$7> continuation) {
        super(2, continuation);
        this.this$0 = activityC6005aHF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyAuthenticateScenarioActivity$onCreate$7 passkeyAuthenticateScenarioActivity$onCreate$7 = new PasskeyAuthenticateScenarioActivity$onCreate$7(this.this$0, continuation);
        passkeyAuthenticateScenarioActivity$onCreate$7.L$0 = obj;
        return passkeyAuthenticateScenarioActivity$onCreate$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PendingIntent pendingIntent, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateScenarioActivity$onCreate$7) create(pendingIntent, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PendingIntent pendingIntent = (PendingIntent) this.L$0;
            C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", this.this$0.getTAG() + " start running fido2 pending intent");
            this.this$0.gEmmrt.launch(pendingIntent);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
