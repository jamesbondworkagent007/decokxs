package com.okinc.planet.biz_content.leaderboard;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import java.util.Collection;
import java.util.List;
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
import o.C33129mqd;
import o.C46270tOc;
import o.C47608ttN;
import o.C47651tuD;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetTopOrbitersFragment$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47608ttN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetTopOrbitersFragment$observeViewModel$1(C47608ttN c47608ttN, Continuation<? super PlanetTopOrbitersFragment$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c47608ttN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetTopOrbitersFragment$observeViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetTopOrbitersFragment$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$observeViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C47608ttN this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47608ttN c47608ttN, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47608ttN;
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$observeViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C47608ttN this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05971(C47608ttN c47608ttN, Continuation<? super C05971> continuation) {
                super(2, continuation);
                this.this$0 = c47608ttN;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05971(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow<List<TopOrbiter>> sharedFlowKWHzl = this.this$0.EZpvd().KWHzl();
                    final C47608ttN c47608ttN = this.this$0;
                    FlowCollector<? super List<TopOrbiter>> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment.observeViewModel.1.1.1.4
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public final Object emit(List<TopOrbiter> list, Continuation<? super Unit> continuation) {
                            RecyclerView recyclerView;
                            ConstraintLayout constraintLayout;
                            LottieAnimationView lottieAnimationView;
                            LottieAnimationView lottieAnimationView2;
                            c47608ttN.OLrzqt().copydefault(C33129mqd.KWHzl((Collection) list), true);
                            C46270tOc c46270tOc = c47608ttN.AEQbTJ;
                            if (c46270tOc != null && (lottieAnimationView2 = c46270tOc.OLrzqt) != null) {
                                lottieAnimationView2.cancelAnimation();
                            }
                            C46270tOc c46270tOc2 = c47608ttN.AEQbTJ;
                            if (c46270tOc2 != null && (lottieAnimationView = c46270tOc2.OLrzqt) != null) {
                                lottieAnimationView.setVisibility(8);
                            }
                            C46270tOc c46270tOc3 = c47608ttN.AEQbTJ;
                            if (c46270tOc3 != null && (constraintLayout = c46270tOc3.EZpvd) != null) {
                                constraintLayout.setVisibility(0);
                            }
                            C46270tOc c46270tOc4 = c47608ttN.AEQbTJ;
                            if (c46270tOc4 != null && (recyclerView = c46270tOc4.AEQbTJ) != null) {
                                recyclerView.setVisibility(0);
                            }
                            if (C33129mqd.KWHzl((Collection) list)) {
                                C47651tuD c47651tuDCopydefault = c47608ttN.copydefault();
                                Intrinsics.copydefault(list);
                                c47651tuDCopydefault.OLrzqt(list);
                            }
                            if (!c47608ttN.EZpvd) {
                                c47608ttN.EZpvd = true;
                                rVN.reportFullyDrawn$default((Fragment) c47608ttN, true, (String) null, 2, (Object) null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (sharedFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C05971(this.this$0, null), 3, null);
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
            Lifecycle lifecycle = this.this$0.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.CREATED;
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
