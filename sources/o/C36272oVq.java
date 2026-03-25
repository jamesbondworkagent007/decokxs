package o;

import com.okinc.kline.library.indicator.Expression;
import o.oVA;
import o.pDT;

/* JADX INFO: renamed from: o.oVq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36272oVq extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "EMA";
    }

    public C36272oVq(java.lang.String str) {
        super(str);
        oVA.ActionBar actionBar = new oVA.ActionBar("M1", 2.0d, 1000.0d, 5.0d);
        oVA.ActionBar actionBar2 = new oVA.ActionBar("M2", 2.0d, 1000.0d, 10.0d);
        oVA.ActionBar actionBar3 = new oVA.ActionBar("M3", 2.0d, 1000.0d, 20.0d);
        oVA.ActionBar actionBar4 = new oVA.ActionBar("M4", 2.0d, 1000.0d, 30.0d);
        oVA.ActionBar actionBar5 = new oVA.ActionBar("M5", 2.0d, 1000.0d, 60.0d);
        oVA.ActionBar actionBar6 = new oVA.ActionBar("M6", 2.0d, 1000.0d, 120.0d);
        OLrzqt(actionBar);
        OLrzqt(actionBar2);
        OLrzqt(actionBar3);
        OLrzqt(actionBar4);
        OLrzqt(actionBar5);
        OLrzqt(actionBar6);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter = new Expression.Parameter("M1", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter2 = new Expression.Parameter("M2", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        Expression.Parameter parameter3 = new Expression.Parameter("M3", true, stateListAnimator.KWHzl().KWHzl(2), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("M4", false, stateListAnimator.KWHzl().KWHzl(3), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter("M5", false, stateListAnimator.KWHzl().KWHzl(4), 255, false);
        Expression.Parameter parameter6 = new Expression.Parameter("M6", false, stateListAnimator.KWHzl().KWHzl(5), 255, false);
        EZpvd(parameter);
        EZpvd(parameter2);
        EZpvd(parameter3);
        EZpvd(parameter4);
        EZpvd(parameter5);
        EZpvd(parameter6);
        OLrzqt(new Expression.Paint("EMA", new Expression.ComponentCallbacks(new Expression.Dialog(), actionBar)));
        OLrzqt(new Expression.Paint("EMA", new Expression.ComponentCallbacks(new Expression.Dialog(), actionBar2)));
        OLrzqt(new Expression.Paint("EMA", new Expression.ComponentCallbacks(new Expression.Dialog(), actionBar3)));
        OLrzqt(new Expression.Paint("EMA", new Expression.ComponentCallbacks(new Expression.Dialog(), actionBar4)));
        OLrzqt(new Expression.Paint("EMA", new Expression.ComponentCallbacks(new Expression.Dialog(), actionBar5)));
        OLrzqt(new Expression.Paint("EMA", new Expression.ComponentCallbacks(new Expression.Dialog(), actionBar6)));
        valueOf();
    }
}
