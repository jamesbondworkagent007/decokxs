package o;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.Yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5622Yv {
    public static final boolean copydefault;

    static {
        copydefault = java.lang.System.getProperty("org.graalvm.nativeimage.imagecode") != null;
    }

    private C5622Yv() {
    }

    public static boolean EZpvd() {
        return copydefault && "runtime".equals(java.lang.System.getProperty("org.graalvm.nativeimage.imagecode"));
    }

    public static boolean KWHzl(java.lang.Throwable th) {
        if (!EZpvd()) {
            return false;
        }
        if (th instanceof InvocationTargetException) {
            th = th.getCause();
        }
        return th.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
    }

    public static boolean copydefault(java.lang.Class<?> cls) {
        if (EZpvd()) {
            return (cls.getDeclaredFields().length == 0 || C5619Yr.iwGUEr(cls)) && cls.getDeclaredMethods().length == 0 && cls.getDeclaredConstructors().length == 0;
        }
        return false;
    }
}
