package com.okinc.planet.biz_content.leaderboard;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightArticle;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C33129mqd;
import o.C46269tOb;
import o.C47605ttK;
import o.C47650tuC;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetSpotlightFragment$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47605ttK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetSpotlightFragment$observeViewModel$1(C47605ttK c47605ttK, Continuation<? super PlanetSpotlightFragment$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c47605ttK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetSpotlightFragment$observeViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetSpotlightFragment$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$observeViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C47605ttK this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47605ttK c47605ttK, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47605ttK;
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$observeViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C47605ttK this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05961(C47605ttK c47605ttK, Continuation<? super C05961> continuation) {
                super(2, continuation);
                this.this$0 = c47605ttK;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05961(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow<List<SpotlightArticle>> sharedFlowCopydefault = this.this$0.KWHzl().copydefault();
                    final C47605ttK c47605ttK = this.this$0;
                    FlowCollector<? super List<SpotlightArticle>> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment.observeViewModel.1.1.1.3
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public final Object emit(List<SpotlightArticle> list, Continuation<? super Unit> continuation) {
                            RecyclerView recyclerView;
                            ConstraintLayout constraintLayout;
                            LottieAnimationView lottieAnimationView;
                            LottieAnimationView lottieAnimationView2;
                            c47605ttK.AhwBna().AEQbTJ(C33129mqd.KWHzl((Collection) list), true);
                            C46269tOb c46269tOb = c47605ttK.OLrzqt;
                            if (c46269tOb != null && (lottieAnimationView2 = c46269tOb.copydefault) != null) {
                                lottieAnimationView2.cancelAnimation();
                            }
                            C46269tOb c46269tOb2 = c47605ttK.OLrzqt;
                            if (c46269tOb2 != null && (lottieAnimationView = c46269tOb2.copydefault) != null) {
                                lottieAnimationView.setVisibility(8);
                            }
                            C46269tOb c46269tOb3 = c47605ttK.OLrzqt;
                            if (c46269tOb3 != null && (constraintLayout = c46269tOb3.AEQbTJ) != null) {
                                constraintLayout.setVisibility(0);
                            }
                            C46269tOb c46269tOb4 = c47605ttK.OLrzqt;
                            if (c46269tOb4 != null && (recyclerView = c46269tOb4.EZpvd) != null) {
                                recyclerView.setVisibility(0);
                            }
                            if (C33129mqd.KWHzl((Collection) list)) {
                                c47605ttK.OLrzqt().AEQbTJ();
                                C47650tuC c47650tuCOLrzqt = c47605ttK.OLrzqt();
                                Intrinsics.copydefault(list);
                                c47650tuCOLrzqt.copydefault(list);
                                c47605ttK.fetchVPNInfo();
                                c47605ttK.djBIcL();
                            }
                            if (!c47605ttK.EZpvd) {
                                c47605ttK.EZpvd = true;
                                rVN.reportFullyDrawn$default((Fragment) c47605ttK, true, (String) null, 2, (Object) null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (sharedFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C05961(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$observeViewModel$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C47605ttK this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C47605ttK c47605ttK, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = c47605ttK;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<Long> stateFlowAEQbTJ = this.this$0.KWHzl().AEQbTJ();
                    final C47605ttK c47605ttK = this.this$0;
                    FlowCollector<? super Long> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment.observeViewModel.1.1.2.4
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                        public final Object emit(Long l, Continuation<? super Unit> continuation) {
                            TextView textView;
                            if (l != null) {
                                C47605ttK c47605ttK2 = c47605ttK;
                                long jLongValue = l.longValue();
                                C46269tOb c46269tOb = c47605ttK2.OLrzqt;
                                if (c46269tOb != null && (textView = c46269tOb.AYXKKw) != null) {
                                    textView.setText(c47605ttK2.KWHzl(jLongValue));
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$observeViewModel$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C47605ttK this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C47605ttK c47605ttK, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = c47605ttK;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow<Map<String, Object>> sharedFlowGEmmrt = this.this$0.AYXKKw().gEmmrt();
                    final C47605ttK c47605ttK = this.this$0;
                    FlowCollector<? super Map<String, Object>> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment.observeViewModel.1.1.3.5
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                        public final Object emit(Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
                            c47605ttK.OLrzqt().KWHzl(map);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (sharedFlowGEmmrt.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Lifecycle lifecycle = this.this$0.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
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
