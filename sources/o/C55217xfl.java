package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.uilab.richtext.htmlspanner.style.Style;
import o.C55146xeT;

/* JADX INFO: renamed from: o.xfl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55217xfl extends C55220xfo {
    public C55217xfl(C55216xfk c55216xfk) {
        super(c55216xfk);
    }

    @Override // o.C55220xfo, o.C55216xfk
    public void KWHzl(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, Style style, C55142xeP c55142xeP) {
        java.lang.String strEZpvd = c59895zpo.EZpvd(TtmlNode.TAG_STYLE);
        if (copydefault().EZpvd() && strEZpvd != null) {
            super.KWHzl(c59895zpo, spannableStringBuilder, i, i2, copydefault(style, strEZpvd), c55142xeP);
        } else {
            super.KWHzl(c59895zpo, spannableStringBuilder, i, i2, style, c55142xeP);
        }
    }

    public final Style copydefault(Style style, java.lang.String str) {
        Style styleOLrzqt = style;
        for (java.lang.String str2 : str.split(";")) {
            java.lang.String[] strArrSplit = str2.split(":");
            if (strArrSplit.length != 2) {
                return style;
            }
            C55146xeT.StateListAnimator stateListAnimatorCopydefault = C55146xeT.copydefault(strArrSplit[0].toLowerCase().trim(), strArrSplit[1].toLowerCase().trim());
            if (stateListAnimatorCopydefault != null) {
                styleOLrzqt = stateListAnimatorCopydefault.OLrzqt(styleOLrzqt, copydefault());
            }
        }
        return styleOLrzqt;
    }
}
