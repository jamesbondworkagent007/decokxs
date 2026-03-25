package com.okinc.okex.center.ui;

import android.graphics.drawable.Drawable;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC45235slv;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportIntegratedSolutionSimpleActivity$observeViewModel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SupportIntegratedSolutionSimpleActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportIntegratedSolutionSimpleActivity$observeViewModel$2(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, Continuation<? super SupportIntegratedSolutionSimpleActivity$observeViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = supportIntegratedSolutionSimpleActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportIntegratedSolutionSimpleActivity$observeViewModel$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportIntegratedSolutionSimpleActivity$observeViewModel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.SupportIntegratedSolutionSimpleActivity$observeViewModel$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC45235slv, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SupportIntegratedSolutionSimpleActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = supportIntegratedSolutionSimpleActivity;
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
        public final Object invoke(AbstractC45235slv abstractC45235slv, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC45235slv, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC45235slv abstractC45235slv = (AbstractC45235slv) this.L$0;
                if (abstractC45235slv instanceof AbstractC45235slv.ActionBar) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.LOADING);
                } else if (abstractC45235slv instanceof AbstractC45235slv.Application) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.CONTENT);
                } else if (abstractC45235slv instanceof AbstractC45235slv.StateListAnimator) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.ERROR);
                } else if (abstractC45235slv instanceof AbstractC45235slv.Activity) {
                    AbstractC45235slv.Activity activity = (AbstractC45235slv.Activity) abstractC45235slv;
                    String strEZpvd = activity.EZpvd();
                    if (strEZpvd != null) {
                        if (!activity.OLrzqt()) {
                            C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        } else {
                            C55326xho.toastWithFailedIcon$default(strEZpvd, 0, 1, (Object) null);
                        }
                    }
                } else {
                    if (!(abstractC45235slv instanceof AbstractC45235slv.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strOLrzqt = ((AbstractC45235slv.TaskDescription) abstractC45235slv).OLrzqt();
                    if (strOLrzqt != null) {
                        C55326xho.OLrzqt(strOLrzqt);
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
            StateFlow<AbstractC45235slv> newProxyInstance = this.this$0.hDKMBd().getNewProxyInstance();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(newProxyInstance, anonymousClass1, this) == objCopydefault) {
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
