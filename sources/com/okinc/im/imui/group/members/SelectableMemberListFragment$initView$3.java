package com.okinc.im.imui.group.members;

import androidx.fragment.app.FragmentManager;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.group.members.SelectableMemberListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C35626nys;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.nXG;

/* JADX INFO: loaded from: classes16.dex */
public final class SelectableMemberListFragment$initView$3 extends SuspendLambda implements Function2<SelectableMemberListViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nXG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableMemberListFragment$initView$3(nXG nxg, Continuation<? super SelectableMemberListFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = nxg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectableMemberListFragment$initView$3 selectableMemberListFragment$initView$3 = new SelectableMemberListFragment$initView$3(this.this$0, continuation);
        selectableMemberListFragment$initView$3.L$0 = obj;
        return selectableMemberListFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SelectableMemberListViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return ((SelectableMemberListFragment$initView$3) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SelectableMemberListViewModel.ActionBar actionBar = (SelectableMemberListViewModel.ActionBar) this.L$0;
            if (actionBar instanceof SelectableMemberListViewModel.ActionBar.StateListAnimator) {
                SelectableMemberListViewModel.ActionBar.StateListAnimator stateListAnimator = (SelectableMemberListViewModel.ActionBar.StateListAnimator) actionBar;
                if (C33129mqd.OLrzqt((CharSequence) stateListAnimator.AEQbTJ())) {
                    C55326xho.toastWithFailedIcon$default(stateListAnimator.AEQbTJ(), 0, 1, (Object) null);
                }
            } else if (!Intrinsics.EZpvd(actionBar, SelectableMemberListViewModel.ActionBar.TaskDescription.OLrzqt)) {
                if (!(actionBar instanceof SelectableMemberListViewModel.ActionBar.C0438ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                C35626nys.ActionBar actionBar2 = C35626nys.Companion;
                FragmentManager supportFragmentManager = this.this$0.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                SelectableMemberListViewModel.ActionBar.C0438ActionBar c0438ActionBar = (SelectableMemberListViewModel.ActionBar.C0438ActionBar) actionBar;
                actionBar2.EZpvd(supportFragmentManager, ChatOrigin.CONTACT_INFO.getValue(), "", c0438ActionBar.AEQbTJ(), null, c0438ActionBar.OLrzqt(), false, this.this$0.OLrzqt().getGroupId());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
