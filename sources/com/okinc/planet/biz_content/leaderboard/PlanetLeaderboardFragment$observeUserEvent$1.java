package com.okinc.planet.biz_content.leaderboard;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC47263tmj;
import o.C47599ttE;
import o.C47608ttN;
import o.C47644ttx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46387tSl;
import o.pUU;
import o.tNQ;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetLeaderboardFragment$observeUserEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47599ttE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetLeaderboardFragment$observeUserEvent$1(C47599ttE c47599ttE, Continuation<? super PlanetLeaderboardFragment$observeUserEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c47599ttE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetLeaderboardFragment$observeUserEvent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetLeaderboardFragment$observeUserEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeUserEvent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C47599ttE this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47599ttE c47599ttE, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47599ttE;
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
                Flow<AbstractC47263tmj> flowAkhnZx = InterfaceC46387tSl.Companion.KWHzl().AkhnZx();
                C05951 c05951 = new C05951(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAkhnZx, c05951, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeUserEvent$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05951 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C47599ttE this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05951(C47599ttE c47599ttE, Continuation<? super C05951> continuation) {
                super(2, continuation);
                this.this$0 = c47599ttE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05951 c05951 = new C05951(this.this$0, continuation);
                c05951.L$0 = obj;
                return c05951;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
                return ((C05951) create(abstractC47263tmj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                FrameLayout frameLayout;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AbstractC47263tmj abstractC47263tmj = (AbstractC47263tmj) this.L$0;
                    pUU.EZpvd("PlanetLeaderboardFragment", "Collected user event: " + abstractC47263tmj);
                    if (abstractC47263tmj instanceof AbstractC47263tmj.Activity) {
                        this.this$0.AYXKKw().OLrzqt(false);
                        tNQ tnq = this.this$0.OLrzqt;
                        if (tnq != null && (frameLayout = tnq.KWHzl) != null) {
                            frameLayout.setVisibility(8);
                        }
                    } else if (((abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator) || (abstractC47263tmj instanceof AbstractC47263tmj.ActionBar)) && this.this$0.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        Fragment fragmentFindFragmentByTag = this.this$0.getChildFragmentManager().findFragmentByTag("PlanetFollowingFragment");
                        C47644ttx c47644ttx = fragmentFindFragmentByTag instanceof C47644ttx ? (C47644ttx) fragmentFindFragmentByTag : null;
                        if (c47644ttx != null) {
                            c47644ttx.AYXKKw();
                        }
                        Fragment fragmentFindFragmentByTag2 = this.this$0.getChildFragmentManager().findFragmentByTag("PlanetTopOrbitersFragment");
                        C47608ttN c47608ttN = fragmentFindFragmentByTag2 instanceof C47608ttN ? (C47608ttN) fragmentFindFragmentByTag2 : null;
                        if (c47608ttN != null) {
                            c47608ttN.AEQbTJ();
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
