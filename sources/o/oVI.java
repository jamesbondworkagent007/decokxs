package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;

/* JADX INFO: loaded from: classes8.dex */
public class oVI extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "SAR";
    }

    public oVI(java.lang.String str) {
        super(str);
        Expression.FragmentManager fragmentManager = new Expression.FragmentManager(4.0d);
        Expression.FragmentManager fragmentManager2 = new Expression.FragmentManager(2.0d);
        Expression.FragmentManager fragmentManager3 = new Expression.FragmentManager(2.0d);
        Expression.FragmentManager fragmentManager4 = new Expression.FragmentManager(20.0d);
        OLrzqt(new Expression.Parameter("SAR", AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE));
        EZpvd(new Expression.Parameter("SAR", true, pDT.Companion.KWHzl().KWHzl(2), 255, false));
        OLrzqt(new Expression.Output("SAR", new Expression.Drawable(fragmentManager, fragmentManager2, fragmentManager3, fragmentManager4), Expression.Output.Style.SAR_POINT, 0));
        valueOf();
    }
}
