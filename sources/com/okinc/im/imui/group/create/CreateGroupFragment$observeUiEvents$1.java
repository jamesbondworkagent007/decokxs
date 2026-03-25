package com.okinc.im.imui.group.create;

import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.nJD;
import o.nQQ;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class CreateGroupFragment$observeUiEvents$1 extends SuspendLambda implements yHO<CoroutineScope, CreateGroupViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nQQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupFragment$observeUiEvents$1(nQQ nqq, Continuation<? super CreateGroupFragment$observeUiEvents$1> continuation) {
        super(3, continuation);
        this.this$0 = nqq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, CreateGroupViewModel.Application application, Continuation<? super Unit> continuation) {
        CreateGroupFragment$observeUiEvents$1 createGroupFragment$observeUiEvents$1 = new CreateGroupFragment$observeUiEvents$1(this.this$0, continuation);
        createGroupFragment$observeUiEvents$1.L$0 = application;
        return createGroupFragment$observeUiEvents$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C52794wYp c52794wYp;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CreateGroupViewModel.Application application = (CreateGroupViewModel.Application) this.L$0;
            nJD njd = this.this$0.AEQbTJ;
            if (njd != null && (c52794wYp = njd.KWHzl) != null) {
                c52794wYp.fIwbmz();
            }
            if (!(application instanceof CreateGroupViewModel.Application.StateListAnimator)) {
                if (application instanceof CreateGroupViewModel.Application.TaskDescription) {
                    this.this$0.AYXKKw();
                } else if (application instanceof CreateGroupViewModel.Application.Activity) {
                    this.this$0.OLrzqt();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
