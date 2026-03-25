package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: renamed from: o.uwV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49858uwV extends AppCompatImageView {
    public android.content.Context AEQbTJ;
    public android.graphics.Paint EZpvd;
    public int KWHzl;

    public C49858uwV(android.content.Context context) {
        this(context, null);
    }

    public C49858uwV(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C49858uwV(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AEQbTJ = context;
        KWHzl();
    }

    private void KWHzl() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.EZpvd = paint;
        paint.setDither(true);
        this.EZpvd.setAntiAlias(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = java.lang.Math.min(getMeasuredWidth(), getMeasuredHeight());
        this.KWHzl = iMin;
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmapCopydefault;
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null || (bitmapCopydefault = copydefault(drawable)) == null) {
            return;
        }
        EZpvd(canvas, OLrzqt(bitmapCopydefault, getWidth(), getHeight()));
    }

    public static android.graphics.Bitmap copydefault(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final android.graphics.Bitmap OLrzqt(android.graphics.Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float fMax = java.lang.Math.max(i / width, i2 / height);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(fMax, fMax);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public final void EZpvd(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.EZpvd.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = this.KWHzl / 2;
        canvas.drawCircle(f, f, f, this.EZpvd);
    }
}
