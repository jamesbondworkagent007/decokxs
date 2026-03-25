package com.bytedance.bdtracker;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.applog.log.LoggerImpl;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CharSequence f233a = "amigo";
    public static final CharSequence b = "funtouch";
    public static final z4<Boolean> c = new a();

    public static final class a extends z4<Boolean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.z4
        public Boolean a(Object[] objArr) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                return Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
            } catch (Throwable unused) {
                return Boolean.FALSE;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(String str) {
        BufferedReader bufferedReader;
        Process processExec;
        String strA = p5.a(str);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String line = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                processExec = Runtime.getRuntime().exec("getprop " + str);
                bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
            try {
                line = bufferedReader.readLine();
                processExec.destroy();
            } catch (Throwable th2) {
                th = th2;
                try {
                    LoggerImpl.global().error("getSysPropByExec error", th, new Object[0]);
                } finally {
                    r.a((Closeable) bufferedReader);
                }
            }
        }
        return line;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a() {
        String str = Build.MANUFACTURER;
        return !TextUtils.isEmpty(str) && (str.toLowerCase().contains(MTPushConstants.Manufacturer.OPPO) || str.toLowerCase().contains(MTPushConstants.Manufacturer.REALME));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean b() {
        String str = Build.DISPLAY;
        return (!TextUtils.isEmpty(str) && str.contains("Flyme")) || "flyme".equals(Build.USER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c() {
        String str = Build.MANUFACTURER;
        return (str == null ? "" : str.trim()).toUpperCase().contains("HUAWEI");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean d() {
        return Class.forName("miui.os.Build").getName().length() > 0;
    }
}
