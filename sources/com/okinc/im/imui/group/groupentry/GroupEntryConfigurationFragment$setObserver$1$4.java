package com.okinc.im.imui.group.groupentry;

import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44414sOy;
import o.C34141nSy;
import o.C35399nuc;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.nJF;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupEntryConfigurationFragment$setObserver$1$4 extends SuspendLambda implements yHO<CoroutineScope, GroupEntryConfigurationViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34141nSy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationFragment$setObserver$1$4(C34141nSy c34141nSy, Continuation<? super GroupEntryConfigurationFragment$setObserver$1$4> continuation) {
        super(3, continuation);
        this.this$0 = c34141nSy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupEntryConfigurationViewModel.Application application, Continuation<? super Unit> continuation) {
        GroupEntryConfigurationFragment$setObserver$1$4 groupEntryConfigurationFragment$setObserver$1$4 = new GroupEntryConfigurationFragment$setObserver$1$4(this.this$0, continuation);
        groupEntryConfigurationFragment$setObserver$1$4.L$0 = application;
        return groupEntryConfigurationFragment$setObserver$1$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupEntryConfigurationViewModel.Application application = (GroupEntryConfigurationViewModel.Application) this.L$0;
            nJF njf = null;
            if (application instanceof GroupEntryConfigurationViewModel.Application.C0419Application) {
                AbstractC44414sOy abstractC44414sOyCopydefault = ((GroupEntryConfigurationViewModel.Application.C0419Application) application).copydefault();
                if (abstractC44414sOyCopydefault instanceof AbstractC44414sOy.Activity) {
                    C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.addSocket, 0, 1, (Object) null);
                } else {
                    if (!Intrinsics.EZpvd(abstractC44414sOyCopydefault, AbstractC44414sOy.Application.copydefault)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.iSpHlg, 0, 1, (Object) null);
                }
                nJF njf2 = this.this$0.KWHzl;
                if (njf2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    njf = njf2;
                }
                njf.isConnected.setEnabled(false);
            } else if (application instanceof GroupEntryConfigurationViewModel.Application.ActionBar) {
                AbstractC44414sOy abstractC44414sOyAEQbTJ = ((GroupEntryConfigurationViewModel.Application.ActionBar) application).AEQbTJ();
                if (abstractC44414sOyAEQbTJ instanceof AbstractC44414sOy.Activity) {
                    C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.addSocket, 0, 1, (Object) null);
                } else {
                    if (!Intrinsics.EZpvd(abstractC44414sOyAEQbTJ, AbstractC44414sOy.Application.copydefault)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.iSpHlg, 0, 1, (Object) null);
                }
            } else if (Intrinsics.EZpvd(application, GroupEntryConfigurationViewModel.Application.Activity.KWHzl)) {
                this.this$0.AEQbTJ(true);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
