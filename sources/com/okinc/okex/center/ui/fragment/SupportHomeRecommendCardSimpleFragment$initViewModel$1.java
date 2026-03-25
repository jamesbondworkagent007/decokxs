package com.okinc.okex.center.ui.fragment;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC47343toJ;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportHomeRecommendCardSimpleFragment$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SupportHomeRecommendCardSimpleFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportHomeRecommendCardSimpleFragment$initViewModel$1(SupportHomeRecommendCardSimpleFragment supportHomeRecommendCardSimpleFragment, Continuation<? super SupportHomeRecommendCardSimpleFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = supportHomeRecommendCardSimpleFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportHomeRecommendCardSimpleFragment$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportHomeRecommendCardSimpleFragment$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportHomeRecommendCardSimpleFragment$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SupportHomeRecommendCardSimpleFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SupportHomeRecommendCardSimpleFragment supportHomeRecommendCardSimpleFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = supportHomeRecommendCardSimpleFragment;
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

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportHomeRecommendCardSimpleFragment$initViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05381 extends SuspendLambda implements Function2<SupportCenterHomeViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SupportHomeRecommendCardSimpleFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05381(SupportHomeRecommendCardSimpleFragment supportHomeRecommendCardSimpleFragment, Continuation<? super C05381> continuation) {
                super(2, continuation);
                this.this$0 = supportHomeRecommendCardSimpleFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05381 c05381 = new C05381(this.this$0, continuation);
                c05381.L$0 = obj;
                return c05381;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportCenterHomeViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                return ((C05381) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                View root;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SupportCenterHomeViewModel.StateListAnimator stateListAnimator = (SupportCenterHomeViewModel.StateListAnimator) this.L$0;
                    if (stateListAnimator instanceof SupportCenterHomeViewModel.StateListAnimator.Activity) {
                        AbstractC47343toJ abstractC47343toJGEmmrt = this.this$0.gEmmrt();
                        if (abstractC47343toJGEmmrt != null && abstractC47343toJGEmmrt.KWHzl != null) {
                            SupportHomeRecommendCardSimpleFragment supportHomeRecommendCardSimpleFragment = this.this$0;
                            SupportCenterHomeViewModel.StateListAnimator.Activity activity = (SupportCenterHomeViewModel.StateListAnimator.Activity) stateListAnimator;
                            if (!activity.EZpvd().isEmpty()) {
                                AbstractC47343toJ abstractC47343toJGEmmrt2 = supportHomeRecommendCardSimpleFragment.gEmmrt();
                                if (abstractC47343toJGEmmrt2 != null && (root = abstractC47343toJGEmmrt2.getRoot()) != null) {
                                    root.setVisibility(0);
                                }
                                supportHomeRecommendCardSimpleFragment.djBIcL().KWHzl(activity.EZpvd());
                                rVN.reportFullyDrawn$default((Fragment) supportHomeRecommendCardSimpleFragment, true, (String) null, 2, (Object) null);
                            } else {
                                supportHomeRecommendCardSimpleFragment.djBIcL().EZpvd();
                            }
                        }
                    } else {
                        this.this$0.djBIcL().EZpvd();
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
                StateFlow<SupportCenterHomeViewModel.StateListAnimator> stateFlowDjBIcL = this.this$0.AYXKKw().djBIcL();
                C05381 c05381 = new C05381(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowDjBIcL, c05381, this) == objCopydefault) {
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
            SupportHomeRecommendCardSimpleFragment supportHomeRecommendCardSimpleFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(supportHomeRecommendCardSimpleFragment, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(supportHomeRecommendCardSimpleFragment, state, anonymousClass1, this) == objCopydefault) {
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
