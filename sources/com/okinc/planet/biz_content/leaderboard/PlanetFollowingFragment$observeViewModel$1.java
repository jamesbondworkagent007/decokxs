package com.okinc.planet.biz_content.leaderboard;

import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.planet.biz_content.leaderboard.bean.FollowingUser;
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
import o.C47644ttx;
import o.C47699tuz;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.tNL;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetFollowingFragment$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47644ttx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetFollowingFragment$observeViewModel$1(C47644ttx c47644ttx, Continuation<? super PlanetFollowingFragment$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c47644ttx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetFollowingFragment$observeViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetFollowingFragment$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$observeViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C47644ttx this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47644ttx c47644ttx, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47644ttx;
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$observeViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C47644ttx this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05911(C47644ttx c47644ttx, Continuation<? super C05911> continuation) {
                super(2, continuation);
                this.this$0 = c47644ttx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05911(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow<List<FollowingUser>> sharedFlowEZpvd = this.this$0.EZpvd().EZpvd();
                    final C47644ttx c47644ttx = this.this$0;
                    FlowCollector<? super List<FollowingUser>> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment.observeViewModel.1.1.1.3
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                        public final Object emit(List<FollowingUser> list, Continuation<? super Unit> continuation) {
                            LinearLayout linearLayout;
                            LinearLayout linearLayout2;
                            LottieAnimationView lottieAnimationView;
                            LottieAnimationView lottieAnimationView2;
                            tNL tnl = c47644ttx.AEQbTJ;
                            if (tnl != null && (lottieAnimationView2 = tnl.copydefault) != null) {
                                lottieAnimationView2.cancelAnimation();
                            }
                            tNL tnl2 = c47644ttx.AEQbTJ;
                            if (tnl2 != null && (lottieAnimationView = tnl2.copydefault) != null) {
                                lottieAnimationView.setVisibility(8);
                            }
                            boolean zKWHzl = C33129mqd.KWHzl((Collection) list);
                            c47644ttx.OLrzqt().KWHzl(zKWHzl, true);
                            if (zKWHzl) {
                                tNL tnl3 = c47644ttx.AEQbTJ;
                                if (tnl3 != null && (linearLayout2 = tnl3.EZpvd) != null) {
                                    linearLayout2.setVisibility(0);
                                }
                                C47699tuz c47699tuzAEQbTJ = c47644ttx.AEQbTJ();
                                Intrinsics.copydefault(list);
                                c47699tuzAEQbTJ.KWHzl(list);
                                c47644ttx.AEQbTJ().EZpvd(true);
                            } else {
                                tNL tnl4 = c47644ttx.AEQbTJ;
                                if (tnl4 != null && (linearLayout = tnl4.EZpvd) != null) {
                                    linearLayout.setVisibility(8);
                                }
                                c47644ttx.AEQbTJ().KWHzl(yDY.AhwBna());
                            }
                            if (!c47644ttx.KWHzl) {
                                c47644ttx.KWHzl = true;
                                rVN.reportFullyDrawn$default((Fragment) c47644ttx, true, (String) null, 2, (Object) null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (sharedFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C05911(this.this$0, null), 3, null);
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
