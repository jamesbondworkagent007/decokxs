package o;

import com.okinc.uilab.richtext.htmlspanner.style.Style;
import com.okinc.uilab.richtext.htmlspanner.style.StyleValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xfd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55209xfd extends C55216xfk {
    public final StyleValue AEQbTJ;
    public final int KWHzl;
    public final StyleValue OLrzqt;

    public C55209xfd(float f, float f2, int i) {
        this.KWHzl = i;
        StyleValue.Unit unit = StyleValue.Unit.EM;
        this.AEQbTJ = new StyleValue(f, unit);
        this.OLrzqt = new StyleValue(f2, unit);
    }

    @Override // o.C55216xfk
    public Style AEQbTJ() {
        Style styleAhwBna = super.AEQbTJ().copydefault(this.AEQbTJ).OLrzqt(copydefault().AEQbTJ().copydefault()).AEQbTJ(Style.DisplayStyle.BLOCK).OLrzqt(this.OLrzqt).copydefault(java.lang.Integer.valueOf(this.KWHzl)).AhwBna(this.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(styleAhwBna, "");
        return styleAhwBna;
    }
}
