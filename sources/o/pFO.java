package o;

import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pFO {
    public static final pFO OLrzqt = new pFO();

    private pFO() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(@NotNull android.content.Context context) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            if (OLrzqt(context)) {
                java.lang.String str2 = android.os.Build.BRAND;
                if (!C59449zhJ.gEmmrt(str2, "HUAWEI", true)) {
                    if (C59449zhJ.gEmmrt(str2, "XIAOMI", true) || C59449zhJ.gEmmrt(str2, "REDMI", true)) {
                        str = "force_fsg_nav_bar";
                    } else if (C59449zhJ.gEmmrt(str2, "VIVO", true) || C59449zhJ.gEmmrt(str2, "OPPO", true)) {
                        str = "navigation_gesture_on";
                    }
                    if (Settings.Global.getInt(context.getContentResolver(), str, 0) != 0) {
                        return true;
                    }
                }
                str = "navigationbar_is_min";
                if (Settings.Global.getInt(context.getContentResolver(), str, 0) != 0) {
                }
            }
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
        return false;
    }

    public final boolean OLrzqt(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.Object objInvoke = cls.getMethod("get", java.lang.String.class).invoke(cls, "qemu.hw.mainkeys");
            Intrinsics.copydefault(objInvoke, "");
            java.lang.String str = (java.lang.String) objInvoke;
            if (Intrinsics.EZpvd((java.lang.Object) "1", (java.lang.Object) str)) {
                return false;
            }
            if (Intrinsics.EZpvd((java.lang.Object) "0", (java.lang.Object) str)) {
                return true;
            }
        } catch (java.lang.Exception unused) {
        }
        return z;
    }
}
