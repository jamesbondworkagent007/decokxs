package com.immomo.mls.view.gallery;

import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC7885asK;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes17.dex */
public final class TransitionGalleryActivity$saveImage$1$uri$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ String $displayName;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ ActivityC7885asK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionGalleryActivity$saveImage$1$uri$1(ActivityC7885asK activityC7885asK, String str, String str2, Continuation<? super TransitionGalleryActivity$saveImage$1$uri$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC7885asK;
        this.$url = str;
        this.$displayName = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransitionGalleryActivity$saveImage$1$uri$1(this.this$0, this.$url, this.$displayName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((TransitionGalleryActivity$saveImage$1$uri$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.KWHzl(this.$url, this.$displayName);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
