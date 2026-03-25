package o;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.VibratorManager;
import androidx.core.content.ContextCompat;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.dqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14724dqp {
    public static final C14724dqp EZpvd = new C14724dqp();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.dqu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14724dqp.AEQbTJ();
        }
    });
    public static final int copydefault = 8;

    private C14724dqp() {
    }

    public final xWJ EZpvd() {
        return (xWJ) OLrzqt.getValue();
    }

    public static final xWJ AEQbTJ() {
        return (xWJ) C43251rlk.copydefault(xWJ.class);
    }

    public final void AEQbTJ(long j) {
        android.os.Vibrator defaultVibrator;
        java.lang.Object objM7377constructorimpl;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            VibratorManager vibratorManagerCI_ = C7514alK.cI_(ContextCompat.getSystemService(C9678baC.Companion.AEQbTJ(), C14727dqs.copydefault()));
            defaultVibrator = vibratorManagerCI_ != null ? vibratorManagerCI_.getDefaultVibrator() : null;
        } else {
            defaultVibrator = (android.os.Vibrator) ContextCompat.getSystemService(C9678baC.Companion.AEQbTJ(), android.os.Vibrator.class);
        }
        if (defaultVibrator != null && defaultVibrator.hasVibrator()) {
            if (i >= 26) {
                android.os.VibrationEffect vibrationEffectCreateOneShot = android.os.VibrationEffect.createOneShot(j, -1);
                try {
                    Result.Application application = Result.Companion;
                    defaultVibrator.vibrate(vibrationEffectCreateOneShot);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Result.m7376boximpl(objM7377constructorimpl);
                return;
            }
            defaultVibrator.vibrate(j, new AudioAttributes.Builder().build());
        }
    }

    public final void KWHzl(long j) {
        if (EZpvd().AYXKKw()) {
            AEQbTJ(j);
        }
    }
}
