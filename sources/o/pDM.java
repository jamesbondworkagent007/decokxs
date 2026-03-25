package o;

import androidx.camera.video.AudioStats;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes9.dex */
public class pDM {
    public static java.lang.String KWHzl(java.lang.Double d) {
        if (d.doubleValue() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return "0";
        }
        if (C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ())) {
            return OLrzqt(d);
        }
        return EZpvd(d);
    }

    public static java.lang.String EZpvd(java.lang.Double d) {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).RJOkX() + pTB.AEQbTJ(pTB.OLrzqt(d), RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(2));
    }

    public static java.lang.String OLrzqt(java.lang.Double d) {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).RJOkX() + pTB.AEQbTJ(pTB.OLrzqt(d), RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(2));
    }

    public static java.lang.String EZpvd(double d, int i) {
        return pTB.OLrzqt(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d))), i);
    }
}
