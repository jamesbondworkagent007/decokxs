package com.okinc.okex.uploadlog.usecase;

import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44086sCv;
import o.C45307snN;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadAttachmentUseCase$buildLoadingModel$filename$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ C44086sCv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadAttachmentUseCase$buildLoadingModel$filename$1(Uri uri, C44086sCv c44086sCv, Continuation<? super UploadAttachmentUseCase$buildLoadingModel$filename$1> continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.this$0 = c44086sCv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadAttachmentUseCase$buildLoadingModel$filename$1(this.$uri, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((UploadAttachmentUseCase$buildLoadingModel$filename$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C45307snN.copydefault(this.$uri, this.this$0.copydefault).getFirst();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
