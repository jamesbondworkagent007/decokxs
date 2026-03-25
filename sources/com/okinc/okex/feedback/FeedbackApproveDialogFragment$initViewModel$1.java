package com.okinc.okex.feedback;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33041mov;
import o.C45576sse;
import o.C47315tni;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class FeedbackApproveDialogFragment$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45576sse this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackApproveDialogFragment$initViewModel$1(C45576sse c45576sse, Continuation<? super FeedbackApproveDialogFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c45576sse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackApproveDialogFragment$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackApproveDialogFragment$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.feedback.FeedbackApproveDialogFragment$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C45576sse this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C45576sse c45576sse, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c45576sse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.okex.feedback.FeedbackApproveDialogFragment$initViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05451 extends SuspendLambda implements Function2<FeedbackListViewModel.Activity, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C45576sse this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05451(C45576sse c45576sse, Continuation<? super C05451> continuation) {
                super(2, continuation);
                this.this$0 = c45576sse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05451 c05451 = new C05451(this.this$0, continuation);
                c05451.L$0 = obj;
                return c05451;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FeedbackListViewModel.Activity activity, Continuation<? super Unit> continuation) {
                return ((C05451) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    FeedbackListViewModel.Activity activity = (FeedbackListViewModel.Activity) this.L$0;
                    if (activity.EZpvd() == this.this$0.OLrzqt()) {
                        if (activity instanceof FeedbackListViewModel.Activity.Application) {
                            FragmentActivity activity2 = this.this$0.getActivity();
                            AbstractActivityC33041mov abstractActivityC33041mov = activity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity2 : null;
                            if (abstractActivityC33041mov != null) {
                                if (((FeedbackListViewModel.Activity.Application) activity).KWHzl()) {
                                    abstractActivityC33041mov.showLoading();
                                } else {
                                    abstractActivityC33041mov.dismissLoading();
                                }
                            }
                        } else if (activity instanceof FeedbackListViewModel.Activity.C0546Activity) {
                            this.this$0.dismissAllowingStateLoss();
                            C55326xho.toastWithSuccessfulIcon$default(C47315tni.PendingIntent.vLaW, 0, 1, (Object) null);
                            this.this$0.EZpvd(((FeedbackListViewModel.Activity.C0546Activity) activity).OLrzqt());
                        } else {
                            if (!(activity instanceof FeedbackListViewModel.Activity.StateListAnimator)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C55326xho.toast$default(((FeedbackListViewModel.Activity.StateListAnimator) activity).OLrzqt().getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
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
                StateFlow<FeedbackListViewModel.Activity> stateFlowAEQbTJ = this.this$0.AhwBna().AEQbTJ();
                C05451 c05451 = new C05451(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAEQbTJ, c05451, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45576sse c45576sse = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c45576sse, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c45576sse, state, anonymousClass1, this) == objCopydefault) {
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
