package o;

/* JADX INFO: renamed from: o.ytO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58017ytO<Type> {
    public java.lang.Class<?> AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.reflect.Field OLrzqt;
    public boolean copydefault;

    public C58017ytO(java.lang.Class<?> cls, java.lang.String str) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.AEQbTJ = cls;
        this.KWHzl = str;
    }

    public final void copydefault() {
        synchronized (this) {
            if (this.copydefault) {
                return;
            }
            for (java.lang.Class<?> superclass = this.AEQbTJ; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    java.lang.reflect.Field declaredField = superclass.getDeclaredField(this.KWHzl);
                    declaredField.setAccessible(true);
                    this.OLrzqt = declaredField;
                    break;
                } catch (java.lang.Exception unused) {
                }
            }
            this.copydefault = true;
        }
    }

    public Type OLrzqt(boolean z, java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        synchronized (this) {
            copydefault();
            java.lang.reflect.Field field = this.OLrzqt;
            if (field != null) {
                try {
                    return (Type) field.get(obj);
                } catch (java.lang.ClassCastException unused) {
                    throw new java.lang.IllegalArgumentException("unable to cast object");
                }
            }
            if (!z) {
                throw new java.lang.NoSuchFieldException();
            }
            C58013ytK.AEQbTJ("ReflectFiled", java.lang.String.format("Field %s is no exists.", this.KWHzl), new java.lang.Object[0]);
            return null;
        }
    }

    public Type AEQbTJ(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        Type typeOLrzqt;
        synchronized (this) {
            typeOLrzqt = OLrzqt(false, obj);
        }
        return typeOLrzqt;
    }

    public boolean OLrzqt(java.lang.Object obj, Type type) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        boolean zKWHzl;
        synchronized (this) {
            zKWHzl = KWHzl(obj, type, false);
        }
        return zKWHzl;
    }

    public boolean KWHzl(java.lang.Object obj, Type type, boolean z) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        synchronized (this) {
            copydefault();
            java.lang.reflect.Field field = this.OLrzqt;
            if (field != null) {
                field.set(obj, type);
                return true;
            }
            if (!z) {
                throw new java.lang.NoSuchFieldException("Method " + this.KWHzl + " is not exists.");
            }
            C58013ytK.AEQbTJ("ReflectFiled", java.lang.String.format("Field %s is no exists.", this.KWHzl), new java.lang.Object[0]);
            return false;
        }
    }
}
