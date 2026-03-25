package com.geetest.deepknow;

import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class m {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject a(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, c(context) + "");
            jSONObject.put(str2, a(context) + "");
            jSONObject.put(str3, a() + "");
            if (z) {
                jSONObject.put(str4, "false");
            } else {
                jSONObject.put(str4, c() + "");
            }
            jSONObject.put(str5, b(context) + "");
            jSONObject.put(str6, b());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean b(Context context) {
        try {
            boolean z = Settings.Secure.getInt(context.getContentResolver(), "mock_location", 0) != 0;
            if (z) {
                return false;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean c(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private static boolean c() {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/status"));
            do {
                line = bufferedReader.readLine();
            } while (!line.contains("TracerPid"));
            String strTrim = line.substring(line.indexOf(":") + 1, line.length()).trim();
            bufferedReader.close();
            return !"0".equals(strTrim);
        } catch (Exception unused) {
            return false;
        }
    }

    private static String b() throws Throwable {
        String strA = b.a().a("getprop init.svc.adbd");
        if (TextUtils.isEmpty(strA) || strA.length() <= 0 || strA.charAt(strA.length() - 1) != '\n') {
            return TextUtils.isEmpty(strA) ? "$unknown" : strA;
        }
        return strA.substring(0, strA.length() - 1);
    }

    private static boolean a(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static boolean a() {
        try {
            return Debug.isDebuggerConnected();
        } catch (Exception unused) {
            return false;
        }
    }
}
