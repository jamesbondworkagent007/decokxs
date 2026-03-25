package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.Layout;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: renamed from: o.umI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49315umI {
    public static android.graphics.Bitmap KWHzl(android.content.Context context, C49316umJ c49316umJ, boolean z) {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setColor(c49316umJ.OLrzqt());
        textPaint.setStyle(c49316umJ.DbNXlk());
        if (c49316umJ.KWHzl() >= 0 && c49316umJ.KWHzl() <= 255) {
            textPaint.setAlpha(c49316umJ.KWHzl());
        }
        textPaint.setTextSize((int) android.util.TypedValue.applyDimension(1, (float) c49316umJ.AkhnZx(), context.getResources().getDisplayMetrics()));
        if (c49316umJ.AhwBna() != 0.0f || c49316umJ.valueOf() != 0.0f || c49316umJ.gEmmrt() != 0.0f) {
            textPaint.setShadowLayer(c49316umJ.AhwBna(), c49316umJ.valueOf(), c49316umJ.gEmmrt(), c49316umJ.djBIcL());
        }
        if (c49316umJ.AYXKKw() != 0) {
            textPaint.setTypeface(ResourcesCompat.getFont(context, c49316umJ.AYXKKw()));
        }
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setStrokeWidth(5.0f);
        float f = (int) ((-textPaint.ascent()) + 1.0f);
        android.graphics.Rect rect = new android.graphics.Rect();
        textPaint.getTextBounds(c49316umJ.copydefault(), 0, c49316umJ.copydefault().length(), rect);
        int iWidth = rect.width() + 20;
        int iMeasureText = (int) textPaint.measureText(c49316umJ.copydefault());
        if (iWidth > iMeasureText) {
            iWidth = iMeasureText;
        }
        C49312umF c49312umFAEQbTJ = c49316umJ.AEQbTJ();
        if (z) {
            iWidth += (int) c49312umFAEQbTJ.AEQbTJ();
        }
        int i = iWidth;
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(c49316umJ.copydefault(), 0, c49316umJ.copydefault().length(), textPaint, iMeasureText, Layout.Alignment.ALIGN_NORMAL, 2.0f, 2.0f, false);
        int iDescent = ((int) (f + textPaint.descent() + 3.0f)) * staticLayout.getLineCount();
        if (z) {
            iDescent += (int) c49312umFAEQbTJ.OLrzqt();
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, config);
        if (i > 0 && iDescent > 0) {
            bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, iDescent, config);
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawColor(c49316umJ.EZpvd());
        staticLayout.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static android.graphics.Bitmap EZpvd(android.graphics.Bitmap bitmap, float f, android.graphics.Bitmap bitmap2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float width2 = (bitmap2.getWidth() * f) / width;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(width2, width2);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }
}
