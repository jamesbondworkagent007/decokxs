package com.okinc.lifecycle.impl.deeplink.usecase;

import com.okinc.core.ok_app.api.configuration.Scenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes9.dex */
public final class DeeplinkAuthUseCaseImpl$performAuth$2 extends SuspendLambda implements Function2<Scenario, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeeplinkAuthUseCaseImpl$performAuth$2(Continuation<? super DeeplinkAuthUseCaseImpl$performAuth$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DeeplinkAuthUseCaseImpl$performAuth$2 deeplinkAuthUseCaseImpl$performAuth$2 = new DeeplinkAuthUseCaseImpl$performAuth$2(continuation);
        deeplinkAuthUseCaseImpl$performAuth$2.L$0 = obj;
        return deeplinkAuthUseCaseImpl$performAuth$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Scenario scenario, Continuation<? super Boolean> continuation) {
        return ((DeeplinkAuthUseCaseImpl$performAuth$2) create(scenario, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        Scenario scenario = (Scenario) this.L$0;
        return C56443yFo.KWHzl((scenario instanceof Scenario.Login) || (scenario instanceof Scenario.Register) || (scenario instanceof Scenario.Logout) || (scenario instanceof Scenario.SwitchAccount));
    }
}
