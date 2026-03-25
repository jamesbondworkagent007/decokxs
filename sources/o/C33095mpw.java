package o;

import android.os.Build;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: renamed from: o.mpw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33095mpw {
    public static void EZpvd(FragmentActivity fragmentActivity) {
    }

    public static void AEQbTJ() throws java.lang.Exception {
        java.lang.reflect.Field declaredField = android.app.ActivityManager.class.getDeclaredField("IActivityManagerSingleton");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(null);
        java.lang.reflect.Field declaredField2 = java.lang.Class.forName("android.util.Singleton").getDeclaredField("mInstance");
        declaredField2.setAccessible(true);
        java.lang.Object obj2 = declaredField2.get(obj);
        declaredField2.set(obj, java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), new java.lang.Class[]{java.lang.Class.forName("android.app.IActivityManager")}, new C33098mpz(obj2)));
    }

    public static void copydefault() throws java.lang.Exception {
        java.lang.reflect.Field declaredField = java.lang.Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(null);
        java.lang.reflect.Field declaredField2 = java.lang.Class.forName("android.util.Singleton").getDeclaredField("mInstance");
        declaredField2.setAccessible(true);
        java.lang.Object obj2 = declaredField2.get(obj);
        declaredField2.set(obj, java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), new java.lang.Class[]{java.lang.Class.forName("android.app.IActivityManager")}, new C33098mpz(obj2)));
    }

    public static void EZpvd() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            int i = Build.VERSION.SDK_INT;
            if (i <= 28 && i >= 26) {
                AEQbTJ();
            } else {
                copydefault();
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("HookUtils", e);
        }
        pUU.EZpvd("HookUtils", "hookAms: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static void OLrzqt() {
        if (Build.VERSION.SDK_INT <= 28) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: o.mpw.2
                @Override // java.lang.Runnable
                public void run() {
                    C33095mpw.EZpvd();
                }
            }).start();
        }
    }
}
