package com.okinc.im.imui.group.join.view;

import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.nHX;
import o.nTQ;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupActivity$initViewModel$2 extends SuspendLambda implements yHO<CoroutineScope, JoinGroupViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nTQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupActivity$initViewModel$2(nTQ ntq, Continuation<? super JoinGroupActivity$initViewModel$2> continuation) {
        super(3, continuation);
        this.this$0 = ntq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, JoinGroupViewModel.Application application, Continuation<? super Unit> continuation) {
        JoinGroupActivity$initViewModel$2 joinGroupActivity$initViewModel$2 = new JoinGroupActivity$initViewModel$2(this.this$0, continuation);
        joinGroupActivity$initViewModel$2.L$0 = application;
        return joinGroupActivity$initViewModel$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            JoinGroupViewModel.Application application = (JoinGroupViewModel.Application) this.L$0;
            if (application instanceof JoinGroupViewModel.Application.C0422Application) {
                C52794wYp.startLoading$default(((nHX) this.this$0.KWHzl()).copydefault, 0L, 1, null);
            } else {
                if (!(application instanceof JoinGroupViewModel.Application.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((nHX) this.this$0.KWHzl()).copydefault.fIwbmz();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
