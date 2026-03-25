package com.okinc.business.market.features.scanner.trench;

import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C22416heu;
import o.C29366ksL;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28695kfd;
import o.hBY;

/* JADX INFO: loaded from: classes7.dex */
public final class TrenchContainerFragment$updatePausePlayButtonVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $tabIndex;
    int label;
    final /* synthetic */ C29366ksL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrenchContainerFragment$updatePausePlayButtonVisibility$1(C29366ksL c29366ksL, int i, Continuation<? super TrenchContainerFragment$updatePausePlayButtonVisibility$1> continuation) {
        super(2, continuation);
        this.this$0 = c29366ksL;
        this.$tabIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrenchContainerFragment$updatePausePlayButtonVisibility$1(this.this$0, this.$tabIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrenchContainerFragment$updatePausePlayButtonVisibility$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.trench.TrenchContainerFragment$updatePausePlayButtonVisibility$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $tabIndex;
        int label;
        final /* synthetic */ C29366ksL this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C29366ksL c29366ksL, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c29366ksL;
            this.$tabIndex = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$tabIndex, continuation);
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
                StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(this.this$0.AYXKKw().copydefault(), this.$tabIndex);
                if (stateFlow == null) {
                    return Unit.INSTANCE;
                }
                final C29366ksL c29366ksL = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.scanner.trench.TrenchContainerFragment.updatePausePlayButtonVisibility.1.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC28695kfd interfaceC28695kfd, Continuation<? super Unit> continuation) {
                        hBY hby = c29366ksL.gEmmrt;
                        if (hby != null) {
                            if (C22416heu.ejfBZ()) {
                                ImageView imageView = hby.djBIcL;
                                Intrinsics.checkNotNullExpressionValue(imageView, "");
                                imageView.setVisibility(0);
                                LottieAnimationView lottieAnimationView = hby.AEQbTJ;
                                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
                                lottieAnimationView.setVisibility(8);
                                return Unit.INSTANCE;
                            }
                            if (Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.ActionBar.KWHzl) || Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.Activity.copydefault)) {
                                ImageView imageView2 = hby.djBIcL;
                                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                                imageView2.setVisibility(8);
                                LottieAnimationView lottieAnimationView2 = hby.AEQbTJ;
                                Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
                                lottieAnimationView2.setVisibility(0);
                            } else {
                                if (!Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.Application.EZpvd) && !Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.StateListAnimator.OLrzqt)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ImageView imageView3 = hby.djBIcL;
                                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                                imageView3.setVisibility(0);
                                LottieAnimationView lottieAnimationView3 = hby.AEQbTJ;
                                Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
                                lottieAnimationView3.setVisibility(8);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == objCopydefault) {
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
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$tabIndex, null);
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
