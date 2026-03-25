package com.okinc.okimcore.extension;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sFB;
import o.yFA;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$compressToJpg$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isFullImage;
    final /* synthetic */ int $maxSizeKB;
    final /* synthetic */ Uri $this_compressToJpg;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$compressToJpg$2(int i, boolean z, Uri uri, Context context, Continuation<? super UriExtKt$compressToJpg$2> continuation) {
        super(2, continuation);
        this.$maxSizeKB = i;
        this.$isFullImage = z;
        this.$this_compressToJpg = uri;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$compressToJpg$2 uriExtKt$compressToJpg$2 = new UriExtKt$compressToJpg$2(this.$maxSizeKB, this.$isFullImage, this.$this_compressToJpg, this.$context, continuation);
        uriExtKt$compressToJpg$2.L$0 = obj;
        return uriExtKt$compressToJpg$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((UriExtKt$compressToJpg$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, byte[]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        long j;
        InputStream inputStreamOpenInputStream;
        ExifInterface exifInterface;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            int i = this.$maxSizeKB;
            boolean z = this.$isFullImage;
            Uri uri = this.$this_compressToJpg;
            Context context = this.$context;
            try {
                Result.Application application = Result.Companion;
                pUU.EZpvd("UriExt", "Convert or reduce image size: maxSizeKb: " + i + ", isFullImage: " + z + " Uri: " + uri);
                j = ((long) i) * 1024;
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        exifInterface = new ExifInterface(inputStreamOpenInputStream);
                        yFA.copydefault(inputStreamOpenInputStream, null);
                    } finally {
                    }
                } else {
                    exifInterface = null;
                }
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (inputStreamOpenInputStream != null) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    yFA.copydefault(inputStreamOpenInputStream, null);
                    if (bitmapDecodeStream != null) {
                        Ref.IntRef intRef = new Ref.IntRef();
                        intRef.element = 100;
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (z) {
                            try {
                                bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, intRef.element, byteArrayOutputStream);
                                objectRef.element = byteArrayOutputStream.toByteArray();
                                Unit unit = Unit.INSTANCE;
                                yFA.copydefault(byteArrayOutputStream, null);
                            } finally {
                            }
                        } else {
                            do {
                                byteArrayOutputStream.reset();
                                try {
                                    bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, intRef.element, byteArrayOutputStream);
                                    objectRef.element = byteArrayOutputStream.toByteArray();
                                    Unit unit2 = Unit.INSTANCE;
                                    yFA.copydefault(byteArrayOutputStream, null);
                                    T t = objectRef.element;
                                    if (((byte[]) t).length > j) {
                                        intRef.element -= 5;
                                    }
                                    if (((byte[]) t).length <= j) {
                                        break;
                                    }
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } while (intRef.element > 0);
                        }
                        File file = new File(context.getCacheDir(), "im");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File fileCreateTempFile = File.createTempFile("compressed_", ".jpg", file);
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            fileOutputStream.write((byte[]) objectRef.element);
                            Unit unit3 = Unit.INSTANCE;
                            yFA.copydefault(fileOutputStream, null);
                            if (exifInterface != null) {
                                ExifInterface exifInterface2 = new ExifInterface(fileCreateTempFile);
                                sFB.AEQbTJ(exifInterface, exifInterface2);
                                exifInterface2.saveAttributes();
                            }
                            objM7377constructorimpl = Result.m7377constructorimpl(FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", fileCreateTempFile));
                            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                            if (thM7380exceptionOrNullimpl != null) {
                                pUU.AEQbTJ("UriExt", "Failed to convert or reduce image size for Uri: " + coroutineScope, thM7380exceptionOrNullimpl);
                            }
                            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                                pUU.EZpvd("UriExt", "Convert success, new Uri: " + ((Uri) objM7377constructorimpl));
                            }
                            C56391yDq.AEQbTJ(objM7377constructorimpl);
                            return objM7377constructorimpl;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            throw new IllegalStateException("Could not decode bitmap from Uri: " + coroutineScope);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
