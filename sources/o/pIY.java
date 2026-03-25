package o;

import android.os.Build;

/* JADX INFO: loaded from: classes9.dex */
public final class pIY {
    public static java.lang.reflect.Method KWHzl;
    public static java.lang.Object OLrzqt;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("forName", java.lang.String.class);
                java.lang.reflect.Method declaredMethod2 = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
                java.lang.Class cls = (java.lang.Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                java.lang.reflect.Method method = (java.lang.reflect.Method) declaredMethod2.invoke(cls, "getRuntime", null);
                KWHzl = (java.lang.reflect.Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new java.lang.Class[]{java.lang.String[].class});
                OLrzqt = method.invoke(null, new java.lang.Object[0]);
            } catch (java.lang.Throwable th) {
                C38002pIp.Companion.iwGUEr().copydefault("BootstrapClass", "reflect bootstrap failed:", th);
            }
        }
    }

    public static boolean EZpvd(java.lang.String... strArr) {
        java.lang.reflect.Method method;
        java.lang.Object obj = OLrzqt;
        if (obj == null || (method = KWHzl) == null) {
            return false;
        }
        try {
            method.invoke(obj, strArr);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean copydefault() {
        return EZpvd("L");
    }
}
