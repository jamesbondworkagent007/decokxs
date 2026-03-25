package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36279oVx extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "KDJ";
    }

    public C36279oVx(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 90.0d, 9.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("M1", 2.0d, 90.0d, 3.0d);
        Expression.Parameter parameter3 = new Expression.Parameter("M2", 2.0d, 90.0d, 3.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        OLrzqt(parameter3);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter4 = new Expression.Parameter("K", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter("D", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        Expression.Parameter parameter6 = new Expression.Parameter("J", true, stateListAnimator.KWHzl().KWHzl(2), 255, false);
        EZpvd(parameter4);
        EZpvd(parameter5);
        EZpvd(parameter6);
        Expression.ActionBar actionBar = new Expression.ActionBar("HHV", new Expression.ContextWrapper(new Expression.Context(), parameter));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("LLV", new Expression.ServiceConnection(new Expression.ApplicationInfo(), parameter));
        EZpvd(actionBar2);
        Expression.ActionBar actionBar3 = new Expression.ActionBar("RSV", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Callback(new Expression.Dialog(), actionBar2), new Expression.Callback(actionBar, actionBar2)), new Expression.FragmentManager(100.0d)));
        EZpvd(actionBar3);
        Expression.Output output = new Expression.Output("K", new Expression.MediaController(actionBar3, parameter2, new Expression.FragmentManager(1.0d)));
        OLrzqt(output);
        Expression.Output output2 = new Expression.Output("D", new Expression.MediaController(output, parameter3, new Expression.FragmentManager(1.0d)));
        OLrzqt(output2);
        OLrzqt(new Expression.Output("J", new Expression.Callback(new Expression.AssetManager(output, new Expression.FragmentManager(3.0d)), new Expression.AssetManager(output2, new Expression.FragmentManager(2.0d)))));
        valueOf();
    }

    @Override // o.AbstractC36262oVg
    public double djBIcL() {
        return EZpvd(0).getValue();
    }
}
