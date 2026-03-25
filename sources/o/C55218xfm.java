package o;

import androidx.compose.material.OutlinedTextFieldKt;
import com.okinc.uilab.richtext.htmlspanner.style.Style;

/* JADX INFO: renamed from: o.xfm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55218xfm extends C55220xfo {
    public C55218xfm(C55216xfk c55216xfk) {
        super(c55216xfk);
    }

    @Override // o.C55220xfo, o.C55216xfk
    public void KWHzl(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, Style style, C55142xeP c55142xeP) {
        if (c59895zpo.EZpvd(OutlinedTextFieldKt.BorderId) != null) {
            c55142xeP.KWHzl(new C55223xfr(style, i, i2, copydefault().copydefault()), i, i2);
        }
        super.KWHzl(c59895zpo, spannableStringBuilder, i, i2, style, c55142xeP);
    }
}
