package o;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21045gsO {
    public static final android.graphics.Bitmap OLrzqt(@NotNull android.graphics.Bitmap bitmap, float f) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        float f2 = 2 * f;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap((int) (bitmap.getWidth() + f2), (int) (bitmap.getHeight() + f2), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmap, f, f, (android.graphics.Paint) null);
        return bitmapCreateBitmap;
    }
}
