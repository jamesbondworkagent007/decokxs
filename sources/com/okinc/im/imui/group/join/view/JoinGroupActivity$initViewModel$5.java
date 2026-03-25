package com.okinc.im.imui.group.join.view;

import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C35399nuc;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.nTQ;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupActivity$initViewModel$5 extends SuspendLambda implements yHO<CoroutineScope, JoinGroupViewModel.Dialog, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nTQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupActivity$initViewModel$5(nTQ ntq, Continuation<? super JoinGroupActivity$initViewModel$5> continuation) {
        super(3, continuation);
        this.this$0 = ntq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, JoinGroupViewModel.Dialog dialog, Continuation<? super Unit> continuation) {
        JoinGroupActivity$initViewModel$5 joinGroupActivity$initViewModel$5 = new JoinGroupActivity$initViewModel$5(this.this$0, continuation);
        joinGroupActivity$initViewModel$5.L$0 = dialog;
        return joinGroupActivity$initViewModel$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            JoinGroupViewModel.Dialog dialog = (JoinGroupViewModel.Dialog) this.L$0;
            if (dialog instanceof JoinGroupViewModel.Dialog.Activity) {
                this.this$0.valueOf();
            } else if (dialog instanceof JoinGroupViewModel.Dialog.StateListAnimator) {
                this.this$0.KWHzl((JoinGroupViewModel.Dialog.StateListAnimator) dialog);
            } else if (dialog instanceof JoinGroupViewModel.Dialog.Application) {
                this.this$0.AEQbTJ((JoinGroupViewModel.Dialog.Application) dialog);
            } else if (dialog instanceof JoinGroupViewModel.Dialog.ActionBar) {
                String strEZpvd = ((JoinGroupViewModel.Dialog.ActionBar) dialog).EZpvd();
                if (strEZpvd != null) {
                    C55326xho.toastWithFailedIcon$default(strEZpvd, 0, 1, (Object) null);
                }
            } else if (dialog instanceof JoinGroupViewModel.Dialog.C0423Dialog) {
                C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.zEkrwr, 0, 1, (Object) null);
                JoinGroupViewModel.refreshInviteInfo$default(this.this$0.AhwBna(), false, false, 3, null);
            } else {
                if (!(dialog instanceof JoinGroupViewModel.Dialog.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                String message = ((JoinGroupViewModel.Dialog.TaskDescription) dialog).AEQbTJ().getMessage();
                if (message != null) {
                    C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
