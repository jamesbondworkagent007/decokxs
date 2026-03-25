package o;

import android.app.Application;
import com.amplitude.android.utilities.ActivityCallbackType;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JP implements Application.ActivityLifecycleCallbacks {
    public final kotlinx.coroutines.channels.Channel<JQ> OLrzqt = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlinx.coroutines.channels.Channel<JQ> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.mo5769trySendJP2dKIU(new JQ(new WeakReference(activity), ActivityCallbackType.Created));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.mo5769trySendJP2dKIU(new JQ(new WeakReference(activity), ActivityCallbackType.Started));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.mo5769trySendJP2dKIU(new JQ(new WeakReference(activity), ActivityCallbackType.Resumed));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.mo5769trySendJP2dKIU(new JQ(new WeakReference(activity), ActivityCallbackType.Paused));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.mo5769trySendJP2dKIU(new JQ(new WeakReference(activity), ActivityCallbackType.Stopped));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.mo5769trySendJP2dKIU(new JQ(new WeakReference(activity), ActivityCallbackType.Destroyed));
    }
}
