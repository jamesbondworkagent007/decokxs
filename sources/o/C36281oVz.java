package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36281oVz extends AbstractC36262oVg {
    public C36281oVz(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("L/S ratio", AudioStats.AUDIO_AMPLITUDE_NONE, 100.0d, 7.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("Net long", AudioStats.AUDIO_AMPLITUDE_NONE, 1000.0d, 30.0d);
        Expression.Parameter parameter3 = new Expression.Parameter("Net short", 2.0d, 200.0d, 12.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        OLrzqt(parameter3);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter4 = new Expression.Parameter("L/S ratio", true, stateListAnimator.KWHzl().KWHzl(9), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter("Net long", true, stateListAnimator.KWHzl().KWHzl(4), 255, false);
        Expression.Parameter parameter6 = new Expression.Parameter("Net short", true, stateListAnimator.KWHzl().KWHzl(5), 255, false);
        EZpvd(parameter4);
        EZpvd(parameter5);
        EZpvd(parameter6);
        OLrzqt(new Expression.Output("Top Pos. L/S", new Expression.AssistContent(), Expression.Output.Style.LINE, 17));
        OLrzqt(new Expression.Output("Net L/S", new Expression.PictureInPictureParams(), Expression.Output.Style.LSA_STICK, 1));
        valueOf();
    }

    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return this.copydefault.copydefault();
    }
}
