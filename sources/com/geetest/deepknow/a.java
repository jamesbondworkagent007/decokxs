package com.geetest.deepknow;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f389a = {"goldfish"};
    private static final String[] b = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        boolean zC = c();
        boolean zA = a();
        boolean z = true;
        boolean z2 = a("/proc/tty/drivers") || a("/proc/cpuinfo");
        boolean zB = b();
        boolean zD = d();
        if (!zC && !zA && !z2 && !zD && !zB) {
            z = false;
        }
        try {
            jSONObject2.put(str, z + "");
            jSONObject.put(str2, zC + "");
            jSONObject.put(str4, "false");
            jSONObject.put(str5, zA + "");
            jSONObject.put(str6, z2 + "");
            jSONObject.put(str7, "false");
            jSONObject.put("checkHasLightSensorManager", "false");
            jSONObject.put(str9, zD + "");
            jSONObject.put("tn", str8);
            jSONObject.put("cc", zB + "");
            jSONObject2.put(str10, jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b() {
        return Camera.getNumberOfCameras() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean c() {
        String str = Build.PRODUCT;
        if (str.contains("sdk") || str.contains("sdk_x86") || str.contains("sdk_google") || str.contains("Andy") || str.contains("Droid4X") || str.contains("nox") || str.contains("vbox86p")) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.contains("Genymotion") || str2.contains("Andy") || str2.contains("nox") || str2.contains("TiantianVM") || Build.BRAND.contains("Andy")) {
            return true;
        }
        String str3 = Build.DEVICE;
        if (str3.contains("Andy") || str3.contains("Droid4X") || str3.contains("nox") || str3.contains("vbox86p")) {
            return true;
        }
        String str4 = Build.MODEL;
        if (str4.contains("Emulator") || str4.contains("google_sdk") || str4.contains("Droid4X") || str4.contains("TiantianVM") || str4.contains("Andy") || str4.contains("Android SDK built for x86_64") || str4.contains("Android SDK built for x86")) {
            return true;
        }
        String str5 = Build.HARDWARE;
        if (str5.contains("vbox86") || str5.contains("nox") || str5.contains("ttVM_x86")) {
            return true;
        }
        String str6 = Build.FINGERPRINT;
        return str6.contains("generic/sdk/generic") || str6.contains("generic_x86/sdk_x86/generic_x86") || str6.contains("Andy") || str6.contains("ttVM_Hdragon") || str6.contains("generic/google_sdk/generic") || str6.contains("vbox86p") || str6.contains("generic/vbox86p/vbox86p");
    }

    private static boolean d() {
        String lowerCase;
        StringBuilder sb;
        BufferedReader bufferedReader;
        try {
            Process processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "utf-8"));
        } catch (Exception unused) {
            lowerCase = "$unknown";
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            return !lowerCase.contains("intel") || lowerCase.contains("amd");
        }
        bufferedReader.close();
        lowerCase = sb.toString().toLowerCase();
        if (lowerCase.contains("intel")) {
        }
    }

    private static boolean a(String str) {
        File file = new File(str);
        if (file.exists() && file.canRead()) {
            byte[] bArr = new byte[1024];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception unused) {
            }
            String str2 = new String(bArr);
            for (String str3 : f389a) {
                if (str2.contains(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a() {
        for (String str : b) {
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }
}
