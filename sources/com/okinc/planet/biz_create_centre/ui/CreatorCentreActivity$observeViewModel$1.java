package com.okinc.planet.biz_create_centre.ui;

import android.app.Activity;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$observeViewModel$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC47776twW;
import o.C46222tMi;
import o.C46471tVo;
import o.C47501trL;
import o.C47858txz;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class CreatorCentreActivity$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC47776twW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorCentreActivity$observeViewModel$1(ActivityC47776twW activityC47776twW, Continuation<? super CreatorCentreActivity$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC47776twW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreatorCentreActivity$observeViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreatorCentreActivity$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$observeViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC47776twW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC47776twW activityC47776twW, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC47776twW;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C06011(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$observeViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC47776twW this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06011(ActivityC47776twW activityC47776twW, Continuation<? super C06011> continuation) {
                super(2, continuation);
                this.this$0 = activityC47776twW;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06011(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$observeViewModel$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C06021 extends SuspendLambda implements Function2<Pair<? extends Long, ? extends Long>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ActivityC47776twW this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06021(ActivityC47776twW activityC47776twW, Continuation<? super C06021> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC47776twW;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06021 c06021 = new C06021(this.this$0, continuation);
                    c06021.L$0 = obj;
                    return c06021;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Long, ? extends Long> pair, Continuation<? super Unit> continuation) {
                    return invoke2((Pair<Long, Long>) pair, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Pair<Long, Long> pair, Continuation<? super Unit> continuation) {
                    return ((C06021) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        Pair pair = (Pair) this.L$0;
                        if (pair != null) {
                            this.this$0.AEQbTJ((Long) pair.component1(), (Long) pair.component2());
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
                    StateFlow<Pair<Long, Long>> stateFlowEZpvd = this.this$0.KWHzl().EZpvd();
                    C06021 c06021 = new C06021(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowEZpvd, c06021, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$observeViewModel$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC47776twW this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ActivityC47776twW activityC47776twW, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = activityC47776twW;
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

            /* JADX INFO: renamed from: com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$observeViewModel$1$1$2$1, reason: invalid class name and collision with other inner class name */
            public static final class C06031 extends SuspendLambda implements Function2<C47858txz.StateListAnimator, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ActivityC47776twW this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06031(ActivityC47776twW activityC47776twW, Continuation<? super C06031> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC47776twW;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06031 c06031 = new C06031(this.this$0, continuation);
                    c06031.L$0 = obj;
                    return c06031;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(C47858txz.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                    return ((C06031) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C47858txz.StateListAnimator stateListAnimator = (C47858txz.StateListAnimator) this.L$0;
                        C46222tMi c46222tMi = null;
                        if (stateListAnimator instanceof C47858txz.StateListAnimator.TaskDescription) {
                            pUU.EZpvd(this.this$0.getTAG(), "Loading key metrics...");
                            C46222tMi c46222tMi2 = this.this$0.EZpvd;
                            if (c46222tMi2 == null) {
                                Intrinsics.gEmmrt("");
                                c46222tMi2 = null;
                            }
                            C55113xdn.showLoading$default(c46222tMi2.AkhnZx, 0L, 1, null);
                            C46222tMi c46222tMi3 = this.this$0.EZpvd;
                            if (c46222tMi3 == null) {
                                Intrinsics.gEmmrt("");
                                c46222tMi3 = null;
                            }
                            NestedScrollView nestedScrollView = c46222tMi3.fetchVPNInfo;
                            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                            nestedScrollView.setVisibility(8);
                            C46222tMi c46222tMi4 = this.this$0.EZpvd;
                            if (c46222tMi4 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                c46222tMi = c46222tMi4;
                            }
                            C46471tVo c46471tVo = c46222tMi.AYXKKw;
                            Intrinsics.checkNotNullExpressionValue(c46471tVo, "");
                            c46471tVo.setVisibility(8);
                        } else if (stateListAnimator instanceof C47858txz.StateListAnimator.C0967StateListAnimator) {
                            pUU.EZpvd(this.this$0.getTAG(), "Key metrics loaded successfully");
                            C46222tMi c46222tMi5 = this.this$0.EZpvd;
                            if (c46222tMi5 == null) {
                                Intrinsics.gEmmrt("");
                                c46222tMi5 = null;
                            }
                            NestedScrollView nestedScrollView2 = c46222tMi5.fetchVPNInfo;
                            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
                            nestedScrollView2.setVisibility(0);
                            C46222tMi c46222tMi6 = this.this$0.EZpvd;
                            if (c46222tMi6 == null) {
                                Intrinsics.gEmmrt("");
                                c46222tMi6 = null;
                            }
                            c46222tMi6.AkhnZx.copydefault();
                            C46222tMi c46222tMi7 = this.this$0.EZpvd;
                            if (c46222tMi7 == null) {
                                Intrinsics.gEmmrt("");
                                c46222tMi7 = null;
                            }
                            C46471tVo c46471tVo2 = c46222tMi7.AYXKKw;
                            Intrinsics.checkNotNullExpressionValue(c46471tVo2, "");
                            c46471tVo2.setVisibility(8);
                            C47858txz.StateListAnimator.C0967StateListAnimator c0967StateListAnimator = (C47858txz.StateListAnimator.C0967StateListAnimator) stateListAnimator;
                            this.this$0.KWHzl(c0967StateListAnimator.AEQbTJ());
                            this.this$0.AEQbTJ(c0967StateListAnimator.AEQbTJ());
                            this.this$0.copydefault(c0967StateListAnimator.AEQbTJ().getTotalPaidOutUsd());
                            if (!this.this$0.OLrzqt) {
                                this.this$0.OLrzqt = true;
                                rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                            }
                        } else {
                            if (!(stateListAnimator instanceof C47858txz.StateListAnimator.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C47858txz.StateListAnimator.ActionBar actionBar = (C47858txz.StateListAnimator.ActionBar) stateListAnimator;
                            pUU.copydefault(this.this$0.getTAG(), "Error loading key metrics: " + actionBar.copydefault());
                            C46222tMi c46222tMi8 = this.this$0.EZpvd;
                            if (c46222tMi8 == null) {
                                Intrinsics.gEmmrt("");
                                c46222tMi8 = null;
                            }
                            NestedScrollView nestedScrollView3 = c46222tMi8.fetchVPNInfo;
                            Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "");
                            nestedScrollView3.setVisibility(8);
                            C46222tMi c46222tMi9 = this.this$0.EZpvd;
                            if (c46222tMi9 == null) {
                                Intrinsics.gEmmrt("");
                                c46222tMi9 = null;
                            }
                            c46222tMi9.AkhnZx.copydefault();
                            C46222tMi c46222tMi10 = this.this$0.EZpvd;
                            if (c46222tMi10 == null) {
                                Intrinsics.gEmmrt("");
                                c46222tMi10 = null;
                            }
                            C46471tVo c46471tVo3 = c46222tMi10.AYXKKw;
                            int i = actionBar.AEQbTJ() > 0 ? 6 : 8;
                            int i2 = actionBar.AEQbTJ() > 0 ? C47501trL.Fragment.gwTjWJ : C47501trL.Fragment.RdAHlO;
                            int i3 = actionBar.AEQbTJ() > 0 ? C47501trL.Fragment.dHguZz : C47501trL.Fragment.hBpjJd;
                            int i4 = C47501trL.Fragment.QHmsKR;
                            final ActivityC47776twW activityC47776twW = this.this$0;
                            c46471tVo3.setNetworkError(i, i2, i3, i4, new Function0() { // from class: o.txb
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return CreatorCentreActivity$observeViewModel$1.AnonymousClass1.AnonymousClass2.C06031.invokeSuspend$lambda$0(activityC47776twW);
                                }
                            });
                            if (!this.this$0.OLrzqt) {
                                this.this$0.OLrzqt = true;
                                rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$0(ActivityC47776twW activityC47776twW) {
                    C46222tMi c46222tMi = activityC47776twW.EZpvd;
                    C46222tMi c46222tMi2 = null;
                    if (c46222tMi == null) {
                        Intrinsics.gEmmrt("");
                        c46222tMi = null;
                    }
                    C55113xdn.showLoading$default(c46222tMi.AkhnZx, 0L, 1, null);
                    C46222tMi c46222tMi3 = activityC47776twW.EZpvd;
                    if (c46222tMi3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c46222tMi2 = c46222tMi3;
                    }
                    C46471tVo c46471tVo = c46222tMi2.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(c46471tVo, "");
                    c46471tVo.setVisibility(8);
                    activityC47776twW.KWHzl().AYXKKw();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<C47858txz.StateListAnimator> stateFlowKWHzl = this.this$0.KWHzl().KWHzl();
                    C06031 c06031 = new C06031(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowKWHzl, c06031, this) == objCopydefault) {
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
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC47776twW activityC47776twW = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC47776twW, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC47776twW, state, anonymousClass1, this) == objCopydefault) {
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
