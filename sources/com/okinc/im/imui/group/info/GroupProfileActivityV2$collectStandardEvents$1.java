package com.okinc.im.imui.group.info;

import android.graphics.drawable.Drawable;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C44157sFk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.nSR;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupProfileActivityV2$collectStandardEvents$1 extends SuspendLambda implements yHO<CoroutineScope, GroupProfileViewModel.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nSR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileActivityV2$collectStandardEvents$1(nSR nsr, Continuation<? super GroupProfileActivityV2$collectStandardEvents$1> continuation) {
        super(3, continuation);
        this.this$0 = nsr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupProfileViewModel.Activity activity, Continuation<? super Unit> continuation) {
        GroupProfileActivityV2$collectStandardEvents$1 groupProfileActivityV2$collectStandardEvents$1 = new GroupProfileActivityV2$collectStandardEvents$1(this.this$0, continuation);
        groupProfileActivityV2$collectStandardEvents$1.L$0 = activity;
        return groupProfileActivityV2$collectStandardEvents$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupProfileViewModel.Activity activity = (GroupProfileViewModel.Activity) this.L$0;
            if (activity instanceof GroupProfileViewModel.Activity.StateListAnimator) {
                if (((GroupProfileViewModel.Activity.StateListAnimator) activity).copydefault()) {
                    this.this$0.showLoading();
                } else {
                    this.this$0.releaseLoading();
                }
            } else if (activity instanceof GroupProfileViewModel.Activity.Application) {
                GroupProfileViewModel.Activity.Application application = (GroupProfileViewModel.Activity.Application) activity;
                pUU.AEQbTJ(this.this$0.getTAG(), "Exception: " + application.AEQbTJ().getMessage(), application.AEQbTJ());
                String strCopydefault = C44157sFk.copydefault(application.AEQbTJ());
                if (strCopydefault != null) {
                    C55326xho.toast$default(strCopydefault, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
                this.this$0.releaseLoading();
            } else {
                if (!(activity instanceof GroupProfileViewModel.Activity.C0421Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                GroupProfileViewModel.Activity.C0421Activity c0421Activity = (GroupProfileViewModel.Activity.C0421Activity) activity;
                pUU.AEQbTJ(this.this$0.getTAG(), "Exception: " + c0421Activity.copydefault().getMessage(), c0421Activity.copydefault());
                if (c0421Activity.AEQbTJ() == 2025) {
                    this.this$0.AYXKKw();
                } else {
                    String strCopydefault2 = C44157sFk.copydefault(c0421Activity.copydefault());
                    if (strCopydefault2 != null) {
                        C55326xho.toast$default(strCopydefault2, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                }
                this.this$0.releaseLoading();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
