package o;

import android.graphics.Bitmap;
import android.renderscript.RSRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class yCZ extends yCW {
    public static int KWHzl = 25;
    public static int OLrzqt = 1;
    public int EZpvd;
    public int copydefault;

    public yCZ() {
        this(KWHzl, OLrzqt);
    }

    public yCZ(int i, int i2) {
        this.copydefault = i;
        this.EZpvd = i2;
    }

    @Override // o.yCW
    public android.graphics.Bitmap AEQbTJ(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.EZpvd;
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(width / i3, height / i3, Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        float f = 1.0f / this.EZpvd;
        canvas.scale(f, f);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            return C56377yDc.AEQbTJ(context, bitmapCopydefault, this.copydefault);
        } catch (RSRuntimeException unused) {
            return C56375yDa.OLrzqt(bitmapCopydefault, this.copydefault, true);
        }
    }

    @Override // o.yCW
    public java.lang.String AEQbTJ() {
        return "BlurTransformation(radius=" + this.copydefault + ", sampling=" + this.EZpvd + ")";
    }
}
