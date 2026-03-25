package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.uilab.richtext.htmlspanner.style.Style;

/* JADX INFO: renamed from: o.xfn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55219xfn extends C55220xfo {
    public C55219xfn(C55216xfk c55216xfk) {
        super(c55216xfk);
    }

    @Override // o.C55220xfo, o.C55216xfk
    public void KWHzl(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, Style style, C55142xeP c55142xeP) {
        java.lang.String strEZpvd = c59895zpo.EZpvd("align");
        if (TtmlNode.RIGHT.equalsIgnoreCase(strEZpvd)) {
            style = style.EZpvd(Style.TextAlignment.RIGHT);
        } else if (TtmlNode.CENTER.equalsIgnoreCase(strEZpvd)) {
            style = style.EZpvd(Style.TextAlignment.CENTER);
        } else if (TtmlNode.LEFT.equalsIgnoreCase(strEZpvd)) {
            style = style.EZpvd(Style.TextAlignment.LEFT);
        }
        super.KWHzl(c59895zpo, spannableStringBuilder, i, i2, style, c55142xeP);
    }
}
