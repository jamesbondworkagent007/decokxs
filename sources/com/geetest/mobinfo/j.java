package com.geetest.mobinfo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.provider.Settings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context) {
        try {
            return "" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "$unknown";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(Context context) {
        try {
            return "" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (Exception e) {
            e.printStackTrace();
            return "$unknown";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        return (activityInfo == null || activityInfo.packageName.equals("android")) ? "$unknown" : resolveInfoResolveActivity.activityInfo.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject d(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            String string = Settings.System.getString(context.getContentResolver(), "screen_off_timeout");
            String string2 = Settings.System.getString(context.getContentResolver(), "sound_effects_enabled");
            String string3 = Settings.System.getString(context.getContentResolver(), "screen_brightness_mode");
            String string4 = Settings.Secure.getString(context.getContentResolver(), "development_settings_enabled");
            String string5 = Settings.System.getString(context.getContentResolver(), "accelerometer_rotation");
            String string6 = Settings.System.getString(context.getContentResolver(), "lock_pattern_visible_pattern");
            String string7 = Settings.System.getString(context.getContentResolver(), "lock_pattern_autolock");
            String string8 = Settings.System.getString(context.getContentResolver(), "usb_mass_storage_enabled");
            jSONObject.put("sot", string);
            jSONObject.put("see", string2);
            jSONObject.put("sbm", string3);
            jSONObject.put("ar", string5);
            jSONObject.put("dse", string4);
            jSONObject.put("lvp", string6);
            jSONObject.put("lpa", string7);
            jSONObject.put("umse", string8);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean a() {
        try {
            try {
                Class.forName("de.robv.android.xposed.XC_MethodHook");
                return true;
            } catch (Exception unused) {
                Class.forName("de.robv.android.xposed.XposedHelpers");
                return false;
            }
        } catch (Exception unused2) {
            return false;
        }
    }
}
