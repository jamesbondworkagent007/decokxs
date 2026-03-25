package o;

import android.graphics.Paint;

/* JADX INFO: renamed from: o.atO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7942atO extends android.text.style.CharacterStyle {
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.EZpvd;
    }

    public C7942atO(int i) {
        this.EZpvd = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        float f = this.EZpvd / 400.0f;
        if (textPaint.getStyle() == Paint.Style.FILL) {
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        textPaint.setStrokeWidth(f);
    }
}
