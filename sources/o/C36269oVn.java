package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36269oVn extends AbstractC36262oVg {
    public C36269oVn(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("Buy volume", AudioStats.AUDIO_AMPLITUDE_NONE, 1000.0d, 30.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("Sell volume", AudioStats.AUDIO_AMPLITUDE_NONE, 1000.0d, 30.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("Vtolume", true, stateListAnimator.KWHzl().KWHzl(9), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("Buy volume", true, stateListAnimator.KWHzl().KWHzl(4), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter("Sell volume", true, stateListAnimator.KWHzl().KWHzl(5), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        EZpvd(parameter5);
        OLrzqt(new Expression.Output("Taker B/S ({crypto})", new Expression.Bundle(), Expression.Output.Style.TAKER_STICK, 2));
        Expression.IBinder iBinder = new Expression.IBinder();
        Expression.Output.Style style = Expression.Output.Style.NONE;
        OLrzqt(new Expression.Output("Buy ({crypto})", iBinder, style, 0));
        OLrzqt(new Expression.Output("Sell ({crypto})", new Expression.BaseBundle(), style, 0));
        valueOf();
    }

    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return this.copydefault.copydefault();
    }
}
