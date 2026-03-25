package com.okinc.im.imui.group.join.viewmodel;

import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import com.okinc.okimcore.model.remote.WithdrawPaidGroupPaymentRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C44124sEe;
import o.C44270sJp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$withdrawPayment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$withdrawPayment$1(JoinGroupViewModel joinGroupViewModel, Continuation<? super JoinGroupViewModel$withdrawPayment$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinGroupViewModel$withdrawPayment$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupViewModel$withdrawPayment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object taskDescription;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>withdrawPayment: groupId=" + this.this$0.gEmmrt(), null, 2, null);
            C44270sJp c44270sJp = this.this$0.hDKMBd;
            WithdrawPaidGroupPaymentRequest withdrawPaidGroupPaymentRequest = new WithdrawPaidGroupPaymentRequest(C33129mqd.valueOf(C56443yFo.KWHzl(this.this$0.gEmmrt())));
            this.label = 1;
            obj = c44270sJp.OLrzqt(withdrawPaidGroupPaymentRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>withdrawPayment: result=" + abstractC43419rot, null, 2, null);
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            AbstractC43419rot.ActionBar actionBar = (AbstractC43419rot.ActionBar) abstractC43419rot;
            C44124sEe.AYXKKw("JoinGroupViewModel=>withdrawPayment: Error: " + actionBar.KWHzl(), (Throwable) actionBar.KWHzl());
            taskDescription = new JoinGroupViewModel.Dialog.TaskDescription((Throwable) actionBar.KWHzl());
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>withdrawPayment: Success", null, 2, null);
            taskDescription = JoinGroupViewModel.Dialog.C0423Dialog.EZpvd;
        }
        MutableSharedFlow mutableSharedFlow = this.this$0.valueOf;
        this.label = 2;
        if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
