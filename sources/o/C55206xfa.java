package o;

import com.okinc.uilab.richtext.htmlspanner.style.Style;
import com.okinc.uilab.richtext.htmlspanner.style.StyleValue;

/* JADX INFO: renamed from: o.xfa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55206xfa extends C55216xfk {
    public final int KWHzl;
    public final StyleValue OLrzqt;
    public final StyleValue copydefault;

    public C55206xfa(float f, float f2, int i) {
        StyleValue.Unit unit = StyleValue.Unit.EM;
        this.OLrzqt = new StyleValue(f, unit);
        this.copydefault = new StyleValue(f2, unit);
        this.KWHzl = i;
    }

    @Override // o.C55216xfk
    public Style AEQbTJ() {
        return super.AEQbTJ().copydefault(this.OLrzqt).KWHzl(Style.FontWeight.BOLD).AEQbTJ(Style.DisplayStyle.BLOCK).OLrzqt(this.copydefault).copydefault(java.lang.Integer.valueOf(this.KWHzl)).AhwBna(this.copydefault);
    }
}
