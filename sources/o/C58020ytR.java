package o;

import android.os.Build;

/* JADX INFO: renamed from: o.ytR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58020ytR {
    public static <T> T KWHzl(java.lang.Class<?> cls, java.lang.String str, java.lang.Object obj) throws java.lang.Exception {
        return (T) new C58017ytO(cls, str).AEQbTJ(obj);
    }

    public static boolean copydefault(java.lang.Class<?> cls, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
        return new C58017ytO(cls, str).OLrzqt(obj, obj2);
    }

    public static <T> T EZpvd(java.lang.Class<?> cls, java.lang.String str, java.lang.Object obj, java.lang.Object... objArr) throws java.lang.Exception {
        return (T) new C58019ytQ(cls, str, new java.lang.Class[0]).AEQbTJ(obj, objArr);
    }

    public static <T> T OLrzqt(java.lang.Object obj, java.lang.String str, T t, boolean z) {
        if (obj == null) {
            return t;
        }
        if (z) {
            try {
                java.lang.reflect.Field field = (java.lang.reflect.Field) java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class).invoke(obj.getClass(), str);
                field.setAccessible(true);
                return (T) field.get(obj);
            } catch (java.lang.Exception e) {
                C58013ytK.OLrzqt("Matrix.ReflectUtils", e.toString() + "isHard=%s\n%s", java.lang.Boolean.TRUE, C58014ytL.AEQbTJ(e));
            }
        } else {
            try {
                java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                return (T) declaredField.get(obj);
            } catch (java.lang.Exception e2) {
                C58013ytK.OLrzqt("Matrix.ReflectUtils", e2.toString() + "isHard=%s\n%s", java.lang.Boolean.FALSE, C58014ytL.AEQbTJ(e2));
            }
        }
        return t;
    }

    public static <T> T KWHzl(java.lang.Object obj, java.lang.String str, T t) {
        return (T) OLrzqt(obj, str, t, true);
    }

    public static java.lang.reflect.Method AEQbTJ(java.lang.Object obj, boolean z, java.lang.String str, java.lang.Class<?>... clsArr) {
        if (z) {
            try {
                java.lang.reflect.Method method = (java.lang.reflect.Method) java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class).invoke(obj.getClass(), str, clsArr);
                method.setAccessible(true);
                return method;
            } catch (java.lang.Exception e) {
                C58013ytK.OLrzqt("Matrix.ReflectUtils", e.toString() + "isHard=%s\n%s", java.lang.Boolean.TRUE, C58014ytL.AEQbTJ(e));
                return null;
            }
        }
        try {
            java.lang.reflect.Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Exception e2) {
            C58013ytK.OLrzqt("Matrix.ReflectUtils", e2.toString() + "isHard=%s\n%s", java.lang.Boolean.FALSE, C58014ytL.AEQbTJ(e2));
            return null;
        }
    }

    public static java.lang.reflect.Method KWHzl(java.lang.Object obj, java.lang.String str, java.lang.Class<?>... clsArr) {
        return AEQbTJ(obj, Build.VERSION.SDK_INT <= 29, str, clsArr);
    }
}
