package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18046fax extends android.graphics.drawable.Drawable {
    public final android.graphics.Paint AEQbTJ = new android.graphics.Paint(1);
    public java.lang.String EZpvd = com.ibm.icu.text.DateFormat.MINUTE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.EZpvd.length() == 0) {
            return;
        }
        float f = 2;
        float fValueOf = C56548yJl.valueOf(getBounds().right / f, getBounds().bottom / f);
        this.AEQbTJ.setStyle(Paint.Style.FILL);
        this.AEQbTJ.setColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        canvas.drawCircle(getBounds().right / f, getBounds().bottom / f, fValueOf, this.AEQbTJ);
        this.AEQbTJ.setColor(C33070mpX.copydefault(C32113mPz.ActionBar.AkhnZx));
        this.AEQbTJ.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        this.AEQbTJ.setTextSize((getBounds().right * 1) / f);
        float f2 = this.AEQbTJ.getFontMetrics().bottom;
        float f3 = this.AEQbTJ.getFontMetrics().top;
        this.AEQbTJ.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(this.EZpvd, getBounds().right / f, (getBounds().bottom / f) + ((this.AEQbTJ.getFontMetrics().descent - this.AEQbTJ.getFontMetrics().ascent) / 4), this.AEQbTJ);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.AEQbTJ.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.AEQbTJ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.AEQbTJ.getAlpha();
        if (alpha != 0) {
            return alpha != 255 ? -3 : -1;
        }
        return -2;
    }
}
