package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: renamed from: o.yry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC57947yry extends android.graphics.drawable.Drawable {
    public android.graphics.Paint values;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public AbstractC57947yry() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.values = paint;
        paint.setStyle(Paint.Style.FILL);
        this.values.setAntiAlias(true);
        this.values.setColor(-5592406);
    }

    public void copydefault(int i) {
        this.values.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.values.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.values.setColorFilter(colorFilter);
    }
}
