package o;

import com.okinc.kline.library.indicator.Expression;

/* JADX INFO: loaded from: classes8.dex */
public class oVQ extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "VWAP";
    }

    public oVQ(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("Length", 1.0d, 1000.0d, 14.0d);
        OLrzqt(parameter);
        EZpvd(new Expression.Parameter("Color", true, pDT.Companion.KWHzl().KWHzl(2), 255, false));
        OLrzqt(new Expression.Paint("VWAP", new Expression.Environment(new Expression.Dialog(), parameter)));
        valueOf();
    }
}
