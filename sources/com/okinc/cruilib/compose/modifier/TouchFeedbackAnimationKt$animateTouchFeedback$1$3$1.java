package com.okinc.cruilib.compose.modifier;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mFC;
import o.mHZ;

/* JADX INFO: loaded from: classes23.dex */
public final class TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedAlpha;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedSize;
    final /* synthetic */ int $animationOptions;
    final /* synthetic */ CoroutineScope $scope;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1(int i, CoroutineScope coroutineScope, Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Continuation<? super TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1> continuation) {
        super(2, continuation);
        this.$animationOptions = i;
        this.$scope = coroutineScope;
        this.$animatedSize = animatable;
        this.$animatedAlpha = animatable2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1 touchFeedbackAnimationKt$animateTouchFeedback$1$3$1 = new TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1(this.$animationOptions, this.$scope, this.$animatedSize, this.$animatedAlpha, continuation);
        touchFeedbackAnimationKt$animateTouchFeedback$1$3$1.L$0 = obj;
        return touchFeedbackAnimationKt$animateTouchFeedback$1$3$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.cruilib.compose.modifier.TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedAlpha;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedSize;
        final /* synthetic */ int $animationOptions;
        final /* synthetic */ CoroutineScope $scope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, CoroutineScope coroutineScope, Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$animationOptions = i;
            this.$scope = coroutineScope;
            this.$animatedSize = animatable;
            this.$animatedAlpha = animatable2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationOptions, this.$scope, this.$animatedSize, this.$animatedAlpha, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AwaitPointerEventScope awaitPointerEventScope;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 3, null) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    mFC.Application.AEQbTJ(this.$animationOptions, this.$scope, this.$animatedSize, this.$animatedAlpha, 1.0f, 0.0f);
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            int i2 = this.$animationOptions;
            mFC.Application.AEQbTJ(i2, this.$scope, this.$animatedSize, this.$animatedAlpha, mHZ.Companion.EZpvd(i2, 2) ? 0.9f : 0.97f, 1.0f);
            this.L$0 = null;
            this.label = 2;
            if (TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null) == objCopydefault) {
                return objCopydefault;
            }
            mFC.Application.AEQbTJ(this.$animationOptions, this.$scope, this.$animatedSize, this.$animatedAlpha, 1.0f, 0.0f);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationOptions, this.$scope, this.$animatedSize, this.$animatedAlpha, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == objCopydefault) {
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
