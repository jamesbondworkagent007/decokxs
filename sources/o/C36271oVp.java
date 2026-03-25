package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36271oVp extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "DMA";
    }

    public C36271oVp(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N1", 2.0d, 60.0d, 10.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("N2", 2.0d, 250.0d, 50.0d);
        Expression.Parameter parameter3 = new Expression.Parameter("M", 2.0d, 100.0d, 10.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        OLrzqt(parameter3);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter4 = new Expression.Parameter("DMA", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter("AMA", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter4);
        EZpvd(parameter5);
        Expression.Output output = new Expression.Output("DIF", new Expression.Callback(new Expression.ColorStateList(new Expression.Dialog(), parameter), new Expression.ColorStateList(new Expression.Dialog(), parameter2)));
        OLrzqt(output);
        OLrzqt(new Expression.Output("DIFMA", new Expression.ColorStateList(output, parameter3)));
        valueOf();
    }
}
