package o;

import android.os.Build;
import android.os.VibratorManager;
import androidx.core.content.ContextCompat;

/* JADX INFO: renamed from: o.xks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55489xks {
    public static /* synthetic */ void startVibratorIfCan$default(long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 25;
        }
        KWHzl(j);
    }

    public static final void KWHzl(long j) {
        InterfaceC46554tYq interfaceC46554tYq = (InterfaceC46554tYq) C43251rlk.OLrzqt(InterfaceC46554tYq.class);
        if (interfaceC46554tYq == null || !interfaceC46554tYq.copydefault()) {
            return;
        }
        AEQbTJ(j);
    }

    public static /* synthetic */ void startVibrator$default(long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 25;
        }
        AEQbTJ(j);
    }

    public static final void AEQbTJ(long j) {
        android.os.Vibrator defaultVibrator;
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            VibratorManager vibratorManagerCI_ = C7514alK.cI_(ContextCompat.getSystemService(applicationOLrzqt, C14727dqs.copydefault()));
            defaultVibrator = vibratorManagerCI_ != null ? vibratorManagerCI_.getDefaultVibrator() : null;
        } else {
            defaultVibrator = (android.os.Vibrator) ContextCompat.getSystemService(applicationOLrzqt, android.os.Vibrator.class);
        }
        if (defaultVibrator == null) {
            return;
        }
        if (i >= 26) {
            defaultVibrator.vibrate(android.os.VibrationEffect.createOneShot(j, -1));
        } else {
            defaultVibrator.vibrate(j);
        }
    }
}
