package com.okinc.okimcore.extension;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$getMediaDuration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_getMediaDuration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$getMediaDuration$2(Context context, Uri uri, Continuation<? super UriExtKt$getMediaDuration$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$this_getMediaDuration = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$getMediaDuration$2 uriExtKt$getMediaDuration$2 = new UriExtKt$getMediaDuration$2(this.$context, this.$this_getMediaDuration, continuation);
        uriExtKt$getMediaDuration$2.L$0 = obj;
        return uriExtKt$getMediaDuration$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((UriExtKt$getMediaDuration$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Long fieldNames;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = -1;
            Context context = this.$context;
            Uri uri = this.$this_getMediaDuration;
            try {
                Result.Application application = Result.Companion;
                mediaMetadataRetriever.setDataSource(context, uri);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long jLongValue = (strExtractMetadata == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strExtractMetadata)) == null) ? -1L : fieldNames.longValue();
                if (jLongValue != -1) {
                    intRef.element = (int) (jLongValue / ((long) 1000));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("UriExt", "Error retrieving video duration for URI: " + coroutineScope + "@getVideoDuration: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                intRef.element = -1;
            }
            mediaMetadataRetriever.release();
            return C56443yFo.AEQbTJ(intRef.element);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
