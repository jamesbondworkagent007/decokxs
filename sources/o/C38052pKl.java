package o;

import android.os.Build;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.lib.utils.OkUtils;

/* JADX INFO: renamed from: o.pKl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38052pKl {
    public static final java.lang.String KWHzl = "AppUtils";

    private C38052pKl() {
    }

    public static <T> T copydefault(java.lang.String str) {
        return (T) OLrzqt(OkUtils.AEQbTJ(), str);
    }

    public static <T> T OLrzqt(android.content.Context context, java.lang.String str) {
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (context instanceof android.app.Application) {
                return (T) context.getSystemService(str);
            }
            android.content.Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return null;
            }
            return (T) applicationContext.getSystemService(str);
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(KWHzl, "getSystemService", e);
            return null;
        }
    }

    public static android.app.ActivityManager EZpvd() {
        return (android.app.ActivityManager) copydefault(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
    }

    public static android.content.pm.PackageManager AEQbTJ() {
        return EZpvd(OkUtils.AEQbTJ());
    }

    public static android.content.pm.PackageManager EZpvd(android.content.Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager();
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(KWHzl, "getPackageManager", e);
            return null;
        }
    }

    public static android.content.pm.PackageInfo copydefault(java.lang.String str, int i) {
        try {
            return OkUtils.AEQbTJ().getPackageManager().getPackageInfo(str, i);
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(KWHzl, "getPackageInfo " + str, e);
            return null;
        }
    }

    public static java.lang.String OLrzqt() {
        try {
            return OkUtils.AEQbTJ().getPackageName();
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(KWHzl, "getPackageName", e);
            return null;
        }
    }

    public static java.lang.String copydefault() {
        return KWHzl(OLrzqt());
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            android.content.pm.PackageInfo packageInfoCopydefault = copydefault(str, 64);
            if (packageInfoCopydefault == null) {
                return null;
            }
            return packageInfoCopydefault.versionName;
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(KWHzl, "getAppVersionName", e);
            return null;
        }
    }

    public static long KWHzl() {
        return EZpvd(OLrzqt());
    }

    public static long EZpvd(java.lang.String str) {
        android.content.pm.PackageInfo packageInfoCopydefault;
        if (android.text.TextUtils.isEmpty(str) || (packageInfoCopydefault = copydefault(str, 64)) == null) {
            return -1L;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfoCopydefault.getLongVersionCode();
        }
        return packageInfoCopydefault.versionCode;
    }
}
