package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C33034moo extends android.graphics.drawable.Drawable {
    public final InterfaceC56387yDm AEQbTJ;
    public final int AhwBna;
    public final java.lang.String EZpvd;
    public final android.graphics.drawable.Drawable KWHzl;
    public final int OLrzqt;
    public final InterfaceC56387yDm copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C33034moo(@NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.KWHzl = drawable;
        this.OLrzqt = i;
        this.AhwBna = i2;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.moq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33034moo.copydefault(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33034moo.KWHzl(this.OLrzqt);
            }
        });
    }

    public final float AEQbTJ() {
        return getBounds().width() * 0.5f;
    }

    public final android.graphics.Paint copydefault() {
        return (android.graphics.Paint) this.copydefault.getValue();
    }

    public static final android.graphics.Paint copydefault(C33034moo c33034moo) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(c33034moo.OLrzqt);
        return paint;
    }

    public final android.text.TextPaint OLrzqt() {
        return (android.text.TextPaint) this.AEQbTJ.getValue();
    }

    public static final android.text.TextPaint KWHzl(C33034moo c33034moo) {
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        textPaint.setTypeface(C55051xce.OLrzqt.OLrzqt());
        textPaint.setColor(c33034moo.AhwBna);
        textPaint.setTextSize(c33034moo.AEQbTJ());
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        float fAEQbTJ = AEQbTJ();
        float fHeight = getBounds().height() / 2.0f;
        canvas.drawCircle(fAEQbTJ, fHeight, AEQbTJ(), copydefault());
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) this.EZpvd).toString();
        if (EZpvd(string)) {
            int iWidth = getBounds().width();
            int iHeight = getBounds().height();
            android.graphics.drawable.Drawable drawable = this.KWHzl;
            int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
            android.graphics.drawable.Drawable drawable2 = this.KWHzl;
            float f = intrinsicWidth;
            float intrinsicHeight = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
            float fMin = java.lang.Math.min(AEQbTJ() / f, AEQbTJ() / intrinsicHeight);
            int i = (int) (f * fMin);
            int i2 = (int) (intrinsicHeight * fMin);
            int i3 = getBounds().left + ((iWidth - i) / 2);
            int i4 = getBounds().top + ((iHeight - i2) / 2);
            android.graphics.drawable.Drawable drawable3 = this.KWHzl;
            if (drawable3 != null) {
                drawable3.setBounds(i3, i4, i + i3, i2 + i4);
            }
            android.graphics.drawable.Drawable drawable4 = this.KWHzl;
            if (drawable4 != null) {
                drawable4.draw(canvas);
                return;
            }
            return;
        }
        float fDescent = (OLrzqt().descent() - OLrzqt().ascent()) / 2;
        float fDescent2 = OLrzqt().descent();
        java.lang.String strValueOf = java.lang.String.valueOf(C59454zhO.zLjUOn((java.lang.CharSequence) string));
        Intrinsics.copydefault(strValueOf, "");
        java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        canvas.drawText(upperCase, fAEQbTJ, fHeight + (fDescent - fDescent2), OLrzqt());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        copydefault().setAlpha(i);
        OLrzqt().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        copydefault().setColorFilter(colorFilter);
        OLrzqt().setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean EZpvd(java.lang.String str) {
        if (str.length() == 0) {
            return true;
        }
        char cZLjUOn = C59454zhO.zLjUOn((java.lang.CharSequence) str);
        if (CharsKt__CharJVMKt.EZpvd(cZLjUOn) || java.lang.Character.isDigit(cZLjUOn) || new Regex("[\\uD83C-\\uDBFF\\uDC00-\\uDFFF]|[\\u2600-\\u27BF]").matches(java.lang.String.valueOf(cZLjUOn))) {
            return true;
        }
        return new Regex("^[\\p{P}$+<>=^|~]").matches(java.lang.String.valueOf(cZLjUOn));
    }
}
