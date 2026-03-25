package com.okinc.planet.biz_content.leaderboard;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.planet.biz_content.leaderboard.PlanetTopTradersFragment$observeViewModel$1;
import com.okinc.planet.biz_content.leaderboard.bean.Rank;
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
import o.C46273tOf;
import o.C47620ttZ;
import o.C47657tuJ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetTopTradersFragment$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47620ttZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetTopTradersFragment$observeViewModel$1(C47620ttZ c47620ttZ, Continuation<? super PlanetTopTradersFragment$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c47620ttZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetTopTradersFragment$observeViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetTopTradersFragment$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetTopTradersFragment$observeViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C47620ttZ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47620ttZ c47620ttZ, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47620ttZ;
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetTopTradersFragment$observeViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C47620ttZ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05981(C47620ttZ c47620ttZ, Continuation<? super C05981> continuation) {
                super(2, continuation);
                this.this$0 = c47620ttZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05981(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow<List<Rank>> sharedFlowAEQbTJ = this.this$0.copydefault().AEQbTJ();
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
                    this.label = 1;
                    if (sharedFlowAEQbTJ.collect(anonymousClass3, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetTopTradersFragment$observeViewModel$1$1$1$3, reason: invalid class name */
            public static final class AnonymousClass3<T> implements FlowCollector {
                public final /* synthetic */ C47620ttZ AEQbTJ;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass3(C47620ttZ c47620ttZ) {
                    this.AEQbTJ = c47620ttZ;
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<Rank> list, Continuation<? super Unit> continuation) {
                    RecyclerView recyclerView;
                    RecyclerView recyclerView2;
                    ConstraintLayout constraintLayout;
                    LottieAnimationView lottieAnimationView;
                    LottieAnimationView lottieAnimationView2;
                    this.AEQbTJ.OLrzqt().EZpvd(C33129mqd.KWHzl((Collection) list), true);
                    C46273tOf c46273tOf = this.AEQbTJ.KWHzl;
                    if (c46273tOf != null && (lottieAnimationView2 = c46273tOf.EZpvd) != null) {
                        lottieAnimationView2.cancelAnimation();
                    }
                    C46273tOf c46273tOf2 = this.AEQbTJ.KWHzl;
                    if (c46273tOf2 != null && (lottieAnimationView = c46273tOf2.EZpvd) != null) {
                        lottieAnimationView.setVisibility(8);
                    }
                    C46273tOf c46273tOf3 = this.AEQbTJ.KWHzl;
                    if (c46273tOf3 != null && (constraintLayout = c46273tOf3.OLrzqt) != null) {
                        constraintLayout.setVisibility(0);
                    }
                    C46273tOf c46273tOf4 = this.AEQbTJ.KWHzl;
                    if (c46273tOf4 != null && (recyclerView2 = c46273tOf4.KWHzl) != null) {
                        recyclerView2.setVisibility(0);
                    }
                    if (C33129mqd.KWHzl((Collection) list)) {
                        C47657tuJ c47657tuJEZpvd = this.AEQbTJ.EZpvd();
                        Intrinsics.copydefault(list);
                        c47657tuJEZpvd.copydefault(list);
                    }
                    C46273tOf c46273tOf5 = this.AEQbTJ.KWHzl;
                    if (c46273tOf5 != null && (recyclerView = c46273tOf5.KWHzl) != null) {
                        final C47620ttZ c47620ttZ = this.AEQbTJ;
                        C56443yFo.KWHzl(recyclerView.post(new Runnable() { // from class: o.tuf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                PlanetTopTradersFragment$observeViewModel$1.AnonymousClass1.C05981.AnonymousClass3.KWHzl(c47620ttZ);
                            }
                        }));
                    }
                    if (!this.AEQbTJ.AEQbTJ) {
                        this.AEQbTJ.AEQbTJ = true;
                        rVN.reportFullyDrawn$default((Fragment) this.AEQbTJ, true, (String) null, 2, (Object) null);
                    }
                    return Unit.INSTANCE;
                }

                public static final void KWHzl(C47620ttZ c47620ttZ) {
                    RecyclerView recyclerView;
                    C46273tOf c46273tOf = c47620ttZ.KWHzl;
                    if (c46273tOf == null || (recyclerView = c46273tOf.KWHzl) == null) {
                        return;
                    }
                    recyclerView.invalidateItemDecorations();
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C05981(this.this$0, null), 3, null);
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
