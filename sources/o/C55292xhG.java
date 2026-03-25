package o;

import android.graphics.Paint;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55292xhG {
    public static final C55292xhG EZpvd = new C55292xhG();

    private C55292xhG() {
    }

    public final void copydefault(android.widget.TextView textView, android.graphics.Canvas canvas, android.graphics.drawable.Drawable drawable, int i) {
        int compoundDrawablePadding = textView.getCompoundDrawablePadding();
        int iWidth = drawable.getBounds().width();
        int iHeight = drawable.getBounds().height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (iWidth == 0) {
            iHeight = intrinsicHeight;
            iWidth = intrinsicWidth;
        }
        if (i == 48) {
            Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
            float f = fontMetrics.descent;
            float f2 = fontMetrics.ascent;
            float f3 = iHeight;
            canvas.translate(0.0f, (1 * (textView.getHeight() - (((((f - f2) + f3) + compoundDrawablePadding) + textView.getPaddingTop()) + textView.getPaddingBottom()))) / 2);
            return;
        }
        if (i != 80) {
            if (i == 8388611 || i == 8388613) {
                EZpvd(textView, textView.getPaint().measureText(textView.getText().toString()) + iWidth + compoundDrawablePadding);
                return;
            }
            return;
        }
        Paint.FontMetrics fontMetrics2 = textView.getPaint().getFontMetrics();
        float f4 = fontMetrics2.descent;
        float f5 = fontMetrics2.ascent;
        float f6 = iHeight;
        canvas.translate(0.0f, ((-1) * (textView.getHeight() - (((((f4 - f5) + f6) + compoundDrawablePadding) + textView.getPaddingTop()) + textView.getPaddingBottom()))) / 2);
    }

    public final void EZpvd(android.widget.TextView textView, float f) {
        int width = (int) ((textView.getWidth() - f) / 2);
        if (textView.getPaddingLeft() == width && textView.getPaddingRight() == width) {
            return;
        }
        textView.setPaddingRelative(width, 0, width, 0);
    }

    public final void KWHzl(@NotNull android.widget.TextView textView, @NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "");
        if (compoundDrawables[0] != null) {
            textView.setGravity(TextAlign.LEFT);
            android.graphics.drawable.Drawable drawable = compoundDrawables[0];
            Intrinsics.checkNotNullExpressionValue(drawable, "");
            copydefault(textView, canvas, drawable, 8388611);
            return;
        }
        if (compoundDrawables[1] != null) {
            textView.setGravity(49);
            android.graphics.drawable.Drawable drawable2 = compoundDrawables[1];
            Intrinsics.checkNotNullExpressionValue(drawable2, "");
            copydefault(textView, canvas, drawable2, 48);
            return;
        }
        if (compoundDrawables[2] != null) {
            textView.setGravity(TextAlign.RIGHT);
            android.graphics.drawable.Drawable drawable3 = compoundDrawables[2];
            Intrinsics.checkNotNullExpressionValue(drawable3, "");
            copydefault(textView, canvas, drawable3, 8388613);
            return;
        }
        if (compoundDrawables[3] != null) {
            textView.setGravity(81);
            android.graphics.drawable.Drawable drawable4 = compoundDrawables[3];
            Intrinsics.checkNotNullExpressionValue(drawable4, "");
            copydefault(textView, canvas, drawable4, 80);
            return;
        }
        textView.setGravity(17);
    }
}
