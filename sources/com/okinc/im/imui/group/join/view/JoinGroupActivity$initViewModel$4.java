package com.okinc.im.imui.group.join.view;

import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.nTQ;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupActivity$initViewModel$4 extends SuspendLambda implements yHO<CoroutineScope, JoinGroupViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nTQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupActivity$initViewModel$4(nTQ ntq, Continuation<? super JoinGroupActivity$initViewModel$4> continuation) {
        super(3, continuation);
        this.this$0 = ntq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, JoinGroupViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        JoinGroupActivity$initViewModel$4 joinGroupActivity$initViewModel$4 = new JoinGroupActivity$initViewModel$4(this.this$0, continuation);
        joinGroupActivity$initViewModel$4.L$0 = stateListAnimator;
        return joinGroupActivity$initViewModel$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            JoinGroupViewModel.StateListAnimator stateListAnimator = (JoinGroupViewModel.StateListAnimator) this.L$0;
            if (!(stateListAnimator instanceof JoinGroupViewModel.StateListAnimator.C0424StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            JoinGroupViewModel.StateListAnimator.C0424StateListAnimator c0424StateListAnimator = (JoinGroupViewModel.StateListAnimator.C0424StateListAnimator) stateListAnimator;
            this.this$0.OLrzqt(c0424StateListAnimator.KWHzl(), c0424StateListAnimator.EZpvd());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
