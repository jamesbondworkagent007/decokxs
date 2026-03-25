package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVH extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "OBV";
    }

    public oVH(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("M", 2.0d, 100.0d, 30.0d);
        OLrzqt(parameter);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter2 = new Expression.Parameter("OBV", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter3 = new Expression.Parameter("MAOBV", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter2);
        EZpvd(parameter3);
        Expression.ActionBar actionBar = new Expression.ActionBar("REF_CLOSE_1", new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d)));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("VA", new Expression.SharedPreferences(new Expression.ContentResolver(new Expression.Dialog(), actionBar), new Expression.Parcelable(), new Expression.Cursor(new Expression.Parcelable())));
        EZpvd(actionBar2);
        Expression.Output output = new Expression.Output("OBV", new Expression.Uri(new Expression.SharedPreferences(new Expression.ClipData(new Expression.Dialog(), actionBar), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE), actionBar2), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)));
        OLrzqt(output);
        OLrzqt(new Expression.Output("MAOBV", new Expression.ColorStateList(output, parameter)));
        valueOf();
    }
}
