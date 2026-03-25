package o;

import android.graphics.Paint;

/* JADX INFO: renamed from: o.xft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55225xft implements android.text.style.LineHeightSpan {
    public final java.lang.Integer EZpvd;
    public final java.lang.Float OLrzqt;

    public C55225xft(java.lang.Float f) {
        this.OLrzqt = f;
        this.EZpvd = null;
    }

    public C55225xft(java.lang.Integer num) {
        this.EZpvd = num;
        this.OLrzqt = null;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int iAbs = java.lang.Math.abs(fontMetricsInt.descent - fontMetricsInt.ascent);
        java.lang.Float f = this.OLrzqt;
        if (f != null) {
            iAbs = (int) (iAbs * f.floatValue());
        } else {
            java.lang.Integer num = this.EZpvd;
            if (num != null) {
                iAbs = num.intValue();
            }
        }
        fontMetricsInt.descent = fontMetricsInt.ascent + iAbs;
    }
}
