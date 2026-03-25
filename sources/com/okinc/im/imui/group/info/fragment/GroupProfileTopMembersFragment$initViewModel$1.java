package com.okinc.im.imui.group.info.fragment;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34154nTk;
import o.C34157nTn;
import o.C56391yDq;
import o.C56442yFn;
import o.nJL;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class GroupProfileTopMembersFragment$initViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, GroupProfileViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34154nTk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileTopMembersFragment$initViewModel$1(C34154nTk c34154nTk, Continuation<? super GroupProfileTopMembersFragment$initViewModel$1> continuation) {
        super(3, continuation);
        this.this$0 = c34154nTk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupProfileViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        GroupProfileTopMembersFragment$initViewModel$1 groupProfileTopMembersFragment$initViewModel$1 = new GroupProfileTopMembersFragment$initViewModel$1(this.this$0, continuation);
        groupProfileTopMembersFragment$initViewModel$1.L$0 = taskDescription;
        return groupProfileTopMembersFragment$initViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupProfileViewModel.TaskDescription taskDescription = (GroupProfileViewModel.TaskDescription) this.L$0;
            if (taskDescription instanceof GroupProfileViewModel.TaskDescription.ActionBar) {
                C34157nTn c34157nTnAEQbTJ = ((GroupProfileViewModel.TaskDescription.ActionBar) taskDescription).AEQbTJ();
                this.this$0.EZpvd(c34157nTnAEQbTJ);
                if (c34157nTnAEQbTJ.EZpvd()) {
                    nJL njl = this.this$0.KWHzl;
                    if (njl != null) {
                        RecyclerView recyclerView = njl.copydefault;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                        recyclerView.setVisibility(8);
                        RecyclerView recyclerView2 = njl.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                        recyclerView2.setVisibility(0);
                    }
                    this.this$0.EZpvd().EZpvd(c34157nTnAEQbTJ.AEQbTJ());
                } else {
                    nJL njl2 = this.this$0.KWHzl;
                    if (njl2 != null) {
                        RecyclerView recyclerView3 = njl2.copydefault;
                        Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                        recyclerView3.setVisibility(0);
                        RecyclerView recyclerView4 = njl2.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
                        recyclerView4.setVisibility(8);
                    }
                    this.this$0.KWHzl().KWHzl(c34157nTnAEQbTJ.AEQbTJ());
                    this.this$0.KWHzl().OLrzqt(this.this$0.djBIcL().AkhnZx());
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
