package com.okinc.im.imui.group.join.view;

import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.nHX;
import o.nTQ;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupActivity$initViewModel$7 extends SuspendLambda implements yHO<CoroutineScope, JoinGroupViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nTQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupActivity$initViewModel$7(nTQ ntq, Continuation<? super JoinGroupActivity$initViewModel$7> continuation) {
        super(3, continuation);
        this.this$0 = ntq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, JoinGroupViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        JoinGroupActivity$initViewModel$7 joinGroupActivity$initViewModel$7 = new JoinGroupActivity$initViewModel$7(this.this$0, continuation);
        joinGroupActivity$initViewModel$7.L$0 = taskDescription;
        return joinGroupActivity$initViewModel$7.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            JoinGroupViewModel.TaskDescription taskDescription = (JoinGroupViewModel.TaskDescription) this.L$0;
            if (!(taskDescription instanceof JoinGroupViewModel.TaskDescription.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            JoinGroupViewModel.TaskDescription.Activity activity = (JoinGroupViewModel.TaskDescription.Activity) taskDescription;
            C55326xho.toastWithFailedIcon$default(activity.EZpvd(), 0, 1, (Object) null);
            ((nHX) this.this$0.KWHzl()).copydefault.setEnabled(activity.KWHzl());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
