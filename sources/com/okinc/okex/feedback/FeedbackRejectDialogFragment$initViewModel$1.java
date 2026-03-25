package com.okinc.okex.feedback;

import android.graphics.drawable.Drawable;
import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C45625sta;
import o.C47315tni;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class FeedbackRejectDialogFragment$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45625sta this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackRejectDialogFragment$initViewModel$1(C45625sta c45625sta, Continuation<? super FeedbackRejectDialogFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c45625sta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackRejectDialogFragment$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackRejectDialogFragment$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.feedback.FeedbackRejectDialogFragment$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FeedbackListViewModel.Activity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C45625sta this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C45625sta c45625sta, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c45625sta;
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
        public final Object invoke(FeedbackListViewModel.Activity activity, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                FeedbackListViewModel.Activity activity = (FeedbackListViewModel.Activity) this.L$0;
                if (activity.EZpvd() == this.this$0.AYXKKw()) {
                    if (activity instanceof FeedbackListViewModel.Activity.Application) {
                        if (((FeedbackListViewModel.Activity.Application) activity).KWHzl()) {
                            this.this$0.showLoading();
                        } else {
                            this.this$0.dismissLoading();
                        }
                    } else if (activity instanceof FeedbackListViewModel.Activity.C0546Activity) {
                        this.this$0.dismissAllowingStateLoss();
                        C55326xho.toastWithSuccessfulIcon$default(C47315tni.PendingIntent.zOIQXb, 0, 1, (Object) null);
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
            StateFlow<FeedbackListViewModel.Activity> stateFlowAEQbTJ = this.this$0.gEmmrt().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
