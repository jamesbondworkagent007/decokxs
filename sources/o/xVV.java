package o;

import android.content.SharedPreferences;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class xVV {
    public static android.content.SharedPreferences KWHzl(android.content.Context context) {
        return context.getSharedPreferences("badge_prefs", 0);
    }

    public static void djBIcL(android.content.Context context, int i) {
        if (i <= 0) {
            i = 0;
        }
        SharedPreferences.Editor editorEdit = KWHzl(context).edit();
        editorEdit.putInt("badge_count", i);
        editorEdit.apply();
        pUU.KWHzl("BadgeUtil", "setBadgeCount: " + i);
        java.lang.String str = android.os.Build.MANUFACTURER;
        if (str.equalsIgnoreCase("Xiaomi")) {
            copydefault(context, i);
            return;
        }
        if (str.equalsIgnoreCase("sony")) {
            AEQbTJ(context, i);
            return;
        }
        if (str.toLowerCase().contains("samsung")) {
            EZpvd(context, i);
            return;
        }
        if (!str.toLowerCase().contains(MTPushConstants.Manufacturer.HUAWEI)) {
            java.lang.String str2 = android.os.Build.BRAND;
            if (!str2.toLowerCase().contains(MTPushConstants.Manufacturer.HUAWEI) && !str2.toLowerCase().contains(MTPushConstants.Manufacturer.HONOR)) {
                return;
            }
        }
        OLrzqt(context, i);
    }

    public static int copydefault(android.content.Context context) {
        return KWHzl(context).getInt("badge_count", 0);
    }

    public static void EZpvd(android.content.Context context) {
        djBIcL(context, copydefault(context) + 1);
    }

    public static void OLrzqt(android.content.Context context, int i) {
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("package", context.getPackageName());
            android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            Objects.requireNonNull(launchIntentForPackage);
            android.content.ComponentName component = launchIntentForPackage.getComponent();
            Objects.requireNonNull(component);
            bundle.putString("class", component.getClassName());
            bundle.putInt("badgenumber", i);
            context.getContentResolver().call(android.net.Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (java.lang.String) null, bundle);
        } catch (java.lang.Exception e) {
            KWHzl(context, i);
            e.printStackTrace();
        }
    }

    public static void KWHzl(android.content.Context context, int i) {
        try {
            java.lang.String strOLrzqt = OLrzqt(context);
            if (strOLrzqt == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent("com.huawei.android.launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("className", strOLrzqt);
            intent.putExtra("badgeCount", i);
            context.sendBroadcast(intent);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void copydefault(android.content.Context context, int i) {
        try {
            java.lang.Object objNewInstance = java.lang.Class.forName("android.app.MiuiNotification").newInstance();
            java.lang.reflect.Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            declaredField.set(objNewInstance, java.lang.String.valueOf(i == 0 ? "" : java.lang.Integer.valueOf(i)));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            android.content.Intent intent = new android.content.Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", context.getPackageName() + "/" + OLrzqt(context));
            intent.putExtra("android.intent.extra.update_application_message_text", java.lang.String.valueOf(i != 0 ? java.lang.Integer.valueOf(i) : ""));
            context.sendBroadcast(intent);
        }
    }

    public static void AEQbTJ(android.content.Context context, int i) {
        java.lang.String strOLrzqt = OLrzqt(context);
        if (strOLrzqt == null) {
            return;
        }
        boolean z = i != 0;
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", strOLrzqt);
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", java.lang.String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", context.getPackageName());
        context.sendBroadcast(intent);
    }

    public static void EZpvd(android.content.Context context, int i) {
        java.lang.String strOLrzqt = OLrzqt(context);
        if (strOLrzqt == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", context.getPackageName());
        intent.putExtra("badge_count_class_name", strOLrzqt);
        context.sendBroadcast(intent);
    }

    public static java.lang.String OLrzqt(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        intent.addCategory("android.intent.category.LAUNCHER");
        android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        }
        return resolveInfoResolveActivity.activityInfo.name;
    }
}
