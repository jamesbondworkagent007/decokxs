package o;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.okinc.uilab.richtext.htmlspanner.style.Style;
import o.C55146xeT;

/* JADX INFO: renamed from: o.xeY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55151xeY extends C55216xfk {
    public C55151xeY() {
        super(new Style());
    }

    @Override // o.C55216xfk
    public void KWHzl(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, Style style, C55142xeP c55142xeP) {
        C55146xeT.StateListAnimator stateListAnimatorCopydefault;
        C55146xeT.StateListAnimator stateListAnimatorCopydefault2;
        if (copydefault().EZpvd()) {
            java.lang.String strEZpvd = c59895zpo.EZpvd(OptionalModuleUtils.FACE);
            java.lang.String strEZpvd2 = c59895zpo.EZpvd("size");
            java.lang.String strEZpvd3 = c59895zpo.EZpvd("color");
            style = style.OLrzqt(copydefault().EZpvd(strEZpvd));
            if (strEZpvd2 != null && (stateListAnimatorCopydefault2 = C55146xeT.copydefault("font-size", strEZpvd2)) != null) {
                style = stateListAnimatorCopydefault2.OLrzqt(style, copydefault());
            }
            if (strEZpvd3 != null && copydefault().copydefault() && (stateListAnimatorCopydefault = C55146xeT.copydefault("color", strEZpvd3)) != null) {
                style = stateListAnimatorCopydefault.OLrzqt(style, copydefault());
            }
        }
        super.KWHzl(c59895zpo, spannableStringBuilder, i, i2, style, c55142xeP);
    }
}
