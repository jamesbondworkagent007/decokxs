package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVJ extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "SKDJ";
    }

    public oVJ(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 90.0d, 9.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("M1", 2.0d, 90.0d, 3.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("K", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("D", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        Expression.ActionBar actionBar = new Expression.ActionBar("HHV", new Expression.ContextWrapper(new Expression.Context(), parameter));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("LLV", new Expression.ServiceConnection(new Expression.ApplicationInfo(), parameter));
        EZpvd(actionBar2);
        Expression.ActionBar actionBar3 = new Expression.ActionBar("RSV", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Callback(new Expression.Dialog(), actionBar2), new Expression.Callback(actionBar, actionBar2)), new Expression.FragmentManager(100.0d)));
        EZpvd(actionBar3);
        Expression.ActionBar actionBar4 = new Expression.ActionBar("SLOWRSV", new Expression.ComponentCallbacks(actionBar3, parameter2));
        EZpvd(actionBar4);
        Expression.Output output = new Expression.Output("K", new Expression.ComponentCallbacks(actionBar4, parameter2));
        OLrzqt(output);
        OLrzqt(new Expression.Output("D", new Expression.ColorStateList(output, parameter2)));
        valueOf();
    }
}
