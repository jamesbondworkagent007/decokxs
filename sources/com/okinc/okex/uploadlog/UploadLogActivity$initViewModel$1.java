package com.okinc.okex.uploadlog;

import android.app.Activity;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import com.okinc.okex.uploadlog.view.UploadLogResultFragment;
import com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC32996moC;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.sBJ;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadLogActivity$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ sBJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLogActivity$initViewModel$1(sBJ sbj, Continuation<? super UploadLogActivity$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = sbj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadLogActivity$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UploadLogActivity$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.uploadlog.UploadLogActivity$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<UploadLogViewModel.TaskDescription, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ sBJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sBJ sbj, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sbj;
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
        public final Object invoke(UploadLogViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            OKSupportBaseActivity.PageState pageState;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                UploadLogViewModel.TaskDescription taskDescription = (UploadLogViewModel.TaskDescription) this.L$0;
                this.this$0.dismissLoading();
                if (taskDescription instanceof UploadLogViewModel.TaskDescription.ActionBar) {
                    pageState = OKSupportBaseActivity.PageState.LOADING;
                } else if (taskDescription instanceof UploadLogViewModel.TaskDescription.StateListAnimator) {
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                    pageState = OKSupportBaseActivity.PageState.ERROR;
                } else if (taskDescription instanceof UploadLogViewModel.TaskDescription.Application) {
                    this.this$0.KWHzl(((UploadLogViewModel.TaskDescription.Application) taskDescription).copydefault().EZpvd());
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    pageState = OKSupportBaseActivity.PageState.CONTENT;
                } else if ((taskDescription instanceof UploadLogViewModel.TaskDescription.C0574TaskDescription) || (taskDescription instanceof UploadLogViewModel.TaskDescription.Activity)) {
                    pageState = OKSupportBaseActivity.PageState.CONTENT;
                } else if (taskDescription instanceof UploadLogViewModel.TaskDescription.FragmentManager) {
                    AppBarLayout appBarLayoutAubY = this.this$0.AubY();
                    if (appBarLayoutAubY != null) {
                        appBarLayoutAubY.setExpanded(false, true);
                    }
                    this.this$0.AEQbTJ((AbstractC32996moC) UploadLogResultFragment.Companion.EZpvd(((UploadLogViewModel.TaskDescription.FragmentManager) taskDescription).AEQbTJ()), true);
                    pageState = OKSupportBaseActivity.PageState.CONTENT;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.EZpvd(pageState);
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
            StateFlow<UploadLogViewModel.TaskDescription> stateFlowOLrzqt = this.this$0.djBIcL().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
