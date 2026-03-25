package o;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes12.dex */
public class xVY {
    public static java.lang.String AEQbTJ;
    public static java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String OLrzqt() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String copydefault() {
        return KWHzl;
    }

    public static void AEQbTJ(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("ok_channel_config", 0);
        KWHzl = sharedPreferences.getString("base_channel", "");
        AEQbTJ = sharedPreferences.getString("current_channel", "");
        if (android.text.TextUtils.isEmpty(KWHzl)) {
            KWHzl = str;
            sharedPreferences.edit().putString("base_channel", str).apply();
        }
        if (AEQbTJ.equals(str)) {
            return;
        }
        AEQbTJ = str;
        sharedPreferences.edit().putString("current_channel", str).apply();
    }

    public static void EZpvd(android.content.Context context) {
        AEQbTJ(context, OLrzqt(context, "APP_CHANNEL"));
    }

    public static java.lang.String KWHzl(android.content.Context context) {
        return OLrzqt(context, "APP_CHANNEL");
    }

    public static java.lang.String OLrzqt(android.content.Context context, java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        java.lang.Object obj;
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get(str)) != null) {
                return obj.toString();
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
