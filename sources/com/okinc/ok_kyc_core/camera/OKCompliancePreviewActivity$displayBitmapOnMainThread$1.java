package com.okinc.ok_kyc_core.camera;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC43724rug;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCompliancePreviewActivity$displayBitmapOnMainThread$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;
    final /* synthetic */ ActivityC43724rug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCompliancePreviewActivity$displayBitmapOnMainThread$1(ActivityC43724rug activityC43724rug, Bitmap bitmap, Continuation<? super OKCompliancePreviewActivity$displayBitmapOnMainThread$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC43724rug;
        this.$bitmap = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKCompliancePreviewActivity$displayBitmapOnMainThread$1(this.this$0, this.$bitmap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCompliancePreviewActivity$displayBitmapOnMainThread$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC43724rug.TaskDescription taskDescription = this.this$0.EZpvd;
            if (taskDescription == null) {
                Intrinsics.gEmmrt("");
                taskDescription = null;
            }
            taskDescription.KWHzl(this.$bitmap);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
