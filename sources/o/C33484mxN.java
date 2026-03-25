package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.mxN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33484mxN extends AbstractC5396Qc {
    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
    }

    public C33484mxN(android.content.Context context) {
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(OG og, android.graphics.Bitmap bitmap, int i, int i2) {
        return EZpvd(og, bitmap);
    }

    public static android.graphics.Bitmap EZpvd(OG og, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int iMin = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(iMin, iMin, config);
        if (bitmapCopydefault == null) {
            bitmapCopydefault = android.graphics.Bitmap.createBitmap(iMin, iMin, config);
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        android.graphics.Paint paint = new android.graphics.Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        return bitmapCopydefault;
    }
}
