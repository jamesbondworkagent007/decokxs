package com.okinc.planet.biz_content.input;

import android.content.Context;
import android.graphics.Bitmap;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.domain.usecase.SingleFileUploadUseCase;
import com.okinc.planet_api.ActivityCardImage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C32866mlf;
import o.C47546tsE;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class GenericInputViewModel$activityImageUpload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Function1<SingleFileUploadUseCase.UploadedFile, Unit> $callback;
    final /* synthetic */ Context $context;
    final /* synthetic */ ActivityCardImage $image;
    int label;
    final /* synthetic */ C47546tsE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.domain.usecase.SingleFileUploadUseCase$UploadedFile, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GenericInputViewModel$activityImageUpload$1(ActivityCardImage activityCardImage, Function1<? super SingleFileUploadUseCase.UploadedFile, Unit> function1, C47546tsE c47546tsE, Context context, Bitmap bitmap, Continuation<? super GenericInputViewModel$activityImageUpload$1> continuation) {
        super(2, continuation);
        this.$image = activityCardImage;
        this.$callback = function1;
        this.this$0 = c47546tsE;
        this.$context = context;
        this.$bitmap = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericInputViewModel$activityImageUpload$1(this.$image, this.$callback, this.this$0, this.$context, this.$bitmap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericInputViewModel$activityImageUpload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("PlanetUpload", "startUpload activity image path=" + this.$image.getValue());
                CoroutineDispatcher io2 = Dispatchers.getIO();
                GenericInputViewModel$activityImageUpload$1$result$1 genericInputViewModel$activityImageUpload$1$result$1 = new GenericInputViewModel$activityImageUpload$1$result$1(this.$image, this.this$0, this.$context, this.$bitmap, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, genericInputViewModel$activityImageUpload$1$result$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Pair pair = (Pair) obj;
            SingleFileUploadUseCase.UploadedFile uploadedFile = (SingleFileUploadUseCase.UploadedFile) pair.component1();
            String str = (String) pair.component2();
            if (uploadedFile != null) {
                pUU.KWHzl("PlanetUpload", "activity image success url=" + uploadedFile.getImagePath());
                this.$callback.invoke(uploadedFile);
            } else {
                C32866mlf.onEvent$default("Feeds_Mid_ImageUploadFail_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                pUU.copydefault("PlanetUpload", "activity image failed: uploaded is null, error=" + str);
                this.$callback.invoke(null);
            }
        } catch (Throwable th) {
            C32866mlf.onEvent$default("Feeds_Mid_ImageUploadFail_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            pUU.copydefault("PlanetUpload", "activity image exception=" + th);
            this.$callback.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
