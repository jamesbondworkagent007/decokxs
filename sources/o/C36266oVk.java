package o;

import androidx.camera.video.AudioStats;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36266oVk extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "BOLL";
    }

    /* JADX INFO: renamed from: o.oVk$TaskDescription */
    public static class TaskDescription extends Expression.Parameter {
        public TaskDescription(java.lang.String str, boolean z, oLO olo, int i, boolean z2) {
            super(str, z, olo, i, z2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Parameter
        public void setValue(double d) {
            if (d == AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.mValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            } else {
                this.mValue = java.lang.Math.min(d, this.mMaxValue);
            }
        }

        @Override // com.okinc.kline.library.indicator.Expression.Parameter
        public void setSubValue(boolean z, java.lang.String str, int i) {
            super.setSubValue(z, str, i);
        }
    }

    public C36266oVk(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 500.0d, 20.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("K", 1.0d, 500.0d, 2.0d);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        TaskDescription taskDescription = new TaskDescription("BOLL", true, stateListAnimator.KWHzl().KWHzl(3), 255, false);
        TaskDescription taskDescription2 = new TaskDescription("UB", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        TaskDescription taskDescription3 = new TaskDescription(ExpandedProductParsedResult.POUND, true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        TaskDescription taskDescription4 = new TaskDescription("BG", true, stateListAnimator.KWHzl().KWHzl(0), 20, true);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        EZpvd(taskDescription);
        EZpvd(taskDescription2);
        EZpvd(taskDescription3);
        EZpvd(taskDescription4);
        Expression.ActionBar actionBar = new Expression.ActionBar("STD_CLOSE_N", new Expression.Typeface(new Expression.Dialog(), parameter));
        EZpvd(actionBar);
        Expression.Paint paint = new Expression.Paint("BOLL", new Expression.ColorStateList(new Expression.Dialog(), parameter));
        OLrzqt(paint);
        OLrzqt(new Expression.Output("UB", new Expression.Application(paint, new Expression.AssetManager(parameter2, actionBar))));
        OLrzqt(new Expression.Output(ExpandedProductParsedResult.POUND, new Expression.Callback(paint, new Expression.AssetManager(parameter2, actionBar))));
        valueOf();
    }
}
