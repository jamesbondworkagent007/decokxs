package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVV extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "WR";
    }

    public oVV(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 100.0d, 10.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("N1", 2.0d, 100.0d, 6.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("WR1", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("WR2", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        Expression.ActionBar actionBar = new Expression.ActionBar("HHV", new Expression.ContextWrapper(new Expression.Context(), parameter));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("HHV1", new Expression.ContextWrapper(new Expression.Context(), parameter2));
        EZpvd(actionBar2);
        Expression.ActionBar actionBar3 = new Expression.ActionBar("LLV", new Expression.ServiceConnection(new Expression.ApplicationInfo(), parameter));
        EZpvd(actionBar3);
        Expression.ActionBar actionBar4 = new Expression.ActionBar("LLV1", new Expression.ServiceConnection(new Expression.ApplicationInfo(), parameter2));
        EZpvd(actionBar4);
        OLrzqt(new Expression.Output("WR1", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Callback(actionBar, new Expression.Dialog()), new Expression.Callback(actionBar, actionBar3)), new Expression.FragmentManager(100.0d))));
        OLrzqt(new Expression.Output("WR2", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Callback(actionBar2, new Expression.Dialog()), new Expression.Callback(actionBar2, actionBar4)), new Expression.FragmentManager(100.0d))));
        valueOf();
    }
}
