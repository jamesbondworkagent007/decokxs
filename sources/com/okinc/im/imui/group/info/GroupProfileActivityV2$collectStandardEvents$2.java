package com.okinc.im.imui.group.info;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C35399nuc;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.nSR;
import o.sDX;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupProfileActivityV2$collectStandardEvents$2 extends SuspendLambda implements yHO<CoroutineScope, GroupProfileViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nSR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileActivityV2$collectStandardEvents$2(nSR nsr, Continuation<? super GroupProfileActivityV2$collectStandardEvents$2> continuation) {
        super(3, continuation);
        this.this$0 = nsr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupProfileViewModel.Application application, Continuation<? super Unit> continuation) {
        GroupProfileActivityV2$collectStandardEvents$2 groupProfileActivityV2$collectStandardEvents$2 = new GroupProfileActivityV2$collectStandardEvents$2(this.this$0, continuation);
        groupProfileActivityV2$collectStandardEvents$2.L$0 = application;
        return groupProfileActivityV2$collectStandardEvents$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupProfileViewModel.Application application = (GroupProfileViewModel.Application) this.L$0;
            if (application instanceof GroupProfileViewModel.Application.ActionBar) {
                Intent intent = new Intent();
                intent.putExtra("RESULT_KEY_EXIT_GROUP", true);
                this.this$0.setResult(-1, intent);
                this.this$0.finish();
            } else if (application instanceof GroupProfileViewModel.Application.Activity) {
                C55326xho.toast$default(C35399nuc.LoaderManager.aappFQ, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                this.this$0.finish();
            } else {
                if (!(application instanceof GroupProfileViewModel.Application.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intent intent2 = new Intent();
                intent2.putExtra("RESULT_KEY_DISBAND_GROUP", true);
                this.this$0.setResult(-1, intent2);
                C55326xho.toast$default(sDX.StateListAnimator.AhwBna, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                this.this$0.finish();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
