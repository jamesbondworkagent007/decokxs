package o;

import android.app.Activity;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33440mwW {
    public static final C33440mwW copydefault = new C33440mwW();
    public static final java.util.ArrayList<TaskDescription> OLrzqt = new java.util.ArrayList<>();
    public static java.util.HashMap<java.lang.String, java.lang.Object> KWHzl = new java.util.HashMap<>(2);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.mwW$TaskDescription */
    public interface TaskDescription {
        void onScreenShot(@NotNull android.app.Activity activity);
    }

    private C33440mwW() {
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mxe.EZpvd(o.mov):java.util.concurrent.Executor */
    /* JADX DEBUG: Class process forced to load method for inline: o.mxf.df_(o.mov, java.util.concurrent.Executor, android.app.Activity$ScreenCaptureCallback):void */
    public final void EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                Activity.ScreenCaptureCallback screenCaptureCallback = new Activity.ScreenCaptureCallback() { // from class: o.mxj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.app.Activity.ScreenCaptureCallback
                    public final void onScreenCaptured() {
                        C33440mwW.copydefault(abstractActivityC33041mov);
                    }
                };
                abstractActivityC33041mov.registerScreenCaptureCallback(abstractActivityC33041mov.getMainExecutor(), screenCaptureCallback);
                KWHzl.put(EZpvd((android.app.Activity) abstractActivityC33041mov), screenCaptureCallback);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.valueOf("SystemScreenshotDetector", "onActivityStart: " + e.getMessage());
        }
    }

    public static final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov) {
        copydefault.OLrzqt((android.app.Activity) abstractActivityC33041mov);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mxd.de_(o.mov, android.app.Activity$ScreenCaptureCallback):void */
    public final void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                java.lang.Object objRemove = KWHzl.remove(EZpvd((android.app.Activity) abstractActivityC33041mov));
                if (objRemove == null || !C33499mxc.EZpvd(objRemove)) {
                    return;
                }
                abstractActivityC33041mov.unregisterScreenCaptureCallback(C33498mxb.dd_(objRemove));
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.valueOf("SystemScreenshotDetector", "onActivityStop: " + e.getMessage());
        }
    }

    public final java.lang.String EZpvd(android.app.Activity activity) {
        return activity.getClass().getName() + "@" + activity.hashCode();
    }

    public final boolean EZpvd(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return OLrzqt.add(taskDescription);
    }

    public final boolean KWHzl(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return OLrzqt.remove(taskDescription);
    }

    public final void OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.util.Iterator<T> it = OLrzqt.iterator();
        while (it.hasNext()) {
            ((TaskDescription) it.next()).onScreenShot(activity);
        }
    }
}
