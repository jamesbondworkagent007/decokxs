package com.okinc.uilab.richtext.htmlspanner.spans;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import o.C55130xeD;

/* JADX INFO: loaded from: classes11.dex */
public class FontFamilySpan extends TypefaceSpan {
    public final C55130xeD AEQbTJ;
    public boolean OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55130xeD AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.copydefault;
    }

    public FontFamilySpan(C55130xeD c55130xeD) {
        super(c55130xeD.copydefault());
        this.AEQbTJ = c55130xeD;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        copydefault(textPaint, this.AEQbTJ);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        copydefault(textPaint, this.AEQbTJ);
    }

    public final void copydefault(Paint paint, C55130xeD c55130xeD) {
        paint.setAntiAlias(true);
        paint.setTypeface(c55130xeD.AEQbTJ());
        if (this.OLrzqt) {
            if (c55130xeD.djBIcL()) {
                paint.setFakeBoldText(true);
            } else {
                paint.setTypeface(c55130xeD.OLrzqt());
            }
        }
        if (this.copydefault) {
            if (c55130xeD.AYXKKw()) {
                paint.setTextSkewX(-0.25f);
            } else {
                paint.setTypeface(c55130xeD.KWHzl());
            }
        }
        if (this.OLrzqt && this.copydefault && c55130xeD.EZpvd() != null) {
            paint.setTypeface(c55130xeD.EZpvd());
        }
    }

    @Override // android.text.style.TypefaceSpan
    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        sb.append("  font-family: " + this.AEQbTJ.copydefault() + "\n");
        sb.append("  bold: " + EZpvd() + "\n");
        sb.append("  italic: " + copydefault() + "\n");
        sb.append("}");
        return sb.toString();
    }
}
