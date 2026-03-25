package com.okinc.business.market.features.analysis.futures.root;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C25852jIt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisRootFragment$setListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C25852jIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$setListener$1(C25852jIt c25852jIt, Continuation<? super FuturesAnalysisRootFragment$setListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c25852jIt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisRootFragment$setListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$setListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$1$1, reason: invalid class name */
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03431 extends SuspendLambda implements Function2<ValuationCurrency, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C25852jIt this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03431(C25852jIt c25852jIt, Continuation<? super C03431> continuation) {
                super(2, continuation);
                this.this$0 = c25852jIt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03431 c03431 = new C03431(this.this$0, continuation);
                c03431.L$0 = obj;
                return c03431;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ValuationCurrency valuationCurrency, Continuation<? super Unit> continuation) {
                return ((C03431) create(valuationCurrency, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ValuationCurrency valuationCurrency;
                ValuationCurrency valuationCurrency2;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ValuationCurrency valuationCurrency3 = (ValuationCurrency) this.L$0;
                    C25852jIt c25852jIt = this.this$0;
                    FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN = c25852jIt.fARcdN();
                    this.L$0 = valuationCurrency3;
                    this.label = 1;
                    Object objOLrzqt = c25852jIt.OLrzqt(futuresAnalysisViewModelFARcdN, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    valuationCurrency = valuationCurrency3;
                    obj = objOLrzqt;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        valuationCurrency2 = (ValuationCurrency) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.OLrzqt(valuationCurrency2.getUnit());
                        return Unit.INSTANCE;
                    }
                    valuationCurrency = (ValuationCurrency) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                if (Intrinsics.EZpvd(((FuturesAnalysisViewModel.StateListAnimator) obj).djBIcL(), valuationCurrency)) {
                    return Unit.INSTANCE;
                }
                FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN2 = this.this$0.fARcdN();
                this.L$0 = valuationCurrency;
                this.label = 2;
                if (futuresAnalysisViewModelFARcdN2.EZpvd(valuationCurrency, this) == objCopydefault) {
                    return objCopydefault;
                }
                valuationCurrency2 = valuationCurrency;
                this.this$0.OLrzqt(valuationCurrency2.getUnit());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<ValuationCurrency> stateFlowOLrzqt = this.this$0.fARcdN().AEQbTJ().OLrzqt();
                C03431 c03431 = new C03431(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowOLrzqt, c03431, this) == objCopydefault) {
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
            C25852jIt c25852jIt = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
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
