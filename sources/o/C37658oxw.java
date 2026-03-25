package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37658oxw {
    public static final C37658oxw EZpvd = new C37658oxw();

    private C37658oxw() {
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        return context.getContentResolver().getType(uri);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> OLrzqt(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = new kotlin.Pair<>(java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
                yFA.copydefault(inputStreamOpenInputStream, null);
                return pair;
            } finally {
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("sticker_log", "Error get dimension: " + e.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.io.File AEQbTJ(@NotNull android.content.Context context, @NotNull android.graphics.Bitmap bitmap) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.File fileCreateTempFile = java.io.File.createTempFile("temp_image_", ".png", context.getCacheDir());
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            yFA.copydefault(fileOutputStream, null);
            Intrinsics.copydefault(fileCreateTempFile);
            return fileCreateTempFile;
        } finally {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.io.File KWHzl(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            android.content.ContentResolver contentResolver = context.getContentResolver();
            java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
            if (extensionFromMimeType == null) {
                extensionFromMimeType = "tmp";
            }
            java.io.File fileCreateTempFile = java.io.File.createTempFile("temp_image_", JwtUtilsKt.JWT_DELIMITER + extensionFromMimeType, context.getCacheDir());
            java.io.InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    Intrinsics.copydefault(fileCreateTempFile);
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                    try {
                        yFB.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                        yFA.copydefault(fileOutputStream, null);
                        yFA.copydefault(inputStreamOpenInputStream, null);
                    } finally {
                    }
                } finally {
                }
            }
            return fileCreateTempFile;
        } catch (java.lang.Exception e) {
            pUU.copydefault("sticker_log", "create temp file from uri: " + e.getMessage());
            return null;
        }
    }

    public final android.graphics.Bitmap copydefault(@NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        try {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float fMin = java.lang.Math.min(i / width, i2 / height);
            return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (width * fMin), (int) (height * fMin), true);
        } catch (java.lang.Exception e) {
            pUU.copydefault("sticker_log", "Error resizing bitmap: " + e.getMessage());
            return null;
        }
    }

    public final android.graphics.Bitmap OLrzqt(@NotNull android.content.Context context, @NotNull android.net.Uri uri, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            android.graphics.Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            if (bitmapDecodeStream != null) {
                return EZpvd.copydefault(bitmapDecodeStream, i, i2);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("sticker_log", "Error resizing uri: " + e.getMessage());
        }
        return null;
    }

    public final int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33566myq.EZpvd.EZpvd(context) > C55298xhM.dp2px$default(375.0f, null, 1, null) ? C55298xhM.dp2px$default(160.0f, null, 1, null) : C55298xhM.dp2px$default(120.0f, null, 1, null);
    }
}
