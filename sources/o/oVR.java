package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVR extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "VR";
    }

    public oVR(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 100.0d, 26.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("M", 2.0d, 100.0d, 6.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("VR", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("MAVR", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        Expression.ActionBar actionBar = new Expression.ActionBar("REF_CLOSE_1", new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d)));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("TH", new Expression.Uri(new Expression.SharedPreferences(new Expression.ContentResolver(new Expression.Dialog(), actionBar), new Expression.Parcelable(), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter));
        EZpvd(actionBar2);
        Expression.ActionBar actionBar3 = new Expression.ActionBar("TL", new Expression.Uri(new Expression.SharedPreferences(new Expression.PackageItemInfo(new Expression.Dialog(), actionBar), new Expression.Parcelable(), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter));
        EZpvd(actionBar3);
        Expression.ActionBar actionBar4 = new Expression.ActionBar("TQ", new Expression.Uri(new Expression.SharedPreferences(new Expression.ClipData(new Expression.Dialog(), actionBar), new Expression.Parcelable(), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter));
        EZpvd(actionBar4);
        Expression.Output output = new Expression.Output("VR", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Application(new Expression.AssetManager(actionBar2, new Expression.FragmentManager(2.0d)), actionBar4), new Expression.Application(new Expression.AssetManager(actionBar3, new Expression.FragmentManager(2.0d)), actionBar4)), new Expression.FragmentManager(100.0d)));
        OLrzqt(output);
        OLrzqt(new Expression.Output("MAVR", new Expression.ColorStateList(output, parameter2)));
        valueOf();
    }
}
