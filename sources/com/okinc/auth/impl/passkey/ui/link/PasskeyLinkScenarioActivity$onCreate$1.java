package com.okinc.auth.impl.passkey.ui.link;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6144aJm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyLinkScenarioActivity$onCreate$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ActivityC6144aJm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyLinkScenarioActivity$onCreate$1(ActivityC6144aJm activityC6144aJm, Continuation<? super PasskeyLinkScenarioActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC6144aJm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyLinkScenarioActivity$onCreate$1 passkeyLinkScenarioActivity$onCreate$1 = new PasskeyLinkScenarioActivity$onCreate$1(this.this$0, continuation);
        passkeyLinkScenarioActivity$onCreate$1.Z$0 = ((Boolean) obj).booleanValue();
        return passkeyLinkScenarioActivity$onCreate$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((PasskeyLinkScenarioActivity$onCreate$1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.Z$0) {
                this.this$0.showLoadingAtOnce();
            } else {
                this.this$0.releaseLoading();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
