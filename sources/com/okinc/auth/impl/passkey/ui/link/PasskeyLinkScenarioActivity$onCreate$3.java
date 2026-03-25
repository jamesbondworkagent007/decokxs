package com.okinc.auth.impl.passkey.ui.link;

import com.okinc.auth.api.passkey.PasskeyLinkState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6144aJm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyLinkScenarioActivity$onCreate$3 extends SuspendLambda implements Function2<PasskeyLinkState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6144aJm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyLinkScenarioActivity$onCreate$3(ActivityC6144aJm activityC6144aJm, Continuation<? super PasskeyLinkScenarioActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC6144aJm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyLinkScenarioActivity$onCreate$3 passkeyLinkScenarioActivity$onCreate$3 = new PasskeyLinkScenarioActivity$onCreate$3(this.this$0, continuation);
        passkeyLinkScenarioActivity$onCreate$3.L$0 = obj;
        return passkeyLinkScenarioActivity$onCreate$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PasskeyLinkState passkeyLinkState, Continuation<? super Unit> continuation) {
        return ((PasskeyLinkScenarioActivity$onCreate$3) create(passkeyLinkState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt((PasskeyLinkState) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
