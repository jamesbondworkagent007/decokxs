package com.okinc.okimcore.extension;

import android.content.Context;
import android.net.Uri;
import com.okinc.okimcore.extension.UriExtKt$getMimeTypeFromMagicBytes$2;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56529yIt;
import o.pUU;
import o.yDV;
import o.yFA;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$getMimeTypeFromMagicBytes$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_getMimeTypeFromMagicBytes;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$getMimeTypeFromMagicBytes$2(Context context, Uri uri, Continuation<? super UriExtKt$getMimeTypeFromMagicBytes$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$this_getMimeTypeFromMagicBytes = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$getMimeTypeFromMagicBytes$2 uriExtKt$getMimeTypeFromMagicBytes$2 = new UriExtKt$getMimeTypeFromMagicBytes$2(this.$context, this.$this_getMimeTypeFromMagicBytes, continuation);
        uriExtKt$getMimeTypeFromMagicBytes$2.L$0 = obj;
        return uriExtKt$getMimeTypeFromMagicBytes$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((UriExtKt$getMimeTypeFromMagicBytes$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object objM7377constructorimpl;
        InputStream inputStreamOpenInputStream;
        String str;
        Throwable th;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Context context = this.$context;
            Uri uri = this.$this_getMimeTypeFromMagicBytes;
            try {
                Result.Application application = Result.Companion;
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Throwable th2) {
                th = th2;
                obj2 = null;
            }
            try {
                if (inputStreamOpenInputStream != null) {
                    try {
                        byte[] bArr = new byte[12];
                        int i = inputStreamOpenInputStream.read(bArr);
                        try {
                            if (i < 12) {
                                pUU.EZpvd("UriExt", "getMimeTypeFromMagicBytes: File too small, only " + i + " bytes read");
                                str = null;
                            } else {
                                byte b = bArr[0];
                                str = (b == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) ? "image/webp" : (b == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) ? "image/png" : (b == -1 && bArr[1] == -40 && bArr[2] == -1) ? "image/jpeg" : (b == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56) ? "image/gif" : (b == 66 && bArr[1] == 77) ? "image/bmp" : null;
                                pUU.EZpvd("UriExt", "getMimeTypeFromMagicBytes: Detected '" + str + "' from magic bytes [" + CollectionsKt___CollectionsKt.joinToString$default(yDV.KWHzl(bArr, 4), null, null, null, 0, null, new Function1() { // from class: o.sFy
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return UriExtKt$getMimeTypeFromMagicBytes$2.invokeSuspend$lambda$2$lambda$1$lambda$0(((java.lang.Byte) obj3).byteValue());
                                    }
                                }, 31, null) + "...]");
                            }
                            obj2 = null;
                            yFA.copydefault(inputStreamOpenInputStream, null);
                        } catch (Throwable th3) {
                            th = th3;
                            obj2 = null;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                yFA.copydefault(inputStreamOpenInputStream, th);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        obj2 = null;
                        th = th5;
                    }
                } else {
                    obj2 = null;
                    str = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(str);
            } catch (Throwable th6) {
                th = th6;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.EZpvd("UriExt", "getMimeTypeFromMagicBytes: Failed for URI: " + coroutineScope + "@getMimeTypeFromMagicBytes, error: " + thM7380exceptionOrNullimpl.getMessage());
            }
            return Result.m7383isFailureimpl(objM7377constructorimpl) ? obj2 : objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$2$lambda$1$lambda$0(byte b) {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
