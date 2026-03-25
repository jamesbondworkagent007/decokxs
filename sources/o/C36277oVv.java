package o;

import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.okinc.kline.library.indicator.Expression;
import o.C32392mcI;
import o.pDT;

/* JADX INFO: renamed from: o.oVv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36277oVv extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "ENVELOPE";
    }

    public C36277oVv(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("Bandwidth", 2.0d, 15.0d, 8.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("Multiplier", 1.0d, 10.0d, 3.0d);
        Expression.Parameter parameter3 = new Expression.Parameter("Length", 50.0d, 1000.0d, 100.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        OLrzqt(parameter3);
        pFN pfn = pFN.OLrzqt;
        java.lang.String strKWHzl = pfn.KWHzl(C32392mcI.Dialog.TarCU);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter4 = new Expression.Parameter(strKWHzl, true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter(pfn.KWHzl(C32392mcI.Dialog.Ufzxmz), true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        Expression.Parameter parameter6 = new Expression.Parameter("BG", true, stateListAnimator.KWHzl().KWHzl(2), 20, true);
        EZpvd(parameter4);
        EZpvd(parameter5);
        EZpvd(parameter6);
        Expression.ActionBar actionBar = new Expression.ActionBar("NWE_CENTER", new Expression.Theme(new Expression.Dialog(), parameter, parameter2, parameter3));
        EZpvd(actionBar);
        OLrzqt(new Expression.Output("UB", new Expression.DatabaseErrorHandler(actionBar)));
        OLrzqt(new Expression.Output(ExpandedProductParsedResult.POUND, new Expression.TypedArray(actionBar)));
        valueOf();
    }

    @Override // o.AbstractC36262oVg
    public double djBIcL() {
        return EZpvd(2).getValue();
    }
}
