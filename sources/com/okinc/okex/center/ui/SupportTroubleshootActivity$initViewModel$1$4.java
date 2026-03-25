package com.okinc.okex.center.ui;

import android.app.Activity;
import com.okinc.okex.center.viewmodel.SupportTroubleshootViewModel;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC45235slv;
import o.ActivityC44946sgX;
import o.C44760scx;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootActivity$initViewModel$1$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SupportTroubleshootViewModel $this_with;
    int label;
    final /* synthetic */ ActivityC44946sgX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootActivity$initViewModel$1$4(SupportTroubleshootViewModel supportTroubleshootViewModel, ActivityC44946sgX activityC44946sgX, Continuation<? super SupportTroubleshootActivity$initViewModel$1$4> continuation) {
        super(2, continuation);
        this.$this_with = supportTroubleshootViewModel;
        this.this$0 = activityC44946sgX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTroubleshootActivity$initViewModel$1$4(this.$this_with, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportTroubleshootActivity$initViewModel$1$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.SupportTroubleshootActivity$initViewModel$1$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC45235slv, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC44946sgX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC44946sgX activityC44946sgX, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC44946sgX;
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
                C44760scx.log$default("Token List State: " + abstractC45235slv, null, 2, null);
                if (abstractC45235slv instanceof AbstractC45235slv.ActionBar) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.LOADING);
                } else if (abstractC45235slv instanceof AbstractC45235slv.Application) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.CONTENT);
                    this.this$0.AEQbTJ();
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                } else if (abstractC45235slv instanceof AbstractC45235slv.StateListAnimator) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.ERROR);
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                } else {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.CONTENT);
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
            StateFlow<AbstractC45235slv> stateFlowAkhnZx = this.$this_with.AkhnZx();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAkhnZx, anonymousClass1, this) == objCopydefault) {
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
