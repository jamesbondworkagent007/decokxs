package o;

import android.os.Build;
import androidx.core.content.ContextCompat;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tUP {
    public static final tUP KWHzl = new tUP();

    private tUP() {
    }

    /* JADX INFO: renamed from: vibrate-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8767vibrategIAlus$default(tUP tup, android.view.View view, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 3;
        }
        return tup.AEQbTJ(view, j);
    }

    public final java.lang.Object AEQbTJ(@NotNull android.view.View view, long j) {
        Intrinsics.checkNotNullParameter(view, "");
        try {
            Result.Application application = Result.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.os.Vibrator vibrator = (android.os.Vibrator) ContextCompat.getSystemService(context, android.os.Vibrator.class);
            if (vibrator != null) {
                if (vibrator.hasVibrator() && Build.VERSION.SDK_INT >= 26 && vibrator.hasAmplitudeControl()) {
                    view.performHapticFeedback(4);
                } else {
                    vibrator.vibrate(j);
                }
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
