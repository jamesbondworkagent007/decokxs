package o;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42546rWw implements Application.ActivityLifecycleCallbacks {
    public static int OLrzqt;
    public static final C42546rWw KWHzl = new C42546rWw();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    private C42546rWw() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        C42543rWt c42543rWt = C42543rWt.KWHzl;
        if (c42543rWt.AEQbTJ() == 0 && OLrzqt == 0) {
            pUU.EZpvd("OKQPLReporter", "first activity created = " + activity.getClass().getSimpleName());
            OLrzqt = OLrzqt + 1;
            c42543rWt.EZpvd(java.lang.System.currentTimeMillis());
        }
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(activity);
        if (abstractC42536rWmOLrzqt != null) {
            ((AppCompatActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new C42547rWx(), true);
            abstractC42536rWmOLrzqt.AEQbTJ(copydefault(activity), java.lang.System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(activity);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.PAUSE, copydefault(activity), java.lang.System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(activity);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.DESTROYED, copydefault(activity), java.lang.System.currentTimeMillis());
            abstractC42536rWmOLrzqt.EZpvd(copydefault(activity), java.lang.System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(activity);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.CREATE, copydefault(activity), java.lang.System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(activity);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.START, copydefault(activity), java.lang.System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(activity);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.RESUME, copydefault(activity), java.lang.System.currentTimeMillis());
        }
    }

    public final AbstractC42536rWm OLrzqt(android.app.Activity activity) {
        Function1<android.app.Activity, AbstractC42536rWm> function1AhwBna = C42543rWt.KWHzl.AhwBna();
        if (function1AhwBna != null) {
            return function1AhwBna.invoke(activity);
        }
        return null;
    }

    public final java.lang.String copydefault(android.app.Activity activity) {
        Function1<android.app.Activity, java.lang.String> function1AYXKKw = C42543rWt.KWHzl.AYXKKw();
        return function1AYXKKw != null ? function1AYXKKw.invoke(activity) : "";
    }
}
