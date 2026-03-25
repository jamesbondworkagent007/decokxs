package com.okinc.okex.feedback;

import androidx.fragment.app.Fragment;
import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C45552ssG;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class FeedbackHistoryContentFragment$initViewModel$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FeedbackListViewModel $this_with;
    int label;
    final /* synthetic */ C45552ssG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackHistoryContentFragment$initViewModel$1$2(FeedbackListViewModel feedbackListViewModel, C45552ssG c45552ssG, Continuation<? super FeedbackHistoryContentFragment$initViewModel$1$2> continuation) {
        super(2, continuation);
        this.$this_with = feedbackListViewModel;
        this.this$0 = c45552ssG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackHistoryContentFragment$initViewModel$1$2(this.$this_with, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackHistoryContentFragment$initViewModel$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.feedback.FeedbackHistoryContentFragment$initViewModel$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FeedbackListViewModel.TaskDescription, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C45552ssG this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C45552ssG c45552ssG, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c45552ssG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FeedbackListViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                FeedbackListViewModel.TaskDescription taskDescription = (FeedbackListViewModel.TaskDescription) this.L$0;
                if (taskDescription.AEQbTJ() == this.this$0.valueOf() && !(taskDescription instanceof FeedbackListViewModel.TaskDescription.StateListAnimator)) {
                    if (taskDescription instanceof FeedbackListViewModel.TaskDescription.C0548TaskDescription) {
                        this.this$0.EZpvd();
                    } else if (taskDescription instanceof FeedbackListViewModel.TaskDescription.Activity) {
                        FeedbackListViewModel.TaskDescription.Activity activity = (FeedbackListViewModel.TaskDescription.Activity) taskDescription;
                        this.this$0.OLrzqt(activity.copydefault(), activity.KWHzl());
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                    } else if (taskDescription instanceof FeedbackListViewModel.TaskDescription.Application) {
                        this.this$0.OLrzqt();
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<FeedbackListViewModel.TaskDescription> stateFlowKWHzl = this.$this_with.KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
