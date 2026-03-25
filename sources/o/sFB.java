package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import androidx.exifinterface.media.ExifInterface;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.okimcore.extension.UriExtKt$asRequestBody$2;
import com.okinc.okimcore.extension.UriExtKt$compressToJpg$1;
import com.okinc.okimcore.extension.UriExtKt$compressToJpg$2;
import com.okinc.okimcore.extension.UriExtKt$getFileInfo$2;
import com.okinc.okimcore.extension.UriExtKt$getImageDimensions$2;
import com.okinc.okimcore.extension.UriExtKt$getImageMimeType$2;
import com.okinc.okimcore.extension.UriExtKt$getMediaDuration$2;
import com.okinc.okimcore.extension.UriExtKt$getMimeType$2;
import com.okinc.okimcore.extension.UriExtKt$getMimeTypeFromContent$2;
import com.okinc.okimcore.extension.UriExtKt$getMimeTypeFromMagicBytes$2;
import com.okinc.okimcore.extension.UriExtKt$getVideoMimeType$2;
import com.okinc.okimcore.extension.UriExtKt$saveToCache$2;
import com.okinc.okimcore.extension.UriExtKt$shouldConvertToJpg$1;
import com.okinc.okimcore.extension.UriExtKt$toBase64Thumbnail$2;
import com.okinc.okimcore.extension.UriExtKt$toFile$2;
import com.okinc.okimcore.extension.UriExtKt$toMultipartBodyPart$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sFB {
    public static final CoroutineDispatcher OLrzqt() {
        return ((InterfaceC44149sFc) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC44149sFc.class)).invokespecialDaTmkG();
    }

    public static final java.lang.Object djBIcL(@NotNull android.net.Uri uri, @NotNull android.content.Context context, @NotNull Continuation<? super RequestBody> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$asRequestBody$2(uri, context, null), continuation);
    }

    public static /* synthetic */ java.lang.Object toMultipartBodyPart$default(android.net.Uri uri, android.content.Context context, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return AEQbTJ(uri, context, str, str2, (Continuation<? super MultipartBody.Part>) continuation);
    }

    public static final java.lang.Object AEQbTJ(@NotNull android.net.Uri uri, @NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super MultipartBody.Part> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$toMultipartBodyPart$2(uri, context, str, str2, null), continuation);
    }

    public static final java.lang.String AEQbTJ() {
        return "filename_" + java.lang.System.currentTimeMillis();
    }

    public static final java.lang.Object gEmmrt(@NotNull android.net.Uri uri, @NotNull android.content.Context context, @NotNull Continuation<? super C44161sFo> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$getFileInfo$2(uri, context, null), continuation);
    }

    public static final java.lang.Object AkhnZx(android.net.Uri uri, android.content.Context context, Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$getMimeType$2(context, uri, null), continuation);
    }

    public static final java.lang.Object AhwBna(android.net.Uri uri, android.content.Context context, Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$getImageMimeType$2(context, uri, null), continuation);
    }

    public static final java.lang.Object isConnected(android.net.Uri uri, android.content.Context context, Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$getVideoMimeType$2(context, uri, null), continuation);
    }

    public static final java.lang.Object values(android.net.Uri uri, android.content.Context context, Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$getMimeTypeFromContent$2(context, uri, null), continuation);
    }

    public static final java.lang.Object fetchVPNInfo(android.net.Uri uri, android.content.Context context, Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$getMimeTypeFromMagicBytes$2(context, uri, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(android.net.Uri uri, android.content.Context context, java.lang.String str, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        UriExtKt$shouldConvertToJpg$1 uriExtKt$shouldConvertToJpg$1;
        if (continuation instanceof UriExtKt$shouldConvertToJpg$1) {
            uriExtKt$shouldConvertToJpg$1 = (UriExtKt$shouldConvertToJpg$1) continuation;
            int i = uriExtKt$shouldConvertToJpg$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uriExtKt$shouldConvertToJpg$1.label = i - Integer.MIN_VALUE;
            } else {
                uriExtKt$shouldConvertToJpg$1 = new UriExtKt$shouldConvertToJpg$1(continuation);
            }
        }
        java.lang.Object objValueOf = uriExtKt$shouldConvertToJpg$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = uriExtKt$shouldConvertToJpg$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            if (str != null && C59449zhJ.valueOf(str, "/png", true)) {
                pUU.KWHzl("Uri.shouldConvertToJpg", "Saving PNG as JPG");
                return C56443yFo.KWHzl(true);
            }
            if (str != null && C59449zhJ.startsWith$default(str, "video/", false, 2, null)) {
                uriExtKt$shouldConvertToJpg$1.label = 1;
                objValueOf = valueOf(uri, context, uriExtKt$shouldConvertToJpg$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return C56443yFo.KWHzl(false);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objValueOf);
        }
        int iIntValue = ((java.lang.Number) objValueOf).intValue();
        boolean z = iIntValue <= 1;
        pUU.KWHzl("Uri.shouldConvertToJpg", "Checking video: isTinyVid: " + z + ", duration: " + iIntValue + " sec");
        return C56443yFo.KWHzl(z);
    }

    public static final java.lang.Object DbNXlk(@NotNull android.net.Uri uri, @NotNull android.content.Context context, @NotNull Continuation<? super C44156sFj> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$saveToCache$2(uri, context, null), continuation);
    }

    public static final java.lang.Object AYXKKw(@NotNull android.net.Uri uri, @NotNull android.content.Context context, @NotNull Continuation<? super C44165sFs> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$getImageDimensions$2(context, uri, null), continuation);
    }

    public static final java.lang.Object valueOf(@NotNull android.net.Uri uri, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$getMediaDuration$2(context, uri, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull android.net.Uri uri, @NotNull android.content.Context context, int i, boolean z, @NotNull Continuation<? super android.net.Uri> continuation) throws java.lang.Throwable {
        UriExtKt$compressToJpg$1 uriExtKt$compressToJpg$1;
        if (continuation instanceof UriExtKt$compressToJpg$1) {
            uriExtKt$compressToJpg$1 = (UriExtKt$compressToJpg$1) continuation;
            int i2 = uriExtKt$compressToJpg$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uriExtKt$compressToJpg$1.label = i2 - Integer.MIN_VALUE;
            } else {
                uriExtKt$compressToJpg$1 = new UriExtKt$compressToJpg$1(continuation);
            }
        }
        java.lang.Object objWithContext = uriExtKt$compressToJpg$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = uriExtKt$compressToJpg$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = OLrzqt();
            UriExtKt$compressToJpg$2 uriExtKt$compressToJpg$2 = new UriExtKt$compressToJpg$2(i, z, uri, context, null);
            uriExtKt$compressToJpg$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, uriExtKt$compressToJpg$2, uriExtKt$compressToJpg$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "");
        return objWithContext;
    }

    public static /* synthetic */ java.lang.Object compressToJpg$default(android.net.Uri uri, android.content.Context context, int i, boolean z, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 300;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return AEQbTJ(uri, context, i, z, (Continuation<? super android.net.Uri>) continuation);
    }

    public static final void AEQbTJ(ExifInterface exifInterface, ExifInterface exifInterface2) {
        for (java.lang.String str : yDY.gEmmrt(ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_DATETIME_ORIGINAL, ExifInterface.TAG_IMAGE_DESCRIPTION, ExifInterface.TAG_ORIENTATION)) {
            java.lang.String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
    }

    public static final java.lang.Object fIwbmz(@NotNull android.net.Uri uri, @NotNull android.content.Context context, @NotNull Continuation<? super java.io.File> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$toFile$2(uri, context, null), continuation);
    }

    public static /* synthetic */ java.lang.Object toBase64Thumbnail$default(android.net.Uri uri, android.content.Context context, int i, long j, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = LivenessCoordinator.TARGET_WIDTH;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = 5120;
        }
        return KWHzl(uri, context, i3, j, continuation);
    }

    public static final java.lang.Object KWHzl(@NotNull android.net.Uri uri, @NotNull android.content.Context context, int i, long j, @NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(OLrzqt(), new UriExtKt$toBase64Thumbnail$2(uri, context, i, j, null), continuation);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final android.graphics.Bitmap OLrzqt(android.content.Context context, android.net.Uri uri, java.lang.String str) {
        java.io.InputStream inputStreamOpenInputStream;
        if (C59449zhJ.startsWith$default(str, "video/", false, 2, null)) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(context, uri);
                android.graphics.Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1000000L, 2);
                C56505yHw.KWHzl(mediaMetadataRetriever, null);
                return frameAtTime;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    C56505yHw.KWHzl(mediaMetadataRetriever, th);
                    throw th2;
                }
            }
        }
        if (!C59449zhJ.startsWith$default(str, "image/", false, 2, null) || (inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri)) == null) {
            return null;
        }
        try {
            android.graphics.Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            yFA.copydefault(inputStreamOpenInputStream, null);
            return bitmapDecodeStream;
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                yFA.copydefault(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    public static final android.graphics.Bitmap OLrzqt(android.graphics.Bitmap bitmap, android.content.Context context, android.net.Uri uri) throws java.io.FileNotFoundException {
        java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return bitmap;
        }
        int attributeInt = new ExifInterface(inputStreamOpenInputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        switch (attributeInt) {
            case 2:
                matrix.preScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.preScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.preScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(270.0f);
                matrix.preScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
            default:
                return bitmap;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        return bitmapCreateBitmap;
    }

    public static final android.graphics.Bitmap AEQbTJ(android.graphics.Bitmap bitmap, int i) {
        float f;
        int height;
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i) {
            return bitmap;
        }
        if (bitmap.getWidth() > bitmap.getHeight()) {
            f = i;
            height = bitmap.getWidth();
        } else {
            f = i;
            height = bitmap.getHeight();
        }
        float f2 = f / height;
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, C56548yJl.copydefault((int) (bitmap.getWidth() * f2), 1), C56548yJl.copydefault((int) (bitmap.getHeight() * f2), 1), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
        return bitmapCreateScaledBitmap;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final byte[] copydefault(android.graphics.Bitmap bitmap, long j) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 100;
        do {
            try {
                byteArrayOutputStream.reset();
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                i -= 5;
                if (byteArrayOutputStream.size() <= j) {
                    break;
                }
            } finally {
            }
        } while (i > 0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        yFA.copydefault(byteArrayOutputStream, null);
        return byteArray;
    }
}
