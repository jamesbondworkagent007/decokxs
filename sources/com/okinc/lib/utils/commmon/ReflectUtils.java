package com.okinc.lib.utils.commmon;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ReflectUtils {
    public final Class<?> AEQbTJ;
    public final Object EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public <T> T AEQbTJ() {
        return (T) this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Class<?> copydefault() {
        return this.AEQbTJ;
    }

    public ReflectUtils(Class<?> cls) {
        this(cls, cls);
    }

    public ReflectUtils(Class<?> cls, Object obj) {
        this.AEQbTJ = cls;
        this.EZpvd = obj;
    }

    public static ReflectUtils OLrzqt(String str) throws ReflectException {
        return copydefault(KWHzl(str));
    }

    public static ReflectUtils copydefault(Class<?> cls) throws ReflectException {
        return new ReflectUtils(cls);
    }

    public static ReflectUtils copydefault(Object obj) throws ReflectException {
        return new ReflectUtils(obj == null ? Object.class : obj.getClass(), obj);
    }

    public static Class<?> KWHzl(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new ReflectException(e);
        }
    }

    public final Class<?>[] OLrzqt(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? StateListAnimator.class : obj.getClass();
        }
        return clsArr;
    }

    public ReflectUtils AEQbTJ(String str) {
        try {
            Field fieldCopydefault = copydefault(str);
            return new ReflectUtils(fieldCopydefault.getType(), fieldCopydefault.get(this.EZpvd));
        } catch (IllegalAccessException e) {
            throw new ReflectException(e);
        }
    }

    public ReflectUtils AEQbTJ(String str, Object obj) {
        try {
            copydefault(str).set(this.EZpvd, AEQbTJ(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public final Field copydefault(String str) throws IllegalAccessException {
        Field fieldEZpvd = EZpvd(str);
        if ((fieldEZpvd.getModifiers() & 16) == 16) {
            try {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(fieldEZpvd, fieldEZpvd.getModifiers() & (-17));
            } catch (NoSuchFieldException unused) {
                fieldEZpvd.setAccessible(true);
            }
        }
        return fieldEZpvd;
    }

    public final Field EZpvd(String str) {
        Class<?> clsCopydefault = copydefault();
        try {
            return (Field) EZpvd(clsCopydefault.getField(str));
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) EZpvd(clsCopydefault.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsCopydefault = clsCopydefault.getSuperclass();
                    if (clsCopydefault == null) {
                        throw new ReflectException(e);
                    }
                }
            } while (clsCopydefault == null);
            throw new ReflectException(e);
        }
    }

    public final Object AEQbTJ(Object obj) {
        return obj instanceof ReflectUtils ? ((ReflectUtils) obj).AEQbTJ() : obj;
    }

    public ReflectUtils valueOf(String str) throws ReflectException {
        return copydefault(str, new Object[0]);
    }

    public ReflectUtils copydefault(String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrOLrzqt = OLrzqt(objArr);
        try {
            try {
                return OLrzqt(OLrzqt(str, clsArrOLrzqt), this.EZpvd, objArr);
            } catch (NoSuchMethodException unused) {
                return OLrzqt(AEQbTJ(str, clsArrOLrzqt), this.EZpvd, objArr);
            }
        } catch (NoSuchMethodException e) {
            throw new ReflectException(e);
        }
    }

    public final ReflectUtils OLrzqt(Method method, Object obj, Object... objArr) {
        try {
            EZpvd(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return copydefault(obj);
            }
            return copydefault(method.invoke(obj, objArr));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public final Method OLrzqt(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsCopydefault = copydefault();
        try {
            return clsCopydefault.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsCopydefault.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsCopydefault = clsCopydefault.getSuperclass();
                }
            } while (clsCopydefault != null);
            throw new NoSuchMethodException();
        }
    }

    public final Method AEQbTJ(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsCopydefault = copydefault();
        ArrayList arrayList = new ArrayList();
        for (Method method : clsCopydefault.getMethods()) {
            if (OLrzqt(method, str, clsArr)) {
                arrayList.add(method);
            }
        }
        if (!arrayList.isEmpty()) {
            OLrzqt(arrayList);
            return arrayList.get(0);
        }
        do {
            for (Method method2 : clsCopydefault.getDeclaredMethods()) {
                if (OLrzqt(method2, str, clsArr)) {
                    arrayList.add(method2);
                }
            }
            if (!arrayList.isEmpty()) {
                OLrzqt(arrayList);
                return arrayList.get(0);
            }
            clsCopydefault = clsCopydefault.getSuperclass();
        } while (clsCopydefault != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + copydefault() + JwtUtilsKt.JWT_DELIMITER);
    }

    public final void OLrzqt(List<Method> list) {
        list.sort(new Comparator() { // from class: o.pKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return this.OLrzqt.KWHzl((java.lang.reflect.Method) obj, (java.lang.reflect.Method) obj2);
            }
        });
    }

    public final /* synthetic */ int KWHzl(Method method, Method method2) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        int length = parameterTypes.length;
        for (int i = 0; i < length; i++) {
            if (!parameterTypes[i].equals(parameterTypes2[i])) {
                return KWHzl(parameterTypes[i]).isAssignableFrom(KWHzl(parameterTypes2[i])) ? 1 : -1;
            }
        }
        return 0;
    }

    public final boolean OLrzqt(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && OLrzqt(method.getParameterTypes(), clsArr);
    }

    public final boolean OLrzqt(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != StateListAnimator.class && !KWHzl(clsArr[i]).isAssignableFrom(KWHzl(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    public final <T extends AccessibleObject> T EZpvd(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public final Class<?> KWHzl(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectUtils) && this.EZpvd.equals(((ReflectUtils) obj).AEQbTJ());
    }

    public String toString() {
        return this.EZpvd.toString();
    }

    public static class StateListAnimator {
        private StateListAnimator() {
        }
    }

    public static class ReflectException extends RuntimeException {
        private static final long serialVersionUID = 858774075258496016L;

        public ReflectException(Throwable th) {
            super(th);
        }
    }
}
