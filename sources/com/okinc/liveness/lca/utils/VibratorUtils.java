package com.okinc.liveness.lca.utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.jvm.internal.Intrinsics;
import o.C7514alK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class VibratorUtils {
    public static final int $stable = 0;
    public static final VibratorUtils INSTANCE = new VibratorUtils();

    private VibratorUtils() {
    }

    public static /* synthetic */ void vibrateOnce$default(VibratorUtils vibratorUtils, Context context, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 200;
        }
        vibratorUtils.vibrateOnce(context, j);
    }

    public final void vibrateOnce(@NotNull Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            Intrinsics.copydefault(systemService, "");
            Vibrator defaultVibrator = C7514alK.cI_(systemService).getDefaultVibrator();
            Intrinsics.checkNotNullExpressionValue(defaultVibrator, "");
            defaultVibrator.vibrate(VibrationEffect.createOneShot(j, -1));
            return;
        }
        Object systemService2 = context.getSystemService("vibrator");
        Intrinsics.copydefault(systemService2, "");
        Vibrator vibrator = (Vibrator) systemService2;
        if (i >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
        } else {
            vibrator.vibrate(j);
        }
    }
}
