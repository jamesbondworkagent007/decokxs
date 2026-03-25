package o;

import android.graphics.Paint;

/* JADX INFO: renamed from: o.mzm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@java.lang.Deprecated
public final class C33615mzm {
    public static void OLrzqt(android.widget.TextView textView, android.graphics.Canvas canvas, android.graphics.drawable.Drawable drawable, int i) {
        int compoundDrawablePadding = textView.getCompoundDrawablePadding();
        int i2 = 1;
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        return;
                    } else {
                        i2 = -1;
                    }
                }
                Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
                float f = fontMetrics.descent;
                float f2 = fontMetrics.ascent;
                float intrinsicHeight = drawable.getIntrinsicHeight();
                canvas.translate(0.0f, (i2 * (textView.getHeight() - (((((f - f2) + intrinsicHeight) + compoundDrawablePadding) + textView.getPaddingTop()) + textView.getPaddingBottom()))) / 2.0f);
                return;
            }
            i2 = -1;
        }
        float fMeasureText = textView.getPaint().measureText(textView.getText().toString());
        float intrinsicWidth = drawable.getIntrinsicWidth();
        canvas.translate((i2 * (textView.getWidth() - ((((fMeasureText + intrinsicWidth) + compoundDrawablePadding) + textView.getPaddingLeft()) + textView.getPaddingRight()))) / 2.0f, 0.0f);
    }

    public static void AEQbTJ(android.widget.TextView textView, android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (compoundDrawables != null) {
            if (compoundDrawables[0] != null) {
                textView.setGravity(19);
                OLrzqt(textView, canvas, compoundDrawables[0], 3);
                return;
            }
            if (compoundDrawables[1] != null) {
                textView.setGravity(49);
                OLrzqt(textView, canvas, compoundDrawables[1], 48);
            } else if (compoundDrawables[2] != null) {
                textView.setGravity(21);
                OLrzqt(textView, canvas, compoundDrawables[2], 5);
            } else if (compoundDrawables[3] != null) {
                textView.setGravity(81);
                OLrzqt(textView, canvas, compoundDrawables[3], 80);
            }
        }
    }
}
