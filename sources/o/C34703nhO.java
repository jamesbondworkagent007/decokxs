package o;

import android.os.Build;

/* JADX INFO: renamed from: o.nhO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C34703nhO {
    public static java.lang.Boolean AEQbTJ = java.lang.Boolean.FALSE;
    public static java.lang.String copydefault = "OKX";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.Boolean EZpvd() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void EZpvd(java.lang.Boolean bool) {
        AEQbTJ = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String OLrzqt() {
        return copydefault;
    }

    public static boolean AEQbTJ() {
        return "OKTR".equals(OLrzqt());
    }

    public static void OLrzqt(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "OKX";
        }
        copydefault = str;
    }

    public static java.lang.String OLrzqt(android.content.Context context) {
        synchronized (C34703nhO.class) {
            java.lang.String strKWHzl = KWHzl(context);
            if (strKWHzl.isEmpty()) {
                return "";
            }
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strKWHzl, 128);
                return applicationInfo == null ? "" : applicationInfo.loadLabel(packageManager).toString();
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
    }

    public static java.lang.String AEQbTJ(android.content.Context context) {
        java.lang.String string;
        synchronized (C34703nhO.class) {
            try {
                string = context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("tag", e);
                return null;
            }
        }
        return string;
    }

    public static java.lang.String valueOf(android.content.Context context) {
        java.lang.String str;
        synchronized (C34703nhO.class) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("tag", e);
                return null;
            }
        }
        return str;
    }

    public static int copydefault(android.content.Context context) {
        int i;
        synchronized (C34703nhO.class) {
            try {
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("tag", e);
                return 0;
            }
        }
        return i;
    }

    public static java.lang.String KWHzl(android.content.Context context) {
        java.lang.String packageName;
        synchronized (C34703nhO.class) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("tag", e);
                return "";
            }
        }
        return packageName;
    }

    public static boolean AhwBna(android.content.Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean AYXKKw(android.content.Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        int[] iArrEZpvd = EZpvd(context);
        return ((float) java.lang.Math.max(iArrEZpvd[0], iArrEZpvd[1])) / ((float) java.lang.Math.min(iArrEZpvd[0], iArrEZpvd[1])) >= 1.7777778f;
    }

    public static int[] EZpvd(android.content.Context context) {
        int[] iArr = new int[2];
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            iArr[0] = bounds.width();
            iArr[1] = bounds.height();
        } else {
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        }
        return iArr;
    }

    public static boolean copydefault() {
        return "WALLET".equals(OLrzqt());
    }
}
