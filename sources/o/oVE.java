package o;

import androidx.camera.video.AudioStats;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVE extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "RSI";
    }

    public oVE(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N1", 2.0d, 1000.0d, 6.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("N2", 2.0d, 1000.0d, 12.0d);
        Expression.Parameter parameter3 = new Expression.Parameter("N3", 2.0d, 1000.0d, 24.0d);
        Expression.Parameter parameter4 = new Expression.Parameter("UB", AudioStats.AUDIO_AMPLITUDE_NONE, 100.0d, 70.0d);
        Expression.Parameter parameter5 = new Expression.Parameter(ExpandedProductParsedResult.POUND, AudioStats.AUDIO_AMPLITUDE_NONE, 100.0d, 30.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        OLrzqt(parameter3);
        OLrzqt(parameter4);
        OLrzqt(parameter5);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter6 = new Expression.Parameter("N1", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter7 = new Expression.Parameter("N2", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        Expression.Parameter parameter8 = new Expression.Parameter("N3", true, stateListAnimator.KWHzl().KWHzl(2), 255, false);
        Expression.Parameter parameter9 = new Expression.Parameter("UB", true, stateListAnimator.KWHzl().KWHzl(8), 255, false);
        Expression.Parameter parameter10 = new Expression.Parameter(ExpandedProductParsedResult.POUND, true, stateListAnimator.KWHzl().KWHzl(8), 255, false);
        Expression.Parameter parameter11 = new Expression.Parameter("BG", true, stateListAnimator.KWHzl().KWHzl(8), 20, true);
        EZpvd(parameter6);
        EZpvd(parameter7);
        EZpvd(parameter8);
        EZpvd(parameter9);
        EZpvd(parameter10);
        EZpvd(parameter11);
        Expression.ActionBar actionBar = new Expression.ActionBar("LC", new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d)));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("CLOSE_LC", new Expression.Callback(new Expression.Dialog(), actionBar));
        EZpvd(actionBar2);
        OLrzqt(new Expression.Paint("RSI", new Expression.DialogInterface(copydefault(actionBar2, parameter), parameter)));
        OLrzqt(new Expression.Paint("RSI", new Expression.DialogInterface(copydefault(actionBar2, parameter2), parameter2)));
        OLrzqt(new Expression.Paint("RSI", new Expression.DialogInterface(copydefault(actionBar2, parameter3), parameter3)));
        OLrzqt(new Expression.Output("UB", parameter4));
        OLrzqt(new Expression.Output(ExpandedProductParsedResult.POUND, parameter5));
        valueOf();
    }

    public final Expression.AssetManager copydefault(Expression.ActionBar actionBar, Expression.Parameter parameter) {
        return new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.MediaController(new Expression.PackageManager(actionBar, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter, new Expression.FragmentManager(1.0d)), new Expression.MediaController(new Expression.TaskDescription(actionBar), parameter, new Expression.FragmentManager(1.0d))), new Expression.FragmentManager(100.0d));
    }
}
