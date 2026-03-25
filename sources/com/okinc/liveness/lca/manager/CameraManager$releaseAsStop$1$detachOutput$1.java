package com.okinc.liveness.lca.manager;

import com.amplifyframework.ui.liveness.camera.OpenGLRenderer;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class CameraManager$releaseAsStop$1$detachOutput$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableFuture<Void>>, Object> {
    int label;
    final /* synthetic */ CameraManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraManager$releaseAsStop$1$detachOutput$1(CameraManager cameraManager, Continuation<? super CameraManager$releaseAsStop$1$detachOutput$1> continuation) {
        super(2, continuation);
        this.this$0 = cameraManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraManager$releaseAsStop$1$detachOutput$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableFuture<Void>> continuation) {
        return ((CameraManager$releaseAsStop$1$detachOutput$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OpenGLRenderer openGLRenderer = this.this$0.renderer;
            if (openGLRenderer != null) {
                return openGLRenderer.detachOutputSurface();
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
