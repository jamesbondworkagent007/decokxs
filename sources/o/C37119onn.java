package o;

import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37119onn {
    public static final C37119onn copydefault = new C37119onn();

    private C37119onn() {
    }

    public final boolean copydefault(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("keyguard");
        android.app.KeyguardManager keyguardManager = systemService instanceof android.app.KeyguardManager ? (android.app.KeyguardManager) systemService : null;
        boolean zIsKeyguardLocked = keyguardManager != null ? keyguardManager.isKeyguardLocked() : false;
        C44124sEe.imLogVoiceCall$default("FullScreenIntentHelper:isScreenLocked[" + zIsKeyguardLocked + "]", null, 2, null);
        return zIsKeyguardLocked;
    }

    public final boolean AEQbTJ() {
        boolean z = !C32986mnt.EZpvd.valueOf();
        C44124sEe.imLogVoiceCall$default("FullScreenIntentHelper:isAppInBackground[" + z + "]", null, 2, null);
        return z;
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        boolean zCanUseFullScreenIntent;
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT >= 34) {
            java.lang.Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
            android.app.NotificationManager notificationManager = systemService instanceof android.app.NotificationManager ? (android.app.NotificationManager) systemService : null;
            zCanUseFullScreenIntent = notificationManager != null ? notificationManager.canUseFullScreenIntent() : false;
        } else {
            zCanUseFullScreenIntent = true;
        }
        C44124sEe.imLogVoiceCall$default("FullScreenIntentHelper:isFullScreenIntentPermissionGranted[" + zCanUseFullScreenIntent + "]", null, 2, null);
        return zCanUseFullScreenIntent;
    }

    public final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        boolean zCanDrawOverlays = android.provider.Settings.canDrawOverlays(context);
        C44124sEe.imLogVoiceCall$default("FullScreenIntentHelper:isFloatingWindowPermissionGranted[" + zCanDrawOverlays + "]", null, 2, null);
        return zCanDrawOverlays;
    }

    public final boolean KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        boolean zCopydefault = copydefault(context);
        boolean zAEQbTJ = AEQbTJ();
        boolean zOLrzqt = OLrzqt(context);
        boolean z = (zCopydefault || zAEQbTJ) && zOLrzqt && Intrinsics.EZpvd((java.lang.Object) C34703nhO.OLrzqt(), (java.lang.Object) "OKX");
        C44124sEe.imLogVoiceCall$default("FullScreenIntentHelper:shouldShowFullScreenIntent isLocked[" + zCopydefault + "] isBackground[" + zAEQbTJ + "] hasFloatingWindowPermission[" + zOLrzqt + "] result[" + z + "]", null, 2, null);
        return z;
    }
}
