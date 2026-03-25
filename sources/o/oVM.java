package o;

import com.okinc.kline.library.indicator.Expression;
import o.C32392mcI;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVM extends AbstractC36262oVg {
    public Expression.Handler AkhnZx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "SUPERTREND";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Expression.Handler getFieldNames() {
        return this.AkhnZx;
    }

    public oVM(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("PERIOD", 1.0d, 100.0d, 14.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("MULTIPLIER", 1.0d, 10.0d, 3.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pFN pfn = pFN.OLrzqt;
        java.lang.String strKWHzl = pfn.KWHzl(C32392mcI.Dialog.apNbdB);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter(strKWHzl, true, stateListAnimator.KWHzl().KWHzl(15), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter(pfn.KWHzl(C32392mcI.Dialog.akftKQ), true, stateListAnimator.KWHzl().KWHzl(14), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        Expression.ActionBar actionBar = new Expression.ActionBar("TR", new Expression.PackageManager(new Expression.Callback(new Expression.Context(), new Expression.ApplicationInfo()), new Expression.PackageManager(new Expression.TaskDescription(new Expression.Callback(new Expression.Context(), new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d), "SUPERTREND"))), new Expression.TaskDescription(new Expression.Callback(new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d), "SUPERTREND"), new Expression.ApplicationInfo())))));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("ATR", new Expression.Activity(actionBar, parameter));
        EZpvd(actionBar2);
        Expression.ActionBar actionBar3 = new Expression.ActionBar("HL2", new Expression.TaskStackBuilder(new Expression.Application(new Expression.Context(), new Expression.ApplicationInfo()), new Expression.FragmentManager(2.0d)));
        EZpvd(actionBar3);
        Expression.ActionBar actionBar4 = new Expression.ActionBar("BASIC_UPPER", new Expression.Application(actionBar3, new Expression.AssetManager(parameter2, actionBar2)));
        EZpvd(actionBar4);
        Expression.ActionBar actionBar5 = new Expression.ActionBar("BASIC_LOWER", new Expression.Callback(actionBar3, new Expression.AssetManager(parameter2, actionBar2)));
        EZpvd(actionBar5);
        Expression.Handler handler = new Expression.Handler(actionBar4, actionBar5, actionBar3, parameter);
        this.AkhnZx = handler;
        OLrzqt(new Expression.Output("SUPERTREND", handler, Expression.Output.Style.SUPERTREND, 0));
        valueOf();
    }

    @Override // o.AbstractC36262oVg
    public double djBIcL() {
        return EZpvd(0).getValue();
    }
}
