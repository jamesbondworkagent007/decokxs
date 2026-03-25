package com.okinc.okex.feedback;

import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45552ssG;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class FeedbackHistoryContentFragment$requestData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $reset;
    int label;
    final /* synthetic */ C45552ssG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackHistoryContentFragment$requestData$1(C45552ssG c45552ssG, boolean z, Continuation<? super FeedbackHistoryContentFragment$requestData$1> continuation) {
        super(2, continuation);
        this.this$0 = c45552ssG;
        this.$reset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackHistoryContentFragment$requestData$1(this.this$0, this.$reset, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackHistoryContentFragment$requestData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FeedbackListViewModel feedbackListViewModelAEQbTJ = this.this$0.AEQbTJ();
            int i2 = this.this$0.copydefault;
            int iValueOf = this.this$0.valueOf();
            Integer num = this.this$0.djBIcL;
            int i3 = this.this$0.AYXKKw;
            boolean z = this.$reset;
            int size = this.this$0.AEQbTJ.size();
            this.label = 1;
            if (feedbackListViewModelAEQbTJ.EZpvd(i2, iValueOf, num, i3, z, size, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
