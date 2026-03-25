package o;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* JADX INFO: renamed from: o.yDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56376yDb extends yCW {
    public int OLrzqt;

    public C56376yDb(int i) {
        this.OLrzqt = i;
    }

    @Override // o.yCW
    public android.graphics.Bitmap AEQbTJ(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(this.OLrzqt, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCopydefault;
    }

    @Override // o.yCW
    public java.lang.String AEQbTJ() {
        return "ColorFilterTransformation(color=" + this.OLrzqt + ")";
    }
}
