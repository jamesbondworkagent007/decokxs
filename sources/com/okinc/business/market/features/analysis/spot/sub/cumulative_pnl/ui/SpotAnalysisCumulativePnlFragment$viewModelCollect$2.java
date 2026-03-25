package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.marketapi.AnalysisTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C25950jMj;
import o.C56391yDq;
import o.C56442yFn;
import o.jLZ;

/* JADX INFO: loaded from: classes18.dex */
public final class SpotAnalysisCumulativePnlFragment$viewModelCollect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$viewModelCollect$2(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$viewModelCollect$2> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlFragment$viewModelCollect$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$viewModelCollect$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment$viewModelCollect$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ jLZ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jLZ jlz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jlz;
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment$viewModelCollect$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03591 extends SuspendLambda implements Function2<PayloadPeriod, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ jLZ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03591(jLZ jlz, Continuation<? super C03591> continuation) {
                super(2, continuation);
                this.this$0 = jlz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03591 c03591 = new C03591(this.this$0, continuation);
                c03591.L$0 = obj;
                return c03591;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PayloadPeriod payloadPeriod, Continuation<? super Unit> continuation) {
                return ((C03591) create(payloadPeriod, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PayloadPeriod payloadPeriod;
                jLZ jlz;
                AnalysisOverviewPeriod analysisOverviewPeriodCopydefault;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    payloadPeriod = (PayloadPeriod) this.L$0;
                    if (payloadPeriod != null) {
                        jLZ jlz2 = this.this$0;
                        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = jlz2.DbNXlk();
                        this.L$0 = payloadPeriod;
                        this.L$1 = jlz2;
                        this.label = 1;
                        Object objCopydefault2 = jlz2.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk, this);
                        if (objCopydefault2 == objCopydefault) {
                            return objCopydefault;
                        }
                        jlz = jlz2;
                        obj = objCopydefault2;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jlz = (jLZ) this.L$1;
                payloadPeriod = (PayloadPeriod) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((C25950jMj) obj).EZpvd().getPayload() != payloadPeriod && (analysisOverviewPeriodCopydefault = AnalysisOverviewPeriod.Companion.copydefault(payloadPeriod)) != null) {
                    jlz.copydefault(analysisOverviewPeriodCopydefault);
                    jlz.AEQbTJ(analysisOverviewPeriodCopydefault);
                }
                jlz.valueOf().KWHzl(AnalysisTarget.SPOT);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<PayloadPeriod> stateFlowAEQbTJ = this.this$0.valueOf().AEQbTJ();
                C03591 c03591 = new C03591(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAEQbTJ, c03591, this) == objCopydefault) {
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
            jLZ jlz = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(jlz, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(jlz, state, anonymousClass1, this) == objCopydefault) {
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
