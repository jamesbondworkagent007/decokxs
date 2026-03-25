package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28885kjH extends android.graphics.drawable.Drawable {
    public final int AEQbTJ;
    public final android.graphics.Paint OLrzqt;
    public int copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.copydefault = i;
    }

    public C28885kjH(@androidx.annotation.ColorInt int i) {
        this.AEQbTJ = i;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.OLrzqt = paint;
        this.copydefault = 255;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullExpressionValue(getBounds(), "");
        this.OLrzqt.setShader(null);
        this.OLrzqt.setColor(this.AEQbTJ);
        this.OLrzqt.setAlpha(this.copydefault);
        canvas.drawCircle(r1.width() / 2.0f, r1.height() / 2.0f, java.lang.Math.min(r1.width(), r1.height()) / 2.0f, this.OLrzqt);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.OLrzqt.setColorFilter(colorFilter);
    }
}
