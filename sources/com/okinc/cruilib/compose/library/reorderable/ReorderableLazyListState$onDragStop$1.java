package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mEL;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableLazyListState$onDragStop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $startOffset;
    int label;
    final /* synthetic */ mEL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableLazyListState$onDragStop$1(mEL mel, float f, Continuation<? super ReorderableLazyListState$onDragStop$1> continuation) {
        super(2, continuation);
        this.this$0 = mel;
        this.$startOffset = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableLazyListState$onDragStop$1(this.this$0, this.$startOffset, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableLazyListState$onDragStop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Animatable<Float, AnimationVector1D> animatableValueOf = this.this$0.valueOf();
            Float fOLrzqt = C56443yFo.OLrzqt(this.$startOffset);
            this.label = 1;
            if (animatableValueOf.snapTo(fOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl((Object) null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Animatable<Float, AnimationVector1D> animatableValueOf2 = this.this$0.valueOf();
        Float fOLrzqt2 = C56443yFo.OLrzqt(0.0f);
        SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 400.0f, C56443yFo.OLrzqt(1.0f), 1, null);
        this.label = 2;
        if (Animatable.animateTo$default(animatableValueOf2, fOLrzqt2, springSpecSpring$default, null, null, this, 12, null) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.KWHzl((Object) null);
        return Unit.INSTANCE;
    }
}
