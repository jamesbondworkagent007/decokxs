package com.okinc.okex.feedback.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C45618stT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackBountyViewModel$loadTotalOfPendingApproveFeedback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FeedbackBountyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackBountyViewModel$loadTotalOfPendingApproveFeedback$1(FeedbackBountyViewModel feedbackBountyViewModel, Continuation<? super FeedbackBountyViewModel$loadTotalOfPendingApproveFeedback$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackBountyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackBountyViewModel$loadTotalOfPendingApproveFeedback$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackBountyViewModel$loadTotalOfPendingApproveFeedback$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableLiveData mutableLiveData2 = this.this$0.copydefault;
            C45618stT c45618stT = this.this$0.AEQbTJ;
            this.L$0 = mutableLiveData2;
            this.label = 1;
            Object objAEQbTJ = c45618stT.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            mutableLiveData = mutableLiveData2;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Integer numAEQbTJ = (Integer) ((AbstractC43419rot) obj).copydefault();
        if (numAEQbTJ == null) {
            numAEQbTJ = C56443yFo.AEQbTJ(0);
        }
        mutableLiveData.setValue(numAEQbTJ);
        return Unit.INSTANCE;
    }
}
