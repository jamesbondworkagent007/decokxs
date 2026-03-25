package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.exifinterface.media.ExifInterface;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.okinc.planet.utils.ImageTypeDetector;
import com.okinc.planet.utils.ImageUtils$compressBitmapUntilSize$1;
import com.okinc.planet.utils.ImageUtils$compressSingleFileUntilSize$1;
import com.okinc.planet.utils.ImageUtils$compressUriUntilSize$1;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tTQ {
    public static final tTQ OLrzqt = new tTQ();

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public final int OLrzqt(int i) {
        if (i == 3) {
            return 180;
        }
        if (i == 5 || i == 6) {
            return 90;
        }
        if (i == 7 || i == 8) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        return 0;
    }

    private tTQ() {
    }

    public final java.io.File KWHzl(@NotNull android.net.Uri uri, java.io.File file, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (file == null) {
            pUU.copydefault("PlanetUpload", "context.externalCacheDir is null, sdCard state=" + android.os.Environment.getExternalStorageState());
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        java.io.File file2 = new java.io.File(file, str);
        java.io.InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = C43246rlf.OLrzqt.valueOf().getContentResolver().openInputStream(uri);
            if (!C33486mxP.AEQbTJ(inputStreamOpenInputStream, file2)) {
                throw new java.io.IOException("copy file failed");
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            C33486mxP.AEQbTJ(inputStreamOpenInputStream);
            throw th;
        }
        C33486mxP.AEQbTJ(inputStreamOpenInputStream);
        return file2;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final byte[] EZpvd(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                byte[] bArrKWHzl = yFB.KWHzl(inputStreamOpenInputStream);
                yFA.copydefault(inputStreamOpenInputStream, null);
                return bArrKWHzl;
            } finally {
            }
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final byte[] copydefault(java.lang.String str) {
        if (str != null && str.length() != 0) {
            try {
                if (C59449zhJ.startsWith$default(str, "data:image", false, 2, null)) {
                    return android.util.Base64.decode(StringsKt__StringsKt.substringAfter$default(str, ",", (java.lang.String) null, 2, (java.lang.Object) null), 0);
                }
                return android.util.Base64.decode(str, 0);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static /* synthetic */ java.lang.String bitmapToBase64$default(tTQ ttq, android.graphics.Bitmap bitmap, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return ttq.OLrzqt(bitmap, i);
    }

    public final java.lang.String OLrzqt(@NotNull android.graphics.Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, i, byteArrayOutputStream);
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final android.graphics.Bitmap copydefault(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        android.graphics.Bitmap bitmapDecodeStream;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    yFA.copydefault(inputStreamOpenInputStream, null);
                } finally {
                }
            } else {
                bitmapDecodeStream = null;
            }
            if (bitmapDecodeStream == null) {
                return null;
            }
            try {
                tTQ ttq = OLrzqt;
                bitmapDecodeStream = ttq.EZpvd(bitmapDecodeStream, ttq.KWHzl(context, uri));
            } catch (java.lang.Throwable unused) {
            }
            if (bitmapDecodeStream == null) {
                return null;
            }
            return bitmapDecodeStream;
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public final byte[] AEQbTJ(@NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ java.io.File bitmapToCacheFile$default(tTQ ttq, android.content.Context context, android.graphics.Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            compressFormat = null;
        }
        if ((i2 & 8) != 0) {
            i = 100;
        }
        return ttq.EZpvd(context, bitmap, compressFormat, i);
    }

    public final java.io.File EZpvd(@NotNull android.content.Context context, @NotNull android.graphics.Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.File fileEZpvd = C33478mxH.KWHzl.EZpvd(context);
        java.io.FileOutputStream fileOutputStream = null;
        if (fileEZpvd == null) {
            return null;
        }
        if (!fileEZpvd.exists()) {
            fileEZpvd.mkdirs();
        }
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        java.io.File fileCreateTempFile = java.io.File.createTempFile("okx_img_", JwtUtilsKt.JWT_DELIMITER + (ActionBar.EZpvd[compressFormat.ordinal()] != 1 ? "jpg" : "png"), fileEZpvd);
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(fileCreateTempFile);
            if (!bitmap.compress(compressFormat, C56548yJl.EZpvd(i, 0, 100), fileOutputStream2)) {
                fileCreateTempFile = null;
            }
            fileOutputStream = fileOutputStream2;
        } catch (java.lang.Throwable unused) {
            fileCreateTempFile = null;
        }
        C33486mxP.AEQbTJ(fileOutputStream);
        return fileCreateTempFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ff -> B:33:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull android.graphics.Bitmap bitmap, int i, @NotNull Continuation<? super kotlin.Pair<? extends java.io.File, byte[]>> continuation) throws java.lang.Throwable {
        ImageUtils$compressBitmapUntilSize$1 imageUtils$compressBitmapUntilSize$1;
        long j;
        int i2;
        long length;
        java.io.File file;
        int iEZpvd;
        tTQ ttq;
        java.lang.String strAEQbTJ;
        java.io.File file2;
        android.content.Context context2 = context;
        android.graphics.Bitmap bitmap2 = bitmap;
        if (continuation instanceof ImageUtils$compressBitmapUntilSize$1) {
            imageUtils$compressBitmapUntilSize$1 = (ImageUtils$compressBitmapUntilSize$1) continuation;
            int i3 = imageUtils$compressBitmapUntilSize$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                imageUtils$compressBitmapUntilSize$1.label = i3 - Integer.MIN_VALUE;
            } else {
                imageUtils$compressBitmapUntilSize$1 = new ImageUtils$compressBitmapUntilSize$1(this, continuation);
            }
        }
        java.lang.Object obj = imageUtils$compressBitmapUntilSize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = imageUtils$compressBitmapUntilSize$1.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = imageUtils$compressBitmapUntilSize$1.J$1;
            length = imageUtils$compressBitmapUntilSize$1.J$0;
            int i5 = imageUtils$compressBitmapUntilSize$1.I$1;
            iEZpvd = imageUtils$compressBitmapUntilSize$1.I$0;
            file = (java.io.File) imageUtils$compressBitmapUntilSize$1.L$3;
            android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) imageUtils$compressBitmapUntilSize$1.L$2;
            android.content.Context context3 = (android.content.Context) imageUtils$compressBitmapUntilSize$1.L$1;
            tTQ ttq2 = (tTQ) imageUtils$compressBitmapUntilSize$1.L$0;
            C56391yDq.AEQbTJ(obj);
            i2 = i5;
            ttq = ttq2;
            j = j2;
            context2 = context3;
            bitmap2 = bitmap3;
            iEZpvd = C56548yJl.EZpvd(iEZpvd - 10, 5, 100);
            strAEQbTJ = C33610mzh.OLrzqt.AEQbTJ(context2, bitmap2, iEZpvd);
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            file2 = new java.io.File(strAEQbTJ);
            if (file2.exists()) {
                if (length == file2.length()) {
                    file = file2;
                } else {
                    length = file.length();
                    file = file2;
                    if (file.length() >= j && i2 < 12) {
                        i2++;
                        imageUtils$compressBitmapUntilSize$1.L$0 = ttq;
                        imageUtils$compressBitmapUntilSize$1.L$1 = context2;
                        imageUtils$compressBitmapUntilSize$1.L$2 = bitmap2;
                        imageUtils$compressBitmapUntilSize$1.L$3 = file;
                        imageUtils$compressBitmapUntilSize$1.I$0 = iEZpvd;
                        imageUtils$compressBitmapUntilSize$1.I$1 = i2;
                        imageUtils$compressBitmapUntilSize$1.J$0 = length;
                        imageUtils$compressBitmapUntilSize$1.J$1 = j;
                        imageUtils$compressBitmapUntilSize$1.label = 1;
                        if (YieldKt.yield(imageUtils$compressBitmapUntilSize$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        iEZpvd = C56548yJl.EZpvd(iEZpvd - 10, 5, 100);
                        strAEQbTJ = C33610mzh.OLrzqt.AEQbTJ(context2, bitmap2, iEZpvd);
                        if (strAEQbTJ == null) {
                        }
                        file2 = new java.io.File(strAEQbTJ);
                        if (file2.exists()) {
                        }
                    }
                }
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long jNanoTime = java.lang.System.nanoTime();
            ImageTypeDetector imageTypeDetector = new ImageTypeDetector();
            android.net.Uri uriFromFile = android.net.Uri.fromFile(file);
            Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
            java.lang.String str = "img_" + jCurrentTimeMillis + "_" + jNanoTime + JwtUtilsKt.JWT_DELIMITER + imageTypeDetector.EZpvd(uriFromFile).getTypeName();
            C43296rmc.AEQbTJ("PlanetUpload", "compressBitmapUntilSize = tempFileName: " + str);
            android.net.Uri uriFromFile2 = android.net.Uri.fromFile(file);
            Intrinsics.checkNotNullExpressionValue(uriFromFile2, "");
            java.io.File fileKWHzl = ttq.KWHzl(uriFromFile2, C33478mxH.KWHzl.EZpvd(context2), str);
            C43296rmc.AEQbTJ("PlanetUpload", "compressBitmapUntilSize =  new size: " + fileKWHzl.length());
            return C56390yDp.OLrzqt(fileKWHzl, null);
        }
        C56391yDq.AEQbTJ(obj);
        if (C33478mxH.KWHzl.EZpvd(context2) == null) {
            byte[] bArrAEQbTJ = AEQbTJ(bitmap2);
            pUU.KWHzl("PlanetUpload", "compressBitmapUntilSize useBytes size=" + (bArrAEQbTJ != null ? C56443yFo.AEQbTJ(bArrAEQbTJ.length) : null));
            return C56390yDp.OLrzqt(null, bArrAEQbTJ);
        }
        j = ((long) i) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        java.lang.String strAEQbTJ2 = C33610mzh.OLrzqt.AEQbTJ(context2, bitmap2, 100);
        if (strAEQbTJ2 == null) {
            strAEQbTJ2 = "";
        }
        java.io.File file3 = new java.io.File(strAEQbTJ2);
        pUU.KWHzl("PlanetUpload", "compressBitmapUntilSize path=" + strAEQbTJ2);
        C43296rmc.AEQbTJ("PlanetUpload", "compressBitmapUntilSize =  original size: " + file3.length());
        i2 = 0;
        length = -1;
        file = file3;
        iEZpvd = 100;
        ttq = this;
        if (file.length() >= j) {
            i2++;
            imageUtils$compressBitmapUntilSize$1.L$0 = ttq;
            imageUtils$compressBitmapUntilSize$1.L$1 = context2;
            imageUtils$compressBitmapUntilSize$1.L$2 = bitmap2;
            imageUtils$compressBitmapUntilSize$1.L$3 = file;
            imageUtils$compressBitmapUntilSize$1.I$0 = iEZpvd;
            imageUtils$compressBitmapUntilSize$1.I$1 = i2;
            imageUtils$compressBitmapUntilSize$1.J$0 = length;
            imageUtils$compressBitmapUntilSize$1.J$1 = j;
            imageUtils$compressBitmapUntilSize$1.label = 1;
            if (YieldKt.yield(imageUtils$compressBitmapUntilSize$1) == objCopydefault) {
            }
            iEZpvd = C56548yJl.EZpvd(iEZpvd - 10, 5, 100);
            strAEQbTJ = C33610mzh.OLrzqt.AEQbTJ(context2, bitmap2, iEZpvd);
            if (strAEQbTJ == null) {
            }
            file2 = new java.io.File(strAEQbTJ);
            if (file2.exists()) {
            }
        }
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        long jNanoTime2 = java.lang.System.nanoTime();
        ImageTypeDetector imageTypeDetector2 = new ImageTypeDetector();
        android.net.Uri uriFromFile3 = android.net.Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile3, "");
        java.lang.String str2 = "img_" + jCurrentTimeMillis2 + "_" + jNanoTime2 + JwtUtilsKt.JWT_DELIMITER + imageTypeDetector2.EZpvd(uriFromFile3).getTypeName();
        C43296rmc.AEQbTJ("PlanetUpload", "compressBitmapUntilSize = tempFileName: " + str2);
        android.net.Uri uriFromFile22 = android.net.Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile22, "");
        java.io.File fileKWHzl2 = ttq.KWHzl(uriFromFile22, C33478mxH.KWHzl.EZpvd(context2), str2);
        C43296rmc.AEQbTJ("PlanetUpload", "compressBitmapUntilSize =  new size: " + fileKWHzl2.length());
        return C56390yDp.OLrzqt(fileKWHzl2, null);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ff -> B:71:0x020a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull android.net.Uri uri, int i, @NotNull Continuation<? super kotlin.Pair<? extends java.io.File, byte[]>> continuation) throws java.lang.Throwable {
        ImageUtils$compressUriUntilSize$1 imageUtils$compressUriUntilSize$1;
        android.graphics.Bitmap bitmapEZpvd;
        long j;
        int i2;
        tTQ ttq;
        java.io.File file;
        android.content.Context context2;
        java.lang.String str;
        ImageUtils$compressUriUntilSize$1 imageUtils$compressUriUntilSize$12;
        android.graphics.Bitmap bitmap;
        java.lang.String str2;
        long length;
        java.lang.String str3;
        java.lang.String str4;
        int i3;
        java.lang.String str5;
        java.io.InputStream inputStreamOpenInputStream;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String strAEQbTJ;
        android.net.Uri uri2 = uri;
        if (continuation instanceof ImageUtils$compressUriUntilSize$1) {
            imageUtils$compressUriUntilSize$1 = (ImageUtils$compressUriUntilSize$1) continuation;
            int i4 = imageUtils$compressUriUntilSize$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                imageUtils$compressUriUntilSize$1.label = i4 - Integer.MIN_VALUE;
            } else {
                imageUtils$compressUriUntilSize$1 = new ImageUtils$compressUriUntilSize$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = imageUtils$compressUriUntilSize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = imageUtils$compressUriUntilSize$1.label;
        java.lang.String str9 = "";
        if (i5 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (C33478mxH.KWHzl.EZpvd(context) == null) {
                byte[] bArrEZpvd = EZpvd(context, uri);
                pUU.KWHzl("PlanetUpload", "compressUriUntilSize useBytes size=" + (bArrEZpvd != null ? C56443yFo.AEQbTJ(bArrEZpvd.length) : null));
                return C56390yDp.OLrzqt(null, bArrEZpvd);
            }
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri2);
            } catch (java.lang.Throwable unused) {
            }
            if (inputStreamOpenInputStream != null) {
                try {
                    bitmapEZpvd = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    yFA.copydefault(inputStreamOpenInputStream, null);
                } finally {
                }
            } else {
                bitmapEZpvd = null;
            }
            if (bitmapEZpvd == null) {
                C43296rmc.AEQbTJ("PlanetUpload", " compressUriUntilSize bitmap = null");
                java.lang.String strAEQbTJ2 = AEQbTJ(context, uri);
                str5 = strAEQbTJ2 != null ? strAEQbTJ2 : "png";
                java.io.File fileKWHzl = KWHzl(uri2, C33478mxH.KWHzl.EZpvd(context), "img_" + java.lang.System.currentTimeMillis() + "_" + java.lang.System.nanoTime() + JwtUtilsKt.JWT_DELIMITER + str5);
                imageUtils$compressUriUntilSize$1.label = 1;
                objKWHzl = KWHzl(context, fileKWHzl, i, imageUtils$compressUriUntilSize$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                try {
                    bitmapEZpvd = EZpvd(bitmapEZpvd, KWHzl(context, uri));
                } catch (java.lang.Throwable unused2) {
                }
                j = ((long) i) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                java.lang.String strAEQbTJ3 = C33610mzh.OLrzqt.AEQbTJ(context, bitmapEZpvd, 100);
                if (strAEQbTJ3 == null) {
                    strAEQbTJ3 = "";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                android.graphics.Bitmap bitmap2 = bitmapEZpvd;
                sb.append("compressUriUntilSize path=");
                sb.append(strAEQbTJ3);
                pUU.KWHzl("PlanetUpload", sb.toString());
                java.io.File file2 = new java.io.File(strAEQbTJ3);
                if (!file2.exists()) {
                    java.lang.String strAEQbTJ4 = AEQbTJ(context, uri);
                    str5 = strAEQbTJ4 != null ? strAEQbTJ4 : "png";
                    return C56390yDp.OLrzqt(KWHzl(uri2, C33478mxH.KWHzl.EZpvd(context), "img_" + java.lang.System.currentTimeMillis() + "_" + java.lang.System.nanoTime() + JwtUtilsKt.JWT_DELIMITER + str5), null);
                }
                C43296rmc.AEQbTJ("PlanetUpload", "compressUriUntilSize =  original size: " + file2.length());
                i2 = 0;
                ttq = this;
                file = file2;
                context2 = context;
                str = JwtUtilsKt.JWT_DELIMITER;
                imageUtils$compressUriUntilSize$12 = imageUtils$compressUriUntilSize$1;
                bitmap = bitmap2;
                str2 = "PlanetUpload";
                length = -1;
                str3 = "png";
                str4 = "";
                i3 = 100;
                if (file.length() < j) {
                }
                str7 = str;
                str8 = str2;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long jNanoTime = java.lang.System.nanoTime();
                strAEQbTJ = ttq.AEQbTJ(context2, uri2);
                if (strAEQbTJ == null) {
                }
                android.net.Uri uriFromFile = android.net.Uri.fromFile(file);
                Intrinsics.checkNotNullExpressionValue(uriFromFile, str6);
                java.io.File fileKWHzl2 = ttq.KWHzl(uriFromFile, C33478mxH.KWHzl.EZpvd(context2), "img_" + jCurrentTimeMillis + "_" + jNanoTime + str7 + strAEQbTJ);
                C43296rmc.AEQbTJ(str8, "compressUriUntilSize =  new size: " + fileKWHzl2.length());
                return C56390yDp.OLrzqt(fileKWHzl2, null);
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = imageUtils$compressUriUntilSize$1.J$1;
                java.lang.String str10 = JwtUtilsKt.JWT_DELIMITER;
                long j3 = imageUtils$compressUriUntilSize$1.J$0;
                int i6 = imageUtils$compressUriUntilSize$1.I$1;
                int i7 = imageUtils$compressUriUntilSize$1.I$0;
                java.io.File file3 = (java.io.File) imageUtils$compressUriUntilSize$1.L$4;
                android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) imageUtils$compressUriUntilSize$1.L$3;
                android.net.Uri uri3 = (android.net.Uri) imageUtils$compressUriUntilSize$1.L$2;
                android.content.Context context3 = (android.content.Context) imageUtils$compressUriUntilSize$1.L$1;
                tTQ ttq2 = (tTQ) imageUtils$compressUriUntilSize$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                int i8 = i6;
                str4 = "";
                str6 = str4;
                context2 = context3;
                ttq = ttq2;
                str3 = "png";
                long j4 = j2;
                file = file3;
                ImageUtils$compressUriUntilSize$1 imageUtils$compressUriUntilSize$13 = imageUtils$compressUriUntilSize$1;
                bitmap = bitmap3;
                uri2 = uri3;
                str2 = "PlanetUpload";
                ImageUtils$compressUriUntilSize$1 imageUtils$compressUriUntilSize$14 = imageUtils$compressUriUntilSize$13;
                int i9 = i7;
                length = j3;
                int i10 = i8;
                android.net.Uri uri4 = uri2;
                int iEZpvd = C56548yJl.EZpvd(i9 - 10, 5, 100);
                java.lang.String strAEQbTJ5 = C33610mzh.OLrzqt.AEQbTJ(context2, bitmap, iEZpvd);
                if (strAEQbTJ5 == null) {
                    strAEQbTJ5 = str4;
                }
                java.io.File file4 = new java.io.File(strAEQbTJ5);
                if (!file4.exists()) {
                    uri2 = uri4;
                    str7 = str10;
                    str8 = str2;
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    long jNanoTime2 = java.lang.System.nanoTime();
                    strAEQbTJ = ttq.AEQbTJ(context2, uri2);
                    if (strAEQbTJ == null) {
                        strAEQbTJ = str3;
                    }
                    android.net.Uri uriFromFile2 = android.net.Uri.fromFile(file);
                    Intrinsics.checkNotNullExpressionValue(uriFromFile2, str6);
                    java.io.File fileKWHzl22 = ttq.KWHzl(uriFromFile2, C33478mxH.KWHzl.EZpvd(context2), "img_" + jCurrentTimeMillis2 + "_" + jNanoTime2 + str7 + strAEQbTJ);
                    C43296rmc.AEQbTJ(str8, "compressUriUntilSize =  new size: " + fileKWHzl22.length());
                    return C56390yDp.OLrzqt(fileKWHzl22, null);
                }
                if (length != file4.length()) {
                    length = file.length();
                    file = file4;
                    uri2 = uri4;
                    i2 = i10;
                    str = str10;
                    imageUtils$compressUriUntilSize$12 = imageUtils$compressUriUntilSize$14;
                    j = j4;
                    str9 = str6;
                    i3 = iEZpvd;
                    if (file.length() < j) {
                        str6 = str9;
                        if (i2 < 12) {
                            i8 = i2 + 1;
                            imageUtils$compressUriUntilSize$12.L$0 = ttq;
                            imageUtils$compressUriUntilSize$12.L$1 = context2;
                            imageUtils$compressUriUntilSize$12.L$2 = uri2;
                            imageUtils$compressUriUntilSize$12.L$3 = bitmap;
                            imageUtils$compressUriUntilSize$12.L$4 = file;
                            imageUtils$compressUriUntilSize$12.I$0 = i3;
                            imageUtils$compressUriUntilSize$12.I$1 = i8;
                            imageUtils$compressUriUntilSize$12.J$0 = length;
                            imageUtils$compressUriUntilSize$12.J$1 = j;
                            imageUtils$compressUriUntilSize$12.label = 2;
                            if (YieldKt.yield(imageUtils$compressUriUntilSize$12) == objCopydefault) {
                                return objCopydefault;
                            }
                            ImageUtils$compressUriUntilSize$1 imageUtils$compressUriUntilSize$15 = imageUtils$compressUriUntilSize$12;
                            str10 = str;
                            long j5 = j;
                            imageUtils$compressUriUntilSize$14 = imageUtils$compressUriUntilSize$15;
                            i9 = i3;
                            j4 = j5;
                            int i102 = i8;
                            android.net.Uri uri42 = uri2;
                            int iEZpvd2 = C56548yJl.EZpvd(i9 - 10, 5, 100);
                            java.lang.String strAEQbTJ52 = C33610mzh.OLrzqt.AEQbTJ(context2, bitmap, iEZpvd2);
                            if (strAEQbTJ52 == null) {
                            }
                            java.io.File file42 = new java.io.File(strAEQbTJ52);
                            if (!file42.exists()) {
                            }
                        }
                    } else {
                        str6 = str9;
                    }
                    str7 = str;
                    str8 = str2;
                    long jCurrentTimeMillis22 = java.lang.System.currentTimeMillis();
                    long jNanoTime22 = java.lang.System.nanoTime();
                    strAEQbTJ = ttq.AEQbTJ(context2, uri2);
                    if (strAEQbTJ == null) {
                    }
                    android.net.Uri uriFromFile22 = android.net.Uri.fromFile(file);
                    Intrinsics.checkNotNullExpressionValue(uriFromFile22, str6);
                    java.io.File fileKWHzl222 = ttq.KWHzl(uriFromFile22, C33478mxH.KWHzl.EZpvd(context2), "img_" + jCurrentTimeMillis22 + "_" + jNanoTime22 + str7 + strAEQbTJ);
                    C43296rmc.AEQbTJ(str8, "compressUriUntilSize =  new size: " + fileKWHzl222.length());
                    return C56390yDp.OLrzqt(fileKWHzl222, null);
                }
                file = file42;
                str7 = str10;
                str8 = str2;
                uri2 = uri42;
                long jCurrentTimeMillis222 = java.lang.System.currentTimeMillis();
                long jNanoTime222 = java.lang.System.nanoTime();
                strAEQbTJ = ttq.AEQbTJ(context2, uri2);
                if (strAEQbTJ == null) {
                }
                android.net.Uri uriFromFile222 = android.net.Uri.fromFile(file);
                Intrinsics.checkNotNullExpressionValue(uriFromFile222, str6);
                java.io.File fileKWHzl2222 = ttq.KWHzl(uriFromFile222, C33478mxH.KWHzl.EZpvd(context2), "img_" + jCurrentTimeMillis222 + "_" + jNanoTime222 + str7 + strAEQbTJ);
                C43296rmc.AEQbTJ(str8, "compressUriUntilSize =  new size: " + fileKWHzl2222.length());
                return C56390yDp.OLrzqt(fileKWHzl2222, null);
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return C56390yDp.OLrzqt(objKWHzl, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[Catch: Exception -> 0x0173, TryCatch #2 {Exception -> 0x0173, blocks: (B:33:0x00a9, B:46:0x00f1, B:36:0x00b4, B:39:0x00d0, B:42:0x00dc, B:45:0x00e6, B:25:0x0080, B:29:0x008c), top: B:59:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a5 -> B:14:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull java.io.File file, int i, @NotNull Continuation<? super java.io.File> continuation) throws java.lang.Throwable {
        ImageUtils$compressSingleFileUntilSize$1 imageUtils$compressSingleFileUntilSize$1;
        tTQ ttq;
        java.io.File file2;
        java.io.File file3;
        tTQ ttq2;
        long length;
        long j;
        int i2;
        ImageUtils$compressSingleFileUntilSize$1 imageUtils$compressSingleFileUntilSize$12;
        android.content.Context context2;
        java.io.File fileKWHzl;
        if (continuation instanceof ImageUtils$compressSingleFileUntilSize$1) {
            imageUtils$compressSingleFileUntilSize$1 = (ImageUtils$compressSingleFileUntilSize$1) continuation;
            int i3 = imageUtils$compressSingleFileUntilSize$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                imageUtils$compressSingleFileUntilSize$1.label = i3 - Integer.MIN_VALUE;
                ttq = this;
            } else {
                ttq = this;
                imageUtils$compressSingleFileUntilSize$1 = new ImageUtils$compressSingleFileUntilSize$1(ttq, continuation);
            }
        }
        java.lang.Object obj = imageUtils$compressSingleFileUntilSize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = imageUtils$compressSingleFileUntilSize$1.label;
        int i5 = 1;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                if (file.exists()) {
                    if (file.isFile()) {
                        file3 = file;
                        ttq2 = ttq;
                        length = -1;
                        j = ((long) i) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        i2 = 0;
                        imageUtils$compressSingleFileUntilSize$12 = imageUtils$compressSingleFileUntilSize$1;
                        context2 = context;
                        file2 = file3;
                        if (file2.length() >= j) {
                            i2++;
                            imageUtils$compressSingleFileUntilSize$12.L$0 = ttq2;
                            imageUtils$compressSingleFileUntilSize$12.L$1 = context2;
                            imageUtils$compressSingleFileUntilSize$12.L$2 = file3;
                            imageUtils$compressSingleFileUntilSize$12.L$3 = file2;
                            imageUtils$compressSingleFileUntilSize$12.I$0 = i2;
                            imageUtils$compressSingleFileUntilSize$12.J$0 = length;
                            imageUtils$compressSingleFileUntilSize$12.J$1 = j;
                            imageUtils$compressSingleFileUntilSize$12.label = i5;
                            if (YieldKt.yield(imageUtils$compressSingleFileUntilSize$12) != objCopydefault) {
                            }
                        }
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        long jNanoTime = java.lang.System.nanoTime();
                        ImageTypeDetector imageTypeDetector = new ImageTypeDetector();
                        android.net.Uri uriFromFile = android.net.Uri.fromFile(file2);
                        Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
                        java.lang.String str = "img_" + jCurrentTimeMillis + "_" + jNanoTime + JwtUtilsKt.JWT_DELIMITER + imageTypeDetector.EZpvd(uriFromFile).getTypeName();
                        android.net.Uri uriFromFile2 = android.net.Uri.fromFile(file2);
                        Intrinsics.checkNotNullExpressionValue(uriFromFile2, "");
                        fileKWHzl = ttq2.KWHzl(uriFromFile2, C33478mxH.KWHzl.EZpvd(context2), str);
                        C43296rmc.AEQbTJ("PlanetUpload", "compressSingleFileUntilSize " + i2 + " times. original size: " + file3.length() + ". new size: " + fileKWHzl.length());
                        return fileKWHzl;
                    }
                }
                return file;
            } catch (java.lang.Exception unused) {
                file2 = file;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = imageUtils$compressSingleFileUntilSize$1.J$1;
            long j3 = imageUtils$compressSingleFileUntilSize$1.J$0;
            int i6 = imageUtils$compressSingleFileUntilSize$1.I$0;
            java.io.File file4 = (java.io.File) imageUtils$compressSingleFileUntilSize$1.L$3;
            java.io.File file5 = (java.io.File) imageUtils$compressSingleFileUntilSize$1.L$2;
            android.content.Context context3 = (android.content.Context) imageUtils$compressSingleFileUntilSize$1.L$1;
            ttq2 = (tTQ) imageUtils$compressSingleFileUntilSize$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                context2 = context3;
                long j4 = j2;
                imageUtils$compressSingleFileUntilSize$12 = imageUtils$compressSingleFileUntilSize$1;
                i2 = i6;
                file2 = file4;
                file3 = file5;
                long j5 = j4;
                try {
                    android.graphics.Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file2.getPath());
                    if (bitmapDecodeFile == null) {
                        java.lang.String strAEQbTJ = C33610mzh.OLrzqt.AEQbTJ(context2, ttq2.EZpvd(bitmapDecodeFile, ttq2.copydefault(file2)), C56548yJl.EZpvd(100 - (i2 * 10), 5, 100));
                        if (strAEQbTJ == null) {
                            strAEQbTJ = "";
                        }
                        java.io.File file6 = new java.io.File(strAEQbTJ);
                        if (file6.exists()) {
                            if (j3 == file6.length()) {
                                file2 = file6;
                            } else {
                                j = j5;
                                length = file2.length();
                                file2 = file6;
                                i5 = 1;
                                if (file2.length() >= j && i2 < 12) {
                                    i2++;
                                    imageUtils$compressSingleFileUntilSize$12.L$0 = ttq2;
                                    imageUtils$compressSingleFileUntilSize$12.L$1 = context2;
                                    imageUtils$compressSingleFileUntilSize$12.L$2 = file3;
                                    imageUtils$compressSingleFileUntilSize$12.L$3 = file2;
                                    imageUtils$compressSingleFileUntilSize$12.I$0 = i2;
                                    imageUtils$compressSingleFileUntilSize$12.J$0 = length;
                                    imageUtils$compressSingleFileUntilSize$12.J$1 = j;
                                    imageUtils$compressSingleFileUntilSize$12.label = i5;
                                    if (YieldKt.yield(imageUtils$compressSingleFileUntilSize$12) != objCopydefault) {
                                        return objCopydefault;
                                    }
                                    j4 = j;
                                    j3 = length;
                                    long j52 = j4;
                                    android.graphics.Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(file2.getPath());
                                    if (bitmapDecodeFile2 == null) {
                                    }
                                }
                            }
                        }
                    }
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    long jNanoTime2 = java.lang.System.nanoTime();
                    ImageTypeDetector imageTypeDetector2 = new ImageTypeDetector();
                    android.net.Uri uriFromFile3 = android.net.Uri.fromFile(file2);
                    Intrinsics.checkNotNullExpressionValue(uriFromFile3, "");
                    java.lang.String str2 = "img_" + jCurrentTimeMillis2 + "_" + jNanoTime2 + JwtUtilsKt.JWT_DELIMITER + imageTypeDetector2.EZpvd(uriFromFile3).getTypeName();
                    android.net.Uri uriFromFile22 = android.net.Uri.fromFile(file2);
                    Intrinsics.checkNotNullExpressionValue(uriFromFile22, "");
                    fileKWHzl = ttq2.KWHzl(uriFromFile22, C33478mxH.KWHzl.EZpvd(context2), str2);
                    try {
                        C43296rmc.AEQbTJ("PlanetUpload", "compressSingleFileUntilSize " + i2 + " times. original size: " + file3.length() + ". new size: " + fileKWHzl.length());
                        return fileKWHzl;
                    } catch (java.lang.Exception unused2) {
                        file2 = fileKWHzl;
                    }
                } catch (java.lang.Exception unused3) {
                }
            } catch (java.lang.Exception unused4) {
                file2 = file4;
            }
        }
        return file2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        java.lang.String extensionFromMimeType;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            java.lang.String type = context.getContentResolver().getType(uri);
            if (type != null && type.length() != 0 && (extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(type)) != null) {
                java.util.Locale locale = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = extensionFromMimeType.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                return lowerCase;
            }
        } catch (java.lang.Throwable unused) {
        }
        if (Intrinsics.EZpvd((java.lang.Object) "content", (java.lang.Object) uri.getScheme())) {
            try {
                android.database.Cursor cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            java.lang.String string = cursorQuery.getString(0);
                            Intrinsics.copydefault((java.lang.Object) string);
                            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) string, '.', 0, false, 6, (java.lang.Object) null);
                            if (1 <= iLastIndexOf$default && iLastIndexOf$default < string.length() - 1) {
                                java.lang.String strSubstring = string.substring(iLastIndexOf$default + 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                java.util.Locale locale2 = java.util.Locale.ROOT;
                                Intrinsics.checkNotNullExpressionValue(locale2, "");
                                java.lang.String lowerCase2 = strSubstring.toLowerCase(locale2);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                                yFA.copydefault(cursorQuery, null);
                                return lowerCase2;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        yFA.copydefault(cursorQuery, null);
                    } finally {
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) "file", (java.lang.Object) uri.getScheme())) {
            try {
                java.lang.String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                java.lang.String strFetchVPNInfo = yFL.fetchVPNInfo(new java.io.File(path));
                java.util.Locale locale3 = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                java.lang.String lowerCase3 = strFetchVPNInfo.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                if (lowerCase3.length() == 0) {
                    return null;
                }
                return lowerCase3;
            } catch (java.lang.Throwable unused3) {
                return null;
            }
        }
        return new ImageTypeDetector().EZpvd(uri).getTypeName();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final int KWHzl(android.content.Context context, android.net.Uri uri) {
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    int iOLrzqt = OLrzqt.OLrzqt(new ExifInterface(inputStreamOpenInputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1));
                    yFA.copydefault(inputStreamOpenInputStream, null);
                    return iOLrzqt;
                } finally {
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return 0;
    }

    public final int copydefault(java.io.File file) {
        try {
            return OLrzqt(new ExifInterface(file.getAbsolutePath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1));
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public final android.graphics.Bitmap EZpvd(android.graphics.Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        try {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postRotate(i);
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            if (!Intrinsics.EZpvd(bitmapCreateBitmap, bitmap)) {
                if (!bitmap.isRecycled()) {
                    try {
                        bitmap.recycle();
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
            return bitmapCreateBitmap;
        } catch (java.lang.Throwable unused2) {
            return bitmap;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> OLrzqt(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    yFA.copydefault(inputStreamOpenInputStream, null);
                } finally {
                }
            }
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (i > 0 && i2 > 0) {
                if (KWHzl(context, uri) % 180 != 0) {
                    numValueOf = java.lang.Integer.valueOf(i2);
                    numValueOf2 = java.lang.Integer.valueOf(i);
                } else {
                    numValueOf = java.lang.Integer.valueOf(i);
                    numValueOf2 = java.lang.Integer.valueOf(i2);
                }
                return C56390yDp.OLrzqt(numValueOf, numValueOf2);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return null;
        }
        return EZpvd(new java.io.File(str));
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> EZpvd(@NotNull java.io.File file) {
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        Intrinsics.checkNotNullParameter(file, "");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (i > 0 && i2 > 0) {
                if (copydefault(file) % 180 != 0) {
                    numValueOf = java.lang.Integer.valueOf(i2);
                    numValueOf2 = java.lang.Integer.valueOf(i);
                } else {
                    numValueOf = java.lang.Integer.valueOf(i);
                    numValueOf2 = java.lang.Integer.valueOf(i2);
                }
                return C56390yDp.OLrzqt(numValueOf, numValueOf2);
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
    }
}
