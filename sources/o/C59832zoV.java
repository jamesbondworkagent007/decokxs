package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.zoV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59832zoV {
    public static java.lang.reflect.Method OLrzqt(java.lang.reflect.Method method, java.lang.ClassLoader classLoader) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        return java.lang.Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static <T> T copydefault(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(java.lang.reflect.Proxy.newProxyInstance(C59832zoV.class.getClassLoader(), new java.lang.Class[]{cls}, invocationHandler));
    }

    public static InvocationHandler copydefault(@androidx.annotation.Nullable java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new Activity(obj);
    }

    public static java.lang.Object OLrzqt(@androidx.annotation.Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((Activity) invocationHandler).EZpvd();
    }

    /* JADX INFO: renamed from: o.zoV$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static class Activity implements InvocationHandler {
        public final java.lang.Object OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.Object EZpvd() {
            return this.OLrzqt;
        }

        public Activity(@androidx.annotation.NonNull java.lang.Object obj) {
            this.OLrzqt = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            try {
                return C59832zoV.OLrzqt(method, this.OLrzqt.getClass().getClassLoader()).invoke(this.OLrzqt, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (java.lang.ReflectiveOperationException e2) {
                throw new java.lang.RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    public static boolean KWHzl() {
        java.lang.String str = android.os.Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    public static boolean EZpvd(java.util.Collection<java.lang.String> collection, java.lang.String str) {
        if (!collection.contains(str)) {
            if (KWHzl()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
