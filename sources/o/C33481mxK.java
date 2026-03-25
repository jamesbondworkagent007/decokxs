package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.mxK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33481mxK extends AbstractC5396Qc {
    public static float EZpvd;

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
    }

    public C33481mxK(android.content.Context context, int i) {
        EZpvd = android.content.res.Resources.getSystem().getDisplayMetrics().density * i;
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(OG og, android.graphics.Bitmap bitmap, int i, int i2) {
        return EZpvd(og, bitmap);
    }

    public static android.graphics.Bitmap EZpvd(OG og, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(width, height, config);
        if (bitmapCopydefault == null) {
            bitmapCopydefault = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        android.graphics.Paint paint = new android.graphics.Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        float f = EZpvd;
        canvas.drawRoundRect(rectF, f, f, paint);
        return bitmapCopydefault;
    }
}
