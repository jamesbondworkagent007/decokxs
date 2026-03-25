package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVO extends AbstractC36262oVg {
    public boolean fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "VOLUME";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getNewProxyInstance() {
        return this.fetchVPNInfo;
    }

    public oVO(java.lang.String str, boolean z) {
        super(str);
        this.fetchVPNInfo = z;
        Expression.Parameter parameter = new Expression.Parameter("M1", 2.0d, 500.0d, 5.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("M2", 2.0d, 500.0d, 10.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("VOL", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("M2", false, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter("M3", false, stateListAnimator.KWHzl().KWHzl(2), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        EZpvd(parameter5);
        Expression.Output output = new Expression.Output("VOL", new Expression.Parcelable(), Expression.Output.Style.VOLUME_STICK, 0);
        OLrzqt(output);
        Expression.ColorStateList colorStateList = new Expression.ColorStateList(output, parameter);
        Expression.Output.Style style = Expression.Output.Style.LINE;
        OLrzqt(new Expression.Paint("MA", colorStateList, style, 1));
        OLrzqt(new Expression.Paint("MA", new Expression.ColorStateList(output, parameter2), style, 2));
        valueOf();
    }
}
