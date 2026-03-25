package com.okinc.okimcore.extension;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$getVideoMimeType$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_getVideoMimeType;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$getVideoMimeType$2(Context context, Uri uri, Continuation<? super UriExtKt$getVideoMimeType$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$this_getVideoMimeType = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$getVideoMimeType$2 uriExtKt$getVideoMimeType$2 = new UriExtKt$getVideoMimeType$2(this.$context, this.$this_getVideoMimeType, continuation);
        uriExtKt$getVideoMimeType$2.L$0 = obj;
        return uriExtKt$getVideoMimeType$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((UriExtKt$getVideoMimeType$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            Context context = this.$context;
            Uri uri = this.$this_getVideoMimeType;
            try {
                Result.Application application = Result.Companion;
                mediaMetadataRetriever.setDataSource(context, uri);
                objM7377constructorimpl = Result.m7377constructorimpl(mediaMetadataRetriever.extractMetadata(12));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.EZpvd("UriExt", "Failed to get video MIME type for URI: " + coroutineScope + "@getVideoMimeType, error: " + thM7380exceptionOrNullimpl.getMessage());
            }
            mediaMetadataRetriever.release();
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                return null;
            }
            return objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
