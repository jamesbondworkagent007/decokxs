package com.amplifyframework.ui.liveness.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes2.dex */
public final class FaceLivenessDetectorKt$FaceLivenessDetector$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Consumer<FaceLivenessDetectionException>> $currentOnError$delegate;
    final /* synthetic */ MutableState<Boolean> $isFinished$delegate;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.compose.runtime.State<? extends com.amplifyframework.core.Consumer<com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceLivenessDetectorKt$FaceLivenessDetector$3$1(MutableState<Boolean> mutableState, State<? extends Consumer<FaceLivenessDetectionException>> state, Continuation<? super FaceLivenessDetectorKt$FaceLivenessDetector$3$1> continuation) {
        super(2, continuation);
        this.$isFinished$delegate = mutableState;
        this.$currentOnError$delegate = state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceLivenessDetectorKt$FaceLivenessDetector$3$1(this.$isFinished$delegate, this.$currentOnError$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceLivenessDetectorKt$FaceLivenessDetector$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FaceLivenessDetectorKt.FaceLivenessDetector$lambda$2(this.$isFinished$delegate, true);
            FaceLivenessDetectorKt.FaceLivenessDetector$lambda$7(this.$currentOnError$delegate).accept(new FaceLivenessDetectionException.SessionNotFoundException("Session ID cannot be empty.", null, null, 6, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
