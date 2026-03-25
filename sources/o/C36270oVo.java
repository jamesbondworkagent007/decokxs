package o;

import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36270oVo extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "Compare";
    }

    public C36270oVo(java.lang.String str, java.util.List<java.lang.String> list) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("Compare1", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter2 = new Expression.Parameter("Compare2", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter3 = new Expression.Parameter("Compare3", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter4 = new Expression.Parameter("Compare4", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter5 = new Expression.Parameter("Compare5", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter6 = new Expression.Parameter("Compare6", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter7 = new Expression.Parameter("Compare7", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter8 = new Expression.Parameter("Compare8", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter9 = new Expression.Parameter("Compare9", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        Expression.Parameter parameter10 = new Expression.Parameter("Compare10", AudioStats.AUDIO_AMPLITUDE_NONE, 2.147483647E9d, AudioStats.AUDIO_AMPLITUDE_NONE);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        OLrzqt(parameter3);
        OLrzqt(parameter4);
        OLrzqt(parameter5);
        OLrzqt(parameter6);
        OLrzqt(parameter7);
        OLrzqt(parameter8);
        OLrzqt(parameter9);
        OLrzqt(parameter10);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter11 = new Expression.Parameter("base1", false, stateListAnimator.KWHzl().gEmmrt(), 255, false);
        Expression.Parameter parameter12 = new Expression.Parameter("base2", false, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter13 = new Expression.Parameter("base3", false, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        Expression.Parameter parameter14 = new Expression.Parameter("base4", false, stateListAnimator.KWHzl().KWHzl(2), 255, false);
        Expression.Parameter parameter15 = new Expression.Parameter("base5", false, stateListAnimator.KWHzl().KWHzl(3), 255, false);
        Expression.Parameter parameter16 = new Expression.Parameter("base6", false, stateListAnimator.KWHzl().KWHzl(4), 255, false);
        Expression.Parameter parameter17 = new Expression.Parameter("base7", false, stateListAnimator.KWHzl().KWHzl(5), 255, false);
        Expression.Parameter parameter18 = new Expression.Parameter("base8", false, stateListAnimator.KWHzl().KWHzl(6), 255, false);
        Expression.Parameter parameter19 = new Expression.Parameter("base9", false, stateListAnimator.KWHzl().KWHzl(7), 255, false);
        Expression.Parameter parameter20 = new Expression.Parameter("base10", false, stateListAnimator.KWHzl().KWHzl(8), 255, false);
        EZpvd(parameter11);
        EZpvd(parameter12);
        EZpvd(parameter13);
        EZpvd(parameter14);
        EZpvd(parameter15);
        EZpvd(parameter16);
        EZpvd(parameter17);
        EZpvd(parameter18);
        EZpvd(parameter19);
        EZpvd(parameter20);
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                OLrzqt(new Expression.Output("Compare" + (i + 1), new Expression.LoaderManager(list.get(0)), Expression.Output.Style.NONE, ViewCompat.MEASURED_STATE_MASK));
            } else {
                OLrzqt(new Expression.Output("Compare" + (i + 1), new Expression.LoaderManager(list.get(i))));
            }
        }
        valueOf();
    }
}
