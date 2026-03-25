package o;

import android.app.Application;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import o.C32935mmv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32936mmw implements Application.ActivityLifecycleCallbacks {
    public boolean EZpvd;
    public final C32935mmv.Application OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

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
        this.copydefault--;
        this.EZpvd = true;
    }

    public C32936mmw(@NotNull C32935mmv.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.OLrzqt = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.copydefault == 0) {
            java.lang.String str = android.text.TextUtils.equals(activity.getClass().getName(), "com.okinc.okex.deeplink.SchemeActivity") ? "Push" : "Widget";
            C32932mms.AEQbTJ.copydefault(str);
            this.OLrzqt.EZpvd("launch_source", str, "");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.copydefault == 0 && this.EZpvd) {
            C32932mms c32932mms = C32932mms.AEQbTJ;
            c32932mms.AEQbTJ();
            this.OLrzqt.EZpvd(OtcExtraKeys.PARAMS_SESSION_ID, c32932mms.EZpvd(), null);
        }
        this.copydefault++;
    }
}
