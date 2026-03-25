package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVC extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "MACD";
    }

    public oVC(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("SHORT", 2.0d, 200.0d, 12.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("LONG", 2.0d, 200.0d, 26.0d);
        Expression.Parameter parameter3 = new Expression.Parameter("MID", 2.0d, 200.0d, 9.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        OLrzqt(parameter3);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter4 = new Expression.Parameter("DIF", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter("DEA", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        Expression.Parameter parameter6 = new Expression.Parameter("MACD", true, stateListAnimator.KWHzl().KWHzl(2), 255, false);
        EZpvd(parameter4);
        EZpvd(parameter5);
        EZpvd(parameter6);
        Expression.Output output = new Expression.Output("DIF", new Expression.Callback(new Expression.ComponentCallbacks(new Expression.Dialog(), parameter), new Expression.ComponentCallbacks(new Expression.Dialog(), parameter2)));
        OLrzqt(output);
        Expression.Output output2 = new Expression.Output("DEA", new Expression.ComponentCallbacks(output, parameter3));
        OLrzqt(output2);
        OLrzqt(new Expression.Output("MACD", new Expression.AssetManager(new Expression.Callback(output, output2), new Expression.FragmentManager(2.0d)), Expression.Output.Style.MACD_STICK, 0));
        valueOf();
    }
}
