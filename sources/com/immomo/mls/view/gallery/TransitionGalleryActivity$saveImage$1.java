package com.immomo.mls.view.gallery;

import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.ActivityC7885asK;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C7343ahz;

/* JADX INFO: loaded from: classes17.dex */
public final class TransitionGalleryActivity$saveImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ ActivityC7885asK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionGalleryActivity$saveImage$1(ActivityC7885asK activityC7885asK, String str, Continuation<? super TransitionGalleryActivity$saveImage$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC7885asK;
        this.$url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransitionGalleryActivity$saveImage$1(this.this$0, this.$url, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransitionGalleryActivity$saveImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strBuildDisplayName$default = ActivityC7885asK.buildDisplayName$default(this.this$0, this.$url, null, 2, null);
            if (this.this$0.copydefault(strBuildDisplayName$default) != null) {
                C55326xho.toastWithSuccessfulIcon$default(C7343ahz.Fragment.djBIcL, 0, 1, (Object) null);
                return Unit.INSTANCE;
            }
            CoroutineDispatcher io2 = Dispatchers.getIO();
            TransitionGalleryActivity$saveImage$1$uri$1 transitionGalleryActivity$saveImage$1$uri$1 = new TransitionGalleryActivity$saveImage$1$uri$1(this.this$0, this.$url, strBuildDisplayName$default, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, transitionGalleryActivity$saveImage$1$uri$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Uri) obj) != null) {
            C55326xho.toastWithSuccessfulIcon$default(C7343ahz.Fragment.djBIcL, 0, 1, (Object) null);
        } else {
            C55326xho.toastWithFailedIcon$default(C7343ahz.Fragment.values, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
