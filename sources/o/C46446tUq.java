package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46446tUq extends android.graphics.drawable.Drawable {
    public final java.lang.String AEQbTJ;
    public final int KWHzl;
    public android.text.TextPaint OLrzqt;
    public final float copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public C46446tUq(@NotNull java.lang.String str, int i, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.KWHzl = i;
        this.copydefault = f;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.OLrzqt = textPaint;
        textPaint.setTextSize(f);
        this.OLrzqt.setColor(ColorUtils.setAlphaComponent(i, 255));
        this.OLrzqt.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        canvas.drawText(pTF.KWHzl.copydefault(this.AEQbTJ), getBounds().width() / 2.0f, getBounds().height() / 1.5f, this.OLrzqt);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.OLrzqt.setColorFilter(colorFilter);
    }
}
