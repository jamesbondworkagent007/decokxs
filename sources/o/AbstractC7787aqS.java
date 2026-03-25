package o;

import android.graphics.Paint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.aqS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC7787aqS extends android.text.style.ReplacementSpan {
    public WeakReference<android.graphics.drawable.Drawable> OLrzqt;
    public final int copydefault;

    public abstract android.graphics.drawable.Drawable OLrzqt();

    public AbstractC7787aqS() {
        this.copydefault = 0;
    }

    public AbstractC7787aqS(int i) {
        this.copydefault = i;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        android.graphics.Rect bounds;
        android.graphics.drawable.Drawable drawableCopydefault = copydefault();
        if (drawableCopydefault == null || (bounds = drawableCopydefault.getBounds()) == null) {
            i3 = 0;
        } else {
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = -bounds.bottom;
            }
            i3 = bounds.right;
        }
        if (fontMetricsInt != null) {
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return i3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        int i6;
        android.graphics.drawable.Drawable drawableCopydefault = copydefault();
        if (drawableCopydefault != null) {
            canvas.save();
            int i7 = i5 - drawableCopydefault.getBounds().bottom;
            int i8 = this.copydefault;
            if (i8 == 1) {
                i7 -= paint.getFontMetricsInt().descent;
            } else if (i8 == 2) {
                i7 = (int) (((i3 + paint.getFontMetrics().ascent) - paint.getFontMetricsInt().top) + 3.0f);
            } else if (i8 == 3 && (i6 = (i5 - i3) - drawableCopydefault.getBounds().bottom) >= 0) {
                i7 = i3 + (i6 / 2);
            }
            canvas.translate(f, i7);
            drawableCopydefault.draw(canvas);
            canvas.restore();
        }
    }

    public android.graphics.drawable.Drawable copydefault() {
        WeakReference<android.graphics.drawable.Drawable> weakReference = this.OLrzqt;
        android.graphics.drawable.Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawableOLrzqt = OLrzqt();
        this.OLrzqt = new WeakReference<>(drawableOLrzqt);
        return drawableOLrzqt;
    }
}
