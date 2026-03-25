package o;

import android.os.Build;
import androidx.core.content.ContextCompat;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPO {
    public static final wPO EZpvd = new wPO();

    private wPO() {
    }

    /* JADX INFO: renamed from: vibrate-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8782vibrategIAlus$default(wPO wpo, android.view.View view, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 3;
        }
        return wpo.copydefault(view, j);
    }

    public final java.lang.Object copydefault(@NotNull android.view.View view, long j) {
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
