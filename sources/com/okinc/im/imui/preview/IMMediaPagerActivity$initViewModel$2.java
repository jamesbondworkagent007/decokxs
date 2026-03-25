package com.okinc.im.imui.preview;

import com.okinc.im.imui.preview.viewmodel.IMMediaPagerViewModel;
import com.okinc.im.imui.tracking.model.ResultState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC37218opg;
import o.C35399nuc;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class IMMediaPagerActivity$initViewModel$2 extends SuspendLambda implements yHO<CoroutineScope, IMMediaPagerViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC37218opg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMMediaPagerActivity$initViewModel$2(ActivityC37218opg activityC37218opg, Continuation<? super IMMediaPagerActivity$initViewModel$2> continuation) {
        super(3, continuation);
        this.this$0 = activityC37218opg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, IMMediaPagerViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        IMMediaPagerActivity$initViewModel$2 iMMediaPagerActivity$initViewModel$2 = new IMMediaPagerActivity$initViewModel$2(this.this$0, continuation);
        iMMediaPagerActivity$initViewModel$2.L$0 = actionBar;
        return iMMediaPagerActivity$initViewModel$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            IMMediaPagerViewModel.ActionBar actionBar = (IMMediaPagerViewModel.ActionBar) this.L$0;
            if (actionBar instanceof IMMediaPagerViewModel.ActionBar.Activity) {
                this.this$0.showLoading();
            } else if (actionBar instanceof IMMediaPagerViewModel.ActionBar.TaskDescription) {
                this.this$0.dismissLoading();
                C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.AxsJAYsNCnLh, 0, 1, (Object) null);
                this.this$0.OLrzqt(false, ((IMMediaPagerViewModel.ActionBar.TaskDescription) actionBar).OLrzqt(), ResultState.SUCCESS);
            } else if (actionBar instanceof IMMediaPagerViewModel.ActionBar.StateListAnimator) {
                this.this$0.dismissLoading();
                C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.QKudOq, 0, 1, (Object) null);
                this.this$0.OLrzqt(false, ((IMMediaPagerViewModel.ActionBar.StateListAnimator) actionBar).copydefault(), ResultState.FAILURE);
            } else {
                if (!(actionBar instanceof IMMediaPagerViewModel.ActionBar.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.dismissLoading();
                C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.fVBECu, 0, 1, (Object) null);
                this.this$0.OLrzqt(false, ((IMMediaPagerViewModel.ActionBar.Application) actionBar).AEQbTJ(), ResultState.FAILURE);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
