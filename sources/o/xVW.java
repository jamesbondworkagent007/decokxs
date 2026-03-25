package o;

import android.provider.Settings;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class xVW {
    public static java.lang.String AEQbTJ = "";
    public static java.lang.String EZpvd = "";
    public static java.lang.String KWHzl = "";
    public static java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String copydefault() {
        return OLrzqt;
    }

    public static boolean EZpvd(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(OLrzqt) && !OLrzqt.equals("1e4a1b03-d1b6-3d8a-974a-826f76e009f4") && !android.text.TextUtils.isEmpty(KWHzl) && !android.text.TextUtils.isEmpty(AEQbTJ)) {
            EZpvd = KWHzl + ";" + AEQbTJ + ";" + OLrzqt;
            return true;
        }
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("ok_util_device__config", 0);
        java.lang.String string = sharedPreferences.getString("UUID", "");
        OLrzqt = string;
        if (string.equals("1e4a1b03-d1b6-3d8a-974a-826f76e009f4")) {
            OLrzqt = "";
        }
        if (android.text.TextUtils.isEmpty(OLrzqt)) {
            java.lang.String string2 = Settings.System.getString(context.getContentResolver(), "android_id");
            if (!android.text.TextUtils.isEmpty(string2) && !string2.equals("0000000000000000")) {
                if (C33081mpi.EZpvd != null) {
                    string2 = C33081mpi.EZpvd + string2;
                }
                OLrzqt = UUID.nameUUIDFromBytes(string2.getBytes()).toString();
                pUU.KWHzl("DeviceUtil", "update uuid from androidID:" + OLrzqt);
            } else {
                OLrzqt = UUID.randomUUID().toString();
                pUU.KWHzl("DeviceUtil", "update uuid from randomUUID:" + OLrzqt);
            }
            sharedPreferences.edit().putString("UUID", OLrzqt).apply();
        }
        pUU.KWHzl("DeviceUtil", "init uuid:" + OLrzqt);
        if (!android.text.TextUtils.isEmpty(KWHzl) && !android.text.TextUtils.isEmpty(AEQbTJ)) {
            EZpvd = KWHzl + ";" + AEQbTJ + ";" + OLrzqt;
        }
        return true;
    }

    public static java.lang.Boolean OLrzqt(android.content.Context context) {
        try {
            java.lang.String str = android.os.Build.BRAND + ":" + android.os.Build.PRODUCT + ":" + android.os.Build.DEVICE;
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("ok_util_device__config", 0);
            java.lang.String string = sharedPreferences.getString("DEVICE_INFO_NEW", null);
            pUU.KWHzl("DeviceUtil", "deviceInfo:" + str + " deviceInfoFromFile:" + string);
            sharedPreferences.edit().putString("DEVICE_INFO_NEW", str).apply();
            if (string != null && !string.equals(str)) {
                return java.lang.Boolean.FALSE;
            }
        } catch (java.lang.Exception e) {
            pUU.KWHzl("DeviceUtil", "checkDeviceInfo:" + e);
        }
        return java.lang.Boolean.TRUE;
    }

    public static void copydefault(android.content.Context context) {
        context.getSharedPreferences("ok_util_device__config", 0).edit().remove("UUID").apply();
    }
}
