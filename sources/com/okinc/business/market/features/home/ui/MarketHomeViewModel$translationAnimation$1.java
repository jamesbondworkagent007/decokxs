package com.okinc.business.market.features.home.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.okinc.business.market.features.home.ui.MarketHomeViewModel$translationAnimation$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketHomeViewModel$translationAnimation$1 extends SuspendLambda implements Function2<ProducerScope<? super Float>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeViewModel$translationAnimation$1(long j, Continuation<? super MarketHomeViewModel$translationAnimation$1> continuation) {
        super(2, continuation);
        this.$duration = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeViewModel$translationAnimation$1 marketHomeViewModel$translationAnimation$1 = new MarketHomeViewModel$translationAnimation$1(this.$duration, continuation);
        marketHomeViewModel$translationAnimation$1.L$0 = obj;
        return marketHomeViewModel$translationAnimation$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Float> producerScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeViewModel$translationAnimation$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ ProducerScope KWHzl;
        public final /* synthetic */ ProducerScope copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar(ProducerScope producerScope, ProducerScope producerScope2) {
            this.copydefault = producerScope;
            this.KWHzl = producerScope2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            SendChannel.DefaultImpls.close$default(this.copydefault, null, 1, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            SendChannel.DefaultImpls.close$default(this.KWHzl, null, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(this.$duration);
            Intrinsics.copydefault(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new ActionBar(producerScope, producerScope));
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.kaA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    MarketHomeViewModel$translationAnimation$1.invokeSuspend$lambda$2(producerScope, valueAnimator);
                }
            });
            valueAnimatorOfFloat.start();
            Function0 function0 = new Function0() { // from class: o.kaH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketHomeViewModel$translationAnimation$1.invokeSuspend$lambda$3(valueAnimatorOfFloat);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(ProducerScope producerScope, ValueAnimator valueAnimator) {
        producerScope.mo5769trySendJP2dKIU(Float.valueOf(valueAnimator.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(ValueAnimator valueAnimator) {
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        return Unit.INSTANCE;
    }
}
