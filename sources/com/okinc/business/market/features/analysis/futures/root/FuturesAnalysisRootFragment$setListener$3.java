package com.okinc.business.market.features.analysis.futures.root;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$3;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.marketapi.AnalysisTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C25852jIt;
import o.C43251rlk;
import o.C49366unG;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43031rhc;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisRootFragment$setListener$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C25852jIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$setListener$3(C25852jIt c25852jIt, Continuation<? super FuturesAnalysisRootFragment$setListener$3> continuation) {
        super(2, continuation);
        this.this$0 = c25852jIt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisRootFragment$setListener$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$setListener$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C25852jIt this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C25852jIt c25852jIt, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c25852jIt;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<PayloadPeriod> stateFlowCopydefault = ((InterfaceC43031rhc) C43251rlk.copydefault(InterfaceC43031rhc.class)).copydefault();
                C03451 c03451 = new C03451(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowCopydefault, c03451, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03451 extends SuspendLambda implements Function2<PayloadPeriod, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C25852jIt this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03451(C25852jIt c25852jIt, Continuation<? super C03451> continuation) {
                super(2, continuation);
                this.this$0 = c25852jIt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03451 c03451 = new C03451(this.this$0, continuation);
                c03451.L$0 = obj;
                return c03451;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PayloadPeriod payloadPeriod, Continuation<? super Unit> continuation) {
                return ((C03451) create(payloadPeriod, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    final PayloadPeriod payloadPeriod = (PayloadPeriod) this.L$0;
                    if (payloadPeriod != null) {
                        FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN = this.this$0.fARcdN();
                        Function1 function1 = new Function1() { // from class: o.jIB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return FuturesAnalysisRootFragment$setListener$3.AnonymousClass1.C03451.invokeSuspend$lambda$1$lambda$0(payloadPeriod, (FuturesAnalysisViewModel.StateListAnimator) obj2);
                            }
                        };
                        this.label = 1;
                        if (C49366unG.AEQbTJ(futuresAnalysisViewModelFARcdN, function1, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((InterfaceC43031rhc) C43251rlk.copydefault(InterfaceC43031rhc.class)).KWHzl(AnalysisTarget.FUTURES);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FuturesAnalysisViewModel.StateListAnimator invokeSuspend$lambda$1$lambda$0(PayloadPeriod payloadPeriod, FuturesAnalysisViewModel.StateListAnimator stateListAnimator) {
                return FuturesAnalysisViewModel.StateListAnimator.copy$default(stateListAnimator, 0L, 0L, null, null, null, null, null, payloadPeriod, false, 383, null);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25852jIt c25852jIt = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c25852jIt, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c25852jIt, state, anonymousClass1, this) == objCopydefault) {
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
