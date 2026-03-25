package com.okinc.cruilib.compose.modifier;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes23.dex */
public final class TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedSize;
    final /* synthetic */ float $targetSize;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$1(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$1> continuation) {
        super(2, continuation);
        this.$animatedSize = animatable;
        this.$targetSize = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$1(this.$animatedSize, this.$targetSize, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$animatedSize;
            Float fOLrzqt = C56443yFo.OLrzqt(this.$targetSize);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(100, 0, null, 6, null);
            this.label = 1;
            if (Animatable.animateTo$default(animatable, fOLrzqt, tweenSpecTween$default, null, null, this, 12, null) == objCopydefault) {
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
