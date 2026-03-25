package com.okinc.auth.impl.passkey.ui.sync.stepper;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C58831zQz;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeySyncStepperViewModel$onChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C58831zQz $state;
    int label;
    final /* synthetic */ PasskeySyncStepperViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySyncStepperViewModel$onChanged$1(PasskeySyncStepperViewModel passkeySyncStepperViewModel, C58831zQz c58831zQz, Continuation<? super PasskeySyncStepperViewModel$onChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeySyncStepperViewModel;
        this.$state = c58831zQz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeySyncStepperViewModel$onChanged$1(this.this$0, this.$state, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeySyncStepperViewModel$onChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(C56443yFo.KWHzl(this.$state.copydefault()));
            this.this$0.AEQbTJ.setValue(this.$state.AEQbTJ());
            this.this$0.OLrzqt.setValue(this.$state.EZpvd());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
