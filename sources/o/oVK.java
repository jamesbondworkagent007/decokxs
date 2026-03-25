package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.C32392mcI;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVK extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "SR";
    }

    public static class StateListAnimator extends Expression.Parameter {
        public StateListAnimator(java.lang.String str, boolean z, oLO olo, int i, boolean z2) {
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

    public oVK(java.lang.String str) {
        super(str);
        pFN pfn = pFN.OLrzqt;
        Expression.Parameter parameter = new Expression.Parameter(pfn.KWHzl(C32392mcI.Dialog.hvKCwS), 2.0d, 500.0d, 10.0d);
        java.lang.String strKWHzl = pfn.KWHzl(C32392mcI.Dialog.sTzBva);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        StateListAnimator stateListAnimator2 = new StateListAnimator(strKWHzl, true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        StateListAnimator stateListAnimator3 = new StateListAnimator(pfn.KWHzl(C32392mcI.Dialog.swzYdv), true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        OLrzqt(parameter);
        EZpvd(stateListAnimator2);
        EZpvd(stateListAnimator3);
        Expression.ColorStateList colorStateList = new Expression.ColorStateList(new Expression.Dialog(), parameter);
        Expression.Output.Style style = Expression.Output.Style.SUPPORT_RESISTANCE;
        OLrzqt(new Expression.Output("Resistance", colorStateList, style, 3));
        OLrzqt(new Expression.Output("Support", new Expression.ColorStateList(new Expression.Dialog(), parameter), style, 1));
        valueOf();
    }
}
