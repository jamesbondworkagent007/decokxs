package com.okinc.okimcore.extension;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.io.InputStream;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sFB;
import o.yFA;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$asRequestBody$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnonymousClass5>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_asRequestBody;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$asRequestBody$2(Uri uri, Context context, Continuation<? super UriExtKt$asRequestBody$2> continuation) {
        super(2, continuation);
        this.$this_asRequestBody = uri;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UriExtKt$asRequestBody$2(this.$this_asRequestBody, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnonymousClass5> continuation) {
        return ((UriExtKt$asRequestBody$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final String mimeTypeFromExtension;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String scheme = this.$this_asRequestBody.getScheme();
            if (!Intrinsics.EZpvd((Object) scheme, (Object) "content") && !Intrinsics.EZpvd((Object) scheme, (Object) "file")) {
                return null;
            }
            if (!Intrinsics.EZpvd((Object) scheme, (Object) "file")) {
                Uri uri = this.$this_asRequestBody;
                Context context = this.$context;
                this.label = 1;
                obj = sFB.AkhnZx(uri, context, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(this.$this_asRequestBody.toString()));
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
                }
                final ContentResolver contentResolver = this.$context.getContentResolver();
                final Uri uri2 = this.$this_asRequestBody;
                return new RequestBody() { // from class: com.okinc.okimcore.extension.UriExtKt$asRequestBody$2.5
                    @Override // okhttp3.RequestBody
                    public MediaType contentType() {
                        return MediaType.Companion.parse(mimeTypeFromExtension);
                    }

                    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
                    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
                    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
                    @Override // okhttp3.RequestBody
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void writeTo(BufferedSink bufferedSink) {
                        Object objM7377constructorimpl;
                        Throwable thM7380exceptionOrNullimpl;
                        InputStream inputStreamOpenInputStream;
                        Unit unit;
                        Intrinsics.checkNotNullParameter(bufferedSink, "");
                        ContentResolver contentResolver2 = contentResolver;
                        Uri uri3 = uri2;
                        try {
                            Result.Application application = Result.Companion;
                            inputStreamOpenInputStream = contentResolver2.openInputStream(uri3);
                            unit = null;
                        } catch (Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i2 = inputStreamOpenInputStream.read(bArr);
                                    if (i2 == -1) {
                                        break;
                                    } else {
                                        bufferedSink.write(bArr, 0, i2);
                                    }
                                    Result.Application application22 = Result.Companion;
                                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                                    if (thM7380exceptionOrNullimpl == null) {
                                        pUU.AEQbTJ("UriExt", "Uri.asRequestBody: Failed to create RequestBody from Uri", thM7380exceptionOrNullimpl);
                                        return;
                                    }
                                    return;
                                }
                                Unit unit2 = Unit.INSTANCE;
                                yFA.copydefault(inputStreamOpenInputStream, null);
                                unit = unit2;
                            } finally {
                            }
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(unit);
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl == null) {
                        }
                    }
                };
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        mimeTypeFromExtension = (String) obj;
        if (mimeTypeFromExtension == null) {
        }
        final ContentResolver contentResolver2 = this.$context.getContentResolver();
        final Uri uri22 = this.$this_asRequestBody;
        return new RequestBody() { // from class: com.okinc.okimcore.extension.UriExtKt$asRequestBody$2.5
            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.Companion.parse(mimeTypeFromExtension);
            }

            /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
            @Override // okhttp3.RequestBody
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void writeTo(BufferedSink bufferedSink) {
                Object objM7377constructorimpl;
                Throwable thM7380exceptionOrNullimpl;
                InputStream inputStreamOpenInputStream;
                Unit unit;
                Intrinsics.checkNotNullParameter(bufferedSink, "");
                ContentResolver contentResolver22 = contentResolver2;
                Uri uri3 = uri22;
                try {
                    Result.Application application = Result.Companion;
                    inputStreamOpenInputStream = contentResolver22.openInputStream(uri3);
                    unit = null;
                } catch (Throwable th) {
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i2 = inputStreamOpenInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            } else {
                                bufferedSink.write(bArr, 0, i2);
                            }
                            Result.Application application222 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                            if (thM7380exceptionOrNullimpl == null) {
                                pUU.AEQbTJ("UriExt", "Uri.asRequestBody: Failed to create RequestBody from Uri", thM7380exceptionOrNullimpl);
                                return;
                            }
                            return;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        yFA.copydefault(inputStreamOpenInputStream, null);
                        unit = unit2;
                    } finally {
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                }
            }
        };
    }
}
