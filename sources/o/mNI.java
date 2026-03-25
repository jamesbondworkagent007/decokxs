package o;

import android.os.Build;
import android.view.WindowManager;
import com.engagelab.privates.core.constants.MTCoreConstants;

/* JADX INFO: loaded from: classes8.dex */
public class mNI {
    public static boolean EZpvd(android.content.Context context) {
        return android.provider.Settings.canDrawOverlays(context);
    }

    public static boolean AEQbTJ(android.content.Context context) {
        if (Build.VERSION.SDK_INT == 26) {
            return KWHzl(context);
        }
        return android.provider.Settings.canDrawOverlays(context);
    }

    public static boolean KWHzl(android.content.Context context) {
        try {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return false;
            }
            android.view.View view = new android.view.View(context);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, Build.VERSION.SDK_INT >= 26 ? 2038 : MTCoreConstants.MainWhat.ON_HEARTBEAT, 24, -2);
            view.setLayoutParams(layoutParams);
            windowManager.addView(view, layoutParams);
            windowManager.removeView(view);
            return true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PermissionUtil", e);
            return false;
        }
    }
}
