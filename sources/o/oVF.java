package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVF extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "PSY";
    }

    public oVF(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 100.0d, 12.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("M", 2.0d, 100.0d, 6.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("PSY", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("MAPSY", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        Expression.Output output = new Expression.Output("PSY", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Fragment(new Expression.ContentResolver(new Expression.Dialog(), new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d))), parameter), parameter), new Expression.FragmentManager(100.0d)));
        OLrzqt(output);
        OLrzqt(new Expression.Output("MAPSY", new Expression.ColorStateList(output, parameter2)));
        valueOf();
    }
}
