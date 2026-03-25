package o;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.ytQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58019ytQ {
    public java.lang.Class<?> AEQbTJ;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.lang.reflect.Method OLrzqt;
    public java.lang.Class[] copydefault;

    public C58019ytQ(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.AEQbTJ = cls;
        this.KWHzl = str;
        this.copydefault = clsArr;
    }

    public final void AEQbTJ() {
        synchronized (this) {
            if (this.EZpvd) {
                return;
            }
            for (java.lang.Class<?> superclass = this.AEQbTJ; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    java.lang.reflect.Method declaredMethod = superclass.getDeclaredMethod(this.KWHzl, this.copydefault);
                    declaredMethod.setAccessible(true);
                    this.OLrzqt = declaredMethod;
                    break;
                } catch (java.lang.Exception unused) {
                }
            }
            this.EZpvd = true;
        }
    }

    public <T> T AEQbTJ(java.lang.Object obj, java.lang.Object... objArr) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, InvocationTargetException {
        T t;
        synchronized (this) {
            t = (T) EZpvd(obj, false, objArr);
        }
        return t;
    }

    public <T> T EZpvd(java.lang.Object obj, boolean z, java.lang.Object... objArr) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, InvocationTargetException {
        synchronized (this) {
            AEQbTJ();
            java.lang.reflect.Method method = this.OLrzqt;
            if (method != null) {
                return (T) method.invoke(obj, objArr);
            }
            if (!z) {
                throw new java.lang.NoSuchFieldException("Method " + this.KWHzl + " is not exists.");
            }
            C58013ytK.AEQbTJ("ReflectFiled", "Field %s is no exists", this.KWHzl);
            return null;
        }
    }
}
