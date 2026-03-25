package com.okinc.ok_kyc_core.presentation.host;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC43737rut;
import o.ActivityC42162rIq;
import o.C42163rIr;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class OKComplianceActivity$initObserve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42163rIr $viewModel;
    int label;
    final /* synthetic */ ActivityC42162rIq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceActivity$initObserve$1(C42163rIr c42163rIr, ActivityC42162rIq activityC42162rIq, Continuation<? super OKComplianceActivity$initObserve$1> continuation) {
        super(2, continuation);
        this.$viewModel = c42163rIr;
        this.this$0 = activityC42162rIq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKComplianceActivity$initObserve$1(this.$viewModel, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceActivity$initObserve$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$initObserve$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C42163rIr.StateListAnimator, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC42162rIq this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC42162rIq activityC42162rIq, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC42162rIq;
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
        public final Object invoke(C42163rIr.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C42163rIr.StateListAnimator stateListAnimator = (C42163rIr.StateListAnimator) this.L$0;
                if (stateListAnimator instanceof C42163rIr.StateListAnimator.ActionBar) {
                    C42163rIr.StateListAnimator.ActionBar actionBar = (C42163rIr.StateListAnimator.ActionBar) stateListAnimator;
                    this.this$0.EZpvd(new AbstractC43737rut.StateListAnimator(actionBar.OLrzqt(), actionBar.copydefault()));
                } else if (stateListAnimator instanceof C42163rIr.StateListAnimator.TaskDescription) {
                    C42163rIr.StateListAnimator.TaskDescription taskDescription = (C42163rIr.StateListAnimator.TaskDescription) stateListAnimator;
                    this.this$0.EZpvd(new AbstractC43737rut.Activity(taskDescription.OLrzqt(), taskDescription.copydefault()));
                } else if (stateListAnimator instanceof C42163rIr.StateListAnimator.C0928StateListAnimator) {
                    C42163rIr.StateListAnimator.C0928StateListAnimator c0928StateListAnimator = (C42163rIr.StateListAnimator.C0928StateListAnimator) stateListAnimator;
                    this.this$0.EZpvd(new AbstractC43737rut.TaskDescription(c0928StateListAnimator.KWHzl(), c0928StateListAnimator.OLrzqt()));
                } else if (stateListAnimator instanceof C42163rIr.StateListAnimator.Activity) {
                    if (!((C42163rIr.StateListAnimator.Activity) stateListAnimator).OLrzqt()) {
                        this.this$0.EZpvd(AbstractC43737rut.ActionBar.EZpvd);
                    }
                } else if (stateListAnimator instanceof C42163rIr.StateListAnimator.Application) {
                    this.this$0.EZpvd(AbstractC43737rut.Application.copydefault);
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
            SharedFlow<C42163rIr.StateListAnimator> sharedFlowAEQbTJ = this.$viewModel.AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
