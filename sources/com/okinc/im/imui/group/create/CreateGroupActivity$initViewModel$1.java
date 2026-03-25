package com.okinc.im.imui.group.create;

import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class CreateGroupActivity$initViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, CreateGroupViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateGroupActivity$initViewModel$1(Continuation<? super CreateGroupActivity$initViewModel$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, CreateGroupViewModel.Application application, Continuation<? super Unit> continuation) {
        CreateGroupActivity$initViewModel$1 createGroupActivity$initViewModel$1 = new CreateGroupActivity$initViewModel$1(continuation);
        createGroupActivity$initViewModel$1.L$0 = application;
        return createGroupActivity$initViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CreateGroupViewModel.Application application = (CreateGroupViewModel.Application) this.L$0;
            if (application instanceof CreateGroupViewModel.Application.StateListAnimator) {
                C44157sFk.KWHzl(((CreateGroupViewModel.Application.StateListAnimator) application).AEQbTJ());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
