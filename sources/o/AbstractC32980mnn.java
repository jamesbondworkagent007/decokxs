package o;

import android.app.Application;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32980mnn implements Application.ActivityLifecycleCallbacks {
    public final FragmentManager.FragmentLifecycleCallbacks EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    public AbstractC32980mnn(@NotNull FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(fragmentLifecycleCallbacks, "");
        this.EZpvd = fragmentLifecycleCallbacks;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            EZpvd((AbstractActivityC33041mov) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            OLrzqt((AbstractActivityC33041mov) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            KWHzl((AbstractActivityC33041mov) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            copydefault((AbstractActivityC33041mov) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (activity instanceof AbstractActivityC33041mov) {
            EZpvd((AbstractActivityC33041mov) activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            AEQbTJ((AbstractActivityC33041mov) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) activity;
            abstractActivityC33041mov.getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.EZpvd, true);
            copydefault(abstractActivityC33041mov, bundle);
        }
    }
}
