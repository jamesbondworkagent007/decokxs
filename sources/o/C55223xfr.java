package o;

import android.graphics.Paint;
import com.okinc.uilab.richtext.htmlspanner.style.Style;
import com.okinc.uilab.richtext.htmlspanner.style.StyleValue;

/* JADX INFO: renamed from: o.xfr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55223xfr implements android.text.style.LineBackgroundSpan {
    public int AEQbTJ;
    public int EZpvd;
    public Style KWHzl;
    public boolean OLrzqt;

    public C55223xfr(Style style, int i, int i2, boolean z) {
        this.EZpvd = i;
        this.AEQbTJ = i2;
        this.KWHzl = style;
        this.OLrzqt = z;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, int i8) {
        int iEZpvd = 0;
        if (this.KWHzl.AkhnZx() != null) {
            StyleValue styleValueAkhnZx = this.KWHzl.AkhnZx();
            if (styleValueAkhnZx.copydefault() == StyleValue.Unit.PX) {
                if (styleValueAkhnZx.KWHzl() > 0) {
                    iEZpvd = styleValueAkhnZx.KWHzl();
                }
            } else if (styleValueAkhnZx.EZpvd() > 0.0f) {
                iEZpvd = (int) (styleValueAkhnZx.EZpvd() * 10.0f);
            }
            iEZpvd--;
        }
        int i9 = iEZpvd > 0 ? i + iEZpvd : i;
        int color = paint.getColor();
        float strokeWidth = paint.getStrokeWidth();
        if (this.OLrzqt && this.KWHzl.AEQbTJ() != null) {
            paint.setColor(this.KWHzl.AEQbTJ().intValue());
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(i9, i3, i2, i5, paint);
        }
        if (this.OLrzqt && this.KWHzl.EZpvd() != null) {
            paint.setColor(this.KWHzl.EZpvd().intValue());
        }
        int iKWHzl = (this.KWHzl.copydefault() == null || this.KWHzl.copydefault().copydefault() != StyleValue.Unit.PX) ? 1 : this.KWHzl.copydefault().KWHzl();
        paint.setStrokeWidth(iKWHzl);
        int i10 = i2 - iKWHzl;
        paint.setStyle(Paint.Style.STROKE);
        if (i6 <= this.EZpvd) {
            float f = i3;
            canvas.drawLine(i9, f, i10, f, paint);
        }
        if (i7 >= this.AEQbTJ) {
            float f2 = i5;
            canvas.drawLine(i9, f2, i10, f2, paint);
        }
        float f3 = i9;
        float f4 = i3;
        float f5 = i5;
        canvas.drawLine(f3, f4, f3, f5, paint);
        float f6 = i10;
        canvas.drawLine(f6, f4, f6, f5, paint);
        paint.setColor(color);
        paint.setStrokeWidth(strokeWidth);
    }
}
