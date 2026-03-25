package com.okinc.planet.biz_content.input;

import android.content.Context;
import android.graphics.Bitmap;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.UploadState;
import com.okinc.planet.domain.usecase.SingleFileUploadUseCase;
import com.okinc.planet_api.ActivityCardImage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C47546tsE;
import o.C56391yDq;
import o.C56442yFn;
import o.tTQ;

/* JADX INFO: loaded from: classes19.dex */
public final class GenericInputViewModel$activityImageUpload$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends SingleFileUploadUseCase.UploadedFile, ? extends String>>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Context $context;
    final /* synthetic */ ActivityCardImage $image;
    int label;
    final /* synthetic */ C47546tsE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericInputViewModel$activityImageUpload$1$result$1(ActivityCardImage activityCardImage, C47546tsE c47546tsE, Context context, Bitmap bitmap, Continuation<? super GenericInputViewModel$activityImageUpload$1$result$1> continuation) {
        super(2, continuation);
        this.$image = activityCardImage;
        this.this$0 = c47546tsE;
        this.$context = context;
        this.$bitmap = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericInputViewModel$activityImageUpload$1$result$1(this.$image, this.this$0, this.$context, this.$bitmap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends SingleFileUploadUseCase.UploadedFile, ? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<SingleFileUploadUseCase.UploadedFile, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<SingleFileUploadUseCase.UploadedFile, String>> continuation) {
        return ((GenericInputViewModel$activityImageUpload$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        ImageItem imageItem = new ImageItem(null, null, null, UploadState.Uploading, null, null, null, null, null, Intrinsics.EZpvd((Object) this.$image.getType(), (Object) "local_path") ? this.$image.getValue() : null, null, 1527, null);
        SingleFileUploadUseCase singleFileUploadUseCase = this.this$0.gEmmrt;
        Context applicationContext = this.$context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        byte[] bArrCopydefault = Intrinsics.EZpvd((Object) this.$image.getType(), (Object) "base64") ? tTQ.OLrzqt.copydefault(this.$image.getValue()) : null;
        Bitmap bitmap = this.$bitmap;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        this.label = 1;
        Object objAEQbTJ = singleFileUploadUseCase.AEQbTJ(applicationContext, imageItem, bArrCopydefault, bitmap, anonymousClass1, this);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.input.GenericInputViewModel$activityImageUpload$1$result$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
    }
}
