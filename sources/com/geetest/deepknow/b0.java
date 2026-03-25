package com.geetest.deepknow;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class b0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject a(Context context, String str, String str2, String str3) {
        y yVar = new y();
        JSONObject jSONObject = new JSONObject();
        try {
            a(yVar);
            b(yVar);
            StringBuilder sb = new StringBuilder();
            sb.append(yVar.e() || yVar.f());
            sb.append("");
            jSONObject.put(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(yVar.d() || yVar.b() || yVar.c());
            sb2.append("");
            jSONObject.put(str2, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a(context) || yVar.a());
            sb3.append("");
            jSONObject.put(str3, sb3.toString());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void b(y yVar) {
        HashSet<String> hashSet = new HashSet();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.toLowerCase().contains("frida")) {
                    yVar.a(true);
                }
                if (line.endsWith(".so") || line.endsWith(".jar")) {
                    hashSet.add(line.substring(line.lastIndexOf(" ") + 1));
                }
            }
            for (String str : hashSet) {
                if (str.contains("com.saurik.substrate")) {
                    yVar.c(true);
                }
                if (str.contains("XposedBridge.jar")) {
                    yVar.e(true);
                }
            }
            bufferedReader.close();
        } catch (Exception unused) {
        }
    }

    private static boolean a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager != null ? activityManager.getRunningServices(300) : null;
        if (runningServices == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < runningServices.size(); i++) {
            if (runningServices.get(i).process.contains("fridaserver")) {
                z = true;
            }
        }
        return z;
    }

    private static void a(y yVar) {
        try {
            throw new Exception("Deteck hook");
        } catch (Exception e) {
            int i = 0;
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if ("com.android.internal.os.ZygoteInit".equals(stackTraceElement.getClassName()) && (i = i + 1) == 2) {
                    yVar.b(true);
                }
                if ("com.saurik.substrate.MS$2".equals(stackTraceElement.getClassName()) && "invoke".equals(stackTraceElement.getMethodName())) {
                    yVar.b(true);
                }
                if ("de.robv.android.xposed.XposedBridge".equals(stackTraceElement.getClassName()) && "main".equals(stackTraceElement.getMethodName())) {
                    yVar.d(true);
                }
                if ("de.robv.android.xposed.XposedBridge".equals(stackTraceElement.getClassName()) && "handleHookedMethod".equals(stackTraceElement.getMethodName())) {
                    yVar.d(true);
                }
            }
        }
    }
}
