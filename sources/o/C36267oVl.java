package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36267oVl extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "BRAR";
    }

    public C36267oVl(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 120.0d, 26.0d);
        OLrzqt(parameter);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter2 = new Expression.Parameter("BR", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter3 = new Expression.Parameter("AR", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter2);
        EZpvd(parameter3);
        Expression.ActionBar actionBar = new Expression.ActionBar("REF_CLOSE_1", new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d)));
        EZpvd(actionBar);
        OLrzqt(new Expression.Output("BR", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Uri(new Expression.PackageManager(new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE), new Expression.Callback(new Expression.Context(), actionBar)), parameter), new Expression.Uri(new Expression.PackageManager(new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE), new Expression.Callback(actionBar, new Expression.ApplicationInfo())), parameter)), new Expression.FragmentManager(100.0d))));
        OLrzqt(new Expression.Output("AR", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Uri(new Expression.Callback(new Expression.Context(), new Expression.Bitmap()), parameter), new Expression.Uri(new Expression.Callback(new Expression.Bitmap(), new Expression.ApplicationInfo()), parameter)), new Expression.FragmentManager(100.0d))));
        valueOf();
    }
}
