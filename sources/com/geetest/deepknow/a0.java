package com.geetest.deepknow;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class a0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        JSONObject jSONObject = new JSONObject();
        z zVar = new z();
        String strA = a(context);
        try {
            Object objNewInstance = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedHelpers").newInstance();
            a(objNewInstance, "fieldCache", zVar, strA);
            a(objNewInstance, "methodCache", zVar, strA);
            a(objNewInstance, "constructorCache", zVar, strA);
            jSONObject.put(str, zVar.c() + "");
            jSONObject.put(str2, zVar.d() + "");
            jSONObject.put(str3, zVar.i() + "");
            jSONObject.put(str4, zVar.j() + "");
            jSONObject.put(str5, zVar.h() + "");
            jSONObject.put(str6, zVar.a() + "");
            jSONObject.put(str7, zVar.b() + "");
            jSONObject.put(str8, zVar.e() + "");
            jSONObject.put(str9, zVar.f() + "");
            jSONObject.put(str10, zVar.g() + "");
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static boolean a(Object obj, String str, z zVar, String str2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(obj);
            if (map.isEmpty()) {
                return false;
            }
            for (Object obj2 : map.keySet()) {
                if (obj2.toString().contains(str2)) {
                    zVar.c(true);
                }
                if (obj2.toString().toLowerCase().contains("getDeviceId".toLowerCase())) {
                    zVar.d(true);
                }
                if (obj2.toString().toLowerCase().contains("SERIAL".toLowerCase())) {
                    zVar.i(true);
                }
                if (obj2.toString().toLowerCase().contains("getSSID".toLowerCase())) {
                    zVar.j(true);
                }
                if (obj2.toString().toLowerCase().contains("getMacAddress".toLowerCase())) {
                    zVar.h(true);
                }
                if (obj2.toString().toLowerCase().contains("BluetoothAdapter#getAddress".toLowerCase())) {
                    zVar.a(true);
                }
                if (obj2.toString().toLowerCase().contains("Secure#getString".toLowerCase())) {
                    zVar.b(true);
                }
                if (obj2.toString().toLowerCase().contains("getSubscriberId".toLowerCase())) {
                    zVar.e(true);
                }
                if (obj2.toString().toLowerCase().contains("getLatitude".toLowerCase())) {
                    zVar.f(true);
                }
                if (obj2.toString().toLowerCase().contains("getLongitude".toLowerCase())) {
                    zVar.g(true);
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static String a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.packageName;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
