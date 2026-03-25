package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVD extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "ROC";
    }

    public oVD(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 120.0d, 12.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("M", 2.0d, 60.0d, 6.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("ROC", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("MAROC", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        Expression.ActionBar actionBar = new Expression.ActionBar("REF_CLOSE_N", new Expression.Rect(new Expression.Dialog(), parameter));
        EZpvd(actionBar);
        Expression.Output output = new Expression.Output("ROC", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Callback(new Expression.Dialog(), actionBar), actionBar), new Expression.FragmentManager(100.0d)));
        OLrzqt(output);
        OLrzqt(new Expression.Output("MAROC", new Expression.ColorStateList(output, parameter2)));
        valueOf();
    }
}
