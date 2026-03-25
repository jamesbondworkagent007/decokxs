package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.okinc.market.widget.calendar.AttrsHolder;
import com.okinc.market.widget.calendar.DayItem;
import kotlin.jvm.internal.Intrinsics;
import o.qYY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYV implements qYY {
    public final AttrsHolder AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final java.util.List<DayItem> OLrzqt;
    public final android.text.TextPaint copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AttrsHolder EZpvd() {
        return this.AEQbTJ;
    }

    public qYV(@NotNull AttrsHolder attrsHolder, @NotNull android.text.TextPaint textPaint, @NotNull java.util.List<DayItem> list, int i) {
        Intrinsics.checkNotNullParameter(attrsHolder, "");
        Intrinsics.checkNotNullParameter(textPaint, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = attrsHolder;
        this.copydefault = textPaint;
        this.OLrzqt = list;
        this.EZpvd = i;
        this.KWHzl = 7;
    }

    public void KWHzl(boolean z, int i, int i2, int i3, int i4) {
        qYY.ActionBar.copydefault(this, z, i, i2, i3, i4);
    }

    public void OLrzqt(int i, int i2) {
        qYY.ActionBar.OLrzqt(this, i, i2);
        int i3 = i2 / this.EZpvd;
        int i4 = i / this.KWHzl;
        int i5 = 0;
        for (java.lang.Object obj : this.OLrzqt) {
            if (i5 < 0) {
                yDY.AYXKKw();
            }
            DayItem dayItem = (DayItem) obj;
            if (dayItem.EZpvd(EZpvd())) {
                int i6 = this.KWHzl;
                int i7 = i5 / i6;
                int i8 = i5 % i6;
                dayItem.EZpvd().set(i8 * i4, i7 * i3, (i8 + 1) * i4, (i7 + 1) * i3);
            }
            i5++;
        }
    }

    public final void KWHzl(DayItem dayItem, android.graphics.Canvas canvas, float f, float f2) {
        float fMeasureText = this.copydefault.measureText(dayItem.AEQbTJ()) / 2;
        float fDpInt$default = C55298xhM.dpInt$default(1, (android.content.Context) null, 1, (java.lang.Object) null) / 2;
        float fDpInt$default2 = f2 + C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null) + fDpInt$default;
        this.copydefault.setColor(EZpvd().AkhnZx());
        this.copydefault.setStyle(Paint.Style.FILL);
        canvas.drawRect(f - fMeasureText, fDpInt$default2 - fDpInt$default, f + fMeasureText, fDpInt$default2 + fDpInt$default, this.copydefault);
        this.copydefault.setColor(dayItem.AhwBna());
    }

    public final void EZpvd(android.graphics.Canvas canvas, android.graphics.Rect rect, java.lang.Integer num) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(num != null ? num.intValue() : EZpvd().AkhnZx());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C55298xhM.dpInt$default(1, (android.content.Context) null, 1, (java.lang.Object) null));
        RectF rectF = new RectF(rect);
        rectF.inset(EZpvd().valueOf(), EZpvd().valueOf());
        canvas.drawRoundRect(rectF, EZpvd().AubY(), EZpvd().AubY(), paint);
    }

    public final void EZpvd(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (EZpvd().AEQbTJ() != 0) {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            paint.setColor(EZpvd().AEQbTJ());
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = new RectF(rect);
            rectF.inset(EZpvd().valueOf(), EZpvd().valueOf());
            canvas.drawRoundRect(rectF, EZpvd().AubY(), EZpvd().AubY(), paint);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, android.graphics.Rect rect, qYM qym) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(qym.AEQbTJ());
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = new RectF(rect);
        rectF.inset(EZpvd().valueOf(), EZpvd().valueOf());
        canvas.drawRoundRect(rectF, EZpvd().AubY(), EZpvd().AubY(), paint);
        if (qym.AhwBna() == -1 || qym.AhwBna() == qym.AEQbTJ()) {
            return;
        }
        paint.setColor(qym.AhwBna());
        float fDpInt$default = C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
        android.graphics.Path path = new android.graphics.Path();
        float f = rectF.left;
        float f2 = rectF.top;
        path.addRoundRect(new RectF(f, f2, rectF.right, f2 + fDpInt$default), new float[]{EZpvd().AubY(), EZpvd().AubY(), EZpvd().AubY(), EZpvd().AubY(), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float f3 = rectF.left;
        float f4 = rectF.top;
        canvas.drawRect(f3, f4, rectF.right, f4 + fDpInt$default, paint);
        canvas.restore();
    }

    public final void OLrzqt(DayItem dayItem, android.graphics.Canvas canvas, float f, float f2) {
        if (dayItem.KWHzl() != null) {
            return;
        }
        Paint.Align textAlign = this.copydefault.getTextAlign();
        this.copydefault.setTextAlign(Paint.Align.CENTER);
        if (dayItem.valueOf() && !EZpvd().KWHzl()) {
            this.copydefault.setColor(EZpvd().values());
        } else {
            this.copydefault.setColor(dayItem.AhwBna());
        }
        canvas.drawText(dayItem.AEQbTJ(), f, f2, this.copydefault);
        this.copydefault.setTextAlign(textAlign);
    }

    public void KWHzl(@NotNull android.graphics.Canvas canvas) {
        float fCenterY;
        float fCopydefault;
        Intrinsics.checkNotNullParameter(canvas, "");
        for (DayItem dayItem : this.OLrzqt) {
            if (dayItem.EZpvd(EZpvd())) {
                android.graphics.Rect rectEZpvd = dayItem.EZpvd();
                float fCenterX = rectEZpvd.centerX();
                if (EZpvd().EZpvd()) {
                    Paint.FontMetrics fontMetrics = this.copydefault.getFontMetrics();
                    fCenterY = rectEZpvd.top + ((fontMetrics.bottom - fontMetrics.top) / 2) + EZpvd().fARcdN();
                } else {
                    fCenterY = rectEZpvd.centerY();
                }
                if (EZpvd().copydefault() && dayItem.KWHzl() != null) {
                    qYM qymKWHzl = dayItem.KWHzl();
                    Intrinsics.copydefault(qymKWHzl);
                    EZpvd(canvas, rectEZpvd, qymKWHzl);
                } else if (!dayItem.valueOf()) {
                    EZpvd(canvas, rectEZpvd);
                }
                qYM qymKWHzl2 = dayItem.KWHzl();
                if ((qymKWHzl2 != null ? java.lang.Integer.valueOf(qymKWHzl2.AhwBna()) : null) != null) {
                    fCopydefault = qYT.copydefault(this.copydefault, java.lang.Float.valueOf(fCenterY));
                } else {
                    fCopydefault = qYT.copydefault(this.copydefault, java.lang.Float.valueOf(rectEZpvd.centerY()));
                }
                if (dayItem.AYXKKw()) {
                    if (EZpvd().AuCTel()) {
                        KWHzl(dayItem, canvas, fCenterX, fCopydefault);
                    } else {
                        qYM qymKWHzl3 = dayItem.KWHzl();
                        EZpvd(canvas, rectEZpvd, qymKWHzl3 != null ? java.lang.Integer.valueOf(qymKWHzl3.KWHzl()) : null);
                    }
                }
                OLrzqt(dayItem, canvas, fCenterX, fCopydefault);
            }
        }
    }
}
