package o;

import android.os.Build;
import android.os.VibratorManager;

/* JADX INFO: renamed from: o.jxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27579jxp {
    public static final C27579jxp copydefault = new C27579jxp();

    private C27579jxp() {
    }

    public final void AEQbTJ() {
        android.os.Vibrator defaultVibrator = null;
        if (Build.VERSION.SDK_INT >= 31) {
            java.lang.Object objEZpvd = C6832aWn.EZpvd("vibrator_manager");
            VibratorManager vibratorManagerCI_ = C25354ivD.OLrzqt(objEZpvd) ? C7514alK.cI_(objEZpvd) : null;
            if (vibratorManagerCI_ != null) {
                defaultVibrator = vibratorManagerCI_.getDefaultVibrator();
            }
        } else {
            java.lang.Object objEZpvd2 = C6832aWn.EZpvd("vibrator");
            if (objEZpvd2 instanceof android.os.Vibrator) {
                defaultVibrator = (android.os.Vibrator) objEZpvd2;
            }
        }
        if (defaultVibrator != null) {
            defaultVibrator.vibrate(3L);
        }
    }
}
