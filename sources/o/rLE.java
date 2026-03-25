package o;

/* JADX INFO: loaded from: classes23.dex */
public final class rLE implements android.text.style.LeadingMarginSpan {
    public final int OLrzqt;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        if (z) {
            return 0;
        }
        return this.OLrzqt;
    }

    public rLE(int i) {
        this.OLrzqt = i;
    }
}
