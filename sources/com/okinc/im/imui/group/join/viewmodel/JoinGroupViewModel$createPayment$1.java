package com.okinc.im.imui.group.join.viewmodel;

import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33129mqd;
import o.C34165nTv;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$createPayment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $reason;
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$createPayment$1(JoinGroupViewModel joinGroupViewModel, String str, Continuation<? super JoinGroupViewModel$createPayment$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
        this.$reason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinGroupViewModel$createPayment$1(this.this$0, this.$reason, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupViewModel$createPayment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>createPayment: groupId=" + this.this$0.gEmmrt() + ", inviteId=" + this.this$0.djBIcL() + ", reason=" + this.$reason, null, 2, null);
            C34165nTv c34165nTv = this.this$0.fetchVPNInfo;
            String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(this.this$0.gEmmrt()));
            String strDjBIcL = this.this$0.djBIcL();
            String str = this.$reason;
            this.label = 1;
            obj = c34165nTv.copydefault(strGEmmrt, strDjBIcL, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C34165nTv.Activity activity = (C34165nTv.Activity) obj;
        if (Intrinsics.EZpvd(activity, C34165nTv.Activity.Application.AEQbTJ)) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>createPayment: Need to create account", null, 2, null);
            MutableSharedFlow mutableSharedFlow = this.this$0.valueOf;
            JoinGroupViewModel.Dialog.Activity activity2 = JoinGroupViewModel.Dialog.Activity.OLrzqt;
            this.label = 2;
            if (mutableSharedFlow.emit(activity2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else if (activity instanceof C34165nTv.Activity.TaskDescription) {
            C34165nTv.Activity.TaskDescription taskDescription = (C34165nTv.Activity.TaskDescription) activity;
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>createPayment: Payment success, orderId=" + taskDescription.AEQbTJ().getTradeOrderId(), null, 2, null);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.valueOf;
            JoinGroupViewModel.Dialog.Application application = new JoinGroupViewModel.Dialog.Application(taskDescription.AEQbTJ().getTradeOrderId());
            this.label = 3;
            if (mutableSharedFlow2.emit(application, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (!(activity instanceof C34165nTv.Activity.C0892Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            C34165nTv.Activity.C0892Activity c0892Activity = (C34165nTv.Activity.C0892Activity) activity;
            C44124sEe.AYXKKw("JoinGroupViewModel=>createPayment: Payment error: " + c0892Activity.KWHzl().getMessage(), c0892Activity.KWHzl());
            MutableSharedFlow mutableSharedFlow3 = this.this$0.valueOf;
            JoinGroupViewModel.Dialog.ActionBar actionBar = new JoinGroupViewModel.Dialog.ActionBar(c0892Activity.KWHzl().getMessage());
            this.label = 4;
            if (mutableSharedFlow3.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
