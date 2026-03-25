package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVL extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "STOCHRSI";
    }

    public oVL(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 3.0d, 100.0d, 14.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("M", 3.0d, 100.0d, 14.0d);
        Expression.Parameter parameter3 = new Expression.Parameter("P1", 2.0d, 50.0d, 3.0d);
        Expression.Parameter parameter4 = new Expression.Parameter("P2", 2.0d, 50.0d, 3.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        OLrzqt(parameter3);
        OLrzqt(parameter4);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter5 = new Expression.Parameter("STOCHRSI", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter6 = new Expression.Parameter("MASTOCHRSI", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter5);
        EZpvd(parameter6);
        Expression.ActionBar actionBar = new Expression.ActionBar("LC", new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d)));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("CLOSE_LC", new Expression.Callback(new Expression.Dialog(), actionBar));
        EZpvd(actionBar2);
        Expression.ActionBar actionBar3 = new Expression.ActionBar("RSI", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.MediaController(new Expression.PackageManager(actionBar2, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter, new Expression.FragmentManager(1.0d)), new Expression.MediaController(new Expression.TaskDescription(actionBar2), parameter, new Expression.FragmentManager(1.0d))), new Expression.FragmentManager(100.0d)));
        EZpvd(actionBar3);
        Expression.Output output = new Expression.Output("STOCHRSI", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.ColorStateList(new Expression.Callback(actionBar3, new Expression.ServiceConnection(actionBar3, parameter2)), parameter3), new Expression.ColorStateList(new Expression.Callback(new Expression.ContextWrapper(actionBar3, parameter2), new Expression.ServiceConnection(actionBar3, parameter2)), parameter3)), new Expression.FragmentManager(100.0d)));
        OLrzqt(output);
        OLrzqt(new Expression.Paint("MASTOCHRSI", new Expression.ColorStateList(output, parameter4)));
        valueOf();
    }

    @Override // o.AbstractC36262oVg
    public double djBIcL() {
        double d = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < DbNXlk(); i++) {
            double value = EZpvd(i).getValue();
            if (value > d) {
                d = value;
            }
        }
        return d;
    }
}
