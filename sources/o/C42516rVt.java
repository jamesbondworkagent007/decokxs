package o;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42516rVt extends android.graphics.drawable.Drawable {
    public final android.graphics.Paint AEQbTJ;
    public final int EZpvd;
    public final android.content.Context KWHzl;
    public final int OLrzqt;
    public final android.graphics.Bitmap copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C42516rVt(@NotNull android.content.Context context, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new android.graphics.Paint();
        this.KWHzl = context;
        this.copydefault = OLrzqt(context, i);
        this.EZpvd = i2;
        this.OLrzqt = i3;
        copydefault();
    }

    public final android.graphics.Bitmap OLrzqt(android.content.Context context, int i) {
        android.graphics.drawable.Drawable drawable = context.getDrawable(i);
        Intrinsics.copydefault(drawable);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final void copydefault() {
        this.AEQbTJ.setColor(C33070mpX.copydefault(C52761wXj.Activity.scanPackages));
        this.AEQbTJ.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        canvas.drawRect(0.0f, 0.0f, this.EZpvd, this.OLrzqt, this.AEQbTJ);
        canvas.drawBitmap(this.copydefault, (this.EZpvd - r0.getWidth()) / 2.0f, (this.OLrzqt - this.copydefault.getHeight()) / 2.0f, this.AEQbTJ);
    }
}
