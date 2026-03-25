package o;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: o.mzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C33579mzC extends LayerDrawable {
    public int AEQbTJ;
    public android.graphics.Paint EZpvd;
    public int OLrzqt;
    public android.graphics.drawable.Drawable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.AEQbTJ;
    }

    public C33579mzC(android.graphics.drawable.Drawable drawable, int i, int i2) {
        super(new android.graphics.drawable.Drawable[]{drawable});
        this.AEQbTJ = i;
        this.OLrzqt = i2;
        this.copydefault = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        android.graphics.Paint paint = new android.graphics.Paint();
        this.EZpvd = paint;
        paint.setAntiAlias(true);
    }

    public C33579mzC(android.graphics.drawable.Drawable drawable, int i) {
        this(drawable, i, i);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int saveCount = canvas.getSaveCount();
        canvas.save();
        super.draw(canvas);
        canvas.getMatrix().setRectToRect(new RectF(0.0f, 0.0f, this.copydefault.getIntrinsicWidth(), this.copydefault.getIntrinsicHeight()), new RectF(0.0f, 0.0f, this.AEQbTJ, this.OLrzqt), Matrix.ScaleToFit.CENTER);
        canvas.restoreToCount(saveCount);
    }
}
