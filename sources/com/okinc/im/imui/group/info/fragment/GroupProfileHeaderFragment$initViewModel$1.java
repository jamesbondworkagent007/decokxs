package com.okinc.im.imui.group.info.fragment;

import androidx.fragment.app.Fragment;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C34152nTi;
import o.C34155nTl;
import o.C56391yDq;
import o.C56442yFn;
import o.nJJ;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class GroupProfileHeaderFragment$initViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, GroupProfileViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34155nTl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileHeaderFragment$initViewModel$1(C34155nTl c34155nTl, Continuation<? super GroupProfileHeaderFragment$initViewModel$1> continuation) {
        super(3, continuation);
        this.this$0 = c34155nTl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupProfileViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        GroupProfileHeaderFragment$initViewModel$1 groupProfileHeaderFragment$initViewModel$1 = new GroupProfileHeaderFragment$initViewModel$1(this.this$0, continuation);
        groupProfileHeaderFragment$initViewModel$1.L$0 = taskDescription;
        return groupProfileHeaderFragment$initViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupProfileViewModel.TaskDescription taskDescription = (GroupProfileViewModel.TaskDescription) this.L$0;
            if (taskDescription instanceof GroupProfileViewModel.TaskDescription.ActionBar) {
                C34152nTi c34152nTiOLrzqt = ((GroupProfileViewModel.TaskDescription.ActionBar) taskDescription).OLrzqt();
                nJJ njj = this.this$0.EZpvd;
                if (njj != null) {
                    C34155nTl c34155nTl = this.this$0;
                    if (c34152nTiOLrzqt.isConnected()) {
                        c34155nTl.KWHzl(njj, c34152nTiOLrzqt);
                    } else {
                        c34155nTl.OLrzqt(njj, c34152nTiOLrzqt);
                        c34155nTl.copydefault(njj, c34152nTiOLrzqt);
                    }
                    c34155nTl.EZpvd(njj, c34152nTiOLrzqt);
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
