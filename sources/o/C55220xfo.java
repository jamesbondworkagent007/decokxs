package o;

import com.okinc.uilab.richtext.htmlspanner.style.Style;

/* JADX INFO: renamed from: o.xfo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55220xfo extends C55216xfk {
    public C55216xfk AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55216xfk EZpvd() {
        return this.AEQbTJ;
    }

    public C55220xfo(C55216xfk c55216xfk) {
        super(new Style());
        this.AEQbTJ = c55216xfk;
    }

    @Override // o.C55216xfk
    public Style AEQbTJ() {
        return this.AEQbTJ.AEQbTJ();
    }

    @Override // o.C55216xfk, o.AbstractC55144xeR
    public void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, C55142xeP c55142xeP) {
        C55216xfk c55216xfk = this.AEQbTJ;
        if (c55216xfk != null) {
            c55216xfk.copydefault(c59895zpo, spannableStringBuilder, c55142xeP);
        }
    }

    @Override // o.C55216xfk
    public void KWHzl(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, Style style, C55142xeP c55142xeP) {
        C55216xfk c55216xfk = this.AEQbTJ;
        if (c55216xfk != null) {
            c55216xfk.KWHzl(c59895zpo, spannableStringBuilder, i, i2, style, c55142xeP);
        }
    }

    @Override // o.AbstractC55144xeR
    public void KWHzl(C55135xeI c55135xeI) {
        super.KWHzl(c55135xeI);
        if (EZpvd() != null) {
            EZpvd().KWHzl(c55135xeI);
        }
    }
}
