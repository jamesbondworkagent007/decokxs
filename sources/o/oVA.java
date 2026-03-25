package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVA extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "MA";
    }

    public static class ActionBar extends Expression.Parameter {
        public ActionBar(java.lang.String str, double d, double d2, double d3) {
            super(str, d, d2, d3);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Parameter
        public void setValue(double d) {
            if (d == AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.mValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            } else {
                this.mValue = java.lang.Math.min(d, this.mMaxValue);
            }
        }
    }

    public oVA(java.lang.String str) {
        super(str);
        ActionBar actionBar = new ActionBar("M1", 2.0d, 1000.0d, 5.0d);
        ActionBar actionBar2 = new ActionBar("M2", 2.0d, 1000.0d, 10.0d);
        ActionBar actionBar3 = new ActionBar("M3", 2.0d, 1000.0d, 20.0d);
        ActionBar actionBar4 = new ActionBar("M4", 2.0d, 1000.0d, 30.0d);
        ActionBar actionBar5 = new ActionBar("M5", 2.0d, 1000.0d, 60.0d);
        ActionBar actionBar6 = new ActionBar("M6", 2.0d, 1000.0d, 120.0d);
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
        OLrzqt(new Expression.Paint("MA", new Expression.ColorStateList(new Expression.Dialog(), actionBar)));
        OLrzqt(new Expression.Paint("MA", new Expression.ColorStateList(new Expression.Dialog(), actionBar2)));
        OLrzqt(new Expression.Paint("MA", new Expression.ColorStateList(new Expression.Dialog(), actionBar3)));
        OLrzqt(new Expression.Paint("MA", new Expression.ColorStateList(new Expression.Dialog(), actionBar4)));
        OLrzqt(new Expression.Paint("MA", new Expression.ColorStateList(new Expression.Dialog(), actionBar5)));
        OLrzqt(new Expression.Paint("MA", new Expression.ColorStateList(new Expression.Dialog(), actionBar6)));
        valueOf();
    }
}
