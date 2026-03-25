package com.okinc.im.imui.group.info;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.web3pay.api.model.Web3PayProjectId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34165nTv;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31257lqc;
import o.nSR;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupProfileActivityV2$collectPaymentEvents$1 extends SuspendLambda implements yHO<CoroutineScope, C34165nTv.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nSR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileActivityV2$collectPaymentEvents$1(nSR nsr, Continuation<? super GroupProfileActivityV2$collectPaymentEvents$1> continuation) {
        super(3, continuation);
        this.this$0 = nsr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C34165nTv.Activity activity, Continuation<? super Unit> continuation) {
        GroupProfileActivityV2$collectPaymentEvents$1 groupProfileActivityV2$collectPaymentEvents$1 = new GroupProfileActivityV2$collectPaymentEvents$1(this.this$0, continuation);
        groupProfileActivityV2$collectPaymentEvents$1.L$0 = activity;
        return groupProfileActivityV2$collectPaymentEvents$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C34165nTv.Activity activity = (C34165nTv.Activity) this.L$0;
            if (Intrinsics.EZpvd(activity, C34165nTv.Activity.Application.AEQbTJ)) {
                ((InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class)).EZpvd((Context) this.this$0, false, true, true, "");
            } else if (activity instanceof C34165nTv.Activity.TaskDescription) {
                InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class);
                FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                interfaceC31257lqc.OLrzqt(supportFragmentManager, Web3PayProjectId.IM_PAY, ((C34165nTv.Activity.TaskDescription) activity).AEQbTJ().getTradeOrderId());
            } else {
                if (!(activity instanceof C34165nTv.Activity.C0892Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                String message = ((C34165nTv.Activity.C0892Activity) activity).KWHzl().getMessage();
                if (message != null) {
                    C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
