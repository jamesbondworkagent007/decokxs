package com.okinc.planet.biz_content.input;

import android.content.Context;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_content.input.GenericInputViewModel$startUpload$3;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.UploadState;
import com.okinc.planet.domain.usecase.SingleFileUploadUseCase;
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
public final class GenericInputViewModel$startUpload$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $id;
    final /* synthetic */ ImageItem $target;
    int label;
    final /* synthetic */ C47546tsE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericInputViewModel$startUpload$3(String str, C47546tsE c47546tsE, ImageItem imageItem, Context context, Continuation<? super GenericInputViewModel$startUpload$3> continuation) {
        super(2, continuation);
        this.$id = str;
        this.this$0 = c47546tsE;
        this.$target = imageItem;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericInputViewModel$startUpload$3(this.$id, this.this$0, this.$target, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericInputViewModel$startUpload$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                GenericInputViewModel$startUpload$3$result$1 genericInputViewModel$startUpload$3$result$1 = new GenericInputViewModel$startUpload$3$result$1(this.this$0, this.$context, this.$target, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, genericInputViewModel$startUpload$3$result$1, this);
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
            final SingleFileUploadUseCase.UploadedFile uploadedFile = (SingleFileUploadUseCase.UploadedFile) pair.component1();
            String str = (String) pair.component2();
            if (uploadedFile != null) {
                pUU.KWHzl("PlanetUpload", "id=" + this.$id + " success url=" + uploadedFile.getImagePath());
                this.this$0.EZpvd(this.$target, (Function1<? super ImageItem, ImageItem>) new Function1() { // from class: o.tsH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return GenericInputViewModel$startUpload$3.invokeSuspend$lambda$0(uploadedFile, (ImageItem) obj2);
                    }
                });
            } else {
                C32866mlf.onEvent$default("Feeds_Mid_ImageUploadFail_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                pUU.copydefault("PlanetUpload", "id=" + this.$id + " failed: uploaded is null, error=" + str);
                this.this$0.EZpvd(this.$target, (Function1<? super ImageItem, ImageItem>) new Function1() { // from class: o.tsJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return GenericInputViewModel$startUpload$3.invokeSuspend$lambda$1((ImageItem) obj2);
                    }
                });
            }
        } catch (Throwable th) {
            C32866mlf.onEvent$default("Feeds_Mid_ImageUploadFail_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            pUU.copydefault("PlanetUpload", "id=" + this.$id + " exception=" + th);
            this.this$0.EZpvd(this.$target, (Function1<? super ImageItem, ImageItem>) new Function1() { // from class: o.tsG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return GenericInputViewModel$startUpload$3.invokeSuspend$lambda$2((ImageItem) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageItem invokeSuspend$lambda$0(SingleFileUploadUseCase.UploadedFile uploadedFile, ImageItem imageItem) {
        return imageItem.copy((2039 & 1) != 0 ? imageItem.id : null, (2039 & 2) != 0 ? imageItem.localUri : null, (2039 & 4) != 0 ? imageItem.bitmapKey : null, (2039 & 8) != 0 ? imageItem.uploadState : UploadState.Success, (2039 & 16) != 0 ? imageItem.remoteUrl : uploadedFile.getImagePath(), (2039 & 32) != 0 ? imageItem.netPathUrl : null, (2039 & 64) != 0 ? imageItem.width : uploadedFile.getWidth(), (2039 & 128) != 0 ? imageItem.height : uploadedFile.getHeight(), (2039 & 256) != 0 ? imageItem.isLoadSuccess : null, (2039 & 512) != 0 ? imageItem.filePath : null, (2039 & 1024) != 0 ? imageItem.fileSize : uploadedFile.getFileSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageItem invokeSuspend$lambda$1(ImageItem imageItem) {
        return imageItem.copy((2039 & 1) != 0 ? imageItem.id : null, (2039 & 2) != 0 ? imageItem.localUri : null, (2039 & 4) != 0 ? imageItem.bitmapKey : null, (2039 & 8) != 0 ? imageItem.uploadState : UploadState.Failed, (2039 & 16) != 0 ? imageItem.remoteUrl : null, (2039 & 32) != 0 ? imageItem.netPathUrl : null, (2039 & 64) != 0 ? imageItem.width : null, (2039 & 128) != 0 ? imageItem.height : null, (2039 & 256) != 0 ? imageItem.isLoadSuccess : null, (2039 & 512) != 0 ? imageItem.filePath : null, (2039 & 1024) != 0 ? imageItem.fileSize : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageItem invokeSuspend$lambda$2(ImageItem imageItem) {
        return imageItem.copy((2039 & 1) != 0 ? imageItem.id : null, (2039 & 2) != 0 ? imageItem.localUri : null, (2039 & 4) != 0 ? imageItem.bitmapKey : null, (2039 & 8) != 0 ? imageItem.uploadState : UploadState.Failed, (2039 & 16) != 0 ? imageItem.remoteUrl : null, (2039 & 32) != 0 ? imageItem.netPathUrl : null, (2039 & 64) != 0 ? imageItem.width : null, (2039 & 128) != 0 ? imageItem.height : null, (2039 & 256) != 0 ? imageItem.isLoadSuccess : null, (2039 & 512) != 0 ? imageItem.filePath : null, (2039 & 1024) != 0 ? imageItem.fileSize : null);
    }
}
