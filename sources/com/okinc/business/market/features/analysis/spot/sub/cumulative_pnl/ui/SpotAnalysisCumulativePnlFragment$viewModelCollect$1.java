package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment$viewModelCollect$1;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C25950jMj;
import o.C56391yDq;
import o.C56442yFn;
import o.jLI;
import o.jLJ;
import o.jLZ;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SpotAnalysisCumulativePnlFragment$viewModelCollect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$viewModelCollect$1(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$viewModelCollect$1> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlFragment$viewModelCollect$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$viewModelCollect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment$viewModelCollect$1$1, reason: invalid class name */
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<ValuationCurrency> stateFlowOLrzqt = this.this$0.DbNXlk().EZpvd().OLrzqt();
                jLZ jlz = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(stateFlowOLrzqt, jlz.OLrzqt(jlz.values(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment.viewModelCollect.1.1.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((jLJ) obj2).AEQbTJ();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((jLJ) obj2).EZpvd((jLI) obj3);
                    }
                }), new AnonymousClass2(null)), new Function2() { // from class: o.jMg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return java.lang.Boolean.valueOf(SpotAnalysisCumulativePnlFragment$viewModelCollect$1.AnonymousClass1.invokeSuspend$lambda$0((kotlin.Pair) obj2, (kotlin.Pair) obj3));
                    }
                });
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment$viewModelCollect$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements yHO<ValuationCurrency, jLI, Continuation<? super Pair<? extends ValuationCurrency, ? extends jLI>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(ValuationCurrency valuationCurrency, jLI jli, Continuation<? super Pair<ValuationCurrency, jLI>> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = valuationCurrency;
                anonymousClass2.L$1 = jli;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHO
            public /* bridge */ /* synthetic */ Object invoke(ValuationCurrency valuationCurrency, jLI jli, Continuation<? super Pair<? extends ValuationCurrency, ? extends jLI>> continuation) {
                return invoke2(valuationCurrency, jli, (Continuation<? super Pair<ValuationCurrency, jLI>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    return new Pair((ValuationCurrency) this.L$0, (jLI) this.L$1);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment$viewModelCollect$1$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends ValuationCurrency, ? extends jLI>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ jLZ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(jLZ jlz, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = jlz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Pair<? extends ValuationCurrency, ? extends jLI> pair, Continuation<? super Unit> continuation) {
                return invoke2((Pair<ValuationCurrency, jLI>) pair, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Pair<ValuationCurrency, jLI> pair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel;
                Object objCopydefault;
                SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel2;
                String str;
                Object objCopydefault2 = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ValuationCurrency valuationCurrency = (ValuationCurrency) ((Pair) this.L$0).component1();
                    SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = this.this$0.DbNXlk();
                    this.label = 1;
                    if (spotAnalysisCumulativePnlViewModelDbNXlk.copydefault(valuationCurrency, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str2 = (String) this.L$1;
                            SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel3 = (SpotAnalysisCumulativePnlViewModel) this.L$0;
                            C56391yDq.AEQbTJ(obj);
                            str = str2;
                            spotAnalysisCumulativePnlViewModel2 = spotAnalysisCumulativePnlViewModel3;
                            SpotAnalysisCumulativePnlViewModel.requestCumulativePnlWithDebounce$default(spotAnalysisCumulativePnlViewModel2, str, ((C25950jMj) obj).EZpvd().getPayload(), 0L, 4, null);
                            return Unit.INSTANCE;
                        }
                        spotAnalysisCumulativePnlViewModel = (SpotAnalysisCumulativePnlViewModel) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        String str3 = (String) obj;
                        jLZ jlz = this.this$0;
                        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk2 = jlz.DbNXlk();
                        this.L$0 = spotAnalysisCumulativePnlViewModel;
                        this.L$1 = str3;
                        this.label = 3;
                        objCopydefault = jlz.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk2, this);
                        if (objCopydefault != objCopydefault2) {
                            return objCopydefault2;
                        }
                        spotAnalysisCumulativePnlViewModel2 = spotAnalysisCumulativePnlViewModel;
                        str = str3;
                        obj = objCopydefault;
                        SpotAnalysisCumulativePnlViewModel.requestCumulativePnlWithDebounce$default(spotAnalysisCumulativePnlViewModel2, str, ((C25950jMj) obj).EZpvd().getPayload(), 0L, 4, null);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk3 = this.this$0.DbNXlk();
                SpotAnalysisViewModel spotAnalysisViewModelValues = this.this$0.values();
                this.L$0 = spotAnalysisCumulativePnlViewModelDbNXlk3;
                this.label = 2;
                Object objAEQbTJ = spotAnalysisViewModelValues.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault2) {
                    return objCopydefault2;
                }
                spotAnalysisCumulativePnlViewModel = spotAnalysisCumulativePnlViewModelDbNXlk3;
                obj = objAEQbTJ;
                String str32 = (String) obj;
                jLZ jlz2 = this.this$0;
                SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk22 = jlz2.DbNXlk();
                this.L$0 = spotAnalysisCumulativePnlViewModel;
                this.L$1 = str32;
                this.label = 3;
                objCopydefault = jlz2.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk22, this);
                if (objCopydefault != objCopydefault2) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(Pair pair, Pair pair2) {
            return Intrinsics.EZpvd(pair.getFirst(), pair2.getFirst()) && Intrinsics.EZpvd(pair.getSecond(), pair2.getSecond());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jLZ jlz = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
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
