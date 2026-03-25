package o;

import com.okinc.uilab.richtext.htmlspanner.style.Style;
import com.okinc.uilab.richtext.htmlspanner.style.StyleValue;

/* JADX INFO: renamed from: o.xfk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55216xfk extends AbstractC55144xeR {
    public Style valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Style AEQbTJ() {
        return this.valueOf;
    }

    public C55216xfk() {
        this.valueOf = new Style();
    }

    public C55216xfk(Style style) {
        this.valueOf = style;
    }

    @Override // o.AbstractC55144xeR
    public void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, C55142xeP c55142xeP) {
        Style styleAEQbTJ = c55142xeP.AEQbTJ(c59895zpo, AEQbTJ());
        if (spannableStringBuilder.length() > 0 && styleAEQbTJ.valueOf() == Style.DisplayStyle.BLOCK && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        if (styleAEQbTJ.DbNXlk() != null) {
            StyleValue styleValueDbNXlk = styleAEQbTJ.DbNXlk();
            if (styleValueDbNXlk.copydefault() == StyleValue.Unit.PX) {
                if (styleValueDbNXlk.KWHzl() <= 0 || !AEQbTJ(spannableStringBuilder)) {
                    return;
                }
                c55142xeP.KWHzl(new C55225xft(java.lang.Integer.valueOf(styleValueDbNXlk.KWHzl())), spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                return;
            }
            if (styleValueDbNXlk.EZpvd() <= 0.0f || !AEQbTJ(spannableStringBuilder)) {
                return;
            }
            c55142xeP.KWHzl(new C55225xft(java.lang.Float.valueOf(styleValueDbNXlk.EZpvd())), spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    @Override // o.AbstractC55144xeR
    public final void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, C55142xeP c55142xeP) {
        KWHzl(c59895zpo, spannableStringBuilder, i, i2, c55142xeP.AEQbTJ(c59895zpo, AEQbTJ()), c55142xeP);
    }

    public void KWHzl(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, Style style, C55142xeP c55142xeP) {
        if (style.valueOf() == Style.DisplayStyle.BLOCK) {
            AEQbTJ(spannableStringBuilder);
            if (style.fetchVPNInfo() != null) {
                StyleValue styleValueFetchVPNInfo = style.fetchVPNInfo();
                if (styleValueFetchVPNInfo.copydefault() == StyleValue.Unit.PX) {
                    if (styleValueFetchVPNInfo.KWHzl() > 0) {
                        AEQbTJ(spannableStringBuilder);
                        c55142xeP.KWHzl(new C55225xft(java.lang.Integer.valueOf(styleValueFetchVPNInfo.KWHzl())), spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                } else if (styleValueFetchVPNInfo.EZpvd() > 0.0f) {
                    AEQbTJ(spannableStringBuilder);
                    c55142xeP.KWHzl(new C55225xft(java.lang.Float.valueOf(styleValueFetchVPNInfo.EZpvd())), spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                }
            }
        }
        if (spannableStringBuilder.length() > i) {
            c55142xeP.KWHzl(new C55227xfv(copydefault().AEQbTJ().OLrzqt(), style, i, spannableStringBuilder.length()));
        } else {
            spannableStringBuilder.length();
        }
    }
}
