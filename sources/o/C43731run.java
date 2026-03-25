package o;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.run, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43731run {
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final android.graphics.Bitmap AEQbTJ(@NotNull PdfRenderer.Page page, int i) {
        Intrinsics.checkNotNullParameter(page, "");
        try {
            android.graphics.Bitmap bitmapEZpvd = EZpvd(page, i);
            page.render(bitmapEZpvd, null, null, 1);
            C56505yHw.KWHzl(page, null);
            return bitmapEZpvd;
        } finally {
        }
    }

    public static final android.graphics.Bitmap EZpvd(PdfRenderer.Page page, int i) {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, (int) ((i / page.getWidth()) * page.getHeight()), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        return bitmapCreateBitmap;
    }
}
