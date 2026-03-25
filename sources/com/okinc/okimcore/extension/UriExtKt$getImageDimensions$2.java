package com.okinc.okimcore.extension;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.InputStream;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44165sFs;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yFA;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$getImageDimensions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C44165sFs>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_getImageDimensions;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$getImageDimensions$2(Context context, Uri uri, Continuation<? super UriExtKt$getImageDimensions$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$this_getImageDimensions = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$getImageDimensions$2 uriExtKt$getImageDimensions$2 = new UriExtKt$getImageDimensions$2(this.$context, this.$this_getImageDimensions, continuation);
        uriExtKt$getImageDimensions$2.L$0 = obj;
        return uriExtKt$getImageDimensions$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C44165sFs> continuation) {
        return ((UriExtKt$getImageDimensions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C44165sFs c44165sFs;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ContentResolver contentResolver = this.$context.getContentResolver();
            Uri uri = this.$this_getImageDimensions;
            try {
                Result.Application application = Result.Companion;
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        c44165sFs = (options.outWidth <= 0 || options.outHeight <= 0) ? null : new C44165sFs(options.outWidth, options.outHeight);
                        yFA.copydefault(inputStreamOpenInputStream, null);
                    } finally {
                    }
                } else {
                    c44165sFs = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(c44165sFs);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("UriExt", "Unexpected error for URI: " + coroutineScope, thM7380exceptionOrNullimpl);
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                return null;
            }
            return objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
