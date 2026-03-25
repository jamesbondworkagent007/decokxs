package o;

import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import com.okinc.market.widget.calendar.AttrsHolder;
import com.okinc.market.widget.calendar.DayItem;
import kotlin.jvm.internal.Intrinsics;
import o.qYY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40524qZa implements qYY {
    public final android.text.TextPaint EZpvd;
    public final java.util.List<DayItem> KWHzl;
    public final AttrsHolder OLrzqt;
    public final android.text.TextPaint copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AttrsHolder KWHzl() {
        return this.OLrzqt;
    }

    public C40524qZa(@NotNull android.content.Context context, @NotNull AttrsHolder attrsHolder, @NotNull android.text.TextPaint textPaint, @NotNull java.util.List<DayItem> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attrsHolder, "");
        Intrinsics.checkNotNullParameter(textPaint, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = attrsHolder;
        this.EZpvd = textPaint;
        this.KWHzl = list;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        TextViewCompat.setTextAppearance(appCompatTextView, KWHzl().AYXKKw());
        android.text.TextPaint paint = appCompatTextView.getPaint();
        paint.setTextAlign(Paint.Align.CENTER);
        Intrinsics.checkNotNullExpressionValue(paint, "");
        this.copydefault = paint;
    }

    public void AEQbTJ(int i, int i2) {
        qYY.ActionBar.OLrzqt(this, i, i2);
    }

    public void copydefault(boolean z, int i, int i2, int i3, int i4) {
        qYY.ActionBar.copydefault(this, z, i, i2, i3, i4);
    }

    public void AEQbTJ(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (KWHzl().EZpvd()) {
            for (DayItem dayItem : this.KWHzl) {
                qYM qymKWHzl = dayItem.KWHzl();
                if (dayItem.EZpvd(KWHzl()) && qymKWHzl != null) {
                    OLrzqt(dayItem, canvas, qymKWHzl);
                }
            }
        }
    }

    public final void OLrzqt(DayItem dayItem, android.graphics.Canvas canvas, qYM qym) {
        float fCenterX = dayItem.EZpvd().centerX();
        float fCenterY = dayItem.EZpvd().centerY();
        float fGEmmrt = KWHzl().gEmmrt();
        float fOLrzqt = KWHzl().OLrzqt();
        float f = 2;
        float fAhwBna = ((KWHzl().AhwBna() + fGEmmrt) + fOLrzqt) / f;
        float f2 = fGEmmrt / f;
        float f3 = fOLrzqt / f;
        if (dayItem.valueOf() && !KWHzl().KWHzl()) {
            this.EZpvd.setColor(KWHzl().values());
        } else {
            this.EZpvd.setColor(dayItem.AhwBna());
        }
        canvas.drawText(dayItem.AEQbTJ(), fCenterX, qYT.copydefault(this.EZpvd, java.lang.Float.valueOf((fCenterY - fAhwBna) + f2)), this.EZpvd);
        this.copydefault.setColor(qym.KWHzl());
        canvas.drawText(qym.copydefault(), fCenterX, qYT.copydefault(this.copydefault, java.lang.Float.valueOf((fCenterY + fAhwBna) - f3)), this.copydefault);
    }
}
