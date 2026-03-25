package o;

import android.os.Build;
import android.os.VibratorManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55168xep {
    public static final C55168xep EZpvd = new C55168xep();

    private C55168xep() {
    }

    public static /* synthetic */ void vibrate$default(C55168xep c55168xep, android.content.Context context, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 3;
        }
        c55168xep.KWHzl(context, j);
    }

    public final void KWHzl(@NotNull android.content.Context context, long j) {
        android.os.Vibrator defaultVibrator;
        Intrinsics.checkNotNullParameter(context, "");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            VibratorManager vibratorManagerCI_ = C7514alK.cI_(ContextCompat.getSystemService(context, C14727dqs.copydefault()));
            defaultVibrator = vibratorManagerCI_ != null ? vibratorManagerCI_.getDefaultVibrator() : null;
        } else {
            defaultVibrator = (android.os.Vibrator) ContextCompat.getSystemService(context, android.os.Vibrator.class);
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
