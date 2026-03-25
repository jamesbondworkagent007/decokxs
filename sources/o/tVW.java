package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tVW extends android.graphics.drawable.Drawable {
    public final int AEQbTJ;
    public final int AYXKKw;
    public final android.graphics.drawable.Drawable AhwBna;
    public final android.graphics.Paint DbNXlk;
    public final android.content.Context EZpvd;
    public final android.graphics.drawable.Drawable KWHzl;
    public final int OLrzqt;
    public final android.graphics.drawable.Drawable copydefault;
    public final boolean djBIcL;
    public final android.graphics.drawable.Drawable gEmmrt;
    public final int isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.isConnected;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public tVW(@NotNull android.content.Context context, @NotNull java.lang.String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = context;
        this.valueOf = str;
        this.OLrzqt = i;
        this.AYXKKw = i2;
        this.djBIcL = z;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C47501trL.ActionBar.hDKMBd);
        this.AhwBna = drawableKWHzl != null ? drawableKWHzl.mutate() : null;
        this.gEmmrt = C33070mpX.KWHzl(C47501trL.ActionBar.getNewProxyInstance);
        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C47501trL.ActionBar.uzCIH);
        this.KWHzl = drawableKWHzl2 != null ? drawableKWHzl2.mutate() : null;
        this.copydefault = C33070mpX.KWHzl(C47501trL.ActionBar.iwGUEr);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(i2);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(C55298xhM.KWHzl(9.0f, context));
        paint.setTypeface(C55051xce.OLrzqt.OLrzqt());
        this.DbNXlk = paint;
        this.isConnected = C55298xhM.OLrzqt(12, context);
        this.AEQbTJ = C55298xhM.OLrzqt(12, context);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        float fCenterX = bounds.centerX();
        float fCenterY = bounds.centerY();
        boolean z = this.djBIcL;
        android.graphics.drawable.Drawable drawable = z ? this.KWHzl : this.AhwBna;
        android.graphics.drawable.Drawable drawable2 = z ? this.copydefault : this.gEmmrt;
        if (drawable != null) {
            drawable.setTint(this.OLrzqt);
        }
        if (drawable != null) {
            drawable.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        if (drawable2 != null) {
            drawable2.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        float fDescent = fCenterY - ((this.DbNXlk.descent() + this.DbNXlk.ascent()) / 2);
        float fOLrzqt = C55298xhM.OLrzqt(1, this.EZpvd);
        canvas.drawText(this.valueOf, fCenterX, this.djBIcL ? fDescent + fOLrzqt : fDescent - fOLrzqt, this.DbNXlk);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        android.graphics.drawable.Drawable drawable = this.AhwBna;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        android.graphics.drawable.Drawable drawable2 = this.gEmmrt;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
        android.graphics.drawable.Drawable drawable3 = this.KWHzl;
        if (drawable3 != null) {
            drawable3.setAlpha(i);
        }
        android.graphics.drawable.Drawable drawable4 = this.copydefault;
        if (drawable4 != null) {
            drawable4.setAlpha(i);
        }
        this.DbNXlk.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.AhwBna;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        android.graphics.drawable.Drawable drawable2 = this.gEmmrt;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        android.graphics.drawable.Drawable drawable3 = this.KWHzl;
        if (drawable3 != null) {
            drawable3.setColorFilter(colorFilter);
        }
        android.graphics.drawable.Drawable drawable4 = this.copydefault;
        if (drawable4 != null) {
            drawable4.setColorFilter(colorFilter);
        }
        this.DbNXlk.setColorFilter(colorFilter);
    }
}
