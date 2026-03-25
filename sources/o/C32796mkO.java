package o;

import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32796mkO {
    public static final C32796mkO EZpvd = new C32796mkO();
    public static final java.lang.String copydefault = "com.android.permission.GET_INSTALLED_APPS";

    private C32796mkO() {
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.checkSelfPermission(context, copydefault) == 0;
    }

    public final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.pm.PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo(copydefault, 0);
            if (permissionInfo != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (permissionInfo.getProtection() == 1) {
                        return true;
                    }
                } else if ((permissionInfo.protectionLevel & 15) == 1) {
                    return true;
                }
                return false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "oem_installed_apps_runtime_permission_enable") == 1;
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
