package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;

/* JADX INFO: loaded from: classes8.dex */
public class oVG extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "OI";
    }

    public oVG(java.lang.String str) {
        super(str);
        OLrzqt(new Expression.Parameter("OI", AudioStats.AUDIO_AMPLITUDE_NONE, 1000.0d, 7.0d));
        EZpvd(new Expression.Parameter("OI", true, pDT.Companion.KWHzl().KWHzl(6), 255, false));
        OLrzqt(new Expression.Output("OI{crypto}", new Expression.Resources(), Expression.Output.Style.LINE, 4));
        valueOf();
    }
}
